//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import net.minecraft.block.*;
import drealm.block.*;
import drealm.util.*;
import net.minecraft.creativetab.*;
import drealm.item.*;
import lotr.common.block.*;
import lotr.common.item.*;
import net.minecraft.item.*;
import com.google.common.base.*;
import cpw.mods.fml.common.registry.*;

public class DRRegistry
{
    public static Block brick;
    public static Block chandelier;
    public static Block oreStorage;
    public static Block pillar;
    public static Block redDwarfBars;
    public static Block redDwarvenTable;
    public static Block slabDouble;
    public static Block slabSingle;
    public static Block wall;
    public static Item axeRedDwarven;
    public static Item battleaxeRedDwarven;
    public static Item boarArmorRedDwarven;
    public static Item bodyRedDwarven;
    public static Item bootsRedDwarven;
    public static Item daggerRedDwarven;
    public static Item daggerRedDwarvenPoisoned;
    public static Item hammerRedDwarven;
    public static Item helmetRedDwarven;
    public static Item hoeRedDwarven;
    public static Item legsRedDwarven;
    public static Item mattockRedDwarven;
    public static Item pickaxeRedDwarven;
    public static Item pikeRedDwarven;
    public static Item redDwarfSteel;
    public static Item shovelRedDwarven;
    public static Item spearRedDwarven;
    public static Item structureSpawner;
    public static Item swordRedDwarven;
    public static Item throwingAxeRedDwarven;

    public static Item helmetGondor2;
    public static Item bodyGondor2;
    public static Item legsGondor2;
    public static Item bootsGondor2;
    public static Item helmetRohan2;
    public static Item bodyRohan2;
    public static Item legsRohan2;
    public static Item bootsRohan2;
    public static Item helmetHobbit2;
    public static Item bodyHobbit2;
    public static Item legsHobbit2;
    public static Item bootsHobbit2;
    public static Item helmetDunland2;
    public static Item bodyDunland2;
    public static Item legsDunland2;
    public static Item bootsDunland2;

    public static Item helmetWoodelf2;
    public static Item bodyWoodelf2;
    public static Item legsWoodelf2;
    public static Item bootsWoodelf2;

    public static Item staffHobbit2;
    public static Item helmetHarad2;
    public static Item bodyHarad2;
    public static Item legsHarad2;
    public static Item bootsHarad2;
    public static Item helmetTaurethrim2;
    public static Item bodyTaurethrim2;
    public static Item legsTaurethrim2;
    public static Item bootsTaurethrim2;

    public static Item helmetAngmar2;
    public static Item bodyAngmar2;
    public static Item legsAngmar2;
    public static Item bootsAngmar2;

    public static Item helmetDale2;
    public static Item bodyDale2;
    public static Item legsDale2;
    public static Item bootsDale2;

    public static Item helmetDolGuldur2;
    public static Item bodyDolGuldur2;
    public static Item legsDolGuldur2;
    public static Item bootsDolGuldur2;

    public static Item helmetDorwinion2;
    public static Item bodyDorwinion2;
    public static Item legsDorwinion2;
    public static Item bootsDorwinion2;

    public static Item helmetDunedain2;
    public static Item bodyDunedain2;
    public static Item legsDunedain2;
    public static Item bootsDunedain2;

    public static Item helmetDurin2;
    public static Item bodyDurin2;
    public static Item legsDurin2;
    public static Item bootsDurin2;

    public static Item helmetGundabad2;
    public static Item bodyGundabad2;
    public static Item legsGundabad2;
    public static Item bootsGundabad2;


    public static Item helmetHighElf2;
    public static Item bodyHighElf2;
    public static Item legsHighElf2;
    public static Item bootsHighElf2;

    public static Item helmetHobbit3;
    public static Item bodyHobbit3;
    public static Item legsHobbit3;
    public static Item bootsHobbit3;

    public static Item helmetIsengard2;
    public static Item bodyIsengard2;
    public static Item legsIsengard2;
    public static Item bootsIsengard2;

    public static Item helmetLothlorien2;
    public static Item bodyLothlorien2;
    public static Item legsLothlorien2;
    public static Item bootsLothlorien2;

    public static Item helmetMordor2;
    public static Item bodyMordor2;
    public static Item legsMordor2;
    public static Item bootsMordor2;

    public static Item helmetBlueMountains2;
    public static Item bodyBlueMountains2;
    public static Item legsBlueMountains2;
    public static Item bootsBlueMountains2;

    public static Item helmetRedMountains2;
    public static Item bodyRedMountains2;
    public static Item legsRedMountains2;
    public static Item bootsRedMountains2;

    public static Item helmetRhun2;
    public static Item bodyRhun2;
    public static Item legsRhun2;
    public static Item bootsRhun2;

    public static Item helmetHalfTroll2;
    public static Item bodyHalfTroll2;
    public static Item legsHalfTroll2;
    public static Item bootsHalfTroll2;


