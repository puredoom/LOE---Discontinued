package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelLothlorienHelmet extends LOTRModelBiped {
	public DRModelLothlorienHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 9, -4.0F, -8.0F, -4.0F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.0F, -8.4F, -4.0F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 18, -3.5F, -8.9F, -3.5F, 7, 1, 7, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 21, 18, 0.5F, -3.5F, -6.7F, 2, 5, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 18, -2.5F, -3.5F, -6.7F, 2, 5, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 0, 3.5F, -6.5F, -4.5F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 43, 19, 3.9F, -8.5F, -4.0F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 35, 3, 3.5F, -0.5F, 1.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 36, 35, -4.5F, -0.5F, 1.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 26, -3.5F, -6.5F, 3.5F, 7, 7, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 33, -1.0F, -8.5F, 3.9F, 2, 12, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 39, 29, -3.0F, -8.5F, 3.9F, 2, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 41, 35, -5.0F, -8.5F, 3.9F, 2, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 40, 3, -5.0F, -8.5F, -4.8F, 2, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 33, -2.5F, 0.5F, 3.5F, 5, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 4, -4.5F, -0.5F, -4.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 0, 3.5F, -0.5F, -4.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 19, 18, -4.5F, -6.5F, -4.5F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 33, -4.9F, -8.5F, -1.0F, 1, 10, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 39, -4.9F, -8.5F, 1.0F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 38, 15, -4.9F, -8.5F, -3.0F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 43, 14, -4.9F, -8.5F, 3.0F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 29, 4, -4.9F, -8.5F, -4.0F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 40, 39, 3.0F, -8.5F, -4.8F, 2, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 35, 0, -3.0F, -8.5F, -4.8F, 6, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 39, 25, 1.0F, -8.5F, 3.9F, 2, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 32, 15, 3.9F, -8.5F, -1.0F, 1, 10, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 38, 20, 3.9F, -8.5F, -3.0F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 15, 37, 3.9F, -8.5F, 1.0F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 29, 0, 3.9F, -8.5F, 3.0F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 6, 41, 3.0F, -8.5F, 3.9F, 2, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 34, -0.5F, -11.2754F, 3.5398F, 1, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 20, 41, -0.5F, -10.8195F, 4.5607F, 1, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 42, -0.5F, -11.7313F, 2.519F, 1, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 29, -0.5F, -12.1872F, -2.5019F, 1, 3, 5, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -10.1F, -2.4F);
		this.bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.8762F, 0.0F, 3.1416F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 37, 0.0F, -2.4639F, -8.1812F, 1, 1, 3, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 44, 0.0F, -3.6179F, -5.0108F, 1, 3, 1, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, -10.1F, -2.4F);
		this.bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.2253F, 0.0F, -3.1416F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 34, 0.0F, -5.0978F, -8.3908F, 1, 1, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 42, 0.0F, -5.0978F, -4.3908F, 1, 3, 1, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -10.1F, -2.4F);
		this.bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.5708F, 0.0F, 3.1416F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 4, 44, 0.0F, -2.2824F, -4.9734F, 1, 3, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 6, 0.0F, -2.7256F, -3.9918F, 1, 3, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 28, 0.0F, -3.0872F, -3.0019F, 1, 3, 6, 0.0F));

		ModelRenderer HatLayer_r1 = new ModelRenderer(this);
		HatLayer_r1.setRotationPoint(-0.7F, -7.0F, -5.0F);
		this.bipedHead.addChild(HatLayer_r1);
		setRotationAngle(HatLayer_r1, -0.3491F, 0.0F, 0.0F);
		HatLayer_r1.cubeList.add(new ModelBox(HatLayer_r1, 36, 39, 0.2F, -0.4F, 0.5F, 1, 4, 1, 0.0F));

		ModelRenderer HatLayer_r2 = new ModelRenderer(this);
		HatLayer_r2.setRotationPoint(-0.7F, -7.0F, -4.9F);
		this.bipedHead.addChild(HatLayer_r2);
		setRotationAngle(HatLayer_r2, -0.3381F, -0.0886F, -0.2467F);
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 6, 34, -0.5F, -0.4F, 0.5F, 1, 3, 1, 0.0F));

		ModelRenderer HatLayer_r3 = new ModelRenderer(this);
		HatLayer_r3.setRotationPoint(0.7F, -7.0F, -4.9F);
		this.bipedHead.addChild(HatLayer_r3);
		setRotationAngle(HatLayer_r3, -0.3381F, 0.0886F, 0.2467F);
		HatLayer_r3.cubeList.add(new ModelBox(HatLayer_r3, 12, 41, -0.5F, -0.4F, 0.5F, 1, 3, 1, 0.0F));

		ModelRenderer HatLayer_r4 = new ModelRenderer(this);
		HatLayer_r4.setRotationPoint(-2.0F, 0.0F, -7.0F);
		this.bipedHead.addChild(HatLayer_r4);
		setRotationAngle(HatLayer_r4, 0.0F, 0.829F, 0.0F);
		HatLayer_r4.cubeList.add(new ModelBox(HatLayer_r4, 0, 6, -2.5F, -4.5F, -0.1F, 1, 1, 1, 0.0F));
		HatLayer_r4.cubeList.add(new ModelBox(HatLayer_r4, 8, 44, -3.5F, -5.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r4.cubeList.add(new ModelBox(HatLayer_r4, 0, 0, -3.5F, -3.5F, -0.1F, 3, 5, 1, 0.0F));

		ModelRenderer HatLayer_r5 = new ModelRenderer(this);
		HatLayer_r5.setRotationPoint(2.0F, 0.0F, -7.0F);
		this.bipedHead.addChild(HatLayer_r5);
		setRotationAngle(HatLayer_r5, 0.0F, -0.829F, 0.0F);
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 44, 10, 2.5F, -5.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 4, 6, 1.5F, -4.5F, -0.1F, 1, 1, 1, 0.0F));
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 0, 9, 0.5F, -3.5F, -0.1F, 3, 5, 1, 0.0F));
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
		this.bipedHead.render(f5);
	}
}