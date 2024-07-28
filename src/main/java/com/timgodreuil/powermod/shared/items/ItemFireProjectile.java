//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.items;

import java.util.*;
import net.minecraft.world.*;
import com.timgodreuil.powermod.shared.entities.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;

public class ItemFireProjectile extends ProjectileItem
{
    private static final HashMap<World, EntityFireProjectile> RENDER;
    
    public ItemFireProjectile(final String name) {
        this.setUnlocalizedName(name);
        this.setTextureName("powermod:" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
    
    @Override
    public EntityThrowable getProjectile(final World world, final double x, final double y, final double z, final EntityLivingBase shooter) {
        return (EntityThrowable)new EntityFireProjectile(world, x, y, z, shooter);
    }
    
    @Override
    public EntityThrowable getRenderingEntity(final World w) {
        if (ItemFireProjectile.RENDER.get(w) == null) {
            ItemFireProjectile.RENDER.put(w, new EntityFireProjectile(w));
        }
        return (EntityThrowable)ItemFireProjectile.RENDER.get(w);
    }
    
    static {
        RENDER = new HashMap<World, EntityFireProjectile>();
    }
}
