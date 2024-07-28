//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.entity;

import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import drealm.database.*;
import net.minecraft.entity.*;
import lotr.common.*;
import lotr.common.entity.npc.*;
import net.minecraft.init.*;

public class DREntityRedDwarfSmith extends DREntityRedDwarf implements LOTRTradeable.Smith
{
    public static final LOTRTradeEntries RED_DWARF_SMITH_BUY;
    public static final LOTRTradeEntries RED_DWARF_SMITH_SELL;
    
    public DREntityRedDwarfSmith(final World world) {
        super(world);
        this.addTargetTasks(false);
    }
    
    public boolean canTradeWith(final EntityPlayer entityplayer) {
        return LOTRLevelData.getData(entityplayer).getAlignment(this.getFaction()) >= 100.0f && this.isFriendly(entityplayer);
    }
    
    public void dropFewItems(final boolean flag, final int i) {
        super.dropFewItems(flag, i);
        this.dropItem(DRRegistry.redDwarfSteel, 1 + this.rand.nextInt(3) + this.rand.nextInt(i + 1));
    }
    
    public float getAlignmentBonus() {
        return 2.0f;
    }
    
    public LOTRTradeEntries getBuyPool() {
        return DREntityRedDwarfSmith.RED_DWARF_SMITH_BUY;
    }
    
    public LOTRTradeEntries getSellPool() {
        return DREntityRedDwarfSmith.RED_DWARF_SMITH_SELL;
    }
    
    public String getSpeechBank(final EntityPlayer entityplayer) {
        if (!this.isFriendlyAndAligned(entityplayer)) {
            return "redDwarf/dwarf/hostile";
        }
        if (this.canTradeWith(entityplayer)) {
            return "redDwarf/smith/friendly";
        }
        return "redDwarf/smith/neutral";
    }
    
    public void onPlayerTrade(final EntityPlayer entityplayer, final LOTRTradeEntries.TradeType type, final ItemStack itemstack) {
        LOTRLevelData.getData(entityplayer).addAchievement(DRAchievement.tradeRedDwarfSmith);
    }
    
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        this.npcItemsInv.setMeleeWeapon(new ItemStack(LOTRMod.blacksmithHammer));
        this.npcItemsInv.setIdleItem(this.npcItemsInv.getMeleeWeapon());
        return data;
    }
    
    public void setupNPCGender() {
        this.familyInfo.setMale(true);
    }
    
    public boolean shouldTraderRespawn() {
        return true;
    }
    
    static {
        RED_DWARF_SMITH_BUY = new LOTRTradeEntries(LOTRTradeEntries.TradeType.BUY, new LOTRTradeEntry[] { new LOTRTradeEntry(new ItemStack(DRRegistry.redDwarvenTable), 100), new LOTRTradeEntry(new ItemStack(LOTRMod.blacksmithHammer), 18), new LOTRTradeEntry(new ItemStack(LOTRMod.dwarvenRing), 20), new LOTRTradeEntry(new ItemStack(DRRegistry.swordRedDwarven), 16), new LOTRTradeEntry(new ItemStack(DRRegistry.spearRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.battleaxeRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.hammerRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.pikeRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.daggerRedDwarven), 13), new LOTRTradeEntry(new ItemStack(DRRegistry.axeRedDwarven), 15), new LOTRTradeEntry(new ItemStack(DRRegistry.pickaxeRedDwarven), 14), new LOTRTradeEntry(new ItemStack(DRRegistry.shovelRedDwarven), 12), new LOTRTradeEntry(new ItemStack(DRRegistry.mattockRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.throwingAxeRedDwarven), 15), new LOTRTradeEntry(new ItemStack(DRRegistry.helmetRedDwarven), 25), new LOTRTradeEntry(new ItemStack(DRRegistry.bodyRedDwarven), 36), new LOTRTradeEntry(new ItemStack(DRRegistry.legsRedDwarven), 30), new LOTRTradeEntry(new ItemStack(DRRegistry.bootsRedDwarven), 22), new LOTRTradeEntry(new ItemStack(DRRegistry.boarArmorRedDwarven), 25), new LOTRTradeEntry(new ItemStack(DRRegistry.redDwarfBars, 8), 20) });
        RED_DWARF_SMITH_SELL = new LOTRTradeEntries(LOTRTradeEntries.TradeType.SELL, new LOTRTradeEntry[] { new LOTRTradeEntry(new ItemStack(Items.iron_ingot), 3), new LOTRTradeEntry(new ItemStack(DRRegistry.redDwarfSteel), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.rock, 8, 3), 1), new LOTRTradeEntry(new ItemStack(Items.coal, 2, 32767), 1), new LOTRTradeEntry(new ItemStack(Items.gold_ingot), 15), new LOTRTradeEntry(new ItemStack(LOTRMod.copper), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.tin), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.bronze), 3), new LOTRTradeEntry(new ItemStack(Items.string, 3), 1), new LOTRTradeEntry(new ItemStack(LOTRMod.diamond), 25), new LOTRTradeEntry(new ItemStack(LOTRMod.emerald), 15), new LOTRTradeEntry(new ItemStack(LOTRMod.sapphire), 12), new LOTRTradeEntry(new ItemStack(LOTRMod.ruby), 12), new LOTRTradeEntry(new ItemStack(LOTRMod.opal), 10), new LOTRTradeEntry(new ItemStack(LOTRMod.amber), 10), new LOTRTradeEntry(new ItemStack(LOTRMod.amethyst), 8), new LOTRTradeEntry(new ItemStack(LOTRMod.topaz), 8), new LOTRTradeEntry(new ItemStack(LOTRMod.pearl), 25), new LOTRTradeEntry(new ItemStack(Items.cooked_beef), 3), new LOTRTradeEntry(new ItemStack(Items.cooked_porkchop), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.muttonCooked), 3), new LOTRTradeEntry(new ItemStack(Items.cooked_chicken), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.gammon), 3), new LOTRTradeEntry(new ItemStack(Items.cooked_fished), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.rabbitCooked), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.deerCooked), 3), new LOTRTradeEntry(new ItemStack(Items.bread), 2), new LOTRTradeEntry(new ItemStack(Items.lava_bucket), 16) });
    }
}
