//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import drealm.entity.DREntityBoar;
import drealm.entity.DREntityRedBeast;
import drealm.model.DRModelBoar;
import drealm.model.DRModelMountedBoar;
import drealm.model.DRModelRedBeast;
import drealm.model.DRModelRedBeastMounted;
import lotr.client.render.entity.LOTRRenderHorse;
import lotr.common.entity.npc.LOTRNPCMount;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderRedBeast extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelRedBeastMounted saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderRedBeast() {
        super((ModelBase)new DRModelRedBeast(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelRedBeastMounted()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityRedBeast deer = (DREntityRedBeast)entity;
        final ResourceLocation deerSkin = DRRenderRedBeast.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }
    
    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityRedBeast warg = (DREntityRedBeast)entity;
        if (pass == 0 && warg.isMountSaddled()) {
            this.bindTexture(DRRenderRedBeast.wargSaddle);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    public void createChild(final DREntityRedBeast entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityRedBeast orc = (DREntityRedBeast)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }
    
    static {
        DRRenderRedBeast.wargSaddle = new ResourceLocation("drealm", "mob/redbeastarmor.png");
        Textures = new ResourceLocation("drealm", "mob/redbeast.png");
    }
}
