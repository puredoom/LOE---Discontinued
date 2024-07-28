//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.client;

import com.timgodreuil.powermod.shared.*;
import cpw.mods.fml.client.registry.*;
import net.minecraft.client.renderer.entity.*;
import com.timgodreuil.powermod.client.render.entities.*;
import com.timgodreuil.powermod.shared.entities.*;
import cpw.mods.fml.common.*;
import net.minecraftforge.common.*;
import com.timgodreuil.powermod.client.render.*;
import cpw.mods.fml.common.event.*;

public class ClientProxy extends CommonProxy
{
    private ClientEventHandler handler;
    public static RenderEntityFireProjectile RENDER;
    
    @Override
    public void preInit(final FMLPreInitializationEvent e) {
        super.preInit(e);
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityCatapult.class, (Render)new RenderEntityCatapult());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityRock.class, (Render)new RenderEntityRock());
        RenderingRegistry.registerEntityRenderingHandler((Class)EntityFireProjectile.class, (Render)ClientProxy.RENDER);
    }
    
    @Override
    public void init(final FMLInitializationEvent e) {
        super.init(e);
        this.handler = new ClientEventHandler();
        FMLCommonHandler.instance().bus().register((Object)this.handler);
        MinecraftForge.EVENT_BUS.register((Object)this.handler);
    }
    
    @Override
    public void postInit(final FMLPostInitializationEvent e) {
        super.postInit(e);
    }
    
    static {
        ClientProxy.RENDER = new RenderEntityFireProjectile();
    }
}
