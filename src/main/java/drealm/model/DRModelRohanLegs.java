package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelRohanLegs extends LOTRModelBiped {


	public DRModelRohanLegs() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 12, 9, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.25F));

		ModelRenderer LeftLegLayer_r1 = new ModelRenderer(this);
		LeftLegLayer_r1.setRotationPoint(-1.9F, 0.0F, -2.0F);
		this.bipedLeftLeg.addChild(LeftLegLayer_r1);
		setRotationAngle(LeftLegLayer_r1, 0.0F, 0.0F, -0.0873F);
		LeftLegLayer_r1.cubeList.add(new ModelBox(LeftLegLayer_r1, 0, 16, 3.4F, -1.0F, -1.0F, 1, 6, 6, -0.75F));
		LeftLegLayer_r1.cubeList.add(new ModelBox(LeftLegLayer_r1, 26, 3, 3.4F, 3.0F, 0.0F, 1, 3, 4, -0.75F));
		LeftLegLayer_r1.cubeList.add(new ModelBox(LeftLegLayer_r1, 0, 0, 3.4F, 4.0F, 1.5F, 1, 3, 1, -0.75F));

		ModelRenderer LeftLegLayer_r2 = new ModelRenderer(this);
		LeftLegLayer_r2.setRotationPoint(-1.9F, 0.0F, -2.0F);
		this.bipedLeftLeg.addChild(LeftLegLayer_r2);
		setRotationAngle(LeftLegLayer_r2, -0.1309F, 0.0F, -0.0873F);
		LeftLegLayer_r2.cubeList.add(new ModelBox(LeftLegLayer_r2, 7, 34, -0.1F, -1.0F, -0.5F, 3, 4, 1, -0.75F));
		LeftLegLayer_r2.cubeList.add(new ModelBox(LeftLegLayer_r2, 32, 0, 0.9F, -1.0F, -0.5F, 3, 5, 1, -0.75F));
		LeftLegLayer_r2.cubeList.add(new ModelBox(LeftLegLayer_r2, 22, 29, 1.9F, -1.0F, -0.5F, 3, 6, 1, -0.75F));

		ModelRenderer LeftLegLayer_r3 = new ModelRenderer(this);
		LeftLegLayer_r3.setRotationPoint(-1.9F, 0.0F, 2.0F);
		this.bipedLeftLeg.addChild(LeftLegLayer_r3);
		setRotationAngle(LeftLegLayer_r3, 0.1309F, 0.0F, -0.0873F);
		LeftLegLayer_r3.cubeList.add(new ModelBox(LeftLegLayer_r3, 16, 0, -1.1F, -1.0F, -0.5F, 6, 6, 1, -0.75F));

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.25F));

		ModelRenderer RightLegLayer_r1 = new ModelRenderer(this);
		RightLegLayer_r1.setRotationPoint(1.9F, 0.0F, 2.0F);
		this.bipedRightLeg.addChild(RightLegLayer_r1);
		setRotationAngle(RightLegLayer_r1, 0.1309F, 0.0F, 0.0873F);
		RightLegLayer_r1.cubeList.add(new ModelBox(RightLegLayer_r1, 22, 22, -4.9F, -1.0F, -0.5F, 6, 6, 1, -0.75F));

		ModelRenderer RightLegLayer_r2 = new ModelRenderer(this);
		RightLegLayer_r2.setRotationPoint(1.9F, 0.0F, -2.0F);
		this.bipedRightLeg.addChild(RightLegLayer_r2);
		setRotationAngle(RightLegLayer_r2, -0.1309F, 0.0F, 0.0873F);
		RightLegLayer_r2.cubeList.add(new ModelBox(RightLegLayer_r2, 0, 28, -4.9F, -1.0F, -0.5F, 3, 6, 1, -0.75F));
		RightLegLayer_r2.cubeList.add(new ModelBox(RightLegLayer_r2, 30, 29, -3.9F, -1.0F, -0.5F, 3, 5, 1, -0.75F));
		RightLegLayer_r2.cubeList.add(new ModelBox(RightLegLayer_r2, 28, 17, -2.9F, -1.0F, -0.5F, 3, 4, 1, -0.75F));

		ModelRenderer RightLegLayer_r3 = new ModelRenderer(this);
		RightLegLayer_r3.setRotationPoint(1.9F, 0.0F, -2.0F);
		this.bipedRightLeg.addChild(RightLegLayer_r3);
		setRotationAngle(RightLegLayer_r3, 0.0F, 0.0F, 0.0873F);
		RightLegLayer_r3.cubeList.add(new ModelBox(RightLegLayer_r3, 28, 10, -4.4F, 3.0F, 0.0F, 1, 3, 4, -0.75F));
		RightLegLayer_r3.cubeList.add(new ModelBox(RightLegLayer_r3, 8, 22, -4.4F, -1.0F, -1.0F, 1, 6, 6, -0.75F));
		RightLegLayer_r3.cubeList.add(new ModelBox(RightLegLayer_r3, 12, 0, -4.4F, 4.0F, 1.5F, 1, 3, 1, -0.75F));
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