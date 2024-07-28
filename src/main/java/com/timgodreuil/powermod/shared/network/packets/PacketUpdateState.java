//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.network.packets;

import io.netty.buffer.*;
import com.timgodreuil.powermod.shared.entities.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;

public class PacketUpdateState implements IMessage
{
    private int entityID;
    private int state;
    
    public PacketUpdateState() {
    }
    
    public PacketUpdateState(final EntityCatapult catapult) {
        this.entityID = catapult.getEntityId();
        this.state = catapult.getState().getID();
    }
    
    public void fromBytes(final ByteBuf buf) {
        this.entityID = buf.readInt();
        this.state = buf.readInt();
    }
    
    public void toBytes(final ByteBuf buf) {
        buf.writeInt(this.entityID);
        buf.writeInt(this.state);
    }
    
    public int getEntityID() {
        return this.entityID;
    }
    
    public CatapultState getState() {
        return CatapultState.getByID(this.state);
    }
    
    public static class Handler implements IMessageHandler<PacketUpdateState, IMessage>
    {
        public IMessage onMessage(final PacketUpdateState message, final MessageContext ctx) {
            final Entity entity = Minecraft.getMinecraft().thePlayer.worldObj.getEntityByID(message.entityID);
            if (entity != null && entity instanceof EntityCatapult) {
                ((EntityCatapult)entity).setState(message.getState());
            }
            return null;
        }
    }
}
