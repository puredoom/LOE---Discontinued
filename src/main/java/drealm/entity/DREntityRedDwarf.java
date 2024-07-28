//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.entity;

import net.minecraft.world.*;
import lotr.common.entity.npc.*;
import lotr.common.quest.*;
import lotr.common.fac.*;
import lotr.common.world.structure.*;
import drealm.database.*;
import lotr.common.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;

public class DREntityRedDwarf extends LOTREntityDwarf
{
    public DREntityRedDwarf(final World world) {
        super(world);
        this.familyInfo.marriageEntityClass = DREntityRedDwarf.class;
        this.familyInfo.marriageAchievement = DRAchievement.marryRedDwarf;
    }
    
    public LOTRMiniQuest createMiniQuest() {
        return DRMiniQuestFactory.RED_MOUNTAINS.createQuest((LOTREntityNPC)this);
    }
    
    public float getAlignmentBonus() {
        return 1.0f;
    }
    
    public LOTRMiniQuestFactory getBountyHelpSpeechDir() {
        return DRMiniQuestFactory.RED_MOUNTAINS;
    }
    
    public LOTRFoods getDwarfFoods() {
        return DRFoods.RED_DWARF;
    }
    
    public Item getDwarfSteelDrop() {
        return DRRegistry.redDwarfSteel;
    }
    
    public LOTRFaction getFaction() {
        return DRFaction.RED_MOUNTAINS;
    }
    
    public LOTRChestContents getGenericDrops() {
        return DRChestContents.RED_MOUNTAINS_STRONGHOLD;
    }
    
    public LOTRAchievement getKillAchievement() {
        return DRAchievement.killRedDwarf;
    }
    
    public LOTRChestContents getLarderDrops() {
        return DRChestContents.RED_DWARF_HOUSE_LARDER;
    }
    
    public String getSpeechBank(final EntityPlayer entityplayer) {
        if (!this.isFriendlyAndAligned(entityplayer)) {
            return this.isChild() ? "redDwarf/child/hostile" : "redDwarf/dwarf/hostile";
        }
        if (this.hiredNPCInfo.getHiringPlayer() == entityplayer) {
            return "redDwarf/dwarf/hired";
        }
        return this.isChild() ? "redDwarf/child/friendly" : "redDwarf/dwarf/friendly";
    }
    
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.daggerRedDwarven));
        this.npcItemsInv.setIdleItem((ItemStack)null);
        return data;
    }
}
