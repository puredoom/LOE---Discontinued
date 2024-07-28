//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.client.render.entities;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.client.*;
import org.lwjgl.opengl.*;
import cpw.mods.fml.client.*;
import com.timgodreuil.powermod.client.gui.*;
import com.timgodreuil.powermod.shared.entities.*;
import net.minecraft.init.*;
import net.minecraft.client.renderer.*;
import com.timgodreuil.powermod.shared.items.*;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.util.*;

public class RenderEntityCatapult extends Render
{
    ResourceLocation texture;
    private long lastTick;
    
    public RenderEntityCatapult() {
        this.texture = new ResourceLocation("powermod:textures/entities/catapult.png");
        this.lastTick = 0L;
    }
    
    public void doRender(final Entity entity, final double x, final double y, final double z, final float yaw, final float p_76986_9_) {
        final boolean debug = Minecraft.getMinecraft().gameSettings.showDebugInfo;
        final EntityCatapult catapult = (EntityCatapult)entity;
        final double width = entity.width / 2.0;
        final double height = entity.height / 2.0;
        final Tessellator tesselator = Tessellator.instance;
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glTranslatef((float)x, (float)y + (float)height, (float)z);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glRotatef(catapult.getRotation(), 0.0f, 1.0f, 0.0f);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.texture);
        GL11.glPushMatrix();
        tesselator.startDrawingQuads();
        GL11.glTranslatef(0.0f, (float)(-width) + 0.1f, (float)(-width) + 0.5f);
        this.drawBase(tesselator, entity);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        tesselator.startDrawingQuads();
        GL11.glTranslatef(0.0f, (float)(-width) + 0.1f, (float)width - 0.5f);
        this.drawBase(tesselator, entity);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        tesselator.startDrawingQuads();
        GL11.glTranslatef(-0.75f, (float)(-width) + 0.8f, (float)width - 0.5f);
        GL11.glRotatef(45.0f, 0.0f, 0.0f, 1.0f);
        this.drawArm(tesselator, entity);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        tesselator.startDrawingQuads();
        GL11.glTranslatef(0.75f, (float)(-width) + 0.8f, (float)width - 0.5f);
        GL11.glRotatef(-45.0f, 0.0f, 0.0f, 1.0f);
        this.drawArm(tesselator, entity);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        tesselator.startDrawingQuads();
        GL11.glTranslatef(-0.75f, (float)(-width) + 0.8f, (float)(-width) + 0.5f);
        GL11.glRotatef(45.0f, 0.0f, 0.0f, 1.0f);
        this.drawArm(tesselator, entity);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        tesselator.startDrawingQuads();
        GL11.glTranslatef(0.75f, (float)(-width) + 0.8f, (float)(-width) + 0.5f);
        GL11.glRotatef(-45.0f, 0.0f, 0.0f, 1.0f);
        this.drawArm(tesselator, entity);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        tesselator.startDrawingQuads();
        GL11.glTranslatef(0.0f, (float)(-width) + 1.6f, 0.0f);
        GL11.glRotatef(45.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
        this.drawAxle(tesselator, entity);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        tesselator.startDrawingQuads();
        GL11.glTranslatef(0.0f, (float)(-width) + 1.7f, 0.0f);
        GL11.glRotatef(-CatapultGui.rotateArm(catapult), 0.0f, 0.0f, 1.0f);
        this.drawAxle(tesselator, entity);
        final ProjectileItem projectile = catapult.getProjectile();
        GL11.glTranslatef(-1.89f, -0.3f, 0.0f);
        if (projectile != null) {
            final ProjectileItem projIt = projectile;
            final long l = (long)(Minecraft.getSystemTime() / 50.0f);
            if (projectile instanceof ItemFireProjectile && l > this.lastTick + 1L) {
                ((EntityFireProjectile)projIt.getRenderingEntity(catapult.worldObj)).updateAnimation();
                this.lastTick = l;
            }
            this.renderManager.renderEntityWithPosYaw((Entity)projIt.getRenderingEntity(catapult.worldObj), 0.0, 0.0, 0.0, 0.0f, p_76986_9_);
        }
        tesselator.startDrawingQuads();
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.texture);
        GL11.glTranslatef(0.0f, 0.2f, 0.0f);
        GL11.glDisable(2884);
        this.drawTop(tesselator, entity);
        GL11.glEnable(2884);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(1.4f, -1.0f + (float)Math.sin(Math.toRadians(-CatapultGui.rotateArm(catapult))) * 1.5f, 0.0f);
        tesselator.startDrawingQuads();
        this.drawCube(Blocks.cobblestone, 0, 0, 0.5, 0.5, 0.5, tesselator, 0.0, 0.0, 0.0, 0.0);
        tesselator.startDrawingQuads();
        GL11.glTranslatef(0.0f, 0.5f, 0.0f);
        GL11.glScalef(0.3f, 0.1f, 0.3f);
        GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.texture);
        this.drawAxle(tesselator, entity);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(1.8f, (float)(-width), (float)(-width) + 0.5f);
        GL11.glRotatef(90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glScalef(0.3f, 0.3f, 0.3f);
        GL11.glRotatef(CatapultGui.rotateArm(catapult), 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(1.5f, 0.0f, 0.0f);
        tesselator.startDrawingQuads();
        this.drawAxle(tesselator, entity);
        GL11.glPopMatrix();
        if (debug && Minecraft.getMinecraft().thePlayer.getDistanceSqToEntity(entity) <= 400.0) {
            GL11.glPushMatrix();
            GL11.glDisable(3553);
            GL11.glDisable(2896);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            GL11.glBegin(1);
            GL11.glColor4f(1.0f, 0.0f, 0.0f, 1.0f);
            GL11.glVertex3f(0.0f, -0.5f, 0.0f);
            GL11.glVertex3f(4.0f, -0.5f, 0.0f);
            GL11.glVertex3f(4.0f, -0.5f, 0.0f);
            GL11.glVertex3f(3.0f, -0.5f, -0.5f);
            GL11.glVertex3f(3.0f, -0.5f, -0.5f);
            GL11.glVertex3f(3.0f, 0.0f, 0.0f);
            GL11.glVertex3f(4.0f, -0.5f, 0.0f);
            GL11.glVertex3f(3.0f, -0.5f, 0.5f);
            GL11.glVertex3f(3.0f, -0.5f, 0.5f);
            GL11.glVertex3f(3.0f, -1.0f, 0.0f);
            GL11.glVertex3f(4.0f, -0.5f, 0.0f);
            GL11.glVertex3f(3.0f, 0.0f, 0.0f);
            GL11.glVertex3f(3.0f, 0.0f, 0.0f);
            GL11.glVertex3f(3.0f, -0.5f, 0.5f);
            GL11.glVertex3f(4.0f, -0.5f, 0.0f);
            GL11.glVertex3f(3.0f, -1.0f, 0.0f);
            GL11.glVertex3f(3.0f, -1.0f, 0.0f);
            GL11.glVertex3f(3.0f, -0.5f, -0.5f);
            GL11.glColor4f(0.0f, 1.0f, 0.0f, 1.0f);
            GL11.glVertex3d(0.0, -height, 0.0);
            GL11.glVertex3d(width, -height, 0.0);
            GL11.glVertex3d(0.0, -height, 0.0);
            GL11.glVertex3d(-width, -height, 0.0);
            GL11.glVertex3d(0.0, -height, 0.0);
            GL11.glVertex3d(0.0, -height, width);
            GL11.glVertex3d(0.0, -height, 0.0);
            GL11.glVertex3d(0.0, -height, -width);
            GL11.glEnd();
            GL11.glEnable(3553);
            GL11.glEnable(2896);
            GL11.glEnable(2929);
            GL11.glDepthMask(true);
            GL11.glPopMatrix();
        }
        GL11.glDisable(3042);
        GL11.glTranslatef(-(float)x, -(float)y - 1.5f, -(float)z);
        GL11.glPopMatrix();
        if (Minecraft.getMinecraft().thePlayer.getDistanceSqToEntity(entity) > 400.0) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y + 2.5f, (float)z);
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
        GL11.glScalef(-0.0266666f, -0.0266666f, 0.0266666f);
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glDisable(3553);
        tesselator.startDrawingQuads();
        tesselator.setColorRGBA_F(0.0f, 0.0f, 0.0f, 0.25f);
        tesselator.addVertex(-31.0, -1.0, 0.0);
        tesselator.addVertex(-31.0, 8.0, 0.0);
        tesselator.addVertex(31.0, 8.0, 0.0);
        tesselator.addVertex(31.0, -1.0, 0.0);
        final float h = catapult.getHealth();
        final float barWidth = 60.0f * (h / catapult.getMaxHealth());
        tesselator.setColorRGBA_F(0.0f, 1.0f, 0.0f, 0.25f);
        tesselator.addVertex(-30.0, 0.0, 0.0);
        tesselator.addVertex(-30.0, 7.0, 0.0);
        tesselator.addVertex(barWidth - 30.0, 7.0, 0.0);
        tesselator.addVertex(barWidth - 30.0, 0.0, 0.0);
        tesselator.setColorRGBA_F(1.0f, 0.0f, 0.0f, 0.25f);
        tesselator.addVertex(barWidth - 30.0, 0.0, 0.0);
        tesselator.addVertex(barWidth - 30.0, 7.0, 0.0);
        tesselator.addVertex(30.0, 7.0, 0.0);
        tesselator.addVertex(30.0, 0.0, 0.0);
        tesselator.draw();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        GL11.glEnable(2896);
        GL11.glDisable(3042);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.texture;
    }
    
    private void drawTop(final Tessellator tesselator, final Entity ent) {
        final double w = 0.3;
        final double h = 0.3;
        final double depth = 0.3;
        final double minU = 0.0;
        final double maxU = 0.0625;
        final double minV = 0.125;
        final double maxV = 0.1875;
        tesselator.setNormal(0.0f, 0.0f, 1.0f);
        tesselator.addVertexWithUV(w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, depth, minU, minV);
        tesselator.addVertexWithUV(-w, -h, depth, minU, maxV);
        tesselator.setNormal(0.0f, -1.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, depth, 0.125, 0.1875);
        tesselator.addVertexWithUV(-w, -h, depth, 0.0625, 0.1875);
        tesselator.addVertexWithUV(-w, -h, -depth, 0.0625, 0.125);
        tesselator.addVertexWithUV(w, -h, -depth, 0.125, 0.125);
        tesselator.setNormal(1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, -depth, 0.0625, maxV);
        tesselator.addVertexWithUV(w, h, -depth, 0.0625, minV);
        tesselator.addVertexWithUV(w, h, depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, depth, minU, maxV);
        tesselator.setNormal(-1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(-w, -h, depth, 0.0625, maxV);
        tesselator.addVertexWithUV(-w, h, depth, 0.0625, minV);
        tesselator.addVertexWithUV(-w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(-w, -h, -depth, minU, maxV);
        tesselator.setNormal(0.0f, 0.0f, -1.0f);
        tesselator.addVertexWithUV(-w, -h, -depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, -depth, minU, maxV);
        tesselator.draw();
    }
    
    private void drawAxle(final Tessellator tesselator, final Entity ent) {
        final double w = ent.width / 2.5;
        final double h = 0.1;
        final double depth = 0.1;
        final double minU = 0.0;
        final double maxU = 1.0;
        final double minV = 0.0625;
        final double maxV = 0.125;
        tesselator.setNormal(0.0f, 0.0f, 1.0f);
        tesselator.addVertexWithUV(w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, depth, minU, minV);
        tesselator.addVertexWithUV(-w, -h, depth, minU, maxV);
        tesselator.setNormal(0.0f, -1.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, -h, depth, minU, maxV);
        tesselator.addVertexWithUV(-w, -h, -depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, -depth, maxU, minV);
        tesselator.setNormal(1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, -depth, 0.0625, maxV);
        tesselator.addVertexWithUV(w, h, -depth, 0.0625, minV);
        tesselator.addVertexWithUV(w, h, depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, depth, minU, maxV);
        tesselator.setNormal(-1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(-w, -h, depth, 0.0625, maxV);
        tesselator.addVertexWithUV(-w, h, depth, 0.0625, minV);
        tesselator.addVertexWithUV(-w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(-w, -h, -depth, minU, maxV);
        tesselator.setNormal(0.0f, 0.0f, -1.0f);
        tesselator.addVertexWithUV(-w, -h, -depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, -depth, minU, maxV);
        tesselator.setNormal(0.0f, 1.0f, 0.0f);
        tesselator.addVertexWithUV(w, h, depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(-w, h, depth, minU, maxV);
        tesselator.draw();
    }
    
    private void drawArm(final Tessellator tesselator, final Entity ent) {
        final double w = ent.width / 4.0;
        final double h = 0.1;
        final double depth = 0.07;
        final double minU = 0.0;
        final double maxU = 1.0;
        final double minV = 0.0;
        final double maxV = 0.0625;
        tesselator.setNormal(0.0f, 0.0f, 1.0f);
        tesselator.addVertexWithUV(w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, depth, minU, minV);
        tesselator.addVertexWithUV(-w, -h, depth, minU, maxV);
        tesselator.setNormal(0.0f, -1.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, -h, depth, minU, maxV);
        tesselator.addVertexWithUV(-w, -h, -depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, -depth, maxU, minV);
        tesselator.setNormal(1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, -depth, 0.0625, maxV);
        tesselator.addVertexWithUV(w, h, -depth, 0.0625, minV);
        tesselator.addVertexWithUV(w, h, depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, depth, minU, maxV);
        tesselator.setNormal(-1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(-w, -h, depth, 0.0625, maxV);
        tesselator.addVertexWithUV(-w, h, depth, 0.0625, minV);
        tesselator.addVertexWithUV(-w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(-w, -h, -depth, minU, maxV);
        tesselator.setNormal(0.0f, 0.0f, -1.0f);
        tesselator.addVertexWithUV(-w, -h, -depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, -depth, minU, maxV);
        tesselator.setNormal(0.0f, 1.0f, 0.0f);
        tesselator.addVertexWithUV(w, h, depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(-w, h, depth, minU, maxV);
        tesselator.draw();
    }
    
    private void drawBase(final Tessellator tesselator, final Entity ent) {
        final double w = ent.width / 2.0;
        final double h = 0.1;
        final double depth = 0.1;
        final double minU = 0.0;
        final double maxU = 1.0;
        final double minV = 0.0;
        final double maxV = 0.0625;
        tesselator.setNormal(0.0f, 0.0f, 1.0f);
        tesselator.addVertexWithUV(w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, depth, minU, minV);
        tesselator.addVertexWithUV(-w, -h, depth, minU, maxV);
        tesselator.setNormal(0.0f, -1.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, -h, depth, minU, maxV);
        tesselator.addVertexWithUV(-w, -h, -depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, -depth, maxU, minV);
        tesselator.setNormal(1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, -depth, 0.125, maxV);
        tesselator.addVertexWithUV(w, h, -depth, 0.125, minV);
        tesselator.addVertexWithUV(w, h, depth, 0.0625, minV);
        tesselator.addVertexWithUV(w, -h, depth, 0.0625, maxV);
        tesselator.setNormal(-1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(-w, -h, depth, 0.125, maxV);
        tesselator.addVertexWithUV(-w, h, depth, 0.125, minV);
        tesselator.addVertexWithUV(-w, h, -depth, 0.0625, minV);
        tesselator.addVertexWithUV(-w, -h, -depth, 0.0625, maxV);
        tesselator.setNormal(0.0f, 0.0f, -1.0f);
        tesselator.addVertexWithUV(-w, -h, -depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, -depth, minU, maxV);
        tesselator.setNormal(0.0f, 1.0f, 0.0f);
        tesselator.addVertexWithUV(w, h, depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(-w, h, depth, minU, maxV);
        tesselator.draw();
    }
    
    private void drawCube(final Block icon, final int side, final int meta, final double w, final double h, final double depth, final Tessellator tesselator, double minU, double maxU, double minV, double maxV) {
        if (icon != null) {
            final IIcon woodIcon = icon.getIcon(2, 0);
            FMLClientHandler.instance().getClient().renderEngine.bindTexture(TextureMap.locationBlocksTexture);
            minU = woodIcon.getMinU();
            minV = woodIcon.getMinV();
            maxU = woodIcon.getMaxU();
            maxV = woodIcon.getMaxV();
        }
        tesselator.setNormal(0.0f, 0.0f, 1.0f);
        tesselator.addVertexWithUV(w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, depth, minU, minV);
        tesselator.addVertexWithUV(-w, -h, depth, minU, maxV);
        tesselator.setNormal(0.0f, -1.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, -h, depth, minU, maxV);
        tesselator.addVertexWithUV(-w, -h, -depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, -depth, maxU, minV);
        tesselator.setNormal(1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(w, -h, -depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(w, h, depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, depth, minU, maxV);
        tesselator.setNormal(-1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(-w, -h, depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, h, depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(-w, -h, -depth, minU, maxV);
        tesselator.setNormal(0.0f, 0.0f, -1.0f);
        tesselator.addVertexWithUV(-w, -h, -depth, maxU, maxV);
        tesselator.addVertexWithUV(-w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(w, -h, -depth, minU, maxV);
        tesselator.setNormal(0.0f, 1.0f, 0.0f);
        tesselator.addVertexWithUV(w, h, depth, maxU, maxV);
        tesselator.addVertexWithUV(w, h, -depth, maxU, minV);
        tesselator.addVertexWithUV(-w, h, -depth, minU, minV);
        tesselator.addVertexWithUV(-w, h, depth, minU, maxV);
        tesselator.draw();
    }
}
