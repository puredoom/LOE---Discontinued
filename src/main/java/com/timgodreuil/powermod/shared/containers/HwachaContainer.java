package com.timgodreuil.powermod.shared.containers;

import com.timgodreuil.powermod.shared.entities.EntityHwacha;  // Updated to reference Hwacha entity
import com.timgodreuil.powermod.shared.items.ProjectileItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;

public class HwachaContainer extends Container
{
    private EntityHwacha hwacha;  // Renamed variable to Hwacha

    public HwachaContainer(final EntityHwacha hwacha, final IInventory playerInv) {  // Updated constructor
        this.hwacha = hwacha;
        // Loop through Hwacha inventory slots (adjust if Hwacha has different inventory size/layout)
        for (int i = 0; i < hwacha.inventory.getSizeInventory(); ++i) {
            // Add valid slots (adjust slot positioning if needed)
            this.addSlotToContainer(new Slot(hwacha.inventory, i, 62 + i * 18, 62) {
                @Override
                public boolean isItemValid(final ItemStack item) {
                    // Items valid for Hwacha, likely only projectiles or specific items
                    return item.getItem() instanceof ProjectileItem || item.getItem() instanceof ItemSkull;
                }
            });
        }

        // Player inventory setup (unchanged from catapult, but adjust positions if needed)
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(playerInv, i, 8 + i * 18, 142));
        }
    }

    @Override
    public boolean canInteractWith(final EntityPlayer entity) {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(final EntityPlayer playerIn, final int fromSlot) {
        ItemStack previous = null;
        final Slot slot = (Slot) this.inventorySlots.get(fromSlot);
        if (slot != null && slot.getHasStack()) {
            final ItemStack current = slot.getStack();
            previous = current.copy();
            if (fromSlot < this.hwacha.inventory.getSizeInventory()) {  // Adjust inventory comparison
                // Move from Hwacha inventory to player inventory
                if (!this.mergeItemStack(current, this.hwacha.inventory.getSizeInventory(), 36 + this.hwacha.inventory.getSizeInventory(), true)) {
                    return null;
                }
            }
            else {
                // Make sure only projectile items or skulls can go into Hwacha inventory
                if (!(current.getItem() instanceof ProjectileItem) && !(current.getItem() instanceof ItemSkull)) {
                    return null;
                }
                if (!this.mergeItemStack(current, 0, this.hwacha.inventory.getSizeInventory(), false)) {
                    return null;
                }
            }
            if (current.stackSize == 0) {
                slot.putStack((ItemStack) null);
            } else {
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
