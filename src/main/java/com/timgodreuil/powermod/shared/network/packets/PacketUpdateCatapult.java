//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.network.packets;

import net.minecraft.entity.*;
import io.netty.buffer.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import cpw.mods.fml.common.*;
import net.minecraft.client.*;
import com.timgodreuil.powermod.shared.entities.*;
import net.minecraft.item.*;
import com.timgodreuil.powermod.shared.items.*;

public class PacketUpdateCatapult implements IMessage
{
    private float rotation;
    private float power;
    private int projectileItemID;
    private int entityID;
    
    public PacketUpdateCatapult() {
        this.rotation = 0.0f;
        this.power = 0.0f;
    }
    
    public PacketUpdateCatapult(final Entity entity, final float rotation, final float power, final int projectileItemID) {
        this.rotation = 0.0f;
        this.power = 0.0f;
        this.entityID = entity.getEntityId();
        this.rotation = rotation;
        this.power = power;
        this.projectileItemID = projectileItemID;
    }
    
    public void fromBytes(final ByteBuf buf) {
        this.entityID = buf.readInt();
        this.rotation = buf.readFloat();
        this.power = buf.readFloat();
        this.projectileItemID = buf.readInt();
    }
    
    public void toBytes(final ByteBuf buf) {
        buf.writeInt(this.entityID);
        buf.writeFloat(this.rotation);
        buf.writeFloat(this.power);
        buf.writeInt(this.projectileItemID);
    }
    
    public int getEntityID() {
        return this.entityID;
    }
    
    public float getCatapultRotation() {
        return this.rotation;
    }
    
    public float getCatapultPower() {
        return this.power;
    }
    
    public int getProjectileItemID() {
        return this.projectileItemID;
    }
    
    public static class Handler implements IMessageHandler<PacketUpdateCatapult, IMessage>
    {
        public IMessage onMessage(final PacketUpdateCatapult message, final MessageContext ctx) {
            if (FMLCommonHandler.instance().getSide().isClient()) {
                final Entity entity = Minecraft.getMinecraft().thePlayer.worldObj.getEntityByID(message.entityID);
                if (entity != null && entity instanceof EntityCatapult) {
                    final EntityCatapult catapult = (EntityCatapult)entity;
                    catapult.setCatapultRotation(message.rotation);
                    catapult.setCatapultPower(message.getCatapultPower());
                    if (message.getProjectileItemID() != -1) {
                        final Item it = Item.getItemById(message.getProjectileItemID());
                        if (it instanceof ProjectileItem) {
                            catapult.setProjectileItem((ProjectileItem)it);
                        }
                        else {
                            catapult.setProjectileItem((ProjectileItem)null);
                        }
                    }
                    else {
                        catapult.setProjectileItem((ProjectileItem)null);
                    }
                }
            }
            return null;
        }
    }
}
