//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.util;

import codechicken.lib.math.MathHelper;
import com.timgodreuil.powermod.shared.entities.EntityProjectile;
import com.timgodreuil.powermod.shared.entities.EntityRock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import drealm.entity.DREntityMumakil;
import drealm.entity.DREntitySalamander;
import lotr.client.gui.LOTRGuiMainMenu;
import lotr.common.entity.item.LOTREntityOrcBomb;
import lotr.common.entity.projectile.LOTREntityProjectileBase;
import lotr.common.entity.projectile.LOTREntityThrownTermite;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.client.event.*;
import cpw.mods.fml.common.eventhandler.*;
import cpw.mods.fml.common.gameevent.*;
import drealm.block.*;
import lotr.common.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.inventory.*;
import drealm.database.*;
import net.minecraft.item.*;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.terraingen.BiomeEvent;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.event.world.NoteBlockEvent;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DREventHandler
{
    public DREventHandler() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        FMLCommonHandler.instance().bus().register((Object)this);
    }
    
    @SubscribeEvent
    public void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
        if ("drealm".equals(event.modID)) {
            DRConfig.load();
        }
    }

    //  @SideOnly(Side.CLIENT)
  //  @SubscribeEvent
    //   public void openGui(GuiOpenEvent event) {
    //     if (event.gui instanceof LOTRGuiMainMenu && event.gui instanceof GuiMainMenu) {
    //         event.gui = new MainMen();
    //      }
    //   }
    
    @SubscribeEvent
    public void onCrafting(final PlayerEvent.ItemCraftedEvent event) {
        final EntityPlayer player = event.player;
        final World world = player.worldObj;
        if (world.isRemote) {
            return;
        }
        final Container container = player.openContainer;
        if (container instanceof DRBlockTableRedDwarven.Container) {
            LOTRLevelData.getData(player).addAchievement(DRAchievement.useRedDwarvenTable);
        }
    }
    
    @SubscribeEvent
    public void onSmelting(final PlayerEvent.ItemSmeltedEvent event) {
        final EntityPlayer entityplayer = event.player;
        final ItemStack itemstack = event.smelting;
        if (!entityplayer.worldObj.isRemote && itemstack.getItem() == DRRegistry.redDwarfSteel) {
            LOTRLevelData.getData(entityplayer).addAchievement(DRAchievement.smeltRedDwarfSteel);
        }
    }

    @SubscribeEvent
    public void onEntitySpawned(EntityJoinWorldEvent event) {
        if (event.entity instanceof DREntityMumakil && !event.world.isRemote) {
            DREntityMumakil mumakil = (DREntityMumakil) event.entity;
            mumakil.setHealth(mumakil.getMaxHealth());
        }
    }


    @SubscribeEvent
    public void onExplosionDetonate(ExplosionEvent.Detonate event) {
        Explosion explosion = event.explosion;
        Entity exploder = explosion.exploder;

        // Check if the exploder is one of the allowed entities
        if (exploder instanceof EntityFireball ||
                exploder instanceof EntityRock ||
                exploder instanceof EntityProjectile) {
            // Allow the explosion to proceed
            return;
        }

        // Clear affected blocks to prevent destruction
        event.getAffectedBlocks().clear();
    }


    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void onProjectileUpdate(EntityEvent.EnteringChunk event) {
        if (event.entity instanceof LOTREntityProjectileBase) {
            LOTREntityProjectileBase spear = (LOTREntityProjectileBase) event.entity;

            // Do nothing if the spear is already in the ground or doesn't have a thrower
            if (spear.inGround || spear.getThrower() == null) {
                return;
            }

            // If it's in the air and moving, we should allow it to travel (do nothing)
            if (spear.motionX != 0 || spear.motionY != 0 || spear.motionZ != 0) {
                return;  // Don't start returning while in mid-air
            }

            if (spear.inGround) {

                Entity thrower = spear.getThrower();
                if (thrower instanceof EntityPlayer) {
                    EntityPlayer player = (EntityPlayer) thrower;

                    ItemStack spearItem = new ItemStack(spear.getProjectileItem().getItem(), 1); // 1 item

                    // Add the spear back to the player's inventory
                    if (!player.inventory.addItemStackToInventory(spearItem)) {
                        // Drop the Item (not ItemStack) if inventory is full
                        player.dropItem(spearItem.getItem(), spearItem.stackSize); // Use the item and quantity here
                    }

                    // Remove the spear from the world
                    spear.setDead();
                }

            }
            Entity thrower = spear.getThrower();
            if (thrower instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) thrower;

                // Calculate the direction and distance to return the spear to the player
                double deltaX = player.posX - spear.posX;
                double deltaY = player.posY + player.getEyeHeight() - spear.posY;
                double deltaZ = player.posZ - spear.posZ;
                double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);

                // Prevent the spear from colliding with the ground while it is in the air
                if (distance > 0) {
                    double returnSpeed = 0.05; // Adjust this speed if necessary
                    spear.motionX = deltaX / distance * returnSpeed;
                    spear.motionY = deltaY / distance * returnSpeed;
                    spear.motionZ = deltaZ / distance * returnSpeed;

                    // Mark the spear as no longer in the ground, and reset ticksInGround
                    spear.inGround = false;

                    try {
                        Field ticksInGroundField = LOTREntityProjectileBase.class.getDeclaredField("ticksInGround");
                        ticksInGroundField.setAccessible(true);
                        ticksInGroundField.setInt(spear, 0);  // Reset ticksInGround to 0 to prevent "stuck" behavior
                    } catch (NoSuchFieldException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }



    @SubscribeEvent
    public void onEntityHit(LivingHurtEvent event) {
        if (event.source.getEntity() instanceof LOTREntityProjectileBase) {
            LOTREntityProjectileBase spear = (LOTREntityProjectileBase) event.source.getEntity();

            // If the spear hits an entity, mark it as not in the ground so it can return
            spear.inGround = false;
        }
    }



    @SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
        if (event.entityLiving instanceof DREntityMumakil || event.entityLiving instanceof DREntitySalamander) {
            event.setCanceled(true);
        }
    }
}




