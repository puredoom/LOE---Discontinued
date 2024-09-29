package com.timgodreuil.powermod.shared.entities;

import com.timgodreuil.powermod.shared.PowerMod;
import com.timgodreuil.powermod.shared.inventories.CatapultInventory;
import com.timgodreuil.powermod.shared.items.PowerModItems;
import com.timgodreuil.powermod.shared.items.ProjectileItem;
import com.timgodreuil.powermod.shared.network.PacketHandler;
import com.timgodreuil.powermod.shared.network.packets.PacketUpdateCatapult;
import com.timgodreuil.powermod.shared.network.packets.PacketUpdateHwacha;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityHwacha extends Repairable {
    private float power;
    private float rotation;
    public CatapultInventory inventory;
    private CatapultState currentState;
    private int stateTick;
    private ProjectileItem projectile;
    public static final int ID_GUI = 1;
    private static final ItemStack REPAIR_COST;

    public EntityHwacha(final World world) {
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
            this.rotation = (this.rotation + 5.0f) % 360.0f;
            this.setCatapultRotation(this.rotation);
            return true;
        }
        if (entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().getItem() == PowerModItems.wrench) {
            // Optional wrench action handling
            return true;
        }
        this.updateHwachaClients(10);
        entityplayer.openGui(PowerMod.instance, ID_GUI, this.worldObj, this.getEntityId(), 0, 0);
        return true;
    }

    public boolean canBePushed() {
        return false;
    }

    public int getProjectileItemFromInventory() {
        for (int i = 0; i < this.inventory.getSizeInventory(); ++i) {
            ItemStack stack = this.inventory.getStackInSlot(i);
            if (stack != null && (stack.getItem() instanceof ProjectileItem || stack.getItem() instanceof ItemSkull)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.currentState == CatapultState.RELOADING) {
            if (++this.stateTick > CatapultState.RELOADING.getDuration()) {
                this.setState(CatapultState.LOADED);
                this.stateTick = 0;
            }
        } else if (this.currentState == CatapultState.SHOOTING) {
            if (++this.stateTick > CatapultState.SHOOTING.getDuration()) {
                this.setState(CatapultState.NOT_LOADED);
                this.stateTick = 0;
            }
        }
    }

    public float getDirectionX() {
        return (float) Math.cos(Math.toRadians(360.0f - this.rotation));
    }

    public float getDirectionZ() {
        return (float) Math.sin(Math.toRadians(360.0f - this.rotation));
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

    @Override
    protected void readEntityFromNBT(NBTTagCompound tagCompund) {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound tagCompound) {

    }

    public void setCatapultRotation(final float rotation) {
        this.rotation = rotation;
        this.setRotation(rotation, 0.0f);
        if (!this.worldObj.isRemote) {
            this.updateHwachaClients(150);
        }
    }

    public void setCatapultPower(final float power) {
        this.power = power;
        if (!this.worldObj.isRemote) {
            this.updateHwachaClients(150);
        }
    }

    public ItemStack getPickedResult(final MovingObjectPosition target) {
        return new ItemStack(PowerModItems.hwacha, 1, 0);
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
            case LOADED:
                this.launchProjectile(player);
                break;
            case NOT_LOADED:
                this.reloadCatapult(player);
                break;
            case RELOADING:
                // Optionally handle reloading state here
                break;
        }
    }

    public void reloadCatapult(final EntityPlayer player) {
        final int slot = this.getProjectileItemFromInventory();
        if (slot != -1) {
            this.setState(CatapultState.RELOADING);
            if (!this.worldObj.isRemote) {
                this.projectile = (ProjectileItem) this.inventory.getStackInSlot(slot).getItem();
                this.updateHwachaClients(10);
                ItemStack getStackInSlot = this.inventory.getStackInSlot(slot);
                --getStackInSlot.stackSize;
                if (getStackInSlot.stackSize <= 0) {
                    this.inventory.setInventorySlotContents(slot, null);
                }
            }
        } else if (!this.worldObj.isRemote) {
            player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED + "This hwacha doesn't have any projectile!"));
        }
    }

    public void launchProjectile(final EntityPlayer player) {
        if (this.projectile == null) {
            return;
        }
        final EntityThrowable ent = this.projectile.getProjectile(this.worldObj,
                this.posX - this.getDirectionX() * this.width / 2.0f + 0.5,
                this.posY + 2.0,
                this.posZ - this.getDirectionZ() * this.width / 2.0f,
                player);

        this.setState(CatapultState.SHOOTING);
        if (this.worldObj.isRemote) {
            return;
        }

        ent.motionX = this.getDirectionX() * this.power;
        ent.motionY = this.power / 2.0f;
        ent.motionZ = this.getDirectionZ() * this.power;
        this.worldObj.spawnEntityInWorld(ent);
        this.projectile = null;
        this.updateHwachaClients(10);
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
        // Implement state update logic if necessary
    }

    public void updateHwachaClients(final int radius) {
        PacketHandler.NETWORK_WRAPPER.sendToAllAround(
                new PacketUpdateHwacha(this, this.rotation, this.power,
                        this.projectile != null ? Item.getIdFromItem((Item) this.projectile) : -1),
                new NetworkRegistry.TargetPoint(this.worldObj.provider.dimensionId, this.posX, this.posY, this.posZ, radius)
        );
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
        return EntityHwacha.REPAIR_COST;
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
