package drealm.biome;

import drealm.entity.DREntityMumakil;
import lotr.common.entity.animal.LOTREntityHorse;
import lotr.common.world.biome.LOTRBiomeGenNearHarad;
import lotr.common.world.spawning.LOTRBiomeSpawnList;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class DRBiomeMumakilRed
        extends LOTRBiomeGenNearHarad {
    public DRBiomeMumakilRed(int i, boolean major) {
        super(i, major);
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(DREntityMumakil.class, 2, 1, 2));
        setDisableRain();
        topBlock = Blocks.sand;
        topBlockMeta = 1;
        fillerBlock = Blocks.sand;
        fillerBlockMeta = 1;
        decorator.clearRandomStructures();
        decorator.clearVillages();
    }
}