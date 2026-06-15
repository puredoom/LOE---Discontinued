//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.structure;

import net.minecraft.world.gen.feature.*;
import net.minecraft.world.*;
import net.minecraft.entity.player.*;
import cpw.mods.fml.common.*;
import lotr.common.*;
import lotr.common.world.structure2.*;
import lotr.common.world.structure.*;
import java.util.*;

public class DRStructure
{
    public static Map<Integer, IStructureProvider> idToClassMapping;
    public static Map<Integer, String> idToStringMapping;
    public static Map<Integer, StructureColorInfo> structureItemSpawners;
    public static int id;
    
    public static String getNameFromID(final int ID) {
        return DRStructure.idToStringMapping.get(ID);
    }
    
    public static IStructureProvider getStructureForID(final int ID) {
        return DRStructure.idToClassMapping.get(ID);
    }
    
    public static void preInit() {
        registerStructure(DRStructure.id++, (Class<? extends WorldGenerator>)DRStructureRedMountainsHouse.class, "RedMountainsHouse", 5701632, 5701632);
        registerStructure(DRStructure.id++, (Class<? extends WorldGenerator>)DRStructureRedMountainsSmithy.class, "RedMountainsSmithy", 5701632, 5701632);
        registerStructure(DRStructure.id++, (Class<? extends WorldGenerator>)DRStructureRedMountainsStronghold.class, "RedMountainsStronghold", 5701632, 5701632);
        registerStructure(DRStructure.id++, (Class<? extends WorldGenerator>)lotr.common.world.structure2.LOTRWorldGenDwarvenMineEntrance.class, "DwarvenMineEntrance", 7368816, 11184810);
    }
    
    public static void registerStructure(final int id, final Class<? extends WorldGenerator> strClass, final String name, final int colorBG, final int colorFG) {
        registerStructure(id, strClass, name, colorBG, colorFG, false);
    }
    
    public static void registerStructure(final int id, final Class<? extends WorldGenerator> strClass, final String name, final int colorBG, final int colorFG, final boolean hide) {
        final IStructureProvider strProvider = new IStructureProvider() {
            @Override
            public boolean generateStructure(final World world, final EntityPlayer entityplayer, final int i, final int j, final int k) {
                WorldGenerator generator = null;
                try {
                    generator = strClass.getConstructor(Boolean.TYPE).newInstance(true);
                }
                catch (Exception e) {
                    FMLLog.warning("Failed to build LOTR structure " + strClass.getName(), new Object[0]);
                    e.printStackTrace();
                }
                if (generator != null) {
                    final boolean timelapse = LOTRConfig.strTimelapse;
                    if (generator instanceof LOTRWorldGenStructureBase2) {
                        final LOTRWorldGenStructureBase2 strGen = (LOTRWorldGenStructureBase2)generator;
                        strGen.restrictions = false;
                        strGen.usingPlayer = entityplayer;
                        if (timelapse) {
                            LOTRStructureTimelapse.start((WorldGenerator)strGen, world, i, j, k);
                            return true;
                        }
                        return strGen.generateWithSetRotation(world, world.rand, i, j, k, strGen.usingPlayerRotation());
                    }
                    else if (generator instanceof LOTRWorldGenStructureBase) {
                        final LOTRWorldGenStructureBase strGen2 = (LOTRWorldGenStructureBase)generator;
                        strGen2.restrictions = false;
                        strGen2.usingPlayer = entityplayer;
                        if (timelapse) {
                            LOTRStructureTimelapse.start((WorldGenerator)strGen2, world, i, j, k);
                            return true;
                        }
                        return strGen2.generate(world, world.rand, i, j, k);
                    }
                }
                return false;
            }
            
            @Override
            public boolean isVillage() {
                return false;
            }
        };
        registerStructure(id, strProvider, name, colorBG, colorFG, hide);
    }
    
    public static void registerStructure(final int id, final IStructureProvider str, final String name, final int colorBG, final int colorFG, final boolean hide) {
        if (DRStructure.idToClassMapping.containsKey(id)) {
            throw new IllegalArgumentException("Structure ID " + id + " is already registered to " + name + "!");
        }
        DRStructure.idToClassMapping.put(id, str);
        DRStructure.idToStringMapping.put(id, name);
        DRStructure.structureItemSpawners.put(id, new StructureColorInfo(id, colorBG, colorFG, str.isVillage(), hide));
    }
    
    static {
        DRStructure.idToClassMapping = new HashMap<Integer, IStructureProvider>();
        DRStructure.idToStringMapping = new HashMap<Integer, String>();
        DRStructure.structureItemSpawners = new LinkedHashMap<Integer, StructureColorInfo>();
        DRStructure.id = 3000;
    }
    
    public static class StructureColorInfo
    {
        public final int spawnedID;
        public final int colorBackground;
        public final int colorForeground;
        public final boolean isVillage;
        public final boolean isHidden;
        
        public StructureColorInfo(final int i, final int colorBG, final int colorFG, final boolean vill, final boolean hide) {
            this.spawnedID = i;
            this.colorBackground = colorBG;
            this.colorForeground = colorFG;
            this.isVillage = vill;
            this.isHidden = hide;
        }
    }
    
    public interface IStructureProvider
    {
        boolean generateStructure(final World p0, final EntityPlayer p1, final int p2, final int p3, final int p4);
        
        boolean isVillage();
    }
}
