package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDaleBody extends LOTRModelBiped {

	public DRModelDaleBody() {
		textureWidth = 128;
		textureHeight = 128;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 26, 16, -5.3F, -1.3F, -3.4F, 11, 3, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 12, 66, 1.7F, 3.7F, -3.4F, 4, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 42, 66, -1.3F, -1.3F, -3.5F, 3, 6, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 69, 54, 0.7F, -1.3F, -3.5F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 54, 37, 1.7F, -1.3F, -3.5F, 3, 11, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 16, -5.3F, -1.3F, 1.3F, 11, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 32, 57, -4.8F, 4.7F, 1.3F, 4, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 67, 68, -3.8F, 10.7F, 1.3F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 10, 48, -3.8F, -1.3F, 1.5F, 3, 12, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 48, -1.8F, 2.7F, 1.5F, 3, 12, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 32, 39, -5.8F, -1.3F, 1.5F, 3, 16, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 68, 18, 0.8F, 10.7F, 1.3F, 3, 5, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 22, 38, 2.8F, -1.3F, 1.5F, 3, 16, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 20, 56, 0.8F, 4.7F, 1.3F, 4, 8, 2, -1.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 40, 0, 0.8F, -1.3F, 1.5F, 3, 12, 2, -1.0F));

		ModelRenderer bipedBodyLayer_r1 = new ModelRenderer(this);
		bipedBodyLayer_r1.setRotationPoint(-1.0F, 3.0F, -2.0F);
		this.bipedBody.addChild(bipedBodyLayer_r1);
		setRotationAngle(bipedBodyLayer_r1, 0.0F, 0.0F, -0.6109F);
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 0, 28, -2.5F, 4.8F, 4.0F, 4, 1, 3, 0.0F));
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 64, 14, -2.5F, -2.0F, 4.0F, 4, 1, 3, 0.0F));
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 34, 21, -2.0F, -9.7F, 5.0F, 3, 1, 1, 0.0F));
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 20, 0, -1.0F, -9.7F, 4.0F, 1, 1, 3, 0.0F));
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 11, 28, -1.5F, -9.7F, 4.5F, 2, 1, 2, 0.0F));
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 18, 30, -1.0F, -10.0F, 5.0F, 1, 6, 1, 0.0F));
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 0, 26, -4.5F, -5.0F, 5.0F, 8, 1, 1, 0.0F));
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 68, 25, -2.5F, -5.0F, 4.5F, 4, 1, 2, 0.0F));
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 64, 45, -2.5F, -3.5F, 4.0F, 4, 1, 3, 0.0F));
		bipedBodyLayer_r1.cubeList.add(new ModelBox(bipedBodyLayer_r1, 42, 39, -2.0F, -4.0F, 4.5F, 3, 15, 2, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 0, -3.5F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 39, -4.0F, -2.2F, -2.5F, 5, 4, 5, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 32, -5.0F, 1.8F, -3.0F, 6, 1, 6, 0.25F));

		ModelRenderer bipedRightArmLayer_r1 = new ModelRenderer(this);
		bipedRightArmLayer_r1.setRotationPoint(-2.0F, 0.0F, 0.0F);
		this.bipedRightArm.addChild(bipedRightArmLayer_r1);
		setRotationAngle(bipedRightArmLayer_r1, 0.0F, 0.0F, -1.5708F);
		bipedRightArmLayer_r1.cubeList.add(new ModelBox(bipedRightArmLayer_r1, 0, 62, -3.2F, -2.7F, -0.5F, 6, 5, 1, 0.0F));
		bipedRightArmLayer_r1.cubeList.add(new ModelBox(bipedRightArmLayer_r1, 63, 8, -3.2F, -2.7F, -1.8F, 6, 5, 1, 0.0F));
		bipedRightArmLayer_r1.cubeList.add(new ModelBox(bipedRightArmLayer_r1, 64, 0, -3.2F, -2.7F, 0.8F, 6, 5, 1, 0.0F));

		ModelRenderer bipedRightArmLayer_r2 = new ModelRenderer(this);
		bipedRightArmLayer_r2.setRotationPoint(-2.0F, 1.9F, -0.5F);
		this.bipedRightArm.addChild(bipedRightArmLayer_r2);
		setRotationAngle(bipedRightArmLayer_r2, -0.1309F, 0.0F, 0.0F);
		bipedRightArmLayer_r2.cubeList.add(new ModelBox(bipedRightArmLayer_r2, 56, 50, -2.5F, 0.0F, -2.0F, 5, 4, 2, 0.25F));

		ModelRenderer bipedRightArmLayer_r3 = new ModelRenderer(this);
		bipedRightArmLayer_r3.setRotationPoint(-2.0F, 1.9F, 0.5F);
		this.bipedRightArm.addChild(bipedRightArmLayer_r3);
		setRotationAngle(bipedRightArmLayer_r3, 0.1309F, 0.0F, 0.0F);
		bipedRightArmLayer_r3.cubeList.add(new ModelBox(bipedRightArmLayer_r3, 44, 60, -2.5F, 0.0F, 0.0F, 5, 4, 2, 0.25F));

		ModelRenderer bipedRightArmLayer_r4 = new ModelRenderer(this);
		bipedRightArmLayer_r4.setRotationPoint(-2.0F, 2.0F, 0.0F);
		this.bipedRightArm.addChild(bipedRightArmLayer_r4);
		setRotationAngle(bipedRightArmLayer_r4, 0.0F, 0.0F, 0.1309F);
		bipedRightArmLayer_r4.cubeList.add(new ModelBox(bipedRightArmLayer_r4, 47, 51, -2.0F, 0.0F, -2.5F, 2, 4, 5, 0.25F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 59, 58, -2.3F, 0.7F, -3.5F, 3, 10, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 58, 18, -2.3F, 0.7F, 1.7F, 3, 10, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 68, -1.3F, 5.2F, 1.6F, 3, 5, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 66, -0.3F, 5.2F, 1.6F, 3, 6, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 64, 36, -0.3F, 0.7F, 1.7F, 3, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 50, 0, -1.3F, 0.2F, 1.6F, 5, 7, 2, -1.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 32, 32, -1.0F, 1.8F, -3.0F, 6, 1, 6, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 38, 21, -1.0F, -2.2F, -2.5F, 5, 4, 5, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 22, 22, -0.5F, -2.0F, -2.0F, 4, 12, 4, 0.25F));

		ModelRenderer bipedLeftArmLayer_r1 = new ModelRenderer(this);
		bipedLeftArmLayer_r1.setRotationPoint(2.0F, 1.9F, 0.5F);
		this.bipedLeftArm.addChild(bipedLeftArmLayer_r1);
		setRotationAngle(bipedLeftArmLayer_r1, 0.1309F, 0.0F, 0.0F);
		bipedLeftArmLayer_r1.cubeList.add(new ModelBox(bipedLeftArmLayer_r1, 50, 30, -2.5F, 0.0F, 0.0F, 5, 4, 2, 0.25F));

		ModelRenderer bipedLeftArmLayer_r2 = new ModelRenderer(this);
		bipedLeftArmLayer_r2.setRotationPoint(2.0F, 2.0F, 0.0F);
		this.bipedLeftArm.addChild(bipedLeftArmLayer_r2);
		setRotationAngle(bipedLeftArmLayer_r2, 0.0F, 0.0F, -0.1309F);
		bipedLeftArmLayer_r2.cubeList.add(new ModelBox(bipedLeftArmLayer_r2, 50, 9, 0.0F, 0.0F, -2.5F, 2, 4, 5, 0.25F));

		ModelRenderer bipedLeftArmLayer_r3 = new ModelRenderer(this);
		bipedLeftArmLayer_r3.setRotationPoint(2.0F, 1.9F, -0.5F);
		this.bipedLeftArm.addChild(bipedLeftArmLayer_r3);
		setRotationAngle(bipedLeftArmLayer_r3, -0.1309F, 0.0F, 0.0F);
		bipedLeftArmLayer_r3.cubeList.add(new ModelBox(bipedLeftArmLayer_r3, 64, 30, -2.5F, 0.0F, -2.0F, 5, 4, 2, 0.25F));


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