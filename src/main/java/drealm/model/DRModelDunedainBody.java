package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDunedainBody extends LOTRModelBiped {

	public DRModelDunedainBody() {
		textureWidth = 128;
		textureHeight = 128;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 36, 17, -5.1F, -1.3F, -3.4F, 11, 3, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 34, 55, -1.1F, -0.3F, -3.4F, 7, 3, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 22, 68, 1.7F, 3.7F, -3.4F, 4, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 66, 68, -1.3F, -1.3F, -3.5F, 3, 6, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 20, 75, 0.7F, -1.3F, -3.5F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 54, 53, 1.7F, -1.3F, -3.5F, 3, 11, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 62, 47, 0.9F, 0.7F, -3.4F, 5, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 24, 0, -5.3F, -1.3F, 1.4F, 11, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 24, 58, -4.8F, 4.7F, 1.3F, 4, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 74, 74, -3.8F, 10.7F, 1.3F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 0, -3.8F, -1.3F, 1.5F, 3, 12, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 46, 41, -1.8F, 2.7F, 1.5F, 3, 12, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 26, 39, -5.8F, -1.3F, 1.5F, 3, 16, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 73, 60, 0.8F, 10.7F, 1.3F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 16, 35, 2.9F, -1.3F, 1.5F, 3, 16, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 56, 37, 0.8F, 4.7F, 1.3F, 4, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 36, 41, 0.8F, -1.3F, 1.5F, 3, 12, 2, -1.0F));

		ModelRenderer BodyLayer_r1 = new ModelRenderer(this);
		BodyLayer_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.bipedBody.addChild(BodyLayer_r1);
		setRotationAngle(BodyLayer_r1, 0.0F, 0.0F, -0.2182F);
		BodyLayer_r1.cubeList.add(new ModelBox(BodyLayer_r1, 21, 17, -2.5F, 0.0F, 1.5F, 4, 1, 3, 0.0F));
		BodyLayer_r1.cubeList.add(new ModelBox(BodyLayer_r1, 66, 18, -2.5F, -3.5F, 1.5F, 4, 1, 3, 0.0F));
		BodyLayer_r1.cubeList.add(new ModelBox(BodyLayer_r1, 0, 41, -2.0F, -4.0F, 2.0F, 3, 15, 2, 0.0F));

		ModelRenderer BodyLayer_r2 = new ModelRenderer(this);
		BodyLayer_r2.setRotationPoint(-1.5F, -6.0F, 2.5F);
		this.bipedBody.addChild(BodyLayer_r2);
		setRotationAngle(BodyLayer_r2, 0.1045F, -1.1381F, -0.2252F);
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 1, 16, -1.4984F, -1.3995F, -0.0982F, 3, 3, 0, 0.0F));

		ModelRenderer BodyLayer_r3 = new ModelRenderer(this);
		BodyLayer_r3.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.bipedBody.addChild(BodyLayer_r3);
		setRotationAngle(BodyLayer_r3, 0.0438F, -0.0057F, -0.1305F);
		BodyLayer_r3.cubeList.add(new ModelBox(BodyLayer_r3, 1, 16, -1.8F, -10.4F, 2.8F, 3, 3, 0, 0.0F));
		BodyLayer_r3.cubeList.add(new ModelBox(BodyLayer_r3, 34, 72, -0.8F, -9.4F, 2.3F, 1, 12, 1, 0.0F));

		ModelRenderer BodyLayer_r4 = new ModelRenderer(this);
		BodyLayer_r4.setRotationPoint(-1.9F, -4.9F, 4.0F);
		this.bipedBody.addChild(BodyLayer_r4);
		setRotationAngle(BodyLayer_r4, -0.2517F, 1.0216F, -0.3912F);
		BodyLayer_r4.cubeList.add(new ModelBox(BodyLayer_r4, 1, 16, -1.3402F, -1.8385F, 0.0831F, 3, 3, 0, 0.0F));

		ModelRenderer BodyLayer_r5 = new ModelRenderer(this);
		BodyLayer_r5.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.bipedBody.addChild(BodyLayer_r5);
		setRotationAngle(BodyLayer_r5, -0.1304F, -0.0114F, -0.1738F);
		BodyLayer_r5.cubeList.add(new ModelBox(BodyLayer_r5, 1, 16, -1.8F, -10.4F, 2.8F, 3, 3, 0, 0.0F));
		BodyLayer_r5.cubeList.add(new ModelBox(BodyLayer_r5, 38, 72, -0.8F, -9.4F, 2.3F, 1, 12, 1, 0.0F));

		ModelRenderer BodyLayer_r6 = new ModelRenderer(this);
		BodyLayer_r6.setRotationPoint(-4.5F, -4.2F, 2.8F);
		this.bipedBody.addChild(BodyLayer_r6);
		setRotationAngle(BodyLayer_r6, 0.0F, 1.2654F, -0.48F);
		BodyLayer_r6.cubeList.add(new ModelBox(BodyLayer_r6, 1, 16, -1.233F, -1.9357F, 0.4F, 3, 3, 0, 0.0F));

		ModelRenderer BodyLayer_r7 = new ModelRenderer(this);
		BodyLayer_r7.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.bipedBody.addChild(BodyLayer_r7);
		setRotationAngle(BodyLayer_r7, 0.0F, 0.0F, -0.48F);
		BodyLayer_r7.cubeList.add(new ModelBox(BodyLayer_r7, 1, 16, -1.8F, -10.4F, 2.8F, 3, 3, 0, 0.0F));
		BodyLayer_r7.cubeList.add(new ModelBox(BodyLayer_r7, 42, 72, -0.8F, -9.4F, 2.3F, 1, 12, 1, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 25, -3.5F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 59, 61, -4.0F, 4.0F, -2.5F, 2, 2, 5, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 39, 10, -4.0F, 8.5F, -2.5F, 2, 1, 5, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 35, 32, -4.0F, -2.2F, -2.5F, 5, 4, 5, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 21, 10, -5.0F, 1.8F, -3.0F, 6, 1, 6, 0.25F));

		ModelRenderer RightArmLayer_r1 = new ModelRenderer(this);
		RightArmLayer_r1.setRotationPoint(-2.0F, 0.0F, 0.0F);
		this.bipedRightArm.addChild(RightArmLayer_r1);
		setRotationAngle(RightArmLayer_r1, 0.0F, 0.0F, -1.5708F);
		RightArmLayer_r1.cubeList.add(new ModelBox(RightArmLayer_r1, 64, 54, -3.2F, -2.7F, -0.5F, 6, 5, 1, 0.0F));
		RightArmLayer_r1.cubeList.add(new ModelBox(RightArmLayer_r1, 66, 12, -3.2F, -2.7F, -1.8F, 6, 5, 1, 0.0F));
		RightArmLayer_r1.cubeList.add(new ModelBox(RightArmLayer_r1, 66, 24, -3.2F, -2.7F, 0.8F, 6, 5, 1, 0.0F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 54, 28, -1.3F, 0.2F, -3.4F, 5, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 40, 22, -1.1F, -3.3F, -3.4F, 6, 6, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 40, 22, -1.1F, -3.3F, 1.5F, 6, 6, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 16, -2.1F, -3.3F, -3.5F, 7, 2, 7, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 58, 2.9F, -3.3F, -2.5F, 2, 6, 4, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 12, 62, 2.9F, -3.3F, -3.5F, 2, 7, 3, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 12, 62, 2.9F, -3.3F, 0.5F, 2, 7, 3, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 46, 73, 2.9F, -3.3F, -0.5F, 2, 4, 3, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 10, 72, -1.3F, 5.2F, -3.4F, 3, 5, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 56, 68, -0.3F, 5.2F, -3.4F, 3, 6, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 68, -0.3F, 0.7F, -3.5F, 3, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 36, 60, -2.3F, 0.7F, -3.5F, 3, 10, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 60, 0, -2.3F, 0.7F, 1.6F, 3, 10, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 70, 0, -1.3F, 5.2F, 1.5F, 3, 5, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 68, 38, -0.3F, 5.2F, 1.5F, 3, 6, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 46, 64, -0.3F, 0.7F, 1.6F, 3, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 10, 53, -1.3F, 0.2F, 1.5F, 5, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 66, 32, 2.0F, 8.5F, -2.5F, 2, 1, 5, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 21, -0.5F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 57, 17, 2.0F, 4.0F, -2.5F, 2, 2, 5, 0.25F));
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