//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import drealm.map.DRWaypoint;
import drealm.util.*;
import lotr.common.world.map.*;

import java.lang.reflect.Field;
import java.util.*;
import lotr.common.*;
import lotr.common.fac.*;

import static drealm.util.DRControlZones.createFullMapControlZone;

public class DRFaction
{
    public static LOTRFaction RED_MOUNTAINS;
    
    public static void onInit() {
        setupRelations();
        setupMapInfo();
        setupControlZones();
        setupRanks();
    }
    
    public static void preInit() {
        setupFactions();
    }


    public static void setupControlZones() {
        DRCommander.addControlZone(DRFaction.RED_MOUNTAINS, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.DALE, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.HOBBIT, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.BREE, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.RANGER_NORTH, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.BLUE_MOUNTAINS, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.HIGH_ELF, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.GUNDABAD, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.ANGMAR, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.WOOD_ELF, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.DOL_GULDUR, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.DURINS_FOLK, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.LOTHLORIEN, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.DUNLAND, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.ISENGARD, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.FANGORN, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.ROHAN, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.GONDOR, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.MORDOR, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.DORWINION, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.RHUDEL, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.NEAR_HARAD, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.MORWAITH, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.TAURETHRIM, createFullMapControlZone());
        DRCommander.addControlZone(LOTRFaction.HALF_TROLL, createFullMapControlZone());

    }

    public static void setupFactions() {
        final EnumSet<LOTRFaction.FactionType> enumSetFreeDwarf = EnumSet.of(LOTRFaction.FactionType.TYPE_FREE, LOTRFaction.FactionType.TYPE_DWARF);
        final EnumSet<LOTRFaction.FactionType> enumSetEvilDwarf = EnumSet.of(LOTRFaction.FactionType.TYPE_ORC, LOTRFaction.FactionType.TYPE_DWARF);
        DRFaction.RED_MOUNTAINS = DRCommander.addFaction("RED_MOUNTAINS", 5701632, LOTRDimension.DimensionRegion.EAST, enumSetFreeDwarf);
        DRFaction.RED_MOUNTAINS.approvesWarCrimes = false;
    }
    
    public static void setupMapInfo() {
        DRFaction.RED_MOUNTAINS.factionMapInfo = new LOTRMapRegion(2437, 898, 454);
    }
    
    public static void setupRanks() {
        DRCommander.setFactionAchievementCategory(DRFaction.RED_MOUNTAINS, LOTRAchievement.Category.OROCARNI);
        DRCommander.addFactionRank(DRFaction.RED_MOUNTAINS, 10.0f, "guest").makeAchievement().makeTitle();
        DRCommander.addFactionRank(DRFaction.RED_MOUNTAINS, 50.0f, "friend").makeAchievement().makeTitle();
        DRCommander.addFactionRank(DRFaction.RED_MOUNTAINS, 100.0f, "oathfriend").makeAchievement().makeTitle().setPledgeRank();
        DRCommander.addFactionRank(DRFaction.RED_MOUNTAINS, 200.0f, "axebearer").makeAchievement().makeTitle();
        DRCommander.addFactionRank(DRFaction.RED_MOUNTAINS, 500.0f, "champion").makeAchievement().makeTitle();
        DRCommander.addFactionRank(DRFaction.RED_MOUNTAINS, 1000.0f, "commander").makeAchievement().makeTitle();
        DRCommander.addFactionRank(DRFaction.RED_MOUNTAINS, 1500.0f, "lord", true).makeAchievement().makeTitle();
        DRCommander.addFactionRank(DRFaction.RED_MOUNTAINS, 3000.0f, "uzbad", true).makeAchievement().makeTitle();
    }
    
    public static void setupRelations() {
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.GUNDABAD, LOTRFactionRelations.Relation.MORTAL_ENEMY);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.MORDOR, LOTRFactionRelations.Relation.MORTAL_ENEMY);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.RHUDEL, LOTRFactionRelations.Relation.FRIEND);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.ANGMAR, LOTRFactionRelations.Relation.MORTAL_ENEMY);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.ISENGARD, LOTRFactionRelations.Relation.MORTAL_ENEMY);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.DOL_GULDUR, LOTRFactionRelations.Relation.MORTAL_ENEMY);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.DORWINION, LOTRFactionRelations.Relation.FRIEND);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.HALF_TROLL, LOTRFactionRelations.Relation.MORTAL_ENEMY);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.GONDOR, LOTRFactionRelations.Relation.FRIEND);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.ROHAN, LOTRFactionRelations.Relation.FRIEND);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.DALE, LOTRFactionRelations.Relation.FRIEND);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.BLUE_MOUNTAINS, LOTRFactionRelations.Relation.ALLY);
        LOTRFactionRelations.setDefaultRelations(DRFaction.RED_MOUNTAINS, LOTRFaction.DURINS_FOLK, LOTRFactionRelations.Relation.ALLY);
    }
}
