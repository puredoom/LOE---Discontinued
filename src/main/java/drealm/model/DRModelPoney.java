package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import drealm.entity.DREntityPoney;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelPoney extends ModelBase {
	private final ModelRenderer poney;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer legAvG;
	private final ModelRenderer legArG;
	private final ModelRenderer legArD;
	private final ModelRenderer legAvD;
	private final ModelRenderer head;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public DRModelPoney() {
		textureWidth = 1024;
		textureHeight = 1024;

		poney = new ModelRenderer(this);
		poney.setRotationPoint(0.0F, 24.0F, 44.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -22.0F, -45.0F);
		poney.addChild(body);
		body.cubeList.add(new ModelBox(body, 623, 87, -8.0F, -11.0F, -16.0F, 16, 16, 32, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -10.0F, 15.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 218, -1.0F, 9.0F, 1.0F, 2, 9, 2, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -10.0F, 15.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 89, 109, -1.0F, 5.0F, 1.0F, 2, 5, 2, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -10.0F, 15.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 76, 116, -1.0F, 2.0F, 0.0F, 2, 5, 2, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -10.0F, 15.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.48F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 175, 109, -1.0F, -1.0F, 0.0F, 2, 5, 2, 0.0F));

		legAvG = new ModelRenderer(this);
		legAvG.setRotationPoint(5.0F, -22.0F, -58.0F);
		poney.addChild(legAvG);
		legAvG.cubeList.add(new ModelBox(legAvG, 129, 220, -3.0F, -4.0F, -3.0F, 6, 14, 6, 0.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 212, 61, -3.0F, 19.0F, -3.0F, 6, 3, 6, 0.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 185, 6, -3.0F, 4.0F, -3.0F, 6, 18, 6, -1.0F));

		legArG = new ModelRenderer(this);
		legArG.setRotationPoint(4.0F, -22.0F, -31.0F);
		poney.addChild(legArG);
		legArG.cubeList.add(new ModelBox(legArG, 0, 218, -2.0F, -4.0F, -4.0F, 6, 14, 6, 0.0F));
		legArG.cubeList.add(new ModelBox(legArG, 115, 165, -2.0F, 19.0F, -4.0F, 6, 3, 6, 0.0F));
		legArG.cubeList.add(new ModelBox(legArG, 0, 119, -2.0F, 4.0F, -4.0F, 6, 18, 6, -1.0F));

		legArD = new ModelRenderer(this);
		legArD.setRotationPoint(-5.0F, -22.0F, -31.0F);
		poney.addChild(legArD);
		legArD.cubeList.add(new ModelBox(legArD, 283, 48, -3.0F, -4.0F, -4.0F, 6, 14, 6, 0.0F));
		legArD.cubeList.add(new ModelBox(legArD, 123, 152, -3.0F, 19.0F, -4.0F, 6, 3, 6, 0.0F));
		legArD.cubeList.add(new ModelBox(legArD, 0, 91, -3.0F, 4.0F, -4.0F, 6, 18, 6, -1.0F));

		legAvD = new ModelRenderer(this);
		legAvD.setRotationPoint(-5.0F, -22.0F, -58.0F);
		poney.addChild(legAvD);
		legAvD.cubeList.add(new ModelBox(legAvD, 218, 133, -3.0F, -4.0F, -3.0F, 6, 14, 6, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 212, 23, -3.0F, 19.0F, -3.0F, 6, 3, 6, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 89, 133, -3.0F, 4.0F, -3.0F, 6, 18, 6, -1.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -28.0F, -58.0F);
		poney.addChild(head);
		setRotationAngle(head, -1.1345F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 34, 218, -3.0F, -4.2068F, -7.9542F, 6, 9, 12, 0.0F));
		head.cubeList.add(new ModelBox(head, 47, 0, -1.0F, -7.2068F, -14.9542F, 2, 7, 19, 0.0F));
		head.cubeList.add(new ModelBox(head, 18, 91, -1.0F, -5.2068F, -16.9542F, 2, 4, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 226, 222, -3.0F, -4.2068F, -13.9542F, 6, 9, 6, 0.0F));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, 2.7932F, -13.9542F, 4, 9, 4, 0.0F));
		head.cubeList.add(new ModelBox(head, 202, 222, -3.0F, -4.2068F, -14.9542F, 6, 9, 6, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 49.5465F, -62.6208F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 78, -3.0F, -64.1492F, 29.7243F, 2, 1, 5, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 134, 1.0F, -64.1492F, 29.7243F, 2, 1, 5, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 49.5465F, -34.6208F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -0.2618F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 119, 2.1254F, -53.7532F, 19.8602F, 6, 9, 6, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 49.5465F, -34.6208F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.2618F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 178, 220, -8.1254F, -53.7532F, 19.8602F, 6, 9, 6, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 49.5465F, -62.6208F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 26, -2.0F, -42.4974F, 56.0F, 4, 9, 1, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 49.5465F, -62.6208F);
		head.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.4363F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 73, 71, -1.0F, -26.9961F, 62.8985F, 2, 5, 2, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		DREntityPoney poneyS = (DREntityPoney) entity;
		if (poneyS.isMountSaddled()) {
			// Render the saddle and armor, but not the original horse model
			// Your rendering code for saddle and armor here
		} else {
			// Render the original horse model when no saddle is present
			this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
			poney.render(f5);
		}
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		this.legAvG.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.legAvD.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArG.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArD.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
	}
}