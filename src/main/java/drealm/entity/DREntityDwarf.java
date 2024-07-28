package drealm.entity;

import lotr.common.entity.npc.LOTREntityDwarf;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class DREntityDwarf extends LOTREntityDwarf {
    public DREntityDwarf(World world) {
        super(world);
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2);
    }
}
