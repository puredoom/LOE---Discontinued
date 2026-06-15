package drealm.entity;

import lotr.common.entity.ai.LOTREntityAIAttackOnCollide;
import lotr.common.entity.animal.LOTREntityHorse;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.World;

public abstract class DREntityRideableBeast extends LOTREntityHorse {
    protected DREntityRideableBeast(World world) {
        super(world);
    }

    protected abstract double getBaseHealth();

    protected abstract double getBaseDamage();

    protected abstract double getBaseSpeed();

    @Override
    protected boolean isMountHostile() {
        return true;
    }

    @Override
    protected EntityAIBase createMountAttackAI() {
        return new LOTREntityAIAttackOnCollide(this, 1.5, true);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(getBaseHealth());
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(getBaseSpeed());
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(getBaseDamage());
    }

    @Override
    public boolean attackEntityAsMob(Entity entity) {
        return entity.attackEntityFrom(
                net.minecraft.util.DamageSource.causeMobDamage(this),
                (float) getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue());
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entity) {
        return null;
    }
}
