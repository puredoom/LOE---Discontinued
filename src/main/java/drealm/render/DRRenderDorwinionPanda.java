//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import drealm.entity.DREntityDalishOstrich;
import drealm.entity.DREntityDorwinionPanda;
import drealm.model.DRModelDorwinionPanda;
import drealm.model.DRModelDorwinionPandaArmor;

import lotr.client.render.entity.LOTRRenderHorse;
import lotr.common.entity.npc.LOTRNPCMount;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class DRRenderDorwinionPanda extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelDorwinionPandaArmor saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderDorwinionPanda() {
        super((ModelBase)new DRModelDorwinionPanda(), 0.3f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelDorwinionPandaArmor()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityDorwinionPanda deer = (DREntityDorwinionPanda)entity;
        final ResourceLocation deerSkin = DRRenderDorwinionPanda.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }

    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityDorwinionPanda warg = (DREntityDorwinionPanda) entity;
        if (pass == 0 && warg.isMountSaddled()) {
            this.bindTexture(DRRenderDorwinionPanda.wargSaddle);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    public void createChild(final DREntityDorwinionPanda entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityDorwinionPanda orc = (DREntityDorwinionPanda)entity;
        GL11.glScalef(1.5f, 1.5f, 1.5f);
        if (orc.isMountSaddled()) {
            // Move the saddled player forward
            GL11.glTranslatef(0.0F, 0.0F, -0.2F); // Adjust the third parameter (-0.5F) as needed
        }
    }
    
    static {
        DRRenderDorwinionPanda.wargSaddle = new ResourceLocation("drealm", "mob/dorwinionmounted.png");
        Textures = new ResourceLocation("drealm", "mob/dorwinion.png");
    }
}
