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

public class DREntityCaragor extends EntityAnimal implements LOTRAnimalSpawnConditions {
    private EntityAIBase attackAI = new LOTREntityAIAttackOnCollide((EntityCreature) this, 3.0, false);
    private EntityAIBase panicAI = new EntityAIPanic((EntityCreature) this, 1.5);
    private EntityAIBase targetNearAI = new EntityAINearestAttackableTarget((EntityCreature) this, EntityPlayer.class, 0, true);
    private int attackCooldown = 10;

    public DREntityCaragor(World world) {
        super(world);
        setSize(1.6f, 1.8f);
        getNavigator().setAvoidsWater(true);
        tasks.addTask(0, new EntityAISwimming(this));
        tasks.addTask(1, attackAI);  // Make attack AI the highest priority
        tasks.addTask(2, panicAI);
        tasks.addTask(3, new EntityAIMate(this, 1.0));
        tasks.addTask(4, new EntityAITempt(this, 1.4, Items.fish, false));
        tasks.addTask(5, new EntityAIFollowParent(this, 1.4));
        tasks.addTask(6, new EntityAIWander(this, 1.0));
        tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        tasks.addTask(8, new EntityAILookIdle(this));
        targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
        targetTasks.addTask(1, targetNearAI);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable entity) {
        return null;
    }

    public void entityInit() {
        super.entityInit();
        dataWatcher.addObject(18, (byte) 0);
        dataWatcher.addObject(20, (byte) 1); // Set initial state to hostile
    }

    public boolean isHostile() {
        return dataWatcher.getWatchableObjectByte(20) == 1;
    }

    public void setHostile(boolean flag) {
        dataWatcher.updateObject(20, (byte) (flag ? 1 : 0));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(600.0);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);  // Optionally increase movement speed
        getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0);  // Updated attack damage to 3.0 (1.5)
    }

    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        // Ensure the entity is hostile when it spawns
        setHostile(true);
        becomeAngryAtNearbyPlayers();
        return data;
    }

    public boolean isAIEnabled() {
        return true;
    }

    public void onLivingUpdate() {
        super.onLivingUpdate();

        // Decrement attack cooldown
        if (attackCooldown > 0) {
            attackCooldown--;
        }

        // Keep aggressive
        if (!worldObj.isRemote && getAttackTarget() == null) {
            becomeAngryAtNearbyPlayers();
        }
    }

    private void becomeAngryAtNearbyPlayers() {
        List<EntityPlayer> nearbyPlayers = worldObj.getEntitiesWithinAABB(EntityPlayer.class, boundingBox.expand(16.0, 16.0, 16.0));
        for (EntityPlayer player : nearbyPlayers) {
            if (player != null && !player.capabilities.isCreativeMode) {
                setAttackTarget(player);
            }
        }
    }

    protected void dropFewItems(final boolean recentlyHit, final int lootingLevel) {
        int dropCount = this.rand.nextInt(3) + this.rand.nextInt(1 + lootingLevel);
        for (int i = 0; i < dropCount; i++) {
            // Add item drops here if needed
        }

        // 25% chance to drop caragor tooth
        if (this.rand.nextFloat() < 0.25) {
            this.dropItem(DRRegistry.caragortooth, 1);
        }
    }

    protected int getExperiencePoints(EntityPlayer player) {
        return 2 + worldObj.rand.nextInt(3);
    }

    public boolean attackEntityAsMob(Entity entity) {
        if (attackCooldown == 0) {  // Check if attack cooldown is zero
            float damage = (float) getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
            attackCooldown = 10;  // Reset cooldown to 10 ticks (half a second)
            return entity.attackEntityFrom(DamageSource.causeMobDamage(this), damage);
        }
        return false;  // If cooldown is not zero, do not attack
    }

    public void becomeAngryAt(EntityLivingBase entity) {
        setAttackTarget(entity);
    }

    public boolean attackEntityFrom(DamageSource source, float amount) {
        Entity attacker;
        boolean flag = super.attackEntityFrom(source, amount);
        if (flag && (attacker = source.getEntity()) instanceof EntityLivingBase) {
            becomeAngryAt((EntityLivingBase) attacker);
        }
        return flag;
    }

    public void writeEntityToNBT(NBTTagCompound nbt) {
        super.writeEntityToNBT(nbt);
    }

    public void readEntityFromNBT(NBTTagCompound nbt) {
        super.readEntityFromNBT(nbt);
    }

    public boolean isBreedingItem(ItemStack itemstack) {
        return itemstack.getItem() == Items.fish;
    }

    public boolean interact(EntityPlayer player) {
        if (isHostile()) {
            return false;
        }
        return super.interact(player);
    }

    @Override
    public boolean canWorldGenSpawnAt(int x, int y, int z, LOTRBiome biome, LOTRBiomeVariant variant) {
        int trees = biome.decorator.getVariantTreesPerChunk(variant);
        return trees >= 1;
    }

    public boolean getCanSpawnHere() {
        WorldChunkManager worldChunkMgr = worldObj.getWorldChunkManager();
        if (worldChunkMgr instanceof LOTRWorldChunkManager) {
            int i = MathHelper.floor_double(posX);
            int j = MathHelper.floor_double(boundingBox.minY);
            int k = MathHelper.floor_double(posZ);
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
        return new ItemStack(LOTRMod.spawnEgg, 1, LOTREntities.getEntityID(this));
    }

    private static class BearGroupSpawnData implements IEntityLivingData {
        public int numSpawned;
    }
}
