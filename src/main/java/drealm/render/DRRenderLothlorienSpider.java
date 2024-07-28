package drealm.render;

import drealm.entity.DREntitySpiderLothlorien;
import drealm.model.DRModelLothlorienSpider;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderLothlorienSpider extends RenderLiving {
    private static ResourceLocation[] spiderSkins = new ResourceLocation[]{new ResourceLocation("drealm:mob/spider.png"), new ResourceLocation("drealm:mob/spider2.png"), new ResourceLocation("drealm:mob/spider3.png")};

    public DRRenderLothlorienSpider() {
        super((ModelBase)new DRModelLothlorienSpider(), 0.5f);
        this.setRenderPassModel(new DRModelLothlorienSpider());
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        DREntitySpiderLothlorien spider = (DREntitySpiderLothlorien)entity;
        return spiderSkins[spider.getSpiderType()];
    }
    protected void renderModel(EntityLivingBase entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.renderModel(entity, f, f1, f2, f3, f4, f5);
    }

    protected void preRenderCallback(EntityLivingBase entity, float f) {
        float scale = ((DREntitySpiderLothlorien)entity).getSpiderScaleAmount();
        GL11.glScalef(scale, scale, scale);
    }

    protected float getDeathMaxRotation(EntityLivingBase entity) {
        return 180.0F;
    }
}