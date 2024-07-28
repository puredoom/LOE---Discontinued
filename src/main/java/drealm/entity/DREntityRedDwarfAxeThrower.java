//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.entity;

import net.minecraft.world.*;
import drealm.database.*;
import net.minecraft.item.*;
import lotr.common.entity.projectile.*;
import net.minecraft.entity.ai.*;
import lotr.common.entity.ai.*;
import lotr.common.entity.npc.*;
import net.minecraft.entity.*;

public class DREntityRedDwarfAxeThrower extends DREntityRedDwarfWarrior
{
    public DREntityRedDwarfAxeThrower(final World world) {
        super(world);
    }
    
    public void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(DREntityRedDwarfAxeThrower.npcRangedAccuracy).setBaseValue(0.75);
    }
    
    public void attackEntityWithRangedAttack(final EntityLivingBase target, final float f) {
        ItemStack axeItem = this.npcItemsInv.getRangedWeapon();
        if (axeItem == null) {
            axeItem = new ItemStack(DRRegistry.throwingAxeRedDwarven);
        }
        final LOTREntityThrowingAxe axe = new LOTREntityThrowingAxe(this.worldObj, (EntityLivingBase)this, target, axeItem, 1.0f, (float)this.getEntityAttribute(DREntityRedDwarfAxeThrower.npcRangedAccuracy).getAttributeValue());
        this.playSound("random.bow", 1.0f, 1.0f / (this.rand.nextFloat() * 0.4f + 0.8f));
        this.worldObj.spawnEntityInWorld((Entity)axe);
        this.swingItem();
    }
    
    public EntityAIBase getDwarfAttackAI() {
        return (EntityAIBase)new LOTREntityAIRangedAttack((IRangedAttackMob)this, 1.25, 40, 12.0f);
    }
    
    public void onAttackModeChange(final LOTREntityNPC.AttackMode mode, final boolean mounted) {
        if (mode == LOTREntityNPC.AttackMode.IDLE) {
            this.setCurrentItemOrArmor(0, this.npcItemsInv.getIdleItem());
        }
        else {
            this.setCurrentItemOrArmor(0, this.npcItemsInv.getRangedWeapon());
        }
    }
    
    @Override
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        this.npcItemsInv.setRangedWeapon(new ItemStack(DRRegistry.throwingAxeRedDwarven));
        this.npcItemsInv.setIdleItem(this.npcItemsInv.getRangedWeapon());
        return data;
    }
}
