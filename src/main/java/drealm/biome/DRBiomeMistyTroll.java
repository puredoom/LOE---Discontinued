package drealm.biome;

import drealm.entity.DREntityGraug;
import drealm.entity.DREntityTrollGundabad;
import lotr.common.world.biome.LOTRBiomeGenMistyMountains;
import lotr.common.world.biome.LOTRBiomeGenMordor;

public class DRBiomeMistyTroll
        extends LOTRBiomeGenMistyMountains {
    public DRBiomeMistyTroll(int i, boolean major) {
        super(i, major);
        this.spawnableCreatureList.add(new SpawnListEntry(DREntityTrollGundabad.class, 2, 1, 2));
        setDisableRain();
        decorator.clearRandomStructures();
        decorator.clearVillages();
    }
}