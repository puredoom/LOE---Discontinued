//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.biome;

import lotr.common.world.feature.*;
import lotr.common.world.spawning.*;
import net.minecraft.world.*;
import java.util.*;
import net.minecraft.world.gen.feature.*;
import net.minecraft.block.*;
import lotr.common.world.biome.variant.*;
import net.minecraft.init.*;
import lotr.common.*;
import drealm.database.*;
import lotr.common.world.biome.*;
import lotr.common.world.map.*;

public class DRBiomeValinor extends LOTRBiomeGenOcean
{
    public WorldGenerator boulderGen;
    
    public DRBiomeValinor(final int i, final boolean major) {
        super(i, major);
        this.boulderGen = (WorldGenerator)new LOTRWorldGenBoulder(LOTRMod.rock, 5, 1, 3);
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableLOTRAmbientList.clear();
        this.decorator.setTreeCluster(8, 20);
        this.decorator.treesPerChunk = 0;
        this.decorator.flowersPerChunk = 5;
        this.decorator.doubleFlowersPerChunk = 1;
        this.decorator.grassPerChunk = 6;
        this.decorator.doubleGrassPerChunk = 2;
        this.decorator.generateAthelas = true;
        this.decorator.clearTrees();
        this.biomeColors.setGrass(11528484);
        this.decorator.addTree(LOTRTreeType.CEDAR, 1000);
        this.decorator.addTree(LOTRTreeType.MALLORN, 500);
        this.decorator.addTree(LOTRTreeType.CEDAR_LARGE, 500);
        this.decorator.addTree(LOTRTreeType.OAK, 200);
        this.decorator.addTree(LOTRTreeType.OAK_TALL, 200);
        this.decorator.addTree(LOTRTreeType.OAK_LARGE, 400);
        this.decorator.addTree(LOTRTreeType.BIRCH, 200);
        this.decorator.addTree(LOTRTreeType.BIRCH_TALL, 200);
        this.decorator.addTree(LOTRTreeType.BIRCH_LARGE, 400);
        this.decorator.addTree(LOTRTreeType.BEECH, 200);
        this.decorator.addTree(LOTRTreeType.BEECH_LARGE, 400);
        final Collection flowerDupes = new ArrayList();
        for (int l = 0; l < 10; ++l) {
            this.flowers.clear();
            this.registerPlainsFlowers();
            flowerDupes.addAll(this.flowers);
        }
        this.flowers.clear();
        this.flowers.addAll(flowerDupes);
        this.addFlower(LOTRMod.athelas, 0, 10);
        this.decorator.clearRandomStructures();
        this.setBanditChance(LOTREventSpawner.EventChance.NEVER);
    }
    
    public void decorate(final World world, final Random random, final int i, final int k) {
        super.decorate(world, random, i, k);
        if (random.nextInt(2) == 0) {
            for (int l = 0; l < 3; ++l) {
                final int i2 = i + random.nextInt(16) + 8;
                final int k2 = k + random.nextInt(16) + 8;
                this.boulderGen.generate(world, random, i2, world.getHeightValue(i2, k2), k2);
            }
        }
        if (random.nextInt(3) == 0) {
            final int i3 = i + random.nextInt(16) + 8;
            final int j1 = random.nextInt(128);
            final int k2 = k + random.nextInt(16) + 8;
            new WorldGenFlowers(LOTRMod.athelas).generate(world, random, i3, j1, k2);
        }
    }
    
    public void generateBiomeTerrain(final World world, final Random random, final Block[] blocks, final byte[] meta, final int i, final int k, final double stoneNoise, final int height, final LOTRBiomeVariant variant) {
        final Block topBlock_pre = this.topBlock;
        final int topBlockMeta_pre = this.topBlockMeta;
        final Block fillerBlock_pre = this.fillerBlock;
        final int fillerBlockMeta_pre = this.fillerBlockMeta;
        final double d1 = DRBiomeValinor.biomeTerrainNoise.func_151601_a(i * 0.1, k * 0.1);
        if (d1 > -0.1) {
            this.topBlock = Blocks.stone;
            this.topBlockMeta = 0;
            this.fillerBlock = this.topBlock;
            this.fillerBlockMeta = this.topBlockMeta;
        }
        super.generateBiomeTerrain(world, random, blocks, meta, i, k, stoneNoise, height, variant);
        this.topBlock = topBlock_pre;
        this.topBlockMeta = topBlockMeta_pre;
        this.fillerBlock = fillerBlock_pre;
        this.fillerBlockMeta = fillerBlockMeta_pre;
    }
    
    public LOTRAchievement getBiomeAchievement() {
        return DRAchievement.enterValinor;
    }
    
    public LOTRMusicRegion.Sub getBiomeMusic() {
        return LOTRMusicRegion.SEA.getSubregion("meneltarma");
    }
    
    public LOTRWaypoint.Region getBiomeWaypoints() {
        return LOTRWaypoint.Region.MENELTARMA;
    }
    
    public float getTreeIncreaseChance() {
        return 0.2f;
    }

}
