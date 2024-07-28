package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelSalamanderMounted extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leg;
	private final ModelRenderer legAvG;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer legArG;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer legArD;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer legAvD;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer selle;
	private final ModelRenderer cube_r22;

	public DRModelSalamanderMounted() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 0.0F);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 18.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 40, -22.0F, -24.0F, -6.0F, 13, 10, 13, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 27, 11.0F, -24.0F, -6.0F, 13, 10, 13, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -25.0F, -23.0F, -5.0F, 52, 9, 11, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 94, -23.0F, -25.0F, 0.0F, 3, 2, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 50, 94, 23.0F, -25.0F, 0.0F, 3, 2, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 74, 68, 11.0F, -25.0F, 0.0F, 4, 2, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 76, 91, 16.0F, -27.0F, 0.0F, 7, 4, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 24, -12.0F, -25.0F, 0.0F, 3, 2, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 92, 91, -20.0F, -27.0F, 0.0F, 7, 4, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 94, -13.0F, -29.0F, -1.0F, 1, 6, 3, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 83, 24, 15.0F, -29.0F, -1.0F, 1, 6, 3, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 20, -13.0F, -32.0F, 0.0F, 1, 9, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 40, 15.0F, -32.0F, 0.0F, 1, 9, 1, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.0F, -28.0F);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 19.0F, 28.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 88, 39.0F, -19.0F, -7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 24, 37.0F, -19.0F, -7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 86, 35.0F, -19.0F, -7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 36, 77, 33.0F, -19.0F, -7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 68, 31.0F, -19.0F, -7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 63, 29.0F, -19.0F, -7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 40, 39.0F, -19.0F, -5.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 33, 39.0F, -19.0F, -3.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 26, 39.0F, -19.0F, -1.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 28, 39.0F, -19.0F, 1.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 30, 39.0F, -19.0F, 3.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 33, 39.0F, -19.0F, 5.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 89, 39.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 89, 37.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 91, 25, 35.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 91, 27, 33.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 91, 29, 31.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 77, 30.0F, -26.0F, -1.0F, 1, 3, 3, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 29, 30.0F, -27.0F, 0.0F, 1, 3, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 74, 75, 31.0F, -25.0F, 0.0F, 3, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 66, 84, 27.0F, -25.0F, 0.0F, 3, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 91, 31, 29.0F, -19.0F, 7.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 20, 27.0F, -18.0F, -7.0F, 13, 5, 15, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 84, 27.0F, -19.0F, -6.0F, 2, 1, 13, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 50, 27.0F, -24.0F, -6.0F, 12, 5, 13, 0.0F));

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.0F, 24.0F, 0.0F);


		legAvG = new ModelRenderer(this);
		legAvG.setRotationPoint(8.0F, -10.0F, -17.0F);
		leg.addChild(legAvG);


		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-8.0F, 19.0F, 17.0F);
		legAvG.addChild(cube_r3);
		setRotationAngle(cube_r3, -3.1416F, 0.9599F, 3.1416F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 98, 12.1898F, -10.5F, 17.4423F, 2, 2, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 22, 8.1898F, -10.0F, 17.9423F, 5, 1, 1, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-8.0F, 19.0F, 17.0F);
		legAvG.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.829F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 98, 23.2896F, -10.5F, -4.6123F, 2, 2, 2, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 84, 19.2896F, -10.0F, -4.1123F, 5, 1, 1, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-8.0F, 19.0F, 17.0F);
		legAvG.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 46, 98, 21.0F, -10.5F, 9.5F, 2, 2, 2, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 54, 84, 17.0F, -10.0F, 10.0F, 5, 1, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 94, 16.0F, -15.0F, 10.0F, 2, 6, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 68, 16.0F, -20.0F, 9.0F, 2, 5, 3, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 89, 14.0F, -21.0F, 7.0F, 6, 3, 3, 0.0F));

		legArG = new ModelRenderer(this);
		legArG.setRotationPoint(8.0F, -10.0F, 16.0F);
		leg.addChild(legArG);


		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-8.0F, 19.0F, -16.0F);
		legArG.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.1416F, 0.9599F, 3.1416F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 83, 96, -14.8422F, -10.5F, -1.4857F, 2, 2, 2, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 71, -18.8422F, -10.0F, -0.9857F, 5, 1, 1, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-8.0F, 19.0F, -16.0F);
		legArG.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.829F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 91, 96, -1.0405F, -10.5F, 17.6822F, 2, 2, 2, 0.0F));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 73, -5.0405F, -10.0F, 18.1822F, 5, 1, 1, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-8.0F, 19.0F, -16.0F);
		legArG.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 1.5708F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 22, 98, -12.0F, -10.5F, 9.5F, 2, 2, 2, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 83, 20, -16.0F, -10.0F, 10.0F, 5, 1, 1, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 63, 94, -17.0F, -15.0F, 10.0F, 2, 6, 1, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 63, -17.0F, -20.0F, 9.0F, 2, 5, 3, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 89, -19.0F, -21.0F, 7.0F, 6, 3, 3, 0.0F));

		legArD = new ModelRenderer(this);
		legArD.setRotationPoint(-7.0F, -10.0F, 16.0F);
		leg.addChild(legArD);


		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(7.0F, 19.0F, -16.0F);
		legArD.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.9599F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 95, 40, -14.2686F, -10.5F, 0.3049F, 2, 2, 2, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 24, -18.2686F, -10.0F, 0.8049F, 5, 1, 1, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(7.0F, 19.0F, -16.0F);
		legArD.addChild(cube_r10);
		setRotationAngle(cube_r10, -3.1416F, 0.829F, 3.1416F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 95, 44, -1.7161F, -10.5F, -18.9449F, 2, 2, 2, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 50, -5.7161F, -10.0F, -18.4449F, 5, 1, 1, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(7.0F, 19.0F, -16.0F);
		legArD.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 1.5708F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 75, 96, -12.0F, -10.5F, -10.5F, 2, 2, 2, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 50, -16.0F, -10.0F, -10.0F, 5, 1, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 77, -17.0F, -15.0F, -10.0F, 2, 6, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 24, -17.0F, -20.0F, -11.0F, 2, 5, 3, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 82, 34, -19.0F, -21.0F, -9.0F, 6, 3, 3, 0.0F));

		legAvD = new ModelRenderer(this);
		legAvD.setRotationPoint(-7.0F, -10.0F, -17.0F);
		leg.addChild(legAvD);


		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(7.0F, 19.0F, 17.0F);
		legAvD.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.9599F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 95, 12.7634F, -10.5F, -18.6232F, 2, 2, 2, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 32, 8.7634F, -10.0F, -18.1232F, 5, 1, 1, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(7.0F, 19.0F, 17.0F);
		legAvD.addChild(cube_r13);
		setRotationAngle(cube_r13, -3.1416F, 0.829F, 3.1416F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 95, 22.614F, -10.5F, 3.3495F, 2, 2, 2, 0.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 32, 18.614F, -10.0F, 3.8495F, 5, 1, 1, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(7.0F, 19.0F, 17.0F);
		legAvD.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 1.5708F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 95, 21.0F, -10.5F, -10.5F, 2, 2, 2, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 48, 17.0F, -10.0F, -10.0F, 5, 1, 1, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 76, 50, 16.0F, -15.0F, -10.0F, 2, 6, 1, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 40, 16.0F, -20.0F, -11.0F, 2, 5, 3, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 68, 21, 14.0F, -21.0F, -9.0F, 6, 3, 3, 0.0F));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 15.0F, 25.0F);


		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 18.0F, -25.0F);
		tail.addChild(cube_r15);
		setRotationAngle(cube_r15, -3.1416F, -1.4399F, 3.1416F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 41, 20, 45.0306F, -19.0F, -48.3513F, 12, 1, 3, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 18.0F, -25.0F);
		tail.addChild(cube_r16);
		setRotationAngle(cube_r16, -3.1416F, -0.7418F, 3.1416F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 74, 71, 13.0253F, -19.0F, -73.6329F, 12, 1, 3, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 18.0F, -25.0F);
		tail.addChild(cube_r17);
		setRotationAngle(cube_r17, -3.1416F, -0.1309F, 3.1416F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 84, 63, -23.0451F, -20.0F, -75.8719F, 12, 3, 5, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 18.0F, -25.0F);
		tail.addChild(cube_r18);
		setRotationAngle(cube_r18, -3.1416F, 0.5236F, 3.1416F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 42, 86, -55.304F, -20.0F, -53.3566F, 12, 3, 5, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 18.0F, -25.0F);
		tail.addChild(cube_r19);
		setRotationAngle(cube_r19, -3.1416F, 0.9599F, 3.1416F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 77, -62.1511F, -21.0F, -31.5443F, 12, 5, 7, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 18.0F, -25.0F);
		tail.addChild(cube_r20);
		setRotationAngle(cube_r20, -3.1416F, 1.3526F, 3.1416F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 76, 50, -59.1941F, -21.0F, -10.3589F, 12, 5, 7, 0.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 41, 68, -47.1941F, -22.0F, -11.3589F, 12, 7, 9, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 18.0F, -25.0F);
		tail.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 1.5708F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 74, 75, -37.0F, -22.0F, -4.0F, 12, 7, 9, 0.0F));

		selle = new ModelRenderer(this);
		selle.setRotationPoint(0.0F, 24.0F, 0.0F);


		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 9.0F, 0.0F);
		selle.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 1.5708F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, 1.0F, -23.0F, -6.0F, 3, 10, 1, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 82, 20, 1.0F, -14.0F, -6.0F, 3, 1, 13, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 20, 1.0F, -24.0F, 6.0F, 3, 11, 1, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 63, -4.0F, -24.0F, -6.0F, 12, 1, 13, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		leg.render(f5);
		selle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		this.head.rotateAngleX = 0.20943952f;
		this.head.rotateAngleY = 0.0f;

		this.tail.rotateAngleY = 0.0F;
		this.tail.rotateAngleX = 0.0F;
		this.tail.rotateAngleZ = 0.0F;

		final ModelRenderer head = this.head;
		head.rotateAngleX += MathHelper.cos(f * 0.2f) * 0.3f * f1;
		this.legAvG.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.legAvD.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArG.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArD.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
	}
}