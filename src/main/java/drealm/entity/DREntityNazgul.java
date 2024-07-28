package drealm.entity;

import drealm.database.DRRegistry;
import lotr.common.entity.animal.LOTREntityBird;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;

import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


public class DREntityNazgul extends LOTREntityBird {

    private EntityAIBase targetAI;
    private boolean prevCanTarget = true;
    public static float CREBAIN_SCALE = 1.8F;

    public DREntityNazgul(World world) {
        super(world);
        this.setSize(3,3 );

    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0);
    }

    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        return data;
    }

    protected void dropFewItems(final boolean p_70628_1_, final int p_70628_2_) {
        for (int j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_), k = 0; k < j; ++k) {
        }
        for (int j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_), k = 0; k < j; ++k) {
            if (this.isBurning()) {
            } else {
            }
        }
        // 15% chance to drop mumakilTusk
        if (this.rand.nextFloat() < 0.40) {
            this.dropItem(DRRegistry.fellbeastcrow, 1);
        }
    }

    protected float getSoundPitch() {
        return super.getSoundPitch() * -20.0F;
    }
}
