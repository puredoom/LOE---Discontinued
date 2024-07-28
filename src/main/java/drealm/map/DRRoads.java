//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.map;

import lotr.common.world.map.*;
import drealm.util.*;

public class DRRoads
{
    public static void onInit() {
        DRCommander.registerRoad("EastWind", LOTRWaypoint.KHAND_NORTH_ROAD, new int[] { 2043, 1357 }, new int[] { 2118, 1410 }, new int[] { 2216, 1518 }, new int[] { 2318, 1532 }, DRWaypoint.BRAGAZGATHOL);
        DRCommander.registerRoad("NaragGund", LOTRWaypoint.RHUN_EAST_CITY, LOTRWaypoint.BALCARAS, new int[] { 2364, 1172 }, DRWaypoint.NARAG_GUND);
        DRCommander.registerRoad("KheledDum", DRWaypoint.KHELED_DUM, LOTRWaypoint.RHUN_ROAD_WAY, LOTRWaypoint.BALCARAS);
        DRCommander.registerRoad("KhibilTarag", DRWaypoint.KHIBIL_TARAG, new int[] { 2421, 1029 }, LOTRWaypoint.BALCARAS);
    }
}
