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

    static {
        Textures = new ResourceLocation("drealm", "mob/nazgul.png");
    }
}
