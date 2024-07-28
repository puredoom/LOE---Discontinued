package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDolGuldurLegs extends LOTRModelBiped {


	public DRModelDolGuldurLegs() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -1.2F, 0.0F, -2.0F, 3, 10, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 10, 10, -2.0F, 0.0F, -2.0F, 1, 10, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 14, 0, -2.5F, 5.0F, -2.5F, 3, 2, 3, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 14, 5, -2.5F, 8.0F, -2.5F, 3, 1, 3, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 14, -2.0F, -0.2F, 2.3F, 4, 5, 0, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 14, 5, 0.0F, 4.8F, 2.3F, 1, 3, 0, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 8, 14, -2.0F, 4.8F, 2.3F, 1, 6, 0, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 16, 9, 0.0F, 0.0F, -3.0F, 2, 3, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 20, 18, -1.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 20, 21, 1.0F, 3.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 20, 13, -1.0F, 4.8F, 2.3F, 1, 5, 0, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.5672F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 0, -1.2F, 0.0F, -3.1F, 2, 1, 1, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2182F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 20, -0.6F, -0.2F, 1.0F, 1, 3, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.6F, -0.2F, -2.0F, 1, 3, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -0.6F, -0.2F, -1.0F, 1, 5, 2, 0.0F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 10, 10, 1.0F, 0.0F, -2.0F, 1, 10, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 14, 5, -0.5F, 8.0F, -2.5F, 3, 1, 3, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 14, 0, -0.5F, 5.0F, -2.5F, 3, 2, 3, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -1.8F, 0.0F, -2.0F, 3, 10, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 20, 13, 0.0F, 4.8F, 2.3F, 1, 5, 0, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 14, 5, -1.0F, 4.8F, 2.3F, 1, 3, 0, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 14, -2.0F, -0.2F, 2.3F, 4, 5, 0, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 8, 14, 1.0F, 4.8F, 2.3F, 1, 6, 0, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 20, 21, -2.0F, 3.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 16, 9, -2.0F, 0.0F, -3.0F, 2, 3, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 20, 18, 0.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.5672F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 0, -0.8F, 0.0F, -3.1F, 2, 1, 1, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2182F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.4F, -0.2F, -2.0F, 1, 3, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, -0.4F, -0.2F, -1.0F, 1, 5, 2, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 20, -0.4F, -0.2F, 1.0F, 1, 3, 1, 0.0F));
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
		this.bipedLeftLeg.render(f5);
		this.bipedRightLeg.render(f5);
	}


}