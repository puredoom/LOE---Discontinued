//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.entity;

import net.minecraft.entity.ai.*;
import net.minecraft.world.*;
import net.minecraft.entity.projectile.*;
import lotr.common.entity.projectile.*;
import lotr.common.entity.ai.*;
import lotr.common.entity.npc.*;
import net.minecraft.entity.*;
import drealm.database.*;
import net.minecraft.item.*;
import lotr.common.*;

public class DREntityRedDwarfFireThrower extends DREntityRedDwarfWarrior
{
    public EntityAIBase rangedAttackAI;
    public EntityAIBase meleeAttackAI;
    
    public DREntityRedDwarfFireThrower(final World world) {
        super(world);
        this.rangedAttackAI = this.createRedRangedAI();
        this.spawnRidingHorse = false;
    }
    
    public void attackEntityWithRangedAttack(final EntityLivingBase target, final float f) {
        final EntityArrow template = new EntityArrow(this.worldObj, (EntityLivingBase)this, target, 1.0f, 0.5f);
        final LOTREntityFirePot pot = new LOTREntityFirePot(this.worldObj, (EntityLivingBase)this);
        pot.setLocationAndAngles(template.posX, template.posY, template.posZ, template.rotationYaw, template.rotationPitch);
        pot.motionX = template.motionX;
        pot.motionY = template.motionY;
        pot.motionZ = template.motionZ;
        this.playSound("random.bow", 1.0f, 1.0f / (this.rand.nextFloat() * 0.4f + 0.8f));
        this.worldObj.spawnEntityInWorld((Entity)pot);
    }
    
    public EntityAIBase createRedRangedAI() {
        return (EntityAIBase)new LOTREntityAIRangedAttack((IRangedAttackMob)this, 1.3, 20, 30, 16.0f);
    }
    
    public EntityAIBase getDwarfAttackAI() {
        return this.meleeAttackAI = super.getDwarfAttackAI();
    }
    
    public double getMeleeRange() {
        final EntityLivingBase target = this.getAttackTarget();
        if (target != null && target.isBurning()) {
            return Double.MAX_VALUE;
        }
        return super.getMeleeRange();
    }
    
    public void onAttackModeChange(final LOTREntityNPC.AttackMode mode, final boolean mounted) {
        if (mode == LOTREntityNPC.AttackMode.IDLE) {
            this.tasks.removeTask(this.meleeAttackAI);
            this.tasks.removeTask(this.rangedAttackAI);
            this.setCurrentItemOrArmor(0, this.npcItemsInv.getIdleItem());
        }
        if (mode == LOTREntityNPC.AttackMode.MELEE) {
            this.tasks.removeTask(this.meleeAttackAI);
            this.tasks.removeTask(this.rangedAttackAI);
            this.tasks.addTask(2, this.meleeAttackAI);
            this.setCurrentItemOrArmor(0, this.npcItemsInv.getMeleeWeapon());
        }
        if (mode == LOTREntityNPC.AttackMode.RANGED) {
            this.tasks.removeTask(this.meleeAttackAI);
            this.tasks.removeTask(this.rangedAttackAI);
            this.tasks.addTask(2, this.rangedAttackAI);
            this.setCurrentItemOrArmor(0, this.npcItemsInv.getRangedWeapon());
        }
    }
    
    @Override
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.swordRedDwarven));
        this.npcItemsInv.setRangedWeapon(new ItemStack(LOTRMod.rhunFirePot));
        this.npcItemsInv.setIdleItem(this.npcItemsInv.getRangedWeapon());
        return data;
    }
}
