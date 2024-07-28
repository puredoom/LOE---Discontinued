//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import lotr.common.*;
import lotr.common.fac.*;
import drealm.util.*;
import java.util.*;
import net.minecraft.util.*;

public class DRShields
{
    public static LOTRShields ALIGNMENT_RED_MOUNTAINS;
    
    public static LOTRShields addAlignmentShield(final String enumName, final LOTRFaction faction) {
        final LOTRShields shield = DRCommander.addAlignmentShield(enumName, faction);
        DRCommander.setShieldTexture(shield, new ResourceLocation("drealm", "shield/" + shield.name().toLowerCase(Locale.ROOT) + ".png"));
        return shield;
    }
    
    public static void onInit() {
        DRShields.ALIGNMENT_RED_MOUNTAINS = addAlignmentShield("ALIGNMENT_RED_MOUNTAINS", DRFaction.RED_MOUNTAINS);
    }
}
