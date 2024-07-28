//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.entity;

import lotr.common.entity.npc.*;
import net.minecraft.world.*;
import lotr.common.item.*;
import drealm.item.*;

public class DREntityRedDwarfBannerBearer extends DREntityRedDwarfWarrior implements LOTRBannerBearer
{
    public DREntityRedDwarfBannerBearer(final World world) {
        super(world);
    }
    
    public LOTRItemBanner.BannerType getBannerType() {
        return DRItemBanner.RED_MOUNTAINS;
    }
}
