//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.items;

import net.minecraft.item.*;
import net.minecraft.creativetab.*;

public class ItemWrench extends Item
{
    public ItemWrench(final String name) {
        this.setUnlocalizedName(name);
        this.setTextureName("powermod:" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}
