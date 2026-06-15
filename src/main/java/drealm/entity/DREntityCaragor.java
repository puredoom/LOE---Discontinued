package drealm.entity;

import drealm.database.DRRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class DREntityCaragor extends DREntityRideableBeast {
    public DREntityCaragor(World world) {
        super(world);
        setSize(1.6F, 1.8F);
    }

    @Override
    protected double getBaseHealth() {
        return 70.0D;
    }

    @Override
    protected double getBaseDamage() {
        return 10.0D;
    }

    @Override
    protected double getBaseSpeed() {
        return 0.32D;
    }

    @Override
    public double getMountedYOffset() {
        return height - 0.25D;
    }

    @Override
    protected void dropFewItems(boolean recentlyHit, int looting) {
        if (rand.nextFloat() < 0.25F + looting * 0.05F) {
            dropItem(DRRegistry.caragortooth, 1);
        }
    }

    @Override
    protected int getExperiencePoints(EntityPlayer player) {
        return 6 + rand.nextInt(5);
    }
}
