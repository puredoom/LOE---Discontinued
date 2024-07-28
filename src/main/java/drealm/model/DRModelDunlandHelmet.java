package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDunlandHelmet extends LOTRModelBiped {

	public DRModelDunlandHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 43, 46, 2.0F, -12.0F, 1.0F, 2, 5, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 37, 46, -4.0F, -12.0F, 1.0F, 2, 5, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 43, 6, -1.5F, -6.5F, -8.0F, 3, 2, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 20, 4.0F, -10.0F, -6.0F, 2, 6, 12, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 36, 0, 4.0F, -6.0F, 2.0F, 2, 6, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 27, 46, 4.0F, -6.0F, 0.0F, 2, 3, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 41, 4.0F, -6.0F, 3.0F, 2, 4, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 46, 0, -6.0F, -6.0F, 0.0F, 2, 3, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 32, -6.0F, -6.0F, 2.0F, 2, 6, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 19, -6.0F, -6.0F, 3.0F, 2, 4, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -6.0F, -10.0F, -6.0F, 12, 2, 12, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -6.0F, -10.1F, -6.0F, 12, 2, 12, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 14, 4.0F, -6.0F, -6.0F, 2, 7, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 40, 38, 4.0F, -6.0F, -5.0F, 2, 5, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 20, 4.1F, -10.0F, -6.0F, 2, 6, 12, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 40, 38, 4.1F, -6.0F, -5.0F, 2, 5, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 14, 4.1F, -6.0F, -6.0F, 2, 7, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 36, 0, 4.1F, -6.0F, 2.0F, 2, 6, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 41, 4.1F, -6.0F, 3.0F, 2, 4, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 14, -6.0F, -10.0F, -6.0F, 2, 6, 12, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 32, 14, -6.0F, -10.0F, 4.0F, 12, 7, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 14, -2.0F, -5.0F, 4.0F, 6, 3, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 44, 31, 0.0F, -4.0F, 4.0F, 3, 4, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 32, 14, -6.0F, -10.0F, 4.1F, 12, 7, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 14, -2.0F, -5.0F, 4.1F, 6, 3, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 44, 31, 0.0F, -4.0F, 4.1F, 3, 4, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 32, 23, -6.0F, -10.0F, -6.0F, 12, 6, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 20, 38, 3.0F, -6.0F, -6.0F, 3, 7, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 38, -6.0F, -6.0F, -5.0F, 2, 5, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -6.0F, -6.0F, -6.0F, 2, 7, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 38, -6.1F, -6.0F, -5.0F, 2, 5, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -6.1F, -6.0F, -6.0F, 2, 7, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 14, -6.1F, -10.0F, -6.0F, 2, 6, 12, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 46, 0, -6.1F, -6.0F, 0.0F, 2, 3, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 32, -6.1F, -6.0F, 2.0F, 2, 6, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 16, 19, -6.1F, -6.0F, 3.0F, 2, 4, 3, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 10, 38, -6.0F, -6.0F, -6.0F, 3, 7, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 32, 23, -6.0F, -10.0F, -6.1F, 12, 6, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 10, 38, -6.0F, -6.0F, -6.1F, 3, 7, 2, -1.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 20, 38, 3.0F, -6.0F, -6.1F, 3, 7, 2, -1.0F));
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