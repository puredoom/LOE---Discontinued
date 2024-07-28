package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelMountedBoar extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer legs;
	private final ModelRenderer legAvG;
	private final ModelRenderer legArG;
	private final ModelRenderer legArD;
	private final ModelRenderer legAvD;
	private final ModelRenderer head;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer selle;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;

	public DRModelMountedBoar() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 10.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -8.0F, -6.0F, -11.0F, 15, 11, 25, 2.0F));
		body.cubeList.add(new ModelBox(body, 0, 36, -7.0F, 5.0F, -10.0F, 13, 1, 23, 2.0F));
		body.cubeList.add(new ModelBox(body, 48, 60, -9.0F, -7.0F, 8.0F, 17, 12, 7, 2.0F));
		body.cubeList.add(new ModelBox(body, 95, 117, -9.0F, -7.0F, 16.0F, 6, 12, 1, 1.0F));
		body.cubeList.add(new ModelBox(body, 109, 10, 2.0F, -7.0F, 16.0F, 6, 12, 1, 1.0F));
		body.cubeList.add(new ModelBox(body, 0, 60, -9.0F, -7.0F, -12.0F, 17, 12, 7, 2.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, -15.0F, 22.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4921F, 1.137F, 2.7542F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 88, 32, -1.8148F, -1.5881F, -0.0145F, 1, 1, 3, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -15.0F, 21.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6364F, -0.0378F, 2.2939F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 80, 32, -1.4382F, -0.5823F, 0.2548F, 1, 1, 3, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, -13.0F, 21.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.9126F, -0.7216F, 1.6149F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 60, -2.0043F, -0.6605F, 0.6088F, 1, 1, 3, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, -12.0F, 22.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 2.2626F, -0.6901F, -0.1645F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 36, -0.5147F, -0.7054F, -0.0731F, 1, 1, 3, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -11.0F, 19.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.9555F, -0.5798F, -0.4602F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 60, 0.0F, 1.0F, -1.0F, 1, 1, 4, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0F, -12.0F, 18.0F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.4921F, 1.137F, 2.7542F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 89, 57, -1.8148F, -1.5881F, -0.0145F, 1, 1, 3, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -12.0F, 17.0F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.6364F, -0.0378F, 2.2939F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 94, 58, -1.4382F, -0.5823F, 0.2548F, 1, 1, 3, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, -10.0F, 17.0F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.9126F, -0.7216F, 1.6149F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 95, 90, -2.0043F, -0.6605F, 0.6088F, 1, 1, 3, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -9.0F, 18.0F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.2626F, -0.6901F, -0.1645F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 96, 32, -0.5147F, -0.7054F, -0.0731F, 1, 1, 3, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -8.0F, 15.0F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.9555F, -0.5798F, -0.4602F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 96, 52, 0.0F, 1.0F, 0.0F, 1, 1, 3, 0.0F));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		legAvG = new ModelRenderer(this);
		legAvG.setRotationPoint(10.0F, -16.0F, -8.0F);
		legs.addChild(legAvG);
		legAvG.cubeList.add(new ModelBox(legAvG, 0, 118, -1.0F, 4.0F, -2.0F, 3, 12, 3, 0.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 15, 40, -1.0F, 14.0F, -3.0F, 3, 2, 1, 0.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 0, 101, -3.0F, 3.0F, -4.0F, 7, 10, 7, -1.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 0, 0, -1.0F, -5.0F, -4.0F, 4, 9, 7, 0.0F));

		legArG = new ModelRenderer(this);
		legArG.setRotationPoint(10.0F, -16.0F, 11.0F);
		legs.addChild(legArG);
		legArG.cubeList.add(new ModelBox(legArG, 109, 117, -1.0F, 4.0F, -1.0F, 3, 12, 3, 0.0F));
		legArG.cubeList.add(new ModelBox(legArG, 72, 57, -1.0F, 14.0F, -2.0F, 3, 2, 1, 0.0F));
		legArG.cubeList.add(new ModelBox(legArG, 95, 100, -3.0F, 3.0F, -3.0F, 7, 10, 7, -1.0F));
		legArG.cubeList.add(new ModelBox(legArG, 0, 36, -1.0F, -5.0F, -3.0F, 4, 9, 7, 0.0F));

		legArD = new ModelRenderer(this);
		legArD.setRotationPoint(-10.0F, -16.0F, 11.0F);
		legs.addChild(legArD);
		legArD.cubeList.add(new ModelBox(legArD, 117, 46, -3.0F, 2.0F, -1.0F, 3, 14, 3, 0.0F));
		legArD.cubeList.add(new ModelBox(legArD, 0, 87, -3.0F, 14.0F, -2.0F, 3, 2, 1, 0.0F));
		legArD.cubeList.add(new ModelBox(legArD, 67, 107, -4.0F, -5.0F, -3.0F, 4, 9, 7, 0.0F));
		legArD.cubeList.add(new ModelBox(legArD, 96, 57, -5.0F, 3.0F, -3.0F, 7, 10, 7, -1.0F));

		legAvD = new ModelRenderer(this);
		legAvD.setRotationPoint(-10.0F, -16.0F, -8.0F);
		legs.addChild(legAvD);
		legAvD.cubeList.add(new ModelBox(legAvD, 109, 29, -3.0F, 2.0F, -2.0F, 3, 14, 3, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 80, 57, -3.0F, 14.0F, -3.0F, 3, 2, 1, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 28, 104, -4.0F, -5.0F, -4.0F, 4, 9, 7, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 74, 90, -5.0F, 3.0F, -4.0F, 7, 10, 7, -1.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, -14.0F);
		head.cubeList.add(new ModelBox(head, 0, 79, -6.0F, -7.0F, -11.0F, 11, 11, 11, 0.0F));
		head.cubeList.add(new ModelBox(head, 0, 16, -4.0F, -2.0F, -14.0F, 7, 6, 3, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.0F, -5.0F, -4.0F);
		head.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.829F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 79, 0.0F, -5.0F, -2.0F, 1, 4, 4, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.0F, -5.0F, -4.0F);
		head.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 3.098F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 36, 3.0F, 0.0F, -2.0F, 1, 4, 4, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.0F, -5.0F, -4.0F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -3.098F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 33, 79, -4.0F, 0.0F, -2.0F, 1, 4, 4, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(4.0F, -5.0F, -4.0F);
		head.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.829F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 74, 79, -1.0F, -5.0F, -2.0F, 1, 4, 4, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(5.0F, 5.0F, -10.0F);
		head.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 49, 47, -2.0F, -7.0F, 0.0F, 2, 6, 2, 0.0F));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 98, 74, -11.0F, -7.0F, 0.0F, 2, 6, 2, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(5.0F, 5.0F, -10.0F);
		head.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -2.0F, -11.0F, -4.0F, 1, 6, 1, 0.0F));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 15, 0, -10.0F, -11.0F, -4.0F, 1, 6, 1, 0.0F));

		selle = new ModelRenderer(this);
		selle.setRotationPoint(0.0F, 24.0F, 0.0F);
		selle.cubeList.add(new ModelBox(selle, 49, 47, -10.0F, -23.0F, -3.0F, 19, 1, 9, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 49, 36, -13.0F, -24.0F, -13.0F, 25, 1, 10, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 49, 36, -13.0F, -24.0F, 9.0F, 25, 1, 10, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 55, 19, -13.0F, -24.0F, 5.0F, 25, 1, 4, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 55, 0, -12.0F, -42.0F, 7.0F, 23, 18, 1, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 80, 24, -10.0F, -45.0F, 7.0F, 19, 3, 1, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 80, 28, -8.0F, -48.0F, 7.0F, 15, 3, 1, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(11.0F, -23.0F, 9.0F);
		selle.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 1.5272F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 52, 3.0F, -4.0F, -4.0F, 7, 1, 4, 0.0F));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 74, 79, 3.0F, -4.0F, 0.0F, 7, 1, 10, 0.0F));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 74, 79, 3.0F, -4.0F, -22.0F, 7, 1, 10, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(11.0F, -23.0F, 9.0F);
		selle.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.829F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 96, 47, 0.0F, -1.0F, -4.0F, 5, 1, 4, 0.0F));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 98, 84, 0.0F, -1.0F, 0.0F, 5, 1, 10, 0.0F));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 98, 84, 0.0F, -1.0F, -22.0F, 5, 1, 10, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(11.0F, -23.0F, 9.0F);
		selle.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 1.5708F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 0, 0.0F, -1.0F, -4.0F, 1, 25, 0, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 50, 111, 1.0F, -2.0F, -4.0F, 1, 27, 0, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 93, 107, 2.0F, -3.0F, -4.0F, 1, 29, 0, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 60, 79, 3.0F, -4.0F, -4.0F, 7, 31, 0, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 60, 79, 3.0F, -4.0F, 5.0F, 7, 31, 0, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 93, 107, 2.0F, -3.0F, 5.0F, 1, 29, 0, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 50, 111, 1.0F, -2.0F, 5.0F, 1, 27, 0, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 0, 0.0F, -1.0F, 5.0F, 1, 25, 0, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 63, 110, 0.0F, -1.0F, 0.0F, 1, 25, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 110, 1.0F, -2.0F, 0.0F, 1, 27, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 89, 107, 2.0F, -3.0F, 0.0F, 1, 29, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 79, 3.0F, -4.0F, 0.0F, 7, 31, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 79, 3.0F, -4.0F, 9.0F, 7, 31, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 89, 107, 2.0F, -3.0F, 9.0F, 1, 29, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 110, 1.0F, -2.0F, 9.0F, 1, 27, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 63, 110, 0.0F, -1.0F, 9.0F, 1, 25, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 63, 110, 0.0F, -1.0F, -22.0F, 1, 25, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 110, 1.0F, -2.0F, -22.0F, 1, 27, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 89, 107, 2.0F, -3.0F, -22.0F, 1, 29, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 111, -1.0F, 0.0F, -22.0F, 1, 23, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 52, 111, -1.0F, 0.0F, -13.0F, 1, 23, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 63, 110, 0.0F, -1.0F, -13.0F, 1, 25, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 59, 110, 1.0F, -2.0F, -13.0F, 1, 27, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 89, 107, 2.0F, -3.0F, -13.0F, 1, 29, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 79, 3.0F, -4.0F, -22.0F, 7, 31, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 44, 79, 3.0F, -4.0F, -13.0F, 7, 31, 1, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-12.0F, -23.0F, 9.0F);
		selle.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -1.5272F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 52, -10.0F, -4.0F, -4.0F, 7, 1, 4, 0.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 74, 79, -10.0F, -4.0F, 0.0F, 7, 1, 10, 0.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 74, 79, -10.0F, -4.0F, -22.0F, 7, 1, 10, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-12.0F, -23.0F, 9.0F);
		selle.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, -0.829F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 96, 47, -5.0F, -1.0F, -4.0F, 5, 1, 4, 0.0F));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 98, 84, -5.0F, -1.0F, 0.0F, 5, 1, 10, 0.0F));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 98, 84, -5.0F, -1.0F, -22.0F, 5, 1, 10, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-9.0F, -22.0F, 1.0F);
		selle.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.829F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 103, 0, -5.0F, -1.0F, -4.0F, 5, 1, 9, 0.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-9.0F, -22.0F, 1.0F);
		selle.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -1.5272F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 98, 74, -10.0F, -4.0F, -4.0F, 7, 1, 9, 0.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(8.0F, -22.0F, 1.0F);
		selle.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 1.5272F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 98, 74, 3.0F, -4.0F, -4.0F, 7, 1, 9, 0.0F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(8.0F, -22.0F, 1.0F);
		selle.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.829F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 103, 0, 0.0F, -1.0F, -4.0F, 5, 1, 9, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		legs.render(f5);
		head.render(f5);
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
		final ModelRenderer head = this.head;
		head.rotateAngleX += MathHelper.cos(f * 0.2f) * 0.3f * f1;
		final ModelRenderer head2 = this.head;
		head2.rotateAngleX += (float)Math.toRadians(f4);
		final ModelRenderer head3 = this.head;
		head3.rotateAngleY += (float)Math.toRadians(f3);
		this.legAvG.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.legAvD.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArG.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArD.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
	}
}