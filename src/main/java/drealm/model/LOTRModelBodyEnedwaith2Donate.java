//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class LOTRModelBodyEnedwaith2Donate extends LOTRModelBiped
{
    private final ModelRenderer cape;
    
    public LOTRModelBodyEnedwaith2Donate() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.bipedBody = new ModelRenderer((ModelBase)this)).setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 16, 16, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.5f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 16, 0, -4.0f, 0.0f, -2.0f, 8, 12, 4, 0.8f));
        final ModelRenderer body_r1 = new ModelRenderer((ModelBase)this);
        body_r1.setRotationPoint(0.0f, 5.0f, -3.0f);
        this.bipedBody.addChild(body_r1);
        this.setRotationAngle(body_r1, 0.0f, 0.0f, 0.2182f);
        body_r1.cubeList.add(new ModelBox(body_r1, 0, 32, -1.25f, -1.75f, -0.5f, 3, 4, 1, 0.0f));
        final ModelRenderer body_r2 = new ModelRenderer((ModelBase)this);
        body_r2.setRotationPoint(3.338f, 6.0525f, -3.0f);
        this.bipedBody.addChild(body_r2);
        this.setRotationAngle(body_r2, 0.0117f, -0.2615f, 0.1294f);
        body_r2.cubeList.add(new ModelBox(body_r2, 0, 32, -1.3f, -2.2f, -0.1f, 3, 4, 1, 0.0f));
        final ModelRenderer body_r3 = new ModelRenderer((ModelBase)this);
        body_r3.setRotationPoint(-2.7389f, 4.6489f, -3.0f);
        this.bipedBody.addChild(body_r3);
        this.setRotationAngle(body_r3, 0.0f, 0.2618f, 0.3927f);
        body_r3.cubeList.add(new ModelBox(body_r3, 0, 32, -1.95f, -2.25f, -0.25f, 3, 4, 1, 0.0f));
        (this.cape = new ModelRenderer((ModelBase)this)).setRotationPoint(0.0f, 0.0f, 3.25f);
        this.bipedBody.addChild(this.cape);
        (this.bipedRightArm = new ModelRenderer((ModelBase)this)).setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 40, 16, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.49f));
        this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 0, -3.0f, -2.0f, -2.0f, 4, 12, 4, 0.79f));
        final ModelRenderer rightArm_r1 = new ModelRenderer((ModelBase)this);
        this.bipedLeftArm.mirror = true;
        rightArm_r1.setRotationPoint(-1.0f, -0.5f, 0.0f);
        this.bipedRightArm.addChild(rightArm_r1);
        this.setRotationAngle(rightArm_r1, 0.0f, 0.0f, -0.1309f);
        rightArm_r1.cubeList.add(new ModelBox(rightArm_r1, 40, 0, -3.25f, -2.5f, -3.0f, 6, 5, 6, -0.15f));
        rightArm_r1.cubeList.add(new ModelBox(rightArm_r1, 40, 32, -3.25f, -2.5f, -3.0f, 6, 5, 6, 0.1f));
        this.bipedLeftArm = new ModelRenderer((ModelBase)this);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 40, 16, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.49f));
        this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 0, -1.0f, -2.0f, -2.0f, 4, 12, 4, 0.79f));
        final ModelRenderer rightArm_r2 = new ModelRenderer((ModelBase)this);
        rightArm_r2.setRotationPoint(1.0f, -0.5f, 0.0f);
        this.bipedLeftArm.addChild(rightArm_r2);
        this.setRotationAngle(rightArm_r2, 0.0f, 0.0f, 0.1309f);
        rightArm_r2.cubeList.add(new ModelBox(rightArm_r2, 40, 32, -2.75f, -2.5f, -3.0f, 6, 5, 6, 0.1f));
        rightArm_r2.cubeList.add(new ModelBox(rightArm_r2, 40, 0, -2.75f, -2.5f, -3.0f, 6, 5, 6, -0.15f));
    }
    
    public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}
