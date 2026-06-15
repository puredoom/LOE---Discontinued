package drealm.entity;

import drealm.database.DRRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class DREntityGraug extends DREntityRideableBeast {
    public DREntityGraug(World world) {
        super(world);
        setSize(1.6F, 2.8F);
    }

    @Override
    protected double getBaseHealth() {
        return 140.0D;
    }

    @Override
    protected double getBaseDamage() {
        return 16.0D;
    }

    @Override
    protected double getBaseSpeed() {
        return 0.22D;
    }

    @Override
    public double getMountedYOffset() {
        return height - 0.3D;
    }

    @Override
    protected void dropFewItems(boolean recentlyHit, int looting) {
        if (rand.nextFloat() < 0.25F + looting * 0.05F) {
            dropItem(DRRegistry.graugbone, 1);
        }
    }

    @Override
    protected int getExperiencePoints(EntityPlayer player) {
        return 12 + rand.nextInt(8);
    }
}
