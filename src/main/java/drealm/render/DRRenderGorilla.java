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

public class DRRenderGorilla extends RenderLiving
{
    private static ResourceLocation wargSaddle;
    private GorillaMounted saddleModel;
    private static final ResourceLocation Textures;
    
    public DRRenderGorilla() {
        super((ModelBase)new DRModelGorilla(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.saddleModel = new GorillaMounted()));
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final DREntityGorilla deer = (DREntityGorilla)entity;
        final ResourceLocation deerSkin = DRRenderGorilla.Textures;
        return LOTRRenderHorse.getLayeredMountTexture((LOTRNPCMount)deer, deerSkin);
    }
    
    protected int shouldRenderPass(final EntityLivingBase entity, final int pass, final float f) {
        final DREntityGorilla warg = (DREntityGorilla)entity;
        if (pass == 0 && warg.isMountSaddled()) {
            this.bindTexture(DRRenderGorilla.wargSaddle);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    public void createChild(final DREntityGorilla entity, final float f) {
        if (entity.isChild()) {
            GL11.glScalef(-0.5f, -0.5f, -0.5f);
        }
    }


    protected void preRenderCallback(final EntityLivingBase entity, final float f) {
        final DREntityGorilla orc = (DREntityGorilla)entity;
        GL11.glScalef(1.0f, 1.0f, 1.0f);
    }
    
    static {
        DRRenderGorilla.wargSaddle = new ResourceLocation("drealm:armor/mount/armorgorilla.png");
        Textures = new ResourceLocation("drealm", "mob/gorilla.png");
    }
}
