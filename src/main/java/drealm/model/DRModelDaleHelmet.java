package drealm.model;// Made with Blockbench 4.10.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDaleHelmet extends LOTRModelBiped {

	public DRModelDaleHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.5F, -8.25F, -4.5F, 9, 1, 9, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 10, -4.0F, -8.75F, -4.0F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 27, 0, -3.5F, -9.25F, -3.5F, 7, 1, 7, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 20, 38, -2.5F, -10.25F, -2.5F, 5, 1, 5, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 15, -2.0F, -10.75F, -2.0F, 4, 1, 4, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 35, 38, -1.5F, -11.25F, -1.5F, 3, 1, 3, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 8, -3.0F, -9.75F, -3.0F, 6, 1, 6, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 12, -0.5F, -7.25F, -4.25F, 1, 1, 1, 0.5F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -8.5F, 0.5F);
		this.bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.6109F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -0.5F, -6.5F, -1.0F, 1, 4, 1, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -8.5F, 0.5F);
		this.bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.6109F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 10, -0.5F, -6.5F, -1.0F, 1, 4, 1, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -12.0F, 0.5F);
		this.bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 19, -1.0F, -3.0F, -1.0F, 1, 4, 1, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -8.5F, 0.5F);
		this.bipedHead.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 1.1781F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.5F, -6.5F, -1.0F, 1, 4, 1, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -8.5F, 0.5F);
		this.bipedHead.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -1.1781F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 19, -0.5F, -6.5F, -1.0F, 1, 4, 1, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5F, -5.0F, 5.3F);
		this.bipedHead.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1745F, 0.0F, -0.1745F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 19, 3.0F, -2.0F, -1.0F, 2, 9, 1, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, -5.0F, 5.3F);
		this.bipedHead.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1745F, 0.0F, 0.1745F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 19, -5.0F, -2.0F, -1.0F, 2, 9, 1, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, -5.0F, 5.3F);
		this.bipedHead.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1745F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 37, -5.0F, -2.0F, -1.0F, 9, 9, 1, 0.0F));

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-5.4F, 0.0F, 0.2F);
		this.bipedHead.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.2618F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 19, -1.0F, -7.0F, -5.0F, 1, 7, 10, 0.0F));

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(5.4F, 0.0F, 0.2F);
		this.bipedHead.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.2618F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 10, 0.0F, -7.0F, -5.0F, 1, 7, 10, 0.0F));

		ModelRenderer HatLayer_r1 = new ModelRenderer(this);
		HatLayer_r1.setRotationPoint(-4.0F, -7.0F, 0.0F);
		this.bipedHead.addChild(HatLayer_r1);
		setRotationAngle(HatLayer_r1, 0.0F, 0.0F, 0.2618F);
		HatLayer_r1.cubeList.add(new ModelBox(HatLayer_r1, 26, 28, 0.0F, 7.0F, -4.3F, 2, 1, 9, 0.5F));

		ModelRenderer HatLayer_r2 = new ModelRenderer(this);
		HatLayer_r2.setRotationPoint(-1.7F, -15.0F, 1.5F);
		this.bipedHead.addChild(HatLayer_r2);
		setRotationAngle(HatLayer_r2, -0.0067F, -0.01F, -0.5655F);
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 0, 15, -3.0F, 0.0F, -2.0F, 2, 1, 1, 0.5F));

		ModelRenderer HatLayer_r3 = new ModelRenderer(this);
		HatLayer_r3.setRotationPoint(-1.7F, -15.0F, 1.5F);
		this.bipedHead.addChild(HatLayer_r3);
		setRotationAngle(HatLayer_r3, -0.0067F, -0.01F, -0.9146F);
		HatLayer_r3.cubeList.add(new ModelBox(HatLayer_r3, 0, 2, -6.5F, -1.1F, -2.0F, 3, 1, 1, 0.5F));

		ModelRenderer HatLayer_r4 = new ModelRenderer(this);
		HatLayer_r4.setRotationPoint(0.0F, -6.25F, 0.6F);
		this.bipedHead.addChild(HatLayer_r4);
		setRotationAngle(HatLayer_r4, 0.0F, 0.0F, 0.7854F);
		HatLayer_r4.cubeList.add(new ModelBox(HatLayer_r4, 6, 24, 0.0F, 0.0F, -5.0F, 1, 1, 1, 0.5F));

		ModelRenderer HatLayer_r5 = new ModelRenderer(this);
		HatLayer_r5.setRotationPoint(1.7F, -15.0F, 1.5F);
		this.bipedHead.addChild(HatLayer_r5);
		setRotationAngle(HatLayer_r5, -0.0067F, 0.01F, 0.9146F);
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 0, 0, 3.5F, -1.1F, -2.0F, 3, 1, 1, 0.5F));

		ModelRenderer HatLayer_r6 = new ModelRenderer(this);
		HatLayer_r6.setRotationPoint(1.7F, -15.0F, 1.5F);
		this.bipedHead.addChild(HatLayer_r6);
		setRotationAngle(HatLayer_r6, -0.0067F, 0.01F, 0.5655F);
		HatLayer_r6.cubeList.add(new ModelBox(HatLayer_r6, 24, 10, 1.0F, 0.0F, -2.0F, 2, 1, 1, 0.5F));

		ModelRenderer HatLayer_r7 = new ModelRenderer(this);
		HatLayer_r7.setRotationPoint(0.0F, -7.75F, 1.5F);
		this.bipedHead.addChild(HatLayer_r7);
		setRotationAngle(HatLayer_r7, 0.0F, 0.0F, 0.0F);
		HatLayer_r7.cubeList.add(new ModelBox(HatLayer_r7, 39, 27, -2.0F, -6.9F, -2.0F, 4, 1, 1, 0.5F));

		ModelRenderer HatLayer_r8 = new ModelRenderer(this);
		HatLayer_r8.setRotationPoint(4.0F, -7.0F, 0.0F);
		this.bipedHead.addChild(HatLayer_r8);
		setRotationAngle(HatLayer_r8, 0.0F, 0.0F, -0.2618F);
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 13, 27, -2.0F, 7.0F, -4.3F, 2, 1, 9, 0.5F));


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