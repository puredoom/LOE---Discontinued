//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.database;

import net.minecraft.item.*;
import net.minecraft.init.*;
import lotr.common.*;

public class DRFoods
{
    public static LOTRFoods RED_DWARF;
    
    static {
        DRFoods.RED_DWARF = new LOTRFoods(new ItemStack[] { new ItemStack(Items.cooked_porkchop), new ItemStack(Items.cooked_fished), new ItemStack(Items.cooked_chicken), new ItemStack(Items.cooked_beef), new ItemStack(LOTRMod.muttonCooked), new ItemStack(LOTRMod.gammon), new ItemStack(Items.bread) });
    }
}