    public static Item mumakilTusk;
    public static Item wolfear;
    public static Item trollfoot;
    public static Item spiderfang;
    public static Item skinchangerfur;
    public static Item redbeastscale;
    public static Item pigleather;
    public static Item pandafur;
    public static Item ostrichfeather;
    public static Item hobbitleather;
    public static Item greywerewolf;
    public static Item graugbone;
    public static Item gorillatooth;
    public static Item goathorn;
    public static Item fellbeastcrow;
    public static Item entbark;
    public static Item dunlandbearfur;
    public static Item caragortooth;
    public static Item brownwerewolffur;
    public static Item bisonnose;
    public static Item batwing;

    public static Item salamandertail;




    public static void preInit() {
        DRRegistry.brick = (Block)new DRBlockBrick();
        DRRegistry.chandelier = (Block)new DRBlockChandelier();
        DRRegistry.oreStorage = (Block)new DRBlockOreStorage();
        DRRegistry.pillar = (Block)new DRBlockPillar();
        DRRegistry.redDwarfBars = (Block)new LOTRBlockBars();
        DRRegistry.redDwarvenTable = (Block)new DRBlockTableRedDwarven();
        DRRegistry.slabDouble = new DRBlockSlab(true).setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypeStone).setBlockName("slab_double");
        DRRegistry.slabSingle = new DRBlockSlab(false).setHardness(2.0f).setResistance(10.0f).setStepSound(Block.soundTypeStone).setBlockName("slab_single");
        DRRegistry.wall = (Block)new DRBlockWall();
        if (DRConfig.enableTextures14) {
            DRRegistry.bodyRedDwarven = (Item)new DRItemArmor(DRMaterial.RED_DWARVEN14, 1);
            DRRegistry.legsRedDwarven = (Item)new DRItemArmor(DRMaterial.RED_DWARVEN14, 2);
            DRRegistry.bootsRedDwarven = (Item)new DRItemArmor(DRMaterial.RED_DWARVEN14, 3);
            DRRegistry.helmetRedDwarven = (Item)new DRItemArmor(DRMaterial.RED_DWARVEN14, 0);
            DRRegistry.boarArmorRedDwarven = (Item)new LOTRItemMountArmor(DRMaterial.RED_DWARVEN14, LOTRItemMountArmor.Mount.BOAR);
        }
        else {
            DRRegistry.bodyRedDwarven = (Item)new DRItemArmor(DRMaterial.RED_DWARVEN, 1);
            DRRegistry.legsRedDwarven = (Item)new DRItemArmor(DRMaterial.RED_DWARVEN, 2);
            DRRegistry.bootsRedDwarven = (Item)new DRItemArmor(DRMaterial.RED_DWARVEN, 3);
            DRRegistry.helmetRedDwarven = (Item)new DRItemArmor(DRMaterial.RED_DWARVEN, 0);
            DRRegistry.boarArmorRedDwarven = (Item)new LOTRItemMountArmor(DRMaterial.RED_DWARVEN, LOTRItemMountArmor.Mount.BOAR);
        }
        DRRegistry.axeRedDwarven = (Item)new LOTRItemAxe(DRMaterial.RED_DWARVEN);
        DRRegistry.battleaxeRedDwarven = (Item)new LOTRItemBattleaxe(DRMaterial.RED_DWARVEN);
        DRRegistry.daggerRedDwarven = (Item)new LOTRItemDagger(DRMaterial.RED_DWARVEN);
        DRRegistry.daggerRedDwarvenPoisoned = (Item)new LOTRItemDagger(DRMaterial.RED_DWARVEN, LOTRItemDagger.DaggerEffect.POISON);
        DRRegistry.hammerRedDwarven = (Item)new LOTRItemHammer(DRMaterial.RED_DWARVEN);
        DRRegistry.hoeRedDwarven = (Item)new LOTRItemHoe(DRMaterial.RED_DWARVEN);
        DRRegistry.mattockRedDwarven = (Item)new LOTRItemMattock(DRMaterial.RED_DWARVEN);
        DRRegistry.pickaxeRedDwarven = (Item)new LOTRItemPickaxe(DRMaterial.RED_DWARVEN);
        DRRegistry.pikeRedDwarven = (Item)new LOTRItemPike(DRMaterial.RED_DWARVEN);
        DRRegistry.redDwarfSteel = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.mumakilTusk = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.salamandertail = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.wolfear = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.trollfoot = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.spiderfang = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.skinchangerfur = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.redbeastscale = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.pigleather = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.pandafur = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.ostrichfeather = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.hobbitleather = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.greywerewolf = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.graugbone = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.gorillatooth = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.goathorn = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.fellbeastcrow = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.entbark = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.dunlandbearfur = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.caragortooth = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.brownwerewolffur = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.bisonnose = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.batwing = new Item().setCreativeTab((CreativeTabs)DRCreativeTabs.tabMaterials);
        DRRegistry.shovelRedDwarven = (Item)new LOTRItemShovel(DRMaterial.RED_DWARVEN);
        DRRegistry.spearRedDwarven = (Item)new LOTRItemSpear(DRMaterial.RED_DWARVEN);
        DRRegistry.structureSpawner = new DRItemStructureSpawner();
        DRRegistry.swordRedDwarven = (Item)new LOTRItemSword(DRMaterial.RED_DWARVEN);

