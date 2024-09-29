package com.timgodreuil.powermod.shared.entities;

import net.minecraft.util.StatCollector;

import java.util.HashMap;

public enum HwachaState
{
    // Changed localization keys to "hwacha" instead of "catapult"
    NOT_LOADED(0, -1, StatCollector.translateToLocal("entity.hwacha.reload")),
    RELOADING(1, 40, StatCollector.translateToLocal("entity.hwacha.reloading")),
    LOADED(2, -1, StatCollector.translateToLocal("entity.hwacha.loaded")),
    SHOOTING(3, 20, StatCollector.translateToLocal("entity.hwacha.shooting"));

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
        BY_ID = new HashMap<>();
        // Loop through HwachaState values and populate the map
        for (final HwachaState current : values()) {
            HwachaState.BY_ID.put(current.id, current);
        }
    }
}
