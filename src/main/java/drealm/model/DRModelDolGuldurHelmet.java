package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDolGuldurHelmet extends LOTRModelBiped {


	public DRModelDolGuldurHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 9, -4.0F, -8.0F, -4.0F, 8, 1, 8, 0.5F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.4F, -4.0F, 8, 1, 8, 0.5F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 18, -3.5F, -8.9F, -3.5F, 7, 1, 7, 0.5F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 9, 43, 0.5F, -3.5F, -6.7F, 2, 8, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 42, 42, -2.5F, -3.5F, -6.7F, 2, 8, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 24, 0, 3.5F, -6.5F, -4.5F, 1, 6, 9, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 48, 7, 3.9F, -8.5F, -4.0F, 1, 2, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 35, 5, 3.5F, -0.5F, 1.5F, 1, 1, 3, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 39, 27, -4.5F, -0.5F, 1.5F, 1, 1, 3, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 26, -3.5F, -6.5F, 3.5F, 7, 7, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 15, 33, -1.0F, -8.5F, 3.9F, 2, 12, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 44, 24, -3.0F, -8.5F, 3.9F, 2, 3, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 47, 28, -5.0F, -8.5F, 3.9F, 2, 2, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 44, 31, -5.0F, -8.5F, -4.8F, 2, 2, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 24, 15, -2.5F, 0.5F, 3.5F, 5, 1, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 24, 4, -4.5F, -0.5F, -4.5F, 1, 1, 3, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 24, 0, 3.5F, -0.5F, -4.5F, 1, 1, 3, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 19, 18, -4.5F, -6.5F, -4.5F, 1, 6, 9, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 27, 33, -4.9F, -8.5F, -1.0F, 1, 10, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 44, 8, -4.9F, -8.5F, 1.0F, 1, 3, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 43, 36, -4.9F, -8.5F, -3.0F, 1, 3, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 5, 48, -4.9F, -8.5F, 3.0F, 1, 2, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 29, 4, -4.9F, -8.5F, -4.0F, 1, 2, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 45, 0, 3.0F, -8.5F, -4.8F, 2, 2, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 30, 24, -3.0F, -8.5F, -4.8F, 6, 2, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 44, 13, 1.0F, -8.5F, 3.9F, 2, 3, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 21, 33, 3.9F, -8.5F, -1.0F, 1, 10, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 44, 3.9F, -8.5F, -3.0F, 1, 3, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 43, 3, 3.9F, -8.5F, 1.0F, 1, 3, 2, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 29, 0, 3.9F, -8.5F, 3.0F, 1, 2, 1, 0.0F));
		bipedHead.cubeList.add(new ModelBox(bipedHead, 24, 45, 3.0F, -8.5F, 3.9F, 2, 2, 1, 0.0F));

		ModelRenderer HatLayer_r1 = new ModelRenderer(this);
		HatLayer_r1.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(HatLayer_r1);
		setRotationAngle(HatLayer_r1, -0.2673F, 0.1715F, 0.5417F);
		HatLayer_r1.cubeList.add(new ModelBox(HatLayer_r1, 45, 34, -2.2349F, -5.079F, -0.0664F, 2, 1, 1, 0.5F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1201F, 0.2815F, 1.1611F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -0.6886F, -4.7381F, 0.0F, 1, 6, 1, 0.0F));

		ModelRenderer HatLayer_r2 = new ModelRenderer(this);
		HatLayer_r2.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(HatLayer_r2);
		setRotationAngle(HatLayer_r2, -0.1972F, -0.2504F, -0.8896F);
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 0, 6, -3.8008F, -7.4677F, -0.0697F, 3, 1, 1, 0.5F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1201F, -0.2815F, -1.1611F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 21, 18, -1.6125F, -7.8793F, 0.0F, 1, 6, 1, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2528F, -0.1733F, -0.5888F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 34, -2.1793F, -7.0655F, 0.0F, 1, 6, 1, 0.0F));

		ModelRenderer HatLayer_r3 = new ModelRenderer(this);
		HatLayer_r3.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(HatLayer_r3);
		setRotationAngle(HatLayer_r3, -0.2673F, -0.1715F, -0.5417F);
		HatLayer_r3.cubeList.add(new ModelBox(HatLayer_r3, 47, 3, -2.6356F, -6.901F, -0.0498F, 2, 1, 1, 0.5F));

		ModelRenderer HatLayer_r4 = new ModelRenderer(this);
		HatLayer_r4.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(HatLayer_r4);
		setRotationAngle(HatLayer_r4, -0.3054F, 0.0F, 0.0F);
		HatLayer_r4.cubeList.add(new ModelBox(HatLayer_r4, 35, 16, -3.7F, -5.65F, 0.0F, 4, 1, 1, 0.5F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 43, -2.2F, -6.0F, 0.0F, 1, 6, 1, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2528F, 0.1733F, 0.5888F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 43, -1.6058F, -5.1153F, 0.0F, 1, 6, 1, 0.0F));

		ModelRenderer HatLayer_r5 = new ModelRenderer(this);
		HatLayer_r5.setRotationPoint(1.7F, -9.0F, -0.5F);
		bipedHead.addChild(HatLayer_r5);
		setRotationAngle(HatLayer_r5, -0.1972F, 0.2504F, 0.8896F);
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 0, 15, -1.2736F, -4.7738F, -0.0724F, 3, 1, 1, 0.5F));

		ModelRenderer HatLayer_r6 = new ModelRenderer(this);
		HatLayer_r6.setRotationPoint(-0.7F, -7.0F, -5.0F);
		bipedHead.addChild(HatLayer_r6);
		setRotationAngle(HatLayer_r6, -0.3491F, 0.0F, 0.0F);
		HatLayer_r6.cubeList.add(new ModelBox(HatLayer_r6, 20, 45, 0.2F, -0.4F, 0.5F, 1, 4, 1, 0.0F));

		ModelRenderer HatLayer_r7 = new ModelRenderer(this);
		HatLayer_r7.setRotationPoint(-2.0F, 0.0F, -7.0F);
		bipedHead.addChild(HatLayer_r7);
		setRotationAngle(HatLayer_r7, 0.0F, 0.829F, 0.0F);
		HatLayer_r7.cubeList.add(new ModelBox(HatLayer_r7, 24, 48, -1.5F, 1.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r7.cubeList.add(new ModelBox(HatLayer_r7, 25, 33, -2.5F, -4.5F, -0.1F, 1, 1, 1, 0.0F));
		HatLayer_r7.cubeList.add(new ModelBox(HatLayer_r7, 48, 40, -3.5F, -5.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r7.cubeList.add(new ModelBox(HatLayer_r7, 0, 0, -3.5F, -3.5F, -0.1F, 3, 5, 1, 0.0F));

		ModelRenderer HatLayer_r8 = new ModelRenderer(this);
		HatLayer_r8.setRotationPoint(-0.7F, -7.0F, -4.9F);
		bipedHead.addChild(HatLayer_r8);
		setRotationAngle(HatLayer_r8, -0.3381F, -0.0886F, -0.2467F);
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 15, 46, -0.5F, -0.4F, 0.5F, 1, 3, 1, 0.0F));

		ModelRenderer HatLayer_r9 = new ModelRenderer(this);
		HatLayer_r9.setRotationPoint(0.7F, -7.0F, -4.9F);
		bipedHead.addChild(HatLayer_r9);
		setRotationAngle(HatLayer_r9, -0.3381F, 0.0886F, 0.2467F);
		HatLayer_r9.cubeList.add(new ModelBox(HatLayer_r9, 29, 47, -0.5F, -0.4F, 0.5F, 1, 3, 1, 0.0F));

		ModelRenderer HatLayer_r10 = new ModelRenderer(this);
		HatLayer_r10.setRotationPoint(2.0F, 0.0F, -7.0F);
		bipedHead.addChild(HatLayer_r10);
		setRotationAngle(HatLayer_r10, 0.0F, -0.829F, 0.0F);
		HatLayer_r10.cubeList.add(new ModelBox(HatLayer_r10, 48, 43, 2.5F, -5.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r10.cubeList.add(new ModelBox(HatLayer_r10, 39, 31, 1.5F, -4.5F, -0.1F, 1, 1, 1, 0.0F));
		HatLayer_r10.cubeList.add(new ModelBox(HatLayer_r10, 0, 9, 0.5F, -3.5F, -0.1F, 3, 5, 1, 0.0F));
		HatLayer_r10.cubeList.add(new ModelBox(HatLayer_r10, 48, 46, 0.5F, 1.5F, -0.1F, 1, 2, 1, 0.0F));

		ModelRenderer bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);


		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.7F, -33.0F, -0.5F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2F, 0.2324F, 0.8492F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 34, -1.443F, -9.0991F, 0.0F, 4, 4, 1, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.7F, -33.0F, -0.5F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3043F, 0.0262F, 0.0832F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 33, -12.4231F, -3.6008F, 0.0F, 5, 4, 1, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.7F, -33.0F, -0.5F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2451F, -0.1841F, -0.6318F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 38, -3.3804F, -11.2521F, 0.0F, 4, 4, 1, 0.0F));

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.7F, -33.0F, -0.5F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3054F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 18, -6.2F, -9.4F, 0.0F, 9, 5, 1, 0.0F));

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.7F, -33.0F, -0.5F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2F, -0.2324F, -0.8492F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 0, -4.7425F, -11.7036F, 0.0F, 4, 4, 1, 0.0F));

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.7F, -33.0F, -0.5F);
		bb_main.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2451F, 0.1841F, 0.6318F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 39, -3.317F, -9.1823F, 0.0F, 4, 4, 1, 0.0F));

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.7F, -33.0F, -0.5F);
		bb_main.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.3043F, -0.0262F, -0.0832F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 33, 4.0361F, -3.8972F, 0.0F, 5, 4, 1, 0.0F));


		bipedHead.addChild(bb_main);
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