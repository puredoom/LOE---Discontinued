//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import drealm.entity.DREntityDunlandBear;
import drealm.model.DRModelDunlandBear;
import drealm.model.DRModelDunlandBearMounted;
import lotr.client.render.entity.LOTRRenderHorse;
import lotr.common.entity.npc.LOTRNPCMount;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderDunlandBear extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelDunlandBearMounted saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderDunlandBear() {
        super((ModelBase)new DRModelDunlandBear(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelDunlandBearMounted()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityDunlandBear deer = (DREntityDunlandBear)entity;
        final ResourceLocation deerSkin = DRRenderDunlandBear.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }
    
    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityDunlandBear warg = (DREntityDunlandBear)entity;
        if (pass == 0 && warg.isMountSaddled()) {
            this.bindTexture(DRRenderDunlandBear.wargSaddle);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    public void createChild(final DREntityDunlandBear entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }


    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityDunlandBear orc = (DREntityDunlandBear)entity;
        GL11.glScalef(1.5f, 1.5f, 1.5f);
        if (orc.isMountSaddled()) {
            // Move the saddled player forward
            GL11.glTranslatef(0.0F, 0.0F, -0.5F); // Adjust the third parameter (-0.5F) as needed
        }
    }
    
    static {
        DRRenderDunlandBear.wargSaddle = new ResourceLocation("drealm:armor/mount/dunlandmounted.png");
        Textures = new ResourceLocation("drealm", "mob/dunland.png");
    }
}
