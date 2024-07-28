package drealm.render;


import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import drealm.model.*;
import net.minecraft.client.model.*;
import drealm.entity.*;
import net.minecraft.entity.*;
import org.lwjgl.opengl.*;

public class DRRenderWerewolfRohan extends RenderLiving
{
    private static final ResourceLocation Textures;

    public DRRenderWerewolfRohan() {
        super((ModelBase)new DRModelRohanWerewolf(), 0.5f);
    }

    public ResourceLocation getEntityTexture(Entity entity) {
        return DRRenderWerewolfRohan.Textures;
    }

    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityWerewolfRohan warg = (DREntityWerewolfRohan)entity;
        return super.shouldRenderPass(entity, pass, f);
    }

    public void createChild(final DREntityWerewolfRohan entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }

    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityWerewolfRohan orc = (DREntityWerewolfRohan)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }

    public float handleRotationFloat(EntityLivingBase entity, float f) {
        float snapTime = (float)((DREntityWerewolfRohan)entity).getSnapTime();
        if (snapTime > 0.0F) {
            snapTime -= f;
        }

        return snapTime / 20.0F;
    }

    static {
        Textures = new ResourceLocation("drealm", "mob/rohanwerewolf.png");
    }
}
