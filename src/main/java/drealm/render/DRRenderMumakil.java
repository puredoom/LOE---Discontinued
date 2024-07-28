//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import drealm.model.*;
import net.minecraft.client.model.*;
import drealm.entity.*;
import lotr.client.render.entity.*;
import lotr.common.entity.npc.*;
import net.minecraft.entity.*;
import org.lwjgl.opengl.*;

public class DRRenderMumakil extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelMumakilArmor saddleModel;
    private static final ResourceLocation Textures;
    
    public DRRenderMumakil() {
        super((ModelBase)new DRModelMumakil(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelMumakilArmor()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityMumakil deer = (DREntityMumakil)entity;
        final ResourceLocation deerSkin = DRRenderMumakil.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }
    
    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityMumakil warg = (DREntityMumakil)entity;
        if (pass == 0 && warg.isMountSaddled()) {
            this.bindTexture(DRRenderMumakil.wargSaddle);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    public void createChild(final DREntityMumakil entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }
    
    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityMumakil orc = (DREntityMumakil)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
        if (orc.isMountSaddled()) {
            // Move the saddled player forward
            GL11.glTranslatef(0.0F, 0.0F, -3.5F); // Adjust the third parameter (-0.5F) as needed
        }
    }
    
    static {
        DRRenderMumakil.wargSaddle = new ResourceLocation("drealm:armor/mount/armormumakil.png");
        Textures = new ResourceLocation("drealm", "mob/mumakil.png");
    }
}
