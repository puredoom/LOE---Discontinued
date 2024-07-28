package drealm.model;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelCaragor extends ModelBase {
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
	private final ModelRenderer leftbackleg;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer rightbackleg;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer leftfrontleg;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer rightfrontleg;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer head;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;

	public DRModelCaragor() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 2.0F, 25.0F);
		body.cubeList.add(new ModelBox(body, 0, 38, -12.0F, -6.0F, -37.0F, 24, 17, 20, 0.0F));
		body.cubeList.add(new ModelBox(body, 89, 89, -10.0F, -6.0F, -41.0F, 20, 12, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 0, -10.0F, -6.0F, -17.0F, 20, 12, 26, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-6.0F, -6.0F, -29.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.8335F, -0.2975F, -0.2602F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 116, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 96, 63, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 11.9F, -15.7F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5236F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -2.0F, 27.0F, 2, 9, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 59, 93, -1.5F, -3.0F, 27.0F, 3, 4, 3, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.0F, -6.0F, -12.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.8335F, -0.2975F, -0.2602F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 138, 77, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 92, 51, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-6.0F, -6.0F, -21.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.8335F, -0.2975F, -0.2602F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 121, 120, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 96, 57, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.0F, -6.0F, -36.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.8335F, -0.2975F, -0.2602F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 98, 105, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 94, 79, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.0F, -6.0F, -4.0F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.8335F, -0.2975F, -0.2602F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 94, 79, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 98, 105, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -6.0F, 1.0F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.8727F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 104, 31, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 92, 30, -1.5F, -1.0F, -1.5F, 3, 4, 3, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -6.0F, -9.0F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.8727F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 0, -1.0F, -7.0F, -1.0F, 2, 8, 2, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 75, -1.5F, -3.0F, -1.5F, 3, 6, 3, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -6.0F, -17.0F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.8727F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 96, 57, -1.0F, -7.0F, -1.0F, 2, 8, 2, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 82, 79, -1.5F, -3.0F, -1.5F, 3, 6, 3, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -6.0F, -25.0F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.8727F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 88, -1.5F, -3.0F, -1.5F, 3, 6, 3, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 104, 21, -1.0F, -7.0F, -1.0F, 2, 8, 2, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(4.0F, -6.0F, -4.0F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.8335F, 0.2975F, 0.2602F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 94, 79, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 98, 105, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(6.0F, -6.0F, -12.0F);
		body.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.8335F, 0.2975F, 0.2602F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 92, 51, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 138, 77, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(6.0F, -6.0F, -21.0F);
		body.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.8335F, 0.2975F, 0.2602F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 96, 57, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 121, 120, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(6.0F, -6.0F, -36.0F);
		body.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.8335F, 0.2975F, 0.2602F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 94, 79, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 98, 105, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(6.0F, -6.0F, -29.0F);
		body.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.8335F, 0.2975F, 0.2602F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 96, 63, -1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 4, 116, -1.0F, -4.0F, -1.0F, 2, 5, 2, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, -6.0F, -40.0F);
		body.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.8727F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 18, 15, -1.0F, -7.0F, -1.0F, 2, 8, 2, 0.0F));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 75, -1.5F, -3.0F, -1.5F, 3, 6, 3, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, -6.0F, -32.0F);
		body.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.8727F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 92, 21, -1.5F, -3.0F, -1.5F, 3, 6, 3, 0.0F));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 102, 65, -1.0F, -7.0F, -1.0F, 2, 8, 2, 0.0F));

		leftbackleg = new ModelRenderer(this);
		leftbackleg.setRotationPoint(13.0F, 3.0F, 28.0F);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.0F, 20.0F, 11.5F);
		leftbackleg.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.5708F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 47, -1.0F, 7.0F, -1.0F, 6, 7, 2, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.0F, 17.0F, 12.0F);
		leftbackleg.addChild(cube_r19);
		setRotationAngle(cube_r19, -1.5708F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 23, 88, 0.0F, 7.0F, -3.0F, 4, 5, 7, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.0F, 1.0F, 1.0F);
		leftbackleg.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.7418F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 88, 0.0F, 7.0F, -3.0F, 4, 5, 15, 0.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 68, 96, -1.0F, -5.0F, -6.0F, 6, 16, 9, 0.0F));

		rightbackleg = new ModelRenderer(this);
		rightbackleg.setRotationPoint(-13.0F, 3.0F, 28.0F);
		

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(2.0F, 17.0F, 12.0F);
		rightbackleg.addChild(cube_r21);
		setRotationAngle(cube_r21, -1.5708F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 23, 88, -4.0F, 7.0F, -3.0F, 4, 5, 7, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.0F, 20.0F, 11.5F);
		rightbackleg.addChild(cube_r22);
		setRotationAngle(cube_r22, -1.5708F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 47, -5.0F, 7.0F, -1.0F, 6, 7, 2, 0.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(2.0F, 1.0F, 1.0F);
		rightbackleg.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.7418F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 68, 96, -5.0F, -5.0F, -6.0F, 6, 16, 9, 0.0F));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 88, -4.0F, 7.0F, -3.0F, 4, 5, 15, 0.0F));

		leftfrontleg = new ModelRenderer(this);
		leftfrontleg.setRotationPoint(15.0F, 2.0F, -7.0F);
		

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.0F, 21.0F, 5.5F);
		leftfrontleg.addChild(cube_r24);
		setRotationAngle(cube_r24, -1.5708F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 38, -1.0F, 7.0F, -1.0F, 6, 7, 2, 0.0F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.0F, 20.0F, 6.0F);
		leftfrontleg.addChild(cube_r25);
		setRotationAngle(cube_r25, -1.8326F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 15, 0.0F, 7.0F, -1.0F, 4, 5, 5, 0.0F));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-2.0F, -1.0F, 1.0F);
		leftfrontleg.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.7854F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 70, 57, 0.0F, 8.0F, -17.0F, 4, 4, 18, 0.0F));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 38, 93, -1.0F, -5.0F, -6.0F, 6, 16, 9, 0.0F));

		rightfrontleg = new ModelRenderer(this);
		rightfrontleg.setRotationPoint(-15.0F, 2.0F, -7.0F);
		

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(2.0F, -1.0F, 1.0F);
		rightfrontleg.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.7854F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 38, 93, -5.0F, -5.0F, -6.0F, 6, 16, 9, 0.0F));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 70, 57, -4.0F, 8.0F, -17.0F, 4, 4, 18, 0.0F));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(2.0F, 20.0F, 6.0F);
		rightfrontleg.addChild(cube_r28);
		setRotationAngle(cube_r28, -1.8326F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 15, -4.0F, 7.0F, -1.0F, 4, 5, 5, 0.0F));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(2.0F, 21.0F, 5.5F);
		rightfrontleg.addChild(cube_r29);
		setRotationAngle(cube_r29, -1.5708F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 38, -5.0F, 7.0F, -1.0F, 6, 7, 2, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 2.0F, -15.0F);
		head.cubeList.add(new ModelBox(head, 66, 0, -7.0F, -7.0F, -12.0F, 14, 10, 11, 0.0F));
		head.cubeList.add(new ModelBox(head, 68, 38, -7.5F, 2.1F, -12.5F, 15, 1, 12, 0.0F));
		head.cubeList.add(new ModelBox(head, 16, 44, 6.0F, 3.0F, -10.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 16, 44, 6.0F, 3.0F, -8.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 22, 9, 6.0F, 3.0F, -12.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 21, 0, 4.0F, 3.0F, -12.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 22, 9, 0.3F, 3.0F, -12.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 229, 197, 2.0F, 3.0F, -12.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 16, 44, -7.0F, 3.0F, -8.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 22, 9, -1.3F, 3.0F, -12.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 16, 44, -7.0F, 3.0F, -10.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 22, 9, -7.0F, 3.0F, -12.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 21, 0, -5.0F, 3.0F, -12.0F, 1, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 229, 197, -3.0F, 3.0F, -12.0F, 1, 1, 1, 0.0F));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(1.0F, 3.0F, 0.0F);
		head.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.3927F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 13, 15, -5.0F, -2.0F, -12.0F, 1, 2, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 41, -8.0F, -2.0F, -11.0F, 1, 2, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 15, 46, -8.0F, -1.0F, -7.0F, 1, 1, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 38, -8.0F, -2.0F, -9.0F, 1, 2, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 15, 46, -3.0F, -1.0F, -12.0F, 1, 1, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 48, -8.0F, -1.0F, -5.0F, 1, 1, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 15, -7.0F, -3.0F, -12.0F, 1, 3, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 48, 5.0F, -1.0F, -5.0F, 1, 1, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 15, 46, 5.0F, -1.0F, -7.0F, 1, 1, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 38, 5.0F, -2.0F, -9.0F, 1, 2, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 13, 15, 2.0F, -2.0F, -12.0F, 1, 2, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 15, 46, 0.0F, -1.0F, -12.0F, 1, 1, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 41, 5.0F, -2.0F, -11.0F, 1, 2, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 15, 4.0F, -3.0F, -12.0F, 1, 3, 1, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 75, -8.5F, -0.1F, -12.5F, 15, 1, 12, 0.0F));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 43, 79, -8.0F, 0.0F, -12.0F, 14, 3, 11, 0.0F));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 1.0F, -12.0F);
		head.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.3054F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 0, -1.0F, -5.0F, -1.5F, 2, 4, 11, 0.0F));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, -6.0F, -8.0F);
		head.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.8727F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 15, 0, -1.0F, -7.0F, -1.0F, 2, 8, 2, 0.0F));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 68, 38, -1.5F, -3.0F, -1.5F, 3, 6, 3, 0.0F));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 1.0F, -12.0F);
		head.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.6109F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 68, 51, -2.0F, -3.0F, -2.0F, 4, 4, 3, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		leftbackleg.render(f5);
		rightbackleg.render(f5);
		leftfrontleg.render(f5);
		rightfrontleg.render(f5);
		head.render(f5);
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
		this.leftfrontleg.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.leftbackleg.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.rightfrontleg.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.rightbackleg.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
	}
}