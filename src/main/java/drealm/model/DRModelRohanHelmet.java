package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelRohanHelmet extends LOTRModelBiped {


	public DRModelRohanHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -5.0F, -9.0F, -5.0F, 10, 1, 10, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 0, -4.0F, -8.0F, -5.0F, 8, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 32, 33, -1.0F, -5.0F, -5.0F, 2, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 19, -1.0F, -10.0F, -6.0F, 2, 6, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 27, 20, -1.0F, -11.0F, -5.0F, 2, 2, 8, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, 0.0F, -16.0F, -4.0F, 0, 7, 12, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 20, 25, 0.0F, -9.0F, 5.0F, 0, 16, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 4, -2.0F, -13.0F, 3.0F, 4, 4, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 26, 11, -5.0F, -8.0F, 4.0F, 10, 8, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 19, -5.0F, -8.0F, -5.0F, 1, 8, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 15, 11, 4.0F, -8.0F, -5.0F, 1, 8, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 19, 3.0F, -2.0F, -5.0F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 5, 0, -4.0F, -2.0F, -5.0F, 1, 2, 1, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.2F, 0.0F, -1.0F);
		this.bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3381F, -0.0886F, -0.2467F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -2.0F, -2.0F, 1, 5, 3, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.2F, 0.0F, -1.0F);
		this.bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3381F, 0.0886F, 0.2467F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, 0.0F, -2.0F, -2.0F, 1, 5, 3, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -8.0F, -4.0F);
		this.bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.6109F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 30, -0.5F, -6.0F, 0.0F, 1, 4, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, -0.5F, -5.0F, -2.0F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 30, -1.0F, -5.0F, -1.0F, 2, 1, 2, 0.0F));

		ModelRenderer Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, 7.0F, 5.0F);
		this.bipedHead.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 0.0F, 0.0436F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 20, 25, 0.0F, -16.0F, 0.0F, 0, 16, 3, 0.0F));
		Head_r1.cubeList.add(new ModelBox(Head_r1, 0, 0, 0.0F, -23.0F, -9.0F, 0, 7, 12, 0.0F));

		ModelRenderer Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(0.0F, 7.0F, 5.0F);
		this.bipedHead.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.0F, -0.0436F);
		Head_r2.cubeList.add(new ModelBox(Head_r2, 20, 25, 0.0F, -16.0F, 0.0F, 0, 16, 3, 0.0F));
		Head_r2.cubeList.add(new ModelBox(Head_r2, 0, 0, 0.0F, -23.0F, -9.0F, 0, 7, 12, 0.0F));
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