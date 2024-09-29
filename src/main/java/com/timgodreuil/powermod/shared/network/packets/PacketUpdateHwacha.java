package com.timgodreuil.powermod.shared.network.packets;

import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.*;
import io.netty.buffer.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import cpw.mods.fml.common.*;
import net.minecraft.client.*;
import com.timgodreuil.powermod.shared.entities.*;
import net.minecraft.item.*;
import com.timgodreuil.powermod.shared.items.*;

public class PacketUpdateHwacha implements IMessage {
    private float rotation;
    private float power;
    private int projectileItemID;
    private int entityID;

    public PacketUpdateHwacha(EntityHwacha entityHwacha, float rotation, float power, int i, NetworkRegistry.TargetPoint targetPoint) {
        this.rotation = 0.0f;
        this.power = 0.0f;
    }

    public PacketUpdateHwacha(final Entity entity, final float rotation, final float power, final int projectileItemID) {
        this.entityID = entity.getEntityId();
        this.rotation = rotation;
        this.power = power;
        this.projectileItemID = projectileItemID;
    }

    @Override
    public void fromBytes(final ByteBuf buf) {
        this.entityID = buf.readInt();
        this.rotation = buf.readFloat();
        this.power = buf.readFloat();
        this.projectileItemID = buf.readInt();
    }

    @Override
    public void toBytes(final ByteBuf buf) {
        buf.writeInt(this.entityID);
        buf.writeFloat(this.rotation);
        buf.writeFloat(this.power);
        buf.writeInt(this.projectileItemID);
    }

    public int getEntityID() {
        return this.entityID;
    }

    public float getHwachaRotation() {
        return this.rotation;
    }

    public float getHwachaPower() {
        return this.power;
    }

    public int getProjectileItemID() {
        return this.projectileItemID;
    }

    public static class Handler implements IMessageHandler<PacketUpdateHwacha, IMessage> {
        @Override
        public IMessage onMessage(final PacketUpdateHwacha message, final MessageContext ctx) {
            if (FMLCommonHandler.instance().getSide().isClient()) {
                final Entity entity = Minecraft.getMinecraft().thePlayer.worldObj.getEntityByID(message.entityID);
                if (entity != null && entity instanceof EntityHwacha) {
                    final EntityHwacha hwacha = (EntityHwacha) entity;
                    hwacha.setCatapultRotation(message.rotation); // Assuming the method is the same for hwacha
                    hwacha.setCatapultPower(message.getHwachaPower());
                    if (message.getProjectileItemID() != -1) {
                        final Item it = Item.getItemById(message.getProjectileItemID());
                        if (it instanceof ProjectileItem) {
                            hwacha.setProjectileItem((ProjectileItem) it);
                        } else {
                            hwacha.setProjectileItem((ProjectileItem) null);
                        }
                    } else {
                        hwacha.setProjectileItem((ProjectileItem) null);
                    }
                }
            }
            return null;
        }
    }
}
