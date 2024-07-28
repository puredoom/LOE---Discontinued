//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import net.minecraft.client.*;
import net.minecraftforge.common.*;
import net.minecraft.client.resources.*;
import drealm.database.*;
import net.minecraft.item.*;
import drealm.util.*;
import net.minecraftforge.client.*;
import lotr.common.item.*;
import lotr.client.render.item.*;
import java.util.*;
import net.minecraftforge.client.event.*;
import net.minecraft.client.renderer.texture.*;
import cpw.mods.fml.common.eventhandler.*;

public class DRRendererManager implements IResourceManagerReloadListener
{
    public static List<DRRenderLargeItem> largeItemRenderers;
    
    public DRRendererManager() {
        DRRendererManager.largeItemRenderers = new ArrayList<DRRenderLargeItem>();
        final IResourceManager resMgr = Minecraft.getMinecraft().getResourceManager();
        this.onResourceManagerReload(resMgr);
        ((IReloadableResourceManager)resMgr).registerReloadListener((IResourceManagerReloadListener)this);
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    public void onResourceManagerReload(final IResourceManager resourceManager) {
        DRRendererManager.largeItemRenderers.clear();
        for (final Item item : DRCommander.getObjectFieldsOfType((Class<?>)DRRegistry.class, (Class<? extends Item>)Item.class)) {
            MinecraftForgeClient.registerItemRenderer(item, (IItemRenderer)null);
            final DRRenderLargeItem largeItemRenderer = DRRenderLargeItem.getRendererIfLarge(item);
            if (item instanceof LOTRItemCrossbow) {
                MinecraftForgeClient.registerItemRenderer(item, (IItemRenderer)new LOTRRenderCrossbow());
            }
            else if (item instanceof LOTRItemBow) {
                MinecraftForgeClient.registerItemRenderer(item, (IItemRenderer)new LOTRRenderBow((LOTRRenderLargeItem)largeItemRenderer));
            }
            else if (item instanceof LOTRItemSword && ((LOTRItemSword)item).isElvenBlade()) {
                MinecraftForgeClient.registerItemRenderer(item, (IItemRenderer)new LOTRRenderElvenBlade(24.0, (LOTRRenderLargeItem)largeItemRenderer));
            }
            else if (largeItemRenderer != null) {
                MinecraftForgeClient.registerItemRenderer(item, (IItemRenderer)largeItemRenderer);
            }
            if (largeItemRenderer == null) {
                continue;
            }
            DRRendererManager.largeItemRenderers.add(largeItemRenderer);
        }
    }
    
    @SubscribeEvent
    public void preTextureStitch(final TextureStitchEvent.Pre event) {
        final TextureMap map = event.map;
        if (map.getTextureType() == 1) {
            for (final DRRenderLargeItem largeRenderer : DRRendererManager.largeItemRenderers) {
                largeRenderer.registerIcons((IIconRegister)map);
            }
        }
    }
}
