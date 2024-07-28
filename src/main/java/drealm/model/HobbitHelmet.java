// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports
package drealm.model;


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HobbitHelmet extends LOTRModelBiped {

	public HobbitHelmet() {
		textureWidth = 128;
		textureHeight = 128;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 27, 21, -4.3F, -10.5F, -4.7F, 9, 4, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -8.5F, -6.5F, -8.5F, 17, 0, 17, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 27, 34, -4.6F, -10.6F, -4.6F, 9, 4, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 17, -4.7F, -10.5F, -4.3F, 9, 4, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 30, -4.4F, -10.5F, -4.4F, 9, 4, 9, 0.0F));
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