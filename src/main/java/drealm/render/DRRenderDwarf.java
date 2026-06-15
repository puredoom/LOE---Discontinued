//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import lotr.client.render.entity.*;
import net.minecraft.util.*;
import lotr.client.model.*;
import net.minecraft.client.model.*;
import lotr.common.entity.npc.*;
import lotr.common.entity.*;
import drealm.entity.*;
import org.lwjgl.opengl.*;
import lotr.common.*;
import net.minecraft.entity.*;

public class DRRenderDwarf extends LOTRRenderBiped
{
    public static LOTRRandomSkins dwarfSkinsMale;
    public static LOTRRandomSkins dwarfSkinsFemale;
    public static LOTRRandomSkins blueDwarfSkinsMale;
    public static LOTRRandomSkins blueDwarfSkinsFemale;
    public static LOTRRandomSkins redDwarfSkinsMale;
    public static LOTRRandomSkins redDwarfSkinsFemale;
    public static LOTRRandomSkins windDwarfSkinsMale;
    public static LOTRRandomSkins windDwarfSkinsFemale;
    public static ResourceLocation ringTexture;
    protected ModelBiped standardRenderPassModel;
    
    public DRRenderDwarf() {
        super((ModelBiped)new LOTRModelDwarf(), 0.5f);
        this.setRenderPassModel((ModelBase)(this.standardRenderPassModel = (ModelBiped)new LOTRModelDwarf(0.5f, 64, 64)));
        DRRenderDwarf.dwarfSkinsMale = LOTRRandomSkins.loadSkinsList("lotr:mob/dwarf/dwarf_male");
        DRRenderDwarf.dwarfSkinsFemale = LOTRRandomSkins.loadSkinsList("lotr:mob/dwarf/dwarf_female");
        DRRenderDwarf.blueDwarfSkinsMale = LOTRRandomSkins.loadSkinsList("lotr:mob/dwarf/blueMountains_male");
        DRRenderDwarf.blueDwarfSkinsFemale = LOTRRandomSkins.loadSkinsList("lotr:mob/dwarf/blueMountains_female");
        DRRenderDwarf.redDwarfSkinsMale = LOTRRandomSkins.loadSkinsList("drealm:mob/dwarf/redMountains_male");
        DRRenderDwarf.redDwarfSkinsFemale = LOTRRandomSkins.loadSkinsList("drealm:mob/dwarf/redMountains_female");
        DRRenderDwarf.windDwarfSkinsMale = LOTRRandomSkins.loadSkinsList("drealm:mob/dwarf/windMountains_male");
        DRRenderDwarf.windDwarfSkinsFemale = LOTRRandomSkins.loadSkinsList("drealm:mob/dwarf/windMountains_female");
    }
    
    public void func_82421_b() {
        this.field_82423_g = (ModelBiped)new LOTRModelDwarf(1.0f);
        this.field_82425_h = (ModelBiped)new LOTRModelDwarf(0.5f);
    }
    
    public ResourceLocation getEntityTexture(final Entity entity) {
        final LOTREntityDwarf dwarf = (LOTREntityDwarf)entity;
        if (dwarf instanceof LOTREntityBlueDwarf) {
            if (dwarf.familyInfo.isMale()) {
                return DRRenderDwarf.blueDwarfSkinsMale.getRandomSkin((LOTRRandomSkinEntity)dwarf);
            }
            return DRRenderDwarf.blueDwarfSkinsFemale.getRandomSkin((LOTRRandomSkinEntity)dwarf);
        }
        else if (dwarf instanceof DREntityRedDwarf) {
            if (dwarf.familyInfo.isMale()) {
                return DRRenderDwarf.redDwarfSkinsMale.getRandomSkin((LOTRRandomSkinEntity)dwarf);
            }
            return DRRenderDwarf.redDwarfSkinsFemale.getRandomSkin((LOTRRandomSkinEntity)dwarf);
        }
        else if (dwarf instanceof DREntityDwarf) {
            if (dwarf.familyInfo.isMale()) {
                return DRRenderDwarf.windDwarfSkinsMale.getRandomSkin((LOTRRandomSkinEntity)dwarf);
            }
            return DRRenderDwarf.windDwarfSkinsFemale.getRandomSkin((LOTRRandomSkinEntity)dwarf);
        }
        else {
            if (dwarf.familyInfo.isMale()) {
                return DRRenderDwarf.dwarfSkinsMale.getRandomSkin((LOTRRandomSkinEntity)dwarf);
            }
            return DRRenderDwarf.dwarfSkinsFemale.getRandomSkin((LOTRRandomSkinEntity)dwarf);
        }
    }
    
    public float getHeldItemYTranslation() {
        return 0.125f;
    }
    
    public void preRenderCallback(final EntityLivingBase entity, final float f) {
        super.preRenderCallback(entity, f);
        GL11.glScalef(0.8125f, 0.8125f, 0.8125f);
        if (LOTRMod.isAprilFools()) {
            GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        }
    }
    
    public int shouldRenderPass(final EntityLiving entity, final int pass, final float f) {
        final LOTREntityDwarf dwarf = (LOTREntityDwarf)entity;
        if (pass == 1 && dwarf.getClass() == dwarf.familyInfo.marriageEntityClass && dwarf.getEquipmentInSlot(4) != null && dwarf.getEquipmentInSlot(4).getItem() == dwarf.familyInfo.marriageRing) {
            this.bindTexture(DRRenderDwarf.ringTexture);
            this.setRenderPassModel((ModelBase)this.standardRenderPassModel);
            ((ModelBiped)this.renderPassModel).bipedRightArm.showModel = false;
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    static {
        DRRenderDwarf.ringTexture = new ResourceLocation("lotr:mob/dwarf/ring.png");
    }
}
