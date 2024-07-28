//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import lotr.common.*;
import drealm.util.*;

public class DRCreativeTabs
{
    public static LOTRCreativeTabs tabCombat;
    public static LOTRCreativeTabs tabTools;
    public static LOTRCreativeTabs tabMaterials;
    public static LOTRCreativeTabs tabBlocks;
    
    public static void preInit() {
        DRCreativeTabs.tabCombat = DRCommander.getLOTRCreativeTab("tabCombat");
        DRCreativeTabs.tabTools = DRCommander.getLOTRCreativeTab("tabTools");
        DRCreativeTabs.tabMaterials = DRCommander.getLOTRCreativeTab("tabMaterials");
        DRCreativeTabs.tabBlocks = DRCommander.getLOTRCreativeTab("tabBlock");
    }
}
