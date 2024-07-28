package drealm.model;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelSouris extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer head;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer leftwing;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer rightwing;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;

	public DRModelSouris() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 15.0F);
		body.cubeList.add(new ModelBox(body, 36, 109, -1.0F, 1.3798F, 27.4927F, 2, 2, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 57, -2.0F, 0.3798F, 18.4927F, 4, 4, 9, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -2.0F, -8.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 121, 70, -3.0F, -1.0F, 21.0F, 6, 6, 9, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 62, 117, -4.0F, -2.0F, 11.0F, 8, 8, 10, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 121, 24, -5.0F, -3.0F, 5.0F, 10, 10, 6, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 121, 40, -5.0F, -7.0F, -12.0F, 10, 10, 6, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -2.0F, -8.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 71, -7.0F, -6.0F, -8.0F, 14, 12, 15, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -3.0F, -5.0F);
		head.cubeList.add(new ModelBox(head, 121, 56, -4.0F, -5.0F, -7.0F, 8, 6, 8, 0.0F));
		head.cubeList.add(new ModelBox(head, 0, 134, -3.0F, -1.0F, -8.0F, 6, 2, 8, 0.0F));
		head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -2.0F, -9.0F, 2, 2, 9, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.0F, -4.0F, -1.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.5236F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 70, -2.0F, -4.0F, -1.0F, 3, 4, 0, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 32, 1.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 0, -2.0F, -9.0F, 2.0F, 3, 9, 0, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 8, -2.0F, -6.0F, -1.0F, 0, 6, 3, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.0F, -4.0F, -1.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.5236F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 2.0F, -6.0F, -1.0F, 0, 6, 3, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 18, -1.0F, -5.0F, -1.0F, 0, 5, 3, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 70, -1.0F, -4.0F, -1.0F, 3, 4, 0, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 47, -1.0F, -9.0F, 2.0F, 3, 9, 0, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 1.0F, 1.0F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3927F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 122, 129, -3.0F, -2.0F, -9.0F, 6, 2, 8, 0.0F));

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(2.0F, 3.0F, 14.0F);
		leftwing.cubeList.add(new ModelBox(leftwing, 61, 70, 12.0F, 3.3798F, 12.4927F, 2, 0, 26, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 62, 0, 27.0F, 3.3798F, 12.4927F, 3, 0, 26, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 52, 90, 41.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 56, 90, 26.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 48, 90, 14.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 97, 80, 15.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 78, 97, 24.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 70, 97, 39.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 97, 40, 31.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 86, 76, 33.0F, 3.3798F, 12.4927F, 6, 0, 19, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 40, 90, 45.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 93, 95, 46.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 80, 38, 48.0F, 3.3798F, 12.4927F, 6, 0, 19, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 66, 96, 54.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 42, 90, 56.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 72, 78, 17.0F, 3.3798F, 12.4927F, 7, 0, 19, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 89, 19, -1.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 93, 20, 0.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 53, 71, 2.0F, 3.3798F, 12.4927F, 7, 0, 19, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 93, 40, 9.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 89, 41, 11.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 67, 26, 42.0F, 3.3798F, 12.4927F, 3, 0, 26, 0.0F));
		leftwing.cubeList.add(new ModelBox(leftwing, 58, 90, 30.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(24.0F, -2.0F, -7.0F);
		leftwing.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, -10.0F, 0.0F, -1.0F, 33, 0, 22, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 44, -25.0F, 0.0F, -6.0F, 15, 0, 27, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 71, 23.0F, 0.0F, 6.0F, 7, 0, 15, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(39.0F, 2.6F, -5.0F);
		leftwing.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2934F, 0.4623F, -0.1339F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 129, -4.0F, -6.0F, -8.0F, 11, 4, 5, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(53.6F, 7.1F, 26.5F);
		leftwing.addChild(cube_r8);
		setRotationAngle(cube_r8, 2.6333F, -1.5087F, -2.7247F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 117, 100, -7.0F, -5.0F, -5.0F, 21, 2, 2, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(49.8F, 5.3F, 8.5F);
		leftwing.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.4389F, -1.2441F, 0.3788F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 107, -7.0F, -6.0F, -8.0F, 21, 4, 5, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(40.4F, 2.6F, -5.0F);
		leftwing.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3776F, -0.7926F, 0.2753F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 116, -7.0F, -6.0F, -8.0F, 21, 4, 5, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(14.0F, 2.6F, -5.0F);
		leftwing.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2934F, -0.4623F, 0.1339F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 98, 128, -7.0F, -6.0F, -8.0F, 11, 4, 5, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(26.0F, 3.3F, -2.9F);
		leftwing.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 98, 119, -7.0F, -6.0F, -8.0F, 15, 4, 5, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(12.0F, 2.0F, -7.0F);
		leftwing.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.2618F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 135, -7.0F, -6.0F, -8.0F, 7, 4, 5, 0.0F));

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(-2.0F, 3.0F, 14.0F);
		rightwing.cubeList.add(new ModelBox(rightwing, 0, 44, -15.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 62, 90, -17.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 39, 71, -24.0F, 3.3798F, 12.4927F, 7, 0, 19, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 93, 0, -26.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 2, 44, -27.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 36, 90, -31.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 85, 95, -33.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 80, 19, -39.0F, 3.3798F, 12.4927F, 6, 0, 19, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 89, 95, -41.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 38, 90, -42.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 80, 57, -54.0F, 3.3798F, 12.4927F, 6, 0, 19, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 97, 0, -48.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 97, 20, -56.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 97, 60, -11.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 74, 97, -2.0F, 3.3798F, 12.4927F, 2, 0, 20, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 44, 90, 0.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 46, 90, -12.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 50, 90, -46.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 54, 90, -57.0F, 3.3798F, 12.4927F, 1, 0, 22, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 61, 44, -30.0F, 3.3798F, 12.4927F, 3, 0, 26, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 68, 0, -14.0F, 3.3798F, 12.4927F, 2, 0, 26, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 79, 0, -9.0F, 3.3798F, 12.4927F, 7, 0, 19, 0.0F));
		rightwing.cubeList.add(new ModelBox(rightwing, 67, 52, -45.0F, 3.3798F, 12.4927F, 3, 0, 26, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-39.0F, 2.6F, -5.0F);
		rightwing.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.2934F, -0.4623F, 0.1339F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 125, -7.0F, -6.0F, -8.0F, 11, 4, 5, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-26.0F, 3.3F, -2.9F);
		rightwing.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 121, 15, -8.0F, -6.0F, -8.0F, 15, 4, 5, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-12.0F, 2.0F, -7.0F);
		rightwing.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 135, 0, 0.0F, -6.0F, -8.0F, 7, 4, 5, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-53.6F, 7.1F, 26.5F);
		rightwing.addChild(cube_r17);
		setRotationAngle(cube_r17, 2.6333F, 1.5087F, 2.7247F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 117, 104, -14.0F, -5.0F, -5.0F, 21, 2, 2, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-14.0F, 2.6F, -5.0F);
		rightwing.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.2934F, 0.4623F, -0.1339F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 121, 85, -4.0F, -6.0F, -8.0F, 11, 4, 5, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-40.4F, 2.6F, -5.0F);
		rightwing.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.3776F, 0.7926F, -0.2753F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 112, 110, -14.0F, -6.0F, -8.0F, 21, 4, 5, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-49.8F, 5.3F, 8.5F);
		rightwing.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.4389F, 1.2441F, -0.3788F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 98, -14.0F, -6.0F, -8.0F, 21, 4, 5, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-24.0F, -2.0F, -7.0F);
		rightwing.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.2618F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 106, 0, -30.0F, 0.0F, 6.0F, 7, 0, 15, 0.0F));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 44, 10.0F, 0.0F, -6.0F, 15, 0, 27, 0.0F));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -23.0F, 0.0F, -1.0F, 33, 0, 22, 0.0F));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(5.0F, 8.0F, 17.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 0, 21, -0.5F, 9.5F, -0.5F, 2, 4, 2, 0.0F));
		leftleg.cubeList.add(new ModelBox(leftleg, 10, 43, -1.0F, 12.5F, -1.0F, 3, 1, 3, 0.0F));
		leftleg.cubeList.add(new ModelBox(leftleg, 72, 112, -1.5F, 13.5F, -1.5F, 4, 1, 4, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-5.0F, -1.0F, -3.0F);
		leftleg.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.6545F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 11, 4.5F, 5.5F, 2.0F, 2, 2, 8, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 43, 4.0F, -2.0F, 1.0F, 3, 8, 4, 0.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.0F, 14.0F, -1.5F);
		leftleg.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.3491F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 55, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(1.5F, 14.0F, -1.5F);
		leftleg.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, -0.3491F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 24, 0.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-5.0F, 8.0F, 17.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 12, 11, -1.5F, 9.5F, -0.5F, 2, 4, 2, 0.0F));
		rightleg.cubeList.add(new ModelBox(rightleg, 10, 31, -2.0F, 12.5F, -1.0F, 3, 1, 3, 0.0F));
		rightleg.cubeList.add(new ModelBox(rightleg, 56, 112, -2.5F, 13.5F, -1.5F, 4, 1, 4, 0.0F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.5F, 14.0F, -1.5F);
		rightleg.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.3491F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -1.0F, -0.5F, -2.0F, 1, 1, 2, 0.0F));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(1.0F, 14.0F, -1.5F);
		rightleg.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, -0.3491F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 59, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(5.0F, -1.0F, -3.0F);
		rightleg.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.6545F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 31, -7.0F, -2.0F, 1.0F, 3, 8, 4, 0.0F));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 21, -6.5F, 5.5F, 2.0F, 2, 2, 8, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		head.render(f5);
		leftwing.render(f5);
		rightwing.render(f5);
		leftleg.render(f5);
		rightleg.render(f5);
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
		this.leftleg.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.rightleg.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
	}
}