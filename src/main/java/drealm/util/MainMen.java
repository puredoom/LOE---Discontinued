package drealm.util;

import lotr.client.gui.LOTRGuiButtonRedBook;
import lotr.client.gui.LOTRGuiMap;
import lotr.client.gui.LOTRGuiRendererMap;
import lotr.common.world.map.*;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.resources.*;
import net.minecraft.client.*;
import org.lwjgl.opengl.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.*;
import net.minecraftforge.client.*;
import cpw.mods.fml.common.*;
import net.minecraft.client.gui.*;
import cpw.mods.fml.client.*;
import java.util.*;

public class MainMen extends GuiMainMenu
{
    private static final ResourceLocation titleTexture;
    private static final ResourceLocation vignetteTexture;
    private static final ResourceLocation menuOverlay;
    private static final ResourceLocation buttonOverlay;
    private static final ResourceLocation[] panoramaPaths = {
    };

    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation("lotr:gui/background_image.png");

    private static final ResourceLocation MUSIC_LOCATION = new ResourceLocation("lotr:gui/sound.ogg");
    private int panoramaIndex = 0;
    private static Random rand;
    private boolean fadeIn;
    private static boolean isFirstMenu;
    private long firstRenderTime;

    public MainMen() {
        this.fadeIn = MainMen.isFirstMenu;
        MainMen.isFirstMenu = false;
        playMainMenuMusic();
    }

    private void playMainMenuMusic() {
        // Get the SoundHandler instance from Minecraft
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.getSoundHandler() != null) {
            // Create a PositionedSoundRecord with the music location
            PositionedSoundRecord music = new PositionedSoundRecord(MUSIC_LOCATION, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
            // Play the music
            mc.getSoundHandler().playSound(music);
        }
    }


    public void initGui() {
        int bigButtonWidth = 250;   // Width for Solo and Multiplayer buttons (slightly wider)
        int buttonHeight = 20;      // Height for all buttons
        int smallButtonWidth = 150; // Width for other buttons
        int spacing = 5;            // Space between buttons

        // Positioning variables
        int leftXBig = 10;
        int rightXBig = this.width - bigButtonWidth - 10;
        int leftXSmall = 10;
        int rightXSmall = this.width - smallButtonWidth - 10;
        int topY = 10;
        int bottomY = this.height - buttonHeight - 10;

        int modsY = bottomY - buttonHeight - spacing;
        int quitY = bottomY;
        int siteY = modsY + (quitY - modsY) / 2 - buttonHeight / 2;

        // Clear existing buttons
        this.buttonList.clear();

        // Add buttons with the desired positions
        // Solo Button
        this.buttonList.add(new GuiButton(1, leftXBig, topY + 75, bigButtonWidth, buttonHeight, "Solo"));

        // Multiplayer Button
        this.buttonList.add(new GuiButton(2, rightXBig, topY + 75, bigButtonWidth, buttonHeight, "Multiplayer"));

        // Realms Button
        this.buttonList.add(new GuiButton(7, leftXSmall, bottomY - buttonHeight - spacing, smallButtonWidth, buttonHeight, "Site"));

        // Mods Button
        this.buttonList.add(new GuiButton(6, leftXSmall, bottomY, smallButtonWidth, buttonHeight, "Mods"));

        // Site Button

        // Options Button
        this.buttonList.add(new GuiButton(0, rightXSmall, bottomY - buttonHeight - spacing, smallButtonWidth, buttonHeight, "Options"));

        // Quit Button
        this.buttonList.add(new GuiButton(4, rightXSmall, bottomY, smallButtonWidth, buttonHeight, "Quit"));

    }

    public void setWorldAndResolution(final Minecraft mc, final int i, final int j) {
        super.setWorldAndResolution(mc, i, j);
    }

    private void drawBackgroundImage() {
        // Bind the background texture
        mc.getTextureManager().bindTexture(BACKGROUND_TEXTURE);

        // Get screen dimensions
        int screenWidth = width;
        int screenHeight = height;

        // Draw a textured rectangle covering the entire screen
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(0, screenHeight, 0, 0, 1);
        tessellator.addVertexWithUV(screenWidth, screenHeight, 0, 1, 1);
        tessellator.addVertexWithUV(screenWidth, 0, 0, 1, 0);
        tessellator.addVertexWithUV(0, 0, 0, 0, 0);
        tessellator.draw();
    }

    public void updateScreen() {
        super.updateScreen();
        drawBackgroundImage();
    }


