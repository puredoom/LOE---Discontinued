//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class TaurethrimBody extends LOTRModelBiped
{
    public TaurethrimBody() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        (this.bipedBody = new ModelRenderer((ModelBase)this)).setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 38, 24, -9.0f, 0.0f, -3.0f, 9, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 19, 39, 4.0f, -1.0f, 1.0f, 5, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 38, 32, 4.0f, -1.0f, 0.0f, 6, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 38, 28, 4.0f, -1.0f, -1.0f, 7, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 38, 38, 4.0f, -1.0f, -2.0f, 5, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 38, 36, -9.0f, -1.0f, 1.0f, 5, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 38, 30, -10.0f, -1.0f, 0.0f, 6, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 38, 26, -11.0f, -1.0f, -1.0f, 7, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 38, 34, -9.0f, -1.0f, -2.0f, 5, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 4, 0.0f, 0.0f, 2.0f, 9, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 2, -9.0f, 0.0f, 2.0f, 9, 1, 1, 0.0f));
        this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, 0.0f, 0.0f, -3.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r1 = new ModelRenderer((ModelBase)this);
        Body_r1.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r1);
        this.setRotationAngle(Body_r1, 0.0f, 0.0f, 0.2618f);
        Body_r1.cubeList.add(new ModelBox(Body_r1, 0, 6, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r1.cubeList.add(new ModelBox(Body_r1, 19, 27, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r2 = new ModelRenderer((ModelBase)this);
        Body_r2.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r2);
        this.setRotationAngle(Body_r2, 0.0f, 0.0f, 0.3927f);
        Body_r2.cubeList.add(new ModelBox(Body_r2, 0, 8, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r2.cubeList.add(new ModelBox(Body_r2, 0, 28, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r3 = new ModelRenderer((ModelBase)this);
        Body_r3.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r3);
        this.setRotationAngle(Body_r3, 0.0f, 0.0f, 0.5236f);
        Body_r3.cubeList.add(new ModelBox(Body_r3, 0, 10, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r3.cubeList.add(new ModelBox(Body_r3, 19, 29, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r4 = new ModelRenderer((ModelBase)this);
        Body_r4.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r4);
        this.setRotationAngle(Body_r4, 0.0f, 0.0f, 0.6545f);
        Body_r4.cubeList.add(new ModelBox(Body_r4, 0, 12, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r4.cubeList.add(new ModelBox(Body_r4, 0, 30, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r5 = new ModelRenderer((ModelBase)this);
        Body_r5.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r5);
        this.setRotationAngle(Body_r5, 0.0f, 0.0f, 0.7854f);
        Body_r5.cubeList.add(new ModelBox(Body_r5, 0, 14, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r5.cubeList.add(new ModelBox(Body_r5, 19, 31, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r6 = new ModelRenderer((ModelBase)this);
        Body_r6.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r6);
        this.setRotationAngle(Body_r6, 0.0f, 0.0f, 1.0472f);
        Body_r6.cubeList.add(new ModelBox(Body_r6, 0, 16, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r6.cubeList.add(new ModelBox(Body_r6, 0, 32, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r7 = new ModelRenderer((ModelBase)this);
        Body_r7.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r7);
        this.setRotationAngle(Body_r7, 0.0f, 0.0f, 1.1781f);
        Body_r7.cubeList.add(new ModelBox(Body_r7, 0, 18, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r7.cubeList.add(new ModelBox(Body_r7, 19, 33, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r8 = new ModelRenderer((ModelBase)this);
        Body_r8.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r8);
        this.setRotationAngle(Body_r8, 0.0f, 0.0f, 1.309f);
        Body_r8.cubeList.add(new ModelBox(Body_r8, 19, 1, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r8.cubeList.add(new ModelBox(Body_r8, 0, 34, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r9 = new ModelRenderer((ModelBase)this);
        Body_r9.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r9);
        this.setRotationAngle(Body_r9, 0.0f, 0.0f, 1.4399f);
        Body_r9.cubeList.add(new ModelBox(Body_r9, 19, 3, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r9.cubeList.add(new ModelBox(Body_r9, 19, 35, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r10 = new ModelRenderer((ModelBase)this);
        Body_r10.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r10);
        this.setRotationAngle(Body_r10, 0.0f, 0.0f, 1.5708f);
        Body_r10.cubeList.add(new ModelBox(Body_r10, 19, 5, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r10.cubeList.add(new ModelBox(Body_r10, 0, 36, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r11 = new ModelRenderer((ModelBase)this);
        Body_r11.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r11);
        this.setRotationAngle(Body_r11, 0.0f, 0.0f, 0.9163f);
        Body_r11.cubeList.add(new ModelBox(Body_r11, 19, 7, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r11.cubeList.add(new ModelBox(Body_r11, 19, 37, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r12 = new ModelRenderer((ModelBase)this);
        Body_r12.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r12);
        this.setRotationAngle(Body_r12, 0.0f, 0.0f, 0.1309f);
        Body_r12.cubeList.add(new ModelBox(Body_r12, 19, 9, 0.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r12.cubeList.add(new ModelBox(Body_r12, 0, 38, 0.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r13 = new ModelRenderer((ModelBase)this);
        Body_r13.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r13);
        this.setRotationAngle(Body_r13, 0.0f, 0.0f, -0.1309f);
        Body_r13.cubeList.add(new ModelBox(Body_r13, 19, 11, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r13.cubeList.add(new ModelBox(Body_r13, 38, 0, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r14 = new ModelRenderer((ModelBase)this);
        Body_r14.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r14);
        this.setRotationAngle(Body_r14, 0.0f, 0.0f, -0.9163f);
        Body_r14.cubeList.add(new ModelBox(Body_r14, 19, 13, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r14.cubeList.add(new ModelBox(Body_r14, 38, 2, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r15 = new ModelRenderer((ModelBase)this);
        Body_r15.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r15);
        this.setRotationAngle(Body_r15, 0.0f, 0.0f, -1.5708f);
        Body_r15.cubeList.add(new ModelBox(Body_r15, 19, 15, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r15.cubeList.add(new ModelBox(Body_r15, 38, 4, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r16 = new ModelRenderer((ModelBase)this);
        Body_r16.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r16);
        this.setRotationAngle(Body_r16, 0.0f, 0.0f, -1.4399f);
        Body_r16.cubeList.add(new ModelBox(Body_r16, 19, 17, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r16.cubeList.add(new ModelBox(Body_r16, 38, 6, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r17 = new ModelRenderer((ModelBase)this);
        Body_r17.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r17);
        this.setRotationAngle(Body_r17, 0.0f, 0.0f, -1.309f);
        Body_r17.cubeList.add(new ModelBox(Body_r17, 19, 19, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r17.cubeList.add(new ModelBox(Body_r17, 38, 8, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r18 = new ModelRenderer((ModelBase)this);
        Body_r18.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r18);
        this.setRotationAngle(Body_r18, 0.0f, 0.0f, -1.1781f);
        Body_r18.cubeList.add(new ModelBox(Body_r18, 0, 20, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r18.cubeList.add(new ModelBox(Body_r18, 38, 10, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r19 = new ModelRenderer((ModelBase)this);
        Body_r19.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r19);
        this.setRotationAngle(Body_r19, 0.0f, 0.0f, -1.0472f);
        Body_r19.cubeList.add(new ModelBox(Body_r19, 19, 21, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r19.cubeList.add(new ModelBox(Body_r19, 38, 12, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r20 = new ModelRenderer((ModelBase)this);
        Body_r20.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r20);
        this.setRotationAngle(Body_r20, 0.0f, 0.0f, -0.7854f);
        Body_r20.cubeList.add(new ModelBox(Body_r20, 0, 22, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r20.cubeList.add(new ModelBox(Body_r20, 38, 14, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r21 = new ModelRenderer((ModelBase)this);
        Body_r21.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r21);
        this.setRotationAngle(Body_r21, 0.0f, 0.0f, -0.6545f);
        Body_r21.cubeList.add(new ModelBox(Body_r21, 19, 23, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r21.cubeList.add(new ModelBox(Body_r21, 38, 16, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r22 = new ModelRenderer((ModelBase)this);
        Body_r22.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r22);
        this.setRotationAngle(Body_r22, 0.0f, 0.0f, -0.5236f);
        Body_r22.cubeList.add(new ModelBox(Body_r22, 0, 24, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r22.cubeList.add(new ModelBox(Body_r22, 38, 18, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r23 = new ModelRenderer((ModelBase)this);
        Body_r23.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r23);
        this.setRotationAngle(Body_r23, 0.0f, 0.0f, -0.3927f);
        Body_r23.cubeList.add(new ModelBox(Body_r23, 19, 25, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r23.cubeList.add(new ModelBox(Body_r23, 38, 20, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
        final ModelRenderer Body_r24 = new ModelRenderer((ModelBase)this);
        Body_r24.setRotationPoint(0.0f, 1.0f, 3.0f);
        this.bipedBody.addChild(Body_r24);
        this.setRotationAngle(Body_r24, 0.0f, 0.0f, -0.2618f);
        Body_r24.cubeList.add(new ModelBox(Body_r24, 0, 26, -9.0f, -1.0f, -1.0f, 9, 1, 1, 0.0f));
        Body_r24.cubeList.add(new ModelBox(Body_r24, 38, 22, -9.0f, -1.0f, -6.0f, 9, 1, 1, 0.0f));
    }
    
    public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bipedBody.render(f5);
        this.bipedRightArm.render(f5);
        this.bipedLeftArm.render(f5);
    }
}
