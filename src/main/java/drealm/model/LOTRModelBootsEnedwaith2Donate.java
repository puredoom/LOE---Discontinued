//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;

public class LOTRModelBootsEnedwaith2Donate extends LOTRModelBiped
{
    public LOTRModelBootsEnedwaith2Donate() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.bipedRightLeg = new ModelRenderer((ModelBase)this)).setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.5f));
        this.bipedLeftLeg = new ModelRenderer((ModelBase)this);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.5f));
    }
    
    public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
