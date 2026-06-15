//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.biome;

import lotr.common.world.biome.variant.*;
import net.minecraft.init.*;
import net.minecraft.world.gen.feature.*;
import lotr.common.world.feature.*;
import lotr.common.entity.npc.*;
import net.minecraft.world.*;
import java.util.*;
import drealm.structure.*;
import net.minecraft.block.*;
import lotr.common.*;
import lotr.common.world.biome.*;
import lotr.common.world.map.*;
import lotr.common.world.spawning.*;
import drealm.entity.*;
import drealm.util.*;
import net.minecraft.world.biome.*;

public class DRBiomeRedMountains extends LOTRBiome
{
    public static final LOTRSpawnList RED_DWARVES;
    public static final LOTRRoadType RED_DWARVEN;
    
    public DRBiomeRedMountains(final int i, final boolean major) {
        super(i, major);
        this.npcSpawnList.clear();
        final LOTRBiomeSpawnList.SpawnListContainer[] arrspawnListContainer = { LOTRBiomeSpawnList.entry(DRBiomeRedMountains.RED_DWARVES, 10) };
        this.npcSpawnList.newFactionList(600).add(arrspawnListContainer);
        this.addBiomeVariantSet(LOTRBiomeVariant.SET_MOUNTAINS);
        this.addBiomeVariant(LOTRBiomeVariant.FOREST_BEECH, 0.2f);
        this.addBiomeVariant(LOTRBiomeVariant.FOREST_BIRCH, 0.2f);
        this.addBiomeVariant(LOTRBiomeVariant.FOREST_LARCH, 0.2f);
        this.addBiomeVariant(LOTRBiomeVariant.FOREST_PINE, 0.2f);
        this.addBiomeVariant(LOTRBiomeVariant.FOREST_MAPLE, 0.2f);
        this.decorator.biomeOreFactor = 2.0f;
        this.decorator.biomeGemFactor = 1.5f;
        this.decorator.addSoil((WorldGenerator)new WorldGenMinable(LOTRMod.rock, 4, 60, Blocks.stone), 12.0f, 0, 96);
        this.decorator.addOre((WorldGenerator)new WorldGenMinable(LOTRMod.oreGlowstone, 4), 8.0f, 0, 48);
        this.decorator.treesPerChunk = 1;
        this.decorator.flowersPerChunk = 1;
        this.decorator.grassPerChunk = 8;
        this.decorator.doubleGrassPerChunk = 1;
        this.decorator.addTree(LOTRTreeType.OAK, 300);
        this.decorator.addTree(LOTRTreeType.OAK_LARGE, 50);
        this.decorator.addTree(LOTRTreeType.SPRUCE, 500);
        this.decorator.addTree(LOTRTreeType.LARCH, 300);
        this.decorator.addTree(LOTRTreeType.MAPLE, 300);
        this.decorator.addTree(LOTRTreeType.MAPLE_LARGE, 50);
        this.decorator.addTree(LOTRTreeType.FIR, 500);
        this.decorator.addTree(LOTRTreeType.PINE, 500);
        this.decorator.addRandomStructure((WorldGenerator)new DRStructureRedMountainsStronghold(false), 200);
        this.decorator.addRandomStructure((WorldGenerator)new DRStructureRedMountainsSmithy(false), 75);
        this.decorator.addRandomStructure((WorldGenerator)new lotr.common.world.structure2.LOTRWorldGenDwarvenMineEntrance(false), 120);
        this.registerMountainsFlowers();
        this.addFlower(LOTRMod.dwarfHerb, 0, 1);
        this.biomeColors.setSky(13541522);
        this.registerTravellingTrader((Class)DREntityRedDwarfMerchant.class);
        this.registerTravellingTrader((Class)LOTREntityScrapTrader.class);
        this.setBanditChance(LOTREventSpawner.EventChance.BANDIT_RARE);
    }
    
    public void decorate(final World world, final Random random, final int i, final int k) {
        super.decorate(world, random, i, k);
        for (int l = 0; l < 4; ++l) {
            final int i2 = i + random.nextInt(16) + 8;
            final int j1 = 70 + random.nextInt(80);
            final int k2 = k + random.nextInt(16) + 8;
            new DRStructureRedMountainsHouse(false).generate(world, random, i2, j1, k2);
        }
    }
    
    public void generateMountainTerrain(final World world, final Random random, final Block[] blocks, final byte[] meta, final int i, final int k, final int xzIndex, final int ySize, final int height, final int rockDepth, final LOTRBiomeVariant variant) {
        final int stoneHeight = 110 - rockDepth;
        for (int sandHeight = stoneHeight - 6, j = ySize - 1; j >= sandHeight; --j) {
            final int index = xzIndex * ySize + j;
            final Block block = blocks[index];
            if (block == this.topBlock || block == this.fillerBlock) {
                if (j >= stoneHeight) {
                    blocks[index] = LOTRMod.rock;
                    meta[index] = 4;
                }
                else {
                    blocks[index] = (Block)Blocks.sand;
                    meta[index] = 1;
                }
            }
        }
    }
    
    public LOTRAchievement getBiomeAchievement() {
        return LOTRAchievement.enterRedMountains;
    }
    
    public LOTRMusicRegion.Sub getBiomeMusic() {
        return LOTRMusicRegion.DWARVEN.getSubregion("redMountains");
    }
    
    public LOTRWaypoint.Region getBiomeWaypoints() {
        return LOTRWaypoint.Region.RED_MOUNTAINS;
    }
    
    public float getChanceToSpawnAnimals() {
        return 0.2f;
    }
    
    public boolean getEnableRiver() {
        return false;
    }
    
    public LOTRRoadType getRoadBlock() {
        return DRBiomeRedMountains.RED_DWARVEN;
    }
    
    static {
        RED_DWARVES = DRCommander.newLOTRSpawnList(new LOTRSpawnEntry((Class)DREntityRedDwarf.class, 100, 4, 4), new LOTRSpawnEntry((Class)DREntityRedDwarfMiner.class, 15, 1, 3), new LOTRSpawnEntry((Class)DREntityRedDwarfWarrior.class, 20, 4, 4), new LOTRSpawnEntry((Class)DREntityRedDwarfAxeThrower.class, 10, 4, 4), new LOTRSpawnEntry((Class)DREntityRedDwarfFireThrower.class, 10, 4, 4));
        RED_DWARVEN = new LOTRRoadType() {
            public LOTRRoadType.RoadBlock getBlock(final Random rand, final BiomeGenBase biome, final boolean top, final boolean slab) {
                return slab ? new LOTRRoadType.RoadBlock(LOTRMod.slabSingle3, 6) : new LOTRRoadType.RoadBlock(LOTRMod.brick2, 2);
            }
        };
    }
}
