//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.block;

import lotr.common.block.*;
import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.material.*;
import net.minecraft.block.*;
import net.minecraft.world.*;
import lotr.common.*;
import drealm.*;
import lotr.common.fac.*;
import net.minecraft.client.renderer.texture.*;
import lotr.common.inventory.*;
import net.minecraft.entity.player.*;
import drealm.database.*;
import java.util.*;
import lotr.client.gui.*;

public class DRBlockTableRedDwarven extends LOTRBlockCraftingTable
{
    @SideOnly(Side.CLIENT)
    private IIcon[] tableIcons;
    
    public DRBlockTableRedDwarven() {
        super(Material.rock, DRFaction.RED_MOUNTAINS, DRGuiId.RED_DWARVEN.ordinal());
        this.setStepSound(Block.soundTypeStone);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int i, final int j) {
        if (i == 1) {
            return this.tableIcons[2];
        }
        if (i == 0) {
            return LOTRMod.brick2.getIcon(0, 2);
        }
        return (i == 4 || i == 5) ? this.tableIcons[0] : this.tableIcons[1];
    }
    
    public boolean onBlockActivated(final World world, final int i, final int j, final int k, final EntityPlayer entityplayer, final int side, final float f, final float f1, final float f2) {
        final boolean hasRequiredAlignment = LOTRLevelData.getData(entityplayer).getAlignment(this.tableFaction) >= 1.0f;
        if (hasRequiredAlignment) {
            if (!world.isRemote) {
                entityplayer.openGui((Object)DwarvenRealm.instance, this.tableGUIID, world, i, j, k);
            }
        }
        else {
            for (int l = 0; l < 8; ++l) {
                final double d = i + world.rand.nextFloat();
                final double d2 = j + 1.0;
                final double d3 = k + world.rand.nextFloat();
                world.spawnParticle("smoke", d, d2, d3, 0.0, 0.0, 0.0);
            }
            if (!world.isRemote) {
                LOTRAlignmentValues.notifyAlignmentNotHighEnough(entityplayer, 1.0f, this.tableFaction);
            }
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconregister) {
        (this.tableIcons = new IIcon[3])[0] = iconregister.registerIcon(this.getTextureName() + "_side0");
        this.tableIcons[1] = iconregister.registerIcon(this.getTextureName() + "_side1");
        this.tableIcons[2] = iconregister.registerIcon(this.getTextureName() + "_top");
    }
    
    public static class Container extends LOTRContainerCraftingTable
    {
        public Container(final InventoryPlayer inv, final World world, final int i, final int j, final int k) {
            super(inv, world, i, j, k, (List)DRRecipe.redMountains, DRRegistry.redDwarvenTable);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public static class Gui extends LOTRGuiCraftingTable
    {
        public Gui(final InventoryPlayer inv, final World world, final int i, final int j, final int k) {
            super((LOTRContainerCraftingTable)new Container(inv, world, i, j, k), "red_mountains");
        }
    }
}