    public void drawScreen(final int i, final int j, final float f) {
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        drawBackgroundImage();
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        if (this.firstRenderTime == 0L && this.fadeIn) {
            this.firstRenderTime = System.currentTimeMillis();
        }
        final float fade = this.fadeIn ? ((System.currentTimeMillis() - this.firstRenderTime) / 1000.0f) : 1.0f;
        final float fadeAlpha = this.fadeIn ? MathHelper.clamp_float(fade - 1.0f, 0.0f, 1.0f) : 1.0f;
        GL11.glEnable(3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, this.fadeIn ? MathHelper.clamp_float(1.0f - fade, 0.0f, 1.0f) : 0.0f);
        final int fadeAlphaI = MathHelper.ceiling_float_int(fadeAlpha * 255.0f) << 24;
        if ((fadeAlphaI & 0xFC000000) != 0x0) {
            final Tessellator tessellator = Tessellator.instance;
            ForgeHooksClient.renderMainMenu((GuiMainMenu)this, this.fontRendererObj, this.width, this.height);
            final String field_92025_p = (String)ObfuscationReflectionHelper.getPrivateValue((Class)GuiMainMenu.class, (Object)this, new String[] { "field_92025_p" });
            final String field_146972_A = (String)ObfuscationReflectionHelper.getPrivateValue((Class)GuiMainMenu.class, (Object)this, new String[] { "field_146972_A" });
            final int field_92024_r = (int)ObfuscationReflectionHelper.getPrivateValue((Class)GuiMainMenu.class, (Object)this, new String[] { "field_92024_r" });
            final int field_92022_t = (int)ObfuscationReflectionHelper.getPrivateValue((Class)GuiMainMenu.class, (Object)this, new String[] { "field_92022_t" });
            final int field_92021_u = (int)ObfuscationReflectionHelper.getPrivateValue((Class)GuiMainMenu.class, (Object)this, new String[] { "field_92021_u" });
            final int field_92020_v = (int)ObfuscationReflectionHelper.getPrivateValue((Class)GuiMainMenu.class, (Object)this, new String[] { "field_92020_v" });
            final int field_92019_w = (int)ObfuscationReflectionHelper.getPrivateValue((Class)GuiMainMenu.class, (Object)this, new String[] { "field_92019_w" });
            this.drawString(this.fontRendererObj, "", 35, this.height * 15 / 16 + 5, -1);
            for (final Object button : this.buttonList) {
                ((GuiButton)button).drawButton(this.mc, i, j);
            }
            for (final Object label : this.labelList) {
                ((GuiLabel)label).func_146159_a(this.mc, i, j);
            }
        }
    }

    private void addButtons(final int p_73969_1_, final int p_73969_2_) {

    }

    protected void actionPerformed(final GuiButton p_146284_1_) {
        if (p_146284_1_.id == 0) {
            this.mc.displayGuiScreen((GuiScreen)new GuiOptions((GuiScreen)this, this.mc.gameSettings));
        }
        if (p_146284_1_.id == 1) {
            this.mc.displayGuiScreen((GuiScreen)new GuiSelectWorld((GuiScreen)this));
        }
        if (p_146284_1_.id == 2) {
            this.mc.displayGuiScreen((GuiScreen)new GuiMultiplayer((GuiScreen)this));
        }
        if (p_146284_1_.id == 3) {
            this.mc.shutdown();
        }
        if (p_146284_1_.id == 4) {
            this.mc.shutdown();
        }
        if (p_146284_1_.id == 5) {
            this.mc.shutdown();
        }
        if (p_146284_1_.id == 6) {
            this.mc.displayGuiScreen((GuiScreen)new GuiModList((GuiScreen)this));
        }
        if (p_146284_1_.id == 7) {
            this.mc.displayGuiScreen(new GuiConfirmOpenLink(this, "https://lordofeldar.com/", 7, true));

    }
    }

    @Override
    public void confirmClicked(boolean result, int id) {
        if (id == 7 && result) {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://lordofeldar.com/"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // Go back to the previous screen
        this.mc.displayGuiScreen(this);
    }




    static {
        titleTexture = new ResourceLocation("lotr:gui/logo.png");
        vignetteTexture = new ResourceLocation("textures/misc/vignette.png");
        menuOverlay = new ResourceLocation("lotr:gui/menu_overlay.png");
        buttonOverlay = new ResourceLocation("lotr:gui/button_overlay.png");
        MainMen.rand = new Random();
        MainMen.isFirstMenu = true;
    }
}
