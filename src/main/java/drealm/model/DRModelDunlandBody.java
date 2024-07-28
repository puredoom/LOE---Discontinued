package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDunlandBody extends LOTRModelBiped {

	public DRModelDunlandBody() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 27, 12, 2.3F, -0.3F, -2.5F, 2, 0, 5, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 23, 12, -4.2F, -0.3F, -2.5F, 2, 0, 5, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 27, 29, -4.4F, -0.3F, 2.5F, 9, 15, 0, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 17, 2.3F, -0.3F, -2.4F, 2, 10, 0, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 12, 17, -4.2F, -0.3F, -2.4F, 2, 6, 0, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 0, -3.0F, -2.0F, -2.0F, 4, 8, 4, 0.25F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 16, 16, -1.0F, -2.0F, -2.0F, 4, 8, 4, 0.25F));
	}

	public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}