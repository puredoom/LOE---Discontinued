package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelDalishOstrich extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer head;
	private final ModelRenderer legs;
	private final ModelRenderer legG;
	private final ModelRenderer legD;

	public DRModelDalishOstrich() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -13.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 66, -11.0F, -10.0F, -11.0F, 22, 20, 22, 0.0F));
		body.cubeList.add(new ModelBox(body, 66, 76, -13.0F, -7.0F, -4.0F, 2, 2, 8, 0.0F));
		body.cubeList.add(new ModelBox(body, 136, 0, -13.0F, -5.0F, -6.0F, 2, 2, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 28, 126, -13.0F, -3.0F, -6.0F, 2, 2, 13, 0.0F));
		body.cubeList.add(new ModelBox(body, 56, 108, -13.0F, -1.0F, -6.0F, 2, 2, 14, 0.0F));
		body.cubeList.add(new ModelBox(body, 36, 108, -13.0F, 1.0F, -6.0F, 2, 2, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 116, -13.0F, 3.0F, -4.0F, 2, 2, 6, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 108, 11.0F, 1.0F, -6.0F, 2, 2, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 108, 11.0F, 3.0F, -4.0F, 2, 2, 6, 0.0F));
		body.cubeList.add(new ModelBox(body, 20, 108, 11.0F, -1.0F, -6.0F, 2, 2, 14, 0.0F));
		body.cubeList.add(new ModelBox(body, 123, 125, 11.0F, -3.0F, -6.0F, 2, 2, 13, 0.0F));
		body.cubeList.add(new ModelBox(body, 46, 129, 11.0F, -5.0F, -6.0F, 2, 2, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 66, 66, 11.0F, -7.0F, -4.0F, 2, 2, 8, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -1.0F, -18.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 66, -3.0F, -3.3017F, -4.1139F, 6, 6, 5, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -1.0F, -18.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.6545F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 66, -3.0F, -6.3017F, -5.1139F, 6, 6, 5, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -10.0F, -11.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 120, 91, -6.0F, 1.0F, -5.0F, 12, 12, 5, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 66, -10.0F, 0.0F, 0.0F, 20, 20, 5, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 11.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3927F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -29.0F, -40.0F, -12.0F, 58, 46, 20, -10.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -17.0F, -17.0F);
		head.cubeList.add(new ModelBox(head, 120, 108, -2.0F, -27.0F, -4.0F, 4, 26, 4, 0.0F));
		head.cubeList.add(new ModelBox(head, 138, 76, -3.0F, -32.0F, -6.0F, 6, 5, 6, 0.0F));
		head.cubeList.add(new ModelBox(head, 88, 91, -2.0F, -37.0F, -6.0F, 4, 25, 12, -2.0F));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -29.0F, -8.0F, 4, 8, 5, -2.0F));
		head.cubeList.add(new ModelBox(head, 0, 13, -1.0F, -29.0F, -9.0F, 2, 2, 3, 0.0F));
		head.cubeList.add(new ModelBox(head, 66, 66, 2.0F, -27.0F, -5.0F, 1, 1, 3, 0.0F));
		head.cubeList.add(new ModelBox(head, 10, 13, -3.0F, -27.0F, -5.0F, 1, 1, 3, 0.0F));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		legG = new ModelRenderer(this);
		legG.setRotationPoint(7.0F, -30.0F, 0.0F);
		legs.addChild(legG);
		legG.cubeList.add(new ModelBox(legG, 105, 128, -2.0F, 2.0F, -1.0F, 3, 28, 3, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 0, 126, -4.0F, 2.0F, -3.0F, 7, 10, 7, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 117, 140, -3.0F, 12.0F, -2.0F, 5, 4, 5, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 138, 66, -3.0F, 29.0F, -6.0F, 5, 1, 9, 0.0F));

		legD = new ModelRenderer(this);
		legD.setRotationPoint(-7.0F, -30.0F, 0.0F);
		legs.addChild(legD);
		legD.cubeList.add(new ModelBox(legD, 93, 128, -1.0F, 2.0F, -1.0F, 3, 28, 3, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 65, 124, -3.0F, 2.0F, -3.0F, 7, 10, 7, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 0, 77, -2.0F, 12.0F, -2.0F, 5, 4, 5, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 136, 108, -2.0F, 29.0F, -6.0F, 5, 1, 9, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		head.render(f5);
		legs.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		this.head.rotateAngleX = 0.20943952f;
		this.head.rotateAngleY = 0.0f;
		final ModelRenderer head = this.head;
		head.rotateAngleX += MathHelper.cos(f * 0.2f) * 0.3f * f1;
		final ModelRenderer head2 = this.head;
		head2.rotateAngleX += (float)Math.toRadians(f4);
		final ModelRenderer head3 = this.head;
		head3.rotateAngleY += (float)Math.toRadians(f3);
		this.legG.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.legD.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
	}
}