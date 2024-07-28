package drealm.model;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelRhunHelmet extends LOTRModelBiped {

	public DRModelRhunHelmet() {
		textureWidth = 128;
		textureHeight = 128;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 0, -4.5F, -6.0F, 4.3F, 9, 8, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 14, 9, -5.3F, -6.75F, -3.0F, 1, 1, 6, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 43, 21, -5.65F, -6.85F, -2.5F, 1, 1, 5, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, 4.0F, -6.0F, -4.2F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 43, 21, 4.65F, -6.85F, -2.5F, 1, 1, 5, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 14, 9, 4.3F, -6.75F, -3.0F, 1, 1, 6, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 55, 48, -2.5F, -6.75F, 4.55F, 5, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 15, -5.0F, 0.0F, -1.2F, 1, 1, 6, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -5.0F, -6.0F, -4.2F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 15, 4.0F, 0.0F, -1.2F, 1, 1, 6, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 8, 15, -4.0F, -3.25F, -4.75F, 2, 2, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 55, 50, -2.5F, -3.0F, -5.25F, 2, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 4, 0, -4.0F, -5.25F, -4.75F, 1, 2, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 50, 23, -2.0F, 0.0F, -5.25F, 4, 1, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 4, 0, 3.0F, -5.25F, -4.75F, 1, 2, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 8, 15, 2.0F, -3.25F, -4.75F, 2, 2, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 55, 50, 0.5F, -3.0F, -5.25F, 2, 3, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 41, 0, -3.0F, -4.0F, -5.25F, 6, 1, 2, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 4, 14, 0.0F, -11.6F, -8.0F, 0, 3, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 56, -0.5F, -6.0F, -6.0F, 1, 2, 2, 0.0F));

		ModelRenderer hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, 1.0472F, 0.7854F, 0.0F);
		hexadecagon_r1.cubeList.add(new ModelBox(hexadecagon_r1, 27, 25, -0.4973F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 1.0472F, -0.7854F, 0.0F);
		hexadecagon_r2.cubeList.add(new ModelBox(hexadecagon_r2, 41, 9, -0.4973F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, -1.0472F, -0.7854F, 0.0F);
		hexadecagon_r3.cubeList.add(new ModelBox(hexadecagon_r3, 36, 0, -0.4973F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, -1.0472F, 0.3927F, 0.0F);
		hexadecagon_r4.cubeList.add(new ModelBox(hexadecagon_r4, 21, 37, -0.4973F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, -0.3444F, 0.1925F, -1.0808F);
		hexadecagon_r5.cubeList.add(new ModelBox(hexadecagon_r5, 54, 26, -0.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.0F, 0.0F, -1.0472F);
		hexadecagon_r6.cubeList.add(new ModelBox(hexadecagon_r6, 50, 13, -0.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, 0.3444F, -0.1925F, -1.0808F);
		hexadecagon_r7.cubeList.add(new ModelBox(hexadecagon_r7, 16, 49, -0.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));
		hexadecagon_r7.cubeList.add(new ModelBox(hexadecagon_r7, 0, 0, -0.5F, -0.6F, 0.5027F, 4, 1, 0, 0.0F));

		ModelRenderer hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.1733F, -0.3542F, -0.4674F);
		hexadecagon_r8.cubeList.add(new ModelBox(hexadecagon_r8, 55, 36, 2.5F, -3.6F, 0.5027F, 6, 2, 0, 0.0F));

		ModelRenderer hexadecagon_r9 = new ModelRenderer(this);
		hexadecagon_r9.setRotationPoint(1.0F, -12.9F, 1.0F);
		this.bipedHead.addChild(hexadecagon_r9);
		setRotationAngle(hexadecagon_r9, 0.054F, -0.3892F, -0.1415F);
		hexadecagon_r9.cubeList.add(new ModelBox(hexadecagon_r9, 55, 0, 0.048F, -1.4333F, -0.0385F, 6, 2, 0, 0.0F));
		hexadecagon_r9.cubeList.add(new ModelBox(hexadecagon_r9, 9, 62, 5.048F, -4.9333F, -0.0385F, 1, 6, 0, 0.0F));

		ModelRenderer hexadecagon_r10 = new ModelRenderer(this);
		hexadecagon_r10.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r10);
		setRotationAngle(hexadecagon_r10, -1.0472F, 0.7854F, 0.0F);
		hexadecagon_r10.cubeList.add(new ModelBox(hexadecagon_r10, 36, 0, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r11 = new ModelRenderer(this);
		hexadecagon_r11.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r11);
		setRotationAngle(hexadecagon_r11, -1.0472F, 0.0F, 0.0F);
		hexadecagon_r11.cubeList.add(new ModelBox(hexadecagon_r11, 36, 0, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r12 = new ModelRenderer(this);
		hexadecagon_r12.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r12);
		setRotationAngle(hexadecagon_r12, 1.0472F, -0.3927F, 0.0F);
		hexadecagon_r12.cubeList.add(new ModelBox(hexadecagon_r12, 49, 1, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r13 = new ModelRenderer(this);
		hexadecagon_r13.setRotationPoint(-1.0F, -12.9F, 1.0F);
		this.bipedHead.addChild(hexadecagon_r13);
		setRotationAngle(hexadecagon_r13, 0.054F, 0.3892F, 0.1415F);
		hexadecagon_r13.cubeList.add(new ModelBox(hexadecagon_r13, 9, 62, -6.048F, -4.9333F, -0.0385F, 1, 6, 0, 0.0F));
		hexadecagon_r13.cubeList.add(new ModelBox(hexadecagon_r13, 55, 0, -6.048F, -1.4333F, -0.0385F, 6, 2, 0, 0.0F));

		ModelRenderer hexadecagon_r14 = new ModelRenderer(this);
		hexadecagon_r14.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r14);
		setRotationAngle(hexadecagon_r14, 0.0F, 0.0F, 1.0472F);
		hexadecagon_r14.cubeList.add(new ModelBox(hexadecagon_r14, 50, 13, -2.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r15 = new ModelRenderer(this);
		hexadecagon_r15.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r15);
		setRotationAngle(hexadecagon_r15, -0.3444F, -0.1925F, 1.0808F);
		hexadecagon_r15.cubeList.add(new ModelBox(hexadecagon_r15, 54, 26, -2.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r16 = new ModelRenderer(this);
		hexadecagon_r16.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r16);
		setRotationAngle(hexadecagon_r16, 1.0472F, 0.6545F, 0.0F);
		hexadecagon_r16.cubeList.add(new ModelBox(hexadecagon_r16, 14, 16, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r17 = new ModelRenderer(this);
		hexadecagon_r17.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r17);
		setRotationAngle(hexadecagon_r17, 1.0472F, 0.2618F, 0.0F);
		hexadecagon_r17.cubeList.add(new ModelBox(hexadecagon_r17, 16, 28, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r18 = new ModelRenderer(this);
		hexadecagon_r18.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r18);
		setRotationAngle(hexadecagon_r18, 1.0234F, 0.3819F, -0.0751F);
		hexadecagon_r18.cubeList.add(new ModelBox(hexadecagon_r18, 16, 28, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r19 = new ModelRenderer(this);
		hexadecagon_r19.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r19);
		setRotationAngle(hexadecagon_r19, 1.0472F, -0.1309F, 0.0F);
		hexadecagon_r19.cubeList.add(new ModelBox(hexadecagon_r19, 49, 1, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r20 = new ModelRenderer(this);
		hexadecagon_r20.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r20);
		setRotationAngle(hexadecagon_r20, -1.0472F, -0.5236F, 0.0F);
		hexadecagon_r20.cubeList.add(new ModelBox(hexadecagon_r20, 33, 15, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r21 = new ModelRenderer(this);
		hexadecagon_r21.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r21);
		setRotationAngle(hexadecagon_r21, -0.228F, 0.1298F, -1.0621F);
		hexadecagon_r21.cubeList.add(new ModelBox(hexadecagon_r21, 37, 48, -0.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r22 = new ModelRenderer(this);
		hexadecagon_r22.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r22);
		setRotationAngle(hexadecagon_r22, 0.1135F, -0.0653F, -1.0509F);
		hexadecagon_r22.cubeList.add(new ModelBox(hexadecagon_r22, 48, 37, -0.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r23 = new ModelRenderer(this);
		hexadecagon_r23.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r23);
		setRotationAngle(hexadecagon_r23, 0.4636F, -0.2527F, -1.1071F);
		hexadecagon_r23.cubeList.add(new ModelBox(hexadecagon_r23, 49, 3, -0.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r24 = new ModelRenderer(this);
		hexadecagon_r24.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r24);
		setRotationAngle(hexadecagon_r24, -0.4636F, -0.2527F, 1.1071F);
		hexadecagon_r24.cubeList.add(new ModelBox(hexadecagon_r24, 8, 49, -2.5F, -1.6F, -0.5027F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r25 = new ModelRenderer(this);
		hexadecagon_r25.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r25);
		setRotationAngle(hexadecagon_r25, -0.1135F, -0.0653F, 1.0509F);
		hexadecagon_r25.cubeList.add(new ModelBox(hexadecagon_r25, 0, 46, -2.5F, -1.6F, -0.5027F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r26 = new ModelRenderer(this);
		hexadecagon_r26.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r26);
		setRotationAngle(hexadecagon_r26, 0.228F, 0.1298F, 1.0621F);
		hexadecagon_r26.cubeList.add(new ModelBox(hexadecagon_r26, 46, 27, -2.5F, -1.6F, -0.5027F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r27 = new ModelRenderer(this);
		hexadecagon_r27.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r27);
		setRotationAngle(hexadecagon_r27, 1.0472F, -0.5236F, 0.0F);
		hexadecagon_r27.cubeList.add(new ModelBox(hexadecagon_r27, 49, 1, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r28 = new ModelRenderer(this);
		hexadecagon_r28.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r28);
		setRotationAngle(hexadecagon_r28, -1.0472F, -0.1309F, 0.0F);
		hexadecagon_r28.cubeList.add(new ModelBox(hexadecagon_r28, 32, 34, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r29 = new ModelRenderer(this);
		hexadecagon_r29.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r29);
		setRotationAngle(hexadecagon_r29, -1.0472F, 0.2618F, 0.0F);
		hexadecagon_r29.cubeList.add(new ModelBox(hexadecagon_r29, 0, 34, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r30 = new ModelRenderer(this);
		hexadecagon_r30.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r30);
		setRotationAngle(hexadecagon_r30, -1.0472F, 0.6545F, 0.0F);
		hexadecagon_r30.cubeList.add(new ModelBox(hexadecagon_r30, 36, 0, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r31 = new ModelRenderer(this);
		hexadecagon_r31.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r31);
		setRotationAngle(hexadecagon_r31, 1.0472F, 0.5236F, 0.0F);
		hexadecagon_r31.cubeList.add(new ModelBox(hexadecagon_r31, 0, 22, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r32 = new ModelRenderer(this);
		hexadecagon_r32.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r32);
		setRotationAngle(hexadecagon_r32, 1.0472F, 0.1309F, 0.0F);
		hexadecagon_r32.cubeList.add(new ModelBox(hexadecagon_r32, 22, 16, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r33 = new ModelRenderer(this);
		hexadecagon_r33.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r33);
		setRotationAngle(hexadecagon_r33, 1.0472F, -0.2618F, 0.0F);
		hexadecagon_r33.cubeList.add(new ModelBox(hexadecagon_r33, 40, 36, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r34 = new ModelRenderer(this);
		hexadecagon_r34.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r34);
		setRotationAngle(hexadecagon_r34, -1.0472F, -0.6545F, 0.0F);
		hexadecagon_r34.cubeList.add(new ModelBox(hexadecagon_r34, 8, 25, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r35 = new ModelRenderer(this);
		hexadecagon_r35.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r35);
		setRotationAngle(hexadecagon_r35, -0.1135F, 0.0653F, -1.0509F);
		hexadecagon_r35.cubeList.add(new ModelBox(hexadecagon_r35, 0, 46, -0.5F, -1.6F, -0.5027F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r36 = new ModelRenderer(this);
		hexadecagon_r36.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r36);
		setRotationAngle(hexadecagon_r36, 0.228F, -0.1298F, -1.0621F);
		hexadecagon_r36.cubeList.add(new ModelBox(hexadecagon_r36, 46, 27, -0.5F, -1.6F, -0.5027F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r37 = new ModelRenderer(this);
		hexadecagon_r37.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r37);
		setRotationAngle(hexadecagon_r37, 0.5865F, -0.3093F, -1.1413F);
		hexadecagon_r37.cubeList.add(new ModelBox(hexadecagon_r37, 29, 46, -0.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r38 = new ModelRenderer(this);
		hexadecagon_r38.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r38);
		setRotationAngle(hexadecagon_r38, -0.5865F, -0.3093F, 1.1413F);
		hexadecagon_r38.cubeList.add(new ModelBox(hexadecagon_r38, 47, 47, -2.5F, -1.6F, -0.5027F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r39 = new ModelRenderer(this);
		hexadecagon_r39.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r39);
		setRotationAngle(hexadecagon_r39, -0.228F, -0.1298F, 1.0621F);
		hexadecagon_r39.cubeList.add(new ModelBox(hexadecagon_r39, 37, 48, -2.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r40 = new ModelRenderer(this);
		hexadecagon_r40.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r40);
		setRotationAngle(hexadecagon_r40, 0.1135F, 0.0653F, 1.0509F);
		hexadecagon_r40.cubeList.add(new ModelBox(hexadecagon_r40, 48, 37, -2.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r41 = new ModelRenderer(this);
		hexadecagon_r41.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r41);
		setRotationAngle(hexadecagon_r41, 1.0472F, -0.6545F, 0.0F);
		hexadecagon_r41.cubeList.add(new ModelBox(hexadecagon_r41, 49, 1, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r42 = new ModelRenderer(this);
		hexadecagon_r42.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r42);
		setRotationAngle(hexadecagon_r42, -1.0472F, -0.2618F, 0.0F);
		hexadecagon_r42.cubeList.add(new ModelBox(hexadecagon_r42, 28, 6, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r43 = new ModelRenderer(this);
		hexadecagon_r43.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r43);
		setRotationAngle(hexadecagon_r43, -1.0252F, -0.3745F, -0.0702F);
		hexadecagon_r43.cubeList.add(new ModelBox(hexadecagon_r43, 28, 6, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r44 = new ModelRenderer(this);
		hexadecagon_r44.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r44);
		setRotationAngle(hexadecagon_r44, -1.0472F, 0.1309F, 0.0F);
		hexadecagon_r44.cubeList.add(new ModelBox(hexadecagon_r44, 0, 34, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer hexadecagon_r45 = new ModelRenderer(this);
		hexadecagon_r45.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r45);
		setRotationAngle(hexadecagon_r45, -1.0472F, 0.5236F, 0.0F);
		hexadecagon_r45.cubeList.add(new ModelBox(hexadecagon_r45, 0, 34, -0.5027F, -1.6F, -2.5F, 1, 9, 3, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.4F, -4.0F, -4.8F);
		this.bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.1745F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 45, -4.5F, -2.0F, -1.0F, 4, 1, 2, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5F, -4.0F, -5.0F);
		this.bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 13, 0.5F, -5.4F, -1.0F, 0, 5, 2, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 58, 0.5F, -8.2F, 0.1F, 0, 5, 3, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 61, 0.5F, -9.2F, 2.1F, 0, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 60, 0.5F, -9.2F, 1.5F, 0, 1, 1, 0.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5F, -4.0F, -5.0F);
		this.bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.0472F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 64, 0.5F, -6.4F, 5.1F, 0, 1, 4, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, -4.6F, -4.9F);
		this.bipedHead.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.4363F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 56, 0.1F, -1.9F, -1.0F, 1, 2, 2, 0.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5F, -4.6F, -4.9F);
		this.bipedHead.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0568F, -0.1671F, 0.7017F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 9, 2.5F, -4.0F, -0.8F, 1, 3, 2, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 55, 3.5F, -0.5F, -0.55F, 2, 3, 2, 0.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, -4.6F, -4.9F);
		this.bipedHead.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0568F, 0.1671F, -0.7017F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 53, 55, -5.5F, -0.5F, -0.55F, 2, 3, 2, 0.0F));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 22, 9, -3.5F, -4.0F, -0.8F, 1, 3, 2, 0.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.4F, -4.0F, -4.8F);
		this.bipedHead.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 45, 0.5F, -2.0F, -1.0F, 4, 1, 2, 0.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, -4.6F, -4.9F);
		this.bipedHead.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.4363F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 56, -1.1F, -1.9F, -1.0F, 1, 2, 2, 0.0F));

		ModelRenderer hexadecagon_r46 = new ModelRenderer(this);
		hexadecagon_r46.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r46);
		setRotationAngle(hexadecagon_r46, 0.3444F, 0.1925F, 1.0808F);
		hexadecagon_r46.cubeList.add(new ModelBox(hexadecagon_r46, 16, 49, -2.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));
		hexadecagon_r46.cubeList.add(new ModelBox(hexadecagon_r46, 0, 0, -3.5F, -0.6F, 0.5027F, 4, 1, 0, 0.0F));

		ModelRenderer hexadecagon_r47 = new ModelRenderer(this);
		hexadecagon_r47.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r47);
		setRotationAngle(hexadecagon_r47, 0.1733F, 0.3542F, 0.4674F);
		hexadecagon_r47.cubeList.add(new ModelBox(hexadecagon_r47, 55, 36, -8.5F, -3.6F, 0.5027F, 6, 2, 0, 0.0F));

		ModelRenderer hexadecagon_r48 = new ModelRenderer(this);
		hexadecagon_r48.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r48);
		setRotationAngle(hexadecagon_r48, -0.4636F, 0.2527F, -1.1071F);
		hexadecagon_r48.cubeList.add(new ModelBox(hexadecagon_r48, 8, 49, -0.5F, -1.6F, -0.5027F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r49 = new ModelRenderer(this);
		hexadecagon_r49.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r49);
		setRotationAngle(hexadecagon_r49, 0.4636F, 0.2527F, 1.1071F);
		hexadecagon_r49.cubeList.add(new ModelBox(hexadecagon_r49, 49, 3, -2.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r50 = new ModelRenderer(this);
		hexadecagon_r50.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r50);
		setRotationAngle(hexadecagon_r50, -0.5865F, 0.3093F, -1.1413F);
		hexadecagon_r50.cubeList.add(new ModelBox(hexadecagon_r50, 47, 47, -0.5F, -1.6F, -0.5027F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r51 = new ModelRenderer(this);
		hexadecagon_r51.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r51);
		setRotationAngle(hexadecagon_r51, 0.5865F, 0.3093F, 1.1413F);
		hexadecagon_r51.cubeList.add(new ModelBox(hexadecagon_r51, 29, 46, -2.5F, -1.6F, -0.4973F, 3, 9, 1, 0.0F));

		ModelRenderer hexadecagon_r52 = new ModelRenderer(this);
		hexadecagon_r52.setRotationPoint(0.0F, -9.9F, 0.0F);
		this.bipedHead.addChild(hexadecagon_r52);
		setRotationAngle(hexadecagon_r52, 1.0472F, 0.0F, 0.0F);
		hexadecagon_r52.cubeList.add(new ModelBox(hexadecagon_r52, 38, 24, -0.5027F, -1.6F, -0.5F, 1, 9, 3, 0.0F));
	}

	public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bipedHead.render(f5);
	}
}
