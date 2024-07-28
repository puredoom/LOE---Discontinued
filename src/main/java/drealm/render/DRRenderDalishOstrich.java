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

public class DRRenderDalishOstrich extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private DRModelDalishOstrichArmor saddleModel;
    private static final ResourceLocation Textures;

    public DRRenderDalishOstrich() {
        super((ModelBase)new DRModelDalishOstrich(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new DRModelDalishOstrichArmor()));
    }

    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityDalishOstrich deer = (DREntityDalishOstrich)entity;
        final ResourceLocation deerSkin = DRRenderDalishOstrich.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }

    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityDalishOstrich warg = (DREntityDalishOstrich)entity;
        if (pass == 0 && warg.isMountSaddled()) {
            this.bindTexture(DRRenderDalishOstrich.wargSaddle);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }

    public void createChild(final DREntityDalishOstrich entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }

    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityDalishOstrich orc = (DREntityDalishOstrich)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }

    static {
        DRRenderDalishOstrich.wargSaddle = new ResourceLocation("drealm", "mob/dalemounted.png");
        Textures = new ResourceLocation("drealm", "mob/dale.png");
    }
}
