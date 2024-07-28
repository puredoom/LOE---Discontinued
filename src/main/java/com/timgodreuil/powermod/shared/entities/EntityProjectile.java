//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.entities;

import net.minecraft.entity.projectile.*;
import java.lang.reflect.*;
import net.minecraft.world.*;
import net.minecraft.block.*;
import com.timgodreuil.powermod.shared.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.nbt.*;

public abstract class EntityProjectile extends EntityThrowable
{
    private int rotation;
    private int prevRotation;
    private float damage;
    
    public EntityProjectile(final World world) {
        super(world);
    }

    public EntityProjectile(final World world, final double x, final double y, final double z, final EntityLivingBase shooter) {
        super(world, x, y, z);
        try {
            final Field thrower = EntityThrowable.class.getDeclaredField("thrower");
            thrower.setAccessible(true);
            thrower.set(this, shooter);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    
    public EntityProjectile(final World world, final EntityLivingBase shooter) {
        super(world, shooter);
    }
    
    public boolean func_145774_a(final Explosion ex, final World w, final int x, final int y, final int z, final Block b, final float strength) {
        return (this.worldObj.isRemote || !LOTRHelper.isProtected(w, x, y, z, this, true)) && super.func_145774_a(ex, w, x, y, z, b, strength);
    }
    
    public abstract float getExplosionPower();
    
    public abstract int getFireTicks();
    
    protected void onImpact(final MovingObjectPosition pos) {
        if (pos.entityHit != null && pos.entityHit instanceof EntityCatapult) {
            return;
        }
        this.kill();
        if (!this.worldObj.isRemote && LOTRHelper.isProtected(this.worldObj, pos.blockX, pos.blockY, pos.blockY, this, true)) {
            return;
        }
        final float radius = this.width * 5.0f;
        final List<Entity> entities = (List<Entity>)this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, AxisAlignedBB.getBoundingBox(this.posX - radius, this.posY - radius, this.posZ - radius, this.posX + radius, this.posY + radius, this.posZ + radius));
        for (final Entity entity : entities) {
            if (entity == null) {
                continue;
            }
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)this.getThrower()), this.getDamage());
            entity.setFire((this.getFireTicks() > 0) ? this.getFireTicks() : 0);
        }
        if (this.worldObj.isRemote) {
            return;
        }
        if (this.getExplosionPower() > 0.0f) {
            this.worldObj.newExplosion((Entity)this, this.posX, this.posY, this.posZ, this.getExplosionPower(), this.getFireTicks() > 0, true);
        }
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (!this.inGround) {
            this.prevRotation = this.rotation;
            this.rotation += 15;
            if (this.rotation > 360) {
                this.rotation = 0;
            }
        }
    }
    
    public boolean canBeCollidedWith() {
        return false;
    }
    
    public AxisAlignedBB getBoundingBox() {
        return this.boundingBox;
    }
    
    public AxisAlignedBB getCollisionBox(final Entity entity) {
        if (entity instanceof EntityCatapult) {
            return null;
        }
        return entity.boundingBox;
    }
    
    public int getRotation() {
        return this.rotation;
    }
    
    public int getPrevRotation() {
        return this.prevRotation;
    }
    
    public void setDamage(final float damage) {
        this.damage = damage;
    }
    
    public float getDamage() {
        return this.damage;
    }
    
    public void writeEntityToNBT(final NBTTagCompound nbt) {
        super.writeEntityToNBT(nbt);
        nbt.setFloat("ProjectileDamage", this.damage);
    }
    
    public void readEntityFromNBT(final NBTTagCompound nbt) {
        super.readEntityFromNBT(nbt);
        this.setDamage(nbt.getFloat("ProjectileDamage"));
    }
}
