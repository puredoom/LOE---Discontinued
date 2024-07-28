package drealm.model;

import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDunedainBoots extends LOTRModelBiped {

	public DRModelDunedainBoots() {
		textureWidth = 32;
		textureHeight = 32;

		this.bipedRightLeg = new ModelRenderer(this);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -2.3F, 9.0F, -2.0F, 4, 3, 4, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 12, 7, -1.8F, 10.0F, -4.0F, 3, 2, 2, 0.25F));
		this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 8, 14, -1.3F, 11.0F, -6.0F, 2, 1, 2, 0.25F));

		this.bipedLeftLeg = new ModelRenderer(this);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 0, -1.7F, 9.0F, -2.0F, 4, 3, 4, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 12, 7, -1.2F, 10.0F, -4.0F, 3, 2, 2, 0.25F));
		this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 8, 14, -0.7F, 11.0F, -6.0F, 2, 1, 2, 0.25F));
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
