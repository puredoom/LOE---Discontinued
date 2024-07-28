package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDolGuldurBoots extends LOTRModelBiped {

	public DRModelDolGuldurBoots() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-2.2F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 10, 10, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 26, 3, -1.6F, 10.0F, -3.0F, 3, 2, 1, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -1.1F, 11.0F, -4.0F, 2, 1, 1, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 26, 0, -1.1F, 11.0F, -6.0F, 2, 1, 2, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 2, -0.6F, 11.0F, -7.0F, 1, 1, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 10, -3.2F, 7.0F, -2.8F, 2, 4, 6, -1.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 10, 0, -3.2F, 7.0F, 1.2F, 6, 4, 2, -1.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 12, 21, -1.2F, 8.0F, 1.2F, 2, 5, 3, -1.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 22, 21, -2.2F, 9.0F, 1.2F, 2, 4, 3, -1.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 19, 28, -0.2F, 9.0F, 1.2F, 2, 4, 3, -1.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, 0.8F, 7.0F, -2.8F, 2, 4, 6, -1.0F));

		ModelRenderer RightLegLayer_r1 = new ModelRenderer(this);
		RightLegLayer_r1.setRotationPoint(-3.1F, 8.1F, 0.0F);
		this.bipedRightLeg.addChild(RightLegLayer_r1);
		setRotationAngle(RightLegLayer_r1, 0.0F, 0.0F, -0.2618F);
		RightLegLayer_r1.cubeList.add(new ModelBox(RightLegLayer_r1, 0, 20, -0.1105F, -3.8434F, -0.8F, 2, 5, 4, -1.0F));

		ModelRenderer RightLegLayer_r2 = new ModelRenderer(this);
		RightLegLayer_r2.setRotationPoint(-0.1F, 8.0F, 2.0F);
		this.bipedRightLeg.addChild(RightLegLayer_r2);
		setRotationAngle(RightLegLayer_r2, -0.2618F, 0.0F, 0.0F);
		RightLegLayer_r2.cubeList.add(new ModelBox(RightLegLayer_r2, 22, 6, -2.1F, -4.0F, -0.8F, 4, 4, 2, -1.0F));
		RightLegLayer_r2.cubeList.add(new ModelBox(RightLegLayer_r2, 16, 16, -3.1F, -2.0F, -0.8F, 6, 3, 2, -1.0F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(2.2F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 2, -0.4F, 11.0F, -7.0F, 1, 1, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -2.8F, 7.0F, -2.8F, 2, 4, 6, -1.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 10, 10, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 26, 3, -1.4F, 10.0F, -3.0F, 3, 2, 1, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -0.9F, 11.0F, -4.0F, 2, 1, 1, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 26, 0, -0.9F, 11.0F, -6.0F, 2, 1, 2, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 10, 1.2F, 7.0F, -2.8F, 2, 4, 6, -1.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 19, 28, -1.8F, 9.0F, 1.2F, 2, 4, 3, -1.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 10, 0, -2.8F, 7.0F, 1.2F, 6, 4, 2, -1.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 12, 21, -0.8F, 8.0F, 1.2F, 2, 5, 3, -1.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 22, 21, 0.2F, 9.0F, 1.2F, 2, 4, 3, -1.0F));

		ModelRenderer LeftLegLayer_r1 = new ModelRenderer(this);
		LeftLegLayer_r1.setRotationPoint(0.1F, 8.0F, 2.0F);
		this.bipedLeftLeg.addChild(LeftLegLayer_r1);
		setRotationAngle(LeftLegLayer_r1, -0.2618F, 0.0F, 0.0F);
		LeftLegLayer_r1.cubeList.add(new ModelBox(LeftLegLayer_r1, 16, 16, -2.9F, -2.0F, -0.8F, 6, 3, 2, -1.0F));
		LeftLegLayer_r1.cubeList.add(new ModelBox(LeftLegLayer_r1, 22, 6, -1.9F, -4.0F, -0.8F, 4, 4, 2, -1.0F));

		ModelRenderer LeftLegLayer_r2 = new ModelRenderer(this);
		LeftLegLayer_r2.setRotationPoint(3.1F, 8.1F, 0.0F);
		this.bipedLeftLeg.addChild(LeftLegLayer_r2);
		setRotationAngle(LeftLegLayer_r2, 0.0F, 0.0F, 0.2618F);
		LeftLegLayer_r2.cubeList.add(new ModelBox(LeftLegLayer_r2, 0, 20, -1.8895F, -3.8434F, -0.8F, 2, 5, 4, -1.0F));
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