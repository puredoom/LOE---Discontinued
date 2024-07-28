package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDolGuldurBody extends LOTRModelBiped {

	public DRModelDolGuldurBody() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 16, -5.5F, 0.0F, 2.3F, 11, 13, 0, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.8F, -2.0F, 3.0F);
		this.bipedBody.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3013F, -0.0184F, -0.436F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 28, -1.0F, -12.0F, -1.0F, 1, 26, 1, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.8F, -2.0F, 3.0F);
		this.bipedBody.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3013F, 0.0184F, 0.436F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 28, 0.0F, -12.0F, -1.0F, 1, 26, 1, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 22, 12, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 2, 2, -1.7F, -2.3F, -2.3F, 1, 1, 0, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 2, 0, -2.9F, -2.3F, -2.3F, 1, 2, 0, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 0, -0.5F, -2.3F, -2.3F, 1, 3, 0, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 6, 31, -3.4F, -2.4F, -2.3F, 4, 1, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 34, 10, -3.8F, -2.1F, -0.5F, 1, 5, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 6, 29, -3.4F, -2.4F, -0.4F, 4, 1, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 10, -3.4F, -2.6F, -1.3F, 4, 1, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 10, -3.4F, -2.4F, 1.3F, 4, 1, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 25, 28, -3.6F, -2.1F, -2.5F, 4, 1, 5, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 29, -3.6F, -1.1F, -2.0F, 1, 1, 4, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 20, 0, -3.6F, -0.1F, -1.5F, 1, 1, 3, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 15, 29, -3.6F, 0.9F, -1.0F, 1, 1, 2, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 25, 28, -1.5F, -2.3F, -2.3F, 1, 5, 0, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 8, -3.4F, -2.6F, 0.3F, 4, 1, 1, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.25F, -1.0F, 2.75F);
		this.bipedRightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3687F, 0.2726F, -0.2502F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 33, -1.0F, -2.0F, -1.0F, 4, 2, 0, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.8F, -1.4F, 1.0F);
		this.bipedRightArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 8, -1.0F, -2.0F, -1.0F, 4, 2, 0, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.6F, -1.3F, -1.0F);
		this.bipedRightArm.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3725F, -0.2191F, -0.4313F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 34, -1.0F, -2.0F, -1.0F, 4, 2, 0, 0.0F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 22, 12, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 2, 0, 1.9F, -2.3F, -2.3F, 1, 2, 0, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 0, -0.5F, -2.3F, -2.3F, 1, 3, 0, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 25, 28, 0.5F, -2.3F, -2.3F, 1, 5, 0, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 25, 28, -0.4F, -2.1F, -2.5F, 4, 1, 5, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 29, 2.6F, -1.1F, -2.0F, 1, 1, 4, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 20, 0, 2.6F, -0.1F, -1.5F, 1, 1, 3, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 15, 29, 2.6F, 0.9F, -1.0F, 1, 1, 2, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 34, 10, 2.8F, -2.1F, -0.5F, 1, 5, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 10, -0.6F, -2.4F, 1.3F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 8, -0.6F, -2.6F, 0.3F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 10, -0.6F, -2.6F, -1.3F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 6, 29, -0.6F, -2.4F, -0.4F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 6, 31, -0.6F, -2.4F, -2.3F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 2, 2, 0.7F, -2.3F, -2.3F, 1, 1, 0, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.6F, -1.3F, -1.0F);
		this.bipedLeftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3725F, 0.2191F, 0.4313F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 34, -3.0F, -2.0F, -1.0F, 4, 2, 0, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.25F, -1.0F, 2.75F);
		this.bipedLeftArm.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3687F, -0.2726F, 0.2502F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 33, -3.0F, -2.0F, -1.0F, 4, 2, 0, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.8F, -1.4F, 1.0F);
		this.bipedLeftArm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 8, -3.0F, -2.0F, -1.0F, 4, 2, 0, 0.0F));

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);


		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.8F, -29.0F, 3.7F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3491F, 0.0F, 0.5672F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 34, -1.7F, -4.0F, -2.0F, 2, 1, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 0, -2.7F, -8.0F, -2.0F, 4, 4, 4, 0.0F));

		bipedBody.addChild(bb_main);
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