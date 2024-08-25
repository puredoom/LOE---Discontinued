//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.util;

import cpw.mods.fml.common.registry.EntityRegistry;
import lotr.common.world.biome.LOTRBiome;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.util.*;
import net.minecraft.block.*;
import net.minecraft.potion.*;
import lotr.common.fac.*;
import lotr.common.quest.*;
import lotr.common.entity.npc.*;
import net.minecraft.item.*;
import lotr.common.util.*;
import lotr.common.item.*;
import net.minecraft.util.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import lotr.common.*;
import java.util.*;
import java.lang.reflect.*;
import lotr.common.world.spawning.*;
import lotr.common.world.map.*;
import lotr.client.*;
import net.minecraft.client.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.relauncher.*;
import lotr.common.world.genlayer.*;
import org.apache.commons.lang3.tuple.Pair;

public class DRCommander
{
    public static int lastBannerID;
    
    public static LOTRAchievement.Category addAchievementCategory(final String enumName, final LOTRFaction faction) {
        final Class<?>[] classArr = (Class<?>[])new Class[] { LOTRFaction.class };
        final Object[] args = { faction };
        return (LOTRAchievement.Category)EnumHelper.addEnum((Class)LOTRAchievement.Category.class, enumName, (Class[])classArr, args);
    }
    
    public static LOTRShields addAlignmentShield(final String enumName, final LOTRFaction faction) {
        final Class<?>[] classArr = (Class<?>[])new Class[] { LOTRFaction.class };
        final Object[] args = { faction };
        return (LOTRShields)EnumHelper.addEnum((Class)LOTRShields.class, enumName, (Class[])classArr, args);
    }
    
    public static LOTRItemBanner.BannerType addBanner(final String name, final LOTRFaction faction) {
        final int id = DRCommander.lastBannerID++;
        final LOTRItemBanner.BannerType banner = (LOTRItemBanner.BannerType)EnumHelper.addEnum((Class)LOTRItemBanner.BannerType.class, name.toUpperCase(Locale.ROOT), new Class[] { Integer.TYPE, String.class, LOTRFaction.class }, new Object[] { id, name, faction });
        LOTRItemBanner.BannerType.bannerTypes.add(banner);
        final Map<Integer, LOTRItemBanner.BannerType> map = (Map<Integer, LOTRItemBanner.BannerType>)ReflectionHelper.getPrivateValue((Class)LOTRItemBanner.BannerType.class, (Object)null, new String[] { "bannerForID" });
        final LOTRItemBanner.BannerType prior = map.put(id, banner);
        return banner;
    }

    public static void addBannerBlock(Block block, int metadata, int radius) {
        try {
            // Get the protectionBlocks field from the LOTRBannerProtection class
            Class<?> bannerProtectionClass = LOTRBannerProtection.class;
            Field protectionBlocksField = bannerProtectionClass.getDeclaredField("protectionBlocks");
            protectionBlocksField.setAccessible(true); // Make the field accessible

            // Get the current protectionBlocks map
            Map<Pair<Block, Integer>, Integer> blockMap = (Map<Pair<Block, Integer>, Integer>) protectionBlocksField.get(null);

            // Modify the map by adding the new block and radius
            blockMap.put(Pair.of(block, metadata), radius);

            // Set the modified map back to the protectionBlocks field
            protectionBlocksField.set(null, blockMap);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace(); // Handle any exceptions
        }
    }

    public static void addAnimals(final Class entity, final int number1, final int number4, final int number6, final LOTRBiome biome) {
        EntityRegistry.addSpawn(entity, number1, number4, number6, EnumCreatureType.creature, new BiomeGenBase[] { (BiomeGenBase)biome });
    }

    
    public static <E> Method findMethod(final Class<? super E> clazz, final E instance, final String methodName, final Class<?>... methodTypes) {
        return ReflectionHelper.findMethod((Class)clazz, (Object)instance, new String[] { methodName }, (Class[])methodTypes);
    }
    
