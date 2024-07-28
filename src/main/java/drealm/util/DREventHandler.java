//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.util;

import com.timgodreuil.powermod.shared.entities.EntityProjectile;
import com.timgodreuil.powermod.shared.entities.EntityRock;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import drealm.entity.DREntityMumakil;
import drealm.entity.DREntitySalamander;
import lotr.client.gui.LOTRGuiMainMenu;
import lotr.common.entity.item.LOTREntityOrcBomb;
import lotr.common.entity.projectile.LOTREntityThrownTermite;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.entity.Entity;
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
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.event.world.NoteBlockEvent;

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

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void openGui(GuiOpenEvent event) {
        if (event.gui instanceof LOTRGuiMainMenu && event.gui instanceof GuiMainMenu) {
            event.gui = new MainMen();
        }
    }
    
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

    @SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
        if (event.entityLiving instanceof DREntityMumakil || event.entityLiving instanceof DREntitySalamander) {
            event.setCanceled(true);
        }
    }


}

