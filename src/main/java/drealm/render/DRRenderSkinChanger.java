package drealm.render;

//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!



import drealm.entity.DREntityBoar;
import drealm.entity.DREntitySkinChanger;
import drealm.model.DRModelBoar;
import drealm.model.DRModelFellBeast;
import drealm.model.DRModelMountedBoar;
import drealm.model.DRModelDolGuldurSkinChanger;
import lotr.client.render.entity.LOTRRenderHorse;
import lotr.common.entity.npc.LOTRNPCMount;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderSkinChanger extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelDolGuldurSkinChanger saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderSkinChanger() {
        super(new DRModelDolGuldurSkinChanger(), 1.0F);
    }

    public ResourceLocation getEntityTexture(Entity entity) {
        return DRRenderSkinChanger.Textures;
    }

    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntitySkinChanger warg = (DREntitySkinChanger)entity;
        return super.shouldRenderPass(entity, pass, f);
    }

    public void createChild(final DREntitySkinChanger entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }

    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntitySkinChanger orc = (DREntitySkinChanger)entity;
        GL11.glScalef(1.5f, 1.5f, 1.5f);
    }

    static {
        Textures = new ResourceLocation("drealm", "mob/skinchanger.png");
    }
}
