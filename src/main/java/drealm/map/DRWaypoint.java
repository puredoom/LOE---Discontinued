//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.map;

import lotr.common.world.map.*;
import drealm.database.*;
import drealm.util.*;
import lotr.common.fac.*;

public class DRWaypoint
{
    public static LOTRWaypoint NARAG_GUND;
    public static LOTRWaypoint KHIBIL_TARAG;
    public static LOTRWaypoint KHELED_DUM;
    public static LOTRWaypoint RED_ROAD;
    public static LOTRWaypoint BRAGAZGATHOL;
    public static LOTRWaypoint HALLS_OF_MANDOS;
    public static LOTRWaypoint FORMENOS;
    public static LOTRWaypoint TIRION;
    public static LOTRWaypoint ALQUALONDE;
    public static LOTRWaypoint TOL_ERESSEA;
    public static LOTRWaypoint ILMARIN;
    public static LOTRWaypoint.Region VALINOR;
    
    public static void preInit() {
        DRWaypoint.NARAG_GUND = DRCommander.addWaypoint("NARAG_GUND", LOTRWaypoint.Region.RHUN, DRFaction.RED_MOUNTAINS, 2579.0, 1262.0);
        DRWaypoint.KHIBIL_TARAG = DRCommander.addWaypoint("KHIBIL_TARAG", LOTRWaypoint.Region.RHUN, DRFaction.RED_MOUNTAINS, 2448.0, 952.0);
        DRWaypoint.KHELED_DUM = DRCommander.addWaypoint("KHELED_DUM", LOTRWaypoint.Region.RHUN, DRFaction.RED_MOUNTAINS, 2382.0, 570.0);
        DRWaypoint.HALLS_OF_MANDOS = DRCommander.addWaypoint("HALLS_OF_MANDOS", LOTRWaypoint.Region.MENELTARMA, LOTRFaction.UNALIGNED, 52.0, 1401.0);
        DRWaypoint.FORMENOS = DRCommander.addWaypoint("FORMENOS", LOTRWaypoint.Region.MENELTARMA, LOTRFaction.UNALIGNED, 112.0, 1442.0);
        DRWaypoint.TIRION = DRCommander.addWaypoint("TIRION", LOTRWaypoint.Region.MENELTARMA, LOTRFaction.UNALIGNED, 118.0, 1470.0);
        DRWaypoint.ALQUALONDE = DRCommander.addWaypoint("ALQUALONDE", LOTRWaypoint.Region.MENELTARMA, LOTRFaction.UNALIGNED, 139.0, 1452.0);
        DRWaypoint.TOL_ERESSEA = DRCommander.addWaypoint("TOL_ERESSEA", LOTRWaypoint.Region.MENELTARMA, LOTRFaction.UNALIGNED, 194.0, 1483.0);
        DRWaypoint.ILMARIN = DRCommander.addWaypoint("ILMARIN", LOTRWaypoint.Region.MENELTARMA, LOTRFaction.UNALIGNED, 111.0, 1486.0);
    }
}
