//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.items;

import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;

public abstract class ProjectileItem extends Item
{
    public abstract EntityThrowable getProjectile(final World p0, final double p1, final double p2, final double p3, final EntityLivingBase p4);
    
    public abstract EntityThrowable getRenderingEntity(final World p0);
}
