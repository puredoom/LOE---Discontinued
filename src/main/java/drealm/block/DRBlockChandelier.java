//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.block;

import cpw.mods.fml.relauncher.*;
import net.minecraft.block.material.*;
import lotr.common.*;
import net.minecraft.creativetab.*;
import net.minecraft.block.*;
import lotr.common.block.*;
import net.minecraftforge.common.util.*;
import net.minecraft.world.*;
import net.minecraft.util.*;
import java.util.*;
import net.minecraft.item.*;
import net.minecraft.client.renderer.texture.*;

public class DRBlockChandelier extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon[] chandelierIcons;
    private String[] chandelierNames;
    
    public DRBlockChandelier() {
        super(Material.circuits);
        this.chandelierNames = new String[] { "redDwarven" };
        this.setCreativeTab((CreativeTabs)LOTRCreativeTabs.tabDeco);
        this.setHardness(0.0f);
        this.setResistance(2.0f);
        this.setStepSound(Block.soundTypeMetal);
        this.setLightLevel(0.9375f);
        this.setBlockBounds(0.0625f, 0.1875f, 0.0625f, 0.9375f, 1.0f, 0.9375f);
    }
    
    public static void spawnChandelierParticles(final World world, final double d, final double d1, final double d2, final Random random, final int meta) {
        world.spawnParticle("smoke", d, d1, d2, 0.0, 0.0, 0.0);
        world.spawnParticle("flame", d, d1, d2, 0.0, 0.0, 0.0);
    }
    
    public boolean canBlockStay(final World world, final int i, final int j, final int k) {
        final Block block = world.getBlock(i, j + 1, k);
        final int meta = world.getBlockMetadata(i, j + 1, k);
        return block instanceof BlockFence || block instanceof BlockWall || (block instanceof BlockSlab && !block.isOpaqueCube() && (meta & 0x8) == 0x0) || ((block instanceof BlockStairs && (meta & 0x4) == 0x0) || block instanceof LOTRBlockOrcChain) || world.getBlock(i, j + 1, k).isSideSolid((IBlockAccess)world, i, j + 1, k, ForgeDirection.DOWN);
    }
    
    public boolean canPlaceBlockAt(final World world, final int i, final int j, final int k) {
        return this.canBlockStay(world, i, j, k);
    }
    
    public int damageDropped(final int i) {
        return i;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World world, final int i, final int j, final int k) {
        return null;
    }
    
    public IIcon getIcon(final int i, int j) {
        if (j >= this.chandelierNames.length) {
            j = 0;
        }
        return this.chandelierIcons[j];
    }
    
    public int getRenderType() {
        return 1;
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(final Item item, final CreativeTabs tab, final List list) {
        for (int i = 0; i < this.chandelierNames.length; ++i) {
            list.add(new ItemStack(item, 1, i));
        }
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public void onNeighborBlockChange(final World world, final int i, final int j, final int k, final Block block) {
        if (!this.canBlockStay(world, i, j, k)) {
            this.dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
            world.setBlockToAir(i, j, k);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(final World world, final int i, final int j, final int k, final Random random) {
        final int meta = world.getBlockMetadata(i, j, k);
        final double d = 0.13;
        final double d2 = 1.0 - d;
        final double d3 = 0.6875;
        spawnChandelierParticles(world, i + d, j + d3, k + d, random, meta);
        spawnChandelierParticles(world, i + d2, j + d3, k + d2, random, meta);
        spawnChandelierParticles(world, i + d, j + d3, k + d2, random, meta);
        spawnChandelierParticles(world, i + d2, j + d3, k + d, random, meta);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconregister) {
        this.chandelierIcons = new IIcon[this.chandelierNames.length];
        for (int i = 0; i < this.chandelierNames.length; ++i) {
            this.chandelierIcons[i] = iconregister.registerIcon(this.getTextureName() + "_" + this.chandelierNames[i]);
        }
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
}
