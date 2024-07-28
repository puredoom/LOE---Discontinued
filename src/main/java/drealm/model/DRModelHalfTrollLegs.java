package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelHalfTrollLegs extends LOTRModelBiped {

	public DRModelHalfTrollLegs() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -1.2F, 0.0F, -2.0F, 3, 10, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 10, 10, -2.0F, 0.0F, -2.0F, 1, 10, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 14, 0, -2.5F, 5.0F, -2.5F, 3, 2, 3, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 14, 5, -2.5F, 8.0F, -2.5F, 3, 1, 3, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 22, 9, 0.0F, 0.0F, -3.0F, 2, 3, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 6, 14, -1.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 16, 9, 1.0F, 3.0F, -3.0F, 1, 2, 1, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.3F, 2.3F, 0.3F);
		this.bipedRightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 19, 2.0574F, 0.7333F, -2.9F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 2, 2.0574F, 2.7333F, -2.9F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 19, 2.0574F, 2.7333F, 2.1F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 14, 2.0574F, 1.7333F, -1.9F, 1, 1, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 14, 2.0574F, 0.7333F, 2.1F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 0, 1.5574F, 0.3333F, 2.0F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 5, 1.5574F, 0.3333F, -3.0F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 24, 1.0574F, -0.6667F, -4.3F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 24, 1.0574F, -0.6667F, 0.7F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 9, 1.5574F, -0.6667F, -2.0F, 1, 1, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 16, 1.5574F, -1.6667F, 2.0F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 19, 1.0574F, -2.6667F, -4.3F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 14, 1.0574F, -1.6667F, -3.3F, 1, 1, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 24, 1.0574F, -2.6667F, 0.7F, 1, 1, 1, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.2F, 2.0F, 0.3F);
		this.bipedRightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7418F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 24, -4.0F, 1.0F, 2.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 24, -4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 21, -4.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -4.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 21, -4.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.5672F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 0, -1.2F, 0.0F, -3.1F, 2, 1, 1, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.2182F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -0.6F, -0.2F, 1.0F, 1, 3, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 14, -0.6F, -0.2F, -2.0F, 1, 3, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 19, -0.6F, -0.2F, -1.0F, 1, 5, 2, 0.0F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 10, 10, 1.0F, 0.0F, -2.0F, 1, 10, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 14, 5, -0.5F, 8.0F, -2.5F, 3, 1, 3, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 14, 0, -0.5F, 5.0F, -2.5F, 3, 2, 3, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -1.8F, 0.0F, -2.0F, 3, 10, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 16, 9, -2.0F, 3.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 22, 9, -2.0F, 0.0F, -3.0F, 2, 3, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 6, 14, 0.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(5.3F, 2.3F, 0.3F);
		this.bipedLeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3054F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 19, -3.0574F, 0.7333F, -2.9F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 2, -3.0574F, 2.7333F, -2.9F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 19, -3.0574F, 2.7333F, 2.1F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 14, -3.0574F, 1.7333F, -1.9F, 1, 1, 4, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 14, -3.0574F, 0.7333F, 2.1F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 0, -2.5574F, 0.3333F, 2.0F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 23, 5, -2.5574F, 0.3333F, -3.0F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 24, -2.0574F, -0.6667F, -4.3F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 24, -2.0574F, -0.6667F, 0.7F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 9, -2.5574F, -0.6667F, -2.0F, 1, 1, 4, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 16, -2.5574F, -1.6667F, 2.0F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 19, -2.0574F, -2.6667F, -4.3F, 1, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 14, -2.0574F, -1.6667F, -3.3F, 1, 1, 4, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 24, -2.0574F, -2.6667F, 0.7F, 1, 1, 1, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.2F, 2.0F, 0.3F);
		this.bipedLeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7418F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 24, 3.0F, 1.0F, 2.0F, 1, 1, 1, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 24, 3.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 21, 3.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 19, 3.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 21, 3.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.5672F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 0, -0.8F, 0.0F, -3.1F, 2, 1, 1, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.2182F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 14, -0.4F, -0.2F, -2.0F, 1, 3, 1, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 19, -0.4F, -0.2F, -1.0F, 1, 5, 2, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.4F, -0.2F, 1.0F, 1, 3, 1, 0.0F));
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