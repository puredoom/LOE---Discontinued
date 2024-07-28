//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.item;

import cpw.mods.fml.relauncher.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import drealm.structure.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import java.util.*;
import lotr.common.*;
import net.minecraft.util.*;
import net.minecraft.client.renderer.texture.*;

public class DRItemStructureSpawner extends Item
{
    public static int lastStructureSpawnTick;
    @SideOnly(Side.CLIENT)
    private IIcon iconBase;
    @SideOnly(Side.CLIENT)
    private IIcon iconOverlay;
    @SideOnly(Side.CLIENT)
    private IIcon iconVillageBase;
    @SideOnly(Side.CLIENT)
    private IIcon iconVillageOverlay;
    
    public DRItemStructureSpawner() {
        this.setHasSubtypes(true);
        this.setCreativeTab((CreativeTabs)LOTRCreativeTabs.tabSpawn);
    }
    
    public static boolean spawnStructure(final EntityPlayer entityplayer, final World world, final int id, final int i, final int j, final int k) {
        if (!DRStructure.structureItemSpawners.containsKey(id)) {
            return false;
        }
        final DRStructure.IStructureProvider strProvider = DRStructure.getStructureForID(id);
        if (strProvider != null) {
            final boolean generated = strProvider.generateStructure(world, entityplayer, i, j, k);
            if (generated) {
                DRItemStructureSpawner.lastStructureSpawnTick = 20;
                world.playSoundAtEntity((Entity)entityplayer, "lotr:item.structureSpawner", 1.0f, 1.0f);
            }
            return generated;
        }
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(final ItemStack itemstack, final int pass) {
        final DRStructure.StructureColorInfo info = DRStructure.structureItemSpawners.get(itemstack.getItemDamage());
        if (info == null) {
            return 16777215;
        }
        if (pass == 0) {
            return info.colorBackground;
        }
        return info.colorForeground;
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(final int i, final int pass) {
        final DRStructure.StructureColorInfo info = DRStructure.structureItemSpawners.get(i);
        if (info == null) {
            return this.iconBase;
        }
        if (info.isVillage) {
            if (pass == 0) {
                return this.iconVillageBase;
            }
            return this.iconVillageOverlay;
        }
        else {
            if (pass == 0) {
                return this.iconBase;
            }
            return this.iconOverlay;
        }
    }
    
    public String getItemStackDisplayName(final ItemStack itemstack) {
        final StringBuilder s = new StringBuilder().append(StatCollector.translateToLocal(this.getUnlocalizedName() + ".name").trim());
        final String structureName = DRStructure.getNameFromID(itemstack.getItemDamage());
        if (structureName != null) {
            s.append(" ").append(StatCollector.translateToLocal("lotr.structure." + structureName + ".name"));
        }
        return s.toString();
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubItems(final Item item, final CreativeTabs tab, final List list) {
        for (final DRStructure.StructureColorInfo info : DRStructure.structureItemSpawners.values()) {
            if (info.isHidden) {
                continue;
            }
            list.add(new ItemStack(item, 1, info.spawnedID));
        }
    }
    
    public boolean onItemUse(final ItemStack itemstack, final EntityPlayer entityplayer, final World world, final int i, final int j, final int k, final int side, final float f, final float f1, final float f2) {
        if (world.isRemote) {
            return true;
        }
        if (LOTRLevelData.structuresBanned()) {
            entityplayer.addChatMessage((IChatComponent)new ChatComponentTranslation("chat.lotr.spawnStructure.disabled", new Object[0]));
            return false;
        }
        if (LOTRLevelData.isPlayerBannedForStructures(entityplayer)) {
            entityplayer.addChatMessage((IChatComponent)new ChatComponentTranslation("chat.lotr.spawnStructure.banned", new Object[0]));
            return false;
        }
        if (DRItemStructureSpawner.lastStructureSpawnTick > 0) {
            entityplayer.addChatMessage((IChatComponent)new ChatComponentTranslation("chat.lotr.spawnStructure.wait", new Object[] { DRItemStructureSpawner.lastStructureSpawnTick / 20.0 }));
            return false;
        }
        if (spawnStructure(entityplayer, world, itemstack.getItemDamage(), i + Facing.offsetsXForSide[side], j + Facing.offsetsYForSide[side], k + Facing.offsetsZForSide[side]) && !entityplayer.capabilities.isCreativeMode) {
            --itemstack.stackSize;
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister iconregister) {
        this.iconBase = iconregister.registerIcon(this.getIconString() + "_base");
        this.iconOverlay = iconregister.registerIcon(this.getIconString() + "_overlay");
        this.iconVillageBase = iconregister.registerIcon(this.getIconString() + "_village_base");
        this.iconVillageOverlay = iconregister.registerIcon(this.getIconString() + "_village_overlay");
    }
    
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return true;
    }
}
