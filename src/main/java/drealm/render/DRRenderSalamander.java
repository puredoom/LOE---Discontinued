//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import drealm.entity.DREntityGorilla;
import drealm.entity.DREntitySalamander;
import drealm.model.DRModelGorilla;
import drealm.model.DRModelSalamander;
import drealm.model.DRModelSalamanderMounted;
import drealm.model.GorillaMounted;
import lotr.client.render.entity.LOTRRenderHorse;
import lotr.common.entity.npc.LOTRNPCMount;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderSalamander extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelSalamanderMounted saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderSalamander() {
        super((ModelBase)new DRModelSalamander(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelSalamanderMounted()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntitySalamander deer = (DREntitySalamander)entity;
        final ResourceLocation deerSkin = DRRenderSalamander.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }
    
    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntitySalamander warg = (DREntitySalamander)entity;
        if (pass == 0 && warg.isMountSaddled()) {
            this.bindTexture(DRRenderSalamander.wargSaddle);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    public void createChild(final DREntitySalamander entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntitySalamander orc = (DREntitySalamander)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }
    
    static {
        DRRenderSalamander.wargSaddle = new ResourceLocation("drealm", "mob/armorsalamander.png");
        Textures = new ResourceLocation("drealm", "mob/salamander.png");
    }
}
