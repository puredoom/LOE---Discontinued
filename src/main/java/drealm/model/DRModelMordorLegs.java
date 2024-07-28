package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelMordorLegs extends LOTRModelBiped {


	public DRModelMordorLegs() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 16, 9, 0.0F, 0.0F, 2.0F, 2, 3, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 20, 18, -1.0F, 0.0F, 2.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 16, 9, 0.0F, 0.0F, -3.0F, 2, 3, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 20, 18, -1.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 23, 0, 1.0F, 3.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 23, 0, 1.0F, 3.0F, 2.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 1, 26, -2.5F, 5.75F, -2.5F, 5, 1, 5, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, 11.0F, -2.0F);
		this.bipedRightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, 0.0F, -0.1309F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 0, -0.5F, -6.0F, -0.5F, 3, 6, 3, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.5672F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 0, -1.2F, 0.0F, -3.1F, 2, 1, 1, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.2182F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -0.6F, -0.2F, 1.0F, 1, 3, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 20, -0.6F, -0.2F, -2.0F, 1, 3, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 19, -0.6F, -0.2F, -1.0F, 1, 5, 2, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.5672F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 0, -1.2F, 0.0F, 2.1F, 2, 1, 1, 0.0F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 23, 0, -2.0F, 3.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 23, 0, -2.0F, 3.0F, 2.0F, 1, 2, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 16, 9, -2.0F, 0.0F, -3.0F, 2, 3, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 20, 18, 0.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 1, 26, -2.5F, 5.75F, -2.5F, 5, 1, 5, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 20, 18, 0.0F, 0.0F, 2.0F, 1, 2, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 16, 9, -2.0F, 0.0F, 2.0F, 2, 3, 1, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.5672F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 0, -0.8F, 0.0F, 2.1F, 2, 1, 1, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.5672F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 10, 0, -0.8F, 0.0F, -3.1F, 2, 1, 1, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.0F, 11.0F, -2.0F);
		this.bipedLeftLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1309F, 0.0F, 0.1309F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 0, -2.5F, -6.0F, -0.5F, 3, 6, 3, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.2182F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 20, -0.4F, -0.2F, -2.0F, 1, 3, 1, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 19, -0.4F, -0.2F, -1.0F, 1, 5, 2, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 0, -0.4F, -0.2F, 1.0F, 1, 3, 1, 0.0F));
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