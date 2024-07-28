package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelAngmarBody extends LOTRModelBiped {

	public DRModelAngmarBody() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 16, -5.5F, 0.0F, 2.3F, 11, 13, 0, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 22, 12, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 3, -1.7F, -2.3F, -2.3F, 1, 1, 0, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 6, -2.9F, -2.3F, -2.3F, 1, 2, 0, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 0, -0.5F, -2.3F, -2.3F, 1, 3, 0, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 30, 8, -3.4F, -2.4F, -2.3F, 4, 1, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 19, 30, -3.8F, -2.1F, -0.5F, 1, 5, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 30, 6, -3.4F, -2.4F, -0.4F, 4, 1, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 10, 29, -3.4F, -2.6F, -1.3F, 4, 1, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 10, 29, -3.4F, -2.4F, 1.3F, 4, 1, 1, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 0, -3.6F, -2.1F, -2.5F, 4, 1, 5, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 6, -3.6F, -1.1F, -2.0F, 1, 1, 4, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 20, 0, -3.6F, -0.1F, -1.5F, 1, 1, 3, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 29, 28, -3.6F, 0.9F, -1.0F, 1, 1, 2, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 11, -1.5F, -2.3F, -2.3F, 1, 5, 0, 0.0F));
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 0, 29, -3.4F, -2.6F, 0.3F, 4, 1, 1, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.25F, -2.0F, 2.75F);
		this.bipedRightArm.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4783F, 0.4655F, -0.8572F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 2, 2, -1.0F, -2.0F, -1.0F, 1, 2, 0, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.0F, -2.0F, 1.0F);
		this.bipedRightArm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7418F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 0, -1.0F, -2.0F, -1.0F, 1, 2, 0, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.5F, -2.0F, -1.0F);
		this.bipedRightArm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.5157F, -0.4937F, -0.8745F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 0, -1.0F, -2.0F, -1.0F, 1, 2, 0, 0.0F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 22, 12, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.25F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 6, 1.9F, -2.3F, -2.3F, 1, 2, 0, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 0, -0.5F, -2.3F, -2.3F, 1, 3, 0, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 11, 0.5F, -2.3F, -2.3F, 1, 5, 0, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 0, -0.4F, -2.1F, -2.5F, 4, 1, 5, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 24, 6, 2.6F, -1.1F, -2.0F, 1, 1, 4, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 20, 0, 2.6F, -0.1F, -1.5F, 1, 1, 3, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 29, 28, 2.6F, 0.9F, -1.0F, 1, 1, 2, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 19, 30, 2.8F, -2.1F, -0.5F, 1, 5, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 10, 29, -0.6F, -2.4F, 1.3F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 29, -0.6F, -2.6F, 0.3F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 10, 29, -0.6F, -2.6F, -1.3F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 30, 6, -0.6F, -2.4F, -0.4F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 30, 8, -0.6F, -2.4F, -2.3F, 4, 1, 1, 0.0F));
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 0, 3, 0.7F, -2.3F, -2.3F, 1, 1, 0, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.5F, -2.0F, -1.0F);
		this.bipedLeftArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.5157F, 0.4937F, 0.8745F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 0, 0.0F, -2.0F, -1.0F, 1, 2, 0, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.25F, -2.0F, 2.75F);
		this.bipedLeftArm.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.4783F, -0.4655F, 0.8572F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 2, 2, 0.0F, -2.0F, -1.0F, 1, 2, 0, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(3.0F, -2.0F, 1.0F);
		this.bipedLeftArm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7418F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 0, 0.0F, -2.0F, -1.0F, 1, 2, 0, 0.0F));
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
		this.bipedBody.render(f5);
		this.bipedRightArm.render(f5);
		this.bipedLeftArm.render(f5);
	}
}