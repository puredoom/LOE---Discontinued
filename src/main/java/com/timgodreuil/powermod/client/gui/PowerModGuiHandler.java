//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.client.gui;

import cpw.mods.fml.common.network.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import com.timgodreuil.powermod.shared.entities.*;
import com.timgodreuil.powermod.shared.containers.*;
import net.minecraft.inventory.*;

public class PowerModGuiHandler implements IGuiHandler
{
    public Object getServerGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        if (ID == 1) {
            return new CatapultContainer((EntityCatapult)world.getEntityByID(x), (IInventory)player.inventory);
        }
        return null;
    }
    
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        if (ID == 1) {
            return new CatapultGui((EntityCatapult)world.getEntityByID(x), (IInventory)player.inventory);
        }
        return null;
    }
}
