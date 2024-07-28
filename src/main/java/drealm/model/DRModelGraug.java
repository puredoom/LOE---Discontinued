package drealm.model;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelGraug extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer head;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer leftleg;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer rightleg;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer leftarm;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer rightarm;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;

	public DRModelGraug() {
		textureWidth = 512;
		textureHeight = 512;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -44.0F, -2.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -24.0F, -19.0F, -16.0F, 48, 29, 31, 0.0F));
		body.cubeList.add(new ModelBox(body, 158, 202, 2.0F, -16.0F, 15.0F, 18, 8, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 202, 46, -18.0F, -8.0F, 15.0F, 18, 8, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 68, 213, -5.0F, 2.0F, 15.0F, 15, 5, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 271, 73, -21.0F, -19.0F, -18.0F, 42, 11, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 196, 165, -17.0F, -8.0F, -17.0F, 34, 8, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 158, -13.0F, 0.0F, -17.0F, 27, 10, 30, 0.0F));
		body.cubeList.add(new ModelBox(body, 127, 0, -10.0F, 10.0F, -16.0F, 22, 3, 28, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(15.0F, -70.0F, 15.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1135F, -0.0653F, 0.5199F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 130, 32, -5.0F, -13.7508F, -34.3516F, 22, 27, 28, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -18.0F, 15.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 198, -23.0F, -24.0F, -31.0F, 22, 13, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 330, 298, 1.0F, -24.0F, -31.0F, 22, 13, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 102, 213, -3.0F, -64.0F, 0.0F, 4, 3, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 100, 218, -9.0F, -58.0F, 0.0F, 6, 5, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 304, 0, -1.0F, -54.0F, 0.0F, 10, 6, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 77, -16.0F, -46.0F, 0.0F, 13, 8, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 172, 0.0F, -43.0F, 0.0F, 13, 8, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 120, 241, -18.0F, -32.0F, 0.0F, 13, 8, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 120, 251, 1.0F, -18.0F, 0.0F, 13, 8, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 84, 173, -19.0F, -16.0F, 0.0F, 18, 12, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 196, 147, 2.0F, -32.0F, 0.0F, 18, 12, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 60, -24.0F, -37.0F, -30.0F, 48, 28, 30, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 118, -23.0F, -10.0F, -30.0F, 46, 10, 30, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-15.0F, -70.0F, 15.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1135F, 0.0653F, -0.5199F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 124, 147, -17.0F, -13.7508F, -34.3516F, 22, 27, 28, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -29.0F, 15.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 126, 88, -18.0F, -55.0F, -30.0F, 36, 29, 30, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -101.0F, -22.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 39.0F, 35.0F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 188, 325, -17.0F, -52.0F, -35.0F, 5, 8, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 182, -24.0F, -52.0F, -36.0F, 12, 2, 2, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 137, 167, -17.0F, -50.0F, -36.0F, 5, 2, 2, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 325, 260, -22.0F, -52.0F, -35.0F, 5, 6, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 63, -14.0F, -48.0F, -36.0F, 2, 4, 2, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 199, 0, -12.0F, -37.0F, -43.0F, 24, 3, 0, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 7, -12.0F, -37.0F, -43.0F, 0, 3, 15, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 84, 158, -10.0F, -57.0F, -41.0F, 20, 2, 13, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 10, 12.0F, -37.0F, -43.0F, 0, 3, 15, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 12.0F, -48.0F, -36.0F, 2, 4, 2, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 202, 56, 12.0F, -50.0F, -36.0F, 5, 2, 2, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 325, 253, 17.0F, -52.0F, -35.0F, 5, 6, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 200, 325, 12.0F, -52.0F, -35.0F, 5, 8, 1, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 196, 161, 12.0F, -52.0F, -36.0F, 12, 2, 2, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 318, 123, -12.0F, -55.0F, -43.0F, 24, 18, 15, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 9.0F, 2.0F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.0036F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 199, 3, -12.0F, -3.9493F, -14.1981F, 24, 3, 0, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 13, -12.0F, -3.9493F, -14.1981F, 0, 3, 15, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 45, 12.0F, -3.9493F, -14.1981F, 0, 3, 15, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 325, 253, -12.0F, -0.9493F, -14.1981F, 24, 4, 15, 0.0F));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(12.0F, -36.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 225, 236, -1.0F, 27.0F, -14.0F, 19, 18, 22, 0.0F));
		leftleg.cubeList.add(new ModelBox(leftleg, 203, 7, -2.0F, 45.0F, -15.0F, 21, 15, 24, 0.0F));
		leftleg.cubeList.add(new ModelBox(leftleg, 127, 14, 6.0F, 52.0F, -21.0F, 8, 8, 6, 0.0F));
		leftleg.cubeList.add(new ModelBox(leftleg, 20, 257, 7.0F, 54.0F, -26.0F, 6, 6, 5, 0.0F));
		leftleg.cubeList.add(new ModelBox(leftleg, 90, 310, 8.0F, 56.0F, -29.0F, 4, 4, 3, 0.0F));
		leftleg.cubeList.add(new ModelBox(leftleg, 44, 290, 4.0F, 24.0F, -17.0F, 9, 17, 28, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(5.0F, 18.0F, 0.0F);
		leftleg.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.2618F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 192, 267, 4.0F, -1.0F, -2.0F, 9, 10, 9, 0.0F));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 335, 4.0F, -10.0F, -13.0F, 9, 10, 9, 0.0F));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 200, 178, -11.0F, -20.0F, -15.0F, 22, 34, 24, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(8.0F, 60.0F, -2.0F);
		leftleg.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.6545F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 104, 310, -5.0F, -4.0F, -26.0F, 4, 4, 3, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 269, 20, -6.0F, -6.0F, -23.0F, 6, 6, 5, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 132, -7.0F, -8.0F, -18.0F, 8, 8, 6, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(8.0F, 60.0F, -2.0F);
		leftleg.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.9163F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 324, 202, 2.0F, -4.0F, -27.0F, 4, 4, 3, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 276, 1.0F, -6.0F, -24.0F, 6, 6, 5, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 158, 0.0F, -8.0F, -19.0F, 8, 8, 6, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 277, 92, -12.0F, -10.0F, -13.0F, 21, 10, 21, 0.0F));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-12.0F, -36.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 236, 125, -18.0F, 27.0F, -14.0F, 19, 18, 22, 0.0F));
		rightleg.cubeList.add(new ModelBox(rightleg, 92, 202, -19.0F, 45.0F, -15.0F, 21, 15, 24, 0.0F));
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 63, -14.0F, 52.0F, -21.0F, 8, 8, 6, 0.0F));
		rightleg.cubeList.add(new ModelBox(rightleg, 158, 212, -13.0F, 54.0F, -26.0F, 6, 6, 5, 0.0F));
		rightleg.cubeList.add(new ModelBox(rightleg, 247, 0, -12.0F, 56.0F, -29.0F, 4, 4, 3, 0.0F));
		rightleg.cubeList.add(new ModelBox(rightleg, 279, 253, -13.0F, 24.0F, -17.0F, 9, 17, 28, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-5.0F, 18.0F, 0.0F);
		rightleg.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.2618F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -14.0F, -9.0F, -12.0F, 4, 11, 11, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 198, -11.0F, -21.0F, -15.0F, 22, 35, 24, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-8.0F, 60.0F, -2.0F);
		rightleg.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, -0.6545F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 299, 1.0F, -4.0F, -26.0F, 4, 4, 3, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 230, 75, 0.0F, -6.0F, -23.0F, 6, 6, 5, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 118, -1.0F, -8.0F, -18.0F, 8, 8, 6, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-8.0F, 60.0F, -2.0F);
		rightleg.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.9163F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 125, 299, -6.0F, -4.0F, -27.0F, 4, 4, 3, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 245, 46, -7.0F, -6.0F, -24.0F, 6, 6, 5, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 127, 0, -8.0F, -8.0F, -19.0F, 8, 8, 6, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 268, 165, -9.0F, -10.0F, -13.0F, 21, 10, 21, 0.0F));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(30.0F, -111.0F, -5.0F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.0F, 0.0F, 5.0F);
		leftarm.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0076F, -0.043F, -0.1747F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 228, 60, -6.0F, -3.0F, -19.0F, 8, 26, 27, 0.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 271, 24, -9.0F, 11.0F, -16.0F, 14, 27, 22, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(16.0F, 58.0F, 0.0F);
		leftarm.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.4214F, -0.3115F, 0.1726F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 250, 315, 0.9351F, 12.1756F, 0.067F, 4, 14, 4, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(16.0F, 58.0F, 0.0F);
		leftarm.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3466F, -0.3936F, -0.0429F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 50, 257, -2.5649F, 1.1756F, -0.433F, 5, 14, 5, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(16.0F, 56.0F, -7.0F);
		leftarm.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.2497F, -0.0647F, -0.0412F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 172, 316, 0.9351F, 12.1756F, 0.067F, 4, 14, 4, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(16.0F, 56.0F, -7.0F);
		leftarm.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.2303F, -0.1168F, -0.2539F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 142, 267, -2.5649F, 1.1756F, -0.433F, 5, 14, 5, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(6.0F, 54.0F, -10.0F);
		leftarm.addChild(cube_r18);
		setRotationAngle(cube_r18, 2.848F, 0.3193F, 3.0438F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 276, 0.9351F, 12.1756F, 0.067F, 4, 9, 4, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(6.0F, 54.0F, -10.0F);
		leftarm.addChild(cube_r19);
		setRotationAngle(cube_r19, 2.9247F, 0.3746F, -3.0149F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 257, -2.5649F, 1.1756F, -0.433F, 5, 14, 5, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(16.0F, 54.0F, -14.0F);
		leftarm.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.252F, 0.1151F, 0.0935F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 296, 123, 0.9351F, 12.1756F, 0.067F, 4, 14, 4, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(16.0F, 54.0F, -14.0F);
		leftarm.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.2704F, 0.0585F, -0.118F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 268, 165, -2.5649F, 1.1756F, -0.433F, 5, 14, 5, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.0F, 0.0F, 5.0F);
		leftarm.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.2542F, -0.043F, -0.1747F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 333, 179, -4.0F, 58.0F, -5.0F, 11, 4, 19, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 90, 290, -8.0F, 58.0F, -4.0F, 9, 3, 17, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 333, 318, -9.0F, 31.0F, -4.0F, 3, 27, 17, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 304, 8, 8.0F, 52.0F, -6.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 312, 123, 8.0F, 52.0F, 9.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 316, 8, 8.0F, 48.0F, 2.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 188, 316, 8.0F, 45.0F, -4.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 200, 316, 8.0F, 45.0F, 8.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 317, 8.0F, 41.0F, 3.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 23, 317, 8.0F, 39.0F, -2.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 318, 156, 8.0F, 36.0F, 8.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 320, 128, 8.0F, 33.0F, 3.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 321, 35, 8.0F, 33.0F, -6.0F, 2, 5, 4, 0.0F));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 268, -6.0F, 31.0F, -7.0F, 14, 27, 22, 0.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(1.0F, 0.0F, 5.0F);
		leftarm.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0295F, -0.0322F, -0.7422F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 321, 0, -14.0F, -3.0F, -14.0F, 18, 17, 18, 0.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(1.0F, 0.0F, 5.0F);
		leftarm.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0202F, -0.0387F, -0.4804F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 194, 315, -12.0F, -3.0F, -15.0F, 18, 17, 20, 0.0F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(1.0F, 0.0F, 5.0F);
		leftarm.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0113F, -0.0421F, -0.262F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 285, 214, -11.0F, -3.0F, -16.0F, 18, 17, 22, 0.0F));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-30.0F, -111.0F, -5.0F);
		

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.0F, 0.0F, 5.0F);
		rightarm.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0076F, 0.043F, 0.1747F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 155, 214, -2.0F, -3.0F, -19.0F, 8, 26, 27, 0.0F));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 142, 267, -5.0F, 11.0F, -16.0F, 14, 27, 22, 0.0F));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-16.0F, 58.0F, 0.0F);
		rightarm.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.4214F, 0.3115F, -0.1726F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 308, 196, -4.9351F, 12.1756F, 0.067F, 4, 14, 4, 0.0F));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-16.0F, 58.0F, 0.0F);
		rightarm.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.3466F, 0.3936F, 0.0429F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 198, -2.4351F, 1.1756F, -0.433F, 5, 14, 5, 0.0F));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-16.0F, 56.0F, -7.0F);
		rightarm.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.2497F, 0.0647F, 0.0412F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 118, 310, -4.9351F, 12.1756F, 0.067F, 4, 14, 4, 0.0F));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-16.0F, 56.0F, -7.0F);
		rightarm.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.2303F, 0.1168F, 0.2539F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 199, 6, -2.4351F, 1.1756F, -0.433F, 5, 14, 5, 0.0F));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-6.0F, 54.0F, -10.0F);
		rightarm.addChild(cube_r31);
		setRotationAngle(cube_r31, 2.848F, -0.3193F, -3.0438F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 269, 0, -4.9351F, 12.1756F, 0.067F, 4, 9, 4, 0.0F));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-6.0F, 54.0F, -10.0F);
		rightarm.addChild(cube_r32);
		setRotationAngle(cube_r32, 2.9247F, -0.3746F, 3.0149F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 230, 56, -2.4351F, 1.1756F, -0.433F, 5, 14, 5, 0.0F));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-16.0F, 54.0F, -14.0F);
		rightarm.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.252F, -0.1151F, -0.0935F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 292, 196, -4.9351F, 12.1756F, 0.067F, 4, 14, 4, 0.0F));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-16.0F, 54.0F, -14.0F);
		rightarm.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.2704F, -0.0585F, 0.118F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 225, 236, -2.4351F, 1.1756F, -0.433F, 5, 14, 5, 0.0F));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-1.0F, 0.0F, 5.0F);
		rightarm.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.2542F, 0.043F, 0.1747F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 331, 156, -7.0F, 58.0F, -5.0F, 11, 4, 19, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 269, 0, -1.0F, 58.0F, -4.0F, 9, 3, 17, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 317, 6.0F, 31.0F, -4.0F, 3, 27, 17, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 19, 0, -10.0F, 52.0F, -6.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 84, 158, -10.0F, 52.0F, 9.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 137, 158, -10.0F, 48.0F, 2.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 258, 113, -10.0F, 45.0F, -4.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 224, 282, -10.0F, 45.0F, 8.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 214, 287, -10.0F, 41.0F, 3.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 90, 290, -10.0F, 39.0F, -2.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 125, 290, -10.0F, 36.0F, 8.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 292, 214, -10.0F, 33.0F, 3.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 292, 223, -10.0F, 33.0F, -6.0F, 2, 5, 4, 0.0F));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 70, 241, -8.0F, 31.0F, -7.0F, 14, 27, 22, 0.0F));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-1.0F, 0.0F, 5.0F);
		rightarm.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0295F, 0.0322F, 0.7422F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 118, 316, -4.0F, -3.0F, -14.0F, 18, 17, 18, 0.0F));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-1.0F, 0.0F, 5.0F);
		rightarm.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0202F, 0.0387F, 0.4804F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 274, 298, -6.0F, -3.0F, -15.0F, 18, 17, 20, 0.0F));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-1.0F, 0.0F, 5.0F);
		rightarm.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0113F, 0.0421F, 0.262F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 214, 276, -7.0F, -3.0F, -16.0F, 18, 17, 22, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		head.render(f5);
		leftleg.render(f5);
		rightleg.render(f5);
		leftarm.render(f5);
		rightarm.render(f5);
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