package lotr.client.gui;

import lotr.client.render.LOTRRenderShield;
import lotr.common.LOTRLevelData;
import lotr.common.LOTRShields;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import lotr.client.render.LOTRRenderShield;
import lotr.common.LOTRLevelData;
import lotr.common.LOTRShields;
import lotr.common.network.LOTRPacketHandler;
import lotr.common.network.LOTRPacketSelectShield;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class LOTRGuiArmor extends LOTRGuiMenuBase {
    private static ModelBiped playerModel = new ModelBiped();
    private static int currentShieldTypeID;
    private static int currentShieldID;

    static {
        playerModel.isChild = false;
    }

    private int modelX;
    private int modelY;
    private float modelRotation;
    private float modelRotationPrev;
    private int isMouseDown;
    private int mouseX;
    private int mouseY;
    private int prevMouseX;
    private LOTRShields.ShieldType currentShieldType;
    private LOTRShields currentShield;
    private GuiButton shieldLeft;
    private GuiButton shieldRight;
    private GuiButton shieldSelect;
    private GuiButton shieldRemove;
    private GuiButton changeCategory;

    public LOTRGuiArmor() {
        modelRotationPrev = modelRotation = -140.0f;
    }

    @Override
    public void initGui() {
        super.initGui();
        modelX = guiLeft + xSize / 2;
        modelY = guiTop + 40;
        shieldLeft = new LOTRGuiButtonShieldsArrows(0, true, guiLeft + xSize / 2 - 64, guiTop + 207);
        buttonList.add(shieldLeft);
        shieldSelect = new GuiButton(1, guiLeft + xSize / 2 - 40, guiTop + 195, 80, 20, StatCollector.translateToLocal("lotr.gui.shields.select"));
        buttonList.add(shieldSelect);
        shieldRight = new LOTRGuiButtonShieldsArrows(2, false, guiLeft + xSize / 2 + 44, guiTop + 207);
        buttonList.add(shieldRight);
        shieldRemove = new GuiButton(3, guiLeft + xSize / 2 - 40, guiTop + 219, 80, 20, StatCollector.translateToLocal("lotr.gui.shields.remove"));
        buttonList.add(shieldRemove);
        changeCategory = new GuiButton(4, guiLeft + xSize / 2 - 80, guiTop + 250, 160, 20, "");
        buttonList.add(changeCategory);
        LOTRShields equippedShield = getPlayerEquippedShield();
        if (equippedShield != null) {
            currentShieldTypeID = equippedShield.getShieldType().ordinal();
            currentShieldID = equippedShield.getShieldId();
        }
        updateCurrentShield(0, 0);
    }

    private void updateCurrentShield(int shield, int type) {
        if (shield != 0) {
            currentShieldID += shield;
            currentShieldID = Math.max(currentShieldID, 0);
            currentShieldID = Math.min(currentShieldID, currentShieldType.list.size() - 1);
        }
        if (type != 0) {
            if ((currentShieldTypeID += type) > LOTRShields.ShieldType.values().length - 1) {
                currentShieldTypeID = 0;
            }
            if (currentShieldTypeID < 0) {
                currentShieldTypeID = LOTRShields.ShieldType.values().length - 1;
            }
            currentShieldID = 0;
        }
        currentShieldType = LOTRShields.ShieldType.values()[currentShieldTypeID];
        currentShield = currentShieldType.list.get(currentShieldID);
        while (!currentShield.canDisplay(mc.thePlayer)) {
            if ((shield < 0 || type != 0) && canGoLeft()) {
                updateCurrentShield(-1, 0);
                continue;
            }
            if ((shield > 0 || type != 0) && canGoRight()) {
                updateCurrentShield(1, 0);
                continue;
            }
            updateCurrentShield(0, 1);
        }
    }

    private boolean canGoLeft() {
        for (int i = 0; i <= currentShieldID - 1; ++i) {
            LOTRShields shield = currentShieldType.list.get(i);
            if (!shield.canDisplay(mc.thePlayer)) {
                continue;
            }
            return true;
        }
        return false;
    }

    private boolean canGoRight() {
        for (int i = currentShieldID + 1; i <= currentShieldType.list.size() - 1; ++i) {
            LOTRShields shield = currentShieldType.list.get(i);
            if (!shield.canDisplay(mc.thePlayer)) {
                continue;
            }
            return true;
        }
        return false;
    }

    private LOTRShields getPlayerEquippedShield() {
        return LOTRLevelData.getData(mc.thePlayer).getShield();
    }

    @Override
    public void updateScreen() {
        boolean mouseWithinModel;
        super.updateScreen();
        modelRotationPrev = modelRotation;
        modelRotationPrev = MathHelper.wrapAngleTo180_float(modelRotationPrev);
        modelRotation = MathHelper.wrapAngleTo180_float(modelRotation);
        mouseWithinModel = Math.abs(mouseX - modelX) <= 60 && Math.abs(mouseY - modelY) <= 80;
        if (Mouse.isButtonDown(0)) {
            if (isMouseDown == 0 || isMouseDown == 1) {
                if (isMouseDown == 0) {
                    if (mouseWithinModel) {
                        isMouseDown = 1;
                    }
                } else if (mouseX != prevMouseX) {
                    modelRotation += -(mouseX - prevMouseX) * 1.0f;
                }
                prevMouseX = mouseX;
            }
        } else {
            isMouseDown = 0;
        }
    }

    public void drawScreen(int i, int j, float f) {
        mouseX = i;
        mouseY = j;
        drawDefaultBackground();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        String s = StatCollector.translateToLocal("lotr.gui.shields.title");
        drawCenteredString(fontRendererObj, s, guiLeft + xSize / 2, guiTop - 30, 16777215);
        GL11.glEnable(2903);
        RenderHelper.enableStandardItemLighting();
        GL11.glPushMatrix();
        GL11.glDisable(2884);
        GL11.glEnable(32826);
        GL11.glEnable(3008);
        GL11.glTranslatef(modelX, modelY, 50.0f);
        float scale = 55.0f;
        GL11.glScalef(-scale, scale, scale);
        GL11.glRotatef(-30.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(modelRotationPrev + (modelRotation - modelRotationPrev) * f, 0.0f, 1.0f, 0.0f);
        mc.getTextureManager().bindTexture(mc.thePlayer.getLocationSkin());
        playerModel.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);

        // Render held item
        renderHeldItem();

        LOTRRenderShield.renderShield(currentShield, null, playerModel);
        GL11.glDisable(32826);
        GL11.glEnable(2884);
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(3553);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        int x = guiLeft + xSize / 2;
        int y = guiTop + 145;
        s = currentShield.getShieldName();
        drawCenteredString(fontRendererObj, s, x, y, 16777215);
        y += fontRendererObj.FONT_HEIGHT * 2;
        List desc = fontRendererObj.listFormattedStringToWidth(currentShield.getShieldDesc(), 220);
        for (int l = 0; l < desc.size(); ++l) {
            s = (String) desc.get(l);
            drawCenteredString(fontRendererObj, s, x, y, 16777215);
            y += fontRendererObj.FONT_HEIGHT;
        }
        shieldLeft.enabled = canGoLeft();
        shieldSelect.enabled = currentShield.canPlayerWear(mc.thePlayer);
        shieldSelect.displayString = getPlayerEquippedShield() == currentShield ? StatCollector.translateToLocal("lotr.gui.shields.selected") : StatCollector.translateToLocal("lotr.gui.shields.select");
        shieldRight.enabled = canGoRight();
        shieldRemove.enabled = getPlayerEquippedShield() != null && getPlayerEquippedShield() == currentShield;
        changeCategory.displayString = currentShieldType.getDisplayName();
        super.drawScreen(i, j, f);

        // Render armor on top of GUI
        renderPlayerArmor();
    }

    private void renderPlayerArmor() {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 0.0F, 100.0F); // Render armor on top of GUI elements
        GL11.glScalef(1.0F, -1.0F, -1.0F); // Scale and mirror the model to match the player's view
        GL11.glTranslatef(0.0F, 1.501F, 0.0F); // Translate the model to align with the player's position

        // Render each armor piece
        for (int k = 0; k < 4; ++k) {
            ItemStack itemstack = mc.thePlayer.inventory.armorItemInSlot(k);
            if (itemstack != null) {
                playerModel.bipedHead.showModel = true; // Always show head
                playerModel.bipedHeadwear.showModel = true; // Always show headwear
                playerModel.bipedBody.showModel = true; // Always show body
                playerModel.bipedRightArm.showModel = true; // Always show right arm
                playerModel.bipedLeftArm.showModel = true; // Always show left arm
                playerModel.bipedRightLeg.showModel = true; // Always show right leg
                playerModel.bipedLeftLeg.showModel = true; // Always show left leg

                // Render the armor piece
                playerModel.render(null, 0.0625F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            }
        }

        GL11.glPopMatrix();
    }

    private void renderHeldItem() {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.5f, 0.0f); // Adjust position of held item
        ItemStack heldItem = mc.thePlayer.getHeldItem(); // Get main hand item

        if (heldItem != null && heldItem.getItem() != null) {
            // Adjust positioning and rotation based on your player model's hand positions
            GL11.glTranslatef(0.1f, 0.0f, -0.3f);
            GL11.glRotatef(-45.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(45.0f, 1.0f, 0.0f, 0.0f);
            GL11.glScalef(1.5f, 1.5f, 1.5f); // Scale the item if necessary

            // Bind texture for the item
            mc.getTextureManager().bindTexture(mc.getTextureManager().getResourceLocation(heldItem.getItem().getSpriteNumber()));

            // Render the item using Minecraft's renderItem method
            RenderManager.instance.itemRenderer.renderItem(mc.thePlayer, heldItem, 0, IItemRenderer.ItemRenderType.EQUIPPED);
        }

        GL11.glPopMatrix();
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.enabled) {
            if (button == shieldLeft) {
                updateCurrentShield(-1, 0);
            } else if (button == shieldSelect) {
                updateCurrentShield(0, 0);
                LOTRPacketSelectShield packet = new LOTRPacketSelectShield(currentShield);
                LOTRPacketHandler.networkWrapper.sendToServer(packet);
            } else if (button == shieldRight) {
                updateCurrentShield(1, 0);
            } else if (button == shieldRemove) {
                updateCurrentShield(0, 0);
                LOTRPacketSelectShield packet = new LOTRPacketSelectShield(null);
                LOTRPacketHandler.networkWrapper.sendToServer(packet);
            } else if (button == changeCategory) {
                updateCurrentShield(0, 1);
            } else {
                super.actionPerformed(button);
            }
        }
    }
}
