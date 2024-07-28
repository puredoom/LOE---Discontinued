package drealm.render;

import drealm.entity.DREntityNazgul;
import drealm.model.DRModelFellBeast;
import lotr.client.render.entity.LOTRRandomSkins;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map;

public class DRRenderNazgul extends RenderLiving {
    private static Map<String, LOTRRandomSkins> birdTypeSkins = new HashMap();

    private static final ResourceLocation Textures;
    public static boolean renderStolenItem = true;

    public DRRenderNazgul() {
        super(new DRModelFellBeast(), 0.2F);
    }

    public ResourceLocation getEntityTexture(Entity entity) {
        return DRRenderNazgul.Textures;
    }

    public void preRenderCallback(EntityLivingBase entity, float f) {
        final DREntityNazgul orc = (DREntityNazgul)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);

    }

    protected float handleRotationFloat(EntityLivingBase entity, float f) {
        DREntityNazgul bird = (DREntityNazgul)entity;
        return bird.isBirdStill() && bird.flapTime > 0 ? (float)bird.flapTime - f : super.handleRotationFloat(entity, f);
    }

    protected void renderEquippedItems(EntityLivingBase entity, float f) {
        DREntityNazgul bird = (DREntityNazgul)entity;
        if (renderStolenItem) {
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            ItemStack stolenItem = bird.getStolenItem();
            if (stolenItem != null) {
                GL11.glPushMatrix();
                GL11.glTranslatef(0.05F, 1.4F, -0.1F);
                float scale = 0.25F;
                GL11.glScalef(scale, scale, scale);
                this.renderManager.itemRenderer.renderItem(entity, stolenItem, 0);
                GL11.glPopMatrix();
            }
        }

    }
    static {
        Textures = new ResourceLocation("drealm", "mob/nazgul.png");
    }
}
