//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.block;

import lotr.common.block.*;
import lotr.common.*;
import net.minecraft.util.*;
import drealm.database.*;
import cpw.mods.fml.relauncher.*;

public class DRBlockWall extends LOTRBlockWallBase
{
    public DRBlockWall() {
        super(LOTRMod.brick, 1);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int i, final int j) {
        if (j == 0) {
            return DRRegistry.brick.getIcon(i, 0);
        }
        return super.getIcon(i, j);
    }
}
