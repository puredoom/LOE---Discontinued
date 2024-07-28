package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelBlueMountainsLegs extends LOTRModelBiped {


	public DRModelBlueMountainsLegs() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 13, 0, -2.3F, 0.0F, -2.4F, 4, 1, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 13, 0, -2.3F, 0.0F, -1.7F, 4, 1, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 12, -2.3F, 0.0F, -2.0F, 4, 9, 4, 0.25F));

		ModelRenderer bipedRightLegLayer_r1 = new ModelRenderer(this);
		bipedRightLegLayer_r1.setRotationPoint(-2.5F, 0.0F, 0.5F);
		this.bipedRightLeg.addChild(bipedRightLegLayer_r1);
		setRotationAngle(bipedRightLegLayer_r1, 0.0F, 0.0F, 0.1309F);
		bipedRightLegLayer_r1.cubeList.add(new ModelBox(bipedRightLegLayer_r1, 0, 0, 0.1F, 0.0F, -3.0F, 4, 7, 5, 0.25F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 12, -1.7F, 0.0F, -2.0F, 4, 9, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 13, 0, -1.7F, 0.0F, -2.4F, 4, 1, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 13, 0, -1.7F, 0.0F, -1.7F, 4, 1, 4, 0.25F));

		ModelRenderer bipedLeftLegLayer_r1 = new ModelRenderer(this);
		bipedLeftLegLayer_r1.setRotationPoint(2.5F, 0.0F, 0.5F);
		this.bipedLeftLeg.addChild(bipedLeftLegLayer_r1);
		setRotationAngle(bipedLeftLegLayer_r1, 0.0F, 0.0F, -0.1309F);
		bipedLeftLegLayer_r1.cubeList.add(new ModelBox(bipedLeftLegLayer_r1, 0, 0, -4.1F, 0.0F, -3.0F, 4, 7, 5, 0.25F));
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