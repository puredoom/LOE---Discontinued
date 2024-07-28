//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import lotr.common.item.*;
import lotr.common.util.*;
import java.lang.reflect.*;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import drealm.util.*;

public class DRMaterial
{
    public static boolean setup;
    public static Constructor<LOTRMaterial> constructor;
    public static LOTRMaterial RED_DWARVEN;
    public static LOTRMaterial RED_DWARVEN14;
    public static LOTRMaterial LOTHLORIEN;
    public static LOTRMaterial GONDOR2;
    public static LOTRMaterial HOBBIT2;
    public static LOTRMaterial ROHAN2;
    public static LOTRMaterial DUNLAND2;
    public static LOTRMaterial HARAD2;
    public static LOTRMaterial TAURETHRIM2;

    public static LOTRMaterial ANGMAR2;
    public static LOTRMaterial DALE2;
    public static LOTRMaterial DOLGULDUR2;
    public static LOTRMaterial DORWINION2;
    public static LOTRMaterial DUNEDAIN2;
    public static LOTRMaterial DURIN2;
    public static LOTRMaterial GUNDABAD2;
    public static LOTRMaterial HIGHELF2;
    public static LOTRMaterial HOBBIT3;
    public static LOTRMaterial ISENGARD2;
    public static LOTRMaterial LOTHLORIEN2;
    public static LOTRMaterial MORDOR2;
    public static LOTRMaterial BLUEMOUNTAINS2;
    public static LOTRMaterial REDMOUNTAINS2;
    public static LOTRMaterial RHUN2;
    public static LOTRMaterial HALFTROLL2;

    public static LOTRMaterial WOODELF2;
    public static Method setUses;
    public static Method setDamage;
    public static Method setProtection;
    public static Method setSpeed;
    public static Method setHarvestLevel;
    public static Method setEnchantibility;
    public static Method setCraftingMaterial;
    public static Method setUndamageable;
    public static Method setManFlesh;
    
