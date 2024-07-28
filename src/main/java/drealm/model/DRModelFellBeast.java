package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import drealm.entity.DREntityNazgul;
import lotr.common.entity.animal.LOTREntityBird;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelFellBeast extends ModelBase {
	private final ModelRenderer cou;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer tete;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer corps;
	private final ModelRenderer queue;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer legs;
	private final ModelRenderer legG;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer legD;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer ails;
	private final ModelRenderer ailG;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer ailD;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;

	public DRModelFellBeast() {
		textureWidth = 256;
		textureHeight = 256;

		cou = new ModelRenderer(this);
		cou.setRotationPoint(5.0F, -28.0F, -29.0F);
		setRotationAngle(cou, 0.0F, 0.1745F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.0358F, 11.0F, -30.4406F);
		cou.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2182F, -0.2182F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 131, 3.7699F, -17.0F, 4.6015F, 3, 8, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 128, 106, 3.7699F, -15.0F, 0.6015F, 3, 9, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 122, 3.7699F, -22.0F, 13.6015F, 3, 7, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 137, 138, 3.7699F, -18.0F, 9.6015F, 3, 4, 1, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-10.8573F, 4.0F, -10.9F);
		cou.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4826F, -0.1719F, -0.0306F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 141, 171, 4.0F, -8.0F, -20.0F, 8, 7, 15, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-5.0358F, 2.0F, -0.4406F);
		cou.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1772F, -0.1719F, -0.0306F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 175, 156, -4.0F, -6.0F, -17.0F, 8, 7, 15, 0.0F));

		tete = new ModelRenderer(this);
		tete.setRotationPoint(-0.2203F, 7.0F, -26.0543F);
		cou.addChild(tete);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(5.0838F, 4.0F, -3.8177F);
		tete.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2182F, -0.2182F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 138, 117, -6.2301F, -11.0F, -1.3985F, 3, 6, 1, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0838F, 4.0F, -11.8177F);
		tete.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1745F, -0.2182F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 76, 170, -1.0F, -3.0F, -12.0F, 2, 1, 13, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.0838F, 4.0F, -11.8177F);
		tete.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3812F, -0.0834F, -0.0209F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 131, 138, 0.0F, 0.0F, -3.0F, 1, 7, 2, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.0F, 0.0F, -6.0F, 1, 5, 2, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 28, 0.0F, 0.0F, -9.0F, 1, 3, 2, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-10.7378F, -1.0F, 4.7229F);
		tete.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0026F, -0.1719F, -0.0306F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 95, 171, 5.9414F, -1.0595F, -21.9897F, 8, 7, 15, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.9162F, 45.0F, 55.1823F);
		tete.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.1745F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, 0.0F, -43.0F, -81.0F, 0, 1, 11, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 26, -9.0F, -43.0F, -81.0F, 9, 1, 0, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 11, -9.0F, -43.0F, -81.0F, 0, 1, 11, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 203, -9.0F, -47.0F, -81.0F, 9, 4, 11, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.0838F, 4.0F, -11.8177F);
		tete.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.4363F, -0.1745F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 14, 4.7408F, -4.0F, -12.8023F, 0, 1, 11, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 70, 76, -4.2592F, -4.0F, -12.8023F, 9, 1, 0, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 13, -4.2592F, -4.0F, -12.8023F, 0, 1, 11, 0.0F));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 206, 151, -4.2592F, -3.0F, -12.8023F, 9, 3, 11, 0.0F));

		corps = new ModelRenderer(this);
		corps.setRotationPoint(0.0F, -25.0F, 0.0F);
		corps.cubeList.add(new ModelBox(corps, 68, 214, -5.0F, -9.0F, -33.0F, 10, 11, 6, 0.0F));
		corps.cubeList.add(new ModelBox(corps, 36, 214, -6.0F, -10.0F, -27.0F, 12, 17, 4, 0.0F));
		corps.cubeList.add(new ModelBox(corps, 128, 106, -10.0F, 11.0F, -21.0F, 20, 2, 22, 0.0F));
		corps.cubeList.add(new ModelBox(corps, 0, 56, -11.0F, -11.0F, -23.0F, 22, 22, 26, 0.0F));
		corps.cubeList.add(new ModelBox(corps, 0, 131, -9.0F, -11.0F, 3.0F, 18, 11, 19, 0.0F));
		corps.cubeList.add(new ModelBox(corps, 0, 161, -9.0F, 0.0F, 3.0F, 18, 2, 14, 0.0F));

		queue = new ModelRenderer(this);
		queue.setRotationPoint(0.0F, -32.0F, 20.0F);
		queue.cubeList.add(new ModelBox(queue, 55, 133, -5.0F, -3.0F, 2.0F, 10, 8, 9, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 3.0F, 6.0F);
		queue.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.4363F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 136, 106, -2.0F, -10.0F, 46.0F, 3, 5, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 0, -2.0F, -11.0F, 53.0F, 3, 6, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 56, -2.0F, -13.0F, 49.0F, 3, 8, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 17, 56, -2.0F, -13.0F, 34.0F, 3, 8, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 112, -2.0F, -17.0F, 37.0F, 3, 12, 1, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 28, -2.0F, -11.0F, 41.0F, 3, 6, 1, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 3.0F, 6.0F);
		queue.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3491F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 68, -2.0F, -13.0F, 23.0F, 3, 8, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 112, -2.0F, -17.0F, 26.0F, 3, 12, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 55, 131, -2.0F, -11.0F, 30.0F, 3, 6, 1, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 3.0F, 6.0F);
		queue.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.2182F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 68, -2.0F, -13.0F, 12.0F, 3, 8, 1, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 112, -2.0F, -17.0F, 15.0F, 3, 12, 1, 0.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 84, 133, -2.0F, -11.0F, 19.0F, 3, 6, 1, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 3.0F, 6.0F);
		queue.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 136, -2.0F, -11.0F, 7.0F, 3, 6, 1, 0.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 64, 116, -2.0F, -17.0F, 3.0F, 3, 12, 1, 0.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 128, 116, -2.0F, -13.0F, 0.0F, 3, 8, 1, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 3.0F, 3.0F);
		queue.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 190, 104, -4.0F, -20.0F, 26.0F, 8, 6, 15, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 3.0F, 3.0F);
		queue.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3927F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 172, 178, -4.0F, -7.0F, 42.0F, 8, 6, 15, 0.0F));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 188, 130, -4.0F, -7.0F, 42.0F, 8, 6, 15, 0.0F));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 80, 193, -4.0F, -11.0F, 16.0F, 8, 6, 15, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 3.0F, 3.0F);
		queue.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 177, -2.0F, 17.0F, 74.0F, 3, 4, 19, -1.0F));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 45, 170, -3.0F, 18.0F, 66.0F, 6, 5, 19, -1.0F));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 111, 199, -3.0F, 18.0F, 52.0F, 6, 5, 15, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 3.0F, 3.0F);
		queue.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.1309F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 194, -5.0F, -7.0F, 7.0F, 10, 8, 12, 0.0F));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		legG = new ModelRenderer(this);
		legG.setRotationPoint(8.0F, -53.0F, 7.0F);
		legs.addChild(legG);
		setRotationAngle(legG, 0.0F, 0.0F, -0.2618F);
		legG.cubeList.add(new ModelBox(legG, 0, 28, -4.0F, 3.0F, -4.0F, 6, 15, 7, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 89, 9, -4.0F, 3.0F, 3.0F, 6, 8, 1, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-11.0F, 53.0F, -7.0F);
		legG.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.7854F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 140, 10.0F, 1.0F, 25.0F, 1, 1, 3, 0.0F));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 142, 134, 11.0F, 1.0F, 25.0F, 1, 1, 3, 0.0F));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 142, 140, 8.0F, 1.0F, 25.0F, 1, 1, 3, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-11.0F, 53.0F, -7.0F);
		legG.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 139, 124, 10.0F, -19.0F, 16.0F, 1, 1, 3, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 141, 109, 11.0F, -19.0F, 16.0F, 1, 1, 3, 0.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 5, 143, 8.0F, -19.0F, 16.0F, 1, 1, 3, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-11.0F, 53.0F, -7.0F);
		legG.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.6545F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 132, 121, 10.0F, -25.0F, -1.0F, 1, 1, 4, 0.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 131, 133, 11.0F, -25.0F, -1.0F, 1, 1, 4, 0.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 135, 112, 8.0F, -25.0F, -1.0F, 1, 1, 4, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(9.0F, 13.0F, -7.0F);
		legG.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.7854F, 0.0F, -3.1416F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 8, 131, 10.0F, 1.0F, 25.0F, 1, 1, 4, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(9.0F, 13.0F, -7.0F);
		legG.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.0436F, 0.0F, 3.1416F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 138, 10.0F, -19.0F, 16.0F, 1, 1, 3, 0.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(9.0F, 13.0F, -7.0F);
		legG.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.6545F, 0.0F, -3.1416F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 10, 125, 10.0F, -25.0F, -1.0F, 1, 1, 4, 0.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 5.0F, 4.0F);
		legG.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.2618F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 89, 40, -3.0F, 12.0F, 2.0F, 4, 1, 4, 0.0F));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 191, 199, -3.0F, 13.0F, -3.0F, 4, 3, 15, 0.0F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 20.0F, 4.0F);
		legG.addChild(cube_r25);
		setRotationAngle(cube_r25, -1.6581F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 104, -3.0F, -5.4889F, 7.1177F, 4, 2, 6, 0.0F));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 20.0F, 4.0F);
		legG.addChild(cube_r26);
		setRotationAngle(cube_r26, -1.9199F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 68, -3.0F, -8.4889F, -1.8823F, 4, 3, 9, 0.0F));

		legD = new ModelRenderer(this);
		legD.setRotationPoint(-6.0F, -55.0F, 7.0F);
		legs.addChild(legD);
		setRotationAngle(legD, 0.0F, 0.0F, 0.3054F);
		legD.cubeList.add(new ModelBox(legD, 0, 0, -4.0F, 5.0F, -4.0F, 6, 15, 7, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 89, 0, -4.0F, 5.0F, 3.0F, 6, 8, 1, 0.0F));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-12.0F, 55.0F, -7.0F);
		legD.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.7854F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 19, 23, 10.0F, 1.0F, 25.0F, 1, 1, 3, 0.0F));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 85, 76, 12.0F, 1.0F, 25.0F, 1, 1, 3, 0.0F));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 125, 9.0F, 1.0F, 25.0F, 1, 1, 3, 0.0F));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-12.0F, 55.0F, -7.0F);
		legD.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.0436F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 12, 50, 10.0F, -19.0F, 16.0F, 1, 1, 3, 0.0F));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 100, 15, 12.0F, -19.0F, 16.0F, 1, 1, 3, 0.0F));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 137, 133, 9.0F, -19.0F, 16.0F, 1, 1, 3, 0.0F));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-12.0F, 55.0F, -7.0F);
		legD.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.6545F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 16, 50, 10.0F, -25.0F, -1.0F, 1, 1, 4, 0.0F));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 84, 68, 12.0F, -25.0F, -1.0F, 1, 1, 4, 0.0F));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 125, 9.0F, -25.0F, -1.0F, 1, 1, 4, 0.0F));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(10.0F, 15.0F, -7.0F);
		legD.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.7854F, 0.0F, -3.1416F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 80, 118, 10.0F, 1.0F, 25.0F, 1, 1, 4, 0.0F));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(10.0F, 15.0F, -7.0F);
		legD.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.0436F, 0.0F, 3.1416F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 6, 125, 10.0F, -19.0F, 16.0F, 1, 1, 3, 0.0F));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(10.0F, 15.0F, -7.0F);
		legD.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.6545F, 0.0F, -3.1416F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 80, 123, 10.0F, -25.0F, -1.0F, 1, 1, 4, 0.0F));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 7.0F, 4.0F);
		legD.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.2618F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 50, -3.0F, 12.0F, 2.0F, 4, 1, 4, 0.0F));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 153, 199, -3.0F, 13.0F, -3.0F, 4, 3, 15, 0.0F));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 22.0F, 4.0F);
		legD.addChild(cube_r34);
		setRotationAngle(cube_r34, -1.6581F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 70, 68, -3.0F, -5.4889F, 7.1177F, 4, 2, 6, 0.0F));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 22.0F, 4.0F);
		legD.addChild(cube_r35);
		setRotationAngle(cube_r35, -1.9199F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 56, -3.0F, -8.4889F, -1.8823F, 4, 3, 9, 0.0F));

		ails = new ModelRenderer(this);
		ails.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		ailG = new ModelRenderer(this);
		ailG.setRotationPoint(10.0F, -58.0F, -8.0F);
		ails.addChild(ailG);
		

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailG.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, -0.7854F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 210, 60, 75.0F, -59.0F, -76.0F, 13, 1, 3, 0.0F));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailG.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, -0.48F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 212, 125, 96.0F, -59.0F, -45.0F, 13, 1, 3, 0.0F));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 212, 77, 96.0F, -60.0F, -43.0F, 19, 3, 3, 0.0F));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 64, 106, 68.0F, -59.0F, -57.0F, 19, 1, 26, 0.0F));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 212, 83, 68.0F, -60.0F, -31.0F, 19, 3, 3, 0.0F));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 131, 134, 42.0F, -59.0F, -38.0F, 19, 1, 19, 0.0F));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 212, 89, 42.0F, -60.0F, -20.0F, 19, 3, 3, 0.0F));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailG.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, -0.2618F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 89, 28, 5.0F, -59.0F, -21.0F, 31, 1, 19, 0.0F));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 111, 193, 9.0F, -60.0F, -2.0F, 27, 3, 3, 0.0F));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 170, 36, 4.0F, -60.0F, -23.0F, 29, 3, 3, 0.0F));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailG.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 1.0472F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 70, 62, 54.0F, -59.0F, 50.0F, 7, 1, 5, 0.0F));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 89, 28, 62.0F, -52.0F, 48.0F, 5, 3, 3, -1.0F));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 76, 106, 64.0F, -56.0F, 48.0F, 3, 7, 3, -1.0F));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 72, 116, 64.0F, -57.0F, 48.0F, 3, 3, 3, 0.0F));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 217, 28, 51.0F, -60.0F, 48.0F, 16, 3, 3, 0.0F));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailG.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.3927F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 154, 81, 78.0F, -59.0F, 31.0F, 21, 1, 16, 0.0F));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 217, 6, 78.0F, -60.0F, 46.0F, 16, 3, 3, 0.0F));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 217, 16, 52.0F, -60.0F, 32.0F, 16, 3, 3, 0.0F));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 170, 20, 27.0F, -59.0F, 5.0F, 16, 1, 15, 0.0F));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 217, 22, 27.0F, -60.0F, 19.0F, 16, 3, 3, 0.0F));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailG.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.5236F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 72, 81, 52.0F, -59.0F, 17.0F, 29, 1, 24, 0.0F));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 217, 68, 54.0F, -60.0F, 15.0F, 16, 3, 3, 0.0F));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailG.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, -0.9599F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 89, 48, 46.0F, -60.0F, -91.0F, 36, 3, 3, 0.0F));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailG.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, -0.5236F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 28, 51.0F, -59.0F, -60.0F, 31, 1, 27, 0.0F));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 152, 71, 51.0F, -60.0F, -63.0F, 31, 3, 3, 0.0F));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailG.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0436F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 116, 154, 37.0F, -59.0F, -10.0F, 21, 1, 16, 0.0F));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 203, 184, 37.0F, -60.0F, -12.0F, 21, 3, 3, 0.0F));

		ailD = new ModelRenderer(this);
		ailD.setRotationPoint(-10.0F, -59.0F, -8.0F);
		ails.addChild(ailD);
		setRotationAngle(ailD, 0.0F, 0.0F, -3.1416F);
		

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailD.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, -0.7854F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 151, 130, 75.0F, -59.0F, -76.0F, 13, 1, 3, 0.0F));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailD.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, -0.48F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 176, 77, 96.0F, -59.0F, -45.0F, 13, 1, 3, 0.0F));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 206, 165, 96.0F, -60.0F, -43.0F, 19, 3, 3, 0.0F));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 104, 68.0F, -59.0F, -57.0F, 19, 1, 26, 0.0F));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 210, 48, 68.0F, -60.0F, -31.0F, 19, 3, 3, 0.0F));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 74, 133, 42.0F, -59.0F, -38.0F, 19, 1, 19, 0.0F));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 210, 54, 42.0F, -60.0F, -20.0F, 19, 3, 3, 0.0F));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailD.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, -0.2618F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 89, 0, 5.0F, -59.0F, -21.0F, 31, 1, 19, 0.0F));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 189, 42, 9.0F, -60.0F, -2.0F, 27, 3, 3, 0.0F));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 154, 98, 4.0F, -60.0F, -23.0F, 29, 3, 3, 0.0F));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailD.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 1.0472F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 70, 56, 54.0F, -59.0F, 50.0F, 7, 1, 5, 0.0F));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 89, 34, 62.0F, -68.0F, 48.0F, 5, 3, 3, -1.0F));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 64, 106, 64.0F, -68.0F, 48.0F, 3, 7, 3, -1.0F));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 14, 104, 64.0F, -63.0F, 48.0F, 3, 3, 3, 0.0F));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 25, 177, 51.0F, -60.0F, 48.0F, 16, 3, 3, 0.0F));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailD.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.3927F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 152, 48, 78.0F, -59.0F, 31.0F, 21, 1, 16, 0.0F));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 25, 183, 78.0F, -60.0F, 46.0F, 16, 3, 3, 0.0F));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 214, 199, 52.0F, -60.0F, 32.0F, 16, 3, 3, 0.0F));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 170, 0, 27.0F, -59.0F, 5.0F, 16, 1, 15, 0.0F));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 214, 205, 27.0F, -60.0F, 19.0F, 16, 3, 3, 0.0F));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailD.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.5236F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 70, 56, 52.0F, -59.0F, 17.0F, 29, 1, 24, 0.0F));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 217, 0, 54.0F, -60.0F, 15.0F, 16, 3, 3, 0.0F));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailD.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, -0.9599F, 0.0F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 89, 20, 46.0F, -60.0F, -91.0F, 36, 3, 3, 0.0F));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailD.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, -0.5236F, 0.0F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 0, 51.0F, -59.0F, -60.0F, 31, 1, 27, 0.0F));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 152, 65, 51.0F, -60.0F, -63.0F, 31, 3, 3, 0.0F));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-10.0F, 58.0F, 8.0F);
		ailD.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0436F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 58, 153, 37.0F, -59.0F, -10.0F, 21, 1, 16, 0.0F));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 203, 178, 37.0F, -60.0F, -12.0F, 21, 3, 3, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		cou.render(f5);
		corps.render(f5);
		queue.render(f5);
		legs.render(f5);
		ails.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		DREntityNazgul bird = (DREntityNazgul)entity;
		this.tete.rotateAngleX = 0.20943952f;
		this.tete.rotateAngleY = 0.0f;
		final ModelRenderer head = this.tete;
		head.rotateAngleX += MathHelper.cos(f * 0.2f) * 0.3f * f1;
		final ModelRenderer head2 = this.tete;
		head2.rotateAngleX += (float)Math.toRadians(f4);
		final ModelRenderer head3 = this.tete;
		head3.rotateAngleY += (float)Math.toRadians(f3);
		this.legG.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.legD.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.ailG.rotateAngleZ = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.ailD.rotateAngleX = 0.0F; // Adjust as needed
		this.ailD.rotateAngleY = -0.045553093477052F; // Adjust as needed
		this.ailD.rotateAngleZ = -15.2292353921796064F + MathHelper.cos(f * 0.4f) * 1.0f * f1;

	}
}

