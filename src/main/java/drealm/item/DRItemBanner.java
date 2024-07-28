//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.item;

import lotr.common.item.*;
import drealm.database.*;
import drealm.util.*;

public class DRItemBanner
{
    public static LOTRItemBanner.BannerType RED_MOUNTAINS;
    
    public static void preInit() {
        DRItemBanner.RED_MOUNTAINS = DRCommander.addBanner("red_mountains", DRFaction.RED_MOUNTAINS);
    }
}