    public static LOTRMaterial editLOTRMaterial(final LOTRMaterial material, final int uses, final float damage, final float protection, final float speed, final int harvestLevel, final int enchantability, final Item craftingMaterialTool, final Item craftingMaterialArmor, final boolean manFlesh, final boolean undamageable) {
        setup();
        try {
            if (uses != -1) {
                DRMaterial.setUses.invoke(material, uses);
            }
            if (damage != -1.0f) {
                DRMaterial.setDamage.invoke(material, damage);
            }
            if (protection != -1.0f) {
                DRMaterial.setProtection.invoke(material, protection);
            }
            if (speed != -1.0f) {
                DRMaterial.setSpeed.invoke(material, speed);
            }
            if (harvestLevel != -1) {
                DRMaterial.setHarvestLevel.invoke(material, harvestLevel);
            }
            if (enchantability != -1) {
                DRMaterial.setEnchantibility.invoke(material, enchantability);
            }
            if (craftingMaterialTool != null && craftingMaterialArmor != null) {
                DRMaterial.setCraftingMaterial.invoke(material, craftingMaterialTool, craftingMaterialArmor);
            }
            if (undamageable) {
                DRMaterial.setUndamageable.invoke(material, new Object[0]);
            }
            if (manFlesh) {
                DRMaterial.setManFlesh.invoke(material, new Object[0]);
            }
        }
        catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex2) {
            final Exception ex = new Exception();
            final Exception e = ex;
            LOTRLog.logger.error("Failed to edit LOTRMaterial {}", new Object[] { material.toString(), e });
        }
        return material;
    }
    
    public static ItemArmor.ArmorMaterial getFullArmorMaterial(final EntityLivingBase entity) {
        ItemArmor.ArmorMaterial material = null;
        for (int i = 1; i <= 4; ++i) {
            final ItemStack item = entity.getEquipmentInSlot(i);
            if (item == null || !(item.getItem() instanceof ItemArmor)) {
                return null;
            }
            final ItemArmor.ArmorMaterial itemMaterial = ((ItemArmor)item.getItem()).getArmorMaterial();
            if (material != null && itemMaterial != material) {
                return null;
            }
            material = itemMaterial;
        }
        return material;
    }
    
    public static LOTRMaterial newLOTRMaterial(final String name, final int uses, final float damage, final float protection, final float speed, final int harvestLevel, final int enchantability, final Item craftingMaterial) {
        return newLOTRMaterial(name, uses, damage, protection, speed, harvestLevel, enchantability, craftingMaterial, false);
    }
    
    public static LOTRMaterial newLOTRMaterial(final String name, final int uses, final float damage, final float protection, final float speed, final int harvestLevel, final int enchantability, final Item craftingMaterial, final boolean manFlesh) {
        return newLOTRMaterial(name, uses, damage, protection, speed, harvestLevel, enchantability, craftingMaterial, craftingMaterial, manFlesh, false);
    }
    
    public static LOTRMaterial newLOTRMaterial(final String name, final int uses, final float damage, final float protection, final float speed, final int harvestLevel, final int enchantability, final Item craftingMaterialTool, final Item craftingMaterialArmor, final boolean manFlesh, final boolean undamageable) {
        setup();
        LOTRMaterial material = null;
        try {
            material = DRMaterial.constructor.newInstance(name);
        }
        catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException ex2) {
            final Exception ex = new Exception();
            final Exception e = ex;
            LOTRLog.logger.error("Failed to create LOTRMaterial {}", new Object[] { name, e });
        }
        return editLOTRMaterial(material, uses, damage, protection, speed, harvestLevel, enchantability, craftingMaterialTool, craftingMaterialArmor, manFlesh, undamageable);
    }
    
    public static void onInit() {
        DRCommander.setMaterialCraftingItem(DRMaterial.RED_DWARVEN, DRRegistry.redDwarfSteel);
        DRCommander.setMaterialCraftingItem(DRMaterial.RED_DWARVEN14, DRRegistry.redDwarfSteel);
    }
    
    public static void setup() {
        if (DRMaterial.setup) {
            return;
        }
        try {
            final Class<LOTRMaterial> clazz = LOTRMaterial.class;
            (DRMaterial.constructor = clazz.getDeclaredConstructor(String.class)).setAccessible(true);
            (DRMaterial.setUses = clazz.getDeclaredMethod("setUses", Integer.TYPE)).setAccessible(true);
            (DRMaterial.setDamage = clazz.getDeclaredMethod("setDamage", Float.TYPE)).setAccessible(true);
            (DRMaterial.setProtection = clazz.getDeclaredMethod("setProtection", Float.TYPE)).setAccessible(true);
            (DRMaterial.setSpeed = clazz.getDeclaredMethod("setSpeed", Float.TYPE)).setAccessible(true);
            (DRMaterial.setHarvestLevel = clazz.getDeclaredMethod("setHarvestLevel", Integer.TYPE)).setAccessible(true);
            (DRMaterial.setEnchantibility = clazz.getDeclaredMethod("setEnchantability", Integer.TYPE)).setAccessible(true);
            (DRMaterial.setCraftingMaterial = clazz.getDeclaredMethod("setCraftingItems", Item.class, Item.class)).setAccessible(true);
            (DRMaterial.setUndamageable = clazz.getDeclaredMethod("setUndamageable", (Class<?>[])new Class[0])).setAccessible(true);
            (DRMaterial.setManFlesh = clazz.getDeclaredMethod("setManFlesh", (Class<?>[])new Class[0])).setAccessible(true);
            DRMaterial.setup = true;
        }
        catch (NoSuchMethodException | SecurityException ex2) {
            final Exception ex = new Exception();
            final Exception e = ex;
            LOTRLog.logger.error("Failed to setup LOTRMaterials.", (Throwable)e);
        }
    }
    
    static {
        DRMaterial.RED_DWARVEN = newLOTRMaterial("RED_DWARVEN", 2000, 3.0f, 0.7f, 7.0f, 3, 12, DRRegistry.redDwarfSteel);
        DRMaterial.RED_DWARVEN14 = newLOTRMaterial("RED_DWARVEN14", 2000, 3.0f, 0.7f, 7.0f, 3, 12, null);
        DRMaterial.LOTHLORIEN = newLOTRMaterial("LOTHLORIEN", 2000, 3.0f, 0.925f, 7.0f, 3, 12, null);
        DRMaterial.GONDOR2 = newLOTRMaterial("GONDOR2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.HOBBIT2 = newLOTRMaterial("HOBBIT2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.ROHAN2 = newLOTRMaterial("ROHAN2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.DUNLAND2 = newLOTRMaterial("DUNLAND2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.WOODELF2 = newLOTRMaterial("WOODELF2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.HARAD2 = newLOTRMaterial("HARAD2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.TAURETHRIM2 = newLOTRMaterial("TAURETHRIM2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.ANGMAR2 = newLOTRMaterial("ANGMAR2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.DALE2 = newLOTRMaterial("DALE2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.DOLGULDUR2 = newLOTRMaterial("DOLGULDUR2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.DORWINION2 = newLOTRMaterial("DORWINION2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.DUNEDAIN2 = newLOTRMaterial("DUNEDAIN2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.DURIN2 = newLOTRMaterial("DURIN2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.GUNDABAD2 = newLOTRMaterial("GUNDABAD2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.HARAD2 = newLOTRMaterial("HARAD2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.HIGHELF2 = newLOTRMaterial("HIGHELF2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.HOBBIT3 = newLOTRMaterial("HOBBIT3", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.ISENGARD2 = newLOTRMaterial("ISENGARD2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.LOTHLORIEN2 = newLOTRMaterial("LOTHLORIEN2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.MORDOR2 = newLOTRMaterial("MORDOR2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.BLUEMOUNTAINS2 = newLOTRMaterial("BLUEMOUNTAINS2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.REDMOUNTAINS2 = newLOTRMaterial("REDMOUNTAINS2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);
        DRMaterial.RHUN2 = newLOTRMaterial("RHUN2", 2000, 3.0f, 1.0f, 0.925f, 3, 12, null);
        DRMaterial.HALFTROLL2 = newLOTRMaterial("HALFTROLL2", 2000, 3.0f, 0.925f, 0.925f, 3, 12, null);

    }
}
