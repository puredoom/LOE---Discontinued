//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class HaradBody extends LOTRModelBiped {

    public HaradBody() {
        textureWidth = 64;
        textureHeight = 64;

        this.bipedBody = new ModelRenderer(this);
        this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 13, 24, 2.4F, -0.6F, -1.8F, 1, 1, 3, 0.0F));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 26, 22, 0.4F, -0.6F, 1.4F, 3, 1, 1, 0.0F));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 26, 22, -3.4F, -0.6F, 1.4F, 3, 1, 1, 0.0F));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 13, 24, -3.4F, -0.6F, -1.8F, 1, 1, 3, 0.0F));

        ModelRenderer cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedBody.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 9, 1.5F, 4.4F, 1.7F, 1, 1, 3, 0.0F));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 21, 2.1F, 0.4F, 1.7F, 1, 1, 3, 0.0F));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 21, -3.1F, 0.4F, 1.7F, 1, 1, 3, 0.0F));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 9, -2.5F, 4.4F, 1.7F, 1, 1, 3, 0.0F));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 16, -2.5F, 8.4F, 3.7F, 5, 1, 1, 0.0F));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 18, -2.5F, -0.6F, 4.1F, 5, 1, 1, 0.0F));

        ModelRenderer cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 10.5F, 1.9F);
        this.bipedBody.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 26, -4.5F, -23.5F, -0.2F, 1, 6, 0, 0.0F));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 26, 3.5F, -23.5F, -0.2F, 1, 6, 0, 0.0F));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 0, -3.5F, -23.5F, -0.2F, 7, 9, 0, 0.0F));

        ModelRenderer cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, 10.5F, 1.9F);
        this.bipedBody.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.2502F, 0.0779F, 0.2956F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 16, 0.3011F, -23.5849F, -0.5F, 1, 23, 1, 0.0F));
        cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 26, -1.2989F, -17.5849F, -0.5F, 2, 1, 1, 0.0F));

        ModelRenderer cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, 10.5F, 1.9F);
        this.bipedBody.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.258F, 0.045F, 0.1687F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 16, 0.4068F, -25.6106F, -0.5F, 1, 23, 1, 0.0F));
        cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 13, 0.7068F, -21.6106F, -0.5F, 3, 1, 1, 0.0F));

        ModelRenderer cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(2.0F, 1.5F, -1.9F);
        this.bipedBody.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.1745F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.0F, 0.6F, -1.0F, 1, 3, 1, 0.0F));
        cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 0, 0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F));

        ModelRenderer  cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(-2.0F, 1.5F, -1.9F);
        this.bipedBody.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, -0.1745F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 0, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F));
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, 0.6F, -1.0F, 1, 3, 1, 0.0F));

        ModelRenderer cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(0.0F, 10.5F, 1.9F);
        this.bipedBody.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.2502F, -0.0779F, -0.2956F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 26, -0.7011F, -17.5849F, -0.5F, 2, 1, 1, 0.0F));
        cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 16, -1.3011F, -23.5849F, -0.5F, 1, 23, 1, 0.0F));

        ModelRenderer  cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(0.0F, 10.5F, 1.9F);
        this.bipedBody.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.258F, -0.045F, -0.1687F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 13, -3.7068F, -21.6106F, -0.5F, 3, 1, 1, 0.0F));
        cube_r8.cubeList.add(new ModelBox(cube_r8, 4, 16, -1.4068F, -25.6106F, -0.5F, 1, 23, 1, 0.0F));

        ModelRenderer cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(-2.0F, 1.5F, -1.9F);
        this.bipedBody.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.3491F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 17, 28, -1.6F, 3.9F, -1.0F, 1, 1, 1, 0.0F));

        ModelRenderer cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(2.0F, 1.5F, -1.9F);
        this.bipedBody.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.5672F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 13, 28, 0.2F, 5.7F, -1.0F, 1, 1, 1, 0.0F));

        ModelRenderer cube_r11 = new ModelRenderer(this);
        cube_r11.setRotationPoint(-1.1F, -1.1F, -1.9F);
        this.bipedBody.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3491F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 27, -1.6F, 3.9F, -1.0F, 1, 1, 1, 0.0F));

        ModelRenderer cube_r12 = new ModelRenderer(this);
        cube_r12.setRotationPoint(-1.1F, -1.1F, -1.9F);
        this.bipedBody.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, -0.1745F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 16, -1.0F, 0.6F, -1.0F, 1, 3, 1, 0.0F));

        ModelRenderer cube_r13 = new ModelRenderer(this);
        cube_r13.setRotationPoint(-2.9F, -1.1F, -1.9F);
        this.bipedBody.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, -0.5672F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 27, -1.2F, 5.7F, -1.0F, 1, 1, 1, 0.0F));

        ModelRenderer cube_r14 = new ModelRenderer(this);
        cube_r14.setRotationPoint(1.1F, -1.1F, -1.9F);
        this.bipedBody.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.0F, 0.3491F);
        cube_r14.cubeList.add(new ModelBox(cube_r14, 20, 27, 0.6F, 3.9F, -1.0F, 1, 1, 1, 0.0F));

        ModelRenderer  cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(1.1F, -1.1F, -1.9F);
        this.bipedBody.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, 0.1745F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 16, 0.0F, 0.6F, -1.0F, 1, 3, 1, 0.0F));

        ModelRenderer cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-2.0F, 1.5F, -1.9F);
        this.bipedBody.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, -0.5672F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 13, 28, -1.2F, 5.7F, -1.0F, 1, 1, 1, 0.0F));

        ModelRenderer  cube_r17 = new ModelRenderer(this);
        cube_r17.setRotationPoint(2.9F, -1.1F, -1.9F);
        this.bipedBody.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, 0.5672F);
        cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 27, 0.2F, 5.7F, -1.0F, 1, 1, 1, 0.0F));

        ModelRenderer cube_r18 = new ModelRenderer(this);
        cube_r18.setRotationPoint(2.0F, 1.5F, -1.9F);
        this.bipedBody.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, 0.3491F);
        cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 28, 0.6F, 3.9F, -1.0F, 1, 1, 1, 0.0F));

        this.bipedRightArm = new ModelRenderer(this);
        this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 8, 16, -3.0F, -2.0F, -2.0F, 4, 4, 4, 0.25F));
        this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 26, 20, -3.3F, 2.0F, -2.3F, 4, 2, 0, 0.0F));
        this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 18, 25, -3.3F, 2.0F, 2.3F, 4, 2, 0, 0.0F));
        this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 8, 20, -3.3F, 2.0F, -1.95F, 0, 2, 4, 0.0F));

        this.bipedLeftArm = new ModelRenderer(this);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 8, 16, -1.0F, -2.0F, -2.0F, 4, 4, 4, 0.25F));
        this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 8, 20, 3.3F, 2.0F, -1.95F, 0, 2, 4, 0.0F));
        this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 26, 20, -0.7F, 2.0F, -2.3F, 4, 2, 0, 0.0F));
        this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 18, 25, -0.7F, 2.0F, 2.3F, 4, 2, 0, 0.0F));
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

