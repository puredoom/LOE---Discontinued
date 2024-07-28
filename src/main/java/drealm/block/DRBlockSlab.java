//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.block;

import lotr.common.block.*;
import net.minecraft.block.material.*;
import net.minecraft.util.*;
import drealm.database.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.item.*;
import net.minecraft.block.*;

public class DRBlockSlab extends LOTRBlockSlabBase
{
    public DRBlockSlab(final boolean flag) {
        super(flag, Material.rock, 1);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int i, final int j) {
        if (j == 0) {
            return DRRegistry.pillar.getIcon(i, 0);
        }
        return super.getIcon(i, j);
    }
    
    public static class SlabExDouble extends ItemSlab
    {
        public SlabExDouble(final Block block) {
            super(block, (BlockSlab)DRRegistry.slabSingle, (BlockSlab)DRRegistry.slabDouble, true);
        }
    }
    
    public static class SlabExSingle extends ItemSlab
    {
        public SlabExSingle(final Block block) {
            super(block, (BlockSlab)DRRegistry.slabSingle, (BlockSlab)DRRegistry.slabDouble, false);
        }
    }
}
