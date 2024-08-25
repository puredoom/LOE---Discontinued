//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.biome;

import drealm.entity.*;
import drealm.util.DRCommander;
import lotr.common.world.biome.*;
import lotr.common.*;

public class DRBiome
{
    public static LOTRBiome redMountains;
    public static LOTRBiome redMountainsFoothills;
    public static LOTRBiome valinor;
    public static LOTRBiome valinorMountains;

    public static LOTRBiome windMountains;
    public static LOTRBiome windMountainsFoothills;

    public static LOTRBiome mumakilRed;

    public static LOTRBiome mordorGraug;

    public static LOTRBiome mistyTroll;

    public static void Biomesinit() {
        FixAnimals();
    }


    public static void FixAnimals(){
        DRCommander.addAnimals((Class) DREntityWerewolfRohan.class, 1, 1, 1, LOTRBiome.rohan);
        DRCommander.addAnimals((Class) DREntitySkinChanger.class, 1, 1, 1, LOTRBiome.dolGuldur);
        DRCommander.addAnimals((Class) DREntityEnt.class, 1, 1, 1, LOTRBiome.fangorn);
        DRCommander.addAnimals((Class) DREntityWerewolfGondor.class, 1, 1, 1, LOTRBiome.gondor);
        DRCommander.addAnimals((Class) DREntitySpiderLothlorien.class, 1, 1, 1, LOTRBiome.lothlorien);
        DRCommander.addAnimals((Class) DREntityGoat.class, 1, 1, 1, LOTRBiome.greyMountains);
        DRCommander.addAnimals((Class) DREntityGoat.class, 1, 1, 1, LOTRBiome.greyMountainsFoothills);
        DRCommander.addAnimals((Class) DREntityGoat.class, 1, 1, 1, LOTRBiome.erebor);
        DRCommander.addAnimals((Class) DREntityBoar.class, 1, 1, 1, LOTRBiome.blueMountains);
        DRCommander.addAnimals((Class) DREntityBoar.class, 1, 1, 1, LOTRBiome.blueMountainsFoothills);
        DRCommander.addAnimals((Class) DREntitySouris.class, 1, 1, 1, LOTRBiome.woodlandRealm);
        DRCommander.addAnimals((Class) DREntityDalishOstrich.class, 1, 1, 1, LOTRBiome.dale);
        DRCommander.addAnimals((Class) DREntityRhunBison.class, 1, 1, 1, LOTRBiome.rhunRedForest);
        DRCommander.addAnimals((Class) DREntityDorwinionPanda.class, 1, 1, 1, LOTRBiome.dorwinion);
        DRCommander.addAnimals((Class) DREntitySalamander.class, 1, 1, 1, LOTRBiome.halfTrollForest);
        DRCommander.addAnimals((Class) DREntitySalamander.class, 1, 1, 1, LOTRBiome.pertorogwaith);
        DRCommander.addAnimals((Class) DREntityGorilla.class, 1, 1, 1, LOTRBiome.farHaradJungleMountains);
        DRCommander.addAnimals((Class) DREntityPoney.class, 1, 1, 1, LOTRBiome.shire);
        DRCommander.addAnimals((Class) DREntityNazgul.class, 1, 1, 1, LOTRBiome.angmar);
        DRCommander.addAnimals((Class) DREntityLoup.class, 1, 1, 1, LOTRBiome.eriador);
        DRCommander.addAnimals((Class) DREntityTrollGundabad.class, 1, 1, 1, LOTRBiome.mistyMountains);
        DRCommander.addAnimals((Class) DREntityRedBeast.class, 1, 1, 1, LOTRBiome.redMountains);
        DRCommander.addAnimals((Class) DREntityDunlandBear.class, 1, 1, 1, LOTRBiome.dunland);

    }

    public static void preInit() {
        for (final int i : new int[] { 117, 118, 164, 165 }) {
            LOTRDimension.MIDDLE_EARTH.biomeList[i] = null;
        }
        DRBiome.redMountains = new DRBiomeRedMountains(117, true).setTemperatureRainfall(0.3f, 0.4f).setMinMaxHeight(1.5f, 2.0f).setColor(9662797).setBiomeName("redMountains");
        DRBiome.redMountainsFoothills = new DRBiomeRedMountainsFoothills(118, true).setTemperatureRainfall(0.7f, 0.4f).setMinMaxHeight(0.5f, 0.9f).setColor(10064979).setBiomeName("redMountainsFoothills");
        DRBiome.valinor = new DRBiomeValinor(171, true).setTemperatureRainfall(0.4f, 0.6f).setMinMaxHeight(0.5f, 0.6f).setColor(7910686).setBiomeName("valinor");
        DRBiome.valinorMountains = new DRBiomeValinorFoothills(172, true).setTemperatureRainfall(0.4f, 0.6f).setMinMaxHeight(1.5f, 2.0f).setColor(16374220).setBiomeName("valinorHills");
        windMountains = new DRBiomeWindMountains(164, true).setTemperatureRainfall(0.28f, 0.2f).setMinMaxHeight(2.0f, 2.0f).setColor(0xD3D3D4).setBiomeName("windMountains");
        windMountainsFoothills = new DRBiomeWindMountainsFoothills(165, true).setTemperatureRainfall(0.4f, 0.6f).setMinMaxHeight(0.5f, 0.6f).setColor(0x9A9F6B).setBiomeName("windMountainsFoothills");
        DRBiome.mumakilRed = new DRBiomeMumakilRed(173, true).setTemperatureRainfall(0.4f, 0.6f).setMinMaxHeight(0.5f,0.5f).setColor(0xC69457).setBiomeName("mumakilRedDesert");
        DRBiome.mordorGraug = new DRBiomeGraugMordor(174, true).setTemperatureRainfall(0.4f, 0.6f).setMinMaxHeight(0.5f, 0.5f).setColor(0x261602).setBiomeName("graugMordor");
        DRBiome.mistyTroll = new DRBiomeMistyTroll(176, true).setTemperatureRainfall(0.4f, 0.6f).setMinMaxHeight(0.5f, 0.5f).setColor(0xE5E2D7).setBiomeName("mistyTroll");
    }
}
