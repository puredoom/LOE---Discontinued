//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.entities;

import net.minecraft.util.StatCollector;

import java.util.HashMap;

public enum HwachaState
{
    NOT_LOADED(0, -1, StatCollector.translateToLocal("entity.catapult.reload")),
    RELOADING(1, 40, StatCollector.translateToLocal("entity.catapult.reloading")),
    LOADED(2, -1, StatCollector.translateToLocal("entity.catapult.loaded")),
    SHOOTING(3, 20, StatCollector.translateToLocal("entity.catapult.shooting"));

    private int id;
    private int duration;
    private String buttonName;
    private static final HashMap<Integer, HwachaState> BY_ID;

    private HwachaState(final int id, final int duration, final String buttonName) {
        this.id = id;
        this.duration = duration;
        this.buttonName = buttonName;
    }
    
    public int getID() {
        return this.id;
    }
    
    public int getDuration() {
        return this.duration;
    }
    
    public String getButtonName() {
        return this.buttonName;
    }
    
    public static HwachaState getByID(final int id) {
        return HwachaState.BY_ID.get(id);
    }
    
    static {
        BY_ID = new HashMap<Integer, HwachaState>();
        for (final HwachaState current : values()) {
            HwachaState.BY_ID.put(current.id, current);
        }
    }
}
