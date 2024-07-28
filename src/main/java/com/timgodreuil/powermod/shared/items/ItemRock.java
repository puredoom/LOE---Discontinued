//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.items;

import java.util.*;
import net.minecraft.world.*;
import com.timgodreuil.powermod.shared.entities.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.*;
import net.minecraft.entity.projectile.*;
import cpw.mods.fml.relauncher.*;

public class ItemRock extends ProjectileItem
{
    private static final HashMap<World, EntityRock> RENDER;
    
    public ItemRock(final String name) {
        this.setUnlocalizedName(name);
        this.setTextureName("powermod:" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
    
    @Override
    public EntityThrowable getProjectile(final World world, final double x, final double y, final double z, final EntityLivingBase shooter) {
        return (EntityThrowable)new EntityRock(world, x, y, z, shooter);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public EntityThrowable getRenderingEntity(final World w) {
        if (ItemRock.RENDER.get(w) == null) {
            ItemRock.RENDER.put(w, new EntityRock(w));
        }
        return (EntityThrowable)ItemRock.RENDER.get(w);
    }
    
    static {
        RENDER = new HashMap<World, EntityRock>();
    }
}
