package drealm.entity;

import net.minecraft.world.World;

public class DREntityNazgulHorse extends DREntityRideableBeast {
    public DREntityNazgulHorse(World world) {
        super(world);
        setSize(1.4F, 1.6F);
    }

    @Override
    protected double getBaseHealth() {
        return 60.0D;
    }

    @Override
    protected double getBaseDamage() {
        return 9.0D;
    }

    @Override
    protected double getBaseSpeed() {
        return 0.34D;
    }
}
