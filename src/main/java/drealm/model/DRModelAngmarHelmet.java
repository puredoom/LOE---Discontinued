package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.world.gen.layer.GenLayerEdge;

public class DRModelAngmarHelmet extends LOTRModelBiped {

	public DRModelAngmarHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 9, -4.0F, -8.0F, -4.0F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.0F, -8.4F, -4.0F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 18, -3.5F, -8.9F, -3.5F, 7, 1, 7, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 42, 32, 0.5F, -3.5F, -6.7F, 2, 8, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 48, 31, 0.5F, 4.5F, -6.7F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 41, -2.5F, -3.5F, -6.7F, 2, 8, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 21, 48, -1.5F, 4.5F, -6.7F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 0, 3.5F, -6.5F, -4.5F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 40, 46, 3.9F, -8.5F, -4.0F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 41, 12, 3.5F, -0.5F, 1.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 39, 42, -4.5F, -0.5F, 1.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 26, -3.5F, -6.5F, 3.5F, 7, 7, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 33, -1.0F, -8.5F, 3.9F, 2, 12, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 44, 41, -3.0F, -8.5F, 3.9F, 2, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 46, -5.0F, -8.5F, 3.9F, 2, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 44, 23, -5.0F, -8.5F, -4.8F, 2, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 35, 6, -2.5F, 0.5F, 3.5F, 5, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 4, -4.5F, -0.5F, -4.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 0, 3.5F, -0.5F, -4.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 19, 18, -4.5F, -6.5F, -4.5F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 10, 39, -4.9F, -8.5F, -1.0F, 1, 10, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 45, 0, -4.9F, -8.5F, 1.0F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 21, 18, -4.9F, -8.5F, -3.0F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 6, 46, -4.9F, -8.5F, 3.0F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 29, 4, -4.9F, -8.5F, -4.0F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 46, 12, 3.0F, -8.5F, -4.8F, 2, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 23, -3.0F, -8.5F, -4.8F, 6, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 44, 8, 1.0F, -8.5F, 3.9F, 2, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 36, 33, 3.9F, -8.5F, -1.0F, 1, 10, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 44, 3.9F, -8.5F, -3.0F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 18, 3.9F, -8.5F, 1.0F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 29, 0, 3.9F, -8.5F, 3.0F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 46, 3.0F, -8.5F, 3.9F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.9F, -7.0F, 3.4F);
		this.bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6545F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 20, -1.0F, -2.0F, -1.0F, 0, 1, 3, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 21, -2.9F, -2.0F, -1.0F, 0, 1, 3, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 13, -4.8F, -2.0F, -1.0F, 0, 1, 3, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 4, -6.9F, -2.0F, -1.0F, 0, 1, 3, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, -7.8F, 5.5F);
		this.bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.829F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, -1.0F, -2.0F, -1.0F, 0, 1, 3, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 12, -5.0F, -2.0F, -1.0F, 0, 1, 3, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.0F, -7.8F, 5.5F);
		this.bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3491F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, -1.0F, -2.0F, -1.0F, 0, 1, 4, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.4F, -7.0F, 0.1F);
		this.bipedHead.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.6545F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 7, -2.0F, -2.0F, -1.0F, 3, 1, 0, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 27, -2.0F, -2.0F, 2.8F, 3, 1, 0, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 46, -2.0F, -2.0F, -3.1F, 3, 1, 0, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 48, -2.0F, -2.0F, 0.9F, 3, 1, 0, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.5F, -7.8F, 3.0F);
		this.bipedHead.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.829F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 24, -2.0F, -2.0F, -1.0F, 3, 1, 0, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 34, -2.0F, -2.0F, -5.0F, 3, 1, 0, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-5.5F, -7.8F, 1.0F);
		this.bipedHead.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 26, -3.0F, -2.0F, -1.0F, 4, 1, 0, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.2F, -7.8F, 5.6F);
		this.bipedHead.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3037F, 0.6878F, 0.4586F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 16, -3.0F, -2.0F, -1.0F, 4, 1, 0, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.5F, -7.5F, -4.0F);
		this.bipedHead.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2795F, -0.6485F, 0.4436F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 15, -3.0F, -2.0F, -1.0F, 4, 1, 0, 0.0F));

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.4F, -7.0F, 2.0F);
		this.bipedHead.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.6545F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 40, -1.0F, -2.0F, -1.0F, 3, 1, 0, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 26, -1.0F, -2.0F, -5.0F, 3, 1, 0, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 45, -1.0F, -2.0F, -2.9F, 3, 1, 0, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 47, -1.0F, -2.0F, 0.9F, 3, 1, 0, 0.0F));

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(5.5F, -7.8F, 3.0F);
		this.bipedHead.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.829F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 45, 5, -1.0F, -2.0F, -1.0F, 3, 1, 0, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 46, 6, -1.0F, -2.0F, -5.0F, 3, 1, 0, 0.0F));

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(5.5F, -7.5F, -4.0F);
		this.bipedHead.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2795F, 0.6485F, -0.4436F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 26, -1.0F, -2.0F, -1.0F, 4, 1, 0, 0.0F));

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(4.2F, -7.8F, 5.6F);
		this.bipedHead.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3037F, -0.6878F, -0.4586F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 15, -1.0F, -2.0F, -1.0F, 4, 1, 0, 0.0F));

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(5.5F, -7.8F, 1.0F);
		this.bipedHead.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3491F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 8, -1.0F, -2.0F, -1.0F, 4, 1, 0, 0.0F));

		ModelRenderer HatLayer_r1 = new ModelRenderer(this);
		HatLayer_r1.setRotationPoint(-0.7F, -7.0F, -5.0F);
		this.bipedHead.addChild(HatLayer_r1);
		setRotationAngle(HatLayer_r1, -0.3491F, 0.0F, 0.0F);
		HatLayer_r1.cubeList.add(new ModelBox(HatLayer_r1, 6, 41, 0.2F, -0.4F, 0.5F, 1, 4, 1, 0.0F));

		ModelRenderer HatLayer_r2 = new ModelRenderer(this);
		HatLayer_r2.setRotationPoint(-2.0F, 0.0F, -7.0F);
		this.bipedHead.addChild(HatLayer_r2);
		setRotationAngle(HatLayer_r2, 0.0F, 0.829F, 0.0F);
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 44, 46, -1.5F, 1.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 43, 0, -2.5F, -4.5F, -0.1F, 1, 1, 1, 0.0F));
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 48, 15, -3.5F, -5.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 0, 0, -3.5F, -3.5F, -0.1F, 3, 5, 1, 0.0F));

		ModelRenderer HatLayer_r3 = new ModelRenderer(this);
		HatLayer_r3.setRotationPoint(-0.7F, -7.0F, -4.9F);
		this.bipedHead.addChild(HatLayer_r3);
		setRotationAngle(HatLayer_r3, -0.3381F, -0.0886F, -0.2467F);
		HatLayer_r3.cubeList.add(new ModelBox(HatLayer_r3, 26, 40, -0.5F, -0.4F, 0.5F, 1, 3, 1, 0.0F));

		ModelRenderer HatLayer_r4 = new ModelRenderer(this);
		HatLayer_r4.setRotationPoint(0.7F, -7.0F, -4.9F);
		this.bipedHead.addChild(HatLayer_r4);
		setRotationAngle(HatLayer_r4, -0.3381F, 0.0886F, 0.2467F);
		HatLayer_r4.cubeList.add(new ModelBox(HatLayer_r4, 36, 45, -0.5F, -0.4F, 0.5F, 1, 3, 1, 0.0F));

		ModelRenderer HatLayer_r5 = new ModelRenderer(this);
		HatLayer_r5.setRotationPoint(2.0F, 0.0F, -7.0F);
		this.bipedHead.addChild(HatLayer_r5);
		setRotationAngle(HatLayer_r5, 0.0F, -0.829F, 0.0F);
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 48, 34, 2.5F, -5.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 49, 0, 1.5F, -4.5F, -0.1F, 1, 1, 1, 0.0F));
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 0, 9, 0.5F, -3.5F, -0.1F, 3, 5, 1, 0.0F));
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 48, 37, 0.5F, 1.5F, -0.1F, 1, 2, 1, 0.0F));

		ModelRenderer HatLayer_r6 = new ModelRenderer(this);
		HatLayer_r6.setRotationPoint(0.0F, -9.0F, -5.0F);
		this.bipedHead.addChild(HatLayer_r6);
		setRotationAngle(HatLayer_r6, 0.1473F, 0.4755F, 0.0678F);
		HatLayer_r6.cubeList.add(new ModelBox(HatLayer_r6, 35, 0, -4.861F, -2.5F, -1.8852F, 3, 4, 2, -1.0F));

		ModelRenderer HatLayer_r7 = new ModelRenderer(this);
		HatLayer_r7.setRotationPoint(0.0F, -9.0F, -5.0F);
		this.bipedHead.addChild(HatLayer_r7);
		setRotationAngle(HatLayer_r7, 0.1473F, -0.4755F, -0.0678F);
		HatLayer_r7.cubeList.add(new ModelBox(HatLayer_r7, 39, 26, 1.861F, -2.5F, -1.8852F, 3, 4, 2, -1.0F));

		ModelRenderer HatLayer_r8 = new ModelRenderer(this);
		HatLayer_r8.setRotationPoint(0.0F, -9.0F, -5.0F);
		this.bipedHead.addChild(HatLayer_r8);
		setRotationAngle(HatLayer_r8, 0.1309F, 0.0F, 0.0F);
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 16, 40, -1.5F, -11.5F, -0.5F, 3, 4, 2, -1.0F));
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 0, 34, -2.0F, -9.5F, -0.5F, 4, 5, 2, -1.0F));
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 14, 33, -3.0F, -6.5F, -0.5F, 6, 5, 2, -1.0F));
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 30, 16, -4.0F, -3.5F, -0.5F, 8, 5, 2, -1.0F));
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