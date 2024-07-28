//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;

@Mod(modid = "loem", name = "Lord of Eldar: Machinery", version = "1.0", dependencies = "after:lotr")
public class PowerMod
{
    @Mod.Instance("loem")
    public static PowerMod instance;
    @SidedProxy(clientSide = "com.timgodreuil.powermod.client.ClientProxy", serverSide = "com.timgodreuil.powermod.shared.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent e) {
        PowerMod.proxy.preInit(e);
    }
    
    @Mod.EventHandler
    public void init(final FMLInitializationEvent e) {
        PowerMod.proxy.init(e);
    }
    
    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent e) {
        PowerMod.proxy.postInit(e);
    }
    
    static {
        PowerMod.instance = new PowerMod();
    }
}