    public static void throwException(final Throwable t) {
        throw new RuntimeException(t);
    }

    public static LOTRMaterial generateMaterial(final String name, final boolean undamagable, final boolean manflesh, final Integer uses, final Float damage, final Float protection, final Integer harvestlevel, final Float speed, final Integer enchantability) {
        LOTRMaterial mat = null;
        try {
            final Constructor c = LOTRMaterial.class.getDeclaredConstructor(String.class);
            c.setAccessible(true);
            mat = (LOTRMaterial) c.newInstance(name);
            if (undamagable) {
                findMethod(LOTRMaterial.class, mat, "setUndamageable", (Class<?>[])new Class[0]).invoke(mat, new Object[0]);
            }
            if (manflesh) {
                findMethod(LOTRMaterial.class, mat, "setManFlesh", (Class<?>[])new Class[0]).invoke(mat, new Object[0]);
            }
            if (uses != null) {
                findMethod(LOTRMaterial.class, mat, "setUses", Integer.TYPE).invoke(mat, uses);
            }
            if (damage != null) {
                findMethod(LOTRMaterial.class, mat, "setDamage", Float.TYPE).invoke(mat, damage);
            }
            if (protection != null) {
                findMethod(LOTRMaterial.class, mat, "setProtection", Float.TYPE).invoke(mat, protection);
            }
            if (harvestlevel != null) {
                findMethod(LOTRMaterial.class, mat, "setHarvestLevel", Integer.TYPE).invoke(mat, harvestlevel);
            }
            if (speed != null) {
                findMethod(LOTRMaterial.class, mat, "setSpeed", Float.TYPE).invoke(mat, speed);
            }
            if (enchantability != null) {
                findMethod(LOTRMaterial.class, mat, "setEnchantability", Integer.TYPE).invoke(mat, enchantability);
            }
        }
        catch (InvocationTargetException ex) {}
        catch (Exception e) {
            throwException(e);
        }
        return mat;
    }
    
    public static void setbrew(final LOTRItemMug brew, final float alcohollvel, final boolean clear, final boolean brew1, final int effect, final int strenght, final boolean brew2, final int effect2, final int strenght2) {
        if (clear) {
            final List<PotionEffect> list = (List<PotionEffect>)ReflectionHelper.getPrivateValue((Class)LOTRItemMug.class, (Object)brew, new String[] { "potionEffects" });
            list.clear();
        }
        if (brew1) {
            brew.addPotionEffect(effect, strenght);
        }
        if (brew2) {
            brew.addPotionEffect(effect2, strenght2);
        }
        ReflectionHelper.setPrivateValue((Class)LOTRItemMug.class, (Object)brew, (Object)alcohollvel, new String[] { "alcoholicity" });
    }
    
    public static void addControlZone(final LOTRFaction faction, final LOTRControlZone zone) {
        findAndInvokeMethod(zone, LOTRFaction.class, faction, "addControlZone", LOTRControlZone.class);
    }
    
    public static LOTRFaction addFaction(final String enumName, final int color, final LOTRDimension dim, final LOTRDimension.DimensionRegion region, final boolean player, final boolean registry, final int alignment, final LOTRMapRegion mapInfo, final Set<LOTRFaction.FactionType> types) {
        final Class<?>[] classArr = (Class<?>[])new Class[] { Integer.TYPE, LOTRDimension.class, LOTRDimension.DimensionRegion.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, LOTRMapRegion.class, EnumSet.class };
        final Object[] args = { color, dim, region, player, registry, alignment, mapInfo, types };
        return (LOTRFaction)EnumHelper.addEnum((Class)LOTRFaction.class, enumName, (Class[])classArr, args);
    }
    
    public static LOTRFaction addFaction(final String enumName, final int color, final LOTRDimension.DimensionRegion region, final Set<LOTRFaction.FactionType> types) {
        return addFaction(enumName, color, LOTRDimension.MIDDLE_EARTH, region, true, true, Integer.MIN_VALUE, null, types);
    }
    
