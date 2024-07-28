//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.util;

public class DRModChecker
{
    public static int hasNEI;
    public static int hasGuiContainer;
    
    public static boolean hasGuiContainer() {
        if (DRModChecker.hasGuiContainer == -1) {
            try {
                Class.forName("net.minecraft.client.gui.inventory.GuiContainer");
                DRModChecker.hasGuiContainer = 1;
            }
            catch (ClassNotFoundException e) {
                DRModChecker.hasGuiContainer = 0;
            }
        }
        return DRModChecker.hasGuiContainer == 1;
    }
    
    public static boolean hasNEI() {
        if (DRModChecker.hasNEI == -1) {
            try {
                Class.forName("codechicken.nei.api.API");
                DRModChecker.hasNEI = 1;
            }
            catch (ClassNotFoundException e) {
                DRModChecker.hasNEI = 0;
            }
        }
        return DRModChecker.hasNEI == 1;
    }
    
    static {
        DRModChecker.hasNEI = -1;
        DRModChecker.hasGuiContainer = -1;
    }
}
