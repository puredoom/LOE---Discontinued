package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDunlandLegs extends LOTRModelBiped {


	public DRModelDunlandLegs() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 12, 9, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.25F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -3.0F, -3.5F);
		this.bipedRightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.1568F, -0.1623F, 0.2599F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 7, -0.4431F, 0.1555F, -0.86F, 1, 1, 1, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.546F, -0.1623F, 0.2599F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -3.2F, -3.0F, -1.8F, 1, 2, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 15, -3.2F, 7.0F, -1.8F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 0, -3.7F, -1.0F, -2.8F, 2, 1, 3, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, -3.2F, 0.0F, -2.3F, 1, 7, 2, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.2618F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 0, -2.2F, 0.5F, -2.0F, 0, 3, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 11, -2.2F, 3.5F, -1.5F, 0, 1, 3, 0.0F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.25F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2618F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 10, 2.2F, 3.5F, -1.5F, 0, 1, 3, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 18, 2.2F, 0.5F, -2.0F, 0, 3, 4, 0.0F));
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