//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.inventories;

import net.minecraft.inventory.*;
import net.minecraft.entity.*;
import net.minecraft.nbt.*;
import net.minecraft.item.*;
import com.timgodreuil.powermod.shared.items.*;

public class CatapultInventory extends InventoryBasic
{
    private Entity entity;
    
    public CatapultInventory(final String name, final Entity entity) {
        super(name, name != "", 3);
        this.entity = entity;
    }
    
    public void writeToNBT(final NBTTagCompound nbt) {
        final NBTTagList list = new NBTTagList();
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            final ItemStack item = this.getStackInSlot(i);
            if (item != null) {
                final NBTTagCompound itemCompound = new NBTTagCompound();
                itemCompound.setByte("Slot", (byte)i);
                item.writeToNBT(itemCompound);
                list.appendTag((NBTBase)itemCompound);
            }
        }
        nbt.setTag("Inventory", (NBTBase)list);
    }
    
    public boolean isItemValidForSlot(final int slot, final ItemStack item) {
        return item.getItem() instanceof ProjectileItem;
    }
    
    public void readFromNBT(final NBTTagCompound nbt) {
        final NBTTagList list = nbt.getTagList("Inventory", 10);
        for (int i = 0; i < list.tagCount(); ++i) {
            final NBTTagCompound itemCompound = list.getCompoundTagAt(i);
            final int slot = itemCompound.getByte("Slot");
            if (slot >= 0 && slot < this.getSizeInventory()) {
                this.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(itemCompound));
            }
        }
    }
    
    public void dropAllItems() {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            final ItemStack itemstack = this.getStackInSlot(i);
            if (itemstack != null) {
                this.dropItem(itemstack);
                this.setInventorySlotContents(i, (ItemStack)null);
            }
        }
    }
    
    protected void dropItem(final ItemStack itemstack) {
        this.entity.entityDropItem(itemstack, 0.0f);
    }
    
    public boolean isEmpty() {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i) != null) {
                return false;
            }
        }
        return true;
    }
    
    public boolean isFull() {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.getStackInSlot(i) == null) {
                return false;
            }
        }
        return true;
    }
}
