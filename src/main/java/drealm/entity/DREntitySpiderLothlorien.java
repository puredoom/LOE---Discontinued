package drealm.entity;


import drealm.database.DRRegistry;
import lotr.common.LOTRMod;
import lotr.common.entity.LOTREntities;
import lotr.common.entity.ai.LOTREntityAIAttackOnCollide;
import lotr.common.entity.npc.LOTREntityNPC;
import lotr.common.entity.npc.LOTREntitySpiderBase;
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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import lotr.common.LOTRAchievement;
import lotr.common.LOTRMod;
import lotr.common.fac.LOTRFaction;
import net.minecraft.world.World;

public class DREntitySpiderLothlorien extends LOTREntitySpiderBase {
    public DREntitySpiderLothlorien(World world) {
        super(world);
    }

    protected int getRandomSpiderScale() {
        return this.rand.nextInt(3);
    }

    protected int getRandomSpiderType() {
        return this.rand.nextBoolean() ? 0 : 1 + this.rand.nextInt(2);
    }

    public LOTRFaction getFaction() {
        return LOTRFaction.DOL_GULDUR;
    }

    public float getAlignmentBonus() {
        return 0.0F;
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
            this.dropItem(DRRegistry.spiderfang, 1);
        }
    }

    public boolean attackEntityAsMob(Entity entity) {
        if (super.attackEntityAsMob(entity)) {
            if (entity instanceof EntityLivingBase) {
                int difficulty = this.worldObj.difficultySetting.getDifficultyId();
                int duration = difficulty * (difficulty + 5) / 2;
                if (duration > 0) {
                        ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.poison.id, duration * 20, 0));
                }
            }
            return true;
        } else {
            return false;
        }
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(400.0);
    }

    protected boolean canRideSpider() {
        return false;
    }

    protected LOTRAchievement getKillAchievement() {
        return LOTRAchievement.killMirkwoodSpider;
    }
}
