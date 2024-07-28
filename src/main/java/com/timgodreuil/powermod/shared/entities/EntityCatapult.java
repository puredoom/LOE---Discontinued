//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.entities;

import com.timgodreuil.powermod.shared.inventories.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import com.timgodreuil.powermod.shared.items.*;
import com.timgodreuil.powermod.shared.*;
import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import com.timgodreuil.powermod.shared.network.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import net.minecraft.item.*;
import com.timgodreuil.powermod.shared.network.packets.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.init.*;

public class EntityCatapult extends Repairable
{
    private float power;
    private float rotation;
    public CatapultInventory inventory;
    private CatapultState currentState;
    private int stateTick;
    private ProjectileItem projectile;
    public static final int ID_GUI = 1;
    private static final ItemStack REPAIR_COST;
    
    public EntityCatapult(final World world) {
        super(world);
        this.power = 1.0f;
        this.rotation = 0.0f;
        this.inventory = new CatapultInventory("Catapult", this);
        this.currentState = CatapultState.NOT_LOADED;
        this.stateTick = 0;
        this.setSize(4.0f, 4.0f);
    }
    
    public boolean interactFirst(final EntityPlayer entityplayer) {
        if (this.worldObj.isRemote) {
            return entityplayer.getDistanceSq(this.posX, this.posY, this.posZ) < 64.0;
        }
        if (entityplayer.getDistanceSq(this.posX, this.posY, this.posZ) >= 64.0) {
            return false;
        }
        if (entityplayer.isSneaking()) {
            this.rotation += 5.0f;
            if (this.rotation >= 360.0f) {
                this.rotation = 0.0f;
            }
            this.setCatapultRotation(this.rotation);
            return true;
        }
        if (entityplayer.getCurrentEquippedItem() == null || !entityplayer.getCurrentEquippedItem().getItem().equals(PowerModItems.wrench)) {
            this.updateCatapultClients(10);
            entityplayer.openGui((Object)PowerMod.instance, 1, this.worldObj, this.getEntityId(), 0, 0);
            return true;
        }
        return true;
    }
    
    public boolean canBePushed() {
        return false;
    }
    
