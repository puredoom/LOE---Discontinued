
package drealm.entity;

import lotr.common.entity.animal.*;
import lotr.common.world.biome.LOTRBiomeGenNearHarad;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraft.block.*;
import lotr.common.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.entity.*;
import java.util.*;
import lotr.common.item.*;
import lotr.common.entity.npc.*;
import lotr.common.*;
import net.minecraft.entity.passive.*;
import net.minecraft.util.*;
import net.minecraft.init.*;
import drealm.database.*;

public class DREntityMumakil extends LOTREntityHorse implements LOTRBiomeGenNearHarad.ImmuneToHeat
{
    public int sprintCounter;
    public int sitCounter;
    public ItemStack localstack;
    boolean hasPlatform;
    public int tailCounter;
    private byte tuskUses;
    private byte temper;
    private boolean prevIsChild;
    
    public DREntityMumakil(final World world) {
        super(world);
        this.prevIsChild = true;
        this.setSize(15.0f, 15.0f);
    }





    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(MathHelper.getRandomDoubleInRange(this.rand, 0.12, 0.15));
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1800.0);
    }

    
    public boolean isAIEnabled() {
        return true;
    }
    
    public final double getMountedYOffset() {
        double d = this.getBaseMountedYOffset() - 1;
        if (this.riddenByEntity != null) {
            d += this.riddenByEntity.yOffset - this.riddenByEntity.getYOffset();
        }
        return d;
    }


    
    
    protected double getBaseMountedYOffset() {
        return this.height * 1.11 - 0.2000000011920929;
    }
    
    public float getBlockPathWeight(final int i, final int j, final int k) {
        final Block block = this.worldObj.getBlock(i, j - 1, k);
        if (block == Blocks.grass) {
            return 10.0f;
        }
        return this.worldObj.getLightBrightness(i, j, k) - 0.5f;
    }

    @Override
    protected String getLivingSound() {
        return "drealm:mumakil.growl";
    }

    @Override
    protected String getHurtSound() {
        return "drealm:mumakil.growl";
    }

    @Override
    protected String getDeathSound() {
        return "drealm:mumakil.scream";
    }

    @Override
    protected String getAngrySoundName() {
        return "drealm:mumakil.scream";
    }

    
    public int getTalkInterval() {
        return 400;
    }
    
    protected float getSoundPitch() {
        return super.getSoundPitch() * 1.0f;
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        return new ItemStack(LOTRMod.spawnEgg, 1, LOTREntities.getEntityID((Entity)this));
    }
    
    public void onLivingUpdate() {
         super.onLivingUpdate();
        if (!this.worldObj.isRemote) {
            if (!this.worldObj.isRemote) {
                if (this.isMountSaddled() && this.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue() != 400.0) {
                    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(400.0);
                    this.setHealth(400.0f);
                }
                if (!this.isMountSaddled() && this.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue() != 1800.0) {
                    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1800.0);
                    this.setHealth(1800.0f);
                }
           if (this.riddenByEntity instanceof EntityLivingBase) {
                final EntityLivingBase rhinoRider = (EntityLivingBase)this.riddenByEntity;
                final float momentum = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
                if (momentum > 0.2f) {
                    this.setSprinting(true);
                }
                else {
                    this.setSprinting(false);
                }
               if (momentum >= 0.2) {
                  final float strength = momentum * 15.0f;
                    final Vec3 position = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
                   final Vec3 look = this.getLookVec();
                    final float sightWidth = 1.0f;
                    final double range = 0.5;
                   final List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.contract(1.0, 1.0, 1.0).addCoord(look.xCoord * 0.5, look.yCoord * 0.5, look.zCoord * 0.5).expand(1.0, 1.0, 1.0));
                     boolean hitAnyEntities = false;
                   for (final Object element : list) {
                       final Entity obj = (Entity)element;
                         final EntityLivingBase entity;
                       if (obj instanceof EntityLivingBase && (entity = (EntityLivingBase)obj) != rhinoRider && (!(rhinoRider instanceof EntityPlayer) || LOTRMod.canPlayerAttackEntity((EntityPlayer)rhinoRider, entity, false)) && (!(rhinoRider instanceof EntityCreature) || LOTRMod.canNPCAttackEntity((EntityCreature)rhinoRider, entity, false))) {
                            final boolean flag;
                            if (!(flag = entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), strength))) {
                               continue;
                          }
                           final float knockback = strength * 0.06f;
                           entity.addVelocity((double)(-MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f) * knockback), (double)knockback, (double)(MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f) * knockback));
                          hitAnyEntities = true;
                           if (!(entity instanceof EntityLiving)) {
                              continue;
                          }
                           final EntityLiving entityliving;
                          if ((entityliving = (EntityLiving)entity).getAttackTarget() != this) {
                             continue;
                           }
                          entityliving.getNavigator().clearPathEntity();
                         entityliving.setAttackTarget(rhinoRider);
                      }
                }
                     if (hitAnyEntities) {
                          this.worldObj.playSoundAtEntity((Entity)this, "lotr:troll.ologHai_hammer", 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                   }
               }
           }
          else if (this.getAttackTarget() != null) {
               final float momentum2 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
               if (momentum2 > 0.2f) {
                   this.setSprinting(true);
                }
               else {
                    this.setSprinting(false);
                  }
        }
              else {
                this.setSprinting(false);
            }
         }
       }
    }


    @Override
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        if (!this.worldObj.isRemote) {
            data = super.onSpawnWithEgg(data);
            this.onLOTRHorseSpawn();

            if (this.isMountSaddled()) {
                this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(400.0);
            } else {
                this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1800.0);
            }

            this.setHealth((float) this.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue());
            return data;
        } else {
            return data;
        }
    }



    public boolean isMountSaddled() {
        return this.isHorseSaddled();
    }

    public boolean getCanSpawnHere() {
        final int i = MathHelper.floor_double(this.posX);
        final int j = MathHelper.floor_double(this.boundingBox.minY);
        final int k = MathHelper.floor_double(this.posZ);
        return this.worldObj.getBlock(i, j - 1, k) == Blocks.sand && this.worldObj.getFullBlockLightValue(i, j, k) > 8;
    }
    
    public boolean isMountArmorValid(final ItemStack itemstack) {
        if (itemstack != null && itemstack.getItem() instanceof LOTRItemMountArmor) {
            final LOTRItemMountArmor armor = (LOTRItemMountArmor)itemstack.getItem();
            return armor.isValid((LOTRNPCMount)this);
        }
        return false;
    }
    
    public String getMountArmorTexture() {
        final ItemStack armor = this.getMountArmor();
        if (armor != null && armor.getItem() instanceof LOTRItemMountArmor) {
            return ((LOTRItemMountArmor)armor.getItem()).getArmorTexture();
        }
        return null;
    }
    
    public int getTotalArmorValue() {
        final ItemStack itemstack = LOTRReflection.getHorseInv((EntityHorse)this).getStackInSlot(1);
        if (itemstack != null && itemstack.getItem() instanceof LOTRItemMountArmor) {
            final LOTRItemMountArmor armor = (LOTRItemMountArmor)itemstack.getItem();
            return armor.getDamageReduceAmount();
        }
        return 0;
    }
    
    public boolean interact(final EntityPlayer entityplayer) {
        super.interact(entityplayer);
        if (!this.getMountable()) {
            return false;
        }
        if (this.isMountEnraged()) {
            return false;
        }
        if (this.getBelongsToNPC()) {
            if (this.riddenByEntity == null) {
                if (!this.worldObj.isRemote) {
                    entityplayer.addChatMessage((IChatComponent)new ChatComponentTranslation("chat.lotr.mountOwnedByNPC", new Object[0]));
                }
                return true;
            }
            return false;
        }
        else {
            final ItemStack itemstack = entityplayer.getHeldItem();
            if (itemstack != null && this.isBreedingItem(itemstack) && this.getGrowingAge() == 0 && !this.isInLove() && this.isTame()) {
                if (!entityplayer.capabilities.isCreativeMode) {
                    final ItemStack itemStack3;
                    final ItemStack itemStack4;
                    final ItemStack itemStack2 = itemStack4 = (itemStack3 = itemstack);
                    --itemStack4.stackSize;
                    if (itemstack.stackSize <= 0) {
                        entityplayer.inventory.setInventorySlotContents(entityplayer.inventory.currentItem, (ItemStack)null);
                    }
                }
                this.func_146082_f(entityplayer);
                return true;
            }
            final boolean prevInLove = this.isInLove();
            final boolean flag = super.interact(entityplayer);
            if (this.isInLove() && !prevInLove) {
                this.resetInLove();
            }
            return flag;
        }
    }

    protected void dropFewItems(final boolean p_70628_1_, final int p_70628_2_) {
        for (int j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_), k = 0; k < j; ++k) {
            this.dropItem(Items.leather, 5);
        }
        for (int j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_), k = 0; k < j; ++k) {
            if (this.isBurning()) {
                this.dropItem(Items.cooked_beef, 3);
            } else {
                this.dropItem(Items.beef, 3);
            }
        }
        // 15% chance to drop mumakilTusk
        if (this.rand.nextFloat() < 0.50) {
            this.dropItem(DRRegistry.mumakilTusk, 1);
        }
    }
}
