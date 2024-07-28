//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.util;

import java.lang.reflect.*;

public class DREntityLoader
{
    private static Class<?> entityClass;
    
    private static void setFinalStatic(final Field field, final Object newValue) throws Exception {
        field.setAccessible(true);
        final Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & 0xFFFFFFEF);
        field.set(null, newValue);
    }
    
    public static void applyEntityModifications() {
        try {
            final Method applyEntityAttributesMethod = DREntityLoader.entityClass.getDeclaredMethod("applyEntityAttributes", (Class<?>[])new Class[0]);
            applyEntityAttributesMethod.setAccessible(true);
            final Object mallornEntInstance = DREntityLoader.entityClass.newInstance();
            applyEntityAttributesMethod.invoke(mallornEntInstance, new Object[0]);
            final Field maxHealthField = DREntityLoader.entityClass.getDeclaredField("maxHealth");
            maxHealthField.setAccessible(true);
            final double newMaxHealthValue = (double)maxHealthField.get(mallornEntInstance) * 2.0;
            maxHealthField.set(mallornEntInstance, newMaxHealthValue);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static {
        try {
            final Class<?> entityClass = Class.forName("lotr.common.entity.npc.LOTREntityMallornEnt");
            final Method applyEntityAttributesMethod = entityClass.getDeclaredMethod("applyEntityAttributes", (Class<?>[])new Class[0]);
            applyEntityAttributesMethod.setAccessible(true);
            final Object mallornEntInstance = entityClass.newInstance();
            applyEntityAttributesMethod.invoke(mallornEntInstance, new Object[0]);
            final Field maxHealthField = entityClass.getDeclaredField("maxHealth");
            maxHealthField.setAccessible(true);
            final double newMaxHealthValue = (double)maxHealthField.get(mallornEntInstance) * 2.0;
            maxHealthField.set(mallornEntInstance, newMaxHealthValue);
            final Field followRangeField = entityClass.getDeclaredField("followRange");
            setFinalStatic(followRangeField, 64.0);
            final Field movementSpeedField = entityClass.getDeclaredField("movementSpeed");
            setFinalStatic(movementSpeedField, 0.4);
            final Field npcAttackDamageField = entityClass.getDeclaredField("npcAttackDamage");
            setFinalStatic(npcAttackDamageField, 12.0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