        DRRegistry.bodyGondor2 = (Item)new DRItemArmor(DRMaterial.GONDOR2, 1, "body");
        DRRegistry.legsGondor2 = (Item)new DRItemArmor(DRMaterial.GONDOR2, 2, "legs");
        DRRegistry.bootsGondor2 = (Item)new DRItemArmor(DRMaterial.GONDOR2, 3,"boots");
        DRRegistry.helmetGondor2 = (Item)new DRItemArmor(DRMaterial.GONDOR2, 0, "helmet");
        DRRegistry.bodyHobbit2 = (Item)new DRItemArmor(DRMaterial.HOBBIT2, 1);
        DRRegistry.legsHobbit2 = (Item)new DRItemArmor(DRMaterial.HOBBIT2, 2);
        DRRegistry.bootsHobbit2 = (Item)new DRItemArmor(DRMaterial.HOBBIT2, 3);
        DRRegistry.helmetHobbit2 = (Item)new DRItemArmor(DRMaterial.HOBBIT2, 0);
        DRRegistry.staffHobbit2 = (Item)new LOTRItemPike(DRMaterial.HOBBIT2);
        DRRegistry.throwingAxeRedDwarven = (Item)new LOTRItemThrowingAxe(DRMaterial.RED_DWARVEN);
        DRRegistry.bodyRohan2 = (Item)new DRItemArmor(DRMaterial.ROHAN2, 1, "body");
        DRRegistry.legsRohan2 = (Item)new DRItemArmor(DRMaterial.ROHAN2, 2, "legs");
        DRRegistry.bootsRohan2 = (Item)new DRItemArmor(DRMaterial.ROHAN2, 3, "boots");
        DRRegistry.helmetRohan2 = (Item)new DRItemArmor(DRMaterial.ROHAN2, 0, "helmet");
        DRRegistry.bodyDunland2 = (Item)new DRItemArmor(DRMaterial.DUNLAND2, 1, "body");
        DRRegistry.legsDunland2 = (Item)new DRItemArmor(DRMaterial.DUNLAND2, 2, "legs");
        DRRegistry.bootsDunland2 = (Item)new DRItemArmor(DRMaterial.DUNLAND2, 3, "boots");
        DRRegistry.helmetDunland2 = (Item)new DRItemArmor(DRMaterial.DUNLAND2, 0, "helmet");
        DRRegistry.bodyWoodelf2 = (Item)new DRItemArmor(DRMaterial.WOODELF2, 1, "body");
        DRRegistry.legsWoodelf2 = (Item)new DRItemArmor(DRMaterial.WOODELF2, 2, "legs");
        DRRegistry.bootsWoodelf2 = (Item)new DRItemArmor(DRMaterial.WOODELF2, 3, "boots");
        DRRegistry.helmetWoodelf2 = (Item)new DRItemArmor(DRMaterial.WOODELF2, 0, "helmet");

        DRRegistry.bodyHarad2 = (Item)new DRItemArmor(DRMaterial.HARAD2, 1, "body");
        DRRegistry.legsHarad2 = (Item)new DRItemArmor(DRMaterial.HARAD2, 2, "legs");
        DRRegistry.bootsHarad2 = (Item)new DRItemArmor(DRMaterial.HARAD2, 3, "boots");
        DRRegistry.helmetHarad2 = (Item)new DRItemArmor(DRMaterial.HARAD2, 0, "helmet");
        DRRegistry.bodyTaurethrim2 = (Item)new DRItemArmor(DRMaterial.TAURETHRIM2, 1, "body");
        DRRegistry.legsTaurethrim2 = (Item)new DRItemArmor(DRMaterial.TAURETHRIM2, 2, "legs");
        DRRegistry.bootsTaurethrim2 = (Item)new DRItemArmor(DRMaterial.TAURETHRIM2, 3, "boots");
        DRRegistry.helmetTaurethrim2 = (Item)new DRItemArmor(DRMaterial.TAURETHRIM2, 0, "helmet");

