package drealm.render;

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!



import drealm.entity.DREntitySouris;
import drealm.model.DRModelSouris;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderSouris extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelSouris saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderSouris() {
        super(new DRModelSouris(), 1.0F);
    }

    public ResourceLocation getEntityTexture(Entity entity) {
        return DRRenderSouris.Textures;
    }

    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntitySouris warg = (DREntitySouris)entity;
        return super.shouldRenderPass(entity, pass, f);
    }

    public void createChild(final DREntitySouris entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }

    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntitySouris orc = (DREntitySouris)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }

    static {
        Textures = new ResourceLocation("drealm", "mob/souris.png");
    }
}
