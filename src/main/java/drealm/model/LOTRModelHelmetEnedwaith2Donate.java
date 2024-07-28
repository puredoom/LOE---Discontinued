//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;

public class LOTRModelHelmetEnedwaith2Donate extends LOTRModelBiped
{
    public LOTRModelHelmetEnedwaith2Donate() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.bipedHead = new ModelRenderer((ModelBase)this)).setRotationPoint(0.0f, 0.0f, 0.0f);
        final ModelRenderer head_r1 = new ModelRenderer((ModelBase)this);
        head_r1.setRotationPoint(0.0f, -5.944f, -3.2743f);
        this.bipedHead.addChild(head_r1);
        this.setRotationAngle(head_r1, -0.0436f, 0.0f, 0.0f);
        head_r1.cubeList.add(new ModelBox(head_r1, 42, 55, -2.0f, -2.5f, -6.25f, 4, 4, 5, 0.0f));
        head_r1.cubeList.add(new ModelBox(head_r1, 0, 43, -5.0f, -3.5f, -2.25f, 10, 10, 11, 0.0f));
        final ModelRenderer head_r2 = new ModelRenderer((ModelBase)this);
        head_r2.mirror = true;
        head_r2.setRotationPoint(4.75f, -9.7766f, 0.6466f);
        this.bipedHead.addChild(head_r2);
        this.setRotationAngle(head_r2, -0.0439f, -0.2104f, 0.1839f);
        head_r2.cubeList.add(new ModelBox(head_r2, 0, 49, -2.0f, -1.25f, -1.0f, 3, 3, 2, 0.0f));
        final ModelRenderer head_r3 = new ModelRenderer((ModelBase)this);
        head_r3.setRotationPoint(-4.75f, -9.7766f, 0.6466f);
        this.bipedHead.addChild(head_r3);
        this.setRotationAngle(head_r3, -0.0439f, 0.2104f, -0.1839f);
        head_r3.cubeList.add(new ModelBox(head_r3, 0, 49, -1.0f, -1.25f, -1.0f, 3, 3, 2, 0.0f));
    }
    
    public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
