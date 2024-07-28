//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import drealm.proxy.*;
import cpw.mods.fml.common.*;
import lotr.client.gui.LOTRGuiMainMenu;
import lotr.client.render.tileentity.LOTRRenderArmorStand;
import lotr.common.entity.npc.LOTREntityDwarf;
import lotr.common.tileentity.LOTRTileEntityArmorStand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.*;
import drealm.map.*;
import drealm.item.*;
import drealm.entity.*;
import drealm.structure.*;
import drealm.database.*;
import drealm.biome.*;
import drealm.util.*;
import integrator.*;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import scala.tools.nsc.backend.icode.Primitives;

import java.lang.reflect.Field;

@Mod(modid = "drealm", dependencies = "required-after:lotr", useMetadata = true)
public class DwarvenRealm
{
    @SidedProxy(serverSide = "drealm.proxy.DRServerProxy", clientSide = "drealm.proxy.DRClientProxy")
    public static DRServerProxy proxy;
    @Mod.Instance("drealm")
    public static DwarvenRealm instance;
    public static DREventHandler eventHandler;
    public static DRTickHandlerServer tickHandler;

    
    public static ModContainer getModContainer() {
        return FMLCommonHandler.instance().findContainerFor((Object)DwarvenRealm.instance);
    }
    
    public DwarvenRealm() {
        DRItemLoader.changematieral();
    }

    
    @Mod.EventHandler
    public void onInit(final FMLInitializationEvent event) {
        DRBiome.Biomesinit();
        DRMaterial.onInit();
        DRShields.onInit();
        DRInvasions.onInit();
        DRAchievement.DRAchievementCategory.onInit();
        DRAchievement.onInit();
        DRFaction.onInit();
        DRMiniQuestFactory.onInit();
        DRItemLoader.load();
        DRRoads.onInit();
        DRSpeech.onInit();
        DREntityLoader.applyEntityModifications();
        DwarvenRealm.proxy.registerArmorModels();
        DRCommander.setServerMapImage(new ResourceLocation("drealm:map/map.png"));
        DwarvenRealm.tickHandler = new DRTickHandlerServer();
        DwarvenRealm.proxy.onInit(event);
    }
    
    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler((Object)this, (IGuiHandler)DwarvenRealm.proxy);
        MinecraftForge.EVENT_BUS.register(new DREventHandler());
        DwarvenRealm.eventHandler = new DREventHandler();
        DRConfig.preInit();
        DRItemLoader.changematieral();
        DRItemLoader.load();
        DRCreativeTabs.preInit();
        DRFaction.preInit();
        DRWaypoint.preInit();
        DRItemBanner.preInit();
        DRRegistry.preInit();
        DREntity.preInit();
        DRStructure.preInit();
        DRRecipe.preInit();
        DRBiome.preInit();
        if (DRModChecker.hasNEI() && DRModChecker.hasGuiContainer()) {
            NEIDRIntegrator.registerRecipes();
        }
        DwarvenRealm.proxy.preInit(event);

    }








}
