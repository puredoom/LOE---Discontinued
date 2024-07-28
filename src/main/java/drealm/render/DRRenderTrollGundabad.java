//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import drealm.entity.DREntityTrollGundabad;
import drealm.model.DRModelGorilla;
import drealm.model.DRModelGundabadTroll;
import drealm.model.DRModelGundabadTrollMounted;
import drealm.model.GorillaMounted;
import lotr.client.render.entity.LOTRRenderHorse;
import lotr.common.entity.npc.LOTRNPCMount;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderTrollGundabad extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelGundabadTrollMounted saddleModel;
    private static final ResourceLocation Textures;
    
    public DRRenderTrollGundabad() {
        super((ModelBase)new DRModelGundabadTroll(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelGundabadTrollMounted()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityTrollGundabad deer = (DREntityTrollGundabad)entity;
        final ResourceLocation deerSkin = DRRenderTrollGundabad.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }
    
    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityTrollGundabad warg = (DREntityTrollGundabad)entity;
        if (pass == 0 && warg.isMountSaddled()) {
            this.bindTexture(DRRenderTrollGundabad.wargSaddle);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    public void createChild(final DREntityTrollGundabad entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityTrollGundabad orc = (DREntityTrollGundabad)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }
    
    static {
        DRRenderTrollGundabad.wargSaddle = new ResourceLocation("drealm", "mob/gundabadarmor.png");
        Textures = new ResourceLocation("drealm", "mob/gundabad.png");
    }
}
