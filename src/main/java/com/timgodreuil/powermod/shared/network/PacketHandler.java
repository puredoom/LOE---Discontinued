//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.network;

import cpw.mods.fml.common.network.simpleimpl.*;
import cpw.mods.fml.relauncher.*;
import com.timgodreuil.powermod.shared.network.packets.*;
import cpw.mods.fml.common.network.*;

public class PacketHandler
{
    public static final SimpleNetworkWrapper NETWORK_WRAPPER;
    
    public PacketHandler() {
        int id = 0;
        PacketHandler.NETWORK_WRAPPER.registerMessage((Class)PacketUpdateCatapult.Handler.class, (Class)PacketUpdateCatapult.class, id++, Side.CLIENT);
        PacketHandler.NETWORK_WRAPPER.registerMessage((Class)PacketUpdateState.Handler.class, (Class)PacketUpdateState.class, id++, Side.CLIENT);
        PacketHandler.NETWORK_WRAPPER.registerMessage((Class)PacketUpdateCatapultPower.Handler.class, (Class)PacketUpdateCatapultPower.class, id++, Side.SERVER);
        PacketHandler.NETWORK_WRAPPER.registerMessage((Class)PacketButtonCatapult.Handler.class, (Class)PacketButtonCatapult.class, id++, Side.SERVER);
    }
    
    static {
        NETWORK_WRAPPER = NetworkRegistry.INSTANCE.newSimpleChannel("powermod");
    }
}
