package drealm.biome;

import drealm.entity.DREntityGraug;
import drealm.entity.DREntityMumakil;
import lotr.common.world.biome.LOTRBiomeGenMordor;
import lotr.common.world.biome.LOTRBiomeGenNearHarad;
import net.minecraft.init.Blocks;

public class DRBiomeGraugMordor
        extends LOTRBiomeGenMordor {
    public DRBiomeGraugMordor(int i, boolean major) {
        super(i, major);
        this.spawnableCreatureList.add(new SpawnListEntry(DREntityGraug.class, 2, 1, 2));
        setDisableRain();
        decorator.clearRandomStructures();
        decorator.clearVillages();
    }
}