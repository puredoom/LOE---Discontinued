//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.structure;

import lotr.common.world.structure2.*;
import net.minecraft.world.*;
import lotr.common.entity.npc.*;
import drealm.entity.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import drealm.database.*;
import lotr.common.*;

public class DRStructureRedMountainsHouse extends LOTRWorldGenDwarfHouse
{
    public DRStructureRedMountainsHouse(final boolean flag) {
        super(flag);
    }
    
    public LOTREntityDwarf createDwarf(final World world) {
        return (LOTREntityDwarf)new DREntityRedDwarf(world);
    }
    
    public ItemStack getRandomOtherItem(final Random random) {
        final ItemStack[] items = { new ItemStack(DRRegistry.helmetRedDwarven), new ItemStack(DRRegistry.bodyRedDwarven), new ItemStack(DRRegistry.legsRedDwarven), new ItemStack(DRRegistry.bootsRedDwarven), new ItemStack(DRRegistry.redDwarfSteel), new ItemStack(LOTRMod.bronze), new ItemStack(Items.iron_ingot), new ItemStack(LOTRMod.silver), new ItemStack(LOTRMod.silverNugget), new ItemStack(Items.gold_ingot), new ItemStack(Items.gold_nugget) };
        return items[random.nextInt(items.length)].copy();
    }
    
    public ItemStack getRandomWeaponItem(final Random random) {
        final ItemStack[] items = { new ItemStack(DRRegistry.swordRedDwarven), new ItemStack(DRRegistry.daggerRedDwarven), new ItemStack(DRRegistry.hammerRedDwarven), new ItemStack(DRRegistry.battleaxeRedDwarven), new ItemStack(DRRegistry.pickaxeRedDwarven), new ItemStack(DRRegistry.mattockRedDwarven), new ItemStack(DRRegistry.throwingAxeRedDwarven), new ItemStack(DRRegistry.pikeRedDwarven) };
        return items[random.nextInt(items.length)].copy();
    }
    
    public void setupRandomBlocks(final Random random) {
        super.setupRandomBlocks(random);
        this.stoneBlock = Blocks.stone;
        this.stoneMeta = 0;
        this.fillerBlock = LOTRMod.rock;
        this.fillerMeta = 4;
        this.topBlock = LOTRMod.rock;
        this.topMeta = 4;
        this.brick2Block = LOTRMod.brick2;
        this.brick2Meta = 2;
        this.pillarBlock = LOTRMod.pillar;
        this.pillarMeta = 4;
        this.chandelierBlock = DRRegistry.chandelier;
        this.chandelierMeta = 0;
        this.tableBlock = DRRegistry.redDwarvenTable;
        this.barsBlock = DRRegistry.redDwarfBars;
        this.larderContents = DRChestContents.RED_DWARF_HOUSE_LARDER;
        this.personalContents = DRChestContents.RED_MOUNTAINS_STRONGHOLD;
        this.plateFoods = DRFoods.RED_DWARF;
        this.drinkFoods = LOTRFoods.DWARF_DRINK;
    }
}
