package com.timgodreuil.powermod.client.render.entities;

import com.timgodreuil.powermod.client.render.tileentities.HwachaModel;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderEntityHwacha extends Render {
    private static final ResourceLocation TEXTURE = new ResourceLocation("powermod:textures/entities/hwacha.png");
    private final HwachaModel model = new HwachaModel();

    public RenderEntityHwacha() {
        super();
        this.shadowSize = 0.5F;
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float entityYaw, float partialTicks) {
        this.bindEntityTexture(entity);

        // Adjust y translation to lift the entity above the ground
        float yOffset = 1.4F;  // Adjust this value as needed to lift the entity
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y + yOffset, (float) z);
        GL11.glRotatef(-entityYaw, 0.0F, 1.0F, 0.0F);
        model.render(entity, 0, 0, 0, 0, 0, 0.0625F);
        GL11.glPopMatrix();
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return TEXTURE;
    }
}