    public static LOTRFactionRank addFactionRank(final LOTRFaction faction, final float alignment, final String name) {
        return addFactionRank(faction, alignment, name, false);
    }
    
    public static LOTRFactionRank addFactionRank(final LOTRFaction faction, final float alignment, final String name, final boolean gendered) {
        return findAndInvokeMethod(new Object[] { alignment, name, gendered }, LOTRFaction.class, faction, "addRank", Float.TYPE, String.class, Boolean.TYPE);
    }
    
    public static LOTRInvasions addInvasion(final String enumName, final LOTRFaction faction) {
        return addInvasion(enumName, faction, null);
    }
    
    public static LOTRInvasions addInvasion(final String enumName, final LOTRFaction faction, final String subfaction) {
        final Class<?>[] classArr = (Class<?>[])new Class[] { LOTRFaction.class, String.class };
        final Object[] args = { faction, subfaction };
        return (LOTRInvasions)EnumHelper.addEnum((Class)LOTRInvasions.class, enumName, (Class[])classArr, args);
    }
    
    public static void addMiniQuest(final LOTRMiniQuestFactory factory, final LOTRMiniQuest.QuestFactoryBase<? extends LOTRMiniQuest> questFactory) {
        findAndInvokeMethod(questFactory, LOTRMiniQuestFactory.class, factory, "addQuest", LOTRMiniQuest.QuestFactoryBase.class);
    }
    
    public static LOTRMiniQuestFactory addMiniQuestFactory(final String enumName, final String name) {
        final Class<?>[] classArr = (Class<?>[])new Class[] { String.class };
        final Object[] args = { name };
        return (LOTRMiniQuestFactory)EnumHelper.addEnum((Class)LOTRMiniQuestFactory.class, enumName, (Class[])classArr, args);
    }
    
    static void addSpeechBank(final String name, final boolean rand, final List<String> lines) {
        final Class<?> speechBankClass = LOTRSpeech.class.getDeclaredClasses()[0];
        final Object speechBank = findAndInvokeConstructor(new Object[] { name, rand, lines }, speechBankClass, String.class, Boolean.TYPE, List.class);
        final Map<String, Object> allSpeechBanks = (Map<String, Object>)ReflectionHelper.getPrivateValue((Class)LOTRSpeech.class, (Object)null, new String[] { "allSpeechBanks" });
        allSpeechBanks.put(name, speechBank);
        ReflectionHelper.setPrivateValue((Class)LOTRSpeech.class, (Object)null, (Object)allSpeechBanks, new String[] { "allSpeechBanks" });
    }
    
    public static LOTRWaypoint addWaypoint(final String name, final LOTRWaypoint.Region region, final LOTRFaction faction, final double d, final double e) {
        return addWaypoint(name, region, faction, d, e, false);
    }
    
    public static LOTRWaypoint addWaypoint(final String name, final LOTRWaypoint.Region region, final LOTRFaction faction, final double x, final double z, final boolean hidden) {
        final Class<?>[] classArr = (Class<?>[])new Class[] { LOTRWaypoint.Region.class, LOTRFaction.class, Double.TYPE, Double.TYPE, Boolean.TYPE };
        final Object[] args = { region, faction, x, z, hidden };
        return (LOTRWaypoint)EnumHelper.addEnum((Class)LOTRWaypoint.class, name, (Class[])classArr, args);
    }
    
    public static void changeInvasionIcon(final LOTRInvasions invasion, final Item icon) {
        ReflectionHelper.setPrivateValue((Class)LOTRInvasions.class, (Object)invasion, (Object)icon, new String[] { "invasionIcon" });
    }

    public static <E> E findAndInvokeConstructor(Object[] args, Class<E> clazz, Class<?>... parameterTypes) {
        Constructor<E> constructor = findConstructor(clazz, parameterTypes);
        constructor.setAccessible(true);
        try {
            return constructor.newInstance(args);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException |
                 InvocationTargetException e) {
            LOTRLog.logger.error("Error when initializing constructor from class {} with parameters {}", clazz.getSimpleName(), args);
            e.printStackTrace();
            return null;
        }
    }
    
