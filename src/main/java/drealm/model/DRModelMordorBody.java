package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelMordorBody extends LOTRModelBiped {


	public DRModelMordorBody() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 46, 40, -4.0F, -0.5F, 2.2F, 8, 13, 1, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, 7.3F, -2.7F);
		this.bipedBody.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6037F, 0.0998F, 0.1434F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 17, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, 7.3F, -2.7F);
		this.bipedBody.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6037F, -0.0998F, -0.1434F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 17, -1.0F, -2.0F, -1.0F, 4, 2, 2, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.7F, 4.0F, -1.3F);
		this.bipedBody.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1757F, -0.1739F, -0.0077F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 10, -3.0F, -4.0F, -1.0F, 4, 5, 2, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.7F, 4.0F, -1.3F);
		this.bipedBody.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1757F, 0.1739F, 0.0077F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 31, 10, -1.0F, -4.0F, -1.0F, 4, 5, 2, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 0, -4.0F, 0.5F, -3.0F, 5, 1, 6, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 32, 25, -3.0F, -2.0F, 1.25F, 4, 7, 1, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 16, 16, -3.5F, -2.5F, -2.5F, 5, 4, 5, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 16, 25, -3.25F, -2.0F, -2.0F, 4, 7, 4, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 32, -3.0F, -2.0F, -2.25F, 4, 7, 1, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.4F, -2.7F, 0.5F);
		this.bipedRightArm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -1.0036F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 32, -0.5F, -1.1F, -2.5F, 1, 2, 4, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -0.6F, -3.0F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 1, 0.0F, -3.1F, -3.5F, 0, 3, 6, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -0.5F, -0.6F, 1.0F, 1, 1, 1, 0.0F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 16, 25, -0.75F, -2.0F, -2.0F, 4, 7, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 32, -1.0F, -2.0F, -2.25F, 4, 7, 1, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 32, 25, -1.0F, -2.0F, 1.25F, 4, 7, 1, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 16, 16, -1.5F, -2.5F, -2.5F, 5, 4, 5, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 0, -1.0F, 0.5F, -3.0F, 5, 1, 6, 0.25F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.4F, -2.7F, 0.5F);
		this.bipedLeftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 1.0036F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.6F, 1.0F, 1, 1, 1, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -0.6F, -3.0F, 1, 1, 1, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 1, 0.0F, -3.1F, -3.5F, 0, 3, 6, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 32, -0.5F, -1.1F, -2.5F, 1, 2, 4, 0.0F));
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