        // Registering armor for Angmar2
        DRRegistry.bodyAngmar2 = (Item)new DRItemArmor(DRMaterial.ANGMAR2, 1, "body");
        DRRegistry.legsAngmar2 = (Item)new DRItemArmor(DRMaterial.ANGMAR2, 2, "legs");
        DRRegistry.bootsAngmar2 = (Item)new DRItemArmor(DRMaterial.ANGMAR2, 3, "boots");
        DRRegistry.helmetAngmar2 = (Item)new DRItemArmor(DRMaterial.ANGMAR2, 0, "helmet");

// Registering armor for Dale2
        DRRegistry.bodyDale2 = (Item)new DRItemArmor(DRMaterial.DALE2, 1, "body");
        DRRegistry.legsDale2 = (Item)new DRItemArmor(DRMaterial.DALE2, 2, "legs");
        DRRegistry.bootsDale2 = (Item)new DRItemArmor(DRMaterial.DALE2, 3, "boots");
        DRRegistry.helmetDale2 = (Item)new DRItemArmor(DRMaterial.DALE2, 0, "helmet");

// Registering armor for DolGuldur2
        DRRegistry.bodyDolGuldur2 = (Item)new DRItemArmor(DRMaterial.DOLGULDUR2, 1, "body");
        DRRegistry.legsDolGuldur2 = (Item)new DRItemArmor(DRMaterial.DOLGULDUR2, 2, "legs");
        DRRegistry.bootsDolGuldur2 = (Item)new DRItemArmor(DRMaterial.DOLGULDUR2, 3, "boots");
        DRRegistry.helmetDolGuldur2 = (Item)new DRItemArmor(DRMaterial.DOLGULDUR2, 0, "helmet");

// Registering armor for Dorwinion2
        DRRegistry.bodyDorwinion2 = (Item)new DRItemArmor(DRMaterial.DORWINION2, 1, "body");
        DRRegistry.legsDorwinion2 = (Item)new DRItemArmor(DRMaterial.DORWINION2, 2, "legs");
        DRRegistry.bootsDorwinion2 = (Item)new DRItemArmor(DRMaterial.DORWINION2, 3, "boots");
        DRRegistry.helmetDorwinion2 = (Item)new DRItemArmor(DRMaterial.DORWINION2, 0, "helmet");

// Registering armor for Dunedain2
        DRRegistry.bodyDunedain2 = (Item)new DRItemArmor(DRMaterial.DUNEDAIN2, 1, "body");
        DRRegistry.legsDunedain2 = (Item)new DRItemArmor(DRMaterial.DUNEDAIN2, 2, "legs");
        DRRegistry.bootsDunedain2 = (Item)new DRItemArmor(DRMaterial.DUNEDAIN2, 3, "boots");
        DRRegistry.helmetDunedain2 = (Item)new DRItemArmor(DRMaterial.DUNEDAIN2, 0, "helmet");

// Registering armor for Durin2
        DRRegistry.bodyDurin2 = (Item)new DRItemArmor(DRMaterial.DURIN2, 1, "body");
        DRRegistry.legsDurin2 = (Item)new DRItemArmor(DRMaterial.DURIN2, 2, "legs");
        DRRegistry.bootsDurin2 = (Item)new DRItemArmor(DRMaterial.DURIN2, 3, "boots");
        DRRegistry.helmetDurin2 = (Item)new DRItemArmor(DRMaterial.DURIN2, 0, "helmet");

// Registering armor for Gundabad2
        DRRegistry.bodyGundabad2 = (Item)new DRItemArmor(DRMaterial.GUNDABAD2, 1, "body");
        DRRegistry.legsGundabad2 = (Item)new DRItemArmor(DRMaterial.GUNDABAD2, 2, "legs");
        DRRegistry.bootsGundabad2 = (Item)new DRItemArmor(DRMaterial.GUNDABAD2, 3, "boots");
        DRRegistry.helmetGundabad2 = (Item)new DRItemArmor(DRMaterial.GUNDABAD2, 0, "helmet");



// Registering armor for HighElf2
        DRRegistry.bodyHighElf2 = (Item)new DRItemArmor(DRMaterial.HIGHELF2, 1, "body");
        DRRegistry.legsHighElf2 = (Item)new DRItemArmor(DRMaterial.HIGHELF2, 2, "legs");
        DRRegistry.bootsHighElf2 = (Item)new DRItemArmor(DRMaterial.HIGHELF2, 3, "boots");
        DRRegistry.helmetHighElf2 = (Item)new DRItemArmor(DRMaterial.HIGHELF2, 0, "helmet");

// Registering armor for Hobbit2
        DRRegistry.bodyHobbit3 = (Item)new DRItemArmor(DRMaterial.HOBBIT3, 1, "body");
        DRRegistry.legsHobbit3 = (Item)new DRItemArmor(DRMaterial.HOBBIT3, 2, "legs");
        DRRegistry.bootsHobbit3 = (Item)new DRItemArmor(DRMaterial.HOBBIT3, 3, "boots");
        DRRegistry.helmetHobbit3 = (Item)new DRItemArmor(DRMaterial.HOBBIT3, 0, "helmet");

// Registering armor for Isengard2
        DRRegistry.bodyIsengard2 = (Item)new DRItemArmor(DRMaterial.ISENGARD2, 1, "body");
        DRRegistry.legsIsengard2 = (Item)new DRItemArmor(DRMaterial.ISENGARD2, 2, "legs");
        DRRegistry.bootsIsengard2 = (Item)new DRItemArmor(DRMaterial.ISENGARD2, 3, "boots");
        DRRegistry.helmetIsengard2 = (Item)new DRItemArmor(DRMaterial.ISENGARD2, 0, "helmet");

// Registering armor for Lothlorien2
        DRRegistry.bodyLothlorien2 = (Item)new DRItemArmor(DRMaterial.LOTHLORIEN2, 1, "body");
        DRRegistry.legsLothlorien2 = (Item)new DRItemArmor(DRMaterial.LOTHLORIEN2, 2, "legs");
        DRRegistry.bootsLothlorien2 = (Item)new DRItemArmor(DRMaterial.LOTHLORIEN2, 3, "boots");
        DRRegistry.helmetLothlorien2 = (Item)new DRItemArmor(DRMaterial.LOTHLORIEN2, 0, "helmet");

// Registering armor for Mordor2
        DRRegistry.bodyMordor2 = (Item)new DRItemArmor(DRMaterial.MORDOR2, 1, "body");
        DRRegistry.legsMordor2 = (Item)new DRItemArmor(DRMaterial.MORDOR2, 2, "legs");
        DRRegistry.bootsMordor2 = (Item)new DRItemArmor(DRMaterial.MORDOR2, 3, "boots");
        DRRegistry.helmetMordor2 = (Item)new DRItemArmor(DRMaterial.MORDOR2, 0, "helmet");

// Registering armor for BlueMountains2
        DRRegistry.bodyBlueMountains2 = (Item)new DRItemArmor(DRMaterial.BLUEMOUNTAINS2, 1, "body");
        DRRegistry.legsBlueMountains2 = (Item)new DRItemArmor(DRMaterial.BLUEMOUNTAINS2, 2, "legs");
        DRRegistry.bootsBlueMountains2 = (Item)new DRItemArmor(DRMaterial.BLUEMOUNTAINS2, 3, "boots");
        DRRegistry.helmetBlueMountains2 = (Item)new DRItemArmor(DRMaterial.BLUEMOUNTAINS2, 0, "helmet");

// Registering armor for RedMountains2
        DRRegistry.bodyRedMountains2 = (Item)new DRItemArmor(DRMaterial.REDMOUNTAINS2, 1, "body");
        DRRegistry.legsRedMountains2 = (Item)new DRItemArmor(DRMaterial.REDMOUNTAINS2, 2, "legs");
        DRRegistry.bootsRedMountains2 = (Item)new DRItemArmor(DRMaterial.REDMOUNTAINS2, 3, "boots");
        DRRegistry.helmetRedMountains2 = (Item)new DRItemArmor(DRMaterial.REDMOUNTAINS2, 0, "helmet");

// Registering armor for Rhun2
        DRRegistry.bodyRhun2 = (Item)new DRItemArmor(DRMaterial.RHUN2, 1, "body");
        DRRegistry.legsRhun2 = (Item)new DRItemArmor(DRMaterial.RHUN2, 2, "legs");
        DRRegistry.bootsRhun2 = (Item)new DRItemArmor(DRMaterial.RHUN2, 3, "boots");
        DRRegistry.helmetRhun2 = (Item)new DRItemArmor(DRMaterial.RHUN2, 0, "helmet");

// Registering armor for HalfTroll2
        DRRegistry.bodyHalfTroll2 = (Item)new DRItemArmor(DRMaterial.HALFTROLL2, 1, "body");
        DRRegistry.legsHalfTroll2 = (Item)new DRItemArmor(DRMaterial.HALFTROLL2, 2, "legs");
        DRRegistry.bootsHalfTroll2 = (Item)new DRItemArmor(DRMaterial.HALFTROLL2, 3, "boots");
        DRRegistry.helmetHalfTroll2 = (Item)new DRItemArmor(DRMaterial.HALFTROLL2, 0, "helmet");


