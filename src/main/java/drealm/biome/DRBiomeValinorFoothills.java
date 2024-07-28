//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.biome;

import net.minecraft.world.*;
import java.util.*;
import net.minecraft.block.*;
import lotr.common.world.biome.variant.*;
import lotr.common.*;

public class DRBiomeValinorFoothills extends DRBiomeValinor
{
    public DRBiomeValinorFoothills(final int i, final boolean major) {
        super(i, major);
        this.decorator.biomeGemFactor = 1.0f;
    }
    
    public void generateMountainTerrain(final World world, final Random random, final Block[] blocks, final byte[] meta, final int i, final int k, final int xzIndex, final int ySize, final int height, final int rockDepth, final LOTRBiomeVariant variant) {
        final int stoneHeight = 110 - rockDepth;
        for (int sandHeight = stoneHeight - 6, j = ySize - 1; j >= sandHeight; --j) {
            final int index = xzIndex * ySize + j;
            final Block block = blocks[index];
            if (block == this.topBlock || block == this.fillerBlock) {
                if (j >= stoneHeight) {
                    blocks[index] = LOTRMod.rock;
                    meta[index] = 5;
                }
                else {
                    blocks[index] = LOTRMod.whiteSand;
                    meta[index] = 0;
                }
            }
        }
    }
}
