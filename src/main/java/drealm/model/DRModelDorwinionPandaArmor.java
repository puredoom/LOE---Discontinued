package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelDorwinionPandaArmor extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer selle;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer leftbackleg;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer rightbackleg;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer leftfrontleg;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer rightfrontleg;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer head;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;

	public DRModelDorwinionPandaArmor() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 12.0F, 13.0F);
		body.cubeList.add(new ModelBox(body, 32, 81, -1.1F, -5.0F, 4.9F, 3, 3, 3, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -1.0F, -10.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 3.098F, 0.0F, 3.1416F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 21, -9.0F, -4.0848F, 0.2356F, 18, 11, 7, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -1.0F, -10.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.9671F, 0.0F, -3.1416F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -9.0F, -4.1773F, -7.4031F, 18, 11, 10, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -1.0F, -10.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -2.7925F, 0.0F, 3.1416F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 39, -9.0F, -8.7011F, -14.423F, 18, 10, 7, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -1.0F, -10.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, 0.0F, 3.1416F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 15, -8.0F, -5.0F, -11.0F, 16, 8, 6, 0.0F));

		selle = new ModelRenderer(this);
		selle.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(selle);
		selle.cubeList.add(new ModelBox(selle, 1, 88, -7.0F, -6.5F, -16.0F, 14, 2, 12, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 46, 97, -10.0F, -26.0F, -19.0F, 3, 1, 17, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 46, 97, 7.0F, -26.0F, -19.0F, 3, 1, 17, 0.0F));
		selle.cubeList.add(new ModelBox(selle, 79, 75, -2.5F, -25.2F, -19.0F, 5, 1, 17, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-7.0F, -26.0F, -18.0F);
		selle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.1745F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 78, 104, 0.0F, 0.0F, -1.0F, 5, 1, 17, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(7.0F, -26.0F, -3.0F);
		selle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.1745F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 78, 104, -5.0F, 0.0F, -16.0F, 5, 1, 17, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(7.0F, -6.0F, -5.0F);
		selle.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0873F, 0.0F, 0.0873F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 58, 84, -1.0F, -22.0F, 0.0F, 1, 22, 1, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(7.0F, -6.0F, -16.0F);
		selle.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1309F, 0.0F, 0.1309F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 84, -1.0F, -22.0F, 0.0F, 1, 22, 1, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-6.0F, -6.0F, -5.0F);
		selle.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0869F, -0.0076F, -0.0869F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 84, -1.0F, -22.0F, 0.0F, 1, 22, 1, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-6.0F, -6.0F, -16.0F);
		selle.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.1309F, 0.0F, -0.1309F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 58, 84, -1.0F, -22.0F, 0.0F, 1, 22, 1, 0.0F));

		leftbackleg = new ModelRenderer(this);
		leftbackleg.setRotationPoint(10.0F, 11.0F, 14.0F);


		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-10.0F, 0.0F, -11.0F);
		leftbackleg.addChild(cube_r11);
		setRotationAngle(cube_r11, -3.1416F, 0.0F, 3.1416F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 61, 76, -13.5F, 10.9F, -10.0F, 5, 2, 4, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-10.0F, 0.0F, -11.0F);
		leftbackleg.addChild(cube_r12);
		setRotationAngle(cube_r12, 2.4871F, 0.0F, -3.1416F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 76, 79, -13.0F, 13.3677F, -3.1072F, 4, 3, 3, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-10.0F, 0.0F, -11.0F);
		leftbackleg.addChild(cube_r13);
		setRotationAngle(cube_r13, -2.1817F, 0.0F, 3.1416F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 56, 0, -13.0F, -6.5708F, -16.1932F, 4, 4, 9, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-10.0F, 0.0F, -11.0F);
		leftbackleg.addChild(cube_r14);
		setRotationAngle(cube_r14, -2.7925F, 0.0F, 3.1416F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 64, 61, -14.0F, -6.7011F, -13.423F, 5, 9, 6, 0.0F));

		rightbackleg = new ModelRenderer(this);
		rightbackleg.setRotationPoint(-14.0F, 11.0F, 14.0F);


		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(14.0F, 0.0F, -11.0F);
		rightbackleg.addChild(cube_r15);
		setRotationAngle(cube_r15, -3.1416F, 0.0F, 3.1416F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 76, 36, 8.5F, 10.9F, -10.0F, 5, 2, 4, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(14.0F, 0.0F, -11.0F);
		rightbackleg.addChild(cube_r16);
		setRotationAngle(cube_r16, 2.4871F, 0.0F, -3.1416F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 80, 60, 9.0F, 13.3677F, -3.1072F, 4, 3, 3, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(14.0F, 0.0F, -11.0F);
		rightbackleg.addChild(cube_r17);
		setRotationAngle(cube_r17, -2.1817F, 0.0F, 3.1416F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 61, 9.0F, -6.5708F, -16.1932F, 4, 4, 9, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(14.0F, 0.0F, -11.0F);
		rightbackleg.addChild(cube_r18);
		setRotationAngle(cube_r18, -2.7925F, 0.0F, 3.1416F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 39, 68, 9.0F, -6.7011F, -13.423F, 5, 9, 6, 0.0F));

		leftfrontleg = new ModelRenderer(this);
		leftfrontleg.setRotationPoint(9.0F, 10.0F, -2.0F);


		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-9.0F, 1.0F, 5.0F);
		leftfrontleg.addChild(cube_r19);
		setRotationAngle(cube_r19, -3.1416F, 0.0F, 3.1416F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 73, 0, -13.5F, 10.9F, 3.0F, 5, 2, 5, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-9.0F, 1.0F, 5.0F);
		leftfrontleg.addChild(cube_r20);
		setRotationAngle(cube_r20, -3.0107F, 0.0F, 3.1416F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 74, -13.0F, 4.1972F, 1.3288F, 4, 9, 4, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-9.0F, 1.0F, 5.0F);
		leftfrontleg.addChild(cube_r21);
		setRotationAngle(cube_r21, -3.1226F, 0.1313F, 2.7704F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 50, -11.23F, -0.4954F, 2.8924F, 7, 11, 6, 0.0F));

		rightfrontleg = new ModelRenderer(this);
		rightfrontleg.setRotationPoint(-9.0F, 10.0F, -2.0F);


		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(9.0F, 1.0F, 5.0F);
		rightfrontleg.addChild(cube_r22);
		setRotationAngle(cube_r22, -3.0107F, 0.0F, 3.1416F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 70, 9.0F, 4.1972F, 1.3288F, 4, 9, 4, 0.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(9.0F, 1.0F, 5.0F);
		rightfrontleg.addChild(cube_r23);
		setRotationAngle(cube_r23, -3.1226F, -0.1313F, -2.7704F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 29, 4.23F, -0.4954F, 2.8924F, 7, 11, 6, 0.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(9.0F, 1.0F, 5.0F);
		rightfrontleg.addChild(cube_r24);
		setRotationAngle(cube_r24, -3.1416F, 0.0F, 3.1416F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 76, 29, 8.5F, 10.9F, 3.0F, 5, 2, 5, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 11.0F, -4.0F);


		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 0.0F, 7.0F);
		head.addChild(cube_r25);
		setRotationAngle(cube_r25, -3.1416F, 0.0F, -2.5307F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 0, -2.4565F, -5.351F, 10.0F, 2, 2, 2, 0.0F));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 0.0F, 7.0F);
		head.addChild(cube_r26);
		setRotationAngle(cube_r26, 3.1416F, 0.0F, 2.5307F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 4, 0.4565F, -5.351F, 10.0F, 2, 2, 2, 0.0F));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, 7.0F);
		head.addChild(cube_r27);
		setRotationAngle(cube_r27, 2.8798F, 0.0F, 3.1416F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 64, 46, -3.0F, -0.5817F, 14.4506F, 6, 2, 5, 0.0F));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.0F, 7.0F);
		head.addChild(cube_r28);
		setRotationAngle(cube_r28, 3.098F, 0.0F, 3.1416F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 70, 53, -3.0F, -0.0848F, 15.2356F, 6, 3, 4, 0.0F));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 56, -4.0F, -3.0848F, 9.2356F, 8, 8, 6, 0.0F));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 46, 0, -3.0F, -2.0848F, 7.2356F, 6, 6, 3, 0.0F));
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