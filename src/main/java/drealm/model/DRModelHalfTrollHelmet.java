package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelHalfTrollHelmet extends LOTRModelBiped {

	public DRModelHalfTrollHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.0F, -11.0F, -8.0F, 8, 1, 12, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 13, -2.0F, -12.0F, -8.0F, 4, 1, 12, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 40, 29, -1.0F, -14.0F, -8.0F, 2, 2, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 39, -0.5F, -15.0F, -8.5F, 1, 4, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 15, 37, -0.5F, -15.0F, -4.5F, 1, 4, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 26, -0.5F, -15.0F, -0.5F, 1, 4, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 13, -0.5F, -13.5F, 3.5F, 1, 4, 4, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 22, -1.0F, -14.0F, -4.0F, 2, 2, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 26, 13, -1.0F, -14.0F, 0.0F, 2, 2, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 38, 38, -2.0F, -11.0F, 4.0F, 4, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 31, 38, -1.0F, -13.0F, 4.0F, 2, 3, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -2.0F, -10.0F, 5.0F, 4, 11, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 40, 12, -1.0F, -8.0F, 5.0F, 2, 2, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 31, -0.5F, -8.5F, 5.0F, 1, 3, 4, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 13, -0.5F, -4.5F, 5.0F, 1, 3, 4, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 20, 20, -1.0F, -4.0F, 5.0F, 2, 2, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 28, 0, -4.0F, -10.0F, 4.0F, 8, 11, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 20, -3.0F, -11.0F, -9.0F, 6, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 21, -2.0F, -11.0F, -11.0F, 4, 1, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 18, 34, -1.0F, -11.0F, -13.0F, 2, 1, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 18, 4.0F, -11.0F, -4.0F, 1, 5, 8, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, 3.0F, -10.0F, -6.0F, 1, 1, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 33, -4.0F, -6.0F, -6.0F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.0F, -10.0F, -6.0F, 1, 1, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 19, 29, -4.6F, -5.75F, -3.35F, 1, 2, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 18, -5.0F, -11.0F, -4.0F, 1, 5, 8, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 20, 13, 3.0F, -9.0F, -8.0F, 1, 3, 4, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 31, 3.0F, -6.0F, -8.0F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 33, 3.0F, -6.0F, -6.0F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 20, 13, -4.0F, -9.0F, -8.0F, 1, 3, 4, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 34, 31, -4.0F, -6.0F, -8.0F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 26, 3.6F, -10.75F, -4.6F, 1, 5, 8, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, 3.6F, -10.75F, 2.65F, 1, 5, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, 3.6F, -5.75F, 2.65F, 1, 5, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 1, 1, 2.85F, -6.75F, 3.15F, 2, 6, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 1, 1, 2.85F, -6.75F, -0.85F, 2, 4, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 6, 13, 2.85F, -6.75F, -2.85F, 2, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 1, 1, 2.85F, -6.75F, 1.15F, 2, 5, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, 3.6F, -5.75F, 0.65F, 1, 4, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, 3.6F, -5.75F, -1.35F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 19, 29, 3.6F, -5.75F, -3.35F, 1, 2, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 26, -4.6F, -10.75F, -4.6F, 1, 5, 8, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.6F, -10.75F, 2.65F, 1, 5, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 6, 13, -4.85F, -6.75F, -2.85F, 2, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.6F, -5.75F, 0.65F, 1, 4, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.6F, -5.75F, -1.35F, 1, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.6F, -5.75F, 2.65F, 1, 5, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 1, 1, -4.85F, -6.75F, 3.15F, 2, 6, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 1, 1, -4.85F, -6.75F, 1.15F, 2, 5, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 1, 1, -4.85F, -6.75F, -0.85F, 2, 4, 1, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-9.75F, -17.95F, -2.5F);
		this.bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.9904F, -0.4469F, -0.2885F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 53, -1.4908F, -2.6431F, -1.5916F, 2, 3, 2, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 3, 50, -0.9908F, -5.6431F, -1.0916F, 1, 3, 1, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-9.75F, -15.75F, -1.0F);
		this.bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6536F, -0.2363F, -0.454F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 13, -0.904F, -2.7368F, -1.7265F, 2, 3, 2, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.5F, -11.5F, 2.0F);
		this.bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3873F, -0.0665F, -0.7112F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 47, -0.7921F, -6.1207F, -2.5F, 2, 3, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 58, -1.2921F, -3.1207F, -3.0F, 3, 3, 3, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.0F, -10.0F, 0.0F);
		this.bipedHead.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.8727F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 0, -1.75F, -3.0F, -1.0F, 3, 3, 3, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(9.75F, -17.95F, -2.5F);
		this.bipedHead.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.9904F, 0.4469F, 0.2885F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 3, 50, -0.0092F, -5.6431F, -1.0916F, 1, 3, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 53, -0.5092F, -2.6431F, -1.5916F, 2, 3, 2, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(9.75F, -15.75F, -1.0F);
		this.bipedHead.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6536F, 0.2363F, 0.454F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 13, -1.096F, -2.7368F, -1.7265F, 2, 3, 2, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(6.5F, -11.5F, 2.0F);
		this.bipedHead.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3873F, 0.0665F, 0.7112F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 30, 47, -1.2079F, -6.1207F, -2.5F, 2, 3, 2, 0.0F));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 52, 58, -1.7079F, -3.1207F, -3.0F, 3, 3, 3, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.0F, -10.0F, 0.0F);
		this.bipedHead.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8727F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 0, -1.25F, -3.0F, -1.0F, 3, 3, 3, 0.0F));

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(4.0F, -9.0F, -8.0F);
		this.bipedHead.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1201F, 0.4205F, -0.2875F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, -1.0F, -2.0F, -8.0F, 1, 3, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 31, -1.0F, -2.0F, -6.0F, 1, 3, 6, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 26, -1.0F, -2.0F, -7.0F, 1, 2, 1, 0.0F));

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.0F, -7.0F, -8.0F);
		this.bipedHead.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -0.4363F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 13, 0.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 26, 20, 0.0F, 0.0F, -6.0F, 1, 2, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 1, 1, 0.0F, -2.0F, -8.0F, 1, 4, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 44, 0.0F, -2.0F, -9.0F, 1, 5, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 13, 0.0F, 0.0F, -2.0F, 1, 2, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 26, 0.0F, -1.0F, -7.0F, 1, 1, 7, 0.0F));

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(4.0F, -7.0F, -8.0F);
		this.bipedHead.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.4363F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 14, 44, -1.0F, -2.0F, -9.0F, 1, 5, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 13, -1.0F, 0.0F, -2.0F, 1, 2, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 13, -1.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 26, 20, -1.0F, 0.0F, -6.0F, 1, 2, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 1, 1, -1.0F, -2.0F, -8.0F, 1, 4, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 26, -1.0F, -1.0F, -7.0F, 1, 1, 7, 0.0F));

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.0F, -9.0F, -8.0F);
		this.bipedHead.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.1201F, -0.4205F, 0.2875F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 26, 0.0F, -2.0F, -7.0F, 1, 2, 1, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 13, 0.0F, -2.0F, -8.0F, 1, 3, 1, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 31, 0.0F, -2.0F, -6.0F, 1, 3, 6, 0.0F));
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