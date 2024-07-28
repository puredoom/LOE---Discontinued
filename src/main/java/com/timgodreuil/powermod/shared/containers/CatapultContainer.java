//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.containers;

import com.timgodreuil.powermod.shared.entities.*;
import net.minecraft.inventory.*;
import com.timgodreuil.powermod.shared.items.*;
import net.minecraft.item.*;
import net.minecraft.entity.player.*;

public class CatapultContainer extends Container
{
    private EntityCatapult catapult;
    
    public CatapultContainer(final EntityCatapult catapult, final IInventory playerInv) {
        this.catapult = catapult;
        for (int i = 0; i < catapult.inventory.getSizeInventory(); ++i) {
            this.addSlotToContainer((Slot)new Slot(catapult.inventory, i, 62 + i * 18, 62) {
                public boolean isItemValid(final ItemStack item) {
                    return item.getItem() instanceof ProjectileItem || item.getItem() instanceof ItemSkull;
                }
            });
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(playerInv, i, 8 + i * 18, 142));
        }
    }
    
    public boolean canInteractWith(final EntityPlayer entity) {
        return true;
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer playerIn, final int fromSlot) {
        ItemStack previous = null;
        final Slot slot = (Slot) this.inventorySlots.get(fromSlot);
        if (slot != null && slot.getHasStack()) {
            final ItemStack current = slot.getStack();
            previous = current.copy();
            if (fromSlot < this.catapult.inventory.getSizeInventory()) {
                if (!this.mergeItemStack(current, this.catapult.inventory.getSizeInventory(), 36 + this.catapult.inventory.getSizeInventory(), true)) {
                    return null;
                }
            }
            else {
                if (!(current.getItem() instanceof ProjectileItem) || !(current.getItem() instanceof ItemSkull)) {
                    return null;
                }
                if (!this.mergeItemStack(current, 0, this.catapult.inventory.getSizeInventory(), false)) {
                    return null;
                }
            }
            if (current.stackSize == 0) {
                slot.putStack((ItemStack)null);
            }
            else {
                slot.onSlotChanged();
            }
            if (current.stackSize == previous.stackSize) {
                return null;
            }
            slot.onPickupFromSlot(playerIn, current);
        }
        return previous;
    }
}
