//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.biome;

import drealm.entity.DREntityWerewolfRohan;
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

    public static void Biomesinit() {
        FixAnimals();
    }


    public static void FixAnimals(){
        DRCommander.addAnimals((Class) DREntityWerewolfRohan.class, 3, 1, 2, LOTRBiome.rohan);
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
    }
}
