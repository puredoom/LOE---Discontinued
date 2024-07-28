//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.entities;

import net.minecraft.entity.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import net.minecraft.nbt.*;
import net.minecraft.item.*;

public abstract class Repairable extends Entity
{
    public Repairable(final World world) {
        super(world);
    }
    
    protected void entityInit() {
        this.dataWatcher.addObject(17, (Object)this.getMaxHealth());
    }
    
    public void setHealth(final float health) {
        this.dataWatcher.updateObject(17, (Object)health);
    }
    
    public float getHealth() {
        return this.dataWatcher.getWatchableObjectFloat(17);
    }
    
    public boolean canBeCollidedWith() {
        return true;
    }
    
    public AxisAlignedBB getBoundingBox() {
        return this.boundingBox;
    }
    
    public AxisAlignedBB getCollisionBox(final Entity entity) {
        if (entity instanceof EntityProjectile) {
            return null;
        }
        return entity.boundingBox;
    }
    
    public boolean attackEntityFrom(final DamageSource source, final float damage) {
        if (this.isEntityInvulnerable()) {
            return false;
        }
        this.setHealth(this.getHealth() - damage);
        return super.attackEntityFrom(source, damage);
    }
    
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= 0.03999999910593033;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863;
        this.motionY *= 0.9800000190734863;
        this.motionZ *= 0.9800000190734863;
        if (this.onGround) {
            this.motionY = 0.0;
        }
        if (!this.worldObj.isRemote && this.getHealth() <= 0.0f) {
            this.onKillEntity();
        }
    }
    
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setFloat("health", this.getHealth());
    }
    
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.setHealth(compound.getFloat("health"));
    }
    
    public abstract float getMaxHealth();
    
    public abstract float getHealthPerRepair();
    
    public abstract ItemStack getRepairItem();
    
    public abstract boolean canBeRepaired(final ItemStack p0);
    
    public abstract void onKillEntity();
}
