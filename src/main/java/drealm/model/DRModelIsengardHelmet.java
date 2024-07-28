package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelIsengardHelmet extends LOTRModelBiped {

	public DRModelIsengardHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 5, 23, 2.5F, 0.5F, -4.8F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 19, 0.5F, -3.5F, -4.8F, 4, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 27, 0, -4.5F, -5.5F, -4.8F, 9, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 15, -4.5F, -8.5F, -4.8F, 9, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 23, 3.5F, -6.5F, -4.8F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 23, -4.5F, -6.5F, -4.8F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 29, 32, -4.5F, -3.5F, -4.8F, 4, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 1, 0, 2.5F, -2.5F, -4.8F, 2, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.5F, -8.8F, -4.5F, 9, 1, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 10, -4.0F, -9.05F, -4.0F, 8, 1, 8, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 19, 3.8F, -8.5F, -4.5F, 1, 7, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 31, 18, -4.5F, -8.5F, 3.8F, 9, 9, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 1, 0, -4.5F, -2.5F, -4.8F, 2, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 19, 3.5F, 0.5F, -4.8F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 5, 23, -3.5F, 0.5F, -4.8F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 19, -4.5F, 0.5F, -4.8F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 19, -4.8F, -8.5F, -4.5F, 1, 7, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 43, 42, -0.5F, -9.5F, -5.0F, 1, 3, 8, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -9.2F, 3.0F);
		this.bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 23, 38, -5.0F, -4.0F, 0.0F, 10, 5, 0, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.0F, 2.0F, 0.0F);
		this.bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7069F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, -10, 36, -1.6F, 0.0F, -6.0F, 2, 0, 10, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.0F, 2.0F, 0.0F);
		this.bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7069F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, -10, 36, -0.4F, 0.0F, -6.0F, 2, 0, 10, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -9.2F, 3.0F);
		this.bipedHead.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4636F, -0.2527F, -0.4636F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, -5.2353F, -5.911F, 0.0F, 3, 5, 0, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.5F, -1.5F, 3.8F);
		this.bipedHead.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 10, -1.0F, 0.0F, 0.0F, 9, 4, 1, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.8F, -1.5F, -3.5F);
		this.bipedHead.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 19, -1.0F, 0.0F, -1.0F, 1, 4, 9, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.8F, -1.5F, -3.5F);
		this.bipedHead.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3491F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 20, 19, 0.0F, 0.0F, -1.0F, 1, 4, 9, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -9.2F, 3.0F);
		this.bipedHead.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.4636F, 0.2527F, 0.4636F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 19, 2.2353F, -5.911F, 0.0F, 3, 5, 0, 0.0F));
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