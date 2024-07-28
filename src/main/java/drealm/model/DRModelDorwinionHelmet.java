package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.world.gen.layer.GenLayerEdge;

public class DRModelDorwinionHelmet extends LOTRModelBiped {

	public DRModelDorwinionHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -5.0F, -9.0F, -5.0F, 10, 1, 10, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 26, 11, -4.0F, -8.0F, -5.0F, 8, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 26, 15, -1.0F, -5.0F, -5.0F, 2, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 8, -2.0F, -5.0F, -5.0F, 4, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 19, -0.5F, -3.0F, -5.0F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 19, -1.0F, -10.0F, -6.0F, 2, 6, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 12, 28, -1.0F, -11.0F, -5.0F, 2, 2, 8, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, 0.0F, -16.0F, -4.0F, 0, 7, 12, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 33, 0.0F, -9.0F, 5.0F, 0, 16, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 36, -2.0F, -13.0F, 3.0F, 4, 4, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 0, -5.0F, -8.0F, 4.0F, 10, 8, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 27, 19, -5.0F, -8.0F, -5.0F, 1, 8, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 19, 4.0F, -8.0F, -5.0F, 1, 8, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 5, 25, 3.0F, -2.0F, -5.0F, 1, 2, 1, 0.0F));
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
		setRotationAngle(cube_r3, -0.1745F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 11, -0.5F, -8.0F, -1.0F, 1, 7, 10, 0.0F));
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