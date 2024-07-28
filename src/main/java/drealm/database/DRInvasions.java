//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import lotr.common.world.spawning.*;
import drealm.util.*;
import drealm.entity.*;

public class DRInvasions
{
    public static LOTRInvasions RED_MOUNTAINS;
    
    public static void addInvasionIcons() {
        DRCommander.changeInvasionIcon(DRInvasions.RED_MOUNTAINS, DRRegistry.hammerRedDwarven);
    }
    
    public static void addInvasionMobs() {
        DRInvasions.RED_MOUNTAINS.invasionMobs.add(new LOTRInvasions.InvasionSpawnEntry((Class)DREntityRedDwarfWarrior.class, 10));
        DRInvasions.RED_MOUNTAINS.invasionMobs.add(new LOTRInvasions.InvasionSpawnEntry((Class)DREntityRedDwarfAxeThrower.class, 5));
        DRInvasions.RED_MOUNTAINS.invasionMobs.add(new LOTRInvasions.InvasionSpawnEntry((Class)DREntityRedDwarfBannerBearer.class, 2));
    }
    
    public static void onInit() {
        setupInvasions();
        addInvasionIcons();
        addInvasionMobs();
    }
    
    public static void setupInvasions() {
        DRInvasions.RED_MOUNTAINS = DRCommander.addInvasion("RED_MOUNTAINS", DRFaction.RED_MOUNTAINS);
    }
}
