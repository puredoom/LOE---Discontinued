//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.network.packets;

import net.minecraft.entity.*;
import io.netty.buffer.*;
import cpw.mods.fml.common.network.simpleimpl.*;
import com.timgodreuil.powermod.shared.entities.*;
import net.minecraft.entity.player.*;

public class PacketUpdateCatapultPower implements IMessage
{
    private float power;
    private int entityID;
    
    public PacketUpdateCatapultPower() {
        this.power = 0.0f;
    }
    
    public PacketUpdateCatapultPower(final Entity entity, final float power) {
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
    
    public float getCatapultPower() {
        return this.power;
    }
    
    public static class Handler implements IMessageHandler<PacketUpdateCatapultPower, IMessage>
    {
        public IMessage onMessage(final PacketUpdateCatapultPower message, final MessageContext ctx) {
            final EntityPlayerMP entityplayer = ctx.getServerHandler().playerEntity;
            final Entity ent = entityplayer.worldObj.getEntityByID(message.getEntityID());
            if (ent != null && ent instanceof EntityCatapult) {
                ((EntityCatapult)ent).setCatapultPower(message.getCatapultPower());
            }
            return null;
        }
    }
}
