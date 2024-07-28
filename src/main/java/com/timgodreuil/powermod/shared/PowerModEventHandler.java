//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared;

import net.minecraftforge.event.entity.player.*;
import com.timgodreuil.powermod.shared.entities.*;
import com.timgodreuil.powermod.shared.items.*;
import net.minecraft.util.*;
import cpw.mods.fml.common.eventhandler.*;
import cpw.mods.fml.common.gameevent.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;

public class PowerModEventHandler
{
    @SubscribeEvent
    public void onItemRightClick(final EntityInteractEvent e) {
        if (!e.entityPlayer.worldObj.isRemote && !e.entityPlayer.isSneaking() && e.target != null && !e.target.isDead && e.target instanceof Repairable && e.entityPlayer.getCurrentEquippedItem() != null && e.entityPlayer.getCurrentEquippedItem().getItem().equals(PowerModItems.wrench)) {
            final Repairable repairable = (Repairable)e.target;
            if (repairable.canBeRepaired(e.entityPlayer.getCurrentEquippedItem())) {
                if (repairable.getHealth() == repairable.getMaxHealth()) {
                    e.entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "This object doesn't need to be repaired!"));
                    ((EntityPlayerMP)e.entityPlayer).func_143004_u();
                }
                else if (this.hasItem(repairable.getRepairItem(), e.entityPlayer)) {
                    e.setCanceled(true);
                    this.removeItem(repairable.getRepairItem(), e.entityPlayer);
                    final float newHealth = Math.min(repairable.getHealth() + repairable.getHealthPerRepair(), repairable.getMaxHealth());
                    repairable.setHealth(newHealth);
                    e.entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Repaired (" + repairable.getHealth() + "/" + repairable.getMaxHealth() + ")."));
                }
                else {
                    e.entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You can't repair this (you need " + repairable.getRepairItem().stackSize + "x " + StatCollector.translateToLocal(repairable.getRepairItem().getItem().getUnlocalizedName() + ".name") + ")."));
                }
            }
        }
    }
    
    @SubscribeEvent
    public void onTick(final TickEvent.WorldTickEvent e) {
        if (e.phase.equals((Object)TickEvent.Phase.START)) {}
    }
    
    private boolean hasItem(final ItemStack item, final EntityPlayer target) {
        final InventoryPlayer inv = target.inventory;
        int count = 0;
        for (int i = 0; i < inv.mainInventory.length; ++i) {
            if (inv.mainInventory[i] != null && inv.mainInventory[i].getItem().equals(item.getItem()) && inv.mainInventory[i].getItemDamage() == item.getItemDamage()) {
                count += inv.mainInventory[i].stackSize;
            }
        }
        return count >= item.stackSize;
    }
    
    private void removeItem(final ItemStack item, final EntityPlayer target) {
        final InventoryPlayer inv = target.inventory;
        int count = item.stackSize;
        for (int i = 0; i < inv.mainInventory.length; ++i) {
            if (inv.mainInventory[i] != null && inv.mainInventory[i].getItem().equals(item.getItem()) && inv.mainInventory[i].getItemDamage() == item.getItemDamage()) {
                if (inv.mainInventory[i].stackSize >= count) {
                    final ItemStack itemStack = inv.mainInventory[i];
                    itemStack.stackSize -= count;
                    if (inv.mainInventory[i].stackSize == 0) {
                        inv.mainInventory[i] = null;
                    }
                    return;
                }
                if (inv.mainInventory[i].stackSize < count) {
                    count -= inv.mainInventory[i].stackSize;
                    inv.mainInventory[i] = null;
                }
            }
        }
    }
}
