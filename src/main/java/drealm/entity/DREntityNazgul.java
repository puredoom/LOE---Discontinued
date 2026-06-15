package drealm.entity;

import drealm.database.DRRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class DREntityNazgul extends DREntityRideableBeast {
    public DREntityNazgul(World world) {
        super(world);
        setSize(2.2F, 2.2F);
    }

    @Override
    protected double getBaseHealth() {
        return 100.0D;
    }

    @Override
    protected double getBaseDamage() {
        return 14.0D;
    }

    @Override
    protected double getBaseSpeed() {
        return 0.28D;
    }

    @Override
    public double getMountedYOffset() {
        return height - 0.4D;
    }

    @Override
    public void moveEntityWithHeading(float strafe, float forward) {
        super.moveEntityWithHeading(strafe, forward);
        if (riddenByEntity instanceof EntityPlayer && isMountSaddled()) {
            EntityPlayer rider = (EntityPlayer) riddenByEntity;
            motionY = -MathHelper.sin(rider.rotationPitch * (float) Math.PI / 180.0F) * 0.35D;
            fallDistance = 0.0F;
        }
    }

    @Override
    public void fall(float distance) {
    }

    @Override
    protected void dropFewItems(boolean recentlyHit, int looting) {
        if (rand.nextFloat() < 0.25F + looting * 0.05F) {
            dropItem(DRRegistry.batwing, 1);
        }
    }

    @Override
    protected int getExperiencePoints(EntityPlayer player) {
        return 10 + rand.nextInt(6);
    }
}
