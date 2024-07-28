package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelRedMountainsLegs extends LOTRModelBiped {

	public DRModelRedMountainsLegs() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 13, 0, -2.3F, 0.0F, -2.4F, 4, 1, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 13, 0, -2.3F, 0.0F, -1.7F, 4, 1, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 12, -2.3F, 0.0F, -2.0F, 4, 9, 4, 0.25F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.6F, 6.7F, 0.7F);
		this.bipedRightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.035F, 0.2595F, 0.6063F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 12, -4.0775F, -5.529F, -1.941F, 2, 2, 2, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 12, -3.7117F, -4.6073F, -1.8116F, 2, 2, 2, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 12, -3.3459F, -3.6857F, -1.6822F, 2, 2, 2, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 12, -2.9801F, -2.764F, -1.5527F, 2, 2, 2, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 12, -2.6143F, -1.8424F, -1.4233F, 2, 2, 2, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.6F, 6.7F, 0.7F);
		this.bipedRightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.035F, -0.2595F, 0.6063F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 12, -4.4367F, -5.5763F, -1.4113F, 2, 2, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 12, -4.0709F, -4.6546F, -1.5407F, 2, 2, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 12, -3.7051F, -3.733F, -1.6701F, 2, 2, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 12, -3.3393F, -2.8113F, -1.7996F, 2, 2, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 12, -2.9735F, -1.8897F, -1.929F, 2, 2, 2, 0.0F));

		ModelRenderer RightLegLayer_r1 = new ModelRenderer(this);
		RightLegLayer_r1.setRotationPoint(-2.5F, 0.0F, 0.5F);
		this.bipedRightLeg.addChild(RightLegLayer_r1);
		setRotationAngle(RightLegLayer_r1, 0.0F, 0.0F, 0.1309F);
		RightLegLayer_r1.cubeList.add(new ModelBox(RightLegLayer_r1, 0, 0, 0.1F, 0.0F, -3.0F, 4, 7, 5, 0.25F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 12, -1.7F, 0.0F, -2.0F, 4, 9, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 13, 0, -1.7F, 0.0F, -2.4F, 4, 1, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 13, 0, -1.7F, 0.0F, -1.7F, 4, 1, 4, 0.25F));

		ModelRenderer LeftLegLayer_r1 = new ModelRenderer(this);
		LeftLegLayer_r1.setRotationPoint(2.5F, 0.0F, 0.5F);
		this.bipedLeftLeg.addChild(LeftLegLayer_r1);
		setRotationAngle(LeftLegLayer_r1, 0.0F, 0.0F, -0.1309F);
		LeftLegLayer_r1.cubeList.add(new ModelBox(LeftLegLayer_r1, 0, 0, -4.1F, 0.0F, -3.0F, 4, 7, 5, 0.25F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.6F, 6.7F, 0.7F);
		this.bipedLeftLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.035F, -0.2595F, -0.6063F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 12, 2.0775F, -5.529F, -1.941F, 2, 2, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 12, 1.7117F, -4.6073F, -1.8116F, 2, 2, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 12, 1.3459F, -3.6857F, -1.6822F, 2, 2, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 12, 0.9801F, -2.764F, -1.5527F, 2, 2, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 12, 0.6143F, -1.8424F, -1.4233F, 2, 2, 2, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.6F, 6.7F, 0.7F);
		this.bipedLeftLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.035F, 0.2595F, -0.6063F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 12, 2.4367F, -5.5763F, -1.4113F, 2, 2, 2, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 12, 2.0709F, -4.6546F, -1.5407F, 2, 2, 2, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 12, 1.7051F, -3.733F, -1.6701F, 2, 2, 2, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 12, 1.3393F, -2.8113F, -1.7996F, 2, 2, 2, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 12, 0.9735F, -1.8897F, -1.929F, 2, 2, 2, 0.0F));
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