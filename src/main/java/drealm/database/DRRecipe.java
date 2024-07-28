//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import net.minecraft.item.crafting.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;
import lotr.common.*;
import net.minecraftforge.oredict.*;
import drealm.item.*;
import net.minecraft.init.*;
import lotr.common.recipe.*;
import java.util.*;

public class DRRecipe
{
    public static List<IRecipe> redMountains;
    public static List<IRecipe> windMountains;
    
    public static void createOtherRecipes() {
        GameRegistry.addRecipe(new ItemStack(DRRegistry.wall, 6, 0), new Object[] { "XXX", "XXX", 'X', new ItemStack(DRRegistry.brick, 1, 0) });
        GameRegistry.addRecipe(new ItemStack(DRRegistry.slabSingle, 6, 0), new Object[] { "XXX", 'X', new ItemStack(DRRegistry.brick, 1, 0) });
        GameRegistry.addRecipe(new ItemStack(DRRegistry.pillar, 3, 0), new Object[] { "X", "X", "X", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 9) });
        GameRegistry.addRecipe(new ItemStack(DRRegistry.brick, 1, 1), new Object[] { "XX", "XX", 'X', new ItemStack(DRRegistry.brick, 4, 0) });
        GameRegistry.addRecipe(new ItemStack(DRRegistry.brick, 4, 0), new Object[] { "XX", "XX", 'X', new ItemStack(Blocks.stained_hardened_clay, 1, 9) });
        GameRegistry.addRecipe(new ItemStack(DRRegistry.oreStorage, 1, 1), new Object[] { "XXX", "XXX", "XXX", 'X', DRRegistry.redDwarfSteel });
        GameRegistry.addShapelessRecipe(new ItemStack(DRRegistry.redDwarfSteel, 9), new Object[] { new ItemStack(DRRegistry.oreStorage, 1, 1) });
    }
    
    public static void createRedMountainsRecipes() {
        DRRecipe.redMountains.add((IRecipe)new ShapelessOreRecipe(new ItemStack(DRRegistry.redDwarfSteel, 1), new Object[] { new ItemStack(LOTRMod.rock, 1, 4), "ingotIron" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.daggerRedDwarvenPoisoned), new Object[] { " ", "Y", "X", 'X', DRRegistry.daggerRedDwarven, 'Y', LOTRMod.bottlePoison }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.daggerRedDwarvenPoisoned), new Object[] { "Y", "X", " ", 'X', DRRegistry.daggerRedDwarven, 'Y', LOTRMod.bottlePoison }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.redDwarvenTable), new Object[] { "XX", "YY", 'X', "plankWood", 'Y', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.shovelRedDwarven), new Object[] { "X", "Y", "Y", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.pickaxeRedDwarven), new Object[] { "XXX", " Y ", " Y ", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.axeRedDwarven), new Object[] { "XX", "XY", " Y", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.swordRedDwarven), new Object[] { "X", "X", "Y", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.hoeRedDwarven), new Object[] { "XX", " Y", " Y", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.daggerRedDwarven), new Object[] { "X", "Y", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.battleaxeRedDwarven), new Object[] { "XXX", "XYX", " Y ", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.hammerRedDwarven), new Object[] { "XYX", "XYX", " Y ", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.helmetRedDwarven), new Object[] { "XXX", "X X", 'X', DRRegistry.redDwarfSteel }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.bodyRedDwarven), new Object[] { "X X", "XXX", "XXX", 'X', DRRegistry.redDwarfSteel }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.legsRedDwarven), new Object[] { "XXX", "X X", "X X", 'X', DRRegistry.redDwarfSteel }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.bootsRedDwarven), new Object[] { "X X", "X X", 'X', DRRegistry.redDwarfSteel }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.throwingAxeRedDwarven), new Object[] { " X ", " YX", "Y  ", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.chandelier, 0, 8), new Object[] { " X ", "YZY", 'X', "stickWood", 'Y', Blocks.torch, 'Z', DRRegistry.redDwarfSteel }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.mattockRedDwarven), new Object[] { "XXX", "XY ", " Y ", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.banner, 1, DRItemBanner.RED_MOUNTAINS.bannerID), new Object[] { "X", "Y", "Z", 'X', Blocks.wool, 'Y', "stickWood", 'Z', "plankWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.spearRedDwarven), new Object[] { "  X", " Y ", "Y  ", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.redDwarfBars, 16), new Object[] { "XXX", "XXX", 'X', DRRegistry.redDwarfSteel }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.boarArmorRedDwarven), new Object[] { "X  ", "XYX", "XXX", 'X', DRRegistry.redDwarfSteel, 'Y', Items.leather }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(DRRegistry.pikeRedDwarven), new Object[] { "  X", " YX", "Y  ", 'X', DRRegistry.redDwarfSteel, 'Y', "stickWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.gateDwarven, 4), new Object[] { "ZYZ", "YXY", "ZYZ", 'X', LOTRMod.gateGear, 'Y', new ItemStack(LOTRMod.brick, 1, 6), 'Z', DRRegistry.redDwarfSteel }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.mechanism), new Object[] { " X ", "YZY", " X ", 'X', "ingotCopper", 'Y', Items.flint, 'Z', DRRegistry.redDwarfSteel }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.brick, 4, 6), new Object[] { "XX", "XX", 'X', Blocks.stone }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.stairsDwarvenBrick, 4), new Object[] { "X  ", "XX ", "XXX", 'X', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.slabSingle, 6, 7), new Object[] { "XXX", 'X', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.wall, 6, 7), new Object[] { "XXX", "XXX", 'X', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.pillar, 3, 0), new Object[] { "X", "X", "X", 'X', Blocks.stone }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.dwarvenForge), new Object[] { "XXX", "X X", "XXX", 'X', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.slabSingle2, 6, 0), new Object[] { "XXX", 'X', new ItemStack(LOTRMod.pillar, 1, 0) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.dwarvenDoor), new Object[] { "XX", "XX", "XX", 'X', Blocks.stone }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.dwarvenDoorIthildin), new Object[] { "XX", "XY", "XX", 'X', Blocks.stone, 'Y', new ItemStack(LOTRMod.ithildin, 1, 0) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.dwarvenBedItem), new Object[] { "XXX", "YYY", 'X', Blocks.wool, 'Y', "plankWood" }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.brick, 1, 8), new Object[] { " X ", "XYX", " X ", 'X', "nuggetSilver", 'Y', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.brick, 1, 9), new Object[] { " X ", "XYX", " X ", 'X', "nuggetGold", 'Y', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.brick, 1, 10), new Object[] { " X ", "XYX", " X ", 'X', LOTRMod.mithrilNugget, 'Y', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.brick2, 1, 12), new Object[] { "XX", "XX", 'X', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.brick3, 1, 12), new Object[] { " X ", "XYX", " X ", 'X', Items.glowstone_dust, 'Y', new ItemStack(LOTRMod.brick, 1, 6) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.stairsDwarvenBrickCracked, 4), new Object[] { "X  ", "XX ", "XXX", 'X', new ItemStack(LOTRMod.brick4, 1, 5) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.slabSingle7, 6, 6), new Object[] { "XXX", 'X', new ItemStack(LOTRMod.brick4, 1, 5) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.wall4, 6, 5), new Object[] { "XXX", "XXX", 'X', new ItemStack(LOTRMod.brick4, 1, 5) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.slabSingle7, 6, 7), new Object[] { "XXX", 'X', new ItemStack(LOTRMod.pillar2, 1, 0) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.brick4, 4, 14), new Object[] { "XX", "XX", 'X', LOTRMod.obsidianShard }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.stairsDwarvenBrickObsidian, 4), new Object[] { "X  ", "XX ", "XXX", 'X', new ItemStack(LOTRMod.brick4, 1, 14) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.slabSingle8, 6, 6), new Object[] { "XXX", 'X', new ItemStack(LOTRMod.brick4, 1, 14) }));
        DRRecipe.redMountains.add((IRecipe)new ShapedOreRecipe(new ItemStack(LOTRMod.wall4, 6, 6), new Object[] { "XXX", "XXX", 'X', new ItemStack(LOTRMod.brick4, 1, 14) }));
        DRRecipe.redMountains.add((IRecipe)new LOTRRecipePoisonWeapon(LOTRMod.chisel, LOTRMod.chiselIthildin, (Object)new ItemStack(LOTRMod.ithildin, 1, 0)));
    }
    
    public static void createUnsmeltRecipes() {
        LOTRRecipes.uncraftableUnsmeltingRecipes.addAll(DRRecipe.redMountains);
        LOTRRecipes.uncraftableUnsmeltingRecipes.addAll(DRRecipe.windMountains);
    }
    
    public static boolean isIron(final ItemStack itemstack) {
        return LOTRMod.isOreNameEqual(itemstack, "oreIron") || LOTRMod.isOreNameEqual(itemstack, "ingotIron");
    }
    
    public static void preInit() {
        createRedMountainsRecipes();
        createOtherRecipes();
        createUnsmeltRecipes();
    }
    
    static {
        DRRecipe.redMountains = new ArrayList<IRecipe>();
        DRRecipe.windMountains = new ArrayList<IRecipe>();
    }
}