        LOTRBlockSlabBase.registerSlabs(DRRegistry.slabSingle, DRRegistry.slabDouble);
        registerBlock(DRRegistry.redDwarfBars, "redDwarfBars");
        registerBlockNoAlt(DRRegistry.redDwarvenTable, "redDwarvenTable");
        registerBlock(DRRegistry.chandelier, "chandelier", (Class<? extends ItemBlock>)LOTRItemBlockMetadata.class);
        registerBlockNoAlt(DRRegistry.brick, "brick", (Class<? extends ItemBlock>)LOTRItemBlockMetadata.class);
        registerBlockNoAlt(DRRegistry.pillar, "pillar", (Class<? extends ItemBlock>)LOTRItemBlockMetadata.class);
        registerBlock(DRRegistry.oreStorage, "oreStorage", (Class<? extends ItemBlock>)LOTRItemBlockMetadata.class);
        registerBlockNoAlt(DRRegistry.wall, "wall", (Class<? extends ItemBlock>)LOTRItemBlockMetadata.class, true);
        registerBlockNoAlt(DRRegistry.slabSingle, "slabSingle", (Class<? extends ItemBlock>)DRBlockSlab.SlabExSingle.class);
        registerBlockNoAlt(DRRegistry.slabDouble, "slabDouble", (Class<? extends ItemBlock>)DRBlockSlab.SlabExDouble.class);
        registerItem(DRRegistry.redDwarfSteel, "redDwarfSteel");
        registerItem(DRRegistry.mumakilTusk, "mumakilTusk");
        registerItem(DRRegistry.wolfear, "wolfear");
        registerItem(DRRegistry.trollfoot, "trollfoot");
        registerItem(DRRegistry.spiderfang, "spiderfang");
        registerItem(DRRegistry.skinchangerfur, "skinchangerfur");
        registerItem(DRRegistry.redbeastscale, "redbeastscale");
        registerItem(DRRegistry.pigleather, "pigleather");
        registerItem(DRRegistry.pandafur, "pandafur");
        registerItem(DRRegistry.ostrichfeather, "ostrichfeather");
        registerItem(DRRegistry.hobbitleather, "hobbitleather");
        registerItem(DRRegistry.greywerewolf, "greywerewolf");
        registerItem(DRRegistry.graugbone, "graugbone");
        registerItem(DRRegistry.gorillatooth, "gorillatooth");
        registerItem(DRRegistry.goathorn, "goathorn");
        registerItem(DRRegistry.fellbeastcrow, "fellbeastcrow");
        registerItem(DRRegistry.entbark, "entbark");
        registerItem(DRRegistry.dunlandbearfur, "dunlandbearfur");
        registerItem(DRRegistry.salamandertail, "salamandertail");
        registerItem(DRRegistry.caragortooth, "caragortooth");
        registerItem(DRRegistry.brownwerewolffur, "brownwerewolffur");
        registerItem(DRRegistry.bisonnose, "bisonnose");
        registerItem(DRRegistry.batwing, "batwing");
        registerItem(DRRegistry.helmetRedDwarven, "helmetRedDwarven");
        registerItem(DRRegistry.bodyRedDwarven, "bodyRedDwarven");
        registerItem(DRRegistry.legsRedDwarven, "legsRedDwarven");
        registerItem(DRRegistry.bootsRedDwarven, "bootsRedDwarven");
        registerItem(DRRegistry.shovelRedDwarven, "shovelRedDwarven");
        registerItem(DRRegistry.pickaxeRedDwarven, "pickaxeRedDwarven");
        registerItem(DRRegistry.axeRedDwarven, "axeRedDwarven");
        registerItem(DRRegistry.swordRedDwarven, "swordRedDwarven");
        registerItem(DRRegistry.hoeRedDwarven, "hoeRedDwarven");
        registerItem(DRRegistry.daggerRedDwarven, "daggerRedDwarven");
        registerItem(DRRegistry.daggerRedDwarvenPoisoned, "daggerRedDwarvenPoisoned");
        registerItem(DRRegistry.battleaxeRedDwarven, "battleaxeRedDwarven");
        registerItem(DRRegistry.hammerRedDwarven, "hammerRedDwarven");
        registerItem(DRRegistry.mattockRedDwarven, "mattockRedDwarven");
        registerItem(DRRegistry.throwingAxeRedDwarven, "throwingAxeRedDwarven");
        registerItem(DRRegistry.spearRedDwarven, "spearRedDwarven");
        registerItem(DRRegistry.boarArmorRedDwarven, "boarArmorRedDwarven");
        registerItem(DRRegistry.pikeRedDwarven, "pikeRedDwarven");
        registerItemLOTR(DRRegistry.structureSpawner, "structureSpawner");
        registerItem(DRRegistry.helmetGondor2, "helmetGondor2");
        registerItem(DRRegistry.bodyGondor2, "bodyGondor2");
        registerItem(DRRegistry.legsGondor2, "legsGondor2");
        registerItem(DRRegistry.bootsGondor2, "bootsGondor2");
        registerItem(DRRegistry.helmetHobbit2, "helmetHobbit2");
        registerItem(DRRegistry.bodyHobbit2, "bodyHobbit2");
        registerItem(DRRegistry.legsHobbit2, "legsHobbit2");
        registerItem(DRRegistry.bootsHobbit2, "bootsHobbit2");
        registerItem(DRRegistry.staffHobbit2, "staffHobbit2");
        registerItem(DRRegistry.helmetRohan2, "helmetRohan2");
        registerItem(DRRegistry.bodyRohan2, "bodyRohan2");
        registerItem(DRRegistry.legsRohan2, "legsRohan2");
        registerItem(DRRegistry.bootsRohan2, "bootsRohan2");
        registerItem(DRRegistry.helmetDunland2, "helmetDunland2");
        registerItem(DRRegistry.bodyDunland2, "bodyDunland2");
        registerItem(DRRegistry.legsDunland2, "legsDunland2");
        registerItem(DRRegistry.bootsDunland2, "bootsDunland2");
        registerItem(DRRegistry.helmetHarad2, "helmetHarad2");
        registerItem(DRRegistry.bodyHarad2, "bodyHarad2");
        registerItem(DRRegistry.legsHarad2, "legsHarad2");
        registerItem(DRRegistry.bootsHarad2, "bootsHarad2");
        registerItem(DRRegistry.helmetTaurethrim2, "helmetTaurethrim2");
        registerItem(DRRegistry.bodyTaurethrim2, "bodyTaurethrim2");
        registerItem(DRRegistry.legsTaurethrim2, "legsTaurethrim2");
        registerItem(DRRegistry.bootsTaurethrim2, "bootsTaurethrim2");
        // Registering armor for Angmar2
        registerItem(DRRegistry.helmetAngmar2, "helmetAngmar2");
        registerItem(DRRegistry.bodyAngmar2, "bodyAngmar2");
        registerItem(DRRegistry.legsAngmar2, "legsAngmar2");
        registerItem(DRRegistry.bootsAngmar2, "bootsAngmar2");

// Registering armor for Dale2
        registerItem(DRRegistry.helmetDale2, "helmetDale2");
        registerItem(DRRegistry.bodyDale2, "bodyDale2");
        registerItem(DRRegistry.legsDale2, "legsDale2");
        registerItem(DRRegistry.bootsDale2, "bootsDale2");

// Registering armor for DolGuldur2
        registerItem(DRRegistry.helmetDolGuldur2, "helmetDolGuldur2");
        registerItem(DRRegistry.bodyDolGuldur2, "bodyDolGuldur2");
        registerItem(DRRegistry.legsDolGuldur2, "legsDolGuldur2");
        registerItem(DRRegistry.bootsDolGuldur2, "bootsDolGuldur2");

// Registering armor for Dorwinion2
        registerItem(DRRegistry.helmetDorwinion2, "helmetDorwinion2");
        registerItem(DRRegistry.bodyDorwinion2, "bodyDorwinion2");
        registerItem(DRRegistry.legsDorwinion2, "legsDorwinion2");
        registerItem(DRRegistry.bootsDorwinion2, "bootsDorwinion2");

// Registering armor for Dunedain2
        registerItem(DRRegistry.helmetDunedain2, "helmetDunedain2");
        registerItem(DRRegistry.bodyDunedain2, "bodyDunedain2");
        registerItem(DRRegistry.legsDunedain2, "legsDunedain2");
        registerItem(DRRegistry.bootsDunedain2, "bootsDunedain2");

// Registering armor for Durin2
        registerItem(DRRegistry.helmetDurin2, "helmetDurin2");
        registerItem(DRRegistry.bodyDurin2, "bodyDurin2");
        registerItem(DRRegistry.legsDurin2, "legsDurin2");
        registerItem(DRRegistry.bootsDurin2, "bootsDurin2");

// Registering armor for Gundabad2
        registerItem(DRRegistry.helmetGundabad2, "helmetGundabad2");
        registerItem(DRRegistry.bodyGundabad2, "bodyGundabad2");
        registerItem(DRRegistry.legsGundabad2, "legsGundabad2");
        registerItem(DRRegistry.bootsGundabad2, "bootsGundabad2");

// Registering armor for HighElf2
        registerItem(DRRegistry.helmetHighElf2, "helmetHighElf2");
        registerItem(DRRegistry.bodyHighElf2, "bodyHighElf2");
        registerItem(DRRegistry.legsHighElf2, "legsHighElf2");
        registerItem(DRRegistry.bootsHighElf2, "bootsHighElf2");

// Registering armor for Hobbit2
        registerItem(DRRegistry.helmetHobbit3, "helmetHobbit3");
        registerItem(DRRegistry.bodyHobbit3, "bodyHobbit3");
        registerItem(DRRegistry.legsHobbit3, "legsHobbit3");
        registerItem(DRRegistry.bootsHobbit3, "bootsHobbit3");

// Registering armor for Isengard2
        registerItem(DRRegistry.helmetIsengard2, "helmetIsengard2");
        registerItem(DRRegistry.bodyIsengard2, "bodyIsengard2");
        registerItem(DRRegistry.legsIsengard2, "legsIsengard2");
        registerItem(DRRegistry.bootsIsengard2, "bootsIsengard2");

// Registering armor for Lothlorien2
        registerItem(DRRegistry.helmetLothlorien2, "helmetLothlorien2");
        registerItem(DRRegistry.bodyLothlorien2, "bodyLothlorien2");
        registerItem(DRRegistry.legsLothlorien2, "legsLothlorien2");
        registerItem(DRRegistry.bootsLothlorien2, "bootsLothlorien2");

// Registering armor for Mordor2
        registerItem(DRRegistry.helmetMordor2, "helmetMordor2");
        registerItem(DRRegistry.bodyMordor2, "bodyMordor2");
        registerItem(DRRegistry.legsMordor2, "legsMordor2");
        registerItem(DRRegistry.bootsMordor2, "bootsMordor2");

// Registering armor for BlueMountains2
        registerItem(DRRegistry.helmetBlueMountains2, "helmetBlueMountains2");
        registerItem(DRRegistry.bodyBlueMountains2, "bodyBlueMountains2");
        registerItem(DRRegistry.legsBlueMountains2, "legsBlueMountains2");
        registerItem(DRRegistry.bootsBlueMountains2, "bootsBlueMountains2");

// Registering armor for RedMountains2
        registerItem(DRRegistry.helmetRedMountains2, "helmetRedMountains2");
        registerItem(DRRegistry.bodyRedMountains2, "bodyRedMountains2");
        registerItem(DRRegistry.legsRedMountains2, "legsRedMountains2");
        registerItem(DRRegistry.bootsRedMountains2, "bootsRedMountains2");

// Registering armor for Rhun2
        registerItem(DRRegistry.helmetRhun2, "helmetRhun2");
        registerItem(DRRegistry.bodyRhun2, "bodyRhun2");
        registerItem(DRRegistry.legsRhun2, "legsRhun2");
        registerItem(DRRegistry.bootsRhun2, "bootsRhun2");


