// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports
package drealm.model;

import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HobbitBoots extends LOTRModelBiped {

	public HobbitBoots() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 12, 0, -0.8F, 11.1F, -6.7F, 1, 1, 2, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 6, 11, 1.2F, 11.1F, -6.1F, 1, 1, 2, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 11, 6, 0.2F, 11.1F, -6.4F, 1, 1, 2, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 12, 9, -1.8F, 11.1F, -7.1F, 1, 1, 2, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 6, -1.8F, 10.1F, -5.1F, 4, 2, 3, 0.0F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.25F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.3F, 12.1F, -4.0F);
		this.bipedLeftLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.48F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 11, 1.3F, -1.0F, -3.0F, 1, 1, 2, 0.0F));

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -2.0F, 10.0F, -2.0F, 4, 2, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 6, -2.2F, 10.1F, -5.1F, 4, 2, 3, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 12, 9, 0.8F, 11.1F, -7.1F, 1, 1, 2, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 12, 0, -0.2F, 11.1F, -6.7F, 1, 1, 2, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 6, 11, -2.2F, 11.1F, -6.1F, 1, 1, 2, 0.0F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 11, 6, -1.2F, 11.1F, -6.4F, 1, 1, 2, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.3F, 12.1F, -4.0F);
		this.bipedRightLeg.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.48F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 11, -2.3F, -1.0F, -3.0F, 1, 1, 2, 0.0F));
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