package lotr.common.entity.npc;


import lotr.common.LOTRAchievement;
import lotr.common.LOTRFoods;
import lotr.common.LOTRMod;
import lotr.common.entity.ai.LOTREntityAIAttackOnCollide;
import lotr.common.entity.ai.LOTREntityAIDrink;
import lotr.common.entity.ai.LOTREntityAIEat;
import lotr.common.entity.ai.LOTREntityAIFollowHiringPlayer;
import lotr.common.entity.ai.LOTREntityAIHiredRemainStill;
import lotr.common.entity.ai.LOTREntityAINPCAvoidEvilPlayer;
import lotr.common.entity.ai.LOTREntityAINPCFollowParent;
import lotr.common.entity.ai.LOTREntityAINPCFollowSpouse;
import lotr.common.entity.ai.LOTREntityAINPCMarry;
import lotr.common.entity.ai.LOTREntityAINPCMate;
import lotr.common.entity.npc.LOTREntityNPC.AttackMode;
import lotr.common.fac.LOTRFaction;
import lotr.common.quest.LOTRMiniQuest;
import lotr.common.quest.LOTRMiniQuestFactory;
import lotr.common.world.biome.LOTRBiomeGenBlueMountains;
import lotr.common.world.biome.LOTRBiomeGenErebor;
import lotr.common.world.biome.LOTRBiomeGenIronHills;
import lotr.common.world.biome.LOTRBiomeGenRedMountains;
import lotr.common.world.structure.LOTRChestContents;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class LOTREntityDwarf extends LOTREntityNPC {
    public LOTREntityDwarf(World world) {
        super(world);
        this.setSize(0.5F, 1.5F);
        this.getNavigator().setAvoidsWater(true);
        this.getNavigator().setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new LOTREntityAIHiredRemainStill(this));
        this.tasks.addTask(2, new LOTREntityAINPCAvoidEvilPlayer(this, 8.0F, 1.5, 1.8));
        this.tasks.addTask(3, this.getDwarfAttackAI());
        this.tasks.addTask(4, new LOTREntityAIFollowHiringPlayer(this));
        this.tasks.addTask(5, new LOTREntityAINPCMarry(this, 1.3));
        this.tasks.addTask(6, new LOTREntityAINPCMate(this, 1.3));
        this.tasks.addTask(7, new LOTREntityAINPCFollowParent(this, 1.4));
        this.tasks.addTask(8, new LOTREntityAINPCFollowSpouse(this, 1.1));
        this.tasks.addTask(9, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(10, new EntityAIWander(this, 1.0));
        this.tasks.addTask(11, new LOTREntityAIEat(this, this.getDwarfFoods(), 6000));
        this.tasks.addTask(11, new LOTREntityAIDrink(this, LOTRFoods.DWARF_DRINK, 6000));
        this.tasks.addTask(12, new EntityAIWatchClosest2(this, EntityPlayer.class, 8.0F, 0.02F));
        this.tasks.addTask(12, new EntityAIWatchClosest2(this, LOTREntityNPC.class, 5.0F, 0.02F));
        this.tasks.addTask(13, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F, 0.02F));
        this.tasks.addTask(14, new EntityAILookIdle(this));
        this.addTargetTasks(true);
        this.familyInfo.marriageEntityClass = LOTREntityDwarf.class;
        this.familyInfo.marriageRing = LOTRMod.dwarvenRing;
        this.familyInfo.marriageAlignmentRequired = 200.0F;
        this.familyInfo.marriageAchievement = LOTRAchievement.marryDwarf;
        this.familyInfo.potentialMaxChildren = 3;
        this.familyInfo.timeToMature = 72000;
        this.familyInfo.breedingDelay = 48000;
    }

    protected EntityAIBase getDwarfAttackAI() {
        return new LOTREntityAIAttackOnCollide(this, 1.4, false);
    }

    protected LOTRFoods getDwarfFoods() {
        return LOTRFoods.DWARF;
    }

    public void setupNPCGender() {
        this.familyInfo.setMale(true);
    }

    public void setupNPCName() {
        this.familyInfo.setName(LOTRNames.getDwarfName(this.rand, this.familyInfo.isMale()));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2);
    }

    public IEntityLivingData initCreatureForHire(IEntityLivingData data) {
        data = super.initCreatureForHire(data);
        data = this.onSpawnWithEgg(data);
        if (this.getClass() == this.familyInfo.marriageEntityClass && this.rand.nextInt(3) == 0) {
            this.familyInfo.setMale(false);
            this.setupNPCName();
        }

        return data;
    }

    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        this.npcItemsInv.setMeleeWeapon(new ItemStack(LOTRMod.daggerDwarven));
        this.npcItemsInv.setIdleItem((ItemStack)null);
        return data;
    }

    public LOTRFaction getFaction() {
        return LOTRFaction.DURINS_FOLK;
    }

    public String getNPCName() {
        return this.familyInfo.getName();
    }

    public void readEntityFromNBT(NBTTagCompound nbt) {
        super.readEntityFromNBT(nbt);
        if (nbt.hasKey("DwarfName")) {
            this.familyInfo.setName(nbt.getString("DwarfName"));
        }

    }

    public void createNPCChildName(LOTREntityNPC maleParent, LOTREntityNPC femaleParent) {
        this.familyInfo.setName(LOTRNames.getDwarfChildNameForParent(this.rand, this.familyInfo.isMale(), (LOTREntityDwarf)maleParent));
    }

    public boolean interact(EntityPlayer entityplayer) {
        return this.familyInfo.interact(entityplayer) ? true : super.interact(entityplayer);
    }

    public void onAttackModeChange(LOTREntityNPC.AttackMode mode, boolean mounted) {
        if (mode == AttackMode.IDLE) {
            this.setCurrentItemOrArmor(0, this.npcItemsInv.getIdleItem());
        } else {
            this.setCurrentItemOrArmor(0, this.npcItemsInv.getMeleeWeapon());
        }

    }

    protected LOTRAchievement getKillAchievement() {
        return LOTRAchievement.killDwarf;
    }

    public float getAlignmentBonus() {
        return 1.0F;
    }

    protected void dropFewItems(boolean flag, int i) {
        super.dropFewItems(flag, i);
        int bones = this.rand.nextInt(2) + this.rand.nextInt(i + 1);

        int rareDropChance;
        for(rareDropChance = 0; rareDropChance < bones; ++rareDropChance) {
            this.dropItem(LOTRMod.dwarfBone, 1);
        }

        if (this.rand.nextInt(4) == 0) {
            this.dropChestContents(this.getLarderDrops(), 1, 2 + i);
        }

        if (this.rand.nextInt(8) == 0) {
            this.dropChestContents(this.getGenericDrops(), 1, 2 + i);
        }

        if (flag) {
            rareDropChance = 20 - i * 4;
            rareDropChance = Math.max(rareDropChance, 1);
            int mithrilBookChance;
            if (this.rand.nextInt(rareDropChance) == 0) {
                mithrilBookChance = this.rand.nextInt(4);
                switch (mithrilBookChance) {
                    case 0:
                        this.entityDropItem(new ItemStack(Items.iron_ingot), 0.0F);
                        break;
                    case 1:
                        this.entityDropItem(new ItemStack(this.getDwarfSteelDrop()), 0.0F);
                        break;
                    case 2:
                        this.entityDropItem(new ItemStack(Items.gold_nugget, 1 + this.rand.nextInt(3)), 0.0F);
                        break;
                    case 3:
                        this.entityDropItem(new ItemStack(LOTRMod.silverNugget, 1 + this.rand.nextInt(3)), 0.0F);
                }
            }

            mithrilBookChance = 40 - i * 5;
            mithrilBookChance = Math.max(mithrilBookChance, 1);
            if (this.rand.nextInt(mithrilBookChance) == 0) {
                this.entityDropItem(new ItemStack(LOTRMod.mithrilBook), 0.0F);
            }
        }

    }

    protected Item getDwarfSteelDrop() {
        return LOTRMod.dwarfSteel;
    }

    protected LOTRChestContents getLarderDrops() {
        return LOTRChestContents.DWARF_HOUSE_LARDER;
    }

    protected LOTRChestContents getGenericDrops() {
        return LOTRChestContents.DWARVEN_TOWER;
    }

    public boolean getCanSpawnHere() {
        if (super.getCanSpawnHere()) {
            return this.liftSpawnRestrictions ? true : this.canDwarfSpawnHere();
        } else {
            return false;
        }
    }

    protected boolean canDwarfSpawnHere() {
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.boundingBox.minY);
        int k = MathHelper.floor_double(this.posZ);
        if (this.rand.nextInt(200) == 0) {
            return this.canDwarfSpawnAboveGround();
        } else {
            return j < 60 && this.worldObj.getBlock(i, j - 1, k).getMaterial() == Material.rock && !this.worldObj.canBlockSeeTheSky(i, j, k) && this.worldObj.getSavedLightValue(EnumSkyBlock.Block, i, j, k) >= 10;
        }
    }

    protected boolean canDwarfSpawnAboveGround() {
        return true;
    }

    public float getBlockPathWeight(int i, int j, int k) {
        float f = 0.0F;
        BiomeGenBase biome = this.worldObj.getBiomeGenForCoords(i, k);
        if (biome instanceof LOTRBiomeGenIronHills || biome instanceof LOTRBiomeGenErebor || biome instanceof LOTRBiomeGenBlueMountains || biome instanceof LOTRBiomeGenRedMountains) {
            f += 20.0F;
        }

        return f;
    }

    public int getMaxSpawnedInChunk() {
        return 6;
    }

    protected float getSoundPitch() {
        float f = super.getSoundPitch();
        if (!this.familyInfo.isMale()) {
            f *= 1.4F;
        }

        return f;
    }

    public String getHurtSound() {
        return "lotr:dwarf.hurt";
    }

    public String getDeathSound() {
        return "lotr:dwarf.hurt";
    }

    public String getAttackSound() {
        return "lotr:dwarf.attack";
    }

    public void onKillEntity(EntityLivingBase entity) {
        super.onKillEntity(entity);
        this.playSound("lotr:dwarf.kill", this.getSoundVolume(), this.getSoundPitch());
    }

    protected LOTRAchievement getTalkAchievement() {
        return !this.familyInfo.isMale() ? LOTRAchievement.talkDwarfWoman : super.getTalkAchievement();
    }

    public String getSpeechBank(EntityPlayer entityplayer) {
        if (this.isFriendlyAndAligned(entityplayer)) {
            if (this.hiredNPCInfo.getHiringPlayer() == entityplayer) {
                return "dwarf/dwarf/hired";
            } else {
                return this.isChild() ? "dwarf/child/friendly" : "dwarf/dwarf/friendly";
            }
        } else {
            return this.isChild() ? "dwarf/child/hostile" : "dwarf/dwarf/hostile";
        }
    }

    public LOTRMiniQuest createMiniQuest() {
        return LOTRMiniQuestFactory.DURIN.createQuest(this);
    }

    public LOTRMiniQuestFactory getBountyHelpSpeechDir() {
        return LOTRMiniQuestFactory.DURIN;
    }

    public void onArtificalSpawn() {
        if (this.getClass() == this.familyInfo.marriageEntityClass) {
            if (this.rand.nextInt(3) == 0) {
                this.familyInfo.setMale(false);
                this.setupNPCName();
            }

            if (this.rand.nextInt(20) == 0) {
                this.familyInfo.setChild();
            }
        }

    }
}
