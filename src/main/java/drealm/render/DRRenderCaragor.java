package drealm.render;

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!



import drealm.entity.DREntityCaragor;
import drealm.model.DRModelCaragor;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderCaragor extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelCaragor saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderCaragor() {
        super(new DRModelCaragor(), 1.0F);
    }

    public ResourceLocation getEntityTexture(Entity entity) {
        return DRRenderCaragor.Textures;
    }

    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityCaragor warg = (DREntityCaragor)entity;
        return super.shouldRenderPass(entity, pass, f);
    }

    public void createChild(final DREntityCaragor entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }

    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityCaragor orc = (DREntityCaragor)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }

    static {
        Textures = new ResourceLocation("drealm", "mob/caragor.png");
    }
}
