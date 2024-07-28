package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelRhunLegs extends LOTRModelBiped {


	public DRModelRhunLegs() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -1.2F, 0.0F, -2.0F, 3, 10, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 10, 10, -2.0F, 0.0F, -2.0F, 1, 10, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 10, 0, 0.0F, 0.0F, -3.0F, 2, 3, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -1.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 6, 14, 1.0F, 3.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -1.0F, 0.0F, 2.0F, 1, 2, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 10, 0, 0.0F, 0.0F, 2.0F, 2, 3, 1, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 6, 14, 1.0F, 3.0F, 2.0F, 1, 2, 1, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.1F, 4.0F, -3.5F);
		this.bipedRightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3491F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 20, -1.25F, -2.0F, 4.0F, 2, 2, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 10, -1.25F, -2.0F, 2.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.1F, 5.0F, -0.5F);
		this.bipedRightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 0, -1.25F, -2.0F, 0.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.1F, 7.0F, -0.5F);
		this.bipedRightLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3491F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 6, -1.25F, -2.0F, 0.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.5672F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 13, -1.2F, 0.0F, 2.1F, 2, 1, 1, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.1F, 6.0F, -3.5F);
		this.bipedRightLeg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3491F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 7, -1.25F, -2.0F, 2.0F, 2, 2, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 14, 4, -1.25F, -2.0F, 4.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.1F, 3.0F, -0.5F);
		this.bipedRightLeg.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 17, -1.25F, -2.0F, 0.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.1F, 2.0F, -3.5F);
		this.bipedRightLeg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.3491F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 3, -1.25F, -2.0F, 4.0F, 2, 2, 1, 0.0F));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 6, -1.25F, -2.0F, 2.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedRightLeg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.5672F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 13, -1.2F, 0.0F, -3.1F, 2, 1, 1, 0.0F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 6, 14, -2.0F, 3.0F, 2.0F, 1, 2, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 10, 0, -2.0F, 0.0F, 2.0F, 2, 3, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, 0.0F, 0.0F, 2.0F, 1, 2, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 10, 10, 1.0F, 0.0F, -2.0F, 1, 10, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -1.8F, 0.0F, -2.0F, 3, 10, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 6, 14, -2.0F, 3.0F, -3.0F, 1, 2, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 10, 0, -2.0F, 0.0F, -3.0F, 2, 3, 1, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, 0.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F));

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.5672F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 13, -0.8F, 0.0F, -3.1F, 2, 1, 1, 0.0F));

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.1F, 6.0F, -3.5F);
		this.bipedLeftLeg.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.3491F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 7, -0.75F, -2.0F, 2.0F, 2, 2, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 4, -0.75F, -2.0F, 4.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.1F, 7.0F, -0.5F);
		this.bipedLeftLeg.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3491F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 6, -0.75F, -2.0F, 0.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.1F, 5.0F, -0.5F);
		this.bipedLeftLeg.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 0, -0.75F, -2.0F, 0.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.1F, 4.0F, -3.5F);
		this.bipedLeftLeg.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3491F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 10, -0.75F, -2.0F, 2.0F, 2, 2, 1, 0.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 20, -0.75F, -2.0F, 4.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.1F, 3.0F, -0.5F);
		this.bipedLeftLeg.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.3491F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 17, -0.75F, -2.0F, 0.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.1F, 2.0F, -3.5F);
		this.bipedLeftLeg.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.3491F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 3, -0.75F, -2.0F, 4.0F, 2, 2, 1, 0.0F));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 6, -0.75F, -2.0F, 2.0F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedLeftLeg.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.5672F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 13, -0.8F, 0.0F, 2.1F, 2, 1, 1, 0.0F));
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