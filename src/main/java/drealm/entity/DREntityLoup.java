package drealm.entity;


import drealm.database.DRRegistry;
import lotr.common.LOTRMod;
import lotr.common.entity.LOTREntities;
import lotr.common.entity.ai.LOTREntityAIAttackOnCollide;
import lotr.common.entity.animal.LOTRAnimalSpawnConditions;
import lotr.common.world.LOTRWorldChunkManager;
import lotr.common.world.biome.LOTRBiome;
import lotr.common.world.biome.variant.LOTRBiomeVariant;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.WorldChunkManager;

import java.util.List;

public class DREntityLoup
        extends EntityAnimal
        implements LOTRAnimalSpawnConditions {
    private EntityAIBase attackAI = new LOTREntityAIAttackOnCollide((EntityCreature) this, 1.7, false);
    private EntityAIBase panicAI = new EntityAIPanic((EntityCreature) this, 1.5);
    private EntityAIBase targetNearAI = new EntityAINearestAttackableTarget((EntityCreature) this, EntityPlayer.class, 0, true);
    private int hostileTick;
    private boolean prevIsChild = true;

    public DREntityLoup(World world) {
        super(world);
        setSize(1.6f, 1.8f);
        getNavigator().setAvoidsWater(true);
        tasks.addTask(0, (EntityAIBase) new EntityAISwimming((EntityLiving) this));
        tasks.addTask(2, panicAI);
        tasks.addTask(3, (EntityAIBase) new EntityAIMate((EntityAnimal) this, 1.0));
        tasks.addTask(4, (EntityAIBase) new EntityAITempt((EntityCreature) this, 1.4, Items.fish, false));
        tasks.addTask(5, (EntityAIBase) new EntityAIFollowParent((EntityAnimal) this, 1.4));
        tasks.addTask(6, (EntityAIBase) new EntityAIWander((EntityCreature) this, 1.0));
        tasks.addTask(7, (EntityAIBase) new EntityAIWatchClosest((EntityLiving) this, EntityPlayer.class, 8.0f));
        tasks.addTask(8, (EntityAIBase) new EntityAILookIdle((EntityLiving) this));
        targetTasks.addTask(0, (EntityAIBase) new EntityAIHurtByTarget((EntityCreature) this, false));
        targetTasks.addTask(1, targetNearAI);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable p_90011_1_) {
        return null;
    }

    public void entityInit() {
        super.entityInit();
        dataWatcher.addObject(18, (byte) 0);
        dataWatcher.addObject(20, (byte) 0);
    }


    public boolean isHostile() {
        return dataWatcher.getWatchableObjectByte(20) == 1;
    }

    public void setHostile(boolean flag) {
        dataWatcher.updateObject(20, (Object) (flag ? (byte) 1 : 0));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2);
        getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0);
    }

    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        return data;
    }

    public boolean isAIEnabled() {
        return true;
    }

    public void onLivingUpdate() {
        boolean isChild;
        EntityLivingBase entity;
        if (!worldObj.isRemote && (isChild = isChild()) != prevIsChild) {
            if (isChild) {
                tasks.removeTask(attackAI);
                tasks.addTask(2, panicAI);
                targetTasks.removeTask(targetNearAI);
            } else {
                tasks.removeTask(panicAI);
                if (hostileTick > 0) {
                    tasks.addTask(1, attackAI);
                    targetTasks.addTask(1, targetNearAI);
                } else {
                    tasks.removeTask(attackAI);
                    targetTasks.removeTask(targetNearAI);
                }
            }
        }
        super.onLivingUpdate();
        if (!worldObj.isRemote && getAttackTarget() != null && (!(entity = getAttackTarget()).isEntityAlive() || entity instanceof EntityPlayer && ((EntityPlayer) entity).capabilities.isCreativeMode)) {
            setAttackTarget(null);
        }
        if (!worldObj.isRemote) {
            if (hostileTick > 0 && getAttackTarget() == null) {
                --hostileTick;
            }
            setHostile(hostileTick > 0);
            if (isHostile()) {
                resetInLove();
            }
        }
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
        if (this.rand.nextFloat() < 0.25) {
            this.dropItem(DRRegistry.wolfear, 1);
        }
    }

    protected int getExperiencePoints(EntityPlayer entityplayer) {
        return 2 + worldObj.rand.nextInt(3);
    }

    public boolean attackEntityAsMob(Entity entity) {
        float f = (float) getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        return entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase) this), f);
    }


    public void becomeAngryAat(EntityLivingBase entity) {
        setAttackTarget(entity);
        hostileTick = 200;
    }

    public boolean attackEntityFrom(DamageSource damagesource, float f) {
        Entity attacker;
        boolean flag = super.attackEntityFrom(damagesource, f);
        if (flag && (attacker = damagesource.getEntity()) instanceof EntityLivingBase) {
            if (isChild()) {
                double range = 12.0;
                List list = worldObj.getEntitiesWithinAABBExcludingEntity((Entity) this, boundingBox.expand(range, range, range));
                for (Object obj : list) {
                    DREntityLoup bear;
                    Entity entity = (Entity) obj;
                    if (!(entity instanceof DREntityLoup) || (bear = (DREntityLoup) entity).isChild()) {
                        continue;
                    }
                    bear.becomeAngryAt((EntityLivingBase) attacker);
                }
            } else {
                becomeAngryAt((EntityLivingBase) attacker);
            }
        }
        return flag;
    }

    public void becomeAngryAt(EntityLivingBase entity) {
        setAttackTarget(entity);
        hostileTick = 200;
    }

    public void writeEntityToNBT(NBTTagCompound nbt) {
        super.writeEntityToNBT(nbt);
        nbt.setInteger("Angry", hostileTick);
    }

    public void readEntityFromNBT(NBTTagCompound nbt) {
        super.readEntityFromNBT(nbt);
        hostileTick = nbt.getInteger("Angry");
    }

    public boolean isBreedingItem(ItemStack itemstack) {
        return itemstack.getItem() == Items.fish;
    }

    public boolean interact(EntityPlayer entityplayer) {
        if (isHostile()) {
            return false;
        }
        return super.interact(entityplayer);
    }

    @Override
    public boolean canWorldGenSpawnAt(int i, int j, int k, LOTRBiome biome, LOTRBiomeVariant variant) {
        int trees = biome.decorator.getVariantTreesPerChunk(variant);
        return trees >= 1;
    }

    public boolean getCanSpawnHere() {
        WorldChunkManager worldChunkMgr = worldObj.getWorldChunkManager();
        if (worldChunkMgr instanceof LOTRWorldChunkManager) {
            int i = MathHelper.floor_double((double) posX);
            int j = MathHelper.floor_double((double) boundingBox.minY);
            int k = MathHelper.floor_double((double) posZ);
            LOTRBiome biome = (LOTRBiome) worldObj.getBiomeGenForCoords(i, k);
            LOTRBiomeVariant variant = ((LOTRWorldChunkManager) worldChunkMgr).getBiomeVariantAt(i, k);
            return super.getCanSpawnHere() && canWorldGenSpawnAt(i, j, k, biome, variant);
        }
        return super.getCanSpawnHere();
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

    public int getTalkInterval() {
        return 200;
    }

    public ItemStack getPickedResult(MovingObjectPosition target) {
        return new ItemStack(LOTRMod.spawnEgg, 1, LOTREntities.getEntityID((Entity) this));
    }








    private static class BearGroupSpawnData
            implements IEntityLivingData {
        public int numSpawned;

    }

}

