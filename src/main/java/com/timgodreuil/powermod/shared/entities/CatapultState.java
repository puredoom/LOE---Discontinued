//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.shared.entities;

import java.util.*;
import net.minecraft.util.*;

public enum CatapultState
{
    NOT_LOADED(0, -1, StatCollector.translateToLocal("entity.catapult.reload")), 
    RELOADING(1, 40, StatCollector.translateToLocal("entity.catapult.reloading")), 
    LOADED(2, -1, StatCollector.translateToLocal("entity.catapult.loaded")), 
    SHOOTING(3, 20, StatCollector.translateToLocal("entity.catapult.shooting"));
    
    private int id;
    private int duration;
    private String buttonName;
    private static final HashMap<Integer, CatapultState> BY_ID;
    
    private CatapultState(final int id, final int duration, final String buttonName) {
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
    
    public static CatapultState getByID(final int id) {
        return CatapultState.BY_ID.get(id);
    }
    
    static {
        BY_ID = new HashMap<Integer, CatapultState>();
        for (final CatapultState current : values()) {
            CatapultState.BY_ID.put(current.id, current);
        }
    }
}
