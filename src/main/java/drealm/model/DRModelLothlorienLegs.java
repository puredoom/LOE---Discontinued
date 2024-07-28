package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelLothlorienLegs extends LOTRModelBiped {

	public DRModelLothlorienLegs() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -2.3F, 0.0F, -2.0F, 4, 9, 4, 0.25F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.1F, 4.6F, 0.2F);
		this.bipedRightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.775F, -0.0064F, 0.1682F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 10, -1.0F, -2.0F, -2.0F, 1, 3, 3, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 5, -1.0F, -4.0F, -2.0F, 1, 2, 3, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 19, -1.0F, -2.0F, -4.0F, 1, 3, 2, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.1F, 5.6F, 0.2F);
		this.bipedRightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.775F, -0.0064F, 0.1682F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 13, -1.0F, -2.0F, -2.0F, 1, 3, 3, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 0, -1.0F, -4.0F, -2.0F, 1, 2, 3, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 17, -1.0F, -2.0F, -4.0F, 1, 3, 2, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.1F, 3.6F, 0.2F);
		this.bipedRightLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.775F, -0.0064F, 0.1682F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 10, -1.0F, -2.0F, -2.0F, 1, 3, 3, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 8, 19, -1.0F, -2.0F, -4.0F, 1, 3, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 5, -1.0F, -4.0F, -2.0F, 1, 2, 3, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.9F, -12.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 0, -4.0F, 18.6F, 1.8F, 2, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 20, -4.0F, 17.6F, 1.8F, 3, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 13, -4.0F, 11.6F, 1.8F, 4, 6, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -4.0F, 19.6F, 1.8F, 1, 2, 1, 0.0F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -1.7F, 0.0F, -2.0F, 4, 9, 4, 0.25F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.9F, -12.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 13, 0.0F, 11.6F, 1.8F, 4, 6, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 0, 2.0F, 18.6F, 1.8F, 2, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 3.0F, 19.6F, 1.8F, 1, 2, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 20, 1.0F, 17.6F, 1.8F, 3, 1, 1, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.1F, 4.6F, 0.2F);
		this.bipedLeftLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.775F, 0.0064F, -0.1682F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 10, 0.0F, -2.0F, -2.0F, 1, 3, 3, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 19, 0.0F, -2.0F, -4.0F, 1, 3, 2, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 5, 0.0F, -4.0F, -2.0F, 1, 2, 3, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.1F, 3.6F, 0.2F);
		this.bipedLeftLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.775F, 0.0064F, -0.1682F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 10, 0.0F, -2.0F, -2.0F, 1, 3, 3, 0.0F));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 5, 0.0F, -4.0F, -2.0F, 1, 2, 3, 0.0F));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 19, 0.0F, -2.0F, -4.0F, 1, 3, 2, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.1F, 5.6F, 0.2F);
		this.bipedLeftLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.775F, 0.0064F, -0.1682F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 13, 0.0F, -2.0F, -2.0F, 1, 3, 3, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 0, 0.0F, -4.0F, -2.0F, 1, 2, 3, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 17, 0.0F, -2.0F, -4.0F, 1, 3, 2, 0.0F));
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