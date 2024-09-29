package com.timgodreuil.powermod.shared.network.packets;

import com.timgodreuil.powermod.shared.entities.*;
import io.netty.buffer.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;

public class PacketButtonHwacha implements IMessage {
    private int entityID;

    public PacketButtonHwacha() {
    }

    public PacketButtonHwacha(final EntityHwacha hwacha) {
        this.entityID = hwacha.getEntityId();
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

    public static class Handler implements IMessageHandler<PacketButtonHwacha, IMessage> {
        public IMessage onMessage(final PacketButtonHwacha message, final MessageContext ctx) {
            final EntityPlayer entityplayer = ctx.getServerHandler().playerEntity;
            final Entity ent = entityplayer.worldObj.getEntityByID(message.getEntityID());
            if (ent != null && ent instanceof EntityHwacha) {
                ((EntityHwacha) ent).handleButtonClick(entityplayer);
            }
            return null;
        }
    }
}
