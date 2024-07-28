//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.client.render.entities;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import com.timgodreuil.powermod.shared.entities.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.*;
import cpw.mods.fml.client.*;

public class RenderEntityRock extends Render
{
    ResourceLocation texture;
    
    public RenderEntityRock() {
        this.texture = new ResourceLocation("powermod:textures/entities/rock.png");
    }
    
    public void doRender(final Entity entity, final double x, final double y, final double z, final float yaw, final float p_76986_9_) {
        if (entity.isDead) {
            return;
        }
        final EntityRock rock = (EntityRock)entity;
        final double width = entity.width / 2.0;
        final double height = entity.height / 2.0;
        GL11.glPushMatrix();
        GL11.glDisable(2884);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        GL11.glTranslatef((float)x, (float)y + (float)height, (float)z);
        GL11.glRotatef(rock.getRotation() + (rock.getRotation() - rock.getPrevRotation()) * p_76986_9_, 1.0f, 0.0f, 0.0f);
        final Tessellator tesselator = Tessellator.instance;
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.texture);
        tesselator.startDrawingQuads();
        tesselator.setNormal(0.0f, 0.0f, 1.0f);
        tesselator.addVertexWithUV(width, -height, width, 1.0, 1.0);
        tesselator.addVertexWithUV(width, height, width, 1.0, 0.0);
        tesselator.addVertexWithUV(-width, height, width, 0.0, 0.0);
        tesselator.addVertexWithUV(-width, -height, width, 0.0, 1.0);
        tesselator.setNormal(0.0f, -1.0f, 0.0f);
        tesselator.addVertexWithUV(width, -height, width, 1.0, 1.0);
        tesselator.addVertexWithUV(-width, -height, width, 0.0, 1.0);
        tesselator.addVertexWithUV(-width, -height, -width, 0.0, 0.0);
        tesselator.addVertexWithUV(width, -height, -width, 1.0, 0.0);
        tesselator.setNormal(1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(width, -height, -width, 1.0, 1.0);
        tesselator.addVertexWithUV(width, height, -width, 1.0, 0.0);
        tesselator.addVertexWithUV(width, height, width, 0.0, 0.0);
        tesselator.addVertexWithUV(width, -height, width, 0.0, 1.0);
        tesselator.setNormal(-1.0f, 0.0f, 0.0f);
        tesselator.addVertexWithUV(-width, -height, width, 1.0, 1.0);
        tesselator.addVertexWithUV(-width, height, width, 1.0, 0.0);
        tesselator.addVertexWithUV(-width, height, -width, 0.0, 0.0);
        tesselator.addVertexWithUV(-width, -height, -width, 0.0, 1.0);
        tesselator.setNormal(0.0f, 0.0f, -1.0f);
        tesselator.addVertexWithUV(-width, -height, -width, 1.0, 1.0);
        tesselator.addVertexWithUV(-width, height, -width, 1.0, 0.0);
        tesselator.addVertexWithUV(width, height, -width, 0.0, 0.0);
        tesselator.addVertexWithUV(width, -height, -width, 0.0, 1.0);
        tesselator.setNormal(0.0f, 1.0f, 0.0f);
        tesselator.addVertexWithUV(width, height, width, 1.0, 1.0);
        tesselator.addVertexWithUV(width, height, -width, 1.0, 0.0);
        tesselator.addVertexWithUV(-width, height, -width, 0.0, 0.0);
        tesselator.addVertexWithUV(-width, height, width, 0.0, 1.0);
        tesselator.draw();
        GL11.glEnable(2884);
        GL11.glDisable(3042);
        GL11.glTranslatef(-(float)x, -(float)y - 1.5f, -(float)z);
        GL11.glPopMatrix();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return this.texture;
    }
}
