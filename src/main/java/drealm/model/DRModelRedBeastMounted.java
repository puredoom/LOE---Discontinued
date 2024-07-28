package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelRedBeastMounted extends ModelBase {
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
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer head;
	private final ModelRenderer legs;
	private final ModelRenderer legAvG;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer legAvD;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer legArG;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer legArD;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer selle;

	public DRModelRedBeastMounted() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 12.0F, 9.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -7.0F, -3.0F, -24.0F, 15, 12, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 28, -7.0F, -3.0F, -8.0F, 15, 6, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 50, -6.0F, -2.0F, -26.0F, 12, 9, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 45, 56, -4.0F, -2.0F, -28.0F, 8, 7, 2, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -26.0F, -20.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.9599F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 75, 64, -7.0F, -8.3469F, 31.5329F, 3, 4, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 112, 25, -5.0F, -10.3469F, 32.5329F, 3, 4, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 110, 105, -7.0F, -5.3469F, 29.5329F, 3, 4, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 103, -5.0F, -7.3469F, 30.5329F, 3, 4, 1, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 17.0F, -9.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.9599F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 88, -3.0F, -24.0F, -10.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 88, -1.0F, -26.0F, -9.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 44, 1.0F, -24.0F, -10.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 39, 3.0F, -26.0F, -9.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 34, 5.0F, -24.0F, -10.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 80, 97, -3.0F, -21.0F, -12.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 97, 58, 1.0F, -21.0F, -12.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 97, 5.0F, -21.0F, -12.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 98, -7.0F, -18.0F, -14.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 98, -3.0F, -18.0F, -14.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 98, 1.0F, -18.0F, -14.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 95, 97, 5.0F, -18.0F, -14.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 38, 100, -7.0F, -15.0F, -16.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 99, -3.0F, -15.0F, -16.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 99, 63, 1.0F, -15.0F, -16.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 99, 5.0F, -15.0F, -16.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 101, 73, -7.0F, -12.0F, -18.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 101, 53, -3.0F, -12.0F, -18.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 100, 68, 1.0F, -12.0F, -18.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 100, 5.0F, -12.0F, -18.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 102, 83, -7.0F, -10.0F, -20.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 102, -3.0F, -10.0F, -20.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 102, 1.0F, -10.0F, -20.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 87, 101, 5.0F, -10.0F, -20.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 103, -7.0F, -7.0F, -22.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 103, -3.0F, -7.0F, -22.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 103, 1.0F, -7.0F, -22.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 95, 102, 5.0F, -7.0F, -22.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 107, -7.0F, -4.0F, -24.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 31, 104, 3.0F, -20.0F, -13.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 30, -1.0F, -20.0F, -13.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 25, -5.0F, -20.0F, -13.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 108, -3.0F, -4.0F, -24.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 107, 5.0F, -4.0F, -24.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 55, 108, 1.0F, -4.0F, -24.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 105, 58, 3.0F, -9.0F, -21.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 105, -1.0F, -9.0F, -21.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 105, 5, -5.0F, -9.0F, -21.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 102, 106, 3.0F, -6.0F, -23.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 87, 106, -1.0F, -6.0F, -23.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 106, -5.0F, -6.0F, -23.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 105, 0, 3.0F, -11.0F, -19.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 78, -1.0F, -11.0F, -19.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 70, 104, -5.0F, -11.0F, -19.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 45, 3.0F, -14.0F, -17.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 40, -1.0F, -14.0F, -17.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 35, -5.0F, -14.0F, -17.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 20, 3.0F, -17.0F, -15.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 15, -1.0F, -17.0F, -15.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 103, 101, -5.0F, -17.0F, -15.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 103, 96, 3.0F, -23.0F, -11.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 103, 88, -1.0F, -23.0F, -11.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 107, 63, -5.0F, -3.0F, -25.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 107, 3.0F, -3.0F, -25.0F, 3, 4, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 63, 108, -1.0F, -3.0F, -25.0F, 3, 4, 1, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 2.0F, 6.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.6581F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 113, 55, -6.0F, -5.1091F, -3.3164F, 2, 4, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 73, -3.0F, -5.1091F, -3.3164F, 3, 4, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 50, 1.0F, -5.1091F, -3.3164F, 3, 4, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 92, 115, 5.0F, -5.1091F, -3.3164F, 2, 4, 1, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 2.0F, 6.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.309F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 92, -3.0F, -5.1091F, -4.3164F, 3, 4, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 83, 5.0F, -5.1091F, -4.3164F, 3, 4, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 10, 1.0F, -5.1091F, -4.3164F, 3, 4, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 82, -7.0F, -5.1091F, -4.3164F, 3, 4, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 25, 3.0F, -7.1091F, -3.3164F, 3, 4, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 20, -1.0F, -7.1091F, -3.3164F, 3, 4, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 112, 20, -5.0F, -7.1091F, -3.3164F, 3, 4, 1, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.8377F, -2.9081F, -5.6501F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.757F, 0.371F, 1.7704F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 112, 40, -2.0F, -11.621F, -1.932F, 3, 4, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 89, 58, -4.0F, -13.621F, -2.932F, 3, 4, 1, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-6.8377F, -2.9081F, -5.6501F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, -2.0624F, 0.371F, 1.7704F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 77, 108, -1.0F, -6.9579F, -2.8672F, 3, 4, 1, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 94, 110, 2.0F, -6.9579F, -1.8672F, 3, 4, 1, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-6.8377F, -2.9081F, -5.6501F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.9752F, 0.371F, 1.7704F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 69, 73, 0.0F, -4.0F, -1.0F, 3, 4, 1, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-14.4364F, -12.9671F, -4.6672F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, -1.9315F, 0.371F, 1.7704F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 87, 88, 9.1404F, 0.8323F, -9.6125F, 3, 4, 1, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 80, 79, 15.5205F, 3.8796F, -9.5226F, 3, 4, 1, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 109, 110, 13.8538F, 12.1679F, -5.3361F, 3, 4, 1, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-14.4364F, -12.9671F, -4.6672F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.9752F, 0.371F, 1.7704F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 108, 68, 17.5205F, 5.8138F, -8.2893F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 88, 83, 11.1404F, 2.7733F, -8.512F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 77, 14.5205F, 0.8138F, -10.2893F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 84, 12.1404F, 0.7733F, -9.512F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 75, 12.1404F, -2.2267F, -10.512F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 76, 69, 18.5205F, 0.8138F, -10.2893F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 88, 78, 18.5205F, 3.8138F, -9.2893F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 74, 12.8538F, 8.9115F, -5.7452F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 40, 75, 16.8538F, 8.9115F, -5.7452F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 80, 16.8538F, 11.9115F, -4.7452F, 3, 4, 1, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 74, 15.8538F, 13.9115F, -3.7452F, 3, 4, 1, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-14.4364F, -12.9671F, -4.6672F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, -2.0624F, 0.371F, 1.7704F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 112, 35, 15.1404F, 0.6376F, -11.1885F, 3, 4, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 112, 30, 19.8538F, 11.318F, -5.469F, 3, 4, 1, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 17.0F, -22.0F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.9752F, -0.371F, -1.7704F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 95, 87, 15.0F, -5.0F, 11.0F, 3, 4, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 48, 95, 11.0F, -5.0F, 11.0F, 3, 4, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 72, 94, 11.0F, -2.0F, 12.0F, 3, 4, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 94, 12.0F, 0.0F, 13.0F, 3, 4, 1, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 17.0F, -22.0F);
		body.addChild(cube_r12);
		setRotationAngle(cube_r12, -2.0624F, -0.371F, -1.7704F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 95, 8.0F, -4.0F, 10.0F, 3, 4, 1, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 17.0F, -22.0F);
		body.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.9315F, -0.371F, -1.7704F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 94, 14.0F, -1.0F, 12.0F, 3, 4, 1, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 22.0F, -14.0F);
		body.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.9752F, -0.371F, -1.7704F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 16, 92, 12.0F, 0.0F, 13.0F, 3, 4, 1, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 91, 63, 11.0F, -2.0F, 12.0F, 3, 4, 1, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 90, 15.0F, -5.0F, 11.0F, 3, 4, 1, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 89, 11.0F, -5.0F, 11.0F, 3, 4, 1, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 22.0F, -14.0F);
		body.addChild(cube_r15);
		setRotationAngle(cube_r15, -1.9315F, -0.371F, -1.7704F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 90, 14.0F, -1.0F, 12.0F, 3, 4, 1, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 17.0F, -9.0F);
		body.addChild(cube_r16);
		setRotationAngle(cube_r16, -1.9315F, -0.371F, -1.7704F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 96, 92, 14.0F, -1.0F, 12.0F, 3, 4, 1, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 17.0F, -9.0F);
		body.addChild(cube_r17);
		setRotationAngle(cube_r17, -1.9752F, -0.371F, -1.7704F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 96, 25, 12.0F, 0.0F, 13.0F, 3, 4, 1, 0.0F));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 96, 39, 11.0F, -5.0F, 11.0F, 3, 4, 1, 0.0F));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 96, 20, 11.0F, -2.0F, 12.0F, 3, 4, 1, 0.0F));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 96, 78, 15.0F, -5.0F, 11.0F, 3, 4, 1, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 17.0F, -9.0F);
		body.addChild(cube_r18);
		setRotationAngle(cube_r18, -2.0624F, -0.371F, -1.7704F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 96, 15, 8.0F, -4.0F, 10.0F, 3, 4, 1, 0.0F));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 96, 44, 13.0F, -9.0F, 10.0F, 3, 4, 1, 0.0F));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 97, 0, 16.0F, -9.0F, 9.0F, 3, 4, 1, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 17.0F, -9.0F);
		body.addChild(cube_r19);
		setRotationAngle(cube_r19, -1.757F, -0.371F, -1.7704F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 96, 34, 19.0F, -12.0F, 9.0F, 3, 4, 1, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 97, 5, 17.0F, -10.0F, 10.0F, 3, 4, 1, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.0F, -19.0F);
		head.cubeList.add(new ModelBox(head, 23, 56, -3.0F, -3.0F, -5.0F, 6, 5, 5, 0.0F));
		head.cubeList.add(new ModelBox(head, 65, 53, -2.0F, -2.0F, -7.0F, 4, 4, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 14, 97, -1.0F, -1.0F, -9.0F, 2, 3, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 111, 88, -1.0F, 0.0F, -11.0F, 2, 2, 2, 0.0F));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		legAvG = new ModelRenderer(this);
		legAvG.setRotationPoint(8.0F, -10.0F, -7.0F);
		legs.addChild(legAvG);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-8.0F, 15.0F, -6.0F);
		legAvG.addChild(cube_r20);
		setRotationAngle(cube_r20, -2.5082F, -0.4779F, -1.8534F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 10, 61, 7.0F, -12.0F, 8.0F, 2, 3, 1, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-8.0F, 15.0F, -6.0F);
		legAvG.addChild(cube_r21);
		setRotationAngle(cube_r21, -2.5424F, -0.371F, -1.7704F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 96, 83, 6.0F, -12.0F, 7.0F, 2, 3, 1, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-8.0F, 15.0F, -6.0F);
		legAvG.addChild(cube_r22);
		setRotationAngle(cube_r22, -1.9752F, -0.371F, -1.7704F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 115, 65, 4.0F, -6.0F, 11.0F, 2, 3, 1, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 116, 7.0F, -7.0F, 11.0F, 2, 3, 1, 0.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-5.0F, 15.0F, -1.0F);
		legAvG.addChild(cube_r23);
		setRotationAngle(cube_r23, -1.9752F, -0.371F, -1.7704F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 88, 93, 15.0F, -5.0F, 11.0F, 3, 4, 1, 0.0F));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 93, 73, 11.0F, -5.0F, 11.0F, 3, 4, 1, 0.0F));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 93, 11.0F, -2.0F, 12.0F, 3, 4, 1, 0.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-5.0F, 15.0F, -1.0F);
		legAvG.addChild(cube_r24);
		setRotationAngle(cube_r24, -2.0624F, -0.371F, -1.7704F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 64, 93, 8.0F, -4.0F, 10.0F, 3, 4, 1, 0.0F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-5.0F, 15.0F, -1.0F);
		legAvG.addChild(cube_r25);
		setRotationAngle(cube_r25, -1.9315F, -0.371F, -1.7704F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 93, 53, 14.0F, -1.0F, 12.0F, 3, 4, 1, 0.0F));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-8.0F, 15.0F, 7.0F);
		legAvG.addChild(cube_r26);
		setRotationAngle(cube_r26, -1.5708F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 49, 11, 8.0F, 20.0F, -6.0F, 1, 1, 1, 0.0F));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 49, 29, 10.0F, 20.0F, -6.0F, 1, 1, 1, 0.0F));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 8, 40, 8.0F, 17.0F, -6.0F, 3, 3, 1, 0.0F));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 22, 72, 8.0F, 14.0F, -7.0F, 3, 3, 2, 0.0F));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-8.0F, 15.0F, 7.0F);
		legAvG.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.9163F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 43, 65, 8.0F, 0.0F, -15.0F, 3, 8, 2, 0.0F));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-8.0F, 15.0F, 7.0F);
		legAvG.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.5672F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 61, 61, 8.0F, -12.0F, -16.0F, 3, 8, 4, 0.0F));

		legAvD = new ModelRenderer(this);
		legAvD.setRotationPoint(-8.0F, -10.0F, -7.0F);
		legs.addChild(legAvD);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-6.4364F, -14.9671F, 11.3328F);
		legAvD.addChild(cube_r29);
		setRotationAngle(cube_r29, -1.9752F, 0.371F, 1.7704F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 84, 68, 15.5954F, 3.2724F, -4.9602F, 3, 4, 1, 0.0F));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 24, 82, 11.5954F, 3.2724F, -4.9602F, 3, 4, 1, 0.0F));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 73, 15.5954F, 6.2724F, -3.9602F, 3, 4, 1, 0.0F));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 10, 28, 21.8538F, 6.9115F, -5.7452F, 2, 3, 1, 0.0F));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 10, 0, 24.8538F, 7.9115F, -5.7452F, 2, 3, 1, 0.0F));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-6.4364F, -14.9671F, 11.3328F);
		legAvD.addChild(cube_r30);
		setRotationAngle(cube_r30, -2.0624F, 0.371F, 1.7704F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 8, 84, 18.5954F, 5.6319F, -5.1785F, 3, 4, 1, 0.0F));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-6.4364F, -14.9671F, 11.3328F);
		legAvD.addChild(cube_r31);
		setRotationAngle(cube_r31, -1.9315F, 0.371F, 1.7704F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 64, 83, 12.5954F, 6.5683F, -4.3058F, 3, 4, 1, 0.0F));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-6.4364F, -14.9671F, 11.3328F);
		legAvD.addChild(cube_r32);
		setRotationAngle(cube_r32, -2.5082F, 0.4779F, 1.8534F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 42, 116, 20.7221F, 8.73F, -2.6184F, 2, 3, 1, 0.0F));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-6.4364F, -14.9671F, 11.3328F);
		legAvD.addChild(cube_r33);
		setRotationAngle(cube_r33, -2.5424F, 0.371F, 1.7704F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 116, 22.8538F, 8.73F, 0.3519F, 2, 3, 1, 0.0F));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(8.0F, 15.0F, 7.0F);
		legAvD.addChild(cube_r34);
		setRotationAngle(cube_r34, -1.5708F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 28, -8.0F, 20.0F, -6.0F, 1, 1, 1, 0.0F));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 46, 10, -10.0F, 20.0F, -6.0F, 1, 1, 1, 0.0F));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 71, 59, -10.0F, 14.0F, -7.0F, 3, 3, 2, 0.0F));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 40, -10.0F, 17.0F, -6.0F, 3, 3, 1, 0.0F));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-10.0F, 15.0F, 7.0F);
		legAvD.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.5672F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 61, 8.0F, -12.0F, -16.0F, 3, 8, 4, 0.0F));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-10.0F, 15.0F, 7.0F);
		legAvD.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.9163F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 14, 64, 8.0F, 0.0F, -15.0F, 3, 8, 2, 0.0F));

		legArG = new ModelRenderer(this);
		legArG.setRotationPoint(-8.0F, -10.0F, 11.0F);
		legs.addChild(legArG);
		

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(11.0F, 17.0F, -5.0F);
		legArG.addChild(cube_r37);
		setRotationAngle(cube_r37, -2.3679F, -0.371F, -1.7704F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 93, 15.0F, -9.0F, 9.0F, 3, 4, 1, 0.0F));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(11.0F, 17.0F, -5.0F);
		legArG.addChild(cube_r38);
		setRotationAngle(cube_r38, -2.0624F, -0.371F, -1.7704F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 80, 92, 13.0F, -11.0F, 7.0F, 3, 4, 1, 0.0F));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 24, 92, 16.0F, -9.0F, 9.0F, 3, 4, 1, 0.0F));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 92, 68, 13.0F, -8.0F, 9.0F, 3, 4, 1, 0.0F));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(8.0F, 15.0F, -11.0F);
		legArG.addChild(cube_r39);
		setRotationAngle(cube_r39, -1.5708F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 2, 10.0F, -3.0F, -6.0F, 1, 1, 1, 0.0F));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 0, 8.0F, -3.0F, -6.0F, 1, 1, 1, 0.0F));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(8.0F, 15.0F, 12.0F);
		legArG.addChild(cube_r40);
		setRotationAngle(cube_r40, -1.5708F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 8, 12, 8.0F, 17.0F, -6.0F, 3, 3, 1, 0.0F));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 32, 69, 8.0F, 14.0F, -7.0F, 3, 3, 2, 0.0F));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(8.0F, 15.0F, 12.0F);
		legArG.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.9163F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 46, 34, 8.0F, 0.0F, -15.0F, 3, 8, 2, 0.0F));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(18.0F, 6.0F, 1.0F);
		legArG.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.6545F, 0.0F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 28, -2.0F, -7.3198F, 1.113F, 3, 8, 4, 0.0F));

		legArD = new ModelRenderer(this);
		legArD.setRotationPoint(8.0F, -10.0F, 11.0F);
		legs.addChild(legArD);
		

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-14.8377F, -4.9081F, -7.6501F);
		legArD.addChild(cube_r43);
		setRotationAngle(cube_r43, -2.0624F, 0.371F, 1.7704F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 81, 58, -0.7941F, -13.905F, -3.7018F, 3, 4, 1, 0.0F));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 32, 89, 2.2059F, -15.905F, -5.7018F, 3, 4, 1, 0.0F));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 8, 89, 2.2059F, -12.905F, -3.7018F, 3, 4, 1, 0.0F));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-14.8377F, -4.9081F, -7.6501F);
		legArD.addChild(cube_r44);
		setRotationAngle(cube_r44, -2.3679F, 0.371F, 1.7704F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 83, 0.2059F, -9.8584F, -4.5889F, 3, 4, 1, 0.0F));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-8.0F, 15.0F, -11.0F);
		legArD.addChild(cube_r45);
		setRotationAngle(cube_r45, -1.5708F, 0.0F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 30, -8.0F, -3.0F, -6.0F, 1, 1, 1, 0.0F));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 28, -10.0F, -3.0F, -6.0F, 1, 1, 1, 0.0F));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-26.0F, 15.0F, 12.0F);
		legArD.addChild(cube_r46);
		setRotationAngle(cube_r46, -1.5708F, 0.0F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 12, 8.0F, 17.0F, -6.0F, 3, 3, 1, 0.0F));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 24, 66, 8.0F, 14.0F, -7.0F, 3, 3, 2, 0.0F));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-26.0F, 15.0F, 12.0F);
		legArD.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.9163F, 0.0F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 46, 0, 8.0F, 0.0F, -15.0F, 3, 8, 2, 0.0F));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-16.0F, 6.0F, 1.0F);
		legArD.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.6545F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 0, -2.0F, -7.3198F, 1.113F, 3, 8, 4, 0.0F));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 14.0F, 16.0F);
		

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, 8.0F, 26.0F);
		tail.addChild(cube_r49);
		setRotationAngle(cube_r49, -1.6581F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 113, 115, 5.0F, -5.1091F, -3.3164F, 2, 4, 1, 0.0F));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 70, 112, 1.0F, -5.1091F, -3.3164F, 3, 4, 1, 0.0F));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 48, 112, -3.0F, -5.1091F, -3.3164F, 3, 4, 1, 0.0F));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 78, 113, -6.0F, -5.1091F, -3.3164F, 2, 4, 1, 0.0F));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, 8.0F, 26.0F);
		tail.addChild(cube_r50);
		setRotationAngle(cube_r50, -1.309F, 0.0F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 111, -5.0F, -7.1091F, -3.3164F, 3, 4, 1, 0.0F));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 80, 84, -1.0F, -7.1091F, -3.3164F, 3, 4, 1, 0.0F));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 72, 84, 3.0F, -7.1091F, -3.3164F, 3, 4, 1, 0.0F));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 62, 113, -6.0F, -5.1091F, -4.3164F, 2, 4, 1, 0.0F));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 112, 45, 1.0F, -5.1091F, -4.3164F, 3, 4, 1, 0.0F));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 107, 115, 5.0F, -5.1091F, -4.3164F, 2, 4, 1, 0.0F));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, -25.0F, -2.0F);
		tail.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0873F, 0.0F, 0.0F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 46, 15, -6.0F, 29.9125F, 11.9954F, 13, 3, 16, 0.0F));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.0F, -25.0F, -2.0F);
		tail.addChild(cube_r52);
		setRotationAngle(cube_r52, -0.3927F, 0.0F, 0.0F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 46, 34, -6.0F, 20.2492F, 10.8017F, 13, 3, 16, 0.0F));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, -25.0F, -2.0F);
		tail.addChild(cube_r53);
		setRotationAngle(cube_r53, -1.0036F, 0.0F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 113, 5, 5.0F, -8.52F, 37.3057F, 2, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 78, 3.0F, -10.52F, 38.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 77, 74, 1.0F, -8.52F, 37.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 77, 53, -1.0F, -10.52F, 38.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 24, 77, -3.0F, -8.52F, 37.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 112, 78, -6.0F, -8.52F, 37.3057F, 2, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 40, 111, -5.0F, -10.52F, 38.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 24, 113, 5.0F, -4.52F, 35.3057F, 2, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 32, 79, 3.0F, -6.52F, 36.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 8, 79, 1.0F, -4.52F, 35.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 64, 78, -1.0F, -6.52F, 36.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 56, 78, -3.0F, -4.52F, 35.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 113, 0, -6.0F, -4.52F, 35.3057F, 2, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 85, 111, -5.0F, -6.52F, 36.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 102, 111, -6.0F, -0.52F, 33.3057F, 2, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 111, 97, -5.0F, -2.52F, 34.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 83, 63, -3.0F, -0.52F, 33.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 40, 80, -1.0F, -2.52F, 34.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 56, 83, 1.0F, -0.52F, 33.3057F, 3, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 56, 113, 5.0F, -0.52F, 33.3057F, 2, 4, 1, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 72, 79, 3.0F, -2.52F, 34.3057F, 3, 4, 1, 0.0F));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.0F, -25.0F, -2.0F);
		tail.addChild(cube_r54);
		setRotationAngle(cube_r54, -1.6581F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 56, 34, -6.0F, -16.2842F, 25.5013F, 2, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 8, 112, -5.0F, -18.2842F, 26.5013F, 3, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 85, 73, -3.0F, -16.2842F, 25.5013F, 3, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 85, 53, -1.0F, -18.2842F, 26.5013F, 3, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 48, 85, 1.0F, -16.2842F, 25.5013F, 3, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 30, 114, 5.0F, -16.2842F, 25.5013F, 2, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 40, 85, 3.0F, -18.2842F, 26.5013F, 3, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 56, 39, -6.0F, -12.2842F, 23.5013F, 2, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 112, 15, -5.0F, -14.2842F, 24.5013F, 3, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 61, 73, -3.0F, -12.2842F, 23.5013F, 3, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 24, 87, -1.0F, -14.2842F, 24.5013F, 3, 4, 1, 0.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 16, 87, 3.0F, -14.2842F, 24.5013F, 3, 4, 1, 0.0F));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.0F, 0.0F, -1.0F);
		tail.addChild(cube_r55);
		setRotationAngle(cube_r55, -1.6581F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 32, 109, 1.0F, -9.1091F, -1.3164F, 3, 4, 1, 0.0F));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 115, 60, 5.0F, -9.1091F, -1.3164F, 2, 4, 1, 0.0F));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 16, 112, -5.0F, -7.1091F, -2.3164F, 3, 4, 1, 0.0F));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 88, 15, -1.0F, -7.1091F, -2.3164F, 3, 4, 1, 0.0F));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 88, 3.0F, -7.1091F, -2.3164F, 3, 4, 1, 0.0F));

		selle = new ModelRenderer(this);
		selle.setRotationPoint(0.0F, 24.0F, 0.0F);
		selle.cubeList.add(new ModelBox(selle, 46, 0, -9.0F, -18.0F, -6.0F, 19, 2, 13, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 53, 65, 8.0F, -16.0F, 3.0F, 2, 8, 2, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 53, 65, -9.0F, -16.0F, 3.0F, 2, 8, 2, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 28, 53, -7.0F, -9.0F, 3.0F, 15, 1, 2, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		head.render(f5);
		legs.render(f5);
		tail.render(f5);
		selle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		this.head.rotateAngleX = 0.20943952f;
		final ModelRenderer head = this.head;
		head.rotateAngleX += MathHelper.cos(f * 0.2f) * 0.3f * f1;
		final ModelRenderer tail = this.tail;
		tail.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.legAvG.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.legAvD.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArG.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArD.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
	}
}