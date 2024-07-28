package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelRohanBoots extends LOTRModelBiped {



	public DRModelRohanBoots() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 14, 8, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 14, 6, -1.0F, 6.1F, -2.7F, 2, 2, 0, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 17, 30, -1.0F, 10.0F, 1.0F, 2, 3, 3, -1.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 29, 27, -1.0F, 9.4F, 0.3F, 2, 3, 3, -1.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 24, 20, -1.5F, 10.5F, 1.0F, 3, 2, 3, -1.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 8, 27, -1.0F, 11.0F, -5.0F, 2, 1, 4, 0.0F));

		ModelRenderer RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(1.9F, 11.5F, -3.0F);
		this.bipedRightLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.2182F, 0.0F, 0.0F);
		RightLeg_r1.cubeList.add(new ModelBox(RightLeg_r1, 26, 6, -2.9F, -1.0F, -2.0F, 2, 1, 4, 0.0F));

		ModelRenderer RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(1.9F, 9.3F, -2.4F);
		this.bipedRightLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, -0.5672F, 0.0F, 0.0F);
		RightLeg_r2.cubeList.add(new ModelBox(RightLeg_r2, 27, 33, -3.4F, -2.0F, -2.0F, 3, 3, 2, -1.0F));

		ModelRenderer RightLeg_r3 = new ModelRenderer(this);
		RightLeg_r3.setRotationPoint(1.9F, 10.4F, 0.8F);
		this.bipedRightLeg.addChild(RightLeg_r3);
		setRotationAngle(RightLeg_r3, -0.3491F, 0.0F, 0.0F);
		RightLeg_r3.cubeList.add(new ModelBox(RightLeg_r3, 0, 6, -4.9F, -3.0F, 0.0F, 6, 4, 2, -1.0F));

		ModelRenderer RightLeg_r4 = new ModelRenderer(this);
		RightLeg_r4.setRotationPoint(1.9F, 10.4F, -0.8F);
		this.bipedRightLeg.addChild(RightLeg_r4);
		setRotationAngle(RightLeg_r4, 0.3491F, 0.0F, 0.0F);
		RightLeg_r4.cubeList.add(new ModelBox(RightLeg_r4, 16, 0, -4.9F, -3.0F, -2.0F, 6, 4, 2, -1.0F));
		RightLeg_r4.cubeList.add(new ModelBox(RightLeg_r4, 12, 20, -3.9F, -4.0F, -2.0F, 4, 5, 2, -1.0F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 12, 14, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 32, 0, -1.0F, 10.0F, 1.0F, 2, 3, 3, -1.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 30, -1.0F, 9.4F, 0.3F, 2, 3, 3, -1.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 25, -1.5F, 10.5F, 1.0F, 3, 2, 3, -1.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 14, 0, -1.0F, 6.1F, -2.7F, 2, 2, 0, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 26, 11, -1.0F, 11.0F, -5.0F, 2, 1, 4, 0.0F));

		ModelRenderer LeftLeg_r1 = new ModelRenderer(this);
		LeftLeg_r1.setRotationPoint(-1.9F, 11.5F, -3.0F);
		this.bipedLeftLeg.addChild(LeftLeg_r1);
		setRotationAngle(LeftLeg_r1, 0.2182F, 0.0F, 0.0F);
		LeftLeg_r1.cubeList.add(new ModelBox(LeftLeg_r1, 20, 25, 0.9F, -1.0F, -2.0F, 2, 1, 4, 0.0F));

		ModelRenderer LeftLeg_r2 = new ModelRenderer(this);
		LeftLeg_r2.setRotationPoint(-1.9F, 9.3F, -2.4F);
		this.bipedLeftLeg.addChild(LeftLeg_r2);
		setRotationAngle(LeftLeg_r2, -0.5672F, 0.0F, 0.0F);
		LeftLeg_r2.cubeList.add(new ModelBox(LeftLeg_r2, 33, 16, 0.3F, -2.0F, -2.0F, 3, 3, 2, -1.0F));

		ModelRenderer LeftLeg_r3 = new ModelRenderer(this);
		LeftLeg_r3.setRotationPoint(-1.9F, 10.4F, 0.8F);
		this.bipedLeftLeg.addChild(LeftLeg_r3);
		setRotationAngle(LeftLeg_r3, -0.3491F, 0.0F, 0.0F);
		LeftLeg_r3.cubeList.add(new ModelBox(LeftLeg_r3, 0, 0, -1.1F, -3.0F, 0.0F, 6, 4, 2, -1.0F));

		ModelRenderer LeftLeg_r4 = new ModelRenderer(this);
		LeftLeg_r4.setRotationPoint(-1.9F, 10.4F, -0.8F);
		this.bipedLeftLeg.addChild(LeftLeg_r4);
		setRotationAngle(LeftLeg_r4, 0.3491F, 0.0F, 0.0F);
		LeftLeg_r4.cubeList.add(new ModelBox(LeftLeg_r4, 0, 12, -1.1F, -3.0F, -2.0F, 6, 4, 2, -1.0F));
		LeftLeg_r4.cubeList.add(new ModelBox(LeftLeg_r4, 0, 18, -0.1F, -4.0F, -2.0F, 4, 5, 2, -1.0F));
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