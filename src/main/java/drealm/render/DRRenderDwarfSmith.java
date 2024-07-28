//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import net.minecraft.util.*;
import net.minecraft.entity.*;
import lotr.common.entity.npc.*;
import net.minecraft.client.model.*;

public class DRRenderDwarfSmith extends DRRenderDwarf
{
    public static ResourceLocation apronTexture;
    
    public int shouldRenderPass(final EntityLiving entity, final int pass, final float f) {
        final LOTREntityDwarf dwarf = (LOTREntityDwarf)entity;
        if (pass == 1 && dwarf.getEquipmentInSlot(3) == null) {
            this.setRenderPassModel((ModelBase)this.standardRenderPassModel);
            this.bindTexture(DRRenderDwarfSmith.apronTexture);
            return 1;
        }
        return super.shouldRenderPass(entity, pass, f);
    }
    
    static {
        DRRenderDwarfSmith.apronTexture = new ResourceLocation("lotr:mob/dwarf/blacksmith_apron.png");
    }
}
