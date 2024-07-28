//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.network.packets;

import com.timgodreuil.powermod.shared.entities.*;
import io.netty.buffer.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;

public class PacketButtonCatapult implements IMessage
{
    private int entityID;
    
    public PacketButtonCatapult() {
    }
    
    public PacketButtonCatapult(final EntityCatapult catapult) {
        this.entityID = catapult.getEntityId();
    }
    
    public void fromBytes(final ByteBuf buf) {
        this.entityID = buf.readInt();
    }
    
    public void toBytes(final ByteBuf buf) {
        buf.writeInt(this.entityID);
    }
    
    public int getEntityID() {
        return this.entityID;
    }
    
    public static class Handler implements IMessageHandler<PacketButtonCatapult, IMessage>
    {
        public IMessage onMessage(final PacketButtonCatapult message, final MessageContext ctx) {
            final EntityPlayer entityplayer = (EntityPlayer)ctx.getServerHandler().playerEntity;
            final Entity ent = entityplayer.worldObj.getEntityByID(message.getEntityID());
            if (ent != null && ent instanceof EntityCatapult) {
                ((EntityCatapult)ent).handleButtonClick(entityplayer);
            }
            return null;
        }
    }
}
