//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import drealm.entity.DREntityBoar;
import drealm.entity.DREntityGoat;
import drealm.model.DRModelBoar;
import drealm.model.DRModelGoat;
import drealm.model.DRModelGoatArmor;
import drealm.model.DRModelMountedBoar;
import lotr.client.render.entity.LOTRRenderHorse;
import lotr.common.entity.npc.LOTRNPCMount;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderGoat extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelGoatArmor saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderGoat() {
        super((ModelBase)new DRModelGoat(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelGoatArmor()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityGoat deer = (DREntityGoat)entity;
        final ResourceLocation deerSkin = DRRenderGoat.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }
    
    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityGoat warg = (DREntityGoat)entity;
        if (pass == 0 && warg.isMountSaddled()) {
            this.bindTexture(DRRenderGoat.wargSaddle);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    public void createChild(final DREntityGoat entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityGoat orc = (DREntityGoat)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }
    
    static {
        DRRenderGoat.wargSaddle = new ResourceLocation("drealm", "mob/goatarmor.png");
        Textures = new ResourceLocation("drealm", "mob/goat.png");
    }
}
