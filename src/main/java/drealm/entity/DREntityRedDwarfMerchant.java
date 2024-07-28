//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.entity;

import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import lotr.common.*;
import drealm.database.*;
import lotr.common.entity.npc.*;
import net.minecraft.init.*;

public class DREntityRedDwarfMerchant extends DREntityRedDwarf implements LOTRTravellingTrader
{
    public static final LOTRTradeEntries RED_DWARF_MERCHANT_BUY;
    public static final LOTRTradeEntries RED_DWARF_MERCHANT_SELL;
    
    public DREntityRedDwarfMerchant(final World world) {
        super(world);
        this.addTargetTasks(false);
    }
    
    public boolean canTradeWith(final EntityPlayer entityplayer) {
        return LOTRLevelData.getData(entityplayer).getAlignment(this.getFaction()) >= 0.0f && this.isFriendly(entityplayer);
    }
    
    public LOTREntityNPC createTravellingEscort() {
        return (LOTREntityNPC)new DREntityRedDwarf(this.worldObj);
    }
    
    public float getAlignmentBonus() {
        return 2.0f;
    }
    
    public LOTRTradeEntries getBuyPool() {
        return DREntityRedDwarfMerchant.RED_DWARF_MERCHANT_BUY;
    }
    
    public String getDepartureSpeech() {
        return "redDwarf/merchant/departure";
    }
    
    public LOTRTradeEntries getSellPool() {
        return DREntityRedDwarfMerchant.RED_DWARF_MERCHANT_SELL;
    }
    
    public String getSpeechBank(final EntityPlayer entityplayer) {
        if (this.isFriendlyAndAligned(entityplayer)) {
            return "redDwarf/merchant/friendly";
        }
        return "redDwarf/dwarf/hostile";
    }
    
    public void onPlayerTrade(final EntityPlayer entityplayer, final LOTRTradeEntries.TradeType type, final ItemStack itemstack) {
        LOTRLevelData.getData(entityplayer).addAchievement(DRAchievement.tradeRedDwarfMerchant);
    }
    
    public boolean shouldTraderRespawn() {
        return false;
    }
    
    static {
        RED_DWARF_MERCHANT_BUY = new LOTRTradeEntries(LOTRTradeEntries.TradeType.BUY, new LOTRTradeEntry[] { new LOTRTradeEntry(new ItemStack(LOTRMod.dwarvenForge), 40), new LOTRTradeEntry(new ItemStack(LOTRMod.dwarvenRing), 16), new LOTRTradeEntry(new ItemStack(DRRegistry.swordRedDwarven), 16), new LOTRTradeEntry(new ItemStack(DRRegistry.spearRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.battleaxeRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.hammerRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.pikeRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.daggerRedDwarven), 13), new LOTRTradeEntry(new ItemStack(DRRegistry.axeRedDwarven), 15), new LOTRTradeEntry(new ItemStack(DRRegistry.pickaxeRedDwarven), 14), new LOTRTradeEntry(new ItemStack(DRRegistry.shovelRedDwarven), 12), new LOTRTradeEntry(new ItemStack(DRRegistry.mattockRedDwarven), 18), new LOTRTradeEntry(new ItemStack(DRRegistry.throwingAxeRedDwarven), 15), new LOTRTradeEntry(new ItemStack(DRRegistry.helmetRedDwarven), 25), new LOTRTradeEntry(new ItemStack(DRRegistry.bodyRedDwarven), 36), new LOTRTradeEntry(new ItemStack(DRRegistry.legsRedDwarven), 30), new LOTRTradeEntry(new ItemStack(DRRegistry.bootsRedDwarven), 22), new LOTRTradeEntry(new ItemStack(LOTRMod.mugDwarvenAle, 1, 9999), 9), new LOTRTradeEntry(new ItemStack(LOTRMod.mugDwarvenTonic, 1, 9999), 14), (LOTRTradeEntry)new LOTRTradeEntryBarrel(new ItemStack(LOTRMod.mugDwarvenAle, 1, 2), 120), (LOTRTradeEntry)new LOTRTradeEntryBarrel(new ItemStack(LOTRMod.mugDwarvenAle, 1, 3), 160), new LOTRTradeEntry(new ItemStack(LOTRMod.dwarfHerb), 10), new LOTRTradeEntry(new ItemStack(Items.glowstone_dust, 4), 2), new LOTRTradeEntry(new ItemStack(LOTRMod.brick3, 1, 12), 4), new LOTRTradeEntry(new ItemStack(LOTRMod.rock, 8, 4), 2), new LOTRTradeEntry(new ItemStack(LOTRMod.emerald), 25), new LOTRTradeEntry(new ItemStack(LOTRMod.ruby), 20), new LOTRTradeEntry(new ItemStack(LOTRMod.amethyst), 12), new LOTRTradeEntry(new ItemStack(LOTRMod.topaz), 12) });
        RED_DWARF_MERCHANT_SELL = new LOTRTradeEntries(LOTRTradeEntries.TradeType.SELL, new LOTRTradeEntry[] { new LOTRTradeEntry(new ItemStack(Items.iron_ingot), 3), new LOTRTradeEntry(new ItemStack(Items.coal, 2, 32767), 1), new LOTRTradeEntry(new ItemStack(Items.gold_ingot), 15), new LOTRTradeEntry(new ItemStack(LOTRMod.copper), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.tin), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.bronze), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.diamond), 25), new LOTRTradeEntry(new ItemStack(LOTRMod.sapphire), 12), new LOTRTradeEntry(new ItemStack(LOTRMod.opal), 10), new LOTRTradeEntry(new ItemStack(LOTRMod.pearl), 25), new LOTRTradeEntry(new ItemStack(Items.cooked_beef), 3), new LOTRTradeEntry(new ItemStack(Items.cooked_porkchop), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.muttonCooked), 3), new LOTRTradeEntry(new ItemStack(Items.cooked_chicken), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.gammon), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.deerCooked), 3), new LOTRTradeEntry(new ItemStack(Items.cooked_fished), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.rabbitCooked), 3), new LOTRTradeEntry(new ItemStack(Items.bread), 2) });
    }
}
