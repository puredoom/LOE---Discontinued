package drealm.entity;


import java.util.Random;

import drealm.database.DRRegistry;
import lotr.common.LOTRAchievement;
import lotr.common.LOTRMod;
import lotr.common.block.LOTRBlockCorruptMallorn;
import lotr.common.entity.ai.LOTREntityAIAttackOnCollide;
import lotr.common.entity.ai.LOTREntityAIEntHealSapling;
import lotr.common.entity.npc.LOTREntityNPC;
import lotr.common.entity.npc.LOTREntityTree;
import lotr.common.entity.npc.LOTRNames;
import lotr.common.fac.LOTRFaction;
import lotr.common.item.LOTRItemEntDraught;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class DREntityEnt extends LOTREntityTree {
    private Random branchRand = new Random();
    public int eyesClosed;
    public ChunkCoordinates saplingHealTarget;
    public boolean canHealSapling = true;

    public DREntityEnt(World world) {
        super(world);
        this.setSize(1.4F, 4.6F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new LOTREntityAIAttackOnCollide(this, 2.0, false));
        this.tasks.addTask(2, new EntityAIWander(this, 1.0));
        this.tasks.addTask(3, new EntityAIWatchClosest2(this, EntityPlayer.class, 12.0F, 0.02F));
        this.tasks.addTask(3, new EntityAIWatchClosest2(this, LOTREntityNPC.class, 8.0F, 0.02F));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityLiving.class, 10.0F, 0.02F));
        this.tasks.addTask(5, new EntityAILookIdle(this));
        this.addTargetTasks(true);
    }

    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(18, (byte)0);
    }


    public void setupNPCName() {
        this.familyInfo.setName(LOTRNames.getEntName(this.rand));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(350.0);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(24.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2);
        this.getEntityAttribute(npcAttackDamage).setBaseValue(1.0);
    }

    public LOTRFaction getFaction() {
        return LOTRFaction.FANGORN;
    }

    public void setAttackTarget(EntityLivingBase target, boolean speak) {
        super.setAttackTarget(target, speak);
        if (this.getAttackTarget() == null) {
            this.canHealSapling = true;
        }

    }


    public void readEntityFromNBT(NBTTagCompound nbt) {
        super.readEntityFromNBT(nbt);
        if (nbt.hasKey("EntName")) {
            this.familyInfo.setName(nbt.getString("EntName"));
        }
    }

    public String getNPCName() {
        return this.familyInfo.getName();
    }

    public int getExtraHeadBranches() {
        long l = this.getUniqueID().getLeastSignificantBits();
        l ^= l * 365620672396L ^ l * 12784892284L;
        l = l * l * 18569660L + l * 6639092L;
        this.branchRand.setSeed(l);
        return this.branchRand.nextBoolean() ? 0 : MathHelper.getRandomIntegerInRange(this.branchRand, 2, 5);
    }

    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.worldObj.isRemote) {
            if (this.eyesClosed > 0) {
                --this.eyesClosed;
            } else if (this.rand.nextInt(400) == 0) {
                this.eyesClosed = 30;
            }
        }

    }

    public boolean attackEntityAsMob(Entity entity) {
        if (super.attackEntityAsMob(entity)) {
            float knockbackModifier = 1.5F;
            entity.addVelocity((double)(-MathHelper.sin(this.rotationYaw * 3.1415927F / 180.0F) * knockbackModifier * 0.5F), 0.15, (double)(MathHelper.cos(this.rotationYaw * 3.1415927F / 180.0F) * knockbackModifier * 0.5F));
            return true;
        } else {
            return false;
        }
    }

    public boolean attackEntityFrom(DamageSource damagesource, float f) {
        boolean flag = super.attackEntityFrom(damagesource, f);
        if (!this.worldObj.isRemote && flag) {
            if (this.getAttackTarget() != null) {
                this.canHealSapling = false;
            }
        }

        return flag;
    }

    public void onDeath(DamageSource damagesource) {
        super.onDeath(damagesource);
        if (!this.worldObj.isRemote && damagesource.getEntity() instanceof EntityPlayer && this.saplingHealTarget != null) {
            int i = this.saplingHealTarget.posX;
            int j = this.saplingHealTarget.posY;
            int k = this.saplingHealTarget.posZ;
            Block block = this.worldObj.getBlock(i, j, k);
            int meta = this.worldObj.getBlockMetadata(i, j, k);
            if (block == LOTRMod.corruptMallorn) {
                ++meta;
                if (meta >= LOTRBlockCorruptMallorn.ENT_KILLS) {
                    LOTRBlockCorruptMallorn.summonEntBoss(this.worldObj, i, j, k);
                } else {
                    this.worldObj.setBlockMetadataWithNotify(i, j, k, meta, 3);
                }
            }
        }

    }

    protected LOTRAchievement getKillAchievement() {
        return LOTRAchievement.killEnt;
    }

    public float getAlignmentBonus() {
        return 3.0F;
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
        if (this.rand.nextFloat() < 0.50) {
            this.dropItem(DRRegistry.entbark, 1);
        }
    }

    protected int getExperiencePoints(EntityPlayer entityplayer) {
        return 5 + this.rand.nextInt(6);
    }

    protected float getSoundVolume() {
        return 1.5F;
    }

    protected void func_145780_a(int i, int j, int k, Block block) {
        this.playSound("lotr:ent.step", 0.75F, this.getSoundPitch());
    }

    protected LOTRAchievement getTalkAchievement() {
        return LOTRAchievement.talkEnt;
    }

    public String getSpeechBank(EntityPlayer entityplayer) {
        return this.isFriendlyAndAligned(entityplayer) ? "ent/ent/friendly" : "ent/ent/hostile";
    }
}
