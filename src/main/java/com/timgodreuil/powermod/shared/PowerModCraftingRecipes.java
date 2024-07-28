//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared;

import com.timgodreuil.powermod.shared.items.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.init.*;

public class PowerModCraftingRecipes
{
    private PowerModCraftingRecipes() {
    }
    
    public static final void init() {
        GameRegistry.addRecipe(new ItemStack(PowerModItems.rock), new Object[] { "AAA", "AAA", "AAA", 'A', Blocks.cobblestone });
        GameRegistry.addRecipe(new ItemStack(PowerModItems.catapult), new Object[] { "BAC", " A ", "AAA", 'A', Blocks.log, 'B', Blocks.iron_block, 'C', Blocks.cobblestone });
        GameRegistry.addRecipe(new ItemStack(PowerModItems.wrench), new Object[] { " AA", " AA", "A  ", 'A', Items.iron_ingot });
    }
}
