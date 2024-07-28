//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.entity;

import net.minecraft.world.*;
import net.minecraft.entity.*;
import drealm.database.*;
import net.minecraft.item.*;

public class DREntityRedDwarfWarrior extends DREntityRedDwarf
{
    public DREntityRedDwarfWarrior(final World world) {
        super(world);
        this.npcShield = DRShields.ALIGNMENT_RED_MOUNTAINS;
    }
    
    public float getAlignmentBonus() {
        return 2.0f;
    }
    
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        final int i = this.rand.nextInt(7);
        switch (i) {
            case 0: {
                this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.swordRedDwarven));
                break;
            }
            case 1:
            case 2: {
                this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.battleaxeRedDwarven));
                break;
            }
            case 3:
            case 4: {
                this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.hammerRedDwarven));
                break;
            }
            case 5: {
                this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.mattockRedDwarven));
                break;
            }
            case 6: {
                this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.pikeRedDwarven));
                break;
            }
        }
        if (this.rand.nextInt(6) == 0) {
            this.npcItemsInv.setSpearBackup(this.npcItemsInv.getMeleeWeapon());
            this.npcItemsInv.setMeleeWeapon(new ItemStack(DRRegistry.spearRedDwarven));
        }
        this.npcItemsInv.setIdleItem(this.npcItemsInv.getMeleeWeapon());
        this.setCurrentItemOrArmor(1, new ItemStack(DRRegistry.bootsRedDwarven));
        this.setCurrentItemOrArmor(2, new ItemStack(DRRegistry.legsRedDwarven));
        this.setCurrentItemOrArmor(3, new ItemStack(DRRegistry.bodyRedDwarven));
        if (this.rand.nextInt(10) != 0) {
            this.setCurrentItemOrArmor(4, new ItemStack(DRRegistry.helmetRedDwarven));
        }
        return data;
    }
}
