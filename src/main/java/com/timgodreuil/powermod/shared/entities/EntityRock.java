//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.entities;

import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.*;

public class EntityRock extends EntityProjectile
{
    public EntityRock(final World world) {
        super(world);
        this.setSize(1.0f, 1.0f);
        this.setDamage(5.0f);
    }
    
    public EntityRock(final World p_i1778_1_, final double p_i1778_2_, final double p_i1778_4_, final double p_i1778_6_, final EntityLivingBase shooter) {
        super(p_i1778_1_, p_i1778_2_, p_i1778_4_, p_i1778_6_, shooter);
        this.setSize(1.0f, 1.0f);
        this.setDamage(5.0f);
    }
    
    public EntityRock(final World p_i1777_1_, final EntityLivingBase p_i1777_2_) {
        super(p_i1777_1_, p_i1777_2_);
        this.setSize(1.0f, 1.0f);
        this.setDamage(5.0f);
    }
    
    protected void onImpact(final MovingObjectPosition pos) {
        super.onImpact(pos);
    }
    
    protected float getGravityVelocity() {
        return 0.1f;
    }
    
    public float getExplosionPower() {
        return 1.0f;
    }
    
    public int getFireTicks() {
        return 0;
    }
}
