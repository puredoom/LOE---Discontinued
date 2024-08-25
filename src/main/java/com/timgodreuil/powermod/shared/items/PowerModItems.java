//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.items;

import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;

public final class PowerModItems
{
    public static Item rock;
    public static Item wrench;
    public static Item catapult;
    public static Item fireProjectile;

    public static Item hwacha;
    
    private PowerModItems() {
    }
    
    public static final void init() {
        register(PowerModItems.rock = (Item)new ItemRock("rock"), "rock");
        register(PowerModItems.wrench = (Item)new ItemWrench("wrench"), "wrench");
        register(PowerModItems.catapult = (Item)new ItemCatapult("catapult"), "catapult");
        register(PowerModItems.hwacha = (Item)new ItemHwacha("hwacha"), "hwacha");
        register(PowerModItems.fireProjectile = (Item)new ItemFireProjectile("fireProjectile"), "fireProjectile");
    }
    
    private static void register(final Item item, final String unlocalizedName) {
        GameRegistry.registerItem(item, unlocalizedName);
    }
}