    public int getProjectileItemFromInventory() {
        int slot = -1;
        for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
            if (this.inventory.getStackInSlot(i) != null && (this.inventory.getStackInSlot(i).getItem() instanceof ProjectileItem || this.inventory.getStackInSlot(i).getItem() instanceof ItemSkull)) {
                slot = i;
                break;
            }
        }
        return slot;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.currentState == CatapultState.RELOADING) {
            ++this.stateTick;
            if (this.stateTick > CatapultState.RELOADING.getDuration()) {
                this.setState(CatapultState.LOADED);
                this.stateTick = 0;
            }
        }
        else if (this.currentState == CatapultState.SHOOTING) {
            ++this.stateTick;
            if (this.stateTick > CatapultState.SHOOTING.getDuration()) {
                this.setState(CatapultState.NOT_LOADED);
                this.stateTick = 0;
            }
        }
    }
    
    public float getDirectionX() {
        return (float)Math.cos(Math.toRadians(360.0f - this.rotationYaw));
    }
    
    public float getDirectionZ() {
        return (float)Math.sin(Math.toRadians(360.0f - this.rotationYaw));
    }
    
    public float getPower() {
        return this.power;
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);
        this.inventory.writeToNBT(compound);
        compound.setFloat("catapultYaw", this.rotation);
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.inventory.readFromNBT(compound);
        this.rotation = compound.getFloat("catapultYaw");
    }
    
    public float getRotation() {
        return this.rotation;
    }
    
    public void setCatapultRotation(final float rotation) {
        this.setRotation(this.rotation = rotation, 0.0f);
        if (!this.worldObj.isRemote) {
            this.updateCatapultClients(150);
        }
    }
    
    public void setCatapultPower(final float power) {
        this.power = power;
        if (!this.worldObj.isRemote) {
            this.updateCatapultClients(150);
        }
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        return new ItemStack(PowerModItems.catapult, 1, 0);
    }
    
    public void readEntityFromNBT(final NBTTagCompound p_70037_1_) {
    }
    
    public void writeEntityToNBT(final NBTTagCompound p_70014_1_) {
    }
    
    public double getCatapultPower() {
        return this.power;
    }
    
    public void setState(final CatapultState state) {
        this.currentState = state;
        if (!this.worldObj.isRemote) {
            this.updateStateClients();
        }
    }
    
    public void handleButtonClick(final EntityPlayer player) {
        switch (this.currentState) {
            case LOADED: {
                this.launchProjectile(player);
                break;
            }
            case NOT_LOADED: {
                this.reloadCatapult(player);
            }
            case RELOADING: {}
        }
    }
    
    public void reloadCatapult(final EntityPlayer player) {
        final int slot = this.getProjectileItemFromInventory();
        if (slot != -1) {
            this.setState(CatapultState.RELOADING);
            if (!this.worldObj.isRemote) {
                this.projectile = (ProjectileItem)this.inventory.getStackInSlot(slot).getItem();
                this.updateCatapultClients(10);
                final ItemStack getStackInSlot = this.inventory.getStackInSlot(slot);
                --getStackInSlot.stackSize;
                if (this.inventory.getStackInSlot(slot).stackSize <= 0) {
                    this.inventory.setInventorySlotContents(slot, (ItemStack)null);
                }
            }
        }
        else if (!this.worldObj.isRemote) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "This catapult doesn't have any projectile!"));
        }
    }
    
    public void launchProjectile(final EntityPlayer player) {
        if (this.projectile == null) {
            return;
        }
        final EntityThrowable ent = this.projectile.getProjectile(this.worldObj, this.posX - this.getDirectionX() * this.width / 2.0f + 0.5, this.posY + 2.0, this.posZ - this.getDirectionZ() * this.width / 2.0f, (EntityLivingBase)player);
        this.setState(CatapultState.SHOOTING);
        if (this.worldObj.isRemote) {
            return;
        }
        ent.motionX = this.getDirectionX() * this.power;
        ent.motionY = this.power / 2.0f;
        ent.motionZ = this.getDirectionZ() * this.power;
        this.worldObj.spawnEntityInWorld((Entity)ent);
        this.projectile = null;
        this.updateCatapultClients(10);
    }
    
    @Override
    public void onKillEntity() {
        this.setDead();
        this.inventory.dropAllItems();
    }
    
    public CatapultState getState() {
        return this.currentState;
    }
    
    public ProjectileItem getProjectile() {
        return this.projectile;
    }
    
    public int getStateTick() {
        return this.stateTick;
    }
    
    public void updateStateClients() {
        PacketHandler.NETWORK_WRAPPER.sendToAllAround((IMessage)new PacketUpdateState(this), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, 150.0));
    }
    
    public void updateCatapultClients(final int radius) {
        PacketHandler.NETWORK_WRAPPER.sendToAllAround((IMessage)new PacketUpdateCatapult(this, this.rotation, this.power, (this.projectile != null) ? Item.getIdFromItem((Item)this.projectile) : -1), new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, (double)radius));
    }
    
    @SideOnly(Side.CLIENT)
    public void setProjectileItem(final ProjectileItem projectile) {
        this.projectile = projectile;
    }
    
    @Override
    public float getMaxHealth() {
        return 50.0f;
    }
    
    @Override
    public ItemStack getRepairItem() {
        return EntityCatapult.REPAIR_COST;
    }
    
    @Override
    public boolean canBeRepaired(final ItemStack tool) {
        return true;
    }
    
    @Override
    public float getHealthPerRepair() {
        return 20.0f;
    }
    
    static {
        REPAIR_COST = new ItemStack(Items.iron_ingot, 15);
    }
}
