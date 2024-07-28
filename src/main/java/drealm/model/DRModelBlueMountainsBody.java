package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelBlueMountainsBody extends LOTRModelBiped {

	public DRModelBlueMountainsBody() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, 12.3F, -2.7F);
		this.bipedBody.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6037F, 0.0998F, 0.1434F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 52, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 12.3F, -2.7F);
		this.bipedBody.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6037F, -0.0998F, -0.1434F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 52, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, 11.3F, -2.7F);
		this.bipedBody.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.6037F, -0.0998F, -0.1434F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 52, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.0F, 10.3F, -2.7F);
		this.bipedBody.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.6037F, -0.0998F, -0.1434F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 52, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, 11.3F, -2.7F);
		this.bipedBody.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.6037F, 0.0998F, 0.1434F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 52, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, 10.3F, -2.7F);
		this.bipedBody.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.6037F, 0.0998F, 0.1434F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 52, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.0F, 9.3F, -2.7F);
		this.bipedBody.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.6037F, 0.0998F, 0.1434F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 52, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, 9.3F, -2.7F);
		this.bipedBody.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.6037F, -0.0998F, -0.1434F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 52, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0F, 8.3F, -2.7F);
		this.bipedBody.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6037F, -0.0998F, -0.1434F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 52, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.0F, 8.3F, -2.7F);
		this.bipedBody.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.6037F, 0.0998F, 0.1434F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 52, 52, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.0F, 7.3F, -2.7F);
		this.bipedBody.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.6037F, 0.0998F, 0.1434F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 56, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.0F, 7.3F, -2.7F);
		this.bipedBody.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.6037F, -0.0998F, -0.1434F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 52, 56, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.7F, 4.0F, -1.3F);
		this.bipedBody.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.1757F, -0.1739F, -0.0077F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 52, 34, -3.0F, -4.0F, -1.0F, 4, 5, 2, 0.0F));

		ModelRenderer cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.7F, 4.0F, -1.3F);
		this.bipedBody.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.1757F, 0.1739F, 0.0077F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 52, 16, -1.0F, -4.0F, -1.0F, 4, 5, 2, 0.0F));

		ModelRenderer cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.0F, 11.3F, 2.7F);
		this.bipedBody.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.6037F, -0.0998F, 0.1434F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 43, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, 10.3F, 2.7F);
		this.bipedBody.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.6037F, -0.0998F, 0.1434F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 52, 43, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(1.0F, 7.3F, 2.7F);
		this.bipedBody.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.6037F, 0.0998F, -0.1434F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 52, 47, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, 7.3F, 2.7F);
		this.bipedBody.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.6037F, -0.0998F, 0.1434F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 52, 47, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.0F, 9.3F, 2.7F);
		this.bipedBody.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.6037F, -0.0998F, 0.1434F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 43, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.0F, 12.3F, 2.7F);
		this.bipedBody.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.6037F, 0.0998F, -0.1434F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 43, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.0F, 11.3F, 2.7F);
		this.bipedBody.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.6037F, 0.0998F, -0.1434F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 43, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.0F, 10.3F, 2.7F);
		this.bipedBody.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.6037F, 0.0998F, -0.1434F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 52, 43, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(1.0F, 9.3F, 2.7F);
		this.bipedBody.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.6037F, 0.0998F, -0.1434F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 52, 43, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.0F, 12.3F, 2.7F);
		this.bipedBody.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.6037F, -0.0998F, 0.1434F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 52, 43, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(1.0F, 8.3F, 2.7F);
		this.bipedBody.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.6037F, 0.0998F, -0.1434F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 52, 43, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.0F, 8.3F, 2.7F);
		this.bipedBody.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.6037F, -0.0998F, 0.1434F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 52, 43, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(2.7F, 4.0F, 1.3F);
		this.bipedBody.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.1757F, 0.1739F, -0.0077F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 42, 0, -3.0F, -4.0F, -1.0F, 4, 5, 2, 0.0F));

		ModelRenderer cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.7F, 4.0F, 1.3F);
		this.bipedBody.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.1757F, -0.1739F, 0.0077F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 42, 25, -1.0F, -4.0F, -1.0F, 4, 5, 2, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 32, 18, -4.0F, 0.5F, -3.0F, 5, 1, 6, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 20, 47, -3.0F, -2.0F, 1.25F, 4, 7, 1, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 27, 27, -3.5F, -2.5F, -2.5F, 5, 4, 5, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 36, 36, -3.25F, -2.0F, -2.0F, 4, 7, 4, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 44, -3.0F, -2.0F, -2.25F, 4, 7, 1, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 16, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 20, 36, -0.75F, -2.0F, -2.0F, 4, 7, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 10, 44, -1.0F, -2.0F, -2.25F, 4, 7, 1, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 44, 7, -1.0F, -2.0F, 1.25F, 4, 7, 1, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 32, -1.5F, -2.5F, -2.5F, 5, 4, 5, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 28, 11, -1.0F, 0.5F, -3.0F, 5, 1, 6, 0.25F));
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