package com.timgodreuil.powermod.shared.network.packets;

import net.minecraft.entity.*;
import io.netty.buffer.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import com.timgodreuil.powermod.shared.entities.*;
import net.minecraft.entity.player.*;

public class PacketUpdateHwachaPower implements IMessage {
    private float power;
    private int entityID;

    public PacketUpdateHwachaPower() {
        this.power = 0.0f;
    }

    public PacketUpdateHwachaPower(final Entity entity, final float power) {
        this.power = 0.0f;
        this.entityID = entity.getEntityId();
        this.power = power;
    }

    public void fromBytes(final ByteBuf buf) {
        this.entityID = buf.readInt();
        this.power = buf.readFloat();
    }

    public void toBytes(final ByteBuf buf) {
        buf.writeInt(this.entityID);
        buf.writeFloat(this.power);
    }

    public int getEntityID() {
        return this.entityID;
    }

    public float getHwachaPower() {
        return this.power;
    }

    public static class Handler implements IMessageHandler<PacketUpdateHwachaPower, IMessage> {
        public IMessage onMessage(final PacketUpdateHwachaPower message, final MessageContext ctx) {
            final EntityPlayerMP entityplayer = ctx.getServerHandler().playerEntity;
            final Entity ent = entityplayer.worldObj.getEntityByID(message.getEntityID());
            if (ent != null && ent instanceof EntityHwacha) {
                ((EntityHwacha) ent).setCatapultPower(message.getHwachaPower());
            }
            return null;
        }
    }
}
