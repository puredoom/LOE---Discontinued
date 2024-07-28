package drealm.render;

import java.util.HashMap;

import drealm.model.DRModelEnt;
import lotr.client.LOTRTextures;
import lotr.client.model.LOTRModelEnt;
import lotr.client.render.entity.LOTRGlowingEyes;
import lotr.common.entity.npc.LOTREntityEnt;
import lotr.common.entity.npc.LOTREntityTree;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class DRRenderEnt extends RenderLiving {
    private static HashMap entTextures = new HashMap();

    private static final ResourceLocation Textures;

    public DRRenderEnt() {
        super(new DRModelEnt(), 0.5F);
    }

    protected ResourceLocation getEntityTexture(Entity entity) {
        ResourceLocation r = (ResourceLocation) entTextures.get(Textures);
        if (r == null) {
            r = Textures;
            entTextures.put(Textures, r);
        }

        return r;
    }

    protected void renderModel(EntityLivingBase entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.renderModel(entity, f, f1, f2, f3, f4, f5);
    }

    static {
        Textures = new ResourceLocation("drealm", "mob/isengardent.png");
    }
}
