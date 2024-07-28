//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.entity;

import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import lotr.common.world.structure.*;
import lotr.common.*;
import net.minecraft.item.*;
import net.minecraft.entity.*;
import drealm.database.*;
import lotr.common.entity.npc.*;
import net.minecraft.init.*;

public class DREntityRedDwarfMiner extends DREntityRedDwarf implements LOTRTradeable
{
    public static final LOTRTradeEntries RED_DWARF_MINER_BUY;
    public static final LOTRTradeEntries RED_DWARF_MINER_SELL;
    
    public DREntityRedDwarfMiner(final World world) {
        super(world);
    }
    
    public boolean canDwarfSpawnAboveGround() {
        return false;
    }
    
    public boolean canTradeWith(final EntityPlayer entityplayer) {
        return LOTRLevelData.getData(entityplayer).getAlignment(this.getFaction()) >= 100.0f && this.isFriendly(entityplayer);
    }
    
    public void dropFewItems(final boolean flag, final int i) {
        super.dropFewItems(flag, i);
        if (flag) {
            if (this.rand.nextInt(4) == 0) {
                this.dropChestContents(LOTRChestContents.DWARVEN_MINE_CORRIDOR, 1, 2 + i);
            }
            if (this.rand.nextInt(15) == 0) {
                this.entityDropItem(new ItemStack(LOTRMod.mithrilNugget), 0.0f);
            }
        }
    }
    
    public float getAlignmentBonus() {
        return 2.0f;
    }
    
    public LOTRTradeEntries getBuyPool() {
        return DREntityRedDwarfMiner.RED_DWARF_MINER_BUY;
    }
    
    public LOTRTradeEntries getSellPool() {
        return DREntityRedDwarfMiner.RED_DWARF_MINER_SELL;
    }
    
    public String getSpeechBank(final EntityPlayer entityplayer) {
        if (!this.isFriendlyAndAligned(entityplayer)) {
            return "redDwarf/dwarf/hostile";
        }
        if (this.canTradeWith(entityplayer)) {
            return "redDwarf/miner/friendly";
        }
        return "redDwarf/miner/neutral";
    }
    
    public void onPlayerTrade(final EntityPlayer entityplayer, final LOTRTradeEntries.TradeType type, final ItemStack itemstack) {
        LOTRLevelData.getData(entityplayer).addAchievement(DRAchievement.tradeRedDwarfMiner);
    }
    
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.pickaxeRedDwarven));
        this.npcItemsInv.setIdleItem(this.npcItemsInv.getMeleeWeapon());
        return data;
    }
    
    public boolean shouldTraderRespawn() {
        return false;
    }
    
    static {
        RED_DWARF_MINER_BUY = new LOTRTradeEntries(LOTRTradeEntries.TradeType.BUY, new LOTRTradeEntry[] { new LOTRTradeEntry(new ItemStack(Items.coal, 2), 4), new LOTRTradeEntry(new ItemStack(Blocks.iron_ore), 8), new LOTRTradeEntry(new ItemStack(LOTRMod.oreCopper), 7), new LOTRTradeEntry(new ItemStack(LOTRMod.oreTin), 7), new LOTRTradeEntry(new ItemStack(LOTRMod.oreSilver), 12), new LOTRTradeEntry(new ItemStack(Blocks.gold_ore), 22), new LOTRTradeEntry(new ItemStack(Items.glowstone_dust, 4), 3), new LOTRTradeEntry(new ItemStack(Blocks.cobblestone, 8), 1), new LOTRTradeEntry(new ItemStack(Items.lava_bucket), 20), new LOTRTradeEntry(new ItemStack(Items.flint), 2), new LOTRTradeEntry(new ItemStack(LOTRMod.sulfur), 6), new LOTRTradeEntry(new ItemStack(LOTRMod.saltpeter), 6), new LOTRTradeEntry(new ItemStack(LOTRMod.diamond), 40), new LOTRTradeEntry(new ItemStack(LOTRMod.emerald), 25), new LOTRTradeEntry(new ItemStack(LOTRMod.sapphire), 20), new LOTRTradeEntry(new ItemStack(LOTRMod.ruby), 20), new LOTRTradeEntry(new ItemStack(LOTRMod.opal), 15), new LOTRTradeEntry(new ItemStack(LOTRMod.amber), 15), new LOTRTradeEntry(new ItemStack(LOTRMod.amethyst), 12), new LOTRTradeEntry(new ItemStack(LOTRMod.topaz), 12) });
        RED_DWARF_MINER_SELL = new LOTRTradeEntries(LOTRTradeEntries.TradeType.SELL, new LOTRTradeEntry[] { new LOTRTradeEntry(new ItemStack(Items.cooked_beef), 3), new LOTRTradeEntry(new ItemStack(Items.cooked_porkchop), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.muttonCooked), 3), new LOTRTradeEntry(new ItemStack(Items.cooked_chicken), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.gammon), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.deerCooked), 3), new LOTRTradeEntry(new ItemStack(Items.cooked_fished), 3), new LOTRTradeEntry(new ItemStack(LOTRMod.rabbitCooked), 3), new LOTRTradeEntry(new ItemStack(Items.bread), 2), new LOTRTradeEntry(new ItemStack(LOTRMod.mugAle, 1, 32767), 8), new LOTRTradeEntry(new ItemStack(LOTRMod.mugMead, 1, 32767), 8), new LOTRTradeEntry(new ItemStack(LOTRMod.mugCider, 1, 32767), 8), new LOTRTradeEntry(new ItemStack(LOTRMod.mugPerry, 1, 32767), 8), new LOTRTradeEntry(new ItemStack(LOTRMod.mugDwarvenAle, 1, 32767), 12), new LOTRTradeEntry(new ItemStack(DRRegistry.pickaxeRedDwarven), 10) });
    }
}
