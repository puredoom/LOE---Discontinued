package drealm.render;

import net.minecraft.client.model.ModelHorse;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class DRRenderNazgulHorse extends RenderLiving {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation("minecraft", "textures/entity/horse/horse_black.png");

    public DRRenderNazgulHorse() {
        super(new ModelHorse(), 0.75F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return TEXTURE;
    }
}
