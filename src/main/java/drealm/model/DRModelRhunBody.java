package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelRhunBody extends LOTRModelBiped {


	public DRModelRhunBody() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 16, 23, -1.0F, 0.0F, -2.5F, 2, 6, 5, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 25, 29, 1.0F, 0.0F, -2.5F, 2, 4, 5, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 25, 29, -3.0F, 0.0F, -2.5F, 2, 4, 5, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 31, 10, 1.0F, 9.25F, -2.5F, 2, 3, 5, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 31, 10, -3.0F, 9.25F, -2.5F, 2, 3, 5, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 24, 0, -1.0F, 7.25F, -2.5F, 2, 5, 5, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.55F, 9.3F, 1.4F);
		this.bipedBody.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 23, -1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 32, -1.0F, -2.0F, -3.8F, 2, 3, 2, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.85F, 4.7F, -1.4F);
		this.bipedBody.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 32, -1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 0, -1.0F, -2.0F, 1.8F, 2, 3, 2, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.55F, 9.3F, -1.4F);
		this.bipedBody.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 32, -1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 23, -1.0F, -2.0F, 1.8F, 2, 3, 2, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.85F, 4.7F, 1.4F);
		this.bipedBody.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 0, -1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 32, -1.0F, -2.0F, -3.8F, 2, 3, 2, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 16, 16, -3.5F, 2.0F, -2.5F, 5, 2, 5, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, 4.0F, 0.5F);
		this.bipedRightArm.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 34, -1.0F, -6.0F, 1.0F, 3, 6, 0, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5F, 4.0F, -0.5F);
		this.bipedRightArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3491F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 33, 23, -2.0F, -6.0F, -1.0F, 3, 6, 0, 0.0F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 16, 16, -1.5F, 2.0F, -2.5F, 5, 2, 5, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 4.0F, -0.5F);
		this.bipedLeftArm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3491F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 23, -1.0F, -6.0F, -1.0F, 3, 6, 0, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.5F, 4.0F, -0.5F);
		this.bipedLeftArm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 24, 7, 1.0F, -6.0F, -1.0F, 0, 6, 3, 0.0F));

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.5F, 4.0F, 0.5F);
		this.bipedLeftArm.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 34, -2.0F, -6.0F, 1.0F, 3, 6, 0, 0.0F));

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-11.5F, 4.0F, -0.5F);
		this.bipedLeftArm.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 7, -1.0F, -6.0F, -1.0F, 0, 6, 3, 0.0F));
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