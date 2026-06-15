//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.proxy;

import lotr.common.tileentity.LOTRTileEntityArmorStand;
import net.minecraft.client.*;
import drealm.model.*;
import net.minecraft.client.resources.*;
import net.minecraft.util.*;
import drealm.util.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.client.registry.*;
import net.minecraft.client.renderer.entity.*;
import drealm.entity.*;
import drealm.render.*;

public class DRClientProxy extends DRServerProxy implements IResourceManagerReloadListener
{
    public static DRRendererManager rendererManager;
    
    @Override
    public void onInit(final FMLInitializationEvent event) {
        ((IReloadableResourceManager)Minecraft.getMinecraft().getResourceManager()).registerReloadListener((IResourceManagerReloadListener)new DRClientProxy());
        ClientRegistry.bindTileEntitySpecialRenderer(LOTRTileEntityArmorStand.class, new DRRenderArmorStand());
    }
    
    @Override
    public void registerArmorModels() {
        DRModels.setupArmorModels();
    }



    public void onResourceManagerReload(final IResourceManager resourceManager) {
        DRCommander.setClientMapImage(new ResourceLocation("drealm:map/map.png"));
    }
    
    @Override
    public void preInit(final FMLPreInitializationEvent event) {
        DRClientProxy.rendererManager = new DRRendererManager();
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityRedDwarf.class, (Render)new DRRenderDwarf());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityDwarf.class, (Render)new DRRenderDwarf());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityRedDwarfSmith.class, (Render)new DRRenderDwarfSmith());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityRedDwarfCommander.class, (Render)new DRRenderDwarfCommander());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityRedDwarfMerchant.class, (Render)new DRRenderDwarfCommander());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityMumakil.class, (Render)new DRRenderMumakil());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityGorilla.class, (Render)new DRRenderGorilla());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntitySalamander.class, (Render)new DRRenderSalamander());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityWerewolfRohan.class, (Render)new DRRenderWerewolfRohan());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntitySpiderLothlorien.class,(Render)new DRRenderLothlorienSpider());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityWerewolfGondor.class, (Render)new DRRenderWerewolfGondor());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityEnt.class,(Render)new DRRenderEnt());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityNazgul.class,(Render)new DRRenderNazgul());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityNazgulHorse.class,(Render)new DRRenderNazgulHorse());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityBoar.class,(Render)new DRRenderBoar());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityRedBeast.class,(Render)new DRRenderRedBeast());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityGoat.class,(Render)new DRRenderGoat());
        RenderingRegistry.registerEntityRenderingHandler((Class)DREntityPoney.class,(Render)new DRRenderPoney());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityDalishOstrich.class,(Render)new DRRenderDalishOstrich());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityDorwinionPanda.class,(Render)new DRRenderDorwinionPanda());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityTrollGundabad.class,(Render)new DRRenderTrollGundabad());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntitySkinChanger.class, (Render) new DRRenderSkinChanger());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityCaragor.class, (Render) new DRRenderCaragor());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityGraug.class, (Render) new DRRenderGraug());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityLoup.class, (Render) new DRRenderLoup());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntitySouris.class, (Render) new DRRenderSouris());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityRhunBison.class,(Render)new DRRenderRhunBison());
        RenderingRegistry.registerEntityRenderingHandler((Class) DREntityDunlandBear.class,(Render)new DRRenderDunlandBear());
    }
}
