package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelRohanWerewolf extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer tail;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer legs;
	private final ModelRenderer legG;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer legD;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer arms;
	private final ModelRenderer armG;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer armD;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer head;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer maw;
	private final ModelRenderer cube_r25;

	public DRModelRohanWerewolf() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 7.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 63, 22, -3.0F, -17.0F, -9.0F, 6, 4, 6, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.48F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -5.0F, -5.2224F, -3.3937F, 12, 6, 11, -6.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 17, -7.0F, -5.2224F, -3.3937F, 12, 6, 11, -6.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 7, -6.0F, -5.2224F, -2.3937F, 12, 5, 10, -6.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 34, -6.0F, -8.2224F, -7.3937F, 12, 9, 9, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 17.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 50, -2.0F, -29.0F, 1.0F, 6, 16, 8, -3.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 52, -4.0F, -29.0F, 1.0F, 6, 16, 8, -3.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 25, -3.0F, -29.0F, 1.0F, 6, 16, 9, -3.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 66, -4.0F, -26.0F, -1.0F, 8, 10, 6, 0.0F));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, -1.0F, 2.0F);
		body.addChild(tail);


		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 5.0F, 12.0F);
		tail.addChild(cube_r3);
		setRotationAngle(cube_r3, 2.4013F, -0.0085F, 0.0077F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 102, -2.0842F, -0.8885F, -1.9638F, 4, 6, 2, -1.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 25, 99, -2.0842F, -0.8885F, 0.0362F, 4, 6, 2, -1.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 84, -1.0842F, -0.8885F, -1.9638F, 2, 9, 4, -1.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 62, -2.0842F, -0.8885F, -1.9638F, 2, 6, 4, -1.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 93, -0.0842F, -0.8885F, -1.9638F, 2, 6, 4, -1.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 7.0F, 8.0F);
		tail.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.965F, -0.0085F, 0.0077F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 34, -1.0655F, -0.4272F, -0.6535F, 2, 6, 2, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 4.0F, 3.0F);
		tail.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.0487F, -0.0085F, 0.0077F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 86, -2.0F, -0.5976F, -0.7604F, 4, 7, 3, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 1.0F, 1.0F);
		tail.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6545F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, -4.0F, -1.0F, 2, 8, 2, 0.0F));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		legG = new ModelRenderer(this);
		legG.setRotationPoint(4.0F, -15.0F, 0.0F);
		legs.addChild(legG);
		legG.cubeList.add(new ModelBox(legG, 63, 0, -1.0F, 14.0F, -3.0F, 2, 1, 4, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.0F, 9.0F, 1.0F);
		legG.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3491F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 34, 3.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.0F, -2.0F, 0.0F);
		legG.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.8727F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 52, 2.0F, 4.0F, 4.0F, 4, 1, 4, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 83, 75, 2.0F, 5.0F, 4.0F, 4, 2, 7, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 79, 2.0F, -1.0F, -1.0F, 4, 9, 5, 0.0F));

		legD = new ModelRenderer(this);
		legD.setRotationPoint(-4.0F, -15.0F, 0.0F);
		legs.addChild(legD);
		legD.cubeList.add(new ModelBox(legD, 54, 53, -1.0F, 14.0F, -3.0F, 2, 1, 4, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(4.0F, 9.0F, 1.0F);
		legD.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 17, -5.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.0F, -2.0F, 0.0F);
		legD.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.8727F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 35, 22, -6.0F, 4.0F, 4.0F, 4, 1, 4, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 83, 0, -6.0F, 5.0F, 4.0F, 4, 2, 7, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 76, -6.0F, -1.0F, -1.0F, 4, 9, 5, 0.0F));

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		armG = new ModelRenderer(this);
		armG.setRotationPoint(8.0F, -30.0F, -4.0F);
		arms.addChild(armG);
		armG.cubeList.add(new ModelBox(armG, 63, 82, -2.0F, -2.0F, -3.0F, 4, 5, 6, 0.0F));
		armG.cubeList.add(new ModelBox(armG, 49, 0, 1.0F, 15.0F, -4.0F, 4, 4, 3, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 1.0F, 0.0F);
		armG.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3491F, 0.0F, -0.0436F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 91, 47, 1.0F, 7.0F, 1.0F, 3, 8, 3, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 1.0F, 0.0F);
		armG.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.4363F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 85, 28, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.0F, 19.0F, -3.0F);
		armG.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.7854F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 7, 0.0F, -1.0F, -1.0F, 1, 3, 1, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(4.0F, 19.0F, -3.0F);
		armG.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.2182F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 32, -2.0F, -1.0F, -1.0F, 1, 7, 1, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(4.0F, 19.0F, -3.0F);
		armG.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.3927F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 72, 42, -3.0F, -1.0F, -1.0F, 1, 5, 1, 0.0F));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 74, 10, -1.0F, -1.0F, -1.0F, 1, 5, 1, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(4.0F, 19.0F, -3.0F);
		armG.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0387F, 0.0201F, -0.4796F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 74, 4, -3.0F, -2.0F, 1.0F, 1, 4, 1, 0.0F));

		armD = new ModelRenderer(this);
		armD.setRotationPoint(-8.0F, -30.0F, -4.0F);
		arms.addChild(armD);
		armD.cubeList.add(new ModelBox(armD, 80, 10, -2.0F, -2.0F, -3.0F, 4, 5, 6, 0.0F));
		armD.cubeList.add(new ModelBox(armD, 35, 0, -5.0F, 15.0F, -4.0F, 4, 4, 3, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 1.0F, 0.0F);
		armD.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.3491F, 0.0F, 0.0436F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 90, -4.0F, 7.0F, 1.0F, 3, 8, 3, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 1.0F, 0.0F);
		armD.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.4363F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 83, 84, -2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.0F, 19.0F, -3.0F);
		armD.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.7854F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 7, 24, -1.0F, -1.0F, -1.0F, 1, 3, 1, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-4.0F, 19.0F, -3.0F);
		armD.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 28, 57, 1.0F, -1.0F, -1.0F, 1, 7, 1, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-4.0F, 19.0F, -3.0F);
		armD.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 62, 66, 2.0F, -1.0F, -1.0F, 1, 5, 1, 0.0F));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 70, 10, 0.0F, -1.0F, -1.0F, 1, 5, 1, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-4.0F, 19.0F, -3.0F);
		armD.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0387F, -0.0201F, 0.4796F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 66, 53, 2.0F, -2.0F, 1.0F, 1, 4, 1, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.0F, -5.0F);
		head.cubeList.add(new ModelBox(head, 62, 50, -4.0F, -7.0F, -7.0F, 8, 8, 8, 0.0F));
		head.cubeList.add(new ModelBox(head, 47, 77, -2.0F, -4.0F, -14.0F, 4, 2, 7, 0.0F));
		head.cubeList.add(new ModelBox(head, 32, 74, 1.0F, -2.0F, -15.0F, 2, 1, 9, -1.0F));
		head.cubeList.add(new ModelBox(head, 54, 50, -3.0F, -2.0F, -15.0F, 6, 1, 2, -1.0F));
		head.cubeList.add(new ModelBox(head, 72, 32, -3.0F, -2.0F, -15.0F, 2, 1, 9, -1.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.0F, -6.0F, 0.0F);
		head.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.48F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 52, -1.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(3.0F, -6.0F, 0.0F);
		head.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.48F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 52, -1.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F));

		maw = new ModelRenderer(this);
		maw.setRotationPoint(0.0F, 34.0F, 5.0F);
		head.addChild(maw);
		

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, -33.0F, -12.0F);
		maw.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.3054F, -0.0436F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 70, 0, -3.0F, -2.0F, -7.0F, 2, 1, 9, -1.0F));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 47, 22, -3.0F, -2.0F, -7.0F, 6, 1, 2, -1.0F));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 19, 67, 1.0F, -2.0F, -7.0F, 2, 1, 9, -1.0F));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 72, 42, -2.0F, -1.0F, -6.0F, 4, 1, 7, 0.0F));
	}

	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.body.render(f5);
		this.legs.render(f5);
		this.head.render(f5);
		this.arms.render(f5);
	}

	public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
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