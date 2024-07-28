//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.item;

import lotr.common.item.*;
import net.minecraft.item.*;
import drealm.util.*;
import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import drealm.model.*;
import cpw.mods.fml.relauncher.*;

public class DRItemArmor extends LOTRItemArmor
{

    public DRItemArmor(final LOTRMaterial material, final int slotType) {
        super(material, slotType);
    }
    
    public DRItemArmor(final LOTRMaterial material, final int slotType, final String textureSuffix) {
        super(material, slotType, textureSuffix);
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type) {
        StringBuilder texture = new StringBuilder("drealm:armor/").append(DRCommander.getArmorName(this));
        if (type != null) {
            texture.append("_").append(type);
        }
        return texture.append(".png").toString();
    }


}
