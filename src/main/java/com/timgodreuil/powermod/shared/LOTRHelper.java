//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared;

import net.minecraft.world.*;
import net.minecraft.entity.projectile.*;
import lotr.common.*;

public final class LOTRHelper
{
    private static boolean LOTRModPresent;
    
    private LOTRHelper() {
    }
    
    public static void init() {
        try {
            Class.forName("lotr.common.LOTRMod");
            LOTRHelper.LOTRModPresent = true;
            System.out.println("Found LOTRMod!");
        }
        catch (ClassNotFoundException e) {
            LOTRHelper.LOTRModPresent = false;
            System.out.println("Missing LOTRMod!");
        }
    }
    
    public static boolean isLOTRModPresent() {
        return LOTRHelper.LOTRModPresent;
    }
    
    public static boolean isProtected(final World w, final int x, final int y, final int z, final EntityThrowable entity, final boolean sendMessage) {
        return LOTRHelper.LOTRModPresent && LOTRBannerProtection.isProtected(w, x, y, z, LOTRBannerProtection.forThrown(entity), sendMessage);
    }
    
    static {
        LOTRHelper.LOTRModPresent = false;
    }
}
