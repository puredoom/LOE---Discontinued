//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.util;

import drealm.database.*;
import java.lang.reflect.*;
import java.util.*;

import drealm.entity.*;
import lotr.common.*;
import lotr.common.world.biome.LOTRBiome;
import lotr.common.world.spawning.LOTRSpawnEntry;
import lotr.common.world.spawning.LOTRSpawnList;
import net.minecraft.init.*;
import lotr.common.item.*;
import net.minecraft.potion.*;
import lotr.common.world.map.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.item.*;
import net.minecraft.world.biome.BiomeGenBase;

public class DRItemLoader
{
    public static DRRegistry setupFactionStuff;
    public static Method craftmat;
    public static Method uses;
    public static Method speed;
    public static Method damage;
    public static Method prot;
    public static Method ench;
    public static Method harvest;
    public static Method undamageable;
    private static List[] alltools;
    public static LOTRMaterial NEW_MORGUL;
    public static LOTRMaterial NEW_MITHRIL;

    public static final LOTRSpawnList ROHAN_WEREWOLF;
    
    public static void load() {
        setup();
        ((LOTRItemSword)LOTRMod.swordArnor).addWeaponDamage(0.5f);
    }
    
    public static void setup() {
        ChangeItems();
        changematieral();
    }

    
    public static void ChangeItems() {
        final int freq = 60;
        DRCommander.addBannerBlock(LOTRMod.blockGem, 3, 64);
        DRCommander.addBannerBlock(LOTRMod.blockOreStorage,4,96);
        ((LOTRItemBow)LOTRMod.nearHaradBow).setDrawTime(21);
        ((LOTRItemBow)LOTRMod.rangerBow).setDrawTime(16);
        ((LOTRItemSword)LOTRMod.swordGondolin).addWeaponDamage(-0.0f);
        DRCommander.setbrew((LOTRItemMug)LOTRMod.mugAthelasBrew, 0.0f, true, true, Potion.resistance.getId(), 20, true, Potion.damageBoost.id, 120);
        ReflectionHelper.setPrivateValue((Class)LOTRWaypoint.class, (Object)LOTRWaypoint.MENELTARMA_SUMMIT, (Object)LOTRWaypoint.mapToWorldX(597.0), new String[] { "xCoord" });
        ReflectionHelper.setPrivateValue((Class)LOTRWaypoint.class, (Object)LOTRWaypoint.MENELTARMA_SUMMIT, (Object)LOTRWaypoint.mapToWorldZ(1607.0), new String[] { "zCoord" });
        DRUnitChanger.modifyUnits();
    }
    
    public static void changematieral() {
        try {
            (DRItemLoader.craftmat = LOTRMaterial.class.getDeclaredMethod("setCraftingItems", Item.class, Item.class)).setAccessible(true);
            (DRItemLoader.uses = LOTRMaterial.class.getDeclaredMethod("setUses", Integer.TYPE)).setAccessible(true);
            (DRItemLoader.speed = LOTRMaterial.class.getDeclaredMethod("setSpeed", Float.TYPE)).setAccessible(true);
            (DRItemLoader.damage = LOTRMaterial.class.getDeclaredMethod("setDamage", Float.TYPE)).setAccessible(true);
            (DRItemLoader.prot = LOTRMaterial.class.getDeclaredMethod("setProtection", Float.TYPE)).setAccessible(true);
            (DRItemLoader.ench = LOTRMaterial.class.getDeclaredMethod("setEnchantability", Integer.TYPE)).setAccessible(true);
            (DRItemLoader.harvest = LOTRMaterial.class.getDeclaredMethod("setHarvestLevel", Integer.TYPE)).setAccessible(true);
            (DRItemLoader.undamageable = LOTRMaterial.class.getDeclaredMethod("setUndamageable", (Class<?>[])new Class[0])).setAccessible(true);


            DRItemLoader.uses.invoke(LOTRMaterial.BLACK_NUMENOREAN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.MITHRIL,5000);
            DRItemLoader.uses.invoke(LOTRMaterial.BRONZE, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.FUR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.GEMSBOK, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.GAMBESON, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.JACKET, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.GONDOR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.DOL_AMROTH, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.ROHAN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.ROHAN_MARSHAL, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.RANGER, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.RANGER_ITHILIEN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.DUNLENDING, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.NEAR_HARAD, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.HARNEDOR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.UMBAR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.CORSAIR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.GULF_HARAD, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.HARAD_NOMAD, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.ANCIENT_HARAD, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.MOREDAIN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.MOREDAIN_LION_ARMOR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.MOREDAIN_BRONZE, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.TAUREDAIN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.TAUREDAIN_GOLD, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.BARROW, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.DALE, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.DORWINION, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.LOSSARNACH, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.PELARGIR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.PINNATH_GELIN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.BLACKROOT, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.LAMEDON, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.ARNOR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.RHUN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.RHUN_GOLD, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.GALADHRIM, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.GALVORN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.WOOD_ELVEN_SCOUT, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.WOOD_ELVEN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.HIGH_ELVEN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.GONDOLIN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.HITHLAIN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.DORWINION_ELF, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.RIVENDELL, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.DWARVEN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.BLUE_DWARVEN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.BLADORTHIN, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.MORDOR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.URUK, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.MORGUL, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.GUNDABAD_URUK, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.ANGMAR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.DOL_GULDUR, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.BLACK_URUK, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.UTUMNO, 2000);
            DRItemLoader.uses.invoke(LOTRMaterial.HALF_TROLL, 2000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        ROHAN_WEREWOLF = DRCommander.newLOTRSpawnList(new LOTRSpawnEntry((Class) DREntityWerewolfRohan.class, 100, 1, 3));
            }
        }

