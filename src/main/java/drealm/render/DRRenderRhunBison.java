//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import drealm.entity.DREntityRhunBison;
import drealm.model.DRModelRhunBison;
import drealm.model.DRModelRhunBisonMounted;
import lotr.client.render.entity.LOTRRenderHorse;
import lotr.common.entity.npc.LOTRNPCMount;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderRhunBison extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelRhunBisonMounted saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderRhunBison() {
        super((ModelBase)new DRModelRhunBison(), 0.2f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelRhunBisonMounted()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityRhunBison deer = (DREntityRhunBison)entity;
        final ResourceLocation deerSkin = DRRenderRhunBison.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }

    protected int shouldRenderPass(EntityLivingBase entity, int pass, float f) {
        DREntityRhunBison poney = (DREntityRhunBison) entity;

        if (pass == 0 && poney.isMountSaddled()) {
            // Use the new saddle model when the entity has a saddle
            this.setRenderPassModel(new DRModelRhunBisonMounted());
            this.bindTexture(DRRenderRhunBison.wargSaddle);
            return 1;
        }

        // Do not render the original model when a saddle is present
        return -1;
    }
    
    public void createChild(final DREntityRhunBison entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityRhunBison orc = (DREntityRhunBison)entity;
        GL11.glScalef(1.5f, 1.5f, 1.5f);
        if (orc.isMountSaddled()) {
            // Move the saddled player forward
            GL11.glTranslatef(0.0F, 0.0F, 0.0F); // Adjust the third parameter (-0.5F) as needed
        }
    }
    
    static {
        DRRenderRhunBison.wargSaddle = new ResourceLocation("drealm", "mob/rhunmounted.png");
        Textures = new ResourceLocation("drealm", "mob/rhun.png");
    }
}
