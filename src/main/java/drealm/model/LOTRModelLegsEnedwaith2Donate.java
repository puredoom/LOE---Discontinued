//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;

public class LOTRModelLegsEnedwaith2Donate extends LOTRModelBiped
{
    public LOTRModelLegsEnedwaith2Donate() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.bipedBody = new ModelRenderer((ModelBase)this)).setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 16, 16, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.25f));
        this.bipedLeftLeg = new ModelRenderer((ModelBase)this);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.25f));
        final ModelRenderer rightLeg_r1 = new ModelRenderer((ModelBase)this);
        rightLeg_r1.setRotationPoint(0.0f, -1.0f, 0.0f);
        this.bipedLeftLeg.addChild(rightLeg_r1);
        this.setRotationAngle(rightLeg_r1, 0.0f, 0.0f, -0.0436f);
        rightLeg_r1.cubeList.add(new ModelBox(rightLeg_r1, 0, 0, -2.0f, 1.0f, -2.0f, 4, 12, 4, 0.7f));
        (this.bipedRightLeg = new ModelRenderer((ModelBase)this)).setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 16, -2.0f, 0.0f, -2.0f, 4, 12, 4, 0.25f));
        final ModelRenderer rightLeg_r2 = new ModelRenderer((ModelBase)this);
        rightLeg_r2.mirror = true;
        rightLeg_r2.setRotationPoint(0.0f, -1.0f, 0.0f);
        this.bipedRightLeg.addChild(rightLeg_r2);
        this.setRotationAngle(rightLeg_r2, 0.0f, 0.0f, 0.0436f);
        rightLeg_r2.cubeList.add(new ModelBox(rightLeg_r2, 0, 0, -2.0f, 1.0f, -2.0f, 4, 12, 4, 0.7f));
    }
    
    public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
