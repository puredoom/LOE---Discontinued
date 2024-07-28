// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports
package drealm.model;

import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HobbitBody extends LOTRModelBiped {

	public HobbitBody() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 16, -3.5F, 0.1F, 1.5F, 7, 13, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 0, -3.0F, -2.0F, -2.0F, 4, 10, 4, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 32, 21, -0.5F, -2.4F, -2.5F, 6, 1, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 32, 14, -3.5F, -2.4F, -2.5F, 3, 2, 5, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 30, -3.5F, -0.4F, -1.5F, 5, 3, 4, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 32, 23, -0.5F, -2.4F, 1.5F, 2, 2, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 37, -3.5F, 2.6F, 0.5F, 5, 5, 2, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 20, 0, -1.5F, 7.6F, 1.5F, 3, 3, 1, 0.0F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 16, 16, -1.0F, -2.0F, -2.0F, 4, 10, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 28, 14, -1.5F, 7.6F, 1.5F, 3, 3, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 14, 30, -5.5F, -2.4F, -2.5F, 6, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 13, 32, 0.5F, -2.4F, -2.5F, 3, 2, 5, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 36, 0, -1.5F, -2.4F, 1.5F, 2, 2, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 28, 26, -1.5F, -0.4F, -1.5F, 5, 3, 4, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 29, 33, -1.5F, 2.6F, 0.5F, 5, 5, 2, 0.0F));
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