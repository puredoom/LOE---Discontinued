//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared;

import com.timgodreuil.powermod.shared.network.*;
import com.timgodreuil.powermod.shared.blocks.*;
import com.timgodreuil.powermod.shared.items.*;
import com.timgodreuil.powermod.client.gui.*;
import cpw.mods.fml.common.network.*;
import com.timgodreuil.powermod.shared.entities.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import net.minecraft.item.*;
import cpw.mods.fml.common.registry.*;
import lotr.common.*;
import net.minecraft.init.*;

public class CommonProxy
{
    public PacketHandler handler;
    
    public void preInit(final FMLPreInitializationEvent e) {
        PowerModBlocks.init();
        PowerModItems.init();
        NetworkRegistry.INSTANCE.registerGuiHandler((Object)PowerMod.instance, (IGuiHandler)new PowerModGuiHandler());
        PowerModEntities.init();
        this.handler = new PacketHandler();
        MinecraftForge.EVENT_BUS.register((Object)new PowerModEventHandler());
        FMLCommonHandler.instance().bus().register((Object)new PowerModEventHandler());
        PowerModCraftingRecipes.init();
        LOTRHelper.init();
    }
    
    public void init(final FMLInitializationEvent e) {
        this.addRecipes();
    }
    
    public void postInit(final FMLPostInitializationEvent e) {
    }
    
    private void addRecipes() {
        GameRegistry.addRecipe(new ItemStack(PowerModItems.catapult), new Object[] { "SLI", " L ", "LLL", 'S', Item.getItemFromBlock(Blocks.cobblestone), 'L', Item.getItemFromBlock(Blocks.log), 'I', Item.getItemFromBlock(Blocks.iron_block) });
        GameRegistry.addRecipe(new ItemStack(PowerModItems.rock), new Object[] { " S ", "SSS", " S ", 'S', Item.getItemFromBlock(Blocks.cobblestone) });
        GameRegistry.addRecipe(new ItemStack(PowerModItems.fireProjectile), new Object[] { " S ", "SOS", " S ", 'S', Item.getItemFromBlock(Blocks.cobblestone), 'O', LOTRMod.sulfur });
        GameRegistry.addRecipe(new ItemStack(PowerModItems.wrench), new Object[] { " S ", "SS ", "  S", 'S', Items.iron_ingot });
    }
}
