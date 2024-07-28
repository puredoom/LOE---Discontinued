package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelEnt extends ModelBase {
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
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer legs;
	private final ModelRenderer legG;
	private final ModelRenderer legD;
	private final ModelRenderer arms;
	private final ModelRenderer armG;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;
	private final ModelRenderer cube_r135;
	private final ModelRenderer cube_r136;
	private final ModelRenderer cube_r137;
	private final ModelRenderer cube_r138;
	private final ModelRenderer cube_r139;
	private final ModelRenderer cube_r140;
	private final ModelRenderer cube_r141;
	private final ModelRenderer cube_r142;
	private final ModelRenderer cube_r143;
	private final ModelRenderer armD;
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer cube_r146;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;
	private final ModelRenderer cube_r149;
	private final ModelRenderer cube_r150;
	private final ModelRenderer cube_r151;
	private final ModelRenderer cube_r152;
	private final ModelRenderer cube_r153;
	private final ModelRenderer cube_r154;
	private final ModelRenderer cube_r155;
	private final ModelRenderer cube_r156;
	private final ModelRenderer cube_r157;
	private final ModelRenderer cube_r158;
	private final ModelRenderer cube_r159;
	private final ModelRenderer cube_r160;
	private final ModelRenderer cube_r161;
	private final ModelRenderer cube_r162;
	private final ModelRenderer cube_r163;
	private final ModelRenderer cube_r164;
	private final ModelRenderer cube_r165;
	private final ModelRenderer cube_r166;
	private final ModelRenderer cube_r167;
	private final ModelRenderer cube_r168;
	private final ModelRenderer cube_r169;
	private final ModelRenderer cube_r170;
	private final ModelRenderer cube_r171;
	private final ModelRenderer cube_r172;
	private final ModelRenderer cube_r173;
	private final ModelRenderer cube_r174;
	private final ModelRenderer cube_r175;
	private final ModelRenderer cube_r176;

	public DRModelEnt() {
		textureWidth = 1024;
		textureHeight = 1024;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -52.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 6, 0, -13.0F, 2.0F, 3.0F, 1, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 71, 99, -13.0F, -13.0F, -3.0F, 1, 6, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 5, 55, -13.0F, -9.0F, -2.0F, 1, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 120, 188, -13.0F, -7.0F, -3.0F, 1, 8, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 110, 101, -13.0F, 1.0F, -4.0F, 1, 4, 7, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 0, -13.0F, 2.0F, -5.0F, 1, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 11, 55, 12.0F, 2.0F, -5.0F, 1, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 17, 55, 12.0F, 2.0F, 3.0F, 1, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 55, 122, 12.0F, 1.0F, -4.0F, 1, 4, 7, 0.0F));
		body.cubeList.add(new ModelBox(body, 319, 270, -11.0F, -34.0F, -9.0F, 22, 6, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 376, 242, -11.0F, -38.0F, -8.0F, 22, 6, 13, 0.0F));
		body.cubeList.add(new ModelBox(body, 110, 188, -11.0F, -28.0F, -9.0F, 1, 9, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 270, 441, -11.0F, -19.0F, -9.0F, 1, 25, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 536, 584, -11.0F, -12.0F, -5.0F, 1, 18, 11, 0.0F));
		body.cubeList.add(new ModelBox(body, 55, 64, -11.0F, -28.0F, -5.0F, 1, 7, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 165, 225, -11.0F, -19.0F, -5.0F, 1, 7, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 55, -11.0F, -17.0F, -4.0F, 1, 5, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 66, 64, -11.0F, -15.0F, -1.0F, 1, 3, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 11, 114, -11.0F, -14.0F, 3.0F, 1, 2, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 119, 34, -10.0F, -14.0F, 6.0F, 1, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 157, 44, -9.0F, -13.0F, 6.0F, 2, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 64, 156, -6.0F, -13.0F, 6.0F, 2, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 224, 42, -5.0F, -18.0F, 6.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 126, 101, -11.0F, -28.0F, -3.0F, 1, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 8, 159, -11.0F, -28.0F, -2.0F, 1, 2, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 110, 167, -11.0F, -28.0F, 1.0F, 1, 1, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 220, 146, -12.0F, -29.0F, -9.0F, 1, 10, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 71, 180, -12.0F, -29.0F, -6.0F, 1, 8, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 450, 297, -12.0F, -34.0F, -9.0F, 1, 5, 15, 0.0F));
		body.cubeList.add(new ModelBox(body, 50, 313, -12.0F, -19.0F, -9.0F, 1, 25, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 266, 583, -12.0F, -12.0F, -5.0F, 1, 18, 11, 0.0F));
		body.cubeList.add(new ModelBox(body, 165, 117, -12.0F, -13.0F, 3.0F, 1, 1, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 113, 34, -12.0F, -14.0F, -1.0F, 1, 2, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 143, -12.0F, -15.0F, -4.0F, 1, 3, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 220, 58, -12.0F, -17.0F, -5.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 179, 173, -12.0F, -29.0F, -5.0F, 1, 5, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 5, 114, -12.0F, -24.0F, -5.0F, 1, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 165, 87, -12.0F, -29.0F, 1.0F, 1, 1, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 159, -12.0F, -29.0F, -2.0F, 1, 2, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 17, 114, -12.0F, -29.0F, -3.0F, 1, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 267, 0, -4.0F, -28.0F, 6.0F, 15, 8, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 427, 585, -4.0F, -20.0F, 6.0F, 15, 26, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 172, -11.0F, -12.0F, 6.0F, 7, 18, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 220, 42, -5.0F, -28.0F, 6.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 11, 114, -6.0F, -28.0F, 6.0F, 1, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 120, -9.0F, -28.0F, 6.0F, 3, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 330, 66, -10.0F, -11.0F, 7.0F, 6, 17, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 107, 32, -10.0F, -13.0F, 7.0F, 1, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 75, -9.0F, -12.0F, 7.0F, 5, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 331, 292, -3.0F, -20.0F, 7.0F, 14, 26, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 40, 313, -2.0F, -34.0F, 8.0F, 4, 40, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 59, 64, -5.0F, -13.0F, 7.0F, 1, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 104, 463, -4.0F, -18.0F, 7.0F, 1, 24, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 331, 319, -3.0F, -28.0F, 7.0F, 14, 8, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 216, 58, -4.0F, -28.0F, 7.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 113, 34, -5.0F, -28.0F, 7.0F, 1, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 43, 54, -6.0F, -28.0F, 7.0F, 1, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 55, 56, -10.0F, -34.0F, 7.0F, 21, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 55, 62, -9.0F, -29.0F, 7.0F, 20, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 572, 236, -11.0F, -34.0F, -10.0F, 22, 13, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 322, 0, -11.0F, -21.0F, -10.0F, 6, 27, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 336, 0, -5.0F, -21.0F, -10.0F, 1, 27, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 110, 71, -3.0F, -1.0F, -10.0F, 9, 7, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 224, 204, 6.0F, -1.0F, -10.0F, 1, 7, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 71, 122, 7.0F, -1.0F, -10.0F, 1, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 98, 61, 8.0F, -1.0F, -10.0F, 1, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 173, 117, -2.0F, -5.0F, -10.0F, 2, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 157, 53, 0.0F, -3.0F, -10.0F, 2, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 165, 175, 4.0F, -4.0F, -10.0F, 2, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 173, 87, 6.0F, -5.0F, -10.0F, 2, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 64, 122, 7.0F, -9.0F, -10.0F, 1, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 146, 69, 2.0F, -2.0F, -10.0F, 2, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 220, 204, -3.0F, -8.0F, -10.0F, 1, 7, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 212, 58, -4.0F, -20.0F, -10.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 106, 267, -4.0F, -11.0F, -10.0F, 1, 17, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 113, 32, -4.0F, -21.0F, -10.0F, 15, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 196, 78, 0.0F, -20.0F, -10.0F, 11, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 73, 2.0F, -19.0F, -10.0F, 9, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 54, 12, 5.0F, -18.0F, -10.0F, 6, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 119, 79, 6.0F, -17.0F, -10.0F, 5, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 10, 103, 7.0F, -13.0F, -10.0F, 4, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 220, 175, 8.0F, -11.0F, -10.0F, 3, 10, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 71, 209, 10.0F, -1.0F, -10.0F, 1, 7, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 165, 138, 11.0F, -1.0F, -9.0F, 1, 7, 5, 0.0F));
		body.cubeList.add(new ModelBox(body, 328, 41, 11.0F, 1.0F, -4.0F, 1, 5, 10, 0.0F));
		body.cubeList.add(new ModelBox(body, 55, 151, 11.0F, -1.0F, -1.0F, 1, 2, 7, 0.0F));
		body.cubeList.add(new ModelBox(body, 11, 85, 11.0F, -3.0F, 2.0F, 1, 2, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 179, 115, 11.0F, -10.0F, 4.0F, 1, 5, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 124, 165, 11.0F, -20.0F, 4.0F, 1, 5, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 119, 101, 11.0F, -20.0F, 3.0F, 1, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 5, 85, 11.0F, -20.0F, 2.0F, 1, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 212, 42, 11.0F, -15.0F, 5.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 157, 15, 11.0F, -5.0F, 3.0F, 1, 2, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 224, 72, 11.0F, -7.0F, -6.0F, 1, 6, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 220, 117, 11.0F, -11.0F, -9.0F, 1, 10, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 11, 55, 11.0F, -15.0F, -9.0F, 1, 4, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 64, 122, 11.0F, -16.0F, -9.0F, 1, 1, 5, 0.0F));
		body.cubeList.add(new ModelBox(body, 212, 42, 11.0F, -17.0F, -9.0F, 1, 1, 6, 0.0F));
		body.cubeList.add(new ModelBox(body, 110, 130, 11.0F, -18.0F, -9.0F, 1, 1, 8, 0.0F));
		body.cubeList.add(new ModelBox(body, 55, 64, 11.0F, -19.0F, -9.0F, 1, 1, 9, 0.0F));
		body.cubeList.add(new ModelBox(body, 54, 0, 11.0F, -20.0F, -9.0F, 1, 1, 11, 0.0F));
		body.cubeList.add(new ModelBox(body, 198, 568, 11.0F, -34.0F, -9.0F, 1, 14, 15, 0.0F));
		body.cubeList.add(new ModelBox(body, 67, 0, 6.0F, -20.0F, -9.0F, 5, 10, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 0, 10.0F, -20.0F, -8.0F, 1, 10, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 181, 167, 10.0F, -20.0F, -4.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 110, 79, 10.0F, -20.0F, -3.0F, 1, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 172, 138, 10.0F, -20.0F, -2.0F, 1, 3, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 68, 130, 10.0F, -20.0F, 0.0F, 1, 2, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 63, 160, 10.0F, -20.0F, 3.0F, 1, 1, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 122, 217, 10.0F, -10.0F, -8.0F, 1, 10, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 220, 72, 10.0F, 0.0F, -8.0F, 1, 6, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 402, 446, 10.0F, 0.0F, -7.0F, 1, 6, 13, 0.0F));
		body.cubeList.add(new ModelBox(body, 465, 0, 10.0F, -19.0F, 3.0F, 1, 19, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 165, 15, 10.0F, -18.0F, 1.0F, 1, 4, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 181, 109, 10.0F, -14.0F, 2.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 126, 159, 10.0F, -5.0F, 2.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 110, 64, 10.0F, -3.0F, 1.0F, 1, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 123, 109, 10.0F, -2.0F, -2.0F, 1, 2, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 168, 42, 10.0F, -2.0F, -5.0F, 1, 2, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 98, 21, 10.0F, -7.0F, -5.0F, 1, 5, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 54, 0, 7.0F, -10.0F, -9.0F, 4, 10, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 102, 29, -10.0F, -2.0F, -9.0F, 17, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 55, 74, 0.0F, -4.0F, -9.0F, 7, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 267, 47, -10.0F, -4.0F, -9.0F, 10, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 444, 474, -10.0F, -20.0F, -9.0F, 5, 16, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 102, 38, 4.0F, -5.0F, -9.0F, 3, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 71, 74, 6.0F, -7.0F, -9.0F, 1, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 48, -10.0F, 0.0F, -9.0F, 21, 6, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 71, 93, 4.0F, -20.0F, -9.0F, 1, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 55, 160, 1.0F, -20.0F, -9.0F, 3, 3, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 11, 120, -5.0F, -20.0F, -9.0F, 4, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 342, 125, -5.0F, -19.0F, -9.0F, 2, 15, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 181, 196, -3.0F, -11.0F, -9.0F, 1, 7, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 118, 167, -2.0F, -8.0F, -9.0F, 2, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 110, 136, 0.0F, -5.0F, -9.0F, 2, 1, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 64, 93, -3.0F, -19.0F, -9.0F, 1, 4, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 149, -1.0F, -20.0F, -9.0F, 2, 2, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 72, 151, 5.0F, -20.0F, -9.0F, 1, 8, 1, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 0, -10.0F, -28.0F, -8.0F, 20, 34, 14, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 7.0F, 7.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 107, 0, -1.0F, -28.7654F, -6.1522F, 2, 6, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 93, -1.0F, -32.7654F, -7.1522F, 2, 6, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 116, 0, -1.0F, -21.7654F, -4.1522F, 2, 6, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 110, 101, -1.0F, -25.7654F, -5.1522F, 2, 6, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 151, -1.0F, -14.7654F, -2.1522F, 2, 6, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 55, 122, -1.0F, -18.7654F, -3.1522F, 2, 6, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 157, 37, -1.0F, -11.7654F, -1.1522F, 2, 6, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 179, 138, -1.0F, -7.7654F, -0.1522F, 2, 6, 1, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -29.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.5236F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 367, 578, -12.0F, -13.0F, -5.0F, 7, 15, 8, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -29.0F, 0.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.5236F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 577, 527, 5.0F, -13.0F, -5.0F, 7, 11, 8, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -14.0F, 0.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 269, 289, 2.0F, -21.2215F, -8.9414F, 7, 5, 5, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 267, 37, -9.0F, -21.2215F, -8.9414F, 7, 5, 5, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 180, 2.0F, -15.2215F, -8.9414F, 7, 7, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 165, 167, -9.0F, -15.2215F, -8.9414F, 7, 7, 1, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -14.0F, 0.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 438, 51, -10.0F, -20.2215F, -6.9414F, 9, 11, 8, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 577, 506, 1.0F, -20.2215F, -6.9414F, 9, 11, 8, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -89.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 497, 556, -5.0F, -17.0F, -7.0F, 10, 16, 10, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.0F, -7.0F, -6.0F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0758F, 0.8202F, -1.6723F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 143, 6.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.0F, -7.0F, -6.0F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1408F, 0.1144F, -1.4217F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 220, 88, -13.3985F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.0F, -7.0F, -6.0F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1402F, 0.0712F, -1.4279F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 483, 109, -10.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.0F, -7.0F, -6.0F);
		head.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.5887F, 0.1537F, -0.8122F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 277, 98, -25.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.0F, -7.0F, -6.0F);
		head.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.077F, 0.3034F, -1.5512F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 350, -3.703F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 78, 533, -5.703F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.0F, -7.0F, -6.0F);
		head.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.5849F, 0.8783F, -0.4624F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 364, 531, 2.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.0F, -7.0F, -6.0F);
		head.addChild(cube_r12);
		setRotationAngle(cube_r12, 1.0599F, -0.0685F, -0.9243F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 528, -22.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.0F, -7.0F, -6.0F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, 1.7264F, -0.1708F, -1.6262F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 389, 212, -12.8654F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 322, 443, -7.8654F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.0F, -7.0F, 30.0F);
		head.addChild(cube_r14);
		setRotationAngle(cube_r14, -2.0406F, 0.6714F, -3.0087F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 286, -7.6935F, -10.4201F, -10.0726F, 17, 8, 19, -4.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.0F, -7.0F, 0.0F);
		head.addChild(cube_r15);
		setRotationAngle(cube_r15, -2.1224F, 0.3294F, -2.4158F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 483, 75, -11.7403F, -33.5969F, -23.3578F, 10, 24, 10, -4.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.0F, -7.0F, 0.0F);
		head.addChild(cube_r16);
		setRotationAngle(cube_r16, -1.184F, 0.0878F, -2.5192F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 494, 527, -7.0931F, -34.9704F, -6.3395F, 13, 8, 13, -4.0F));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 349, 204, -5.0931F, -35.9704F, -4.3395F, 10, 41, 10, -4.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.0F, -7.0F, 0.0F);
		head.addChild(cube_r17);
		setRotationAngle(cube_r17, -1.4422F, 0.0698F, 2.7278F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 218, 526, 1.9069F, -33.9704F, -6.3395F, 13, 8, 13, -4.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.0F, -7.0F, 0.0F);
		head.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.3666F, 0.7894F, -2.7136F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 525, 287, -23.0931F, -28.9704F, -12.3395F, 13, 8, 13, -4.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.0F, -7.0F, 0.0F);
		head.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.441F, 0.3153F, -2.0866F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 200, 389, -14.1613F, -30.2035F, -0.4172F, 17, 8, 15, -4.0F));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 443, 174, -9.1613F, -31.2035F, 2.5828F, 10, 28, 10, -4.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.0F, -6.0F, 0.0F);
		head.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.8099F, -0.113F, -1.0894F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 443, 123, -7.8654F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 389, 161, -12.8654F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -6.0F, 0.0F);
		head.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.1347F, 0.2344F, -1.4229F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 325, 523, -5.703F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 349, 153, -3.703F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-2.0F, -6.0F, 0.0F);
		head.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.4547F, 1.2043F, -1.9816F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 520, 232, 2.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.0F, -6.0F, 0.0F);
		head.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.3069F, 0.4773F, -0.6931F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 129, 520, -22.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.0F, -6.0F, 0.0F);
		head.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.769F, 0.1917F, -1.1586F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 340, 481, -10.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.0F, -11.0F, -6.0F);
		head.addChild(cube_r25);
		setRotationAngle(cube_r25, 1.3868F, -1.5011F, -1.3092F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 443, 72, -7.8654F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 389, 110, -12.8654F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-2.0F, -11.0F, -6.0F);
		head.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.8919F, -1.0222F, -1.4719F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 349, 102, -3.703F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 39, 520, -5.703F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-2.0F, -11.0F, -6.0F);
		head.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.4782F, -1.1923F, -1.0165F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 300, 481, -10.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.0F, -11.0F, -6.0F);
		head.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.4326F, -1.1531F, -1.066F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 220, 58, -13.3985F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-2.0F, -11.0F, -6.0F);
		head.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.4584F, -0.0518F, -1.0188F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 517, 266, 2.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-2.0F, -11.0F, -6.0F);
		head.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.5524F, -0.6522F, -0.475F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 277, 68, -25.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-2.0F, -11.0F, -6.0F);
		head.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.0509F, -0.514F, -1.671F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 110, 130, 6.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-2.0F, -11.0F, -6.0F);
		head.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.2333F, -0.8353F, -0.2448F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 516, 198, -22.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0681F, 0.1486F, -0.0681F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 441, 392, -7.8654F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 389, 59, -12.8654F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.6633F, 0.1631F, -0.5538F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 349, 51, -3.703F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 286, 515, -5.703F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r35);
		setRotationAngle(cube_r35, -1.5711F, 0.3195F, -0.3373F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 475, 0, -10.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r36);
		setRotationAngle(cube_r36, -1.5856F, 0.3192F, -0.3833F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 110, 217, -13.3985F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r37);
		setRotationAngle(cube_r37, -1.2344F, 0.5538F, -1.5908F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 515, 0, 2.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r38);
		setRotationAngle(cube_r38, -1.3627F, 0.8946F, -0.6197F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 106, 275, -25.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r39);
		setRotationAngle(cube_r39, -1.7849F, -0.0222F, -1.0484F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 55, 122, 6.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.6F, 0.8363F, -0.2451F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 406, 513, -22.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.0426F, -0.517F, -0.106F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 230, 441, -7.8654F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 386, 379, -12.8654F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.4332F, -0.4729F, -0.6507F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 341, 0, -3.703F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 513, 164, -5.703F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r43);
		setRotationAngle(cube_r43, -1.4949F, -0.3504F, -0.398F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 473, 41, -10.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r44);
		setRotationAngle(cube_r44, -1.4791F, -0.3467F, -0.4442F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 212, 29, -13.3985F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.5375F, 0.309F, -1.3465F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 513, 130, 2.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r46);
		setRotationAngle(cube_r46, -1.1108F, 0.2518F, -0.5345F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 275, 39, -25.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r47);
		setRotationAngle(cube_r47, -1.2485F, -0.456F, -1.2409F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 114, 6.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-2.0F, -8.0F, -1.0F);
		head.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.5857F, 0.1624F, -0.2972F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 513, 96, -22.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-2.0F, -6.0F, 0.0F);
		head.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.7754F, 0.223F, -1.1897F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 212, 0, -13.3985F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-2.0F, -6.0F, 0.0F);
		head.addChild(cube_r50);
		setRotationAngle(cube_r50, -0.2214F, 0.7141F, -0.7857F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 269, 10, -25.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-2.0F, -6.0F, 0.0F);
		head.addChild(cube_r51);
		setRotationAngle(cube_r51, -1.1251F, 0.4327F, -1.9407F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 110, 101, 6.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-3.0F, -7.0F, 30.0F);
		head.addChild(cube_r52);
		setRotationAngle(cube_r52, -2.2303F, -0.3066F, -2.8722F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 110, 72, -3.6935F, -7.4201F, -11.0726F, 17, 8, 21, -4.0F));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-3.0F, -7.0F, 0.0F);
		head.addChild(cube_r53);
		setRotationAngle(cube_r53, -2.1346F, 0.3063F, -2.4548F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 55, 209, -14.7403F, -32.5969F, -28.3578F, 17, 8, 21, -4.0F));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(2.0F, -12.0F, -3.0F);
		head.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.2614F, 0.0861F, -0.6018F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 305, 379, -4.1346F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 435, 13, -2.1346F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(2.0F, -12.0F, -3.0F);
		head.addChild(cube_r55);
		setRotationAngle(cube_r55, -0.3829F, -0.0427F, -0.139F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 240, 338, -6.297F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 0, 507, -7.297F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(2.0F, -12.0F, -3.0F);
		head.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.9129F, -0.7143F, 0.7349F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 511, 411, -15.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(2.0F, -12.0F, -3.0F);
		head.addChild(cube_r57);
		setRotationAngle(cube_r57, -0.3154F, -0.6177F, -0.6097F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 494, 506, 9.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(2.0F, -12.0F, -3.0F);
		head.addChild(cube_r58);
		setRotationAngle(cube_r58, -1.3205F, -0.1382F, -0.3839F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 392, 471, 0.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(2.0F, -12.0F, -3.0F);
		head.addChild(cube_r59);
		setRotationAngle(cube_r59, -1.4829F, -0.0098F, 0.3865F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 102, 0, -23.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(2.0F, -12.0F, -3.0F);
		head.addChild(cube_r60);
		setRotationAngle(cube_r60, -1.3267F, -0.1489F, -0.3411F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 165, 196, -3.6015F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(2.0F, -12.0F, -3.0F);
		head.addChild(cube_r61);
		setRotationAngle(cube_r61, -0.9634F, -0.754F, -0.3398F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 235, 262, 8.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(2.0F, -12.0F, -6.0F);
		head.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.6775F, 0.3434F, -0.5112F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 381, 0, -4.1346F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 431, 436, -2.1346F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(2.0F, -12.0F, -6.0F);
		head.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0923F, 0.0261F, -0.143F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 280, 338, -6.297F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 513, 42, -7.297F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(2.0F, -12.0F, -6.0F);
		head.addChild(cube_r64);
		setRotationAngle(cube_r64, -0.2804F, -0.9527F, 0.2563F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 513, 63, -15.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(2.0F, -12.0F, -6.0F);
		head.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0924F, -0.3028F, -0.7952F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 90, 512, 9.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(2.0F, -12.0F, -6.0F);
		head.addChild(cube_r66);
		setRotationAngle(cube_r66, -0.8775F, 0.0491F, -0.404F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 471, 420, 0.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(2.0F, -12.0F, -6.0F);
		head.addChild(cube_r67);
		setRotationAngle(cube_r67, -1.0329F, -0.1838F, 0.3421F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 102, 35, -23.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(2.0F, -12.0F, -6.0F);
		head.addChild(cube_r68);
		setRotationAngle(cube_r68, -0.8763F, 0.0212F, -0.3704F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 0, 201, -3.6015F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(2.0F, -12.0F, -6.0F);
		head.addChild(cube_r69);
		setRotationAngle(cube_r69, -0.4386F, -0.5179F, -0.6583F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 53, 267, 8.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(4.0F, -7.0F, -6.0F);
		head.addChild(cube_r70);
		setRotationAngle(cube_r70, 1.0599F, 0.0685F, 0.9243F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 533, 514, 9.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(4.0F, -7.0F, -6.0F);
		head.addChild(cube_r71);
		setRotationAngle(cube_r71, -0.0758F, -0.8202F, 1.6723F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 55, 151, -23.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(4.0F, -7.0F, -6.0F);
		head.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.5887F, -0.1537F, 0.8122F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 277, 127, 8.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(4.0F, -7.0F, -6.0F);
		head.addChild(cube_r73);
		setRotationAngle(cube_r73, 1.5849F, -0.8783F, 0.4624F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 533, 493, -15.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(4.0F, -7.0F, -6.0F);
		head.addChild(cube_r74);
		setRotationAngle(cube_r74, 1.7264F, 0.1708F, 1.6262F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 391, 328, -4.1346F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 362, 443, -2.1346F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(4.0F, -7.0F, -6.0F);
		head.addChild(cube_r75);
		setRotationAngle(cube_r75, 1.077F, -0.3034F, 1.5512F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 533, 384, -7.297F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r75.cubeList.add(new ModelBox(cube_r75, 80, 350, -6.297F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(4.0F, -7.0F, -6.0F);
		head.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.1408F, -0.1144F, 1.4217F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 220, 117, -3.6015F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(4.0F, -7.0F, -6.0F);
		head.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.1402F, -0.0712F, 1.4279F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 483, 143, 0.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(2.0F, -11.0F, -6.0F);
		head.addChild(cube_r78);
		setRotationAngle(cube_r78, -0.2333F, 0.8353F, 0.2448F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 416, 534, 9.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(2.0F, -11.0F, -6.0F);
		head.addChild(cube_r79);
		setRotationAngle(cube_r79, -0.0509F, 0.514F, 1.671F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 157, 8, -23.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(2.0F, -11.0F, -6.0F);
		head.addChild(cube_r80);
		setRotationAngle(cube_r80, -0.5524F, 0.6522F, 0.475F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 277, 156, 8.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(2.0F, -11.0F, -6.0F);
		head.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.4584F, 0.0518F, 1.0188F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 534, 329, -15.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(2.0F, -11.0F, -6.0F);
		head.addChild(cube_r82);
		setRotationAngle(cube_r82, 1.3868F, 1.5011F, 1.3092F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 249, 397, -4.1346F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 446, 225, -2.1346F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(2.0F, -11.0F, -6.0F);
		head.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.8919F, 1.0222F, 1.4719F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 534, 308, -7.297F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 120, 351, -6.297F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(2.0F, -11.0F, -6.0F);
		head.addChild(cube_r84);
		setRotationAngle(cube_r84, -0.4326F, 1.1531F, 1.066F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 220, 146, -3.6015F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(2.0F, -11.0F, -6.0F);
		head.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.4782F, 1.1923F, 1.0165F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 483, 177, 0.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r86);
		setRotationAngle(cube_r86, -0.6F, -0.8363F, 0.2451F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 537, 432, 9.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r87);
		setRotationAngle(cube_r87, -1.7849F, 0.0222F, 1.0484F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 157, 43, -23.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r88);
		setRotationAngle(cube_r88, -1.3627F, -0.8946F, 0.6197F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 277, 185, 8.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r89);
		setRotationAngle(cube_r89, -1.2344F, -0.5538F, 1.5908F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 257, 536, -15.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0681F, -0.1486F, 0.0681F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 25, 401, -4.1346F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 110, 453, -2.1346F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r91);
		setRotationAngle(cube_r91, -0.6633F, -0.1631F, 0.5538F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 533, 535, -7.297F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r91.cubeList.add(new ModelBox(cube_r91, 361, 292, -6.297F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r92);
		setRotationAngle(cube_r92, -1.5856F, -0.3192F, 0.3833F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 220, 175, -3.6015F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r93);
		setRotationAngle(cube_r93, -1.5711F, -0.3195F, 0.3373F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 220, 484, 0.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r94);
		setRotationAngle(cube_r94, -0.5857F, -0.1624F, 0.2972F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 117, 541, 9.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r95);
		setRotationAngle(cube_r95, -1.2485F, 0.456F, 1.2409F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 110, 159, -23.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r96);
		setRotationAngle(cube_r96, -1.1108F, -0.2518F, 0.5345F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 277, 214, 8.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r97);
		setRotationAngle(cube_r97, -0.5375F, -0.309F, 1.3465F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 39, 541, -15.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r98);
		setRotationAngle(cube_r98, -0.0426F, 0.517F, 0.106F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 401, 284, -4.1346F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 150, 453, -2.1346F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r99);
		setRotationAngle(cube_r99, -0.4332F, 0.4729F, 0.6507F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 540, 453, -7.297F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r99.cubeList.add(new ModelBox(cube_r99, 361, 343, -6.297F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r100);
		setRotationAngle(cube_r100, -1.4791F, 0.3467F, 0.4442F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 220, 204, -3.6015F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(2.0F, -8.0F, -1.0F);
		head.addChild(cube_r101);
		setRotationAngle(cube_r101, -1.4949F, 0.3504F, 0.398F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 485, 287, 0.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(2.0F, -6.0F, 0.0F);
		head.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.3069F, -0.4773F, 0.6931F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 544, 350, 9.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(2.0F, -6.0F, 0.0F);
		head.addChild(cube_r103);
		setRotationAngle(cube_r103, -1.1251F, -0.4327F, 1.9407F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 165, 80, -23.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(2.0F, -6.0F, 0.0F);
		head.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.2214F, -0.7141F, 0.7857F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 159, 283, 8.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(2.0F, -6.0F, 0.0F);
		head.addChild(cube_r105);
		setRotationAngle(cube_r105, -0.4547F, -1.2043F, 1.9816F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 296, 544, -15.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(2.0F, -6.0F, 0.0F);
		head.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.8099F, 0.113F, 1.0894F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 401, 351, -4.1346F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 455, 318, -2.1346F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(2.0F, -6.0F, 0.0F);
		head.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.1347F, -0.2344F, 1.4229F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 169, 544, -7.297F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 0, 364, -6.297F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(2.0F, -6.0F, 0.0F);
		head.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.7754F, -0.223F, 1.1897F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 165, 225, -3.6015F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(2.0F, -6.0F, 0.0F);
		head.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.769F, -0.1917F, 1.1586F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 486, 211, 0.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(3.0F, -7.0F, 0.0F);
		head.addChild(cube_r110);
		setRotationAngle(cube_r110, -0.441F, -0.3153F, 2.0866F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 89, 402, -2.8387F, -30.2035F, -0.4172F, 17, 8, 15, -4.0F));
		cube_r110.cubeList.add(new ModelBox(cube_r110, 190, 456, -0.8387F, -31.2035F, 2.5828F, 10, 28, 10, -4.0F));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(3.0F, -7.0F, 0.0F);
		head.addChild(cube_r111);
		setRotationAngle(cube_r111, -1.3666F, -0.7894F, 2.7136F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 455, 545, 10.0931F, -28.9704F, -12.3395F, 13, 8, 13, -4.0F));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(3.0F, -7.0F, 0.0F);
		head.addChild(cube_r112);
		setRotationAngle(cube_r112, -1.4422F, -0.0698F, -2.7278F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 0, 549, -14.9069F, -33.9704F, -6.3395F, 13, 8, 13, -4.0F));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(3.0F, -7.0F, 0.0F);
		head.addChild(cube_r113);
		setRotationAngle(cube_r113, -1.184F, -0.0878F, 2.5192F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 552, 29, -5.9069F, -34.9704F, -6.3395F, 13, 8, 13, -4.0F));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 321, 328, -4.9069F, -35.9704F, -4.3395F, 10, 41, 10, -4.0F));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(3.0F, -7.0F, 30.0F);
		head.addChild(cube_r114);
		setRotationAngle(cube_r114, -2.2303F, 0.3066F, 2.8722F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 165, 109, -13.3065F, -7.4201F, -11.0726F, 17, 8, 21, -4.0F));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(3.0F, -7.0F, 30.0F);
		head.addChild(cube_r115);
		setRotationAngle(cube_r115, -2.0406F, -0.6714F, 3.0087F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 288, 243, -9.3065F, -10.4201F, -10.0726F, 17, 8, 19, -4.0F));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(3.0F, -7.0F, 0.0F);
		head.addChild(cube_r116);
		setRotationAngle(cube_r116, -2.1346F, -0.3063F, 2.4548F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 0, 230, -2.2597F, -32.5969F, -28.3578F, 17, 8, 21, -4.0F));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(3.0F, -7.0F, 0.0F);
		head.addChild(cube_r117);
		setRotationAngle(cube_r117, -2.1224F, -0.3294F, 2.4158F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 490, 245, 1.7403F, -33.5969F, -23.3578F, 10, 24, 10, -4.0F));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(0.0F, -11.0F, 0.0F);
		head.addChild(cube_r118);
		setRotationAngle(cube_r118, -0.2182F, 0.0F, 0.0F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 476, 603, -1.0F, -3.0F, -8.0F, 2, 6, 4, 0.0F));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		legG = new ModelRenderer(this);
		legG.setRotationPoint(10.0F, -70.0F, 0.0F);
		legs.addChild(legG);
		legG.cubeList.add(new ModelBox(legG, 462, 504, -4.0F, -1.0F, -5.0F, 7, 32, 9, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 397, 586, 3.0F, -1.0F, -5.0F, 1, 17, 9, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 0, 286, -4.0F, -1.0F, -6.0F, 7, 17, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 432, 474, -3.0F, 6.0F, -6.0F, 5, 16, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 64, 151, -2.0F, 22.0F, -6.0F, 3, 4, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 17, 85, -1.0F, 26.0F, -6.0F, 1, 3, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 11, 85, -1.0F, 26.0F, 4.0F, 1, 3, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 149, 29, -2.0F, 22.0F, 4.0F, 3, 4, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 447, 374, -3.0F, 6.0F, 4.0F, 5, 16, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 0, 259, -4.0F, -1.0F, 4.0F, 7, 17, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 29, 590, 3.0F, 6.0F, -4.0F, 1, 16, 7, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 220, 87, 3.0F, 22.0F, -3.0F, 1, 4, 5, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 110, 130, 3.0F, 26.0F, -2.0F, 1, 3, 3, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 0, 114, -5.0F, 26.0F, -2.0F, 1, 3, 3, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 586, 320, -5.0F, -1.0F, -5.0F, 1, 17, 9, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 165, 196, -9.0F, -1.0F, -3.0F, 2, 3, 5, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 55, 93, -7.0F, -1.0F, -4.0F, 1, 6, 7, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 0, 55, -6.0F, -1.0F, -5.0F, 1, 9, 9, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 589, 432, -5.0F, 6.0F, -4.0F, 1, 16, 7, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 110, 217, -5.0F, 22.0F, -3.0F, 1, 4, 5, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 32, 462, -4.0F, 33.0F, -5.0F, 7, 35, 9, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 330, 95, -3.0F, 30.0F, -6.0F, 5, 5, 9, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 0, 143, 3.0F, 61.0F, -5.0F, 1, 7, 9, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 230, 420, -8.0F, 65.0F, -9.0F, 15, 5, 16, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 157, 0, -7.0F, 67.0F, -13.0F, 13, 3, 4, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 191, 0, -6.0F, 68.0F, -18.0F, 11, 2, 5, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 140, 29, 2.0F, 69.0F, -23.0F, 2, 1, 5, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 120, 139, -4.0F, 69.0F, -21.0F, 2, 1, 3, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 119, 101, -2.0F, 69.0F, -23.0F, 1, 1, 5, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 171, 144, 0.0F, 69.0F, -24.0F, 1, 1, 6, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 168, 37, -7.0F, 67.0F, 7.0F, 13, 3, 2, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 198, 37, -6.0F, 68.0F, 9.0F, 11, 2, 3, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 110, 139, 2.0F, 69.0F, 12.0F, 2, 1, 3, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 10, 130, 0.0F, 69.0F, 12.0F, 1, 1, 4, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 61, 133, -4.0F, 69.0F, 12.0F, 2, 1, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 11, 148, -2.0F, 69.0F, 12.0F, 1, 1, 3, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 200, 310, 7.0F, 67.0F, -7.0F, 2, 3, 13, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 275, 241, 9.0F, 68.0F, -6.0F, 3, 2, 11, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 0, 103, 12.0F, 69.0F, -5.0F, 3, 1, 2, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 110, 112, 12.0F, 69.0F, -2.0F, 4, 1, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 117, 139, 12.0F, 69.0F, 1.0F, 1, 1, 2, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 0, 91, 12.0F, 69.0F, 0.0F, 3, 1, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 589, 136, 3.0F, 45.0F, -4.0F, 1, 16, 7, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 216, 254, 4.0F, 48.0F, -2.0F, 1, 17, 2, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 330, 154, 3.0F, 41.0F, -3.0F, 1, 14, 5, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 341, 241, 3.0F, 38.0F, -2.0F, 1, 13, 3, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 330, 183, -5.0F, 41.0F, -3.0F, 1, 14, 5, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 151, 589, -5.0F, 45.0F, -4.0F, 1, 16, 7, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 157, 37, -5.0F, 61.0F, -5.0F, 1, 7, 9, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 206, 379, -6.0F, 45.0F, -3.0F, 1, 23, 2, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 303, 241, -6.0F, 54.0F, 0.0F, 1, 14, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 89, 401, -5.0F, 38.0F, -2.0F, 1, 13, 3, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 165, 109, -4.0F, 61.0F, -6.0F, 7, 7, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 428, 23, -1.0F, 45.0F, -7.0F, 2, 23, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 53, 259, -3.0F, 51.0F, -7.0F, 1, 17, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 433, 235, -3.0F, 45.0F, -6.0F, 5, 16, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 379, 261, -2.0F, 41.0F, -6.0F, 3, 14, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 232, 87, -1.0F, 38.0F, -6.0F, 1, 13, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 16, 201, -2.0F, 49.0F, 5.0F, 1, 19, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 387, 23, -1.0F, 45.0F, 5.0F, 2, 23, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 173, 7, 1.0F, 55.0F, 5.0F, 1, 13, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 157, 7, -4.0F, 61.0F, 4.0F, 7, 7, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 435, 374, -3.0F, 45.0F, 4.0F, 5, 16, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 381, 0, -2.0F, 41.0F, 4.0F, 3, 14, 1, 0.0F));
		legG.cubeList.add(new ModelBox(legG, 236, 87, -1.0F, 38.0F, 4.0F, 1, 13, 1, 0.0F));

		legD = new ModelRenderer(this);
		legD.setRotationPoint(-9.0F, -70.0F, 0.0F);
		legs.addChild(legD);
		legD.cubeList.add(new ModelBox(legD, 212, 283, -10.0F, 67.0F, -7.0F, 2, 3, 13, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 216, 262, -13.0F, 68.0F, -6.0F, 3, 2, 11, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 11, 91, -16.0F, 69.0F, -5.0F, 3, 1, 2, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 66, 71, -17.0F, 69.0F, -2.0F, 4, 1, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 138, 29, -14.0F, 69.0F, 1.0F, 1, 1, 2, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 12, 75, -16.0F, 69.0F, 0.0F, 3, 1, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 68, 21, -7.0F, 67.0F, 7.0F, 13, 3, 2, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 192, 72, -6.0F, 68.0F, 9.0F, 11, 2, 3, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 120, 134, -5.0F, 69.0F, 12.0F, 2, 1, 3, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 0, 130, -2.0F, 69.0F, 12.0F, 1, 1, 4, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 55, 133, 1.0F, 69.0F, 12.0F, 2, 1, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 6, 130, 0.0F, 69.0F, 12.0F, 1, 1, 3, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 64, 93, 0.0F, 69.0F, -23.0F, 1, 1, 5, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 120, 130, 1.0F, 69.0F, -21.0F, 2, 1, 3, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 138, 65, -2.0F, 69.0F, -24.0F, 1, 1, 6, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 110, 79, -5.0F, 69.0F, -23.0F, 2, 1, 5, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 165, 72, -6.0F, 68.0F, -18.0F, 11, 2, 5, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 110, 64, -7.0F, 67.0F, -13.0F, 13, 3, 4, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 401, 307, -8.0F, 65.0F, -9.0F, 15, 5, 16, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 307, 270, -3.0F, 30.0F, -6.0F, 5, 5, 9, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 0, 462, -4.0F, 33.0F, -5.0F, 7, 35, 9, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 0, 114, -5.0F, 61.0F, -5.0F, 1, 7, 9, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 135, 589, -5.0F, 45.0F, -4.0F, 1, 16, 7, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 330, 125, -5.0F, 41.0F, -3.0F, 1, 14, 5, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 98, 294, -5.0F, 38.0F, -2.0F, 1, 13, 3, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 218, 2, 3.0F, 41.0F, -3.0F, 1, 14, 5, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 588, 467, 3.0F, 45.0F, -4.0F, 1, 16, 7, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 102, 32, 3.0F, 61.0F, -5.0F, 1, 7, 9, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 244, 262, 3.0F, 38.0F, -2.0F, 1, 13, 3, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 165, 79, -4.0F, 61.0F, -6.0F, 7, 7, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 428, 184, -3.0F, 45.0F, -6.0F, 5, 16, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 368, 255, -2.0F, 41.0F, -6.0F, 3, 14, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 212, 7, -1.0F, 38.0F, -6.0F, 1, 13, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 110, 159, -4.0F, 61.0F, 4.0F, 7, 7, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 428, 133, -3.0F, 45.0F, 4.0F, 5, 16, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 360, 255, -2.0F, 41.0F, 4.0F, 3, 14, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 181, 79, -1.0F, 38.0F, 4.0F, 1, 13, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 72, 64, -1.0F, 26.0F, 4.0F, 1, 3, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 146, 64, -2.0F, 22.0F, 4.0F, 3, 4, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 428, 82, -3.0F, 6.0F, 4.0F, 5, 16, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 0, 230, -4.0F, -1.0F, 4.0F, 7, 17, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 66, 64, -1.0F, 26.0F, -6.0F, 1, 3, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 11, 143, -2.0F, 22.0F, -6.0F, 3, 4, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 330, 212, -3.0F, 6.0F, -6.0F, 5, 16, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 0, 201, -4.0F, -1.0F, -6.0F, 7, 17, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 102, 32, 3.0F, 26.0F, -2.0F, 1, 3, 3, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 115, 580, 3.0F, -1.0F, -5.0F, 1, 17, 9, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 587, 99, 3.0F, 6.0F, -4.0F, 1, 16, 7, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 64, 212, 3.0F, 22.0F, -3.0F, 1, 4, 5, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 0, 85, -5.0F, 26.0F, -2.0F, 1, 3, 3, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 174, 199, -5.0F, 22.0F, -3.0F, 1, 4, 5, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 230, 412, -5.0F, 6.0F, -4.0F, 1, 16, 7, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 120, 425, -5.0F, -1.0F, -5.0F, 1, 17, 9, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 186, 503, -4.0F, -1.0F, -5.0F, 7, 32, 9, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 0, 85, 4.0F, -1.0F, -5.0F, 1, 9, 9, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 107, 0, 5.0F, -1.0F, -4.0F, 1, 6, 7, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 55, 209, 6.0F, -1.0F, -3.0F, 2, 3, 5, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 159, 275, 4.0F, 54.0F, 0.0F, 1, 14, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 200, 379, 4.0F, 45.0F, -3.0F, 1, 23, 2, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 16, 230, 1.0F, 51.0F, -7.0F, 1, 17, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 183, 415, -2.0F, 45.0F, -7.0F, 2, 23, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 381, 23, -2.0F, 45.0F, 5.0F, 2, 23, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 16, 172, 0.0F, 49.0F, 5.0F, 1, 19, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 10, 0, -3.0F, 55.0F, 5.0F, 1, 13, 1, 0.0F));
		legD.cubeList.add(new ModelBox(legD, 233, 58, -6.0F, 48.0F, -2.0F, 1, 17, 2, 0.0F));

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		armG = new ModelRenderer(this);
		armG.setRotationPoint(14.0F, -108.0F, 0.0F);
		arms.addChild(armG);
		armG.cubeList.add(new ModelBox(armG, 110, 302, 1.505F, 30.4842F, -7.0F, 13, 37, 12, -4.0F));
		armG.cubeList.add(new ModelBox(armG, 82, 554, 1.505F, 59.4842F, -7.0F, 13, 17, 9, -4.0F));
		armG.cubeList.add(new ModelBox(armG, 295, 565, -0.495F, 63.4842F, -7.0F, 9, 18, 9, -4.0F));
		armG.cubeList.add(new ModelBox(armG, 348, 552, 1.505F, 54.4842F, -8.0F, 13, 17, 9, -4.0F));
		armG.cubeList.add(new ModelBox(armG, 556, 253, 1.505F, 59.4842F, -6.0F, 13, 13, 9, -4.0F));
		armG.cubeList.add(new ModelBox(armG, 556, 54, 1.505F, 59.4842F, -5.0F, 13, 10, 9, -4.0F));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(7.0F, 46.0F, -2.0F);
		armG.addChild(cube_r119);
		setRotationAngle(cube_r119, -2.84F, 1.4532F, -2.5753F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 401, 402, -6.297F, -35.9972F, -4.0809F, 10, 34, 10, -4.0F));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 488, 485, -7.297F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(7.0F, 46.0F, -2.0F);
		armG.addChild(cube_r120);
		setRotationAngle(cube_r120, -1.6946F, 0.9911F, -2.0676F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 143, 415, -2.1346F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 379, 36, -4.1346F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(7.0F, 46.0F, -2.0F);
		armG.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.1976F, 0.6554F, 0.6272F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 481, 390, -15.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(7.0F, 46.0F, -2.0F);
		armG.addChild(cube_r122);
		setRotationAngle(cube_r122, -1.2472F, 0.8753F, -0.8458F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 68, 0, 9.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(7.0F, 46.0F, -2.0F);
		armG.addChild(cube_r123);
		setRotationAngle(cube_r123, -2.8985F, 1.254F, -1.659F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 450, 263, 0.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(7.0F, 46.0F, -2.0F);
		armG.addChild(cube_r124);
		setRotationAngle(cube_r124, -1.4153F, 0.9049F, -0.4517F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 222, 235, 8.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(7.0F, 46.0F, -2.0F);
		armG.addChild(cube_r125);
		setRotationAngle(cube_r125, -2.8615F, 1.2962F, -1.6203F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 165, 138, -3.6015F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(7.0F, 46.0F, -2.0F);
		armG.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.3684F, 1.1049F, 1.6937F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 47, 27, -23.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(7.0F, 21.0F, -2.0F);
		armG.addChild(cube_r127);
		setRotationAngle(cube_r127, -0.5857F, -0.1624F, -0.0082F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 367, 505, 9.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(7.0F, 21.0F, -2.0F);
		armG.addChild(cube_r128);
		setRotationAngle(cube_r128, -0.5375F, -0.309F, 1.0411F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 505, 363, -15.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(7.0F, 21.0F, -2.0F);
		armG.addChild(cube_r129);
		setRotationAngle(cube_r129, -0.4332F, 0.4729F, 0.3453F);
		cube_r129.cubeList.add(new ModelBox(cube_r129, 247, 505, -7.297F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r129.cubeList.add(new ModelBox(cube_r129, 200, 328, -6.297F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(7.0F, 21.0F, -2.0F);
		armG.addChild(cube_r130);
		setRotationAngle(cube_r130, -0.0426F, 0.517F, -0.1994F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 379, 261, -4.1346F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 282, 433, -2.1346F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(7.0F, 21.0F, -2.0F);
		armG.addChild(cube_r131);
		setRotationAngle(cube_r131, -1.2485F, 0.456F, 0.9355F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 55, 93, -23.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(7.0F, 21.0F, -2.0F);
		armG.addChild(cube_r132);
		setRotationAngle(cube_r132, -1.2664F, -0.001F, 0.1075F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 110, 188, 6.3985F, -34.03F, -23.4669F, 17, 8, 21, -4.0F));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(7.0F, 21.0F, -2.0F);
		armG.addChild(cube_r133);
		setRotationAngle(cube_r133, -1.4791F, 0.3467F, 0.1388F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 110, 188, -3.6015F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(7.0F, 21.0F, -2.0F);
		armG.addChild(cube_r134);
		setRotationAngle(cube_r134, -1.4949F, 0.3504F, 0.0925F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 260, 471, 0.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(8.0F, 26.0F, 1.0F);
		armG.addChild(cube_r135);
		setRotationAngle(cube_r135, -0.287F, 0.0316F, -0.1698F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 567, 0, -4.0089F, -3.9123F, -5.2293F, 9, 18, 9, -4.0F));

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(4.0F, 26.0F, 1.0F);
		armG.addChild(cube_r136);
		setRotationAngle(cube_r136, -0.0097F, 0.072F, -0.5251F);
		cube_r136.cubeList.add(new ModelBox(cube_r136, 43, 562, -4.0221F, -3.7298F, -4.9609F, 9, 19, 9, -4.0F));

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(4.0F, 26.0F, -2.0F);
		armG.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.321F, 0.071F, -0.1752F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 0, 570, -4.227F, -4.6558F, -4.9688F, 9, 18, 9, -4.0F));

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(8.0F, 26.0F, -2.0F);
		armG.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.0232F, 0.0031F, 0.2059F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 464, 573, -4.2266F, -4.7054F, -5.0F, 9, 18, 9, -4.0F));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(8.0F, 34.0F, 0.0F);
		armG.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.0F, 0.0F, -0.2182F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 357, 402, -5.495F, -16.5158F, -7.0F, 11, 30, 11, -5.0F));

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(8.0F, 34.0F, 0.0F);
		armG.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.0F, 0.0F, 0.3491F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 559, 210, 2.505F, 20.4842F, -7.0F, 10, 17, 9, -4.0F));

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(12.0F, 34.0F, 0.0F);
		armG.addChild(cube_r141);
		setRotationAngle(cube_r141, -0.1745F, 0.0F, 0.0F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 79, 580, -6.495F, 33.4842F, -1.0F, 9, 16, 9, -4.0F));
		cube_r141.cubeList.add(new ModelBox(cube_r141, 564, 581, -8.495F, 33.4842F, -1.0F, 9, 16, 9, -4.0F));
		cube_r141.cubeList.add(new ModelBox(cube_r141, 500, 582, -10.495F, 33.4842F, -1.0F, 9, 16, 9, -4.0F));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(12.0F, 34.0F, 0.0F);
		armG.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.0436F, 0.0F, 0.0F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 230, 583, -6.495F, 39.4842F, -11.0F, 9, 15, 9, -4.0F));
		cube_r142.cubeList.add(new ModelBox(cube_r142, 556, 75, -8.495F, 39.4842F, -11.0F, 9, 22, 9, -4.0F));
		cube_r142.cubeList.add(new ModelBox(cube_r142, 572, 371, -10.495F, 39.4842F, -11.0F, 9, 17, 9, -4.0F));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(-14.0F, 108.0F, 0.0F);
		armG.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.0F, 0.0F, -0.2182F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 281, 289, 31.0F, -108.0F, -7.0F, 13, 37, 12, -4.0F));

		armD = new ModelRenderer(this);
		armD.setRotationPoint(-14.0F, -108.0F, 0.0F);
		arms.addChild(armD);
		armD.cubeList.add(new ModelBox(armD, 60, 301, -14.505F, 30.4842F, -7.0F, 13, 37, 12, -4.0F));
		armD.cubeList.add(new ModelBox(armD, 552, 151, -14.505F, 59.4842F, -7.0F, 13, 17, 9, -4.0F));
		armD.cubeList.add(new ModelBox(armD, 392, 555, -8.505F, 63.4842F, -7.0F, 9, 22, 9, -4.0F));
		armD.cubeList.add(new ModelBox(armD, 552, 117, -14.505F, 54.4842F, -8.0F, 13, 17, 9, -4.0F));
		armD.cubeList.add(new ModelBox(armD, 555, 185, -14.505F, 59.4842F, -6.0F, 13, 13, 9, -4.0F));
		armD.cubeList.add(new ModelBox(armD, 544, 474, -14.505F, 59.4842F, -5.0F, 13, 10, 9, -4.0F));

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(-4.0F, 29.0F, -2.0F);
		armD.addChild(cube_r144);
		setRotationAngle(cube_r144, 0.3684F, -1.1049F, -1.6937F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 0, 56, 6.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(-4.0F, 29.0F, -2.0F);
		armD.addChild(cube_r145);
		setRotationAngle(cube_r145, -2.8615F, -1.2962F, 1.6203F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 165, 167, -13.3985F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(-4.0F, 29.0F, -2.0F);
		armD.addChild(cube_r146);
		setRotationAngle(cube_r146, -1.4153F, -0.9049F, 0.4517F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 57, 240, -25.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(-4.0F, 29.0F, -2.0F);
		armD.addChild(cube_r147);
		setRotationAngle(cube_r147, -2.8985F, -1.254F, 1.659F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 64, 463, -10.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(-4.0F, 29.0F, -2.0F);
		armD.addChild(cube_r148);
		setRotationAngle(cube_r148, -1.2472F, -0.8753F, 0.8458F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 419, 492, -22.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r149 = new ModelRenderer(this);
		cube_r149.setRotationPoint(-4.0F, 29.0F, -2.0F);
		armD.addChild(cube_r149);
		setRotationAngle(cube_r149, 0.1976F, -0.6554F, -0.6272F);
		cube_r149.cubeList.add(new ModelBox(cube_r149, 143, 491, 2.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r150 = new ModelRenderer(this);
		cube_r150.setRotationPoint(-4.0F, 29.0F, -2.0F);
		armD.addChild(cube_r150);
		setRotationAngle(cube_r150, -2.84F, -1.4532F, 2.5753F);
		cube_r150.cubeList.add(new ModelBox(cube_r150, 91, 491, -5.703F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r150.cubeList.add(new ModelBox(cube_r150, 190, 412, -3.703F, -35.9972F, -4.0809F, 10, 34, 10, -4.0F));

		cube_r151 = new ModelRenderer(this);
		cube_r151.setRotationPoint(-4.0F, 29.0F, -2.0F);
		armD.addChild(cube_r151);
		setRotationAngle(cube_r151, -1.6946F, -0.9911F, 2.0676F);
		cube_r151.cubeList.add(new ModelBox(cube_r151, 379, 87, -12.8654F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r151.cubeList.add(new ModelBox(cube_r151, 0, 424, -7.8654F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r152 = new ModelRenderer(this);
		cube_r152.setRotationPoint(-7.0F, 20.0F, -2.0F);
		armD.addChild(cube_r152);
		setRotationAngle(cube_r152, -1.0086F, 0.6372F, 0.1522F);
		cube_r152.cubeList.add(new ModelBox(cube_r152, 498, 441, -22.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r153 = new ModelRenderer(this);
		cube_r153.setRotationPoint(-7.0F, 20.0F, -2.0F);
		armD.addChild(cube_r153);
		setRotationAngle(cube_r153, -1.1591F, 0.2006F, -0.8874F);
		cube_r153.cubeList.add(new ModelBox(cube_r153, 495, 342, 2.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r154 = new ModelRenderer(this);
		cube_r154.setRotationPoint(-7.0F, 20.0F, -2.0F);
		armD.addChild(cube_r154);
		setRotationAngle(cube_r154, -0.9263F, -0.0836F, 0.1108F);
		cube_r154.cubeList.add(new ModelBox(cube_r154, 495, 321, -5.703F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r154.cubeList.add(new ModelBox(cube_r154, 0, 313, -3.703F, -35.9972F, -4.0809F, 10, 41, 10, -4.0F));

		cube_r155 = new ModelRenderer(this);
		cube_r155.setRotationPoint(-7.0F, 20.0F, -2.0F);
		armD.addChild(cube_r155);
		setRotationAngle(cube_r155, -0.2798F, 0.0495F, 0.5724F);
		cube_r155.cubeList.add(new ModelBox(cube_r155, 379, 138, -12.8654F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r155.cubeList.add(new ModelBox(cube_r155, 40, 424, -7.8654F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r156 = new ModelRenderer(this);
		cube_r156.setRotationPoint(-7.0F, 20.0F, -2.0F);
		armD.addChild(cube_r156);
		setRotationAngle(cube_r156, -1.9079F, -0.3616F, -0.3493F);
		cube_r156.cubeList.add(new ModelBox(cube_r156, 55, 64, 6.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r157 = new ModelRenderer(this);
		cube_r157.setRotationPoint(-7.0F, 20.0F, -2.0F);
		armD.addChild(cube_r157);
		setRotationAngle(cube_r157, -1.8878F, 0.1124F, 0.2264F);
		cube_r157.cubeList.add(new ModelBox(cube_r157, 0, 172, -13.3985F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r158 = new ModelRenderer(this);
		cube_r158.setRotationPoint(-7.0F, 20.0F, -2.0F);
		armD.addChild(cube_r158);
		setRotationAngle(cube_r158, -1.6628F, 0.6068F, -0.1521F);
		cube_r158.cubeList.add(new ModelBox(cube_r158, 110, 248, -25.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r159 = new ModelRenderer(this);
		cube_r159.setRotationPoint(-7.0F, 20.0F, -2.0F);
		armD.addChild(cube_r159);
		setRotationAngle(cube_r159, -1.8829F, 0.1259F, 0.2682F);
		cube_r159.cubeList.add(new ModelBox(cube_r159, 461, 464, -10.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r160 = new ModelRenderer(this);
		cube_r160.setRotationPoint(-7.0F, 9.0F, -2.0F);
		armD.addChild(cube_r160);
		setRotationAngle(cube_r160, -0.5857F, 0.1624F, 0.2264F);
		cube_r160.cubeList.add(new ModelBox(cube_r160, 503, 21, -22.1601F, -29.7911F, -11.6643F, 13, 8, 13, -4.0F));

		cube_r161 = new ModelRenderer(this);
		cube_r161.setRotationPoint(-7.0F, 9.0F, -2.0F);
		armD.addChild(cube_r161);
		setRotationAngle(cube_r161, -0.5375F, 0.309F, -0.8229F);
		cube_r161.cubeList.add(new ModelBox(cube_r161, 501, 462, 2.4192F, -33.837F, -5.0282F, 13, 8, 13, -4.0F));

		cube_r162 = new ModelRenderer(this);
		cube_r162.setRotationPoint(-7.0F, 9.0F, -2.0F);
		armD.addChild(cube_r162);
		setRotationAngle(cube_r162, -0.4332F, -0.4729F, -0.1271F);
		cube_r162.cubeList.add(new ModelBox(cube_r162, 51, 499, -5.703F, -34.9972F, -6.0809F, 13, 8, 13, -4.0F));
		cube_r162.cubeList.add(new ModelBox(cube_r162, 160, 310, -3.703F, -35.9972F, -4.0809F, 10, 44, 10, -4.0F));

		cube_r163 = new ModelRenderer(this);
		cube_r163.setRotationPoint(-7.0F, 9.0F, -2.0F);
		armD.addChild(cube_r163);
		setRotationAngle(cube_r163, -0.0426F, -0.517F, 0.4176F);
		cube_r163.cubeList.add(new ModelBox(cube_r163, 379, 189, -12.8654F, -30.7246F, -0.1957F, 17, 8, 15, -4.0F));
		cube_r163.cubeList.add(new ModelBox(cube_r163, 80, 425, -7.8654F, -31.7246F, 2.8043F, 10, 28, 10, -4.0F));

		cube_r164 = new ModelRenderer(this);
		cube_r164.setRotationPoint(-7.0F, 9.0F, -2.0F);
		armD.addChild(cube_r164);
		setRotationAngle(cube_r164, -1.2485F, -0.456F, -0.7173F);
		cube_r164.cubeList.add(new ModelBox(cube_r164, 0, 85, 6.5329F, -30.158F, -27.818F, 17, 8, 21, -4.0F));

		cube_r165 = new ModelRenderer(this);
		cube_r165.setRotationPoint(-7.0F, 9.0F, -2.0F);
		armD.addChild(cube_r165);
		setRotationAngle(cube_r165, -1.4791F, -0.3467F, 0.0794F);
		cube_r165.cubeList.add(new ModelBox(cube_r165, 55, 180, -13.3985F, -33.03F, -28.4669F, 17, 8, 21, -4.0F));

		cube_r166 = new ModelRenderer(this);
		cube_r166.setRotationPoint(-7.0F, 9.0F, -2.0F);
		armD.addChild(cube_r166);
		setRotationAngle(cube_r166, -1.1108F, 0.2518F, -0.0109F);
		cube_r166.cubeList.add(new ModelBox(cube_r166, 163, 256, -25.4773F, -32.3752F, -20.2564F, 17, 8, 19, -4.0F));

		cube_r167 = new ModelRenderer(this);
		cube_r167.setRotationPoint(-7.0F, 9.0F, -2.0F);
		armD.addChild(cube_r167);
		setRotationAngle(cube_r167, -1.4949F, -0.3504F, 0.1256F);
		cube_r167.cubeList.add(new ModelBox(cube_r167, 465, 356, -10.4045F, -34.03F, -23.5254F, 10, 24, 10, -4.0F));

		cube_r168 = new ModelRenderer(this);
		cube_r168.setRotationPoint(-8.0F, 26.0F, 1.0F);
		armD.addChild(cube_r168);
		setRotationAngle(cube_r168, -0.287F, -0.0316F, 0.1698F);
		cube_r168.cubeList.add(new ModelBox(cube_r168, 126, 562, -4.9911F, -3.9123F, -5.2293F, 9, 18, 9, -4.0F));

		cube_r169 = new ModelRenderer(this);
		cube_r169.setRotationPoint(-4.0F, 26.0F, 1.0F);
		armD.addChild(cube_r169);
		setRotationAngle(cube_r169, -0.0097F, -0.072F, 0.5251F);
		cube_r169.cubeList.add(new ModelBox(cube_r169, 537, 556, -4.9779F, -3.7298F, -4.9609F, 9, 19, 9, -4.0F));

		cube_r170 = new ModelRenderer(this);
		cube_r170.setRotationPoint(-4.0F, 26.0F, -2.0F);
		armD.addChild(cube_r170);
		setRotationAngle(cube_r170, 0.321F, -0.071F, 0.1752F);
		cube_r170.cubeList.add(new ModelBox(cube_r170, 563, 405, -4.773F, -4.6558F, -4.9688F, 9, 18, 9, -4.0F));

		cube_r171 = new ModelRenderer(this);
		cube_r171.setRotationPoint(-8.0F, 26.0F, -2.0F);
		armD.addChild(cube_r171);
		setRotationAngle(cube_r171, 0.0232F, -0.0031F, -0.2059F);
		cube_r171.cubeList.add(new ModelBox(cube_r171, 162, 565, -4.7734F, -4.7054F, -5.0F, 9, 18, 9, -4.0F));

		cube_r172 = new ModelRenderer(this);
		cube_r172.setRotationPoint(-8.0F, 34.0F, 0.0F);
		armD.addChild(cube_r172);
		setRotationAngle(cube_r172, 0.0F, 0.0F, 0.2182F);
		cube_r172.cubeList.add(new ModelBox(cube_r172, 313, 402, -5.505F, -16.5158F, -7.0F, 11, 30, 11, -5.0F));

		cube_r173 = new ModelRenderer(this);
		cube_r173.setRotationPoint(-8.0F, 34.0F, 0.0F);
		armD.addChild(cube_r173);
		setRotationAngle(cube_r173, 0.0F, 0.0F, -0.3491F);
		cube_r173.cubeList.add(new ModelBox(cube_r173, 257, 557, -12.505F, 20.4842F, -7.0F, 10, 17, 9, -4.0F));

		cube_r174 = new ModelRenderer(this);
		cube_r174.setRotationPoint(-12.0F, 34.0F, 0.0F);
		armD.addChild(cube_r174);
		setRotationAngle(cube_r174, -0.1745F, 0.0F, 0.0F);
		cube_r174.cubeList.add(new ModelBox(cube_r174, 569, 275, -2.505F, 33.4842F, -1.0F, 9, 16, 9, -4.0F));
		cube_r174.cubeList.add(new ModelBox(cube_r174, 573, 556, -0.505F, 33.4842F, -1.0F, 9, 16, 9, -4.0F));
		cube_r174.cubeList.add(new ModelBox(cube_r174, 331, 578, 1.495F, 33.4842F, -1.0F, 9, 16, 9, -4.0F));

		cube_r175 = new ModelRenderer(this);
		cube_r175.setRotationPoint(-12.0F, 34.0F, 0.0F);
		armD.addChild(cube_r175);
		setRotationAngle(cube_r175, 0.0436F, 0.0F, 0.0F);
		cube_r175.cubeList.add(new ModelBox(cube_r175, 573, 300, -2.505F, 39.4842F, -11.0F, 9, 11, 9, -4.0F));
		cube_r175.cubeList.add(new ModelBox(cube_r175, 221, 547, -0.505F, 39.4842F, -11.0F, 9, 14, 9, -4.0F));
		cube_r175.cubeList.add(new ModelBox(cube_r175, 428, 557, 1.495F, 39.4842F, -11.0F, 9, 16, 9, -4.0F));

		cube_r176 = new ModelRenderer(this);
		cube_r176.setRotationPoint(14.0F, 108.0F, 0.0F);
		armD.addChild(cube_r176);
		setRotationAngle(cube_r176, 0.0F, 0.0F, 0.2182F);
		cube_r176.cubeList.add(new ModelBox(cube_r176, 231, 289, -44.0F, -108.0F, -7.0F, 13, 37, 12, -4.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		head.render(f5);
		legs.render(f5);
		arms.render(f5);
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
		this.legG.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.legD.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.armG.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.armD.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
	}
}