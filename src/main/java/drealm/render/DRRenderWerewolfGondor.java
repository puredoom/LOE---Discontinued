package drealm.render;


import drealm.entity.DREntityWerewolfGondor;
import drealm.model.DRModelGondorWerewolf;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderWerewolfGondor extends RenderLiving
{
    private static final ResourceLocation Textures;

    public DRRenderWerewolfGondor() {
        super((ModelBase)new DRModelGondorWerewolf(), 0.5f);
    }

    public ResourceLocation getEntityTexture(Entity entity) {
        return DRRenderWerewolfGondor.Textures;
    }

    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityWerewolfGondor warg = (DREntityWerewolfGondor)entity;
        return super.shouldRenderPass(entity, pass, f);
    }

    public void createChild(final DREntityWerewolfGondor entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }

    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityWerewolfGondor orc = (DREntityWerewolfGondor)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }

    public float handleRotationFloat(EntityLivingBase entity, float f) {
        float snapTime = (float)((DREntityWerewolfGondor)entity).getSnapTime();
        if (snapTime > 0.0F) {
            snapTime -= f;
        }

        return snapTime / 20.0F;
    }

    static {
        Textures = new ResourceLocation("drealm", "mob/gondorwerewolf.png");
    }
}
