package com.timgodreuil.powermod.client.gui;

import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.gui.*;
import cpw.mods.fml.client.config.*;
import com.timgodreuil.powermod.shared.containers.*;
import net.minecraft.inventory.*;
import com.timgodreuil.powermod.shared.entities.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.util.*;
import com.timgodreuil.powermod.shared.network.*;
import net.minecraft.entity.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import com.timgodreuil.powermod.shared.network.packets.*;

public class HwachaGui extends GuiContainer {
    private EntityHwacha hwacha;
    private int armSizeX;
    private int armSizeY;
    private GuiButton buttonReload;
    private GuiSlider slider;
    private static float armAngle;

    public HwachaGui(final EntityHwacha hwacha, final IInventory playerInv) {
        super(new HwachaContainer(hwacha, playerInv));
        this.armSizeX = 58;
        this.armSizeY = 15;
        this.xSize = 176;
        this.ySize = 166;
        this.hwacha = hwacha;
    }

    public void initGui() {
        super.initGui();
        final int i = this.guiLeft + this.xSize / 2;
        this.buttonList.add(this.buttonReload = new GuiButton(0, i - 85, this.guiTop + 60, 56, 20, "Not Loaded"));
        this.buttonList.add(this.slider = new GuiSlider(1, i + 30, this.guiTop + 60, 50, 20, "", "", 0.0, 4.0, this.hwacha.getPower(), false, true));
    }

    protected void drawGuiContainerBackgroundLayer(final float p_146976_1_, final int p_146976_2_, final int p_146976_3_) {
        this.mc.getTextureManager().bindTexture(new ResourceLocation("powermod:textures/inventory/menu2.png"));
        GL11.glPushMatrix();
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
        GL11.glTranslatef((float)(this.guiLeft + 88), (float)(this.guiTop + 34), 0.0f);
        GL11.glRotatef(rotateArm(this.hwacha), 0.0f, 0.0f, 1.0f);
        IIcon icon = null;

        if ((this.hwacha.getState() == CatapultState.LOADED || this.hwacha.getState() == CatapultState.RELOADING) && this.hwacha.getProjectile() != null) {
            icon = this.hwacha.getProjectile().getIconFromDamage(0);
        }

        this.mc.renderEngine.bindTexture(TextureMap.locationItemsTexture);
        if (icon != null) {
            this.drawTexturedModelRectFromIcon(-33, -this.armSizeY / 2 - 4, icon, 16, 16);
        }

        GL11.glTranslatef(-30.0f, -3.0f, 0.0f);
        this.mc.getTextureManager().bindTexture(new ResourceLocation("powermod:textures/inventory/menu2.png"));
        this.drawTexturedModalRect(0, 0, 176, 0, this.armSizeX, this.armSizeY);
        GL11.glPopMatrix();
    }

    protected void drawGuiContainerForegroundLayer(final int p_146979_1_, final int p_146979_2_) {
        final String title = StatCollector.translateToLocal("entity.hwacha.name");
        this.fontRendererObj.drawString(StatCollector.translateToLocal("entity.hwacha.power"), 130, 50, 8947848);
        this.fontRendererObj.drawString(title, this.xSize / 2 - this.fontRendererObj.getStringWidth(title) / 2, 6, 5592405);
        this.buttonReload.enabled = (this.hwacha.getState().getDuration() < 0);
        this.buttonReload.displayString = this.hwacha.getState().getButtonName();
    }

    public void onGuiClosed() {
        super.onGuiClosed();
        final float power = (float)this.slider.getValue();
        PacketHandler.NETWORK_WRAPPER.sendToServer(new PacketUpdateHwachaPower(this.hwacha, power));
    }

    public static float rotateArm(final EntityHwacha hwacha) {
        if (hwacha.getState() == CatapultState.RELOADING) {
            return lerp(HwachaGui.armAngle, -HwachaGui.armAngle, hwacha.getStateTick() / (float)hwacha.getState().getDuration());
        }
        if (hwacha.getState() == CatapultState.SHOOTING) {
            return lerp(-HwachaGui.armAngle, HwachaGui.armAngle, hwacha.getStateTick() / (float)hwacha.getState().getDuration());
        }
        if (hwacha.getState() == CatapultState.LOADED) {
            return -HwachaGui.armAngle;
        }
        if (hwacha.getState() == CatapultState.NOT_LOADED) {
            return HwachaGui.armAngle;
        }
        return 0.0f;
    }

    protected void actionPerformed(final GuiButton button) {
        if (button == this.buttonReload) {
            PacketHandler.NETWORK_WRAPPER.sendToServer(new PacketButtonHwacha(this.hwacha));
            PacketHandler.NETWORK_WRAPPER.sendToServer(new PacketUpdateHwachaPower(this.hwacha, (float)this.slider.getValue()));
        }
    }

    private static float lerp(final float min, final float max, final float t) {
        return min + (max - min) * t;
    }

    static {
        HwachaGui.armAngle = 20.0f;
    }
}