        registerItem(DRRegistry.helmetWoodelf2, "helmetWoodelf2");
        registerItem(DRRegistry.bodyWoodelf2, "bodyWoodelf2");
        registerItem(DRRegistry.legsWoodelf2, "legsWoodelf2");
        registerItem(DRRegistry.bootsWoodelf2, "bootsWoodelf2");


// Registering armor for HalfTroll2
        registerItem(DRRegistry.helmetHalfTroll2, "helmetHalfTroll2");
        registerItem(DRRegistry.bodyHalfTroll2, "bodyHalfTroll2");
        registerItem(DRRegistry.legsHalfTroll2, "legsHalfTroll2");
        registerItem(DRRegistry.bootsHalfTroll2, "bootsHalfTroll2");

    }
    
    public static void registerBlock(final Block block, final String name) {
        final String blockName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        block.setBlockName(blockName);
        if (DRConfig.enableTextures14) {
            block.setBlockTextureName("drealm:" + blockName + "14");
        }
        else {
            block.setBlockTextureName("drealm:" + blockName);
        }
        GameRegistry.registerBlock(block, blockName);
    }
    
    public static void registerBlock(final Block block, final String name, final Class<? extends ItemBlock> itemClass) {
        final String blockName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        block.setBlockName(blockName);
        if (DRConfig.enableTextures14) {
            block.setBlockTextureName("drealm:" + blockName + "14");
        }
        else {
            block.setBlockTextureName("drealm:" + blockName);
        }
        GameRegistry.registerBlock(block, (Class)itemClass, blockName);
    }
    
    public static void registerItem(final Item item, final String name) {
        final String itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        item.setUnlocalizedName(itemName);
        if (DRConfig.enableTextures14) {
            item.setTextureName("drealm:" + itemName + "14");
        }
        else {
            item.setTextureName("drealm:" + itemName);
        }
        GameRegistry.registerItem(item, itemName);
    }
    
    public static void registerBlockNoAlt(final Block block, final String name) {
        final String blockName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        block.setBlockName(blockName);
        block.setBlockTextureName("drealm:" + blockName);
        GameRegistry.registerBlock(block, blockName);
    }
    
    public static void registerBlockNoAlt(final Block block, final String name, final Class<? extends ItemBlock> itemClass) {
        final String blockName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        block.setBlockName(blockName);
        block.setBlockTextureName("drealm:" + blockName);
        GameRegistry.registerBlock(block, (Class)itemClass, blockName);
    }
    
    public static void registerBlockNoAlt(final Block block, final String name, final Class<? extends ItemBlock> itemClass, final boolean hasNoTexture) {
        final String blockName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        block.setBlockName(blockName);
        GameRegistry.registerBlock(block, (Class)itemClass, blockName);
    }
    
    public static void registerItemLOTR(final Item item, final String name) {
        item.setTextureName("lotr:" + name);
        item.setUnlocalizedName("lotr:" + name);
        GameRegistry.registerItem(item, name);
    }
}
