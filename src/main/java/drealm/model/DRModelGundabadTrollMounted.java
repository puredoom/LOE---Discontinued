package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import drealm.entity.DREntityPoney;
import drealm.entity.DREntityTrollGundabad;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelGundabadTrollMounted extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer head;
	private final ModelRenderer arms;
	private final ModelRenderer armG;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer armD;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer legs;
	private final ModelRenderer legG;
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
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer legD;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer selle;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;

	public DRModelGundabadTrollMounted() {
		textureWidth = 512;
		textureHeight = 512;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -17.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -16.0F, -6.0F, -10.0F, 32, 17, 20, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 74, -13.0F, -23.0F, -10.0F, 26, 17, 20, 0.0F));
		body.cubeList.add(new ModelBox(body, 72, 74, -12.0F, -31.0F, -4.0F, 24, 8, 12, 0.0F));
		body.cubeList.add(new ModelBox(body, 136, 25, 2.0F, -23.0F, -12.0F, 11, 10, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 40, 111, -13.0F, -23.0F, -12.0F, 11, 10, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 37, -15.0F, -5.0F, -12.0F, 30, 17, 20, 0.0F));
		body.cubeList.add(new ModelBox(body, 84, 15, -9.0F, -9.0F, -11.0F, 18, 4, 1, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 41.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 0, -8.0F, -66.0F, -38.0F, 16, 6, 9, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-8.0F, -23.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.6109F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 170, 68, -10.0F, -8.0F, -4.0F, 12, 10, 12, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(8.0F, -23.0F, 0.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.6109F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 96, 172, -2.0F, -8.0F, -4.0F, 12, 10, 12, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -41.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 89, 22, -8.0F, -11.0F, -15.0F, 16, 15, 15, 0.0F));
		head.cubeList.add(new ModelBox(head, 168, 50, -7.0F, -12.0F, -14.0F, 14, 1, 13, 0.0F));

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		armG = new ModelRenderer(this);
		armG.setRotationPoint(18.0F, -60.0F, 3.0F);
		arms.addChild(armG);
		armG.cubeList.add(new ModelBox(armG, 144, 156, 7.0F, 26.0F, -10.0F, 3, 6, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 144, 156, 7.0F, 26.0F, -10.0F, 3, 6, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 96, 152, 7.0F, 33.0F, -10.0F, 3, 6, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 84, 139, 7.0F, 41.0F, -10.0F, 3, 6, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 276, 87, 5.0F, 47.0F, -13.0F, 7, 1, 7, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 240, 56, 5.0F, 59.0F, -13.0F, 7, 1, 7, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 272, 63, 3.0F, 48.0F, -15.0F, 11, 1, 11, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 271, 24, 3.0F, 58.0F, -15.0F, 11, 1, 11, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 138, 107, 2.0F, 49.0F, -16.0F, 13, 9, 13, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 0, 111, 15.0F, 49.0F, -11.0F, 2, 11, 3, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 92, 94, 17.0F, 47.0F, -11.0F, 2, 11, 3, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 108, 119, 19.0F, 45.0F, -10.0F, 2, 11, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 249, 64, 21.0F, 42.0F, -10.0F, 1, 13, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 0, 51, 22.0F, 49.0F, -10.0F, 2, 5, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 16, 88, 24.0F, 49.0F, -10.0F, 1, 4, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 137, 52, 22.0F, 36.0F, -10.0F, 1, 10, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 279, 252, 7.0F, 49.0F, -18.0F, 3, 11, 2, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 279, 265, 7.0F, 47.0F, -20.0F, 3, 11, 2, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 182, 90, 8.0F, 45.0F, -22.0F, 1, 11, 2, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 245, 94, 8.0F, 42.0F, -23.0F, 1, 13, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 44, 136, 8.0F, 36.0F, -24.0F, 1, 10, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 141, 0, 8.0F, 49.0F, -25.0F, 1, 5, 2, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 12, 88, 8.0F, 49.0F, -26.0F, 1, 4, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 0, 74, 0.0F, 49.0F, -11.0F, 2, 11, 3, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 10, 74, -2.0F, 47.0F, -11.0F, 2, 11, 3, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 102, 119, -4.0F, 45.0F, -10.0F, 2, 11, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 240, 48, -5.0F, 42.0F, -10.0F, 1, 13, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 40, 136, -6.0F, 36.0F, -10.0F, 1, 10, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 12, 14, -7.0F, 49.0F, -10.0F, 2, 5, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 8, 88, -8.0F, 49.0F, -10.0F, 1, 4, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 209, 48, 7.0F, 49.0F, -3.0F, 3, 11, 2, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 279, 154, 7.0F, 47.0F, -1.0F, 3, 11, 2, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 96, 139, 8.0F, 45.0F, 1.0F, 1, 11, 2, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 212, 168, 8.0F, 42.0F, 3.0F, 1, 13, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 36, 136, 8.0F, 36.0F, 4.0F, 1, 10, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 54, 139, 8.0F, 49.0F, 4.0F, 1, 5, 2, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 4, 88, 8.0F, 49.0F, 6.0F, 1, 4, 1, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 133, 0, 8.0F, 29.0F, -11.0F, 1, 6, 3, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 125, 0, 8.0F, 37.0F, -11.0F, 1, 6, 3, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(7.0F, 22.0F, -7.0F);
		armG.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.4363F, 0.0F, -0.3054F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 151, 25, -6.0F, -16.0F, -6.0F, 12, 13, 12, -1.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 164, -6.0F, 0.0F, -6.0F, 12, 10, 12, -4.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 132, 52, -6.0F, -9.0F, -6.0F, 12, 16, 12, -3.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 136, -6.0F, -24.0F, -6.0F, 12, 16, 12, -3.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(7.0F, 22.0F, -7.0F);
		armG.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0873F, 0.0F, -0.3054F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 144, 156, -6.0F, -27.7224F, 2.5F, 12, 13, 12, -1.0F));

		armD = new ModelRenderer(this);
		armD.setRotationPoint(-18.0F, -60.0F, 3.0F);
		arms.addChild(armD);
		armD.cubeList.add(new ModelBox(armD, 122, 15, -10.0F, 26.0F, -10.0F, 3, 6, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 121, 64, -10.0F, 33.0F, -10.0F, 3, 6, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 80, 50, -10.0F, 41.0F, -10.0F, 3, 6, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 63, 186, -12.0F, 47.0F, -13.0F, 7, 1, 7, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 100, 64, -12.0F, 59.0F, -13.0F, 7, 1, 7, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 270, 240, -14.0F, 48.0F, -15.0F, 11, 1, 11, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 100, 52, -14.0F, 58.0F, -15.0F, 11, 1, 11, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 137, 134, -15.0F, 49.0F, -16.0F, 13, 9, 13, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 10, 37, -17.0F, 49.0F, -11.0F, 2, 11, 3, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 0, 37, -19.0F, 47.0F, -11.0F, 2, 11, 3, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 78, 74, -21.0F, 45.0F, -10.0F, 2, 11, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 206, 64, -22.0F, 42.0F, -10.0F, 1, 13, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 6, 14, -24.0F, 49.0F, -10.0F, 2, 5, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 0, 88, -25.0F, 49.0F, -10.0F, 1, 4, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 8, 136, -23.0F, 36.0F, -10.0F, 1, 10, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 202, 168, -10.0F, 49.0F, -18.0F, 3, 11, 2, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 192, 168, -10.0F, 47.0F, -20.0F, 3, 11, 2, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 48, 136, -9.0F, 45.0F, -22.0F, 1, 11, 2, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 202, 90, -9.0F, 42.0F, -23.0F, 1, 13, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 4, 136, -9.0F, 36.0F, -24.0F, 1, 10, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 130, 15, -9.0F, 49.0F, -25.0F, 1, 5, 2, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 14, 51, -9.0F, 49.0F, -26.0F, 1, 4, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 10, 0, -2.0F, 49.0F, -11.0F, 2, 11, 3, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 0, 0, 0.0F, 47.0F, -11.0F, 2, 11, 3, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 72, 74, 2.0F, 45.0F, -10.0F, 2, 11, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 10, 111, 4.0F, 42.0F, -10.0F, 1, 13, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 0, 136, 5.0F, 36.0F, -10.0F, 1, 10, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 0, 14, 5.0F, 49.0F, -10.0F, 2, 5, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 10, 51, 7.0F, 49.0F, -10.0F, 1, 4, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 187, 24, -10.0F, 49.0F, -3.0F, 3, 11, 2, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 168, 50, -10.0F, 47.0F, -1.0F, 3, 11, 2, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 80, 37, -9.0F, 45.0F, 1.0F, 1, 11, 2, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 102, 94, -9.0F, 42.0F, 3.0F, 1, 13, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 133, 52, -9.0F, 36.0F, 4.0F, 1, 10, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 100, 64, -9.0F, 49.0F, 4.0F, 1, 5, 2, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 6, 51, -9.0F, 49.0F, 6.0F, 1, 4, 1, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 100, 52, -9.0F, 29.0F, -11.0F, 1, 6, 3, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 84, 0, -9.0F, 37.0F, -11.0F, 1, 6, 3, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-7.0F, 22.0F, -7.0F);
		armD.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.4363F, 0.0F, 0.3054F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 139, -6.0F, -16.0F, -6.0F, 12, 13, 12, -1.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 164, -6.0F, 0.0F, -6.0F, 12, 10, 12, -4.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 54, 111, -6.0F, -9.0F, -6.0F, 12, 16, 12, -3.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 102, 119, -6.0F, -24.0F, -6.0F, 12, 16, 12, -3.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-7.0F, 22.0F, -7.0F);
		armD.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0873F, 0.0F, 0.3054F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 96, 147, -6.0F, -27.7224F, 2.5F, 12, 13, 12, -1.0F));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		legG = new ModelRenderer(this);
		legG.setRotationPoint(-8.0F, -27.0F, 0.0F);
		legs.addChild(legG);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(6.0F, -6.0F, 0.0F);
		legG.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.0436F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 179, 120, -11.0F, 10.0F, -6.0F, 7, 13, 11, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 111, -14.0F, 26.0F, -8.0F, 13, 11, 14, -3.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 180, 277, -12.0F, 20.0F, -5.0F, 9, 12, 9, -3.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 279, 133, -12.0F, 12.0F, -5.0F, 9, 12, 9, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.5468F, -0.5956F, 0.8262F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 234, -4.448F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7677F, -0.0708F, 1.5724F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 216, 231, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7354F, 0.2526F, 1.9328F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 180, 229, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r12);
		setRotationAngle(cube_r12, -1.4281F, -0.9114F, 1.4577F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 72, 242, -4.448F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.467F, -0.0532F, 1.6175F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 235, 24, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.4558F, 0.4245F, 1.6831F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 234, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r15);
		setRotationAngle(cube_r15, -2.4259F, -0.7074F, 2.2127F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 245, 70, -4.448F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r16);
		setRotationAngle(cube_r16, -2.1643F, -0.0107F, 1.6408F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 243, 144, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r17);
		setRotationAngle(cube_r17, -2.2185F, 0.391F, 1.3676F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 108, 242, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r18);
		setRotationAngle(cube_r18, -3.1226F, 0.0511F, 1.6198F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 252, 118, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r19);
		setRotationAngle(cube_r19, 3.1306F, 0.0659F, 1.1372F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 249, 94, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r20);
		setRotationAngle(cube_r20, -3.1416F, 0.0F, 2.4871F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 243, 246, -4.448F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r21);
		setRotationAngle(cube_r21, 2.4614F, 0.0707F, 1.5754F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 252, 216, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r22);
		setRotationAngle(cube_r22, 2.4898F, -0.2208F, 1.1891F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 252, 192, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r23);
		setRotationAngle(cube_r23, 2.6693F, 0.5351F, 2.3554F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 252, 168, -4.448F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r24);
		setRotationAngle(cube_r24, 1.6309F, 0.0511F, 1.5218F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 258, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r25);
		setRotationAngle(cube_r25, 1.6381F, -0.429F, 1.4783F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 180, 253, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r26);
		setRotationAngle(cube_r26, 1.6424F, 0.9151F, 1.6276F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 144, 253, -4.448F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.9338F, 0.0077F, 1.5004F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 216, 261, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.877F, -0.3818F, 1.7913F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 258, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.6707F, 0.6808F, 0.9001F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 258, 0, -4.448F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.011F, -0.0659F, 2.0044F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 262, 39, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.019F, -0.0511F, 1.5218F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 72, 266, -6.448F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-3.0F, 27.0F, -1.0F);
		legG.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.6545F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 108, 266, -4.448F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(6.0F, -6.0F, 0.0F);
		legG.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.2618F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 136, 0, -11.0F, 3.0F, -5.0F, 13, 13, 12, 0.0F));

		legD = new ModelRenderer(this);
		legD.setRotationPoint(8.0F, -27.0F, 0.0F);
		legs.addChild(legD);
		

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-6.0F, -6.0F, 0.0F);
		legD.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.0436F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 177, 96, 4.0F, 10.0F, -6.0F, 7, 13, 11, 0.0F));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 92, 94, 1.0F, 26.0F, -8.0F, 13, 11, 14, -3.0F));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 252, 270, 3.0F, 20.0F, -5.0F, 9, 12, 9, -3.0F));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 144, 277, 3.0F, 12.0F, -5.0F, 9, 12, 9, 0.0F));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.5468F, 0.5956F, -0.8262F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 144, 181, -4.552F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.7677F, 0.0708F, -1.5724F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 180, 181, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.7354F, -0.2526F, -1.9328F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 186, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r38);
		setRotationAngle(cube_r38, -1.4281F, 0.9114F, -1.4577F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 186, 0, -4.552F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r39);
		setRotationAngle(cube_r39, -1.467F, 0.0532F, -1.6175F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 36, 186, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r40);
		setRotationAngle(cube_r40, -1.4558F, -0.4245F, -1.6831F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 189, 144, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r41);
		setRotationAngle(cube_r41, -2.4259F, 0.7074F, -2.2127F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 72, 194, -4.552F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r42);
		setRotationAngle(cube_r42, -2.1643F, 0.0107F, -1.6408F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 108, 194, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r43);
		setRotationAngle(cube_r43, -2.2185F, -0.391F, -1.3676F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 199, 24, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r44);
		setRotationAngle(cube_r44, -3.1226F, -0.0511F, -1.6198F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 144, 205, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r45);
		setRotationAngle(cube_r45, 3.1306F, -0.0659F, -1.1372F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 180, 205, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r46);
		setRotationAngle(cube_r46, -3.1416F, 0.0F, -2.4871F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 209, 81, -4.552F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r47);
		setRotationAngle(cube_r47, 2.4614F, -0.0707F, -1.5754F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 210, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r48);
		setRotationAngle(cube_r48, 2.4898F, 0.2208F, -1.1891F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 36, 210, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r49);
		setRotationAngle(cube_r49, 2.6693F, -0.5351F, -2.3554F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 213, 55, -4.552F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r50);
		setRotationAngle(cube_r50, 1.6309F, -0.0511F, -1.5218F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 213, 105, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r51);
		setRotationAngle(cube_r51, 1.6381F, 0.429F, -1.4783F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 216, 129, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r52);
		setRotationAngle(cube_r52, 1.6424F, -0.9151F, -1.6276F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 216, 159, -4.552F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.9338F, -0.0077F, -1.5004F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 216, 183, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.877F, 0.3818F, -1.7913F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 216, 207, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.6707F, -0.6808F, -0.9001F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 72, 218, -4.552F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.011F, 0.0659F, -2.0044F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 108, 218, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.019F, 0.0511F, -1.5218F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 222, 0, -2.552F, -11.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(3.0F, 27.0F, -1.0F);
		legD.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, -0.6545F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 144, 229, -4.552F, -13.3612F, -4.0F, 9, 15, 9, -4.0F));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-6.0F, -6.0F, 0.0F);
		legD.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, -0.2618F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 132, 82, -2.0F, 3.0F, -5.0F, 13, 13, 12, 0.0F));

		selle = new ModelRenderer(this);
		selle.setRotationPoint(0.0F, -52.0F, 0.0F);
		selle.cubeList.add(new ModelBox(selle, 322, 11, -7.0F, -2.0F, -5.0F, 14, 7, 12, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 368, 172, 5.0F, -6.0F, -4.0F, 2, 4, 11, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 370, 121, -7.0F, -6.0F, -4.0F, 2, 4, 11, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 196, 322, -5.0F, -14.0F, 6.0F, 10, 18, 2, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 248, 439, -4.0F, -17.0F, 6.0F, 8, 3, 2, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 32, 343, -3.0F, -20.0F, 6.0F, 6, 3, 2, 0.0F));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-26.0F, 12.0F, -7.0F);
		selle.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 1.5708F, 1.5708F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 96, 152, 6.0F, -22.0F, -9.0F, 3, 6, 1, 0.0F));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r61);
		setRotationAngle(cube_r61, 1.5708F, 0.9599F, -2.3126F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 96, 152, 1.0F, 1.0F, -1.0F, 3, 6, 1, 0.0F));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.6113F, 0.0357F, 2.4249F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 96, 152, -2.0F, 5.0F, -3.0F, 3, 6, 1, 0.0F));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r63);
		setRotationAngle(cube_r63, 1.1345F, 0.6109F, -2.3126F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 96, 152, 4.0F, 7.0F, 3.0F, 3, 6, 1, 0.0F));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r64);
		setRotationAngle(cube_r64, 1.3207F, -0.2116F, 2.7867F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 96, 152, 2.0F, 8.0F, -10.0F, 3, 6, 1, 0.0F));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.6109F, 0.6109F, -2.3126F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 96, 152, 2.0F, 11.0F, 10.0F, 3, 6, 1, 0.0F));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r66);
		setRotationAngle(cube_r66, 1.8879F, -0.2116F, 2.7867F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 96, 152, 0.0F, 7.0F, -18.0F, 3, 6, 1, 0.0F));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(26.0F, 12.0F, -7.0F);
		selle.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0F, -1.5708F, -1.5708F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 96, 152, -9.0F, -22.0F, -9.0F, 3, 6, 1, 0.0F));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r68);
		setRotationAngle(cube_r68, 1.8879F, 0.2116F, -2.7867F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 96, 152, -3.0F, 7.0F, -18.0F, 3, 6, 1, 0.0F));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r69);
		setRotationAngle(cube_r69, 1.3207F, 0.2116F, -2.7867F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 96, 152, -5.0F, 8.0F, -10.0F, 3, 6, 1, 0.0F));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.6113F, -0.0357F, -2.4249F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 96, 152, -1.0F, 5.0F, -3.0F, 3, 6, 1, 0.0F));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.6109F, -0.6109F, 2.3126F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 96, 152, -5.0F, 11.0F, 10.0F, 3, 6, 1, 0.0F));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r72);
		setRotationAngle(cube_r72, 1.1345F, -0.6109F, 2.3126F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 96, 152, -7.0F, 7.0F, 3.0F, 3, 6, 1, 0.0F));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(5.0F, 7.0F, -14.0F);
		selle.addChild(cube_r73);
		setRotationAngle(cube_r73, 1.5708F, -0.9599F, 2.3126F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 96, 152, -4.0F, 1.0F, -1.0F, 3, 6, 1, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		head.render(f5);
		arms.render(f5);
		legs.render(f5);
		selle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		DREntityTrollGundabad poneyS = (DREntityTrollGundabad) entity;
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

		if (poneyS.isAttacking) {
			// Set the angle for swinging the arms back and forth
			this.armD.rotateAngleZ = MathHelper.cos(f * 0.4f) * 1.5f * f1; // Adjust the multiplier and period as needed
			this.armG.rotateAngleZ = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.5f * f1; // Adjust the multiplier and period as needed
		} else {
			// Reset the arms to their default position
			this.armD.rotateAngleZ = 0.0f;
			this.armG.rotateAngleZ = 0.0f;
		}
	}


}