//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class HaradBoots extends LOTRModelBiped {

    public HaradBoots() {
        textureWidth = 32;
        textureHeight = 32;

        this.bipedRightLeg = new ModelRenderer(this);
        this.bipedRightLeg.setRotationPoint(-2.2F, 12.0F, 0.0F);
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.25F));
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 14, 13, -1.6F, 10.0F, -3.0F, 3, 2, 1, 0.25F));
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 7, 6, -1.1F, 11.0F, -4.0F, 2, 1, 1, 0.25F));
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 12, 0, -1.1F, 11.0F, -6.0F, 2, 1, 2, 0.0F));
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -0.6F, 11.0F, -7.0F, 1, 1, 1, 0.0F));
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 6, -1.2F, 8.0F, 1.2F, 2, 5, 3, -1.0F));
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 10, 6, -2.2F, 9.0F, 1.2F, 2, 4, 3, -1.0F));
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 7, 13, -0.2F, 9.0F, 1.2F, 2, 4, 3, -1.0F));

        this.bipedLeftLeg = new ModelRenderer(this);
        this.bipedLeftLeg.setRotationPoint(2.2F, 12.0F, 0.0F);
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -0.4F, 11.0F, -7.0F, 1, 1, 1, 0.0F));
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.25F));
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 14, 13, -1.4F, 10.0F, -3.0F, 3, 2, 1, 0.25F));
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 7, 6, -0.9F, 11.0F, -4.0F, 2, 1, 1, 0.25F));
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 12, 0, -0.9F, 11.0F, -6.0F, 2, 1, 2, 0.0F));
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 7, 13, -1.8F, 9.0F, 1.2F, 2, 4, 3, -1.0F));
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 6, -0.8F, 8.0F, 1.2F, 2, 5, 3, -1.0F));
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 10, 6, 0.2F, 9.0F, 1.2F, 2, 4, 3, -1.0F));
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