//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.entity;

import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import lotr.common.*;
import net.minecraft.entity.ai.*;
import lotr.common.entity.ai.*;
import lotr.common.world.spawning.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import drealm.database.*;
import lotr.common.entity.npc.*;
import lotr.common.entity.animal.*;

public class DREntityRedDwarfCommander extends DREntityRedDwarfWarrior implements LOTRUnitTradeable
{
    public static final LOTRUnitTradeEntries RED_DWARF_COMMANDER;
    
    public DREntityRedDwarfCommander(final World world) {
        super(world);
        this.addTargetTasks(false);
    }
    
    public void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0);
    }
    
    public boolean canTradeWith(final EntityPlayer entityplayer) {
        return LOTRLevelData.getData(entityplayer).getAlignment(this.getFaction()) >= 200.0f && this.isFriendly(entityplayer);
    }
    
    @Override
    public float getAlignmentBonus() {
        return 5.0f;
    }
    
    public EntityAIBase getDwarfAttackAI() {
        return (EntityAIBase)new LOTREntityAIAttackOnCollide((EntityCreature)this, 1.6, false);
    }
    
    public String getSpeechBank(final EntityPlayer entityplayer) {
        if (!this.isFriendlyAndAligned(entityplayer)) {
            return "redDwarf/dwarf/hostile";
        }
        if (this.canTradeWith(entityplayer)) {
            return "redDwarf/commander/friendly";
        }
        return "redDwarf/commander/neutral";
    }
    
    public LOTRUnitTradeEntries getUnits() {
        return DREntityRedDwarfCommander.RED_DWARF_COMMANDER;
    }
    
    public LOTRInvasions getWarhorn() {
        return DRInvasions.RED_MOUNTAINS;
    }
    
    @Override
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.hammerRedDwarven));
        this.npcItemsInv.setIdleItem(this.npcItemsInv.getMeleeWeapon());
        this.setCurrentItemOrArmor(1, new ItemStack(DRRegistry.bootsRedDwarven));
        this.setCurrentItemOrArmor(2, new ItemStack(DRRegistry.legsRedDwarven));
        this.setCurrentItemOrArmor(3, new ItemStack(DRRegistry.bodyRedDwarven));
        this.setCurrentItemOrArmor(4, (ItemStack)null);
        return data;
    }
    
    public void onUnitTrade(final EntityPlayer entityplayer) {
        LOTRLevelData.getData(entityplayer).addAchievement(DRAchievement.tradeRedDwarfCommander);
    }
    
    public boolean shouldTraderRespawn() {
        return true;
    }
    
    static {
        RED_DWARF_COMMANDER = new LOTRUnitTradeEntries(200.0f, new LOTRUnitTradeEntry[] { new LOTRUnitTradeEntry((Class)DREntityRedDwarf.class, 20, 0.0f), new LOTRUnitTradeEntry((Class)DREntityRedDwarfWarrior.class, 30, 50.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF), new LOTRUnitTradeEntry((Class)DREntityRedDwarfAxeThrower.class, 50, 100.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF), new LOTRUnitTradeEntry((Class)DREntityRedDwarfFireThrower.class, 50, 100.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF), new LOTRUnitTradeEntry((Class)DREntityRedDwarfWarrior.class, (Class)LOTREntityWildBoar.class, "RedDwarfWarrior_Boar", 50, 150.0f).setMountArmor(DRRegistry.boarArmorRedDwarven).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF), new LOTRUnitTradeEntry((Class)DREntityRedDwarfAxeThrower.class, (Class)LOTREntityWildBoar.class, "RedDwarfAxeThrower_Boar", 70, 200.0f).setMountArmor(DRRegistry.boarArmorRedDwarven).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF), new LOTRUnitTradeEntry((Class)DREntityRedDwarfBannerBearer.class, 50, 200.0f).setPledgeType(LOTRUnitTradeEntry.PledgeType.ANY_DWARF) });
    }
}
