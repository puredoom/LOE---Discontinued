package drealm.render;

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!



import drealm.entity.DREntityGraug;
import drealm.model.DRModelGraug;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderGraug extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelGraug saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderGraug() {
        super(new DRModelGraug(), 1.0F);
    }

    public ResourceLocation getEntityTexture(Entity entity) {
        return DRRenderGraug.Textures;
    }

    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityGraug warg = (DREntityGraug)entity;
        return super.shouldRenderPass(entity, pass, f);
    }

    public void createChild(final DREntityGraug entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }

    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityGraug orc = (DREntityGraug)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }

    static {
        Textures = new ResourceLocation("drealm", "mob/graug.png");
    }
}
