//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.entities;

import net.minecraft.entity.*;
import com.timgodreuil.powermod.shared.*;
import cpw.mods.fml.common.registry.*;

public class PowerModEntities
{
    private PowerModEntities() {
    }
    
    public static final void init() {
        register((Class<? extends Entity>)EntityCatapult.class, "catapult", 1030, 200, 10, true);
        register((Class<? extends Entity>)EntityRock.class, "rock", 1031, 100, 10, true);
        register((Class<? extends Entity>)EntityFireProjectile.class, "fireProjectile", 1032, 200, 10, true);
        register((Class<? extends Entity>)EntityHwacha.class, "hwacha", 1033, 200, 10, true);
    }
    
    private static void register(final Class<? extends Entity> entityClass, final String name, final int id, final int updateRange, final int updateFreq, final boolean sendVelocityUpdates) {
        EntityRegistry.registerModEntity((Class)entityClass, name, id, (Object)PowerMod.instance, updateRange, updateFreq, sendVelocityUpdates);
    }
}
