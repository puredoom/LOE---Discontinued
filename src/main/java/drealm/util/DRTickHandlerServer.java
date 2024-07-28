//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.util;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.gameevent.*;
import drealm.database.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import cpw.mods.fml.common.eventhandler.*;
import net.minecraftforge.common.*;
import drealm.item.*;

public class DRTickHandlerServer
{
    public DRTickHandlerServer() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        FMLCommonHandler.instance().bus().register((Object)this);
    }
    
    @SubscribeEvent
    public void onPlayerTick(final TickEvent.PlayerTickEvent event) {
        final EntityPlayer player = event.player;
        final World world = player.worldObj;
        if (world.isRemote || !player.isEntityAlive() || event.phase != TickEvent.Phase.END) {
            return;
        }
        DRAchievement.runAchievementCheck(player);
    }
    
    @SubscribeEvent
    public void onWorldTick(final TickEvent.WorldTickEvent event) {
        final World world = event.world;
        if (event.phase == TickEvent.Phase.END && world == DimensionManager.getWorld(0) && DRItemStructureSpawner.lastStructureSpawnTick > 0) {
            --DRItemStructureSpawner.lastStructureSpawnTick;
        }
    }
}
