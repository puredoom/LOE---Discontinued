//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.structure;

import lotr.common.world.structure2.*;
import lotr.common.*;
import net.minecraft.world.*;
import lotr.common.entity.npc.*;
import drealm.entity.*;
import lotr.common.world.structure.*;
import drealm.database.*;

public class DRStructureRedMountainsSmithy extends LOTRWorldGenDwarfSmithy
{
    public DRStructureRedMountainsSmithy(final boolean flag) {
        super(flag);
        this.baseBrickBlock = LOTRMod.brick2;
        this.baseBrickMeta = 2;
        this.carvedBrickBlock = LOTRMod.brick2;
        this.carvedBrickMeta = 2;
        this.pillarBlock = LOTRMod.pillar;
        this.pillarMeta = 4;
        this.tableBlock = DRRegistry.redDwarvenTable;
        this.barsBlock = DRRegistry.redDwarfBars;
    }
    
    public LOTREntityDwarf createSmith(final World world) {
        return (LOTREntityDwarf)new DREntityRedDwarfSmith(world);
    }
    
    public LOTRChestContents getChestContents() {
        return DRChestContents.RED_MOUNTAINS_SMITHY;
    }
}
