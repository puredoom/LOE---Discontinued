//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.items;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import com.timgodreuil.powermod.shared.entities.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import net.minecraftforge.common.util.*;

public class ItemCatapult extends Item
{
    public ItemCatapult(final String name) {
        this.setUnlocalizedName(name);
        this.setTextureName("powermod:" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
    
    public boolean onItemUse(ItemStack stack, final EntityPlayer player, final World world, final int x, final int y, final int z, final int side, final float px, final float py, final float pz) {
        if (this.canPlaceCatapultAt(world, x, y, z)) {
            final ItemStack itemStack = stack;
            --itemStack.stackSize;
            if (stack.stackSize <= 0) {
                stack = null;
            }
            if (!world.isRemote) {
                final EntityCatapult entity = new EntityCatapult(world);
                entity.setPosition((double)(x + 0.5f), (double)(y + 1.5f), (double)(z + 0.5f));
                world.spawnEntityInWorld((Entity)entity);
                entity.setCatapultRotation((float)this.getCatapultRotation(player));
            }
            return true;
        }
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("\ufffdcCannot place " + StatCollector.translateToLocal("entity.catapult.name") + " here!"));
        return false;
    }
    
    private int getCatapultRotation(final EntityPlayer player) {
        final float yaw = (float)Math.floorMod((int)player.rotationYawHead, 360);
        if (yaw >= 45.0f && yaw < 135.0f) {
            return 180;
        }
        if (yaw >= 135.0f && yaw < 225.0f) {
            return 90;
        }
        if (yaw >= 225.0f && yaw < 315.0f) {
            return 0;
        }
        if (yaw < 45.0f || yaw >= 325.0f) {
            return 270;
        }
        return 0;
    }
    
    private boolean canPlaceCatapultAt(final World w, final int x, final int y, final int z) {
        for (int i = -2; i < 3; ++i) {
            for (int j = -2; j < 3; ++j) {
                for (int k = 0; k < 5; ++k) {
                    if (!w.getBlock(x + i, y + 1 + k, z + j).equals(Blocks.air)) {
                        return false;
                    }
                }
                if (!w.isSideSolid(x + i, y, z + j, ForgeDirection.UP)) {
                    return false;
                }
            }
        }
        return true;
    }
}
