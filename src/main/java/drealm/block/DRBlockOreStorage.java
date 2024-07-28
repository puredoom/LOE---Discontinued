//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.block;

import lotr.common.block.*;
import net.minecraft.util.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.*;

public class DRBlockOreStorage extends LOTRBlockOreStorageBase
{
    public DRBlockOreStorage() {
        this.setOreStorageNames(new String[] { "", "redDwarfSteel" });
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int i, final int j) {
        return super.getIcon(i, j);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister iconregister) {
        super.registerBlockIcons(iconregister);
    }
}
