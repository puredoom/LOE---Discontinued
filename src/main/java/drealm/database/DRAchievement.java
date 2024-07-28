//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import net.minecraft.item.*;
import lotr.common.fac.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import lotr.common.*;
import java.util.*;

public class DRAchievement
{
    public static Map<ItemArmor.ArmorMaterial, LOTRAchievement> armorAchievements;
    public static LOTRAchievement tradeRedDwarfSmith;
    public static LOTRAchievement tradeRedDwarfMiner;
    public static LOTRAchievement tradeRedDwarfCommander;
    public static LOTRAchievement tradeRedDwarfMerchant;
    public static LOTRAchievement killRedDwarf;
    public static LOTRAchievement marryRedDwarf;
    public static LOTRAchievement doMiniquestRedMountains;
    public static LOTRAchievement smeltRedDwarfSteel;
    public static LOTRAchievement wearFullRedDwarven;
    public static LOTRAchievement useRedDwarvenTable;
    public static LOTRAchievement useWindDwarvenTable;
    public static LOTRAchievement enterValinor;
    
    public static LOTRAchievement createArmorAchievement(final LOTRAchievement.Category category, final int id, final Item item, final String name) {
        final LOTRAchievement achievement = new LOTRAchievement(category, id, item, name);
        DRAchievement.armorAchievements.put(((ItemArmor)item).getArmorMaterial(), achievement);
        return achievement;
    }
    
    public static void onInit() {
        DRAchievement.smeltRedDwarfSteel = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 1, DRRegistry.redDwarfSteel, "smeltRedDwarfSteel");
        DRAchievement.killRedDwarf = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 2, LOTRMod.dwarfBone, "killRedDwarf").setRequiresEnemy(new LOTRFaction[] { DRFaction.RED_MOUNTAINS }).createTitle();
        DRAchievement.wearFullRedDwarven = createArmorAchievement(LOTRAchievement.Category.OROCARNI, 3, DRRegistry.bodyRedDwarven, "wearFullRedDwarven");
        DRAchievement.useRedDwarvenTable = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 4, DRRegistry.redDwarvenTable, "useRedDwarvenTable").setRequiresAlly(new LOTRFaction[] { DRFaction.RED_MOUNTAINS });
        DRAchievement.tradeRedDwarfSmith = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 5, LOTRMod.silverCoin, "tradeRedDwarfSmith").setRequiresAlly(new LOTRFaction[] { DRFaction.RED_MOUNTAINS });
        DRAchievement.tradeRedDwarfMiner = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 6, LOTRMod.silverCoin, "tradeRedDwarfMiner").setRequiresAlly(new LOTRFaction[] { DRFaction.RED_MOUNTAINS });
        DRAchievement.tradeRedDwarfCommander = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 7, LOTRMod.silverCoin, "tradeRedDwarfCommander").setRequiresAlly(new LOTRFaction[] { DRFaction.RED_MOUNTAINS });
        DRAchievement.tradeRedDwarfMerchant = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 8, LOTRMod.silverCoin, "tradeRedDwarfMerchant").setRequiresAlly(new LOTRFaction[] { DRFaction.RED_MOUNTAINS });
        DRAchievement.marryRedDwarf = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 9, LOTRMod.dwarvenRing, "marryRedDwarf").setRequiresAlly(new LOTRFaction[] { DRFaction.RED_MOUNTAINS });
        DRAchievement.doMiniquestRedMountains = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 10, LOTRMod.redBook, "doMiniquestRedMountains").setRequiresAlly(new LOTRFaction[] { DRFaction.RED_MOUNTAINS });
        DRAchievement.tradeRedDwarfSmith = new LOTRAchievement(LOTRAchievement.Category.OROCARNI, 11, LOTRMod.silverCoin, "tradeRedDwarfSmith").setRequiresAlly(new LOTRFaction[] { DRFaction.RED_MOUNTAINS });
        DRAchievement.enterValinor = new LOTRAchievement(LOTRAchievement.Category.OCEAN, 2, LOTRMod.athelas, "enterValinor");
    }
    
    public static void runAchievementCheck(final EntityPlayer player) {
        final ItemArmor.ArmorMaterial material = DRMaterial.getFullArmorMaterial((EntityLivingBase)player);
        if (DRAchievement.armorAchievements.containsKey(material)) {
            LOTRLevelData.getData(player).addAchievement((LOTRAchievement)DRAchievement.armorAchievements.get(material));
        }
    }
    
    static {
        DRAchievement.armorAchievements = new EnumMap<ItemArmor.ArmorMaterial, LOTRAchievement>(ItemArmor.ArmorMaterial.class);
    }
    
    public static class DRAchievementCategory
    {
        public static LOTRAchievement.Category WIND_MOUNTAINS;
        
        public static void onInit() {
        }
    }
}
