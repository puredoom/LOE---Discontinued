package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelGondorHelmet extends LOTRModelBiped {

	public DRModelGondorHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.0F, -8.1F, -4.0F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.1F, -8.0F, -4.0F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.0F, -8.0F, -3.9F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -3.9F, -8.0F, -4.0F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -4.0F, -8.0F, -4.1F, 8, 1, 8, 0.5F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 6, 46, 0.5F, -3.5F, -6.7F, 2, 7, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 42, 0, 0.5F, 3.5F, -6.7F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 46, -2.5F, -3.5F, -6.7F, 2, 7, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 15, 15, -1.5F, 3.5F, -6.7F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 9, 3.5F, -6.5F, -4.5F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 9, 3.6F, -6.5F, -4.4F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 42, 47, 3.5F, -0.5F, 1.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 42, 47, 3.6F, -0.5F, 1.6F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 45, 43, -4.5F, -0.5F, 1.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 45, 43, -4.6F, -0.5F, 1.6F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 22, 16, -3.5F, -6.5F, 3.5F, 7, 7, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 5, -2.5F, 0.5F, 3.5F, 5, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 22, 16, -3.5F, -6.5F, 3.6F, 7, 7, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 5, -2.5F, 0.5F, 3.6F, 5, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 15, -4.5F, -6.5F, -4.5F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 9, 3.5F, -6.5F, -4.6F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 15, -4.5F, -6.5F, -4.6F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 15, -4.6F, -6.5F, -4.4F, 1, 6, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 33, 5, -4.5F, -0.5F, -4.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 33, 5, -4.6F, -0.5F, -4.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 31, 24, 3.5F, -0.5F, -4.5F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 31, 24, 3.6F, -0.5F, -4.5F, 1, 1, 3, 0.0F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2034F, 0.0794F, 0.3671F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 33, 8.5632F, -5.0611F, -1.0F, 3, 3, 2, -1.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 44, 7.9213F, -6.062F, -1.0F, 4, 3, 2, -1.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2181F, 0.0057F, 0.0256F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 8, 8.0529F, -2.9957F, -1.0F, 5, 3, 2, -1.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 30, 6.8439F, -10.9668F, -1.0F, 6, 8, 2, -1.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 3, 7.0009F, -4.9689F, -1.0F, 6, 3, 2, -1.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 40, 8.0268F, -3.9954F, -1.0F, 5, 4, 2, -1.0F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.2054F, 0.0741F, 0.3414F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 49, -2.3004F, -24.1055F, -1.0F, 1, 4, 2, -1.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.3086F, -23.3804F, -1.0F, 1, 6, 2, -1.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 44, -0.3167F, -22.6553F, -1.0F, 1, 8, 2, -1.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1104F, -0.1886F, -1.0367F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 0, 14.6099F, -3.9699F, -1.0F, 7, 3, 2, -1.0F));

		ModelRenderer cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1415F, -0.1666F, -0.8608F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 16, 13.7356F, -6.4645F, -1.0F, 7, 3, 2, -1.0F));

		ModelRenderer cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1682F, -0.1396F, -0.6863F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 22, 12.4414F, -8.7694F, -1.0F, 7, 3, 2, -1.0F));

		ModelRenderer cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1897F, -0.1084F, -0.5133F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 39, 10.7667F, -10.8146F, -1.0F, 7, 3, 2, -1.0F));

		ModelRenderer cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.2054F, -0.0741F, -0.3414F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 28, 9.6853F, -12.9045F, -1.0F, 6, 9, 2, -1.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 50, 38, 9.6853F, -11.9045F, -0.5F, 1, 7, 1, 0.0F));

		ModelRenderer cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1983F, -0.0916F, -0.4272F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 49, 8.5379F, -1.0327F, -0.5F, 1, 7, 1, 0.0F));

		ModelRenderer cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1555F, -0.1536F, -0.7734F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 15, 9.3995F, -1.5F, -0.5F, 2, 2, 1, 0.0F));

		ModelRenderer cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1104F, 0.1886F, 1.0367F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 0, -21.6099F, -3.9699F, -1.0F, 7, 3, 2, -1.0F));

		ModelRenderer cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.2181F, -0.0057F, -0.0256F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 42, 8, -13.0529F, -2.9957F, -1.0F, 5, 3, 2, -1.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 40, -13.0268F, -3.9954F, -1.0F, 5, 4, 2, -1.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 3, -13.0009F, -4.9689F, -1.0F, 6, 3, 2, -1.0F));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 30, -12.8439F, -10.9668F, -1.0F, 6, 8, 2, -1.0F));

		ModelRenderer HatLayer_r1 = new ModelRenderer(this);
		HatLayer_r1.setRotationPoint(-0.7F, -7.0F, -5.0F);
		this.bipedHead.addChild(HatLayer_r1);
		setRotationAngle(HatLayer_r1, -0.3491F, 0.0F, 0.0F);
		HatLayer_r1.cubeList.add(new ModelBox(HatLayer_r1, 50, 47, 0.2F, -0.4F, 0.5F, 1, 4, 1, 0.0F));

		ModelRenderer cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1415F, 0.1666F, 0.8608F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 16, -20.7356F, -6.4645F, -1.0F, 7, 3, 2, -1.0F));

		ModelRenderer cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.2182F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 46, 5.0F, -21.5F, -0.5F, 1, 7, 1, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 51, 7.3F, -8.5F, -0.5F, 1, 4, 1, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 46, -1.0F, -21.5F, -0.5F, 1, 7, 1, 0.0F));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 51, -3.3F, -8.5F, -0.5F, 1, 4, 1, 0.0F));

		ModelRenderer cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.1897F, 0.1084F, 0.5133F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 39, -17.7667F, -10.8146F, -1.0F, 7, 3, 2, -1.0F));

		ModelRenderer cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1682F, 0.1396F, 0.6863F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 36, 22, -19.4414F, -8.7694F, -1.0F, 7, 3, 2, -1.0F));

		ModelRenderer cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.2034F, -0.0794F, -0.3671F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 45, 33, -11.5632F, -5.0611F, -1.0F, 3, 3, 2, -1.0F));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 44, -11.9213F, -6.062F, -1.0F, 4, 3, 2, -1.0F));

		ModelRenderer cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.2054F, 0.0741F, 0.3414F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 29, 28, -15.6853F, -12.9045F, -1.0F, 6, 9, 2, -1.0F));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 50, 38, -10.6853F, -11.9045F, -0.5F, 1, 7, 1, 0.0F));

		ModelRenderer cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.1983F, 0.0916F, 0.4272F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 49, -9.5379F, -1.0327F, -0.5F, 1, 7, 1, 0.0F));

		ModelRenderer cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.2054F, -0.0741F, -0.3414F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 12, 49, 1.3004F, -24.1055F, -1.0F, 1, 4, 2, -1.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, 0.3086F, -23.3804F, -1.0F, 1, 6, 2, -1.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 44, -0.6833F, -22.6553F, -1.0F, 1, 8, 2, -1.0F));

		ModelRenderer cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(2.5F, -0.8F, -1.6F);
		this.bipedHead.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.1555F, 0.1536F, 0.7734F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 15, -11.3995F, -1.5F, -0.5F, 2, 2, 1, 0.0F));

		ModelRenderer HatLayer_r2 = new ModelRenderer(this);
		HatLayer_r2.setRotationPoint(-2.0F, 0.0F, -7.0F);
		this.bipedHead.addChild(HatLayer_r2);
		setRotationAngle(HatLayer_r2, 0.0F, 0.829F, 0.0F);
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 4, 0, -1.5F, 1.5F, -0.1F, 1, 1, 1, 0.0F));
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 19, 9, -2.5F, -4.5F, -0.1F, 1, 1, 1, 0.0F));
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 11, 15, -3.5F, -5.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r2.cubeList.add(new ModelBox(HatLayer_r2, 0, 9, -3.5F, -3.5F, -0.1F, 3, 5, 1, 0.0F));

		ModelRenderer HatLayer_r3 = new ModelRenderer(this);
		HatLayer_r3.setRotationPoint(-0.7F, -7.0F, -4.9F);
		this.bipedHead.addChild(HatLayer_r3);
		setRotationAngle(HatLayer_r3, -0.3381F, -0.0886F, -0.2467F);
		HatLayer_r3.cubeList.add(new ModelBox(HatLayer_r3, 46, 51, -0.5F, -0.4F, 0.5F, 1, 3, 1, 0.0F));

		ModelRenderer HatLayer_r4 = new ModelRenderer(this);
		HatLayer_r4.setRotationPoint(0.7F, -7.0F, -4.9F);
		this.bipedHead.addChild(HatLayer_r4);
		setRotationAngle(HatLayer_r4, -0.3381F, 0.0886F, 0.2467F);
		HatLayer_r4.cubeList.add(new ModelBox(HatLayer_r4, 30, 52, -0.5F, -0.4F, 0.5F, 1, 3, 1, 0.0F));

		ModelRenderer HatLayer_r5 = new ModelRenderer(this);
		HatLayer_r5.setRotationPoint(2.0F, 0.0F, -7.0F);
		this.bipedHead.addChild(HatLayer_r5);
		setRotationAngle(HatLayer_r5, 0.0F, -0.829F, 0.0F);
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 42, 13, 2.5F, -5.5F, -0.1F, 1, 2, 1, 0.0F));
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 14, 30, 1.5F, -4.5F, -0.1F, 1, 1, 1, 0.0F));
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 30, 46, 0.5F, -3.5F, -0.1F, 3, 5, 1, 0.0F));
		HatLayer_r5.cubeList.add(new ModelBox(HatLayer_r5, 16, 37, 0.5F, 1.5F, -0.1F, 1, 1, 1, 0.0F));

		ModelRenderer HatLayer_r6 = new ModelRenderer(this);
		HatLayer_r6.setRotationPoint(0.0F, -9.0F, -4.8F);
		this.bipedHead.addChild(HatLayer_r6);
		setRotationAngle(HatLayer_r6, -0.2449F, 0.4677F, -0.1122F);
		HatLayer_r6.cubeList.add(new ModelBox(HatLayer_r6, 45, 27, -4.861F, -2.5F, -1.8852F, 3, 4, 2, -1.0F));

		ModelRenderer HatLayer_r7 = new ModelRenderer(this);
		HatLayer_r7.setRotationPoint(0.0F, -9.0F, -4.8F);
		this.bipedHead.addChild(HatLayer_r7);
		setRotationAngle(HatLayer_r7, -0.2449F, -0.4677F, 0.1122F);
		HatLayer_r7.cubeList.add(new ModelBox(HatLayer_r7, 11, 9, 1.861F, -2.5F, -1.8852F, 3, 4, 2, -1.0F));

		ModelRenderer HatLayer_r8 = new ModelRenderer(this);
		HatLayer_r8.setRotationPoint(0.0F, -9.0F, -4.8F);
		this.bipedHead.addChild(HatLayer_r8);
		setRotationAngle(HatLayer_r8, -0.2182F, 0.0F, 0.0F);
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 0, 24, -1.5F, -11.5F, -0.5F, 3, 4, 2, -1.0F));
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 16, 30, -2.0F, -9.5F, -0.5F, 4, 5, 2, -1.0F));
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 32, 39, -3.0F, -6.5F, -0.5F, 6, 5, 2, -1.0F));
		HatLayer_r8.cubeList.add(new ModelBox(HatLayer_r8, 22, 9, -4.0F, -3.5F, -0.5F, 8, 5, 2, -1.0F));
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