//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.entities;

import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class EntityFireProjectile extends EntityProjectile
{
    private int animationTick;
    public static final int animationTickFrequency = 1;
    
    public EntityFireProjectile(final World world) {
        super(world);
        this.animationTick = 0;
        this.setSize(1.0f, 1.0f);
        this.setDamage(5.0f);
    }
    
    public EntityFireProjectile(final World world, final double x, final double y, final double z, final EntityLivingBase shooter) {
        super(world, x, y, z, shooter);
        this.animationTick = 0;
        this.setSize(1.0f, 1.0f);
        this.setDamage(5.0f);
    }
    
    public EntityFireProjectile(final World world, final EntityLivingBase shooter) {
        super(world, shooter);
        this.animationTick = 0;
        this.setSize(1.0f, 1.0f);
        this.setDamage(5.0f);
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        this.updateAnimation();
    }
    
    public void updateAnimation() {
        if (this.ticksExisted % 1 == 0) {
            ++this.animationTick;
            if (this.animationTick > 31) {
                this.animationTick = 0;
            }
        }
    }
    
    public int getAnimationTick() {
        return this.animationTick;
    }
    
    @Override
    protected void onImpact(final MovingObjectPosition pos) {
        super.onImpact(pos);
    }
    
    protected float getGravityVelocity() {
        return 0.1f;
    }
    
    @Override
    public float getExplosionPower() {
        return 3.0f;
    }
    
    @Override
    public int getFireTicks() {
        return 5;
    }
}