    private static <T, E> T findAndInvokeMethod(final Class<? super E> clazz, final E instance, final String methodName) {
        return findAndInvokeMethod(new Object[0], clazz, instance, methodName, (Class<?>[])new Class[0]);
    }
    
    public static <T, E> void findAndInvokeMethod(final Object arg, final Class<? super E> clazz, final E instance, final String methodName, final Class<?>... methodTypes) {
        findAndInvokeMethod(new Object[] { arg }, clazz, instance, new String[] { methodName }, methodTypes);
    }
    
    public static <T, E> T findAndInvokeMethod(final Object[] arg, final Class<? super E> clazz, final E instance, final String methodName, final Class<?>... methodTypes) {
        return findAndInvokeMethod(arg, clazz, instance, new String[] { methodName }, methodTypes);
    }

    public static <T, E> T findAndInvokeMethod(Object[] args, Class<? super E> clazz, E instance, String[] methodNames, Class<?>... methodTypes) {
        Method addControlZoneMethod = ReflectionHelper.findMethod(clazz, instance, methodNames, methodTypes);
        try {
            return (T) addControlZoneMethod.invoke(instance, args);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <E> Constructor<E> findConstructor(Class<E> clazz, Class<?>... parameterTypes) {
        try {
            return clazz.getDeclaredConstructor(parameterTypes);
        } catch (NoSuchMethodException | SecurityException e) {
            LOTRLog.logger.error("Error when getting constructor from class {} with parameters {}", clazz.getSimpleName(), parameterTypes);
            e.printStackTrace();
            return null;
        }
    }


    
    public static String getArmorName(final LOTRItemArmor armor) {
        return findAndInvokeMethod(LOTRItemArmor.class, armor, "getArmorName");
    }
    
    public static ModContainer getContainer(final ResourceLocation res) {
        final ModContainer modContainer = Loader.instance().getIndexedModList().get(res.getResourceDomain());
        if (modContainer == null) {
            throw new IllegalArgumentException("Can't find the mod container for the domain " + res.getResourceDomain());
        }
        return modContainer;
    }
    
    public static BufferedImage getImage(final InputStream in) {
        try {
            return ImageIO.read(in);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                in.close();
            }
            catch (IOException ex) {}
        }
        return null;
    }
    
    public static InputStream getInputStream(final ModContainer container, final String path) {
        return container.getClass().getResourceAsStream(path);
    }
    
    public static InputStream getInputStream(final ResourceLocation res) {
        return getInputStream(getContainer(res), getPath(res));
    }
    
    public static LOTRCreativeTabs getLOTRCreativeTab(final String name) {
        return (LOTRCreativeTabs)ReflectionHelper.getPrivateValue((Class)LOTRCreativeTabs.class, (Object)null, new String[] { name });
    }
    
    public static <E, T> List<T> getObjectFieldsOfType(final Class<? extends E> clazz, final Class<? extends T> type) {
        return getObjectFieldsOfType((Class<?>)clazz, (Object)null, type);
    }
    
    public static <E, T> List<T> getObjectFieldsOfType(final Class<? extends E> clazz, final E instance, final Class<? extends T> type) {
        final List<T> list = new ArrayList<T>();
        try {
            for (final Field field : clazz.getDeclaredFields()) {
                if (field != null) {
                    Object fieldObj = null;
                    if (Modifier.isStatic(field.getModifiers())) {
                        fieldObj = field.get(null);
                    }
                    else if (instance != null) {
                        fieldObj = field.get(instance);
                    }
                    if (fieldObj != null && type.isAssignableFrom(fieldObj.getClass())) {
                        list.add((T)fieldObj);
                    }
                }
            }
        }
        catch (IllegalArgumentException ex) {}
        catch (IllegalAccessException ex2) {}
        return list;
    }
    
    public static String getPath(final ResourceLocation res) {
        return "/assets/" + res.getResourceDomain() + "/" + res.getResourcePath();
    }
    
    public static LOTRSpawnList newLOTRSpawnList(final LOTRSpawnEntry... entries) {
        return findAndInvokeConstructor(new Object[] { entries }, LOTRSpawnList.class, LOTRSpawnEntry[].class);
    }

    public static void registerRoad(String name, Object... waypoints) {
        findAndInvokeMethod(new Object[]{name, waypoints}, LOTRRoads.class, null, "registerRoad", String.class, Object[].class);
    }

    @SideOnly(Side.CLIENT)
    public static void setClientMapImage(ResourceLocation res) {
        ResourceLocation sepiaMapTexture;
        ReflectionHelper.setPrivateValue(LOTRTextures.class, null, res, "mapTexture");
        try {
            BufferedImage mapImage = getImage(Minecraft.getMinecraft().getResourceManager().getResource(res).getInputStream());
            sepiaMapTexture = findAndInvokeMethod(new Object[]{mapImage, new ResourceLocation("lotr:map_sepia")}, LOTRTextures.class, null, "convertToSepia", BufferedImage.class, ResourceLocation.class);
        } catch (IOException e) {
            FMLLog.severe("Failed to generate GOT sepia map");
            e.printStackTrace();
            sepiaMapTexture = res;
        }
        ReflectionHelper.setPrivateValue(LOTRTextures.class, null, sepiaMapTexture, "sepiaMapTexture");
    }
    
    public static void setFactionAchievementCategory(final LOTRFaction faction, final LOTRAchievement.Category category) {
        ReflectionHelper.setPrivateValue((Class)LOTRFaction.class, (Object)faction, (Object)category, new String[] { "achieveCategory" });
    }
    
    public static void setMaterialCraftingItem(final LOTRMaterial material, final Item item) {
        setMaterialCraftingItem(material, item, item);
    }
    
    public static void setMaterialCraftingItem(final LOTRMaterial material, final Item toolItem, final Item armorItem) {
        findAndInvokeMethod(new Object[] { toolItem, armorItem }, LOTRMaterial.class, material, "setCraftingItems", Item.class, Item.class);
    }
    
    public static void setMiniQuestFactoryAchievement(final LOTRMiniQuestFactory factory, final LOTRAchievement achievement) {
        findAndInvokeMethod(achievement, LOTRMiniQuestFactory.class, factory, "setAchievement", LOTRAchievement.class);
    }
    
    public static void setServerMapImage(final ResourceLocation res) {
        final BufferedImage img = getImage(getInputStream(res));
        LOTRGenLayerWorld.imageWidth = img.getWidth();
        LOTRGenLayerWorld.imageHeight = img.getHeight();
        final int[] colors = img.getRGB(0, 0, LOTRGenLayerWorld.imageWidth, LOTRGenLayerWorld.imageHeight, null, 0, LOTRGenLayerWorld.imageWidth);
        final byte[] biomeImageData = new byte[LOTRGenLayerWorld.imageWidth * LOTRGenLayerWorld.imageHeight];
        for (int i = 0; i < colors.length; ++i) {
            final int color = colors[i];
            final Integer biomeID = LOTRDimension.MIDDLE_EARTH.colorsToBiomeIDs.get(color);
            if (biomeID != null) {
                biomeImageData[i] = (byte)(int)biomeID;
            }
        }
        ReflectionHelper.setPrivateValue((Class)LOTRGenLayerWorld.class, (Object)null, (Object)biomeImageData, new String[] { "biomeImageData" });
    }

    public static void setShieldTexture(LOTRShields shield, ResourceLocation resourceLocation) {
        try {
            Field privateField = LOTRShields.class.getDeclaredField("shieldTexture");
            privateField.setAccessible(true);
            privateField.set(shield, resourceLocation);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }
    
    static {
        DRCommander.lastBannerID = 52;
    }
}
