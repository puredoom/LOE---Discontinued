//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import drealm.entity.DREntityBoar;
import drealm.entity.DREntityPoney;
import drealm.model.DRModelBoar;
import drealm.model.DRModelMountedBoar;
import drealm.model.DRModelPoney;
import drealm.model.DRModelPoneyArmor;
import lotr.client.render.entity.LOTRRenderHorse;
import lotr.common.entity.npc.LOTRNPCMount;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderPoney extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelPoneyArmor saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderPoney() {
        super((ModelBase)new DRModelPoney(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelPoneyArmor()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityPoney deer = (DREntityPoney)entity;
        final ResourceLocation deerSkin = DRRenderPoney.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }

    protected int shouldRenderPass(EntityLivingBase entity, int pass, float f) {
        DREntityPoney poney = (DREntityPoney) entity;

        if (pass == 0 && poney.isMountSaddled()) {
            // Use the new saddle model when the entity has a saddle
            this.setRenderPassModel(new DRModelPoneyArmor());
            this.bindTexture(DRRenderPoney.wargSaddle);
            return 1;
        }

        // Do not render the original model when a saddle is present
        return -1;
    }
    
    public void createChild(final DREntityPoney entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityPoney orc = (DREntityPoney)entity;
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        if (orc.isMountSaddled()) {
            // Move the saddled player forward
            GL11.glTranslatef(0.0F, 0.0F, 0.0F); // Adjust the third parameter (-0.5F) as needed
        }
    }
    
    static {
        DRRenderPoney.wargSaddle = new ResourceLocation("drealm", "mob/poneyarmor.png");
        Textures = new ResourceLocation("drealm", "mob/poney.png");
    }
}
