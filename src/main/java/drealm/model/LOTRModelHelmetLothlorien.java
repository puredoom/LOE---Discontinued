//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;

public class LOTRModelHelmetLothlorien extends LOTRModelBiped
{
    public LOTRModelHelmetLothlorien() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.bipedHead = new ModelRenderer((ModelBase)this)).setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 16, -4.0f, -8.0f, -4.0f, 8, 8, 8, 0.75f));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.0f, -8.0f, -4.0f, 8, 8, 8, 1.0f));
    }
    
    public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
