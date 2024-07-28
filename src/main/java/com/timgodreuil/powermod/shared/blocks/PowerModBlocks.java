//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.blocks;

import net.minecraft.block.*;
import cpw.mods.fml.common.registry.*;

public final class PowerModBlocks
{
    private PowerModBlocks() {
    }
    
    public static final void init() {
    }
    
    private static void register(final Block b, final String unlocalizedName) {
        GameRegistry.registerBlock(b, unlocalizedName);
    }
}
