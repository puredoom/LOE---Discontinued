package lotr.client.gui;

import com.google.common.math.IntMath;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import lotr.client.LOTRClientProxy;
import lotr.client.LOTRKeyHandler;
import lotr.client.LOTRTextures;
import lotr.client.LOTRTickHandlerClient;
import lotr.common.*;
import lotr.common.fac.LOTRAlignmentValues;
import lotr.common.fac.LOTRControlZone;
import lotr.common.fac.LOTRFaction;
import lotr.common.fac.LOTRFactionRank;
import lotr.common.fellowship.LOTRFellowshipClient;
import lotr.common.network.*;
import lotr.common.quest.LOTRMiniQuest;
import lotr.common.world.biome.LOTRBiome;
import lotr.common.world.genlayer.LOTRGenLayerWorld;
import lotr.common.world.map.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraft.world.chunk.EmptyChunk;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.List;
import java.util.*;
import java.util.regex.Pattern;

public class LOTRGuiMap
        extends LOTRGuiMenuBase {
    public static final ResourceLocation mapIconsTexture = new ResourceLocation("lotr:map/mapScreen.png");
    public static final ResourceLocation conquestTexture = new ResourceLocation("lotr:map/conquest.png");
    public static final int BLACK = -16777216;
    public static final int BORDER_COLOR = -6156032;
    public static final int CONQUEST_COLOR = 12255232;
    private static final ItemStack questBookIcon = new ItemStack(LOTRMod.redBook);
    private static final int MIN_ZOOM = -3;
    private static final int MAX_ZOOM = 4;
    private static final int mapBorder = 30;
    private static final int waypointSelectRange = 5;
    private static final int conqBorderW = 8;
    private static final int conqBorderUp = 22;
    private static final int conqBorderDown = 54;
    private static final int REQUEST_FAC_WAIT = 40;
    private static final int conqKeyGrades = 10;
    private static final int CONQUEST_COLOR_OPQ = -4521984;
    private static final int CONQUEST_COLOR_NO_EFFECT = 1973790;
    public static boolean showWP = true;
    public static boolean showCWP = true;
    public static boolean showHiddenSWP = false;
    private static Map<UUID, PlayerLocationInfo> playerLocations = new HashMap<UUID, PlayerLocationInfo>();
    private static boolean fullscreen = true;
    private static int mapWidth;
    private static int mapHeight;
    private static int mapXMin;
    private static int mapXMax;
    private static int mapYMin;
    private static int mapYMax;
    private static int mapXMin_W;
    private static int mapXMax_W;
    private static int mapYMin_W;
    private static int mapYMax_W;
    private static List<LOTRGuiMapWidget> mapWidgets = new ArrayList<LOTRGuiMapWidget>();
    private static int zoomPower = 0;
    private static int zoomTicksMax = 6;
    private static int maxDisplayedWPShares;
    private static LOTRDimension.DimensionRegion currentRegion;
    private static LOTRDimension.DimensionRegion prevRegion;
    private static List<LOTRFaction> currentFactionList;
    private static Map<LOTRDimension.DimensionRegion, LOTRFaction> lastViewedRegions = new HashMap<LOTRDimension.DimensionRegion, LOTRFaction>();

    public boolean enableZoomOutWPFading = true;
    public boolean isPlayerOp;
    private LOTRGuiMapWidget widgetAddCWP;
    private LOTRGuiMapWidget widgetDelCWP;
    private LOTRGuiMapWidget widgetRenameCWP;
    private LOTRGuiMapWidget widgetToggleWPs;
    private LOTRGuiMapWidget widgetToggleCWPs;
    private LOTRGuiMapWidget widgetToggleHiddenSWPs;
    private LOTRGuiMapWidget widgetZoomIn;
    private LOTRGuiMapWidget widgetZoomOut;
    private LOTRGuiMapWidget widgetFullScreen;
    private LOTRGuiMapWidget widgetSepia;
    private LOTRGuiMapWidget widgetLabels;
    private LOTRGuiMapWidget widgetShareCWP;
    private LOTRGuiMapWidget widgetHideSWP;
    private LOTRGuiMapWidget widgetUnhideSWP;
    private float posX;
    private float posY;
    private int isMouseButtonDown;
    private int prevMouseX;
    private int prevMouseY;
    private boolean isMouseWithinMap;
    private int mouseXCoord;
    private int mouseZCoord;
    private float posXMove;
    private float posYMove;
    private float prevPosX;
    private float prevPosY;
    private int prevZoomPower = zoomPower;
    private float zoomScale;
    private float zoomScaleStable;
    private float zoomExp;
    private int zoomTicks;
    private LOTRAbstractWaypoint selectedWaypoint;
    private boolean hasOverlay;
    private String[] overlayLines;
    private GuiButton buttonOverlayFunction;
    private GuiTextField nameWPTextField;
    private boolean creatingWaypoint;
    private boolean creatingWaypointNew;
    private boolean deletingWaypoint;
    private boolean renamingWaypoint;
    private boolean sharingWaypoint;
    private boolean sharingWaypointNew;
    private LOTRGuiFellowships fellowshipDrawGUI;
    private LOTRFellowshipClient mouseOverRemoveSharedFellowship;
    private LOTRGuiScrollPane scrollPaneWPShares = new LOTRGuiScrollPane(9, 8);
    private List<UUID> displayedWPShareList;
    private int displayedWPShares;
    private int tickCounter;
    private boolean hasControlZones;
    private LOTRFaction controlZoneFaction;
    private boolean mouseControlZone;
    private boolean mouseControlZoneReduced;
    private boolean isConquestGrid;
    private boolean loadingConquestGrid;
    private Map<LOTRFaction, List<LOTRConquestZone>> facConquestGrids = new HashMap<LOTRFaction, List<LOTRConquestZone>>();
    private Set<LOTRFaction> requestedFacGrids = new HashSet<LOTRFaction>();
    private Set<LOTRFaction> receivedFacGrids = new HashSet<LOTRFaction>();
    private int ticksUntilRequestFac = 40;
    private float highestViewedConqStr;
    private int currentFactionIndex;
    private int prevFactionIndex;
    private LOTRFaction conquestViewingFaction;
    private float currentFacScroll;
    private boolean isFacScrolling;
    private boolean wasMouseDown;
    private boolean mouseInFacScroll;
    private int facScrollWidth = 240;
    private int facScrollHeight = 14;
    private int facScrollX;
    private int facScrollY;
    private int facScrollBorder = 1;
    private int facScrollWidgetWidth = 17;
    private int facScrollWidgetHeight = 12;
    private GuiButton buttonConquestRegions;

    public LOTRGuiMap() {
        if (!LOTRGenLayerWorld.loadedBiomeImage()) {
            new LOTRGenLayerWorld();
        }
    }

    public static void addPlayerLocationInfo(GameProfile player, double x, double z) {
        if (player.isComplete()) {
            playerLocations.put(player.getId(), new PlayerLocationInfo(player, x, z));
        }
    }

    public static void clearPlayerLocations() {
        playerLocations.clear();
    }

    public static int[] setFakeStaticProperties(int w, int h, int xmin, int xmax, int ymin, int ymax) {
        int[] ret = new int[]{mapWidth, mapHeight, mapXMin, mapXMax, mapYMin, mapYMax};
        mapWidth = w;
        mapHeight = h;
        mapXMin = xmin;
        mapXMax = xmax;
        mapYMin = ymin;
        mapYMax = ymax;
        return ret;
    }

    private static boolean isOSRS() {
        return LOTRConfig.osrsMap;
    }

    public LOTRGuiMap setConquestGrid() {
        isConquestGrid = true;
        return this;
    }

    public void setControlZone(LOTRFaction f) {
        hasControlZones = true;
        controlZoneFaction = f;
    }

    @Override
    public void initGui() {
        xSize = 256;
        ySize = 256;
        super.initGui();
        if (fullscreen) {
            int midX = width / 2;
            int d = 100;
            buttonMenuReturn.xPosition = midX - d - buttonMenuReturn.width;
            buttonMenuReturn.yPosition = 4;
        }
        if (isConquestGrid || hasControlZones) {
            buttonList.remove((Object) buttonMenuReturn);
        }
        setupMapWidgets();
        if (isConquestGrid) {
            loadingConquestGrid = true;
            setupMapDimensions();
            conquestViewingFaction = LOTRLevelData.getData((EntityPlayer) mc.thePlayer).getPledgeFaction();
            if (conquestViewingFaction == null) {
                conquestViewingFaction = LOTRLevelData.getData((EntityPlayer) mc.thePlayer).getViewingFaction();
            }
            prevRegion = currentRegion = conquestViewingFaction.factionRegion;
            currentFactionList = currentRegion.factionList;
            prevFactionIndex = currentFactionIndex = currentFactionList.indexOf((Object) conquestViewingFaction);
            lastViewedRegions.put(currentRegion, conquestViewingFaction);
            facScrollX = mapXMin;
            facScrollY = mapYMax + 8;
            setCurrentScrollFromFaction();
            buttonConquestRegions = new LOTRGuiButtonRedBook(200, mapXMax - 120, mapYMax + 5, 120, 20, "");
            buttonList.add(buttonConquestRegions);
        }
        if (hasControlZones) {
            setupMapDimensions();
            int[] zoneBorders = controlZoneFaction.calculateFullControlZoneWorldBorders();
            int xMin = zoneBorders[0];
            int xMax = zoneBorders[1];
            int zMin = zoneBorders[2];
            int zMax = zoneBorders[3];
            float x = (float) (xMin + xMax) / 2.0f;
            float z = (float) (zMin + zMax) / 2.0f;
            posX = x / (float) LOTRGenLayerWorld.scale + 810.0f;
            posY = z / (float) LOTRGenLayerWorld.scale + 730.0f;
            int zoneWidth = xMax - xMin;
            int zoneHeight = zMax - zMin;
            double mapZoneWidth = (double) zoneWidth / (double) LOTRGenLayerWorld.scale;
            double mapZoneHeight = (double) zoneHeight / (double) LOTRGenLayerWorld.scale;
            int zoomPowerWidth = MathHelper.floor_double((double) (Math.log((double) mapWidth / mapZoneWidth) / Math.log(2.0)));
            int zoomPowerHeight = MathHelper.floor_double((double) (Math.log((double) mapHeight / mapZoneHeight) / Math.log(2.0)));
            prevZoomPower = zoomPower = Math.min(zoomPowerWidth, zoomPowerHeight);
        } else if (mc.thePlayer != null) {
            posX = (float) (mc.thePlayer.posX / (double) LOTRGenLayerWorld.scale) + 810.0f;
            posY = (float) (mc.thePlayer.posZ / (double) LOTRGenLayerWorld.scale) + 730.0f;
        }
        prevPosX = posX;
        prevPosY = posY;
        setupZoomVariables(1.0f);
        buttonOverlayFunction = new GuiButton(0, 0, 0, 160, 20, "");
        buttonOverlayFunction.visible = false;
        buttonOverlayFunction.enabled = false;
        buttonList.add(buttonOverlayFunction);
        nameWPTextField = new GuiTextField(fontRendererObj, mapXMin + mapWidth / 2 - 80, mapYMin + 50, 160, 20);
        fellowshipDrawGUI = new LOTRGuiFellowships();
        fellowshipDrawGUI.setWorldAndResolution(mc, width, height);
        if (mc.currentScreen == this) {
            LOTRPacketClientMQEvent packet = new LOTRPacketClientMQEvent(LOTRPacketClientMQEvent.ClientMQEvent.MAP);
            LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
        }
    }

    private void setupMapWidgets() {
        mapWidgets.clear();
        widgetAddCWP = new LOTRGuiMapWidget(-16, 6, 10, "addCWP", 0, 0);
        mapWidgets.add(widgetAddCWP);
        widgetDelCWP = new LOTRGuiMapWidget(-16, 20, 10, "delCWP", 10, 0);
        mapWidgets.add(widgetDelCWP);
        widgetRenameCWP = new LOTRGuiMapWidget(-16, 34, 10, "renameCWP", 0, 20);
        mapWidgets.add(widgetRenameCWP);
        widgetToggleWPs = new LOTRGuiMapWidget(-58, 6, 10, "toggleWPs", 80, 0);
        mapWidgets.add(widgetToggleWPs);
        widgetToggleCWPs = new LOTRGuiMapWidget(-44, 6, 10, "toggleCWPs", 90, 0);
        mapWidgets.add(widgetToggleCWPs);
        widgetToggleHiddenSWPs = new LOTRGuiMapWidget(-30, 6, 10, "toggleHiddenSWPs", 100, 0);
        mapWidgets.add(widgetToggleHiddenSWPs);
        widgetZoomIn = new LOTRGuiMapWidget(6, 6, 10, "zoomIn", 30, 0);
        mapWidgets.add(widgetZoomIn);
        widgetZoomOut = new LOTRGuiMapWidget(6, 20, 10, "zoomOut", 40, 0);
        mapWidgets.add(widgetZoomOut);
        widgetFullScreen = new LOTRGuiMapWidget(20, 6, 10, "fullScreen", 50, 0);
        mapWidgets.add(widgetFullScreen);
        widgetSepia = new LOTRGuiMapWidget(34, 6, 10, "sepia", 60, 0);
        mapWidgets.add(widgetSepia);
        widgetLabels = new LOTRGuiMapWidget(-72, 6, 10, "labels", 70, 0);
        mapWidgets.add(widgetLabels);
        widgetShareCWP = new LOTRGuiMapWidget(-16, 48, 10, "shareCWP", 10, 10);
        mapWidgets.add(widgetShareCWP);
        widgetHideSWP = new LOTRGuiMapWidget(-16, 20, 10, "hideSWP", 20, 0);
        mapWidgets.add(widgetHideSWP);
        widgetUnhideSWP = new LOTRGuiMapWidget(-16, 20, 10, "unhideSWP", 20, 10);
        mapWidgets.add(widgetUnhideSWP);
        if (isConquestGrid) {
            mapWidgets.clear();
            mapWidgets.add(widgetToggleWPs);
            mapWidgets.add(widgetToggleCWPs);
            mapWidgets.add(widgetToggleHiddenSWPs);
            mapWidgets.add(widgetZoomIn);
            mapWidgets.add(widgetZoomOut);
            mapWidgets.add(widgetLabels);
        }
    }

    private void setupMapDimensions() {
        if (isConquestGrid) {
            int windowWidth = 400;
            int windowHeight = 240;
            mapXMin = width / 2 - windowWidth / 2;
            mapXMax = width / 2 + windowWidth / 2;
            mapYMin = height / 2 - 16 - windowHeight / 2;
            mapYMax = mapYMin + windowHeight;
        } else if (fullscreen) {
            mapXMin = 30;
            mapXMax = width - 30;
            mapYMin = 30;
            mapYMax = height - 30;
        } else {
            int windowWidth = 312;
            mapXMin = width / 2 - windowWidth / 2;
            mapXMax = width / 2 + windowWidth / 2;
            mapYMin = guiTop;
            mapYMax = guiTop + 200;
        }
        mapWidth = mapXMax - mapXMin;
        mapHeight = mapYMax - mapYMin;
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        ++tickCounter;
        if (zoomTicks > 0) {
            --zoomTicks;
        }
        if (creatingWaypointNew || renamingWaypoint || sharingWaypointNew) {
            nameWPTextField.updateCursorCounter();
        }
        handleMapKeyboardMovement();
        if (isConquestGrid) {
            updateCurrentDimensionAndFaction();
            if (ticksUntilRequestFac > 0) {
                --ticksUntilRequestFac;
            }
        }
    }

    private void updateCurrentDimensionAndFaction() {
        if (currentFactionIndex != prevFactionIndex) {
            conquestViewingFaction = currentFactionList.get(currentFactionIndex);
            ticksUntilRequestFac = 40;
        }
        prevFactionIndex = currentFactionIndex;
        if (currentRegion != prevRegion) {
            lastViewedRegions.put(prevRegion, conquestViewingFaction);
            currentFactionList = currentRegion.factionList;
            conquestViewingFaction = lastViewedRegions.containsKey((Object) currentRegion) ? lastViewedRegions.get((Object) currentRegion) : currentRegion.factionList.get(0);
            prevFactionIndex = currentFactionIndex = currentFactionList.indexOf((Object) conquestViewingFaction);
            ticksUntilRequestFac = 40;
        }
        prevRegion = currentRegion;
    }

    public void setupZoomVariables(float f) {
        zoomExp = zoomPower;
        if (zoomTicks > 0) {
            float progress = ((float) zoomTicksMax - ((float) zoomTicks - f)) / (float) zoomTicksMax;
            zoomExp = (float) prevZoomPower + (float) (zoomPower - prevZoomPower) * progress;
        }
        zoomScale = (float) Math.pow(2.0, zoomExp);
        zoomScaleStable = (float) Math.pow(2.0, zoomTicks == 0 ? zoomPower : Math.min(zoomPower, prevZoomPower));
    }

    public void drawScreen(int i, int j, float f) {
        int x;
        String s;
        int y;
        boolean isSepia;
        Tessellator tess = Tessellator.instance;
        zLevel = 0.0f;
        setupMapDimensions();
        setupZoomVariables(f);
        if (isConquestGrid) {
            loadingConquestGrid = !receivedFacGrids.contains((Object) conquestViewingFaction);
            highestViewedConqStr = 0.0f;
            setupConquestScrollBar(i, j);
            buttonConquestRegions.displayString = currentRegion.getRegionName();
            buttonConquestRegions.enabled = true;
            buttonConquestRegions.visible = true;
        }
        posX = prevPosX;
        posY = prevPosY;
        boolean bl = isMouseWithinMap = i >= mapXMin && i < mapXMax && j >= mapYMin && j < mapYMax;
        if (!hasOverlay && !isFacScrolling && zoomTicks == 0 && Mouse.isButtonDown((int) 0)) {
            if ((isMouseButtonDown == 0 || isMouseButtonDown == 1) && isMouseWithinMap) {
                if (isMouseButtonDown == 0) {
                    isMouseButtonDown = 1;
                } else {
                    float x2 = (float) (i - prevMouseX) / zoomScale;
                    float y2 = (float) (j - prevMouseY) / zoomScale;
                    posX -= x2;
                    posY -= y2;
                    if (x2 != 0.0f || y2 != 0.0f) {
                        selectedWaypoint = null;
                    }
                }
                prevMouseX = i;
                prevMouseY = j;
            }
        } else {
            isMouseButtonDown = 0;
        }
        prevPosX = posX;
        prevPosY = posY;
        posX += posXMove * f;
        posY += posYMove * f;
        boolean bl2 = isSepia = isConquestGrid || LOTRConfig.enableSepiaMap;
        if (isConquestGrid) {
            drawDefaultBackground();
        }
        if (fullscreen || isConquestGrid) {
            mc.getTextureManager().bindTexture(LOTRTextures.overlayTexture);
            if (conquestViewingFaction != null) {
                float[] cqColors = conquestViewingFaction.getFactionRGB();
                GL11.glColor4f((float) cqColors[0], (float) cqColors[1], (float) cqColors[2], (float) 1.0f);
            } else {
                GL11.glColor4f((float) 0.65f, (float) 0.5f, (float) 0.35f, (float) 1.0f);
            }
            tess.startDrawingQuads();
            if (isConquestGrid) {
                int w = 8;
                int up = 22;
                int down = 54;
                tess.addVertexWithUV((double) (mapXMin - w), (double) (mapYMax + down), (double) zLevel, 0.0, 1.0);
                tess.addVertexWithUV((double) (mapXMax + w), (double) (mapYMax + down), (double) zLevel, 1.0, 1.0);
                tess.addVertexWithUV((double) (mapXMax + w), (double) (mapYMin - up), (double) zLevel, 1.0, 0.0);
                tess.addVertexWithUV((double) (mapXMin - w), (double) (mapYMin - up), (double) zLevel, 0.0, 0.0);
            } else {
                tess.addVertexWithUV(0.0, (double) height, (double) zLevel, 0.0, 1.0);
                tess.addVertexWithUV((double) width, (double) height, (double) zLevel, 1.0, 1.0);
                tess.addVertexWithUV((double) width, 0.0, (double) zLevel, 1.0, 0.0);
                tess.addVertexWithUV(0.0, 0.0, (double) zLevel, 0.0, 0.0);
            }
            tess.draw();
            int redW = isConquestGrid ? 2 : 4;
            GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
            renderGraduatedRects(mapXMin - 1, mapYMin - 1, mapXMax + 1, mapYMax + 1, -6156032, -16777216, redW);
        } else {
            drawDefaultBackground();
            renderGraduatedRects(mapXMin - 1, mapYMin - 1, mapXMax + 1, mapYMax + 1, -6156032, -16777216, 4);
        }
        setupScrollBars(i, j);
        GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
        int oceanColor = LOTRTextures.getMapOceanColor(isSepia);
        drawRect((int) mapXMin, (int) mapYMin, (int) mapXMax, (int) mapYMax, (int) oceanColor);
        GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
        if (!isConquestGrid) {
            String title = StatCollector.translateToLocal((String) "lotr.gui.map.title");
            if (fullscreen) {
                drawCenteredString(title, width / 2, 10, 16777215);
            } else {
                drawCenteredString(title, width / 2, guiTop - 30, 16777215);
            }
        }
        if (hasControlZones && LOTRFaction.controlZonesEnabled((World) mc.theWorld)) {
            renderMapAndOverlay(isSepia, 1.0f, false);
            renderControlZone(i, j);
            GL11.glEnable((int) 3042);
            renderMapAndOverlay(isSepia, 0.5f, true);
            GL11.glDisable((int) 3042);
            String tooltip = null;
            if (mouseControlZone) {
                tooltip = StatCollector.translateToLocal((String) "lotr.gui.map.controlZoneFull");
            } else if (mouseControlZoneReduced) {
                tooltip = StatCollector.translateToLocal((String) "lotr.gui.map.controlZoneReduced");
            }
            if (tooltip != null) {
                int strWidth = mc.fontRenderer.getStringWidth(tooltip);
                int strHeight = mc.fontRenderer.FONT_HEIGHT;
                int rectX = i + 12;
                int rectY = j - 12;
                int border = 3;
                int rectWidth = strWidth + border * 2;
                int rectHeight = strHeight + border * 2;
                int mapBorder2 = 2;
                rectX = Math.max(rectX, mapXMin + mapBorder2);
                rectX = Math.min(rectX, mapXMax - mapBorder2 - rectWidth);
                rectY = Math.max(rectY, mapYMin + mapBorder2);
                rectY = Math.min(rectY, mapYMax - mapBorder2 - rectHeight);
                GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) 300.0f);
                drawFancyRect(rectX, rectY, rectX + rectWidth, rectY + rectHeight);
                mc.fontRenderer.drawString(tooltip, rectX + border, rectY + border, 16777215);
                GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) -300.0f);
            }
        } else {
            renderMapAndOverlay(isSepia, 1.0f, true);
            if (isConquestGrid && conquestViewingFaction != null) {
                requestConquestGridIfNeed(conquestViewingFaction);
                if (!loadingConquestGrid) {
                    GL11.glEnable((int) 3042);
                    GL11.glBlendFunc((int) 770, (int) 771);
                    setupMapClipping();
                    float alphaFunc = GL11.glGetFloat((int) 3010);
                    GL11.glAlphaFunc((int) 516, (float) 0.005f);
                    GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
                    ArrayList allZones = (ArrayList) facConquestGrids.get((Object) conquestViewingFaction);
                    if (allZones == null) {
                        allZones = new ArrayList();
                    }
                    ArrayList<LOTRConquestZone> zonesInView = new ArrayList<LOTRConquestZone>();
                    highestViewedConqStr = 0.0f;
                    float mouseOverStr = 0.0f;
                    LOTRConquestZone mouseOverZone = null;
                    LOTRConquestGrid.ConquestEffective mouseOverEffect = null;
                    for (int pass = 0; pass <= 1; ++pass) {
                        if (pass == 1 && !(highestViewedConqStr > 0.0f)) {
                            continue;
                        }
                        ArrayList<LOTRConquestZone> zoneList = pass == 0 ? allZones : zonesInView;
                        for (LOTRConquestZone zone : zoneList) {
                            float strength = zone.getConquestStrength(conquestViewingFaction, (World) mc.theWorld);
                            int[] min = LOTRConquestGrid.getMinCoordsOnMap(zone);
                            int[] max = LOTRConquestGrid.getMaxCoordsOnMap(zone);
                            float[] minF = transformMapCoords(min[0], min[1]);
                            float[] maxF = transformMapCoords(max[0], max[1]);
                            float minX = minF[0];
                            float maxX = maxF[0];
                            float minY = minF[1];
                            float maxY = maxF[1];
                            if (!(maxX >= (float) mapXMin) || !(minX <= (float) mapXMax) || !(maxY >= (float) mapYMin) || !(minY <= (float) mapYMax)) {
                                continue;
                            }
                            if (pass == 0) {
                                if (strength > highestViewedConqStr) {
                                    highestViewedConqStr = strength;
                                }
                                zonesInView.add(zone);
                                continue;
                            }
                            if (pass != 1 || !(strength > 0.0f)) {
                                continue;
                            }
                            float strFrac = strength / highestViewedConqStr;
                            float strAlpha = strFrac = MathHelper.clamp_float((float) strFrac, (float) 0.0f, (float) 1.0f);
                            if (strength > 0.0f) {
                                strAlpha = Math.max(strAlpha, 0.1f);
                            }
                            LOTRConquestGrid.ConquestEffective effect = LOTRConquestGrid.getConquestEffectIn((World) mc.theWorld, zone, conquestViewingFaction);
                            int zoneColor = 0xBB0000 | Math.round(strAlpha * 255.0f) << 24;
                            if (effect == LOTRConquestGrid.ConquestEffective.EFFECTIVE) {
                                drawFloatRect(minX, minY, maxX, maxY, zoneColor);
                            } else {
                                int zoneColor2 = 0x1E1E1E | Math.round(strAlpha * 255.0f) << 24;
                                if (effect == LOTRConquestGrid.ConquestEffective.ALLY_BOOST) {
                                    float zoneYSize = maxY - minY;
                                    int strips = 8;
                                    for (int l = 0; l < strips; ++l) {
                                        float stripYSize = zoneYSize / (float) strips;
                                        drawFloatRect(minX, minY + stripYSize * (float) l, maxX, minY + stripYSize * (float) (l + 1), l % 2 == 0 ? zoneColor : zoneColor2);
                                    }
                                } else if (effect == LOTRConquestGrid.ConquestEffective.NO_EFFECT) {
                                    drawFloatRect(minX, minY, maxX, maxY, zoneColor2);
                                }
                            }
                            if (!((float) i >= minX) || !((float) i < maxX) || !((float) j >= minY) || !((float) j < maxY)) {
                                continue;
                            }
                            mouseOverStr = strength;
                            mouseOverZone = zone;
                            mouseOverEffect = effect;
                        }
                    }
                    GL11.glAlphaFunc((int) 516, (float) alphaFunc);
                    if (mouseOverZone != null && i >= mapXMin && i < mapXMax && j >= mapYMin && j < mapYMax) {
                        int[] min = LOTRConquestGrid.getMinCoordsOnMap(mouseOverZone);
                        int[] max = LOTRConquestGrid.getMaxCoordsOnMap(mouseOverZone);
                        float[] minF = transformMapCoords(min[0], min[1]);
                        float[] maxF = transformMapCoords(max[0], max[1]);
                        float minX = minF[0];
                        float maxX = maxF[0];
                        float minY = minF[1];
                        float maxY = maxF[1];
                        drawFloatRect(minX - 1.0f, minY - 1.0f, maxX + 1.0f, minY, -16777216);
                        drawFloatRect(minX - 1.0f, maxY, maxX + 1.0f, maxY + 1.0f, -16777216);
                        drawFloatRect(minX - 1.0f, minY, minX, maxY, -16777216);
                        drawFloatRect(maxX, minY, maxX + 1.0f, maxY, -16777216);
                        drawFloatRect(minX - 2.0f, minY - 2.0f, maxX + 2.0f, minY - 1.0f, -4521984);
                        drawFloatRect(minX - 2.0f, maxY + 1.0f, maxX + 2.0f, maxY + 2.0f, -4521984);
                        drawFloatRect(minX - 2.0f, minY - 1.0f, minX - 1.0f, maxY + 1.0f, -4521984);
                        drawFloatRect(maxX + 1.0f, minY - 1.0f, maxX + 2.0f, maxY + 1.0f, -4521984);
                        String tooltip = LOTRAlignmentValues.formatConqForDisplay(mouseOverStr, false);
                        String subtip = null;
                        if (mouseOverEffect == LOTRConquestGrid.ConquestEffective.ALLY_BOOST) {
                            subtip = StatCollector.translateToLocalFormatted((String) "lotr.gui.map.conquest.allyBoost", (Object[]) new Object[]{conquestViewingFaction.factionName()});
                        } else if (mouseOverEffect == LOTRConquestGrid.ConquestEffective.NO_EFFECT) {
                            subtip = StatCollector.translateToLocal((String) "lotr.gui.map.conquest.noEffect");
                        }
                        int strWidth = mc.fontRenderer.getStringWidth(tooltip);
                        int subWidth = subtip == null ? 0 : mc.fontRenderer.getStringWidth(subtip);
                        int strHeight = mc.fontRenderer.FONT_HEIGHT;
                        float guiScale = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight).getScaleFactor();
                        float subScale = guiScale <= 2.0f ? guiScale : guiScale - 1.0f;
                        float subScaleRel = subScale / guiScale;
                        int rectX = i + 12;
                        int rectY = j - 12;
                        int border = 3;
                        int iconSize = 16;
                        int rectWidth = border * 2 + Math.max(strWidth + iconSize + border, (int) ((float) subWidth * subScaleRel));
                        int rectHeight = Math.max(strHeight, iconSize) + border * 2;
                        if (subtip != null) {
                            rectHeight += border + (int) ((float) strHeight * subScaleRel);
                        }
                        int mapBorder2 = 2;
                        rectX = Math.max(rectX, mapXMin + mapBorder2);
                        rectX = Math.min(rectX, mapXMax - mapBorder2 - rectWidth);
                        rectY = Math.max(rectY, mapYMin + mapBorder2);
                        rectY = Math.min(rectY, mapYMax - mapBorder2 - rectHeight);
                        GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) 300.0f);
                        drawFancyRect(rectX, rectY, rectX + rectWidth, rectY + rectHeight);
                        mc.getTextureManager().bindTexture(LOTRClientProxy.alignmentTexture);
                        GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
                        drawTexturedModalRect(rectX + border, rectY + border, 0, 228, iconSize, iconSize);
                        mc.fontRenderer.drawString(tooltip, rectX + iconSize + border * 2, rectY + border + (iconSize - strHeight) / 2, 16777215);
                        if (subtip != null) {
                            GL11.glPushMatrix();
                            GL11.glScalef((float) subScaleRel, (float) subScaleRel, (float) 1.0f);
                            int subX = rectX + border;
                            int subY = rectY + border * 2 + iconSize;
                            mc.fontRenderer.drawString(subtip, Math.round((float) subX / subScaleRel), Math.round((float) subY / subScaleRel), 16777215);
                            GL11.glPopMatrix();
                        }
                        GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) -300.0f);
                    }
                    endMapClipping();
                    GL11.glDisable((int) 3042);
                }
            }
        }
        zLevel += 50.0f;
        LOTRTextures.drawMapCompassBottomLeft(mapXMin + 12, mapYMax - 12, zLevel, 1.0);
        zLevel -= 50.0f;
        renderRoads();
        renderPlayers(i, j);
        if (!loadingConquestGrid) {
            renderMiniQuests((EntityPlayer) mc.thePlayer, i, j);
        }
        renderWaypoints(0, i, j);
        renderLabels();
        renderWaypoints(1, i, j);
        if (!loadingConquestGrid && selectedWaypoint != null && isWaypointVisible(selectedWaypoint)) {
            if (!hasOverlay) {
                renderWaypointTooltip(selectedWaypoint, true, i, j);
            }
        } else {
            selectedWaypoint = null;
        }
        if (isConquestGrid) {
            if (loadingConquestGrid) {
                drawRect((int) mapXMin, (int) mapYMin, (int) mapXMax, (int) mapYMax, (int) -1429949539);
                GL11.glEnable((int) 3042);
                GL11.glBlendFunc((int) 770, (int) 771);
                mc.getTextureManager().bindTexture(LOTRTextures.overlayTexture);
                GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 0.2f);
                tess.startDrawingQuads();
                tess.addVertexWithUV((double) mapXMin, (double) mapYMax, 0.0, 0.0, 1.0);
                tess.addVertexWithUV((double) mapXMax, (double) mapYMax, 0.0, 1.0, 1.0);
                tess.addVertexWithUV((double) mapXMax, (double) mapYMin, 0.0, 1.0, 0.0);
                tess.addVertexWithUV((double) mapXMin, (double) mapYMin, 0.0, 0.0, 0.0);
                tess.draw();
                String loadText = "";
                LOTRConquestGrid.ConquestViewableQuery query = LOTRConquestGrid.canPlayerViewConquest((EntityPlayer) mc.thePlayer, conquestViewingFaction);
                if (query.result == LOTRConquestGrid.ConquestViewable.CAN_VIEW) {
                    loadText = StatCollector.translateToLocal((String) "lotr.gui.map.conquest.wait");
                    int ellipsis = 1 + tickCounter / 10 % 3;
                    for (int l = 0; l < ellipsis; ++l) {
                        loadText = loadText + ".";
                    }
                } else if (query.result == LOTRConquestGrid.ConquestViewable.UNPLEDGED) {
                    loadText = StatCollector.translateToLocal((String) "lotr.gui.map.conquest.noPledge");
                } else {
                    LOTRPlayerData pd = LOTRLevelData.getData((EntityPlayer) mc.thePlayer);
                    LOTRFaction pledgeFac = pd.getPledgeFaction();
                    LOTRFactionRank needRank = query.needRank;
                    String needAlign = LOTRAlignmentValues.formatAlignForDisplay(needRank.alignment);
                    String format = "";
                    if (query.result == LOTRConquestGrid.ConquestViewable.NEED_RANK) {
                        format = "lotr.gui.map.conquest.needRank";
                    }
                    loadText = StatCollector.translateToLocalFormatted((String) format, (Object[]) new Object[]{pledgeFac.factionName(), needRank.getFullNameWithGender(pd), needAlign});
                }
                GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
                int stringWidth = 250;
                String[] splitNewline = loadText.split(Pattern.quote("\\n"));
                ArrayList<String> loadLines = new ArrayList();
                for (String line : splitNewline) {
                    loadLines.addAll(fontRendererObj.listFormattedStringToWidth(line, stringWidth));
                }
                int stringX = mapXMin + mapWidth / 2;
                int stringY = (mapYMin + mapYMax) / 2 - loadLines.size() * fontRendererObj.FONT_HEIGHT / 2;
                for (String s2 : loadLines) {
                    drawCenteredString(s2, stringX, stringY, 3748142);
                    stringY += fontRendererObj.FONT_HEIGHT;
                }
                GL11.glDisable((int) 3042);
            }
            mc.getTextureManager().bindTexture(conquestTexture);
            GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
            drawTexturedModalRect(mapXMin - 8, mapYMin - 22, 0, 0, mapWidth + 16, mapHeight + 22 + 54, 512);
        }
        zLevel = 100.0f;
        if (!hasOverlay) {
            if (isMiddleEarth() && selectedWaypoint != null) {
                zLevel += 500.0f;
                LOTRPlayerData pd = LOTRLevelData.getData((EntityPlayer) mc.thePlayer);
                boolean hasUnlocked = selectedWaypoint.hasPlayerUnlocked((EntityPlayer) mc.thePlayer);
                int ftSince = pd.getTimeSinceFT();
                int wpTimeThreshold = pd.getWaypointFTTime(selectedWaypoint, (EntityPlayer) mc.thePlayer);
                int timeRemaining = wpTimeThreshold - ftSince;
                boolean canFastTravel = hasUnlocked && timeRemaining <= 0;
                String notUnlocked = "If you can read this, something has gone hideously wrong";
                if (selectedWaypoint instanceof LOTRCustomWaypoint) {
                    LOTRCustomWaypoint cwp = (LOTRCustomWaypoint) selectedWaypoint;
                    if (cwp.isShared()) {
                        notUnlocked = StatCollector.translateToLocal((String) "lotr.gui.map.locked.shared");
                    }
                } else {
                    LOTRWaypoint wp = (LOTRWaypoint) selectedWaypoint;
                    notUnlocked = !wp.isCompatibleAlignment((EntityPlayer) mc.thePlayer) ? StatCollector.translateToLocal((String) "lotr.gui.map.locked.enemy") : StatCollector.translateToLocal((String) "lotr.gui.map.locked.region");
                }
                String conquestUnlock = pd.getPledgeFaction() == null ? "" : StatCollector.translateToLocalFormatted((String) "lotr.gui.map.locked.conquerable", (Object[]) new Object[]{pd.getPledgeFaction().factionName()});
                String ftPrompt = StatCollector.translateToLocalFormatted((String) "lotr.gui.map.fastTravel.prompt", (Object[]) new Object[]{GameSettings.getKeyDisplayString((int) LOTRKeyHandler.keyBindingFastTravel.getKeyCode())});
                String ftMoreTime = StatCollector.translateToLocalFormatted((String) "lotr.gui.map.fastTravel.moreTime", (Object[]) new Object[]{LOTRLevelData.getHMSTime_Ticks(timeRemaining)});
                String ftWaitTime = StatCollector.translateToLocalFormatted((String) "lotr.gui.map.fastTravel.waitTime", (Object[]) new Object[]{LOTRLevelData.getHMSTime_Ticks(wpTimeThreshold)});
                if (fullscreen || isConquestGrid) {
                    if (!hasUnlocked) {
                        if (selectedWaypoint instanceof LOTRWaypoint && ((LOTRWaypoint) selectedWaypoint).isConquestUnlockable((EntityPlayer) mc.thePlayer)) {
                            renderFullscreenSubtitles(notUnlocked, conquestUnlock);
                        } else {
                            renderFullscreenSubtitles(notUnlocked);
                        }
                    } else if (canFastTravel) {
                        renderFullscreenSubtitles(ftPrompt, ftWaitTime);
                    } else {
                        renderFullscreenSubtitles(ftMoreTime, ftWaitTime);
                    }
                } else {
                    ArrayList<String> lines = new ArrayList<String>();
                    if (!hasUnlocked) {
                        lines.add(notUnlocked);
                        if (selectedWaypoint instanceof LOTRWaypoint && ((LOTRWaypoint) selectedWaypoint).isConquestUnlockable((EntityPlayer) mc.thePlayer)) {
                            lines.add(conquestUnlock);
                        }
                    } else if (canFastTravel) {
                        lines.add(ftPrompt);
                        lines.add(ftWaitTime);
                    } else {
                        lines.add(ftMoreTime);
                        lines.add(ftWaitTime);
                    }
                    int stringHeight = fontRendererObj.FONT_HEIGHT;
                    int rectWidth = mapWidth;
                    int border = 3;
                    int rectHeight = border + (stringHeight + border) * lines.size();
                    int x3 = mapXMin + mapWidth / 2 - rectWidth / 2;
                    int y3 = mapYMax + 10;
                    int strX = mapXMin + mapWidth / 2;
                    int strY = y3 + border;
                    drawFancyRect(x3, y3, x3 + rectWidth, y3 + rectHeight);
                    for (String s3 : lines) {
                        drawCenteredString(s3, strX, strY, 16777215);
                        strY += stringHeight + border;
                    }
                }
                zLevel -= 500.0f;
            } else if (isMouseWithinMap) {
                zLevel += 500.0f;
                float biomePosX = posX + (float) (i - mapXMin - mapWidth / 2) / zoomScale;
                float biomePosZ = posY + (float) (j - mapYMin - mapHeight / 2) / zoomScale;
                int biomePosZ_int = MathHelper.floor_double((double) biomePosZ);
                int biomePosX_int = MathHelper.floor_double((double) biomePosX);
                LOTRBiome biome = LOTRGenLayerWorld.getBiomeOrOcean(biomePosX_int, biomePosZ_int = MathHelper.floor_double((double) biomePosZ));
                mouseXCoord = Math.round((biomePosX - 810.0f) * (float) LOTRGenLayerWorld.scale);
                mouseZCoord = Math.round((biomePosZ - 730.0f) * (float) LOTRGenLayerWorld.scale);
                String biomeName = (biome != null) ? biome.getBiomeDisplayName() : "Unknown Biome";
                String coords = StatCollector.translateToLocalFormatted((String) "lotr.gui.map.coords", (Object[]) new Object[]{mouseXCoord, mouseZCoord});
                String teleport = StatCollector.translateToLocalFormatted((String) "lotr.gui.map.tp", (Object[]) new Object[]{GameSettings.getKeyDisplayString((int) LOTRKeyHandler.keyBindingMapTeleport.getKeyCode())});
                int stringHeight = fontRendererObj.FONT_HEIGHT;
                if (fullscreen || isConquestGrid) {
                    renderFullscreenSubtitles(biomeName, coords);
                    if (canTeleport()) {
                        GL11.glPushMatrix();
                        if (isConquestGrid) {
                            GL11.glTranslatef((float) ((mapXMax - mapXMin) / 2 - 8 - fontRendererObj.getStringWidth(teleport) / 2), (float) 0.0f, (float) 0.0f);
                        } else {
                            GL11.glTranslatef((float) (width / 2 - 30 - fontRendererObj.getStringWidth(teleport) / 2), (float) 0.0f, (float) 0.0f);
                        }
                        renderFullscreenSubtitles(teleport);
                        GL11.glPopMatrix();
                    }
                } else {
                    int rectWidth = mapWidth;
                    int border = 3;
                    int rectHeight = border * 3 + stringHeight * 2;
                    if (canTeleport()) {
                        rectHeight += (stringHeight + border) * 2;
                    }
                    int x4 = mapXMin + mapWidth / 2 - rectWidth / 2;
                    int y4 = mapYMax + 10;
                    drawFancyRect(x4, y4, x4 + rectWidth, y4 + rectHeight);
                    int strX = mapXMin + mapWidth / 2;
                    int strY = y4 + border;
                    drawCenteredString(biomeName, strX, strY, 16777215);
                    drawCenteredString(coords, strX, strY += stringHeight + border, 16777215);
                    if (canTeleport()) {
                        drawCenteredString(teleport, strX, strY + (stringHeight + border) * 2, 16777215);
                    }
                }
                zLevel -= 500.0f;
            }
        }
        if (isConquestGrid) {
            s = StatCollector.translateToLocalFormatted((String) "lotr.gui.map.conquest.title", (Object[]) new Object[]{conquestViewingFaction.factionName()});
            x = mapXMin + mapWidth / 2;
            y = mapYMin - 14;
            LOTRTickHandlerClient.drawAlignmentText(fontRendererObj, x - fontRendererObj.getStringWidth(s) / 2, y, s, 1.0f);
            if (!loadingConquestGrid) {
                int keyBorder = 8;
                int keyWidth = 24;
                int keyHeight = 12;
                int iconSize = 16;
                int iconGap = keyBorder / 2;
                float guiScale = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight).getScaleFactor();
                float labelScale = guiScale <= 2.0f ? guiScale : guiScale - 1.0f;
                float labelScaleRel = labelScale / guiScale;
                mc.getTextureManager().bindTexture(LOTRClientProxy.alignmentTexture);
                GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
                drawTexturedModalRect(mapXMax - keyBorder - iconSize, mapYMax - keyBorder - iconSize, 0, 228, iconSize, iconSize);
                for (int pass = 0; pass <= 1; ++pass) {
                    for (int l = 0; l <= 10; ++l) {
                        float frac = (float) (10 - l) / 10.0f;
                        float strFrac = frac * highestViewedConqStr;
                        int x1 = mapXMax - keyBorder - iconSize - iconGap - l * keyWidth;
                        int x0 = x1 - keyWidth;
                        int y1 = mapYMax - keyBorder - (iconSize - keyHeight) / 2;
                        int y0 = y1 - keyHeight;
                        if (pass == 0) {
                            int color = 0xBB0000 | Math.round(frac * 255.0f) << 24;
                            drawRect((int) x0, (int) y0, (int) x1, (int) y1, (int) color);
                            continue;
                        }
                        if (pass != 1 || l % 2 != 0) {
                            continue;
                        }
                        String keyLabel = LOTRAlignmentValues.formatConqForDisplay(strFrac, false);
                        int strX = (int) ((float) (x0 + keyWidth / 2) / labelScaleRel);
                        int strY = (int) ((float) (y0 + keyHeight / 2) / labelScaleRel) - fontRendererObj.FONT_HEIGHT / 2;
                        GL11.glPushMatrix();
                        GL11.glScalef((float) labelScaleRel, (float) labelScaleRel, (float) 1.0f);
                        drawCenteredString(keyLabel, strX, strY, 16777215);
                        GL11.glPopMatrix();
                    }
                }
            }
            if (hasConquestScrollBar()) {
                mc.getTextureManager().bindTexture(LOTRGuiFactions.factionsTexture);
                GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
                drawTexturedModalRect(facScrollX, facScrollY, 0, 128, facScrollWidth, facScrollHeight);
                int factions = currentFactionList.size();
                for (int index = 0; index < factions; ++index) {
                    LOTRFaction faction = currentFactionList.get(index);
                    float[] factionColors = faction.getFactionRGB();
                    float shade = 0.6f;
                    GL11.glColor4f((float) (factionColors[0] * shade), (float) (factionColors[1] * shade), (float) (factionColors[2] * shade), (float) 1.0f);
                    float xMin = (float) index / (float) factions;
                    float xMax = (float) (index + 1) / (float) factions;
                    xMin = (float) (facScrollX + facScrollBorder) + xMin * (float) (facScrollWidth - facScrollBorder * 2);
                    xMax = (float) (facScrollX + facScrollBorder) + xMax * (float) (facScrollWidth - facScrollBorder * 2);
                    float yMin = facScrollY + facScrollBorder;
                    float yMax = facScrollY + facScrollHeight - facScrollBorder;
                    float minU = (float) (0 + facScrollBorder) / 256.0f;
                    float maxU = (float) (0 + facScrollWidth - facScrollBorder) / 256.0f;
                    float minV = (float) (128 + facScrollBorder) / 256.0f;
                    float maxV = (float) (128 + facScrollHeight - facScrollBorder) / 256.0f;
                    tess.startDrawingQuads();
                    tess.addVertexWithUV((double) xMin, (double) yMax, (double) zLevel, (double) minU, (double) maxV);
                    tess.addVertexWithUV((double) xMax, (double) yMax, (double) zLevel, (double) maxU, (double) maxV);
                    tess.addVertexWithUV((double) xMax, (double) yMin, (double) zLevel, (double) maxU, (double) minV);
                    tess.addVertexWithUV((double) xMin, (double) yMin, (double) zLevel, (double) minU, (double) minV);
                    tess.draw();
                }
                mc.getTextureManager().bindTexture(LOTRGuiFactions.factionsTexture);
                GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
                int scroll = (int) (currentFacScroll * (float) (facScrollWidth - facScrollBorder * 2 - facScrollWidgetWidth));
                drawTexturedModalRect(facScrollX + facScrollBorder + scroll, facScrollY + facScrollBorder, 0, 142, facScrollWidgetWidth, facScrollWidgetHeight);
            }
        }
        if (!hasOverlay && hasControlZones) {
            s = StatCollector.translateToLocalFormatted((String) "lotr.gui.map.controlZones", (Object[]) new Object[]{controlZoneFaction.factionName()});
            x = mapXMin + mapWidth / 2;
            y = mapYMin + 20;
            LOTRTickHandlerClient.drawAlignmentText(fontRendererObj, x - fontRendererObj.getStringWidth(s) / 2, y, s, 1.0f);
            if (!LOTRFaction.controlZonesEnabled((World) mc.theWorld)) {
                s = StatCollector.translateToLocal((String) "lotr.gui.map.controlZonesDisabled");
                LOTRTickHandlerClient.drawAlignmentText(fontRendererObj, x - fontRendererObj.getStringWidth(s) / 2, mapYMin + mapHeight / 2, s, 1.0f);
            }
        }
        boolean buttonVisible = buttonOverlayFunction.visible;
        buttonOverlayFunction.visible = false;
        super.drawScreen(i, j, f);
        buttonOverlayFunction.visible = buttonVisible;
        renderMapWidgets(i, j);
        if (hasOverlay) {
            GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) 500.0f);
            int overlayBorder = 10;
            if (fullscreen) {
                overlayBorder = 40;
            }
            int rectX0 = mapXMin + overlayBorder;
            int rectY0 = mapYMin + overlayBorder;
            int rectX1 = mapXMax - overlayBorder;
            int rectY1 = mapYMax - overlayBorder;
            drawFancyRect(rectX0, rectY0, rectX1, rectY1);
            if (overlayLines != null) {
                int stringX = mapXMin + mapWidth / 2;
                int stringY = rectY0 + 3 + mc.fontRenderer.FONT_HEIGHT;
                int stringWidth = (int) ((float) (mapWidth - overlayBorder * 2) * 0.75f);
                ArrayList<String> displayLines = new ArrayList();
                for (String s4 : overlayLines) {
                    displayLines.addAll(fontRendererObj.listFormattedStringToWidth(s4, stringWidth));
                }
                for (String s5 : displayLines) {
                    drawCenteredString(s5, stringX, stringY, 16777215);
                    stringY += mc.fontRenderer.FONT_HEIGHT;
                }
                stringY += mc.fontRenderer.FONT_HEIGHT;
                if (sharingWaypoint) {
                    fellowshipDrawGUI.clearMouseOverFellowship();
                    mouseOverRemoveSharedFellowship = null;
                    int iconWidth = 8;
                    int iconGap = 8;
                    int fullWidth = fellowshipDrawGUI.xSize + iconGap + iconWidth;
                    int fsX = mapXMin + mapWidth / 2 - fullWidth / 2;
                    int fsY = stringY;
                    scrollPaneWPShares.paneX0 = fsX;
                    scrollPaneWPShares.scrollBarX0 = fsX + fullWidth + 2 + 2;
                    scrollPaneWPShares.paneY0 = fsY;
                    scrollPaneWPShares.paneY1 = fsY + (mc.fontRenderer.FONT_HEIGHT + 5) * displayedWPShares;
                    scrollPaneWPShares.mouseDragScroll(i, j);
                    int[] sharesMinMax = scrollPaneWPShares.getMinMaxIndices(displayedWPShareList, displayedWPShares);
                    for (int index = sharesMinMax[0]; index <= sharesMinMax[1]; ++index) {
                        UUID fsID = displayedWPShareList.get(index);
                        LOTRFellowshipClient fs = LOTRLevelData.getData((EntityPlayer) mc.thePlayer).getClientFellowshipByID(fsID);
                        if (fs == null) {
                            continue;
                        }
                        fellowshipDrawGUI.drawFellowshipEntry(fs, fsX, fsY, i, j, false, fullWidth);
                        int iconRemoveX = fsX + fellowshipDrawGUI.xSize + iconGap;
                        int iconRemoveY = fsY;
                        boolean mouseOverRemove = false;
                        if (fs == fellowshipDrawGUI.getMouseOverFellowship()) {
                            boolean bl3 = mouseOverRemove = i >= iconRemoveX && i <= iconRemoveX + iconWidth && j >= iconRemoveY && j <= iconRemoveY + iconWidth;
                            if (mouseOverRemove) {
                                mouseOverRemoveSharedFellowship = fs;
                            }
                        }
                        mc.getTextureManager().bindTexture(LOTRGuiFellowships.iconsTextures);
                        GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
                        drawTexturedModalRect(iconRemoveX, iconRemoveY, 8, 16 + (mouseOverRemove ? 0 : iconWidth), iconWidth, iconWidth);
                        fsY = stringY += mc.fontRenderer.FONT_HEIGHT + 5;
                    }
                    if (scrollPaneWPShares.hasScrollBar) {
                        scrollPaneWPShares.drawScrollBar();
                    }
                }
                if (creatingWaypointNew || renamingWaypoint || sharingWaypointNew) {
                    nameWPTextField.xPosition = (rectX0 + rectX1) / 2 - nameWPTextField.width / 2;
                    nameWPTextField.yPosition = stringY;
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) zLevel);
                    nameWPTextField.drawTextBox();
                    GL11.glPopMatrix();
                    if (sharingWaypointNew && isFellowshipAlreadyShared(nameWPTextField.getText(), (LOTRCustomWaypoint) selectedWaypoint)) {
                        String alreadyShared = StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.shareNew.already");
                        int sx = nameWPTextField.xPosition + nameWPTextField.width + 6;
                        int sy = nameWPTextField.yPosition + nameWPTextField.height / 2 - fontRendererObj.FONT_HEIGHT / 2;
                        fontRendererObj.drawString(alreadyShared, sx, sy, 16711680);
                    }
                    stringY += nameWPTextField.height + mc.fontRenderer.FONT_HEIGHT;
                }
                stringY += mc.fontRenderer.FONT_HEIGHT;
                if (buttonOverlayFunction.visible) {
                    buttonOverlayFunction.enabled = true;
                    if (creatingWaypointNew || renamingWaypoint) {
                        buttonOverlayFunction.enabled = isValidWaypointName(nameWPTextField.getText());
                    }
                    if (sharingWaypointNew) {
                        buttonOverlayFunction.enabled = isExistingUnsharedFellowshipName(nameWPTextField.getText(), (LOTRCustomWaypoint) selectedWaypoint);
                    }
                    buttonOverlayFunction.xPosition = stringX - buttonOverlayFunction.width / 2;
                    buttonOverlayFunction.yPosition = stringY;
                    if (sharingWaypoint) {
                        buttonOverlayFunction.yPosition = rectY1 - 3 - mc.fontRenderer.FONT_HEIGHT - buttonOverlayFunction.height;
                    }
                    buttonOverlayFunction.drawButton(mc, i, j);
                }
            }
            GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) -500.0f);
        }
    }

    private void setupScrollBars(int i, int j) {
        int n = maxDisplayedWPShares = fullscreen ? 8 : 5;
        if (selectedWaypoint != null && hasOverlay && sharingWaypoint) {
            displayedWPShareList = ((LOTRCustomWaypoint) selectedWaypoint).getSharedFellowshipIDs();
            displayedWPShares = displayedWPShareList.size();
            if (scrollPaneWPShares != null) {
                scrollPaneWPShares.hasScrollBar = false;
                if (displayedWPShares > maxDisplayedWPShares) {
                    displayedWPShares = maxDisplayedWPShares;
                    scrollPaneWPShares.hasScrollBar = true;
                }
            } else {
                // Handle the case where scrollPaneWPShares is null if necessary
                System.err.println("scrollPaneWPShares is null!");
            }
        } else {
            displayedWPShareList = null;
            displayedWPShares = 0;
            if (scrollPaneWPShares != null) {
                scrollPaneWPShares.hasScrollBar = false;
                scrollPaneWPShares.mouseDragScroll(i, j);
            } else {
                // Handle the case where scrollPaneWPShares is null if necessary
                System.err.println("scrollPaneWPShares is null!");
            }
        }
    }

    public void renderMapAndOverlay(boolean sepia, float alpha, boolean overlay) {
        mapXMin_W = mapXMin;
        mapXMax_W = mapXMax;
        mapYMin_W = mapYMin;
        mapYMax_W = mapYMax;
        float mapScaleX = (float) mapWidth / zoomScale;
        float mapScaleY = (float) mapHeight / zoomScale;
        double minU = (double) (posX - mapScaleX / 2.0f) / (double) LOTRGenLayerWorld.imageWidth;
        double maxU = (double) (posX + mapScaleX / 2.0f) / (double) LOTRGenLayerWorld.imageWidth;
        double minV = (double) (posY - mapScaleY / 2.0f) / (double) LOTRGenLayerWorld.imageHeight;
        double maxV = (double) (posY + mapScaleY / 2.0f) / (double) LOTRGenLayerWorld.imageHeight;
        if (minU < 0.0) {
            mapXMin_W = mapXMin + (int) Math.round((0.0 - minU) * (double) LOTRGenLayerWorld.imageWidth * (double) zoomScale);
            minU = 0.0;
            if (maxU < 0.0) {
                maxU = 0.0;
                mapXMax_W = mapXMin_W;
            }
        }
        if (maxU > 1.0) {
            mapXMax_W = mapXMax - (int) Math.round((maxU - 1.0) * (double) LOTRGenLayerWorld.imageWidth * (double) zoomScale);
            maxU = 1.0;
            if (minU > 1.0) {
                minU = 1.0;
                mapXMin_W = mapXMax_W;
            }
        }
        if (minV < 0.0) {
            mapYMin_W = mapYMin + (int) Math.round((0.0 - minV) * (double) LOTRGenLayerWorld.imageHeight * (double) zoomScale);
            minV = 0.0;
            if (maxV < 0.0) {
                maxV = 0.0;
                mapYMax_W = mapYMin_W;
            }
        }
        if (maxV > 1.0) {
            mapYMax_W = mapYMax - (int) Math.round((maxV - 1.0) * (double) LOTRGenLayerWorld.imageHeight * (double) zoomScale);
            maxV = 1.0;
            if (minV > 1.0) {
                minV = 1.0;
                mapYMin_W = mapYMax_W;
            }
        }
        LOTRTextures.drawMap((EntityPlayer) mc.thePlayer, sepia, mapXMin_W, mapXMax_W, mapYMin_W, mapYMax_W, zLevel, minU, maxU, minV, maxV, alpha);
        if (overlay && !isOSRS()) {
            LOTRTextures.drawMapOverlay((EntityPlayer) mc.thePlayer, mapXMin, mapXMax, mapYMin, mapYMax, zLevel, minU, maxU, minV, maxV);
        }
    }

    private void renderGraduatedRects(int x1, int y1, int x2, int y2, int c1, int c2, int w) {
        float[] rgb1 = new Color(c1).getColorComponents(null);
        float[] rgb2 = new Color(c2).getColorComponents(null);
        for (int l = w - 1; l >= 0; --l) {
            float f = (float) l / (float) (w - 1);
            float r = rgb1[0] + (rgb2[0] - rgb1[0]) * f;
            float g = rgb1[1] + (rgb2[1] - rgb1[1]) * f;
            float b = rgb1[2] + (rgb2[2] - rgb1[2]) * f;
            int color = new Color(r, g, b).getRGB() + -16777216;
            drawRect((int) (x1 - l), (int) (y1 - l), (int) (x2 + l), (int) (y2 + l), (int) color);
        }
    }

    private void renderMapWidgets(int mouseX, int mouseY) {
        widgetAddCWP.visible = !hasOverlay && isMiddleEarth();
        widgetAddCWP.setTexVIndex(canCreateWaypointAtPosition() ? 0 : 1);
        widgetDelCWP.visible = !hasOverlay && isMiddleEarth() && selectedWaypoint instanceof LOTRCustomWaypoint && !((LOTRCustomWaypoint) selectedWaypoint).isShared();
        widgetRenameCWP.visible = !hasOverlay && isMiddleEarth() && selectedWaypoint instanceof LOTRCustomWaypoint && !((LOTRCustomWaypoint) selectedWaypoint).isShared();
        widgetToggleWPs.visible = !hasOverlay;
        widgetToggleWPs.setTexVIndex(showWP ? 0 : 1);
        widgetToggleCWPs.visible = !hasOverlay;
        widgetToggleCWPs.setTexVIndex(showCWP ? 0 : 1);
        widgetToggleHiddenSWPs.visible = !hasOverlay;
        widgetToggleHiddenSWPs.setTexVIndex(showHiddenSWP ? 1 : 0);
        widgetZoomIn.visible = !hasOverlay;
        widgetZoomIn.setTexVIndex(zoomPower < 4 ? 0 : 1);
        widgetZoomOut.visible = !hasOverlay;
        widgetZoomOut.setTexVIndex(zoomPower > -3 ? 0 : 1);
        widgetFullScreen.visible = !hasOverlay;
        widgetSepia.visible = !hasOverlay;
        widgetLabels.visible = !hasOverlay;
        widgetShareCWP.visible = !hasOverlay && isMiddleEarth() && selectedWaypoint instanceof LOTRCustomWaypoint && !((LOTRCustomWaypoint) selectedWaypoint).isShared();
        widgetHideSWP.visible = !hasOverlay && isMiddleEarth() && selectedWaypoint instanceof LOTRCustomWaypoint && ((LOTRCustomWaypoint) selectedWaypoint).isShared() && !((LOTRCustomWaypoint) selectedWaypoint).isSharedHidden();
        widgetUnhideSWP.visible = !hasOverlay && isMiddleEarth() && selectedWaypoint instanceof LOTRCustomWaypoint && ((LOTRCustomWaypoint) selectedWaypoint).isShared() && ((LOTRCustomWaypoint) selectedWaypoint).isSharedHidden();
        LOTRGuiMapWidget mouseOverWidget = null;
        for (LOTRGuiMapWidget widget : mapWidgets) {
            if (!widget.visible) {
                continue;
            }
            mc.getTextureManager().bindTexture(mapIconsTexture);
            GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
            drawTexturedModalRect(mapXMin + widget.getMapXPos(mapWidth), mapYMin + widget.getMapYPos(mapHeight), widget.getTexU(), widget.getTexV(), widget.width, widget.width);
            if (!widget.isMouseOver(mouseX - mapXMin, mouseY - mapYMin, mapWidth, mapHeight)) {
                continue;
            }
            mouseOverWidget = widget;
        }
        if (mouseOverWidget != null) {
            float z = zLevel;
            int stringWidth = 200;
            List desc = fontRendererObj.listFormattedStringToWidth(mouseOverWidget.getTranslatedName(), stringWidth);
            func_146283_a(desc, mouseX, mouseY);
            GL11.glDisable((int) 2896);
            GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
            zLevel = z;
        }
    }

    private boolean canCreateWaypointAtPosition() {
        int minY = LOTRConfig.getCustomWaypointMinY((World) mc.theWorld);
        return minY < 0 || mc.thePlayer.boundingBox.minY >= (double) minY;
    }

    private void renderFullscreenSubtitles(String... lines) {
        int strX = mapXMin + mapWidth / 2;
        int strY = mapYMax + 7;
        if (isConquestGrid) {
            strY = mapYMax + 26;
        }
        int border = fontRendererObj.FONT_HEIGHT + 3;
        if (lines.length == 1) {
            strY += border / 2;
        }
        for (String s : lines) {
            drawCenteredString(s, strX, strY, 16777215);
            strY += border;
        }
    }

    private void renderPlayers(int mouseX, int mouseY) {
        String mouseOverPlayerName = null;
        double mouseOverPlayerX = 0.0;
        double mouseOverPlayerY = 0.0;
        double distanceMouseOverPlayer = Double.MAX_VALUE;
        int iconWidthHalf = 4;
        HashMap<UUID, PlayerLocationInfo> playersToRender = new HashMap<UUID, PlayerLocationInfo>();
        playersToRender.putAll(playerLocations);
        if (isMiddleEarth()) {
            playersToRender.put(mc.thePlayer.getUniqueID(), new PlayerLocationInfo(mc.thePlayer.getGameProfile(), mc.thePlayer.posX, mc.thePlayer.posZ));
        }
        for (Map.Entry entry : playersToRender.entrySet()) {
            int playerY;
            int playerX;
            double playerPosX;
            float[] pos;
            double playerPosZ;
            UUID player = (UUID) entry.getKey();
            PlayerLocationInfo info = (PlayerLocationInfo) entry.getValue();
            GameProfile profile = info.profile;
            String playerName = profile.getName();
            double distToPlayer = renderPlayerIcon(profile, playerName, playerX = Math.round((pos = transformCoords(playerPosX = info.posX, playerPosZ = info.posZ))[0]), playerY = Math.round(pos[1]), mouseX, mouseY);
            if (!(distToPlayer <= (double) (iconWidthHalf + 3)) || !(distToPlayer <= distanceMouseOverPlayer)) {
                continue;
            }
            mouseOverPlayerName = playerName;
            mouseOverPlayerX = playerX;
            mouseOverPlayerY = playerY;
            distanceMouseOverPlayer = distToPlayer;
        }
        if (mouseOverPlayerName != null && !hasOverlay && !loadingConquestGrid) {
            int strWidth = mc.fontRenderer.getStringWidth(mouseOverPlayerName);
            int strHeight = mc.fontRenderer.FONT_HEIGHT;
            int rectX = (int) Math.round(mouseOverPlayerX);
            int rectY = (int) Math.round(mouseOverPlayerY);
            rectY += iconWidthHalf + 3;
            int border = 3;
            int rectWidth = strWidth + border * 2;
            rectX -= rectWidth / 2;
            int rectHeight = strHeight + border * 2;
            int mapBorder2 = 2;
            rectX = Math.max(rectX, mapXMin + mapBorder2);
            rectX = Math.min(rectX, mapXMax - mapBorder2 - rectWidth);
            rectY = Math.max(rectY, mapYMin + mapBorder2);
            rectY = Math.min(rectY, mapYMax - mapBorder2 - rectHeight);
            GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) 300.0f);
            drawFancyRect(rectX, rectY, rectX + rectWidth, rectY + rectHeight);
            mc.fontRenderer.drawString(mouseOverPlayerName, rectX + border, rectY + border, 16777215);
            GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) -300.0f);
        }
    }

    private double renderPlayerIcon(GameProfile profile, String playerName, double playerX, double playerY, int mouseX, int mouseY) {
        Tessellator tessellator = Tessellator.instance;
        int iconWidthHalf = 4;
        int iconBorder = iconWidthHalf + 1;
        playerX = Math.max((double) (mapXMin + iconBorder), playerX);
        playerX = Math.min((double) (mapXMax - iconBorder - 1), playerX);
        playerY = Math.max((double) (mapYMin + iconBorder), playerY);
        playerY = Math.min((double) (mapYMax - iconBorder - 1), playerY);
        GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
        ResourceLocation skin = AbstractClientPlayer.locationStevePng;
        if (profile.getId().equals(mc.thePlayer.getUniqueID())) {
            skin = mc.thePlayer.getLocationSkin();
        } else {
            MinecraftProfileTexture.Type type;
            Map map = mc.func_152342_ad().func_152788_a(profile);
            if (map.containsKey((Object) (type = MinecraftProfileTexture.Type.SKIN))) {
                skin = mc.func_152342_ad().func_152792_a((MinecraftProfileTexture) map.get((Object) type), type);
            }
        }
        mc.getTextureManager().bindTexture(skin);
        double iconMinU = 0.125;
        double iconMaxU = 0.25;
        double iconMinV = 0.25;
        double iconMaxV = 0.5;
        double playerX_d = playerX + 0.5;
        double playerY_d = playerY + 0.5;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(playerX_d - (double) iconWidthHalf, playerY_d + (double) iconWidthHalf, (double) zLevel, iconMinU, iconMaxV);
        tessellator.addVertexWithUV(playerX_d + (double) iconWidthHalf, playerY_d + (double) iconWidthHalf, (double) zLevel, iconMaxU, iconMaxV);
        tessellator.addVertexWithUV(playerX_d + (double) iconWidthHalf, playerY_d - (double) iconWidthHalf, (double) zLevel, iconMaxU, iconMinV);
        tessellator.addVertexWithUV(playerX_d - (double) iconWidthHalf, playerY_d - (double) iconWidthHalf, (double) zLevel, iconMinU, iconMinV);
        tessellator.draw();
        iconMinU = 0.625;
        iconMaxU = 0.75;
        iconMinV = 0.25;
        iconMaxV = 0.5;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(playerX_d - (double) iconWidthHalf - 0.5, playerY_d + (double) iconWidthHalf + 0.5, (double) zLevel, iconMinU, iconMaxV);
        tessellator.addVertexWithUV(playerX_d + (double) iconWidthHalf + 0.5, playerY_d + (double) iconWidthHalf + 0.5, (double) zLevel, iconMaxU, iconMaxV);
        tessellator.addVertexWithUV(playerX_d + (double) iconWidthHalf + 0.5, playerY_d - (double) iconWidthHalf - 0.5, (double) zLevel, iconMaxU, iconMinV);
        tessellator.addVertexWithUV(playerX_d - (double) iconWidthHalf - 0.5, playerY_d - (double) iconWidthHalf - 0.5, (double) zLevel, iconMinU, iconMinV);
        tessellator.draw();
        double dx = playerX - (double) mouseX;
        double dy = playerY - (double) mouseY;
        double distToPlayer = Math.sqrt(dx * dx + dy * dy);
        return distToPlayer;
    }

    private void renderMiniQuests(EntityPlayer entityplayer, int mouseX, int mouseY) {
        if (hasOverlay) {
            return;
        }
        LOTRMiniQuest mouseOverQuest = null;
        int mouseOverQuestX = 0;
        int mouseOverQuestY = 0;
        double distanceMouseOverQuest = Double.MAX_VALUE;
        List<LOTRMiniQuest> quests = LOTRLevelData.getData(entityplayer).getActiveMiniQuests();
        for (LOTRMiniQuest quest : quests) {
            ChunkCoordinates location = quest.getLastLocation();
            if (location == null) {
                continue;
            }
            float[] pos = transformCoords(location.posX, location.posZ);
            int questX = Math.round(pos[0]);
            int questY = Math.round(pos[1]);
            float scale = 0.5f;
            float invScale = 1.0f / scale;
            IIcon icon = questBookIcon.getIconIndex();
            int iconWidthHalf = icon.getIconWidth() / 2;
            iconWidthHalf = (int) ((float) iconWidthHalf * scale);
            int iconBorder = iconWidthHalf + 1;
            questX = Math.max(mapXMin + iconBorder, questX);
            questX = Math.min(mapXMax - iconBorder - 1, questX);
            questY = Math.max(mapYMin + iconBorder, questY);
            questY = Math.min(mapYMax - iconBorder - 1, questY);
            int iconX = Math.round((float) questX * invScale);
            int iconY = Math.round((float) questY * invScale);
            GL11.glScalef((float) scale, (float) scale, (float) scale);
            GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
            GL11.glEnable((int) 2896);
            GL11.glEnable((int) 2884);
            renderItem.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.getTextureManager(), questBookIcon, iconX -= iconWidthHalf, iconY -= iconWidthHalf);
            GL11.glDisable((int) 2896);
            GL11.glEnable((int) 3008);
            GL11.glScalef((float) invScale, (float) invScale, (float) invScale);
            double dx = questX - mouseX;
            double dy = questY - mouseY;
            double distToQuest = Math.sqrt(dx * dx + dy * dy);
            if (!(distToQuest <= (double) (iconWidthHalf + 3)) || !(distToQuest <= distanceMouseOverQuest)) {
                continue;
            }
            mouseOverQuest = quest;
            mouseOverQuestX = questX;
            mouseOverQuestY = questY;
            distanceMouseOverQuest = distToQuest;
        }
        if (mouseOverQuest != null && !hasOverlay) {
            String name = mouseOverQuest.entityName;
            int stringWidth = mc.fontRenderer.getStringWidth(name);
            int stringHeight = mc.fontRenderer.FONT_HEIGHT;
            int x = mouseOverQuestX;
            int y = mouseOverQuestY;
            y += 7;
            int border = 3;
            int rectWidth = stringWidth + border * 2;
            x -= rectWidth / 2;
            int rectHeight = stringHeight + border * 2;
            int mapBorder2 = 2;
            x = Math.max(x, mapXMin + mapBorder2);
            x = Math.min(x, mapXMax - mapBorder2 - rectWidth);
            y = Math.max(y, mapYMin + mapBorder2);
            y = Math.min(y, mapYMax - mapBorder2 - rectHeight);
            GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) 300.0f);
            drawFancyRect(x, y, x + rectWidth, y + rectHeight);
            mc.fontRenderer.drawString(name, x + border, y + border, 16777215);
            GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) -300.0f);
        }
    }

    private void renderControlZone(int mouseX, int mouseY) {
        List<LOTRControlZone> controlZones;
        mouseControlZone = false;
        mouseControlZoneReduced = false;
        LOTRFaction faction = controlZoneFaction;
        if (faction.factionDimension == LOTRDimension.MIDDLE_EARTH && !(controlZones = faction.getControlZones()).isEmpty()) {
            Tessellator tessellator = Tessellator.instance;
            setupMapClipping();
            GL11.glDisable((int) 3553);
            for (int pass = 0; pass <= 2; ++pass) {
                int color = 16711680;
                if (pass == 1) {
                    color = 5570560;
                }
                if (pass == 0) {
                    color = 16733525;
                }
                for (LOTRControlZone zone : controlZones) {
                    float[] trans;
                    float rScaled;
                    float dy;
                    float dx;
                    float radius = zone.radius;
                    if (pass == 2) {
                        radius -= 1.0f;
                    }
                    if (pass == 0) {
                        radius = zone.radius + controlZoneFaction.getControlZoneReducedRange();
                    }
                    float radiusWorld = LOTRWaypoint.mapToWorldR(radius);
                    tessellator.startDrawing(9);
                    tessellator.setColorOpaque_I(color);
                    int sides = 100;
                    for (int l = sides - 1; l >= 0; --l) {
                        float angle = (float) l / (float) sides * 2.0f * 3.1415927f;
                        double x = zone.xCoord;
                        double z = zone.zCoord;
                        float[] trans2 = transformCoords(x += (double) (MathHelper.cos((float) angle) * radiusWorld), z += (double) (MathHelper.sin((float) angle) * radiusWorld));
                        tessellator.addVertex((double) trans2[0], (double) trans2[1], (double) zLevel);
                    }
                    tessellator.draw();
                    if (mouseControlZone && mouseControlZoneReduced || !((dx = (float) mouseX - (trans = transformCoords(zone.xCoord, zone.zCoord))[0]) * dx + (dy = (float) mouseY - trans[1]) * dy <= (rScaled = radius * zoomScale) * rScaled)) {
                        continue;
                    }
                    if (pass >= 1) {
                        mouseControlZone = true;
                        continue;
                    }
                    if (pass != 0) {
                        continue;
                    }
                    mouseControlZoneReduced = true;
                }
            }
            GL11.glEnable((int) 3553);
            endMapClipping();
        }
    }

    private void renderRoads() {
        if (!showWP && !showCWP || !LOTRFixedStructures.hasMapFeatures((World) mc.theWorld)) {
            return;
        }
        renderRoads(hasMapLabels());
    }

    public void renderRoads(boolean labels) {
        float roadZoomlerp = (zoomExp - -3.3f) / 2.2f;
        roadZoomlerp = Math.min(roadZoomlerp, 1.0f);
        if (!enableZoomOutWPFading) {
            roadZoomlerp = 1.0f;
        }
        if (roadZoomlerp > 0.0f) {
            Iterator<LOTRRoads> roadIterator = LOTRRoads.getAllRoadsForDisplay();
            while (roadIterator.hasNext()) {
                LOTRRoads road = roadIterator.next();
                int interval = Math.round(400.0f / zoomScaleStable);
                interval = Math.max(interval, 1);
                for (int i = 0; i < road.roadPoints.length; i += interval) {
                    int clip;
                    LOTRRoads.RoadPoint point = road.roadPoints[i];
                    float[] pos = transformCoords(point.x, point.z);
                    float x = pos[0];
                    float y = pos[1];
                    if (x >= (float) mapXMin && x < (float) mapXMax && y >= (float) mapYMin && y < (float) mapYMax) {
                        double roadWidth = 1.0;
                        int roadColor = 0;
                        float roadAlpha = roadZoomlerp;
                        if (isOSRS()) {
                            roadWidth = 3.0 * (double) zoomScale;
                            roadColor = 6575407;
                            roadAlpha = 1.0f;
                        }
                        double roadWidthLess1 = roadWidth - 1.0;
                        GL11.glDisable((int) 3553);
                        GL11.glEnable((int) 3042);
                        GL11.glBlendFunc((int) 770, (int) 771);
                        Tessellator tessellator = Tessellator.instance;
                        tessellator.startDrawingQuads();
                        tessellator.setColorRGBA_I(roadColor, (int) (roadAlpha * 255.0f));
                        tessellator.addVertex((double) x - roadWidthLess1, (double) y + roadWidth, (double) zLevel);
                        tessellator.addVertex((double) x + roadWidth, (double) y + roadWidth, (double) zLevel);
                        tessellator.addVertex((double) x + roadWidth, (double) y - roadWidthLess1, (double) zLevel);
                        tessellator.addVertex((double) x - roadWidthLess1, (double) y - roadWidthLess1, (double) zLevel);
                        tessellator.draw();
                        GL11.glDisable((int) 3042);
                        GL11.glEnable((int) 3553);
                    }
                    if (!labels || !(x >= (float) (mapXMin - (clip = 200))) || !(x <= (float) (mapXMax + clip)) || !(y >= (float) (mapYMin - clip)) || !(y <= (float) (mapYMax + clip))) {
                        continue;
                    }
                    float zoomlerp = (zoomExp - -1.0f) / 4.0f;
                    float scale = zoomlerp = Math.min(zoomlerp, 1.0f);
                    String name = road.getDisplayName();
                    int nameWidth = fontRendererObj.getStringWidth(name);
                    int nameInterval = (int) ((float) (nameWidth * 2 + 100) * 200.0f / zoomScaleStable);
                    if (i % nameInterval >= interval) {
                        continue;
                    }
                    boolean endNear = false;
                    double dMax = ((double) nameWidth / 2.0 + 25.0) * (double) scale;
                    double dMaxSq = dMax * dMax;
                    for (LOTRRoads.RoadPoint end : road.endpoints) {
                        float endY;
                        float dy;
                        float[] endPos = transformCoords(end.x, end.z);
                        float endX = endPos[0];
                        float dx = x - endX;
                        double dSq = dx * dx + (dy = y - (endY = endPos[1])) * dy;
                        if (!(dSq < dMaxSq)) {
                            continue;
                        }
                        endNear = true;
                    }
                    if (endNear || !(zoomlerp > 0.0f)) {
                        continue;
                    }
                    setupMapClipping();
                    GL11.glPushMatrix();
                    GL11.glTranslatef((float) x, (float) y, (float) 0.0f);
                    GL11.glScalef((float) scale, (float) scale, (float) scale);
                    LOTRRoads.RoadPoint nextPoint = road.roadPoints[Math.min(i + 1, road.roadPoints.length - 1)];
                    LOTRRoads.RoadPoint prevPoint = road.roadPoints[Math.max(i - 1, 0)];
                    double grad = (nextPoint.z - prevPoint.z) / (nextPoint.x - prevPoint.x);
                    float angle = (float) Math.atan(grad);
                    angle = (float) Math.toDegrees(angle);
                    if (Math.abs(angle) > 90.0f) {
                        angle += 180.0f;
                    }
                    GL11.glRotatef((float) angle, (float) 0.0f, (float) 0.0f, (float) 1.0f);
                    float alpha = zoomlerp;
                    int alphaI = LOTRClientProxy.getAlphaInt(alpha *= 0.8f);
                    GL11.glEnable((int) 3042);
                    GL11.glBlendFunc((int) 770, (int) 771);
                    int strX = -nameWidth / 2;
                    int strY = -15;
                    fontRendererObj.drawString(name, strX + 1, strY + 1, 0 + (alphaI << 24));
                    fontRendererObj.drawString(name, strX, strY, 16777215 + (alphaI << 24));
                    GL11.glDisable((int) 3042);
                    GL11.glPopMatrix();
                    endMapClipping();
                }
            }
        }
    }

    private boolean isWaypointVisible(LOTRAbstractWaypoint wp) {
        if (wp instanceof LOTRCustomWaypoint) {
            LOTRCustomWaypoint cwp = (LOTRCustomWaypoint) wp;
            if (cwp.isShared() && cwp.isSharedHidden() && !showHiddenSWP) {
                return false;
            }
            return showCWP;
        }
        return showWP;
    }

    private void renderWaypoints(int pass, int mouseX, int mouseY) {
        if (!showWP && !showCWP && !showHiddenSWP || !LOTRFixedStructures.hasMapFeatures((World) mc.theWorld)) {
            return;
        }
        renderWaypoints(LOTRLevelData.getData((EntityPlayer) mc.thePlayer).getAllAvailableWaypoints(), pass, mouseX, mouseY, hasMapLabels(), false);
    }

    public void renderWaypoints(List<LOTRAbstractWaypoint> waypoints, int pass, int mouseX, int mouseY, boolean labels, boolean overrideToggles) {
        setupMapClipping();
        LOTRAbstractWaypoint mouseOverWP = null;
        double distanceMouseOverWP = Double.MAX_VALUE;
        float wpZoomlerp = (zoomExp - -3.3f) / 2.2f;
        wpZoomlerp = Math.min(wpZoomlerp, 1.0f);
        if (!enableZoomOutWPFading) {
            wpZoomlerp = 1.0f;
        }
        if (wpZoomlerp > 0.0f) {
            for (LOTRAbstractWaypoint waypoint : waypoints) {
                boolean shared;
                double dy;
                double distToWP;
                double dx;
                boolean unlocked = mc.thePlayer != null && mc.thePlayer.worldObj != null && waypoint.hasPlayerUnlocked((EntityPlayer) mc.thePlayer);
                boolean hidden = waypoint.isHidden();
                boolean custom = waypoint instanceof LOTRCustomWaypoint;
                boolean bl = shared = waypoint instanceof LOTRCustomWaypoint && ((LOTRCustomWaypoint) waypoint).isShared();
                if (!isWaypointVisible(waypoint) && !overrideToggles || hidden && !unlocked) {
                    continue;
                }
                float[] pos = transformCoords(waypoint.getXCoord(), waypoint.getZCoord());
                float x = pos[0];
                float y = pos[1];
                int clip = 200;
                if (!(x >= (float) (mapXMin - clip)) || !(x <= (float) (mapXMax + clip)) || !(y >= (float) (mapYMin - clip)) || !(y <= (float) (mapYMax + clip))) {
                    continue;
                }
                if (pass == 0) {
                    float wpAlpha = wpZoomlerp;
                    GL11.glEnable((int) 3042);
                    GL11.glBlendFunc((int) 770, (int) 771);
                    if (isOSRS()) {
                        float osScale = 0.33f;
                        GL11.glPushMatrix();
                        GL11.glScalef((float) 0.33f, (float) 0.33f, (float) 1.0f);
                        mc.getTextureManager().bindTexture(LOTRTextures.osrsTexture);
                        GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
                        drawTexturedModalRectFloat(x / 0.33f - 8.0f, y / 0.33f - 8.0f, 0, 0, 15.0f, 15.0f);
                        GL11.glPopMatrix();
                    } else {
                        LOTRAbstractWaypoint.WaypointLockState state = mc.thePlayer != null ? waypoint.getLockState((EntityPlayer) mc.thePlayer) : LOTRAbstractWaypoint.WaypointLockState.STANDARD_UNLOCKED;
                        mc.getTextureManager().bindTexture(mapIconsTexture);
                        GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) wpAlpha);
                        drawTexturedModalRectFloat(x - 2.0f, y - 2.0f, state.iconU, state.iconV, 4.0f, 4.0f);
                    }
                    GL11.glDisable((int) 3042);
                    if (labels) {
                        float zoomlerp = (zoomExp - -1.0f) / 4.0f;
                        if ((zoomlerp = Math.min(zoomlerp, 1.0f)) > 0.0f) {
                            GL11.glPushMatrix();
                            GL11.glTranslatef((float) x, (float) y, (float) 0.0f);
                            float scale = zoomlerp;
                            GL11.glScalef((float) scale, (float) scale, (float) scale);
                            float alpha = zoomlerp;
                            int alphaI = (int) ((alpha *= 0.8f) * 255.0f);
                            alphaI = MathHelper.clamp_int((int) alphaI, (int) 4, (int) 255);
                            GL11.glEnable((int) 3042);
                            GL11.glBlendFunc((int) 770, (int) 771);
                            String s = waypoint.getDisplayName();
                            int strX = -fontRendererObj.getStringWidth(s) / 2;
                            int strY = -15;
                            fontRendererObj.drawString(s, strX + 1, strY + 1, 0 + (alphaI << 24));
                            fontRendererObj.drawString(s, strX, strY, 16777215 + (alphaI << 24));
                            GL11.glDisable((int) 3042);
                            GL11.glPopMatrix();
                        }
                    }
                }
                if (pass != 1 || waypoint == selectedWaypoint || !(x >= (float) (mapXMin - 2)) || !(x <= (float) (mapXMax + 2)) || !(y >= (float) (mapYMin - 2)) || !(y <= (float) (mapYMax + 2)) || !((distToWP = Math.sqrt((dx = (double) (x - (float) mouseX)) * dx + (dy = (double) (y - (float) mouseY)) * dy)) <= 5.0) || !(distToWP <= distanceMouseOverWP)) {
                    continue;
                }
                mouseOverWP = waypoint;
                distanceMouseOverWP = distToWP;
            }
        }
        if (pass == 1 && mouseOverWP != null && !hasOverlay && !loadingConquestGrid) {
            renderWaypointTooltip(mouseOverWP, false, mouseX, mouseY);
        }
        endMapClipping();
    }

    private void renderWaypointTooltip(LOTRAbstractWaypoint waypoint, boolean selected, int mouseX, int mouseY) {
        String name = waypoint.getDisplayName();
        int wpX = waypoint.getXCoord();
        int wpZ = waypoint.getZCoord();
        int wpY = waypoint.getYCoordSaved();
        String coords = wpY >= 0 ? StatCollector.translateToLocalFormatted((String) "lotr.gui.map.coordsY", (Object[]) new Object[]{wpX, wpY, wpZ}) : StatCollector.translateToLocalFormatted((String) "lotr.gui.map.coords", (Object[]) new Object[]{wpX, wpZ});
        String loreText = waypoint.getLoreText((EntityPlayer) mc.thePlayer);
        float guiScale = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight).getScaleFactor();
        float loreScale = guiScale - 1.0f;
        if (guiScale <= 2.0f) {
            loreScale = guiScale;
        }
        float loreScaleRel = loreScale / guiScale;
        float loreScaleRelInv = 1.0f / loreScaleRel;
        int loreFontHeight = MathHelper.ceiling_double_int((double) ((float) fontRendererObj.FONT_HEIGHT * loreScaleRel));
        float[] pos = transformCoords(wpX, wpZ);
        int rectX = Math.round(pos[0]);
        int rectY = Math.round(pos[1]);
        rectY += 5;
        int border = 3;
        int stringHeight = fontRendererObj.FONT_HEIGHT;
        int innerRectWidth = fontRendererObj.getStringWidth(name);
        if (selected) {
            innerRectWidth = Math.max(innerRectWidth, fontRendererObj.getStringWidth(coords));
            if (loreText != null) {
                innerRectWidth += 50;
                innerRectWidth = Math.round((float) innerRectWidth * (loreScaleRel / 0.66667f));
            }
        }
        int rectWidth = innerRectWidth + border * 2;
        rectX -= rectWidth / 2;
        int rectHeight = border * 2 + stringHeight;
        if (selected) {
            rectHeight += border + stringHeight;
            if (loreText != null) {
                rectHeight += border;
                rectHeight += fontRendererObj.listFormattedStringToWidth(loreText, (int) ((float) innerRectWidth * loreScaleRelInv)).size() * loreFontHeight;
                rectHeight += border;
            }
        }
        int mapBorder2 = 2;
        rectX = Math.max(rectX, mapXMin + mapBorder2);
        rectX = Math.min(rectX, mapXMax - mapBorder2 - rectWidth);
        rectY = Math.max(rectY, mapYMin + mapBorder2);
        rectY = Math.min(rectY, mapYMax - mapBorder2 - rectHeight);
        int stringX = rectX + rectWidth / 2;
        int stringY = rectY + border;
        GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) 300.0f);
        drawFancyRect(rectX, rectY, rectX + rectWidth, rectY + rectHeight);
        drawCenteredString(name, stringX, stringY, 16777215);
        stringY += fontRendererObj.FONT_HEIGHT + border;
        if (selected) {
            drawCenteredString(coords, stringX, stringY, 16777215);
            stringY += fontRendererObj.FONT_HEIGHT + border * 2;
            if (loreText != null) {
                GL11.glPushMatrix();
                GL11.glScalef((float) loreScaleRel, (float) loreScaleRel, (float) 1.0f);
                List loreLines = fontRendererObj.listFormattedStringToWidth(loreText, (int) ((float) innerRectWidth * loreScaleRelInv));
                for (int l = 0; l < loreLines.size(); ++l) {
                    String line = (String) loreLines.get(l);
                    drawCenteredString(line, (int) ((float) stringX * loreScaleRelInv), (int) ((float) stringY * loreScaleRelInv), 16777215);
                    stringY += loreFontHeight;
                }
                GL11.glPopMatrix();
            }
        }
        GL11.glTranslatef((float) 0.0f, (float) 0.0f, (float) -300.0f);
    }

    private void renderLabels() {
        LOTRMapLabels[] allLabels;
        if (!hasMapLabels()) {
            return;
        }
        setupMapClipping();
        for (LOTRMapLabels label : allLabels = LOTRMapLabels.allMapLabels()) {
            float[] pos = transformMapCoords(label.posX, label.posY);
            float x = pos[0];
            float y = pos[1];
            float zoomlerp = (zoomExp - label.minZoom) / (label.maxZoom - label.minZoom);
            if (!(zoomlerp > 0.0f) || !(zoomlerp < 1.0f)) {
                continue;
            }
            float alpha = (0.5f - Math.abs(zoomlerp - 0.5f)) / 0.5f;
            alpha *= 0.7f;
            if (isOSRS()) {
                if (alpha < 0.3f) {
                    continue;
                }
                alpha = 1.0f;
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float) x, (float) y, (float) 0.0f);
            float scale = zoomScale * label.scale;
            GL11.glScalef((float) scale, (float) scale, (float) scale);
            if (!isOSRS()) {
                GL11.glRotatef((float) label.angle, (float) 0.0f, (float) 0.0f, (float) 1.0f);
            }
            int alphaI = (int) (alpha * 255.0f);
            alphaI = MathHelper.clamp_int((int) alphaI, (int) 4, (int) 255);
            GL11.glEnable((int) 3042);
            GL11.glBlendFunc((int) 770, (int) 771);
            float alphaFunc = GL11.glGetFloat((int) 3010);
            GL11.glAlphaFunc((int) 516, (float) 0.01f);
            String s = label.getDisplayName();
            int strX = -fontRendererObj.getStringWidth(s) / 2;
            int strY = -fontRendererObj.FONT_HEIGHT / 2;
            if (isOSRS()) {
                if (label.scale > 2.5f) {
                    fontRendererObj.drawString(s, strX + 1, strY + 1, 0 + (alphaI << 24));
                    fontRendererObj.drawString(s, strX, strY, 16755200 + (alphaI << 24));
                } else {
                    fontRendererObj.drawString(s, strX + 1, strY + 1, 0 + (alphaI << 24));
                    fontRendererObj.drawString(s, strX, strY, 16777215 + (alphaI << 24));
                }
            } else {
                fontRendererObj.drawString(s, strX, strY, 16777215 + (alphaI << 24));
            }
            GL11.glAlphaFunc((int) 516, (float) alphaFunc);
            GL11.glDisable((int) 3042);
            GL11.glPopMatrix();
        }
        endMapClipping();
    }

    private void setupMapClipping() {
        ScaledResolution sr = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
        int scale = sr.getScaleFactor();
        GL11.glEnable((int) 3089);
        GL11.glScissor((int) (mapXMin * scale), (int) ((height - mapYMax) * scale), (int) (mapWidth * scale), (int) (mapHeight * scale));
    }

    private void endMapClipping() {
        GL11.glDisable((int) 3089);
    }

    private float[] transformCoords(float x, float z) {
        x = x / (float) LOTRGenLayerWorld.scale + 810.0f;
        z = z / (float) LOTRGenLayerWorld.scale + 730.0f;
        return transformMapCoords(x, z);
    }

    private float[] transformCoords(double x, double z) {
        return transformCoords((float) x, (float) z);
    }

    private float[] transformMapCoords(float x, float z) {
        x -= posX;
        z -= posY;
        x *= zoomScale;
        z *= zoomScale;
        return new float[]{x += (float) (mapXMin + mapWidth / 2), z += (float) (mapYMin + mapHeight / 2)};
    }

    private void drawFancyRect(int x1, int y1, int x2, int y2) {
        drawRect((int) x1, (int) y1, (int) x2, (int) y2, (int) -1073741824);
        drawHorizontalLine(x1 - 1, x2, y1 - 1, -6156032);
        drawHorizontalLine(x1 - 1, x2, y2, -6156032);
        drawVerticalLine(x1 - 1, y1 - 1, y2, -6156032);
        drawVerticalLine(x2, y1 - 1, y2, -6156032);
    }

    private boolean isValidWaypointName(String name) {
        return !StringUtils.isBlank((CharSequence) name);
    }

    private LOTRFellowshipClient getFellowshipByName(String name) {
        String fsName = StringUtils.strip((String) name);
        return LOTRLevelData.getData((EntityPlayer) mc.thePlayer).getClientFellowshipByName(fsName);
    }

    private boolean isExistingFellowshipName(String name) {
        LOTRFellowshipClient fs = getFellowshipByName(name);
        return fs != null;
    }

    private boolean isExistingUnsharedFellowshipName(String name, LOTRCustomWaypoint waypoint) {
        LOTRFellowshipClient fs = getFellowshipByName(name);
        return fs != null && !waypoint.hasSharedFellowship(fs.getFellowshipID());
    }

    private boolean isFellowshipAlreadyShared(String name, LOTRCustomWaypoint waypoint) {
        return isExistingFellowshipName(name) && !isExistingUnsharedFellowshipName(name, waypoint);
    }

    @Override
    protected void keyTyped(char c, int i) {
        if (hasOverlay) {
            if (creatingWaypointNew && nameWPTextField.textboxKeyTyped(c, i)) {
                return;
            }
            if (renamingWaypoint && nameWPTextField.textboxKeyTyped(c, i)) {
                return;
            }
            if (sharingWaypointNew && nameWPTextField.textboxKeyTyped(c, i)) {
                return;
            }
            if (i == 1 || i == mc.gameSettings.keyBindInventory.getKeyCode()) {
                if (creatingWaypointNew) {
                    openOverlayCreate();
                } else if (sharingWaypointNew) {
                    openOverlayShare();
                } else {
                    closeOverlay();
                }
                return;
            }
        } else {
            if (!loadingConquestGrid) {
                LOTRPlayerData pd = LOTRLevelData.getData((EntityPlayer) mc.thePlayer);
                if (i == LOTRKeyHandler.keyBindingFastTravel.getKeyCode() && isMiddleEarth() && selectedWaypoint != null && selectedWaypoint.hasPlayerUnlocked((EntityPlayer) mc.thePlayer) && pd.getTimeSinceFT() >= pd.getWaypointFTTime(selectedWaypoint, (EntityPlayer) mc.thePlayer)) {
                    LOTRPacketFastTravel packet = new LOTRPacketFastTravel(selectedWaypoint);
                    LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
                    mc.thePlayer.closeScreen();
                    return;
                }
                if (selectedWaypoint == null && i == LOTRKeyHandler.keyBindingMapTeleport.getKeyCode() && isMouseWithinMap && canTeleport()) {
                    LOTRPacketMapTp packet = new LOTRPacketMapTp(mouseXCoord, mouseZCoord);
                    LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
                    mc.thePlayer.closeScreen();
                    return;
                }
            }
            if (hasControlZones && (i == 1 || i == mc.gameSettings.keyBindInventory.getKeyCode())) {
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen) new LOTRGuiFactions());
                return;
            }
            super.keyTyped(c, i);
        }
    }

    private void closeOverlay() {
        hasOverlay = false;
        overlayLines = null;
        creatingWaypoint = false;
        creatingWaypointNew = false;
        deletingWaypoint = false;
        renamingWaypoint = false;
        sharingWaypoint = false;
        sharingWaypointNew = false;
        buttonOverlayFunction.visible = false;
        buttonOverlayFunction.enabled = false;
        nameWPTextField.setText("");
    }

    private void openOverlayCreate() {
        closeOverlay();
        hasOverlay = true;
        creatingWaypoint = true;
        int numWaypoints = LOTRLevelData.getData((EntityPlayer) mc.thePlayer).getCustomWaypoints().size();
        int maxWaypoints = LOTRLevelData.getData((EntityPlayer) mc.thePlayer).getMaxCustomWaypoints();
        int remaining = maxWaypoints - numWaypoints;
        if (remaining <= 0) {
            overlayLines = new String[]{StatCollector.translateToLocalFormatted((String) "lotr.gui.map.customWaypoint.allUsed.1", (Object[]) new Object[]{maxWaypoints}), "", StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.allUsed.2")};
        } else {
            overlayLines = new String[]{StatCollector.translateToLocalFormatted((String) "lotr.gui.map.customWaypoint.create.1", (Object[]) new Object[]{numWaypoints, maxWaypoints}), "", StatCollector.translateToLocalFormatted((String) "lotr.gui.map.customWaypoint.create.2", (Object[]) new Object[0])};
            buttonOverlayFunction.visible = true;
            buttonOverlayFunction.displayString = StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.create.button");
        }
    }

    private void openOverlayCreateNew() {
        closeOverlay();
        hasOverlay = true;
        creatingWaypointNew = true;
        overlayLines = new String[]{StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.createNew.1")};
        buttonOverlayFunction.visible = true;
        buttonOverlayFunction.displayString = StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.createNew.button");
    }

    private void openOverlayDelete() {
        closeOverlay();
        hasOverlay = true;
        deletingWaypoint = true;
        overlayLines = new String[]{StatCollector.translateToLocalFormatted((String) "lotr.gui.map.customWaypoint.delete.1", (Object[]) new Object[]{selectedWaypoint.getDisplayName()})};
        buttonOverlayFunction.visible = true;
        buttonOverlayFunction.displayString = StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.delete.button");
    }

    private void openOverlayRename() {
        closeOverlay();
        hasOverlay = true;
        renamingWaypoint = true;
        overlayLines = new String[]{StatCollector.translateToLocalFormatted((String) "lotr.gui.map.customWaypoint.rename.1", (Object[]) new Object[]{selectedWaypoint.getDisplayName()})};
        buttonOverlayFunction.visible = true;
        buttonOverlayFunction.displayString = StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.rename.button");
    }

    private void openOverlayShare() {
        closeOverlay();
        hasOverlay = true;
        sharingWaypoint = true;
        overlayLines = new String[]{StatCollector.translateToLocalFormatted((String) "lotr.gui.map.customWaypoint.share.1", (Object[]) new Object[]{selectedWaypoint.getDisplayName()})};
        buttonOverlayFunction.visible = true;
        buttonOverlayFunction.displayString = StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.share.button");
    }

    private void openOverlayShareNew() {
        closeOverlay();
        hasOverlay = true;
        sharingWaypointNew = true;
        overlayLines = new String[]{StatCollector.translateToLocalFormatted((String) "lotr.gui.map.customWaypoint.shareNew.1", (Object[]) new Object[]{selectedWaypoint.getDisplayName()})};
        buttonOverlayFunction.visible = true;
        buttonOverlayFunction.displayString = StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.shareNew.button");
    }

    protected void mouseClicked(int i, int j, int k) {
        Object packet;
        LOTRGuiMapWidget mouseWidget = null;
        for (LOTRGuiMapWidget widget : mapWidgets) {
            if (!widget.isMouseOver(i - mapXMin, j - mapYMin, mapWidth, mapHeight)) {
                continue;
            }
            mouseWidget = widget;
            break;
        }
        if (hasOverlay && (creatingWaypointNew || renamingWaypoint || sharingWaypointNew)) {
            nameWPTextField.mouseClicked(i, j, k);
        }
        if (hasOverlay && k == 0 && sharingWaypoint && mouseOverRemoveSharedFellowship != null) {
            String fsName = mouseOverRemoveSharedFellowship.getName();
            packet = new LOTRPacketShareCWP((LOTRCustomWaypoint) selectedWaypoint, fsName, false);
            LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
            return;
        }
        if (!hasOverlay && k == 0 && isMiddleEarth() && selectedWaypoint instanceof LOTRCustomWaypoint) {
            LOTRCustomWaypoint cwp = (LOTRCustomWaypoint) selectedWaypoint;
            if (!cwp.isShared()) {
                if (mouseWidget == widgetDelCWP) {
                    openOverlayDelete();
                    return;
                }
                if (mouseWidget == widgetRenameCWP) {
                    openOverlayRename();
                    return;
                }
                if (mouseWidget == widgetShareCWP) {
                    openOverlayShare();
                    return;
                }
            } else {
                if (mouseWidget == widgetHideSWP) {
                    packet = new LOTRPacketCWPSharedHide(cwp, true);
                    LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
                    selectedWaypoint = null;
                    return;
                }
                if (mouseWidget == widgetUnhideSWP) {
                    packet = new LOTRPacketCWPSharedHide(cwp, false);
                    LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
                    return;
                }
            }
        }
        if (!hasOverlay && k == 0 && isMiddleEarth() && mouseWidget == widgetAddCWP && canCreateWaypointAtPosition()) {
            openOverlayCreate();
            return;
        }
        if (!hasOverlay && k == 0) {
            if (mouseWidget == widgetToggleWPs) {
                showWP = !showWP;
                LOTRClientProxy.sendClientInfoPacket(null, null);
                return;
            }
            if (mouseWidget == widgetToggleCWPs) {
                showCWP = !showCWP;
                LOTRClientProxy.sendClientInfoPacket(null, null);
                return;
            }
            if (mouseWidget == widgetToggleHiddenSWPs) {
                showHiddenSWP = !showHiddenSWP;
                LOTRClientProxy.sendClientInfoPacket(null, null);
                return;
            }
            if (zoomTicks == 0) {
                if (mouseWidget == widgetZoomIn && zoomPower < 4) {
                    zoomIn();
                    return;
                }
                if (mouseWidget == widgetZoomOut && zoomPower > -3) {
                    zoomOut();
                    return;
                }
            }
            if (mouseWidget == widgetFullScreen) {
                fullscreen = !fullscreen;
                ScaledResolution sr = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
                setWorldAndResolution(mc, sr.getScaledWidth(), sr.getScaledHeight());
                return;
            }
            if (mouseWidget == widgetSepia) {
                LOTRConfig.toggleSepia();
                return;
            }
            if (mouseWidget == widgetLabels) {
                toggleMapLabels();
                return;
            }
        }
        if (!hasOverlay && !loadingConquestGrid && k == 0 && isMouseWithinMap) {
            selectedWaypoint = null;
            double distanceSelectedWP = Double.MAX_VALUE;
            List<LOTRAbstractWaypoint> waypoints = LOTRLevelData.getData((EntityPlayer) mc.thePlayer).getAllAvailableWaypoints();
            for (LOTRAbstractWaypoint waypoint : waypoints) {
                double distToWP;
                float y;
                float dx;
                float dy;
                float x;
                float[] pos;
                boolean unlocked = waypoint.hasPlayerUnlocked((EntityPlayer) mc.thePlayer);
                boolean hidden = waypoint.isHidden();
                if (!isWaypointVisible(waypoint) || hidden && !unlocked || !((distToWP = Math.sqrt((dx = (x = (pos = transformCoords(waypoint.getXCoord(), waypoint.getZCoord()))[0]) - (float) i) * dx + (dy = (y = pos[1]) - (float) j) * dy)) <= 5.0) || !(distToWP <= distanceSelectedWP)) {
                    continue;
                }
                selectedWaypoint = waypoint;
                distanceSelectedWP = distToWP;
            }
        }
        super.mouseClicked(i, j, k);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.enabled) {
            if (button == buttonOverlayFunction) {
                if (creatingWaypoint) {
                    openOverlayCreateNew();
                } else if (creatingWaypointNew && isValidWaypointName(nameWPTextField.getText())) {
                    String waypointName = nameWPTextField.getText();
                    LOTRPacketCreateCWP packet = new LOTRPacketCreateCWP(waypointName);
                    LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
                    closeOverlay();
                } else if (deletingWaypoint) {
                    LOTRPacketDeleteCWP packet = new LOTRPacketDeleteCWP((LOTRCustomWaypoint) selectedWaypoint);
                    LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
                    closeOverlay();
                    selectedWaypoint = null;
                } else if (renamingWaypoint && isValidWaypointName(nameWPTextField.getText())) {
                    String newName = nameWPTextField.getText();
                    LOTRPacketRenameCWP packet = new LOTRPacketRenameCWP((LOTRCustomWaypoint) selectedWaypoint, newName);
                    LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
                    closeOverlay();
                } else if (sharingWaypoint) {
                    openOverlayShareNew();
                } else if (sharingWaypointNew && isExistingUnsharedFellowshipName(nameWPTextField.getText(), (LOTRCustomWaypoint) selectedWaypoint)) {
                    String fsName = nameWPTextField.getText();
                    LOTRPacketShareCWP packet = new LOTRPacketShareCWP((LOTRCustomWaypoint) selectedWaypoint, fsName, true);
                    LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
                    openOverlayShare();
                }
            } else if (button == buttonConquestRegions) {
                List<LOTRDimension.DimensionRegion> regionList = LOTRDimension.MIDDLE_EARTH.dimensionRegions;
                if (!regionList.isEmpty()) {
                    int i = regionList.indexOf((Object) currentRegion);
                    ++i;
                    i = IntMath.mod((int) i, (int) regionList.size());
                    currentRegion = regionList.get(i);
                    updateCurrentDimensionAndFaction();
                    setCurrentScrollFromFaction();
                }
            } else {
                super.actionPerformed(button);
            }
        }
    }

    private void handleMapKeyboardMovement() {
        prevPosX += posXMove;
        prevPosY += posYMove;
        posXMove = 0.0f;
        posYMove = 0.0f;
        if (!hasOverlay) {
            float move = 12.0f / (float) Math.pow(zoomScale, 0.800000011920929);
            if (isKeyDownAndNotMouse(mc.gameSettings.keyBindLeft) || Keyboard.isKeyDown((int) 203)) {
                posXMove -= move;
            }
            if (isKeyDownAndNotMouse(mc.gameSettings.keyBindRight) || Keyboard.isKeyDown((int) 205)) {
                posXMove += move;
            }
            if (isKeyDownAndNotMouse(mc.gameSettings.keyBindForward) || Keyboard.isKeyDown((int) 200)) {
                posYMove -= move;
            }
            if (isKeyDownAndNotMouse(mc.gameSettings.keyBindBack) || Keyboard.isKeyDown((int) 208)) {
                posYMove += move;
            }
            if (posXMove != 0.0f || posYMove != 0.0f) {
                selectedWaypoint = null;
            }
        }
    }

    private boolean isKeyDownAndNotMouse(KeyBinding keybinding) {
        return keybinding.getKeyCode() >= 0 && GameSettings.isKeyDown((KeyBinding) keybinding);
    }

    public void handleMouseInput() {
        super.handleMouseInput();
        int k = Mouse.getEventDWheel();
        if (isConquestGrid && hasConquestScrollBar() && mouseInFacScroll && k != 0) {
            if (k < 0) {
                currentFactionIndex = Math.min(currentFactionIndex + 1, Math.max(0, currentFactionList.size() - 1));
            } else if (k > 0) {
                currentFactionIndex = Math.max(currentFactionIndex - 1, 0);
            }
            setCurrentScrollFromFaction();
            return;
        }
        if (!hasOverlay && zoomTicks == 0) {
            if (k < 0 && zoomPower > -3) {
                zoomOut();
                return;
            }
            if (k > 0 && zoomPower < 4) {
                zoomIn();
                return;
            }
        }
        if (hasOverlay && k != 0) {
            k = Integer.signum(k);
            if (scrollPaneWPShares.hasScrollBar && scrollPaneWPShares.mouseOver) {
                int l = displayedWPShareList.size() - displayedWPShares;
                scrollPaneWPShares.mouseWheelScroll(k, l);
                return;
            }
        }
    }

    private void zoomOut() {
        zoom(-1);
    }

    private void zoomIn() {
        zoom(1);
    }

    private void zoom(int boost) {
        prevZoomPower = zoomPower;
        zoomPower += boost;
        zoomTicks = zoomTicksMax;
        selectedWaypoint = null;
    }

    public void setCWPProtectionMessage(IChatComponent message) {
        closeOverlay();
        hasOverlay = true;
        creatingWaypoint = false;
        creatingWaypointNew = false;
        String protection = StatCollector.translateToLocalFormatted((String) "lotr.gui.map.customWaypoint.protected.1", (Object[]) new Object[]{message.getFormattedText()});
        String warning = StatCollector.translateToLocal((String) "lotr.gui.map.customWaypoint.protected.2");
        overlayLines = new String[]{protection, "", warning};
    }

    private boolean canTeleport() {
        if (!isMiddleEarth()) {
            return false;
        }
        if (loadingConquestGrid) {
            return false;
        }
        int chunkX = MathHelper.floor_double((double) mc.thePlayer.posX) >> 4;
        int chunkZ = MathHelper.floor_double((double) mc.thePlayer.posZ) >> 4;
        if (mc.theWorld.getChunkProvider().provideChunk(chunkX, chunkZ) instanceof EmptyChunk) {
            return false;
        }
        requestIsOp();
        return isPlayerOp;
    }

    private void requestIsOp() {
        if (mc.isSingleplayer()) {
            IntegratedServer server = mc.getIntegratedServer();
            isPlayerOp = server.worldServers[0].getWorldInfo().areCommandsAllowed() && server.getServerOwner().equalsIgnoreCase(mc.thePlayer.getGameProfile().getName());
        } else {
            LOTRPacketIsOpRequest packet = new LOTRPacketIsOpRequest();
            LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
        }
    }

    private boolean isMiddleEarth() {
        return mc.thePlayer.dimension == LOTRDimension.MIDDLE_EARTH.dimensionID;
    }

    private void requestConquestGridIfNeed(LOTRFaction conqFac) {
        if (!requestedFacGrids.contains((Object) conqFac) && ticksUntilRequestFac <= 0) {
            requestedFacGrids.add(conqFac);
            LOTRPacketConquestGridRequest packet = new LOTRPacketConquestGridRequest(conqFac);
            LOTRPacketHandler.networkWrapper.sendToServer((IMessage) packet);
        }
    }

    public void receiveConquestGrid(LOTRFaction conqFac, List<LOTRConquestZone> allZones) {
        if (isConquestGrid) {
            receivedFacGrids.add(conqFac);
            facConquestGrids.put(conqFac, allZones);
        }
    }

    private boolean hasConquestScrollBar() {
        return isConquestGrid && currentFactionList.size() > 1;
    }

    private void setupConquestScrollBar(int i, int j) {
        boolean isMouseDown = Mouse.isButtonDown((int) 0);
        int i1 = facScrollX;
        int j1 = facScrollY;
        int i2 = i1 + facScrollWidth;
        int j2 = j1 + facScrollHeight;
        boolean bl = mouseInFacScroll = i >= i1 && j >= j1 && i < i2 && j < j2;
        if (!wasMouseDown && isMouseDown && mouseInFacScroll) {
            isFacScrolling = true;
        }
        if (!isMouseDown) {
            isFacScrolling = false;
        }
        wasMouseDown = isMouseDown;
        if (isFacScrolling) {
            currentFacScroll = ((float) (i - i1) - (float) facScrollWidgetWidth / 2.0f) / ((float) (i2 - i1) - (float) facScrollWidgetWidth);
            currentFacScroll = MathHelper.clamp_float((float) currentFacScroll, (float) 0.0f, (float) 1.0f);
            currentFactionIndex = Math.round(currentFacScroll * (float) (currentFactionList.size() - 1));
        }
    }

    private void setCurrentScrollFromFaction() {
        currentFacScroll = (float) currentFactionIndex / (float) (currentFactionList.size() - 1);
    }

    private boolean hasMapLabels() {
        if (isConquestGrid) {
            return LOTRConfig.mapLabelsConquest;
        }
        return LOTRConfig.mapLabels;
    }

    private void toggleMapLabels() {
        if (isConquestGrid) {
            LOTRConfig.toggleMapLabelsConquest();
        } else {
            LOTRConfig.toggleMapLabels();
        }
    }

    public void setFakeMapProperties(float x, float y, float scale, float scaleExp, float scaleStable) {
        posX = x;
        posY = y;
        zoomScale = scale;
        zoomExp = scaleExp;
        zoomScaleStable = scaleStable;
    }

    private static class PlayerLocationInfo {
        public GameProfile profile;
        public double posX;
        public double posZ;

        public PlayerLocationInfo(GameProfile p, double x, double z) {
            profile = p;
            posX = x;
            posZ = z;
        }
    }

}

