package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelGondorBody extends LOTRModelBiped {


	public DRModelGondorBody() {
		textureWidth = 128;
		textureHeight = 128;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 26, 16, -5.3F, -1.3F, -3.4F, 11, 3, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 26, -1.3F, -0.3F, -3.4F, 7, 3, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 66, 49, 1.7F, 3.7F, -3.4F, 4, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 71, -1.3F, -1.3F, -3.5F, 3, 6, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 76, 37, 0.7F, -1.3F, -3.5F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 20, 56, 1.7F, -1.3F, -3.5F, 3, 11, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 60, 57, 0.7F, 0.7F, -3.4F, 5, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 16, -5.3F, -1.3F, 1.3F, 11, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 56, 28, -4.8F, 4.7F, 1.3F, 4, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 30, 76, -3.8F, 10.7F, 1.3F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 0, -3.8F, -1.3F, 1.5F, 3, 12, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 38, 68, -3.5F, -0.9F, 5.5F, 3, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 74, 63, -0.7F, 7.0F, 5.5F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 66, 39, 0.3F, 6.5F, 5.5F, 3, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 57, -2.3F, 0.3F, 5.5F, 3, 10, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 10, 48, -1.8F, 2.7F, 1.5F, 3, 12, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 32, 39, -5.8F, -1.3F, 1.5F, 3, 16, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 68, 74, 0.8F, 10.7F, 1.3F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 22, 38, 2.8F, -1.3F, 1.5F, 3, 16, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 53, 14, 0.8F, 4.7F, 1.3F, 4, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 40, 0, 0.8F, -1.3F, 1.5F, 3, 12, 2, -1.0F));

		ModelRenderer BodyLayer_r1 = new ModelRenderer(this);
		BodyLayer_r1.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.bipedBody.addChild(BodyLayer_r1);
		setRotationAngle(BodyLayer_r1, 0.0F, 0.0F, -0.2182F);
		BodyLayer_r1.cubeList.add(new ModelBox(BodyLayer_r1, 69, 20, -2.5F, 0.0F, 1.5F, 4, 1, 3, 0.0F));
		BodyLayer_r1.cubeList.add(new ModelBox(BodyLayer_r1, 68, 70, -2.5F, -3.5F, 1.5F, 4, 1, 3, 0.0F));
		BodyLayer_r1.cubeList.add(new ModelBox(BodyLayer_r1, 42, 39, -2.0F, -4.0F, 2.0F, 3, 15, 2, 0.0F));

		ModelRenderer BodyLayer_r2 = new ModelRenderer(this);
		BodyLayer_r2.setRotationPoint(-1.0F, 3.0F, -0.5F);
		this.bipedBody.addChild(BodyLayer_r2);
		setRotationAngle(BodyLayer_r2, 0.0F, 0.0F, -0.6109F);
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 66, 26, -2.5F, 4.8F, 4.0F, 4, 1, 3, 0.0F));
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 69, 0, -2.5F, -2.0F, 4.0F, 4, 1, 3, 0.0F));
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 34, 24, -2.0F, -9.7F, 5.0F, 3, 1, 1, 0.0F));
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 20, 0, -1.0F, -9.7F, 4.0F, 1, 1, 3, 0.0F));
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 34, 21, -1.5F, -9.7F, 4.5F, 2, 1, 2, 0.0F));
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 18, 26, -1.0F, -10.0F, 5.0F, 1, 6, 1, 0.0F));
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 38, 30, -4.5F, -5.0F, 5.0F, 8, 1, 1, 0.0F));
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 74, 4, -2.5F, -5.0F, 4.5F, 4, 1, 2, 0.0F));
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 69, 7, -2.5F, -3.5F, 4.0F, 4, 1, 3, 0.0F));
		BodyLayer_r2.cubeList.add(new ModelBox(BodyLayer_r2, 0, 48, -2.0F, -4.0F, 4.5F, 3, 15, 2, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 0, -3.5F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 60, 7, -4.0F, 4.0F, -2.5F, 2, 2, 5, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 60, 20, -4.0F, 8.5F, -2.5F, 2, 1, 5, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 39, -4.0F, -2.2F, -2.5F, 5, 4, 5, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 32, -5.0F, 1.8F, -3.0F, 6, 1, 6, 0.25F));

		ModelRenderer RightArmLayer_r1 = new ModelRenderer(this);
		RightArmLayer_r1.setRotationPoint(-2.0F, 0.0F, 0.0F);
		this.bipedRightArm.addChild(RightArmLayer_r1);
		setRotationAngle(RightArmLayer_r1, 0.0F, 0.0F, -1.5708F);
		RightArmLayer_r1.cubeList.add(new ModelBox(RightArmLayer_r1, 60, 64, -3.2F, -2.7F, -0.5F, 6, 5, 1, 0.0F));
		RightArmLayer_r1.cubeList.add(new ModelBox(RightArmLayer_r1, 0, 65, -3.2F, -2.7F, -1.8F, 6, 5, 1, 0.0F));
		RightArmLayer_r1.cubeList.add(new ModelBox(RightArmLayer_r1, 65, 14, -3.2F, -2.7F, 0.8F, 6, 5, 1, 0.0F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 52, 48, -1.3F, 0.2F, -3.4F, 5, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 74, 56, -1.3F, 5.2F, -3.4F, 3, 5, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 58, 70, -0.3F, 5.2F, -3.4F, 3, 6, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 22, 69, -0.3F, 0.7F, -3.5F, 3, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 30, 57, -2.3F, 0.7F, -3.5F, 3, 10, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 40, 56, -2.3F, 0.7F, 1.7F, 3, 10, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 72, 30, -1.3F, 5.2F, 1.6F, 3, 5, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 48, 69, -0.3F, 5.2F, 1.6F, 3, 6, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 12, 69, -0.3F, 0.7F, 1.7F, 3, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 52, 39, -1.3F, 0.2F, 1.6F, 5, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 32, 32, -1.0F, 1.8F, -3.0F, 6, 1, 6, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 63, 33, 2.0F, 8.5F, -2.5F, 2, 1, 5, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 38, 21, -1.0F, -2.2F, -2.5F, 5, 4, 5, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 22, 22, -0.5F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 60, 0, 2.0F, 4.0F, -2.5F, 2, 2, 5, 0.25F));
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