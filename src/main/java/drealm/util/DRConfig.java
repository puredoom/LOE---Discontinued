//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.util;

import net.minecraftforge.common.config.*;
import java.io.*;
import java.util.*;

public class DRConfig
{
    public static Configuration config;
    public static List<String> allCategories;
    public static String CATEGORY_MISC;
    public static boolean enableTextures14;
    public static boolean enableRussian;
    
    public static String getCategory(final String category) {
        DRConfig.allCategories.add(category);
        return category;
    }
    
    public static void load() {
        DRConfig.enableTextures14 = DRConfig.config.get(DRConfig.CATEGORY_MISC, "Enable 1.14 Textures", false).getBoolean();
        DRConfig.enableRussian = DRConfig.config.get(DRConfig.CATEGORY_MISC, "Enable Russian text assets", false).getBoolean();
        if (DRConfig.config.hasChanged()) {
            DRConfig.config.save();
        }
    }
    
    public static void preInit() {
        DRConfig.config = new Configuration(new File("config", "Dwarven Realm.cfg"));
        load();
    }
    
    static {
        DRConfig.allCategories = new ArrayList<String>();
        DRConfig.CATEGORY_MISC = getCategory("1_misc");
    }
}
