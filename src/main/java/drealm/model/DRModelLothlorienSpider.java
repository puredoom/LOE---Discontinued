package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelLothlorienSpider extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer head;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer legs;
	private final ModelRenderer leg1G;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer leg2G;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer leg3G;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer leg4G;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer leg1D;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer leg2D;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer leg3D;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer leg4D;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;

	public DRModelLothlorienSpider() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 9.0F, 10.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -12.0F, -6.0F, -3.0F, 24, 12, 22, 0.0F));
		body.cubeList.add(new ModelBox(body, 56, 53, -11.0F, -7.0F, -3.0F, 22, 1, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 11, 11.0F, -7.0F, -3.0F, 1, 1, 10, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 0, -12.0F, -7.0F, -3.0F, 1, 1, 10, 0.0F));
		body.cubeList.add(new ModelBox(body, 36, 108, -9.0F, -7.0F, 11.0F, 18, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 112, 59, -10.0F, -7.0F, 9.0F, 20, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 116, 120, -8.0F, -7.0F, 13.0F, 16, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 28, 124, -7.0F, -7.0F, 15.0F, 14, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 128, 16, -6.0F, -7.0F, 17.0F, 12, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 52, -11.0F, 6.0F, -3.0F, 22, 1, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 112, 56, -10.0F, 6.0F, 9.0F, 20, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 118, 107, -8.0F, 6.0F, 13.0F, 16, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 36, 105, -9.0F, 6.0F, 11.0F, 18, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 116, 123, -7.0F, 6.0F, 15.0F, 14, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 128, 13, -6.0F, 6.0F, 17.0F, 12, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 38, 79, -13.0F, -4.0F, -3.0F, 1, 8, 18, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 11, -13.0F, -3.0F, 15.0F, 1, 6, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 94, 79, -12.0F, -3.0F, 19.0F, 24, 6, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 112, 62, -10.0F, -4.0F, 19.0F, 20, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 24, 122, -8.0F, -5.0F, 19.0F, 16, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 128, 19, -6.0F, -6.0F, 19.0F, 12, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 124, 64, -6.0F, 5.0F, 19.0F, 12, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 36, 119, -8.0F, 4.0F, 19.0F, 16, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 112, 35, -10.0F, 3.0F, 19.0F, 20, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 70, 13, -12.0F, -3.0F, -5.0F, 24, 6, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 112, 48, -10.0F, -4.0F, -5.0F, 20, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 118, 101, -8.0F, -5.0F, -5.0F, 16, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 128, 7, -6.0F, -6.0F, -5.0F, 12, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 112, 53, -10.0F, 3.0F, -5.0F, 20, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 118, 104, -8.0F, 4.0F, -5.0F, 16, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 128, 10, -6.0F, 5.0F, -5.0F, 12, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 34, -12.0F, -3.0F, -19.0F, 24, 6, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 60, 40, -10.0F, -4.0F, -19.0F, 20, 1, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 52, 66, -8.0F, -5.0F, -19.0F, 16, 1, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 58, 79, -6.0F, -6.0F, -19.0F, 12, 1, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 65, -10.0F, 3.0F, -19.0F, 20, 1, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 70, 0, -8.0F, 4.0F, -19.0F, 16, 1, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 80, 22, -6.0F, 5.0F, -19.0F, 12, 1, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 96, 66, -11.0F, -2.0F, -7.0F, 22, 4, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 108, 76, -10.0F, -3.0F, -7.0F, 20, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 114, 4, -8.0F, -4.0F, -7.0F, 16, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 58, 126, -6.0F, -5.0F, -7.0F, 12, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 112, 45, -10.0F, 2.0F, -7.0F, 20, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 118, 98, -8.0F, 3.0F, -7.0F, 16, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 28, 127, -6.0F, 4.0F, -7.0F, 12, 1, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 78, 12.0F, -4.0F, -3.0F, 1, 8, 18, 0.0F));
		body.cubeList.add(new ModelBox(body, 18, 105, 12.0F, 4.0F, -3.0F, 1, 1, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 104, 12.0F, -5.0F, -3.0F, 1, 1, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 100, 113, 12.0F, 5.0F, -3.0F, 1, 1, 14, 0.0F));
		body.cubeList.add(new ModelBox(body, 84, 112, 12.0F, -6.0F, -3.0F, 1, 1, 14, 0.0F));
		body.cubeList.add(new ModelBox(body, 68, 111, -13.0F, -6.0F, -3.0F, 1, 1, 14, 0.0F));
		body.cubeList.add(new ModelBox(body, 20, 78, -13.0F, -5.0F, -3.0F, 1, 1, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 100, 95, -13.0F, 4.0F, -3.0F, 1, 1, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 112, 7, -13.0F, 5.0F, -3.0F, 1, 1, 14, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 0, 12.0F, -3.0F, 15.0F, 1, 6, 4, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -6.0F, -18.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5387F, 0.2261F, 0.1332F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 110, -1.0F, 0.5885F, 0.5885F, 2, 2, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 100, 118, -1.0F, 2.5885F, 3.5885F, 2, 2, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 66, -1.0F, 4.5885F, 6.5885F, 2, 2, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 65, -1.0F, 6.5885F, 9.5885F, 2, 2, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -1.0F, 6.5885F, 12.5885F, 2, 2, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 53, -1.0F, 8.5885F, 15.5885F, 2, 2, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 78, -1.0F, 10.5885F, 18.5885F, 2, 2, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 100, 112, -1.0F, 12.5885F, 21.5885F, 2, 2, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 78, -1.0F, 14.5885F, 24.5885F, 2, 2, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 42, 136, -1.0F, 16.5885F, 27.5885F, 2, 2, 4, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -6.0F, -18.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5387F, -0.2261F, -0.1332F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 110, -1.0F, 0.5885F, 0.5885F, 2, 2, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 135, -1.0F, 2.5885F, 3.5885F, 2, 2, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 70, 6, -1.0F, 4.5885F, 6.5885F, 2, 2, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 70, 0, -1.0F, 6.5885F, 9.5885F, 2, 2, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 40, -1.0F, 6.5885F, 12.5885F, 2, 2, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 58, -1.0F, 8.5885F, 15.5885F, 2, 2, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 84, -1.0F, 10.5885F, 18.5885F, 2, 2, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 70, 115, -1.0F, 12.5885F, 21.5885F, 2, 2, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 58, 79, -1.0F, 14.5885F, 24.5885F, 2, 2, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 69, 136, -1.0F, 16.5885F, 27.5885F, 2, 2, 4, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -6.0F, -18.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 84, -1.0F, 14.5885F, 24.5885F, 2, 2, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 81, 136, -1.0F, 16.5885F, 27.5885F, 2, 2, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 84, -1.0F, 10.5885F, 18.5885F, 2, 2, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 117, -1.0F, 12.5885F, 21.5885F, 2, 2, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 52, -1.0F, 6.5885F, 12.5885F, 2, 2, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 39, -1.0F, 8.5885F, 15.5885F, 2, 2, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 78, -1.0F, 4.5885F, 6.5885F, 2, 2, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 71, -1.0F, 6.5885F, 9.5885F, 2, 2, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 111, -1.0F, 0.5885F, 0.5885F, 2, 2, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 135, -1.0F, 2.5885F, 3.5885F, 2, 2, 4, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 8.0F, 21.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.6981F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 16, -1.0F, -0.5F, -6.2309F, 1, 1, 3, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 0, -1.0F, -1.5F, -3.2309F, 2, 2, 3, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 12.0F, 0.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 59, -1.0F, 0.0F, 19.0F, 2, 2, 2, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 10.0F, -10.0F);
		head.cubeList.add(new ModelBox(head, 0, 122, -5.0F, -4.0F, 0.0F, 10, 5, 4, 0.0F));
		head.cubeList.add(new ModelBox(head, 76, 96, -6.0F, -5.0F, -8.0F, 12, 7, 8, 0.0F));
		head.cubeList.add(new ModelBox(head, 51, 133, -5.0F, -4.0F, -9.0F, 10, 6, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 124, 51, -6.0F, -6.0F, -1.0F, 12, 1, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 12, 85, 6.0F, -5.0F, -1.0F, 1, 7, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 50, 79, 6.0F, -4.0F, -3.0F, 1, 5, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 58, 72, 6.0F, -3.0F, -5.0F, 1, 3, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 46, 78, 6.0F, -2.0F, -7.0F, 1, 1, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 32, 78, -7.0F, -5.0F, -1.0F, 1, 7, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 12, 78, -7.0F, -4.0F, -3.0F, 1, 5, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 52, 72, -7.0F, -3.0F, -5.0F, 1, 3, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 62, 61, -7.0F, -2.0F, -7.0F, 1, 1, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 58, 121, -5.0F, -6.0F, -3.0F, 10, 1, 2, 0.0F));
		head.cubeList.add(new ModelBox(head, 22, 134, -4.0F, -6.0F, -7.0F, 8, 1, 4, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-7.0F, -1.0F, -10.0F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3927F, 0.7418F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 90, -2.0F, 1.0F, 0.0F, 3, 3, 3, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-7.0F, -1.0F, -10.0F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2952F, 0.247F, -0.1986F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 85, -1.0F, 2.0F, -3.0F, 2, 2, 4, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-7.0F, -1.0F, -10.0F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.836F, -0.6275F, -0.4878F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 12, 5, -2.0F, 2.0F, -7.0F, 1, 1, 4, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(7.0F, -1.0F, -10.0F);
		head.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.836F, 0.6275F, 0.4878F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 11, 1.0F, 2.0F, -7.0F, 1, 1, 4, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(7.0F, -1.0F, -10.0F);
		head.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2952F, -0.247F, 0.1986F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 104, -1.0F, 2.0F, -3.0F, 2, 2, 4, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(7.0F, -1.0F, -10.0F);
		head.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.3927F, -0.7418F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 104, -1.0F, 1.0F, 0.0F, 3, 3, 3, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(3.0F, -3.0F, -8.0F);
		head.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.6545F, 0.0F, -0.3491F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 78, -0.6334F, -1.0513F, -1.0F, 2, 1, 1, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 90, -2.6334F, 1.9487F, 0.0F, 2, 1, 1, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 90, -0.6334F, 0.9487F, -1.0F, 2, 1, 1, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 62, 59, -2.6334F, -0.0513F, -1.0F, 2, 1, 1, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.0F, -3.0F, -8.0F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.6545F, 0.0F, 0.3491F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 88, 0.6334F, 1.9487F, 0.0F, 2, 1, 1, 0.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 46, 86, 0.6334F, -0.0513F, -1.0F, 2, 1, 1, 0.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 86, -1.3666F, -1.0513F, -1.0F, 2, 1, 1, 0.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 90, -1.3666F, 0.9487F, -1.0F, 2, 1, 1, 0.0F));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		leg1G = new ModelRenderer(this);
		leg1G.setRotationPoint(11.0F, -15.0F, 2.0F);
		legs.addChild(leg1G);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(10.0F, -4.0F, -8.0F);
		leg1G.addChild(cube_r14);
		setRotationAngle(cube_r14, 1.6105F, 0.1119F, 1.5801F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 118, 94, 3.3905F, -3.6551F, 7.3927F, 16, 2, 2, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(10.0F, -4.0F, -8.0F);
		leg1G.addChild(cube_r15);
		setRotationAngle(cube_r15, 1.1283F, 0.3374F, 0.5503F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 130, 132, -0.6095F, -1.6551F, 0.3927F, 11, 2, 2, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-11.0F, 15.0F, -2.0F);
		leg1G.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.6109F, -0.4363F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 112, 41, 7.0F, -10.0F, 10.0F, 21, 2, 2, 0.0F));

		leg2G = new ModelRenderer(this);
		leg2G.setRotationPoint(11.0F, -15.0F, 5.0F);
		legs.addChild(leg2G);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.0F, 0.0F, 0.0F);
		leg2G.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.0401F, 0.0993F, 1.5183F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 116, 112, 0.3186F, -12.6147F, 18.7191F, 16, 2, 2, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, 0.0F, 0.0F);
		leg2G.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.8401F, -0.1536F, 0.5228F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 78, 132, 9.2435F, -11.0735F, 6.0682F, 11, 2, 2, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.0F, 0.0F, 0.0F);
		leg2G.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.2299F, 0.085F, -0.3548F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 111, -3.8961F, -0.6316F, -1.2919F, 21, 2, 2, 0.0F));

		leg3G = new ModelRenderer(this);
		leg3G.setRotationPoint(11.0F, -15.0F, 7.0F);
		legs.addChild(leg3G);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-4.0F, 3.0F, -3.0F);
		leg3G.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.6033F, 0.0678F, 1.4813F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 116, 116, -2.6903F, -12.8346F, 21.7022F, 16, 2, 2, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-4.0F, 3.0F, -3.0F);
		leg3G.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.5938F, -0.5242F, 0.6065F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 110, 128, 10.1763F, -12.5444F, 9.9368F, 11, 2, 2, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-4.0F, 3.0F, -3.0F);
		leg3G.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.3854F, -0.3236F, -0.3738F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 58, 92, -4.6304F, -2.0826F, 0.9948F, 25, 2, 2, 0.0F));

		leg4G = new ModelRenderer(this);
		leg4G.setRotationPoint(11.0F, -15.0F, 11.0F);
		legs.addChild(leg4G);
		

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.0F, 0.0F, -2.0F);
		leg4G.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.1254F, 0.0189F, 1.4602F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 116, 30, 0.3186F, -12.6147F, 18.7191F, 16, 2, 2, 0.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-1.0F, 0.0F, -2.0F);
		leg4G.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.1666F, -0.8827F, 0.8898F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 131, 9.2435F, -11.0735F, 6.0682F, 11, 2, 2, 0.0F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.0F, 0.0F, -2.0F);
		leg4G.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.6204F, -0.7609F, -0.4984F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 110, 90, -3.8961F, -0.6316F, -1.2919F, 21, 2, 2, 0.0F));

		leg1D = new ModelRenderer(this);
		leg1D.setRotationPoint(-11.0F, -15.0F, 2.0F);
		legs.addChild(leg1D);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-10.0F, -4.0F, -8.0F);
		leg1D.addChild(cube_r26);
		setRotationAngle(cube_r26, 1.6105F, -0.1119F, -1.5801F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 115, -19.3905F, -3.6551F, 7.3927F, 16, 2, 2, 0.0F));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-10.0F, -4.0F, -8.0F);
		leg1D.addChild(cube_r27);
		setRotationAngle(cube_r27, 1.1283F, -0.3374F, -0.5503F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 104, 132, -10.3905F, -1.6551F, 0.3927F, 11, 2, 2, 0.0F));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(11.0F, 15.0F, -2.0F);
		leg1D.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, -0.6109F, 0.4363F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 112, 37, -28.0F, -10.0F, 10.0F, 21, 2, 2, 0.0F));

		leg2D = new ModelRenderer(this);
		leg2D.setRotationPoint(-11.0F, -15.0F, 5.0F);
		legs.addChild(leg2D);
		

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.0F, 0.0F, 0.0F);
		leg2D.addChild(cube_r29);
		setRotationAngle(cube_r29, 1.0401F, -0.0993F, -1.5183F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 116, 26, -16.3186F, -12.6147F, 18.7191F, 16, 2, 2, 0.0F));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(1.0F, 0.0F, 0.0F);
		leg2D.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.8401F, 0.1536F, -0.5228F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 130, -20.2435F, -11.0735F, 6.0682F, 11, 2, 2, 0.0F));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(1.0F, 0.0F, 0.0F);
		leg2D.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.2299F, -0.085F, 0.3548F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 96, 72, -17.1039F, -0.6316F, -1.2919F, 21, 2, 2, 0.0F));

		leg3D = new ModelRenderer(this);
		leg3D.setRotationPoint(-11.0F, -15.0F, 7.0F);
		legs.addChild(leg3D);
		

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(4.0F, 3.0F, -3.0F);
		leg3D.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.6033F, -0.0678F, -1.4813F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 114, 0, -13.3097F, -12.8346F, 21.7022F, 16, 2, 2, 0.0F));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(4.0F, 3.0F, -3.0F);
		leg3D.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.5938F, 0.5242F, -0.6065F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 84, 128, -21.1763F, -12.5444F, 9.9368F, 11, 2, 2, 0.0F));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(4.0F, 3.0F, -3.0F);
		leg3D.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.3854F, 0.3236F, 0.3738F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 60, 35, -20.3696F, -2.0826F, 0.9948F, 25, 2, 2, 0.0F));

		leg4D = new ModelRenderer(this);
		leg4D.setRotationPoint(-11.0F, -15.0F, 11.0F);
		legs.addChild(leg4D);
		

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(1.0F, 0.0F, -2.0F);
		leg4D.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.1254F, -0.0189F, -1.4602F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 116, 22, -16.3186F, -12.6147F, 18.7191F, 16, 2, 2, 0.0F));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(1.0F, 0.0F, -2.0F);
		leg4D.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.1666F, 0.8827F, -0.8898F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 54, 129, -20.2435F, -11.0735F, 6.0682F, 11, 2, 2, 0.0F));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(1.0F, 0.0F, -2.0F);
		leg4D.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.6204F, 0.7609F, 0.4984F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 94, 86, -17.1039F, -0.6316F, -1.2919F, 21, 2, 2, 0.0F));
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.head.render(f5);
		this.body.render(f5);
		this.legs.render(f5);
	}

	public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		this.head.rotateAngleY = f3 / 57.295776F;
		this.head.rotateAngleX = f4 / 57.295776F;
		this.body.rotateAngleY = MathHelper.cos(f * 0.6662F) * 0.5F * f1;
		float f6 = -0.51460177F;
		this.leg1D.rotateAngleZ = -f6;
		this.leg2D.rotateAngleZ = f6;
		this.leg3D.rotateAngleZ = -f6 * 0.74F;
		this.leg4D.rotateAngleZ = f6 * 0.74F;
		this.leg1G.rotateAngleZ = -f6 * 0.74F;
		this.leg2G.rotateAngleZ = f6 * 0.74F;
		this.leg3G.rotateAngleZ = -f6;
		this.leg4G.rotateAngleZ = f6;
		float f7 = -0.0F;
		float f8 = 0.3926991F;
		this.leg1D.rotateAngleY = f8 * 2.0F + f7;
		this.leg2D.rotateAngleY = -f8 * 2.0F - f7;
		this.leg3D.rotateAngleY = f8 * 1.0F + f7;
		this.leg4D.rotateAngleY = -f8 * 1.0F - f7;
		this.leg1G.rotateAngleY = -f8 * 1.0F + f7;
		this.leg2G.rotateAngleY = f8 * 1.0F - f7;
		this.leg3G.rotateAngleY = -f8 * 2.0F + f7;
		this.leg4G.rotateAngleY = f8 * 2.0F - f7;
		float f9 = -(MathHelper.cos(f * 0.6662F * 2.0F + 0.0F) * 0.4F) * f1;
		float f10 = -(MathHelper.cos(f * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * f1;
		float f11 = -(MathHelper.cos(f * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * f1;
		float f12 = -(MathHelper.cos(f * 0.6662F * 2.0F + 4.712389F) * 0.4F) * f1;
		float f13 = Math.abs(MathHelper.sin(f * 0.6662F + 0.0F) * 0.4F) * f1;
		float f14 = Math.abs(MathHelper.sin(f * 0.6662F + 3.1415927F) * 0.4F) * f1;
		float f15 = Math.abs(MathHelper.sin(f * 0.6662F + 1.5707964F) * 0.4F) * f1;
		float f16 = Math.abs(MathHelper.sin(f * 0.6662F + 4.712389F) * 0.4F) * f1;
		ModelRenderer leg1 = this.leg1D;
		leg1.rotateAngleY += f9;
		ModelRenderer leg2 = this.leg2D;
		leg2.rotateAngleY += -f9;
		ModelRenderer leg3= this.leg3D;
		leg3.rotateAngleY += f10;
		ModelRenderer leg4 = this.leg4D;
		leg4.rotateAngleY += -f10;
		ModelRenderer leg5 = this.leg1D;
		leg5.rotateAngleY += f11;
		ModelRenderer leg6 = this.leg2D;
		leg6.rotateAngleY += -f11;
		ModelRenderer leg7 = this.leg3D;
		leg7.rotateAngleY += f12;
		ModelRenderer leg8 = this.leg4D;
		leg8.rotateAngleY += -f12;
		ModelRenderer leg1G = this.leg1G;
		leg1G.rotateAngleZ += f13;
		ModelRenderer leg2G = this.leg2G;
		leg2G.rotateAngleZ += -f13;
		ModelRenderer leg3G = this.leg3G;
		leg3G.rotateAngleZ += f14;
		ModelRenderer leg4G = this.leg4G;
		leg4G.rotateAngleZ += -f14;
		ModelRenderer leg5G = this.leg1G;
		leg5.rotateAngleZ += f15;
		ModelRenderer leg6G = this.leg2G;
		leg6G.rotateAngleZ += -f15;
		ModelRenderer leg7G = this.leg3G;
		leg7G.rotateAngleZ += f16;
		ModelRenderer leg8G = this.leg4G;
		leg8G.rotateAngleZ += -f16;
	}
}