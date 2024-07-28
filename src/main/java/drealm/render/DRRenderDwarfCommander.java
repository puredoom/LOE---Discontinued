//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import net.minecraft.util.*;
import lotr.client.model.*;
import lotr.common.entity.npc.*;
import net.minecraft.entity.*;
import net.minecraft.client.model.*;

public class DRRenderDwarfCommander extends DRRenderDwarf
{
    public static ResourceLocation cloak;
    public static ResourceLocation blueCloak;
    private LOTRModelDwarf cloakModel;
    
    public DRRenderDwarfCommander() {
        this.cloakModel = new LOTRModelDwarf(1.5f);
    }
    
    public ResourceLocation getCloakTexture(final EntityLivingBase entity) {
        return (entity instanceof LOTREntityBlueDwarf) ? DRRenderDwarfCommander.blueCloak : DRRenderDwarfCommander.cloak;
    }
    
    public int shouldRenderPass(final EntityLiving entity, final int pass, final float f) {
        if (pass == 0) {
            this.bindTexture(this.getCloakTexture((EntityLivingBase)entity));
            this.cloakModel.bipedHead.showModel = false;
            this.cloakModel.bipedHeadwear.showModel = false;
            this.cloakModel.bipedBody.showModel = true;
            this.cloakModel.bipedRightArm.showModel = true;
            this.cloakModel.bipedLeftArm.showModel = true;
            this.cloakModel.bipedRightLeg.showModel = false;
            this.cloakModel.bipedLeftLeg.showModel = false;
            this.setRenderPassModel((ModelBase)this.cloakModel);
            this.cloakModel.onGround = this.mainModel.onGround;
            this.cloakModel.isRiding = this.mainModel.isRiding;
            this.cloakModel.isChild = this.mainModel.isChild;
            this.cloakModel.heldItemRight = this.modelBipedMain.heldItemRight;
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    static {
        DRRenderDwarfCommander.cloak = new ResourceLocation("lotr:mob/dwarf/commander_cloak.png");
        DRRenderDwarfCommander.blueCloak = new ResourceLocation("lotr:mob/dwarf/blueMountains_commander_cloak.png");
    }
}
