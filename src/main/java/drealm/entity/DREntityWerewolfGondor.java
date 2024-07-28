package drealm.entity;


import drealm.database.DRRegistry;
import lotr.common.LOTRMod;
import lotr.common.entity.LOTREntities;
import lotr.common.entity.ai.LOTREntityAIAttackOnCollide;
import lotr.common.entity.npc.LOTREntityNPC;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.List;

public class DREntityWerewolfGondor extends EntityMob {
    private EntityAIBase targetAI;
    private boolean prevCanTarget = true;

    public DREntityWerewolfGondor(World world) {
        super(world);
        this.setSize(2.1F, 2.1F);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new LOTREntityAIAttackOnCollide(this, 1.5, false));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityLiving.class, 12.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(1, this.targetAI = new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, LOTREntityNPC.class, 400, true));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0);
    }

    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(20, 0);
    }

    public int getSnapTime() {
        return this.dataWatcher.getWatchableObjectInt(20);
    }

    public void setSnapTime(int i) {
        this.dataWatcher.updateObject(20, i);
    }

    public boolean isAIEnabled() {
        return true;
    }

    public boolean canBreatheUnderwater() {
        return true;
    }

    protected String getLivingSound() {
        return "lotr:bear.say";
    }

    protected String getHurtSound() {
        return "lotr:bear.hurt";
    }

    protected String getDeathSound() {
        return "lotr:bear.death";
    }

    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (!this.worldObj.isRemote && this.isInWater()) {
            this.motionY += 0.02;
        }

        if (!this.worldObj.isRemote && this.getAttackTarget() != null) {
            EntityLivingBase entity = this.getAttackTarget();
            if (!entity.isEntityAlive() || entity instanceof EntityPlayer && ((EntityPlayer)entity).capabilities.isCreativeMode) {
                this.setAttackTarget((EntityLivingBase)null);
            }
        }

        if (!this.worldObj.isRemote) {
            boolean canTarget = this.getBrightness(1.0F) < 0.5F;
            if (canTarget != this.prevCanTarget) {
                if (canTarget) {
                    this.targetTasks.addTask(1, this.targetAI);
                } else {
                    this.targetTasks.removeTask(this.targetAI);
                }
            }

            this.prevCanTarget = canTarget;
        }

        if (!this.worldObj.isRemote) {
            int i = this.getSnapTime();
            if (i > 0) {
                this.setSnapTime(i - 1);
            }
        }

        if (this.getAttackTarget() == null && this.worldObj.rand.nextInt(1000) == 0) {
            List list = this.worldObj.getEntitiesWithinAABB(EntityAnimal.class, this.boundingBox.expand(12.0, 6.0, 12.0));
            if (!list.isEmpty()) {
                EntityAnimal entityanimal = (EntityAnimal)list.get(this.rand.nextInt(list.size()));
                if (entityanimal.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.attackDamage) == null) {
                    this.setAttackTarget(entityanimal);
                }
            }
        }

    }

    protected Item getDropItem() {
        return Items.leather;
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
        if (this.rand.nextFloat() < 0.15) {
            this.dropItem(DRRegistry.greywerewolf, 1);
        }
    }

    public boolean attackEntityAsMob(Entity entity) {
        boolean flag = super.attackEntityAsMob(entity);
        if (flag) {
            if (!this.worldObj.isRemote) {
                this.setSnapTime(20);
            }

            this.worldObj.playSoundAtEntity(this, "lotr:bear.say", this.getSoundVolume(), this.getSoundPitch());
        }

        return flag;
    }


    public void moveEntityWithHeading(float f, float f1) {
        if (!this.worldObj.isRemote && this.isInWater() && this.getAttackTarget() != null) {
            this.moveFlying(f, f1, 0.1F);
        }

        super.moveEntityWithHeading(f, f1);
    }

    public ItemStack getPickedResult(MovingObjectPosition target) {
        return new ItemStack(LOTRMod.spawnEgg, 1, LOTREntities.getEntityID(this));
    }
}
