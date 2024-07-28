package drealm.model;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelRhunBisonMounted extends ModelBase {
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
	private final ModelRenderer backleftleg;
	private final ModelRenderer cube_r12;
	private final ModelRenderer backrightleg;
	private final ModelRenderer cube_r13;
	private final ModelRenderer frontleftleg;
	private final ModelRenderer cube_r14;
	private final ModelRenderer frontrightleg;
	private final ModelRenderer cube_r15;
	private final ModelRenderer head;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;

	public DRModelRhunBisonMounted() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 1.0F);
		body.cubeList.add(new ModelBox(body, 76, 47, 0.0F, -23.0F, -22.0F, 0, 9, 13, 0.0F));
		body.cubeList.add(new ModelBox(body, 96, 71, -1.0F, -3.0F, 19.0F, 2, 6, 2, 0.0F));
		body.cubeList.add(new ModelBox(body, 113, 51, -2.0F, 2.0F, 18.0F, 4, 5, 4, 0.0F));
		body.cubeList.add(new ModelBox(body, 96, 60, -5.0F, 5.0F, 6.0F, 10, 2, 9, 0.0F));
		body.cubeList.add(new ModelBox(body, 53, 0, -7.0F, 4.0F, -18.0F, 14, 2, 21, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.3F, 8.2F, 9.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.1745F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 100, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.7F, 8.4F, 12.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1745F, 0.0F, 0.1745F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 103, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.7F, 8.4F, 12.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1745F, 0.0F, -0.1745F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 102, 0, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.3F, 8.2F, 9.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2182F, 0.0F, -0.1745F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 106, -1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -7.0F, 18.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.48F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 23, -1.0F, -2.0F, -1.0F, 2, 7, 2, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -14.0F, -21.0F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 67, 0.0F, -8.0F, -1.0F, 0, 7, 19, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -14.0F, -21.0F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3491F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 74, 0.0F, -7.0F, -1.0F, 0, 7, 19, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 6.0F, 14.5F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.0873F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 145, 119, -10.5F, -7.5F, -13.0F, 0, 10, 17, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 134, 68, -10.5F, -17.5F, -13.0F, 10, 10, 17, 0.0F));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 59, 26, -10.0F, -17.0F, -13.5F, 10, 17, 17, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -15.0F, 0.0F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.1309F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -15.0F, 0.0F, -22.0F, 15, 20, 23, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -15.0F, 0.0F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.1309F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 43, 0.0F, 0.0F, -22.0F, 15, 20, 23, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 6.0F, 14.5F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.0873F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 215, 29, 10.5F, -7.5F, -13.0F, 0, 10, 17, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 134, 7, 0.5F, -17.5F, -13.0F, 10, 10, 17, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 59, 69, 0.0F, -17.0F, -13.5F, 10, 17, 17, 0.0F));

		backleftleg = new ModelRenderer(this);
		backleftleg.setRotationPoint(7.0F, 8.0F, 14.0F);
		backleftleg.cubeList.add(new ModelBox(backleftleg, 53, 0, -2.0F, 4.0F, -2.0F, 5, 8, 5, 0.0F));
		backleftleg.cubeList.add(new ModelBox(backleftleg, 0, 56, -2.0F, 14.0F, -3.0F, 5, 2, 6, 0.0F));
		backleftleg.cubeList.add(new ModelBox(backleftleg, 116, 97, -1.5F, 7.0F, -1.75F, 4, 8, 4, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.5F, 3.0F, -2.0F);
		backleftleg.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.2597F, 0.0338F, -0.1265F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 94, 103, -5.0F, -4.0F, -2.0F, 7, 10, 8, 0.0F));

		backrightleg = new ModelRenderer(this);
		backrightleg.setRotationPoint(-7.0F, 8.0F, 14.0F);
		backrightleg.cubeList.add(new ModelBox(backrightleg, 0, 12, -3.0F, 14.0F, -3.0F, 5, 2, 6, 0.0F));
		backrightleg.cubeList.add(new ModelBox(backrightleg, 113, 85, -2.5F, 7.0F, -1.75F, 4, 8, 4, 0.0F));
		backrightleg.cubeList.add(new ModelBox(backrightleg, 0, 43, -3.0F, 4.0F, -2.0F, 5, 8, 5, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.5F, 3.0F, -2.0F);
		backrightleg.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.2597F, -0.0338F, 0.1265F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 64, 103, -2.0F, -4.0F, -2.0F, 7, 10, 8, 0.0F));

		frontleftleg = new ModelRenderer(this);
		frontleftleg.setRotationPoint(9.0F, 9.0F, -10.0F);
		frontleftleg.cubeList.add(new ModelBox(frontleftleg, 0, 100, -2.4F, 3.0F, -2.0F, 5, 8, 5, 0.0F));
		frontleftleg.cubeList.add(new ModelBox(frontleftleg, 120, 117, -1.9F, 6.0F, -1.75F, 4, 8, 4, 0.0F));
		frontleftleg.cubeList.add(new ModelBox(frontleftleg, 40, 113, -2.4F, 13.0F, -3.0F, 5, 2, 6, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(1.1F, 2.0F, -2.0F);
		frontleftleg.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.04F, 0.0356F, -0.1701F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 28, 93, -5.0F, -4.0F, -3.0F, 8, 10, 10, 0.0F));

		frontrightleg = new ModelRenderer(this);
		frontrightleg.setRotationPoint(-9.0F, 9.0F, -10.0F);
		frontrightleg.cubeList.add(new ModelBox(frontrightleg, 36, 121, -2.1F, 6.0F, -1.75F, 4, 8, 4, 0.0F));
		frontrightleg.cubeList.add(new ModelBox(frontrightleg, 113, 43, -2.6F, 13.0F, -3.0F, 5, 2, 6, 0.0F));
		frontrightleg.cubeList.add(new ModelBox(frontrightleg, 0, 113, -2.6F, 3.0F, -2.0F, 5, 8, 5, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.1F, 2.0F, -2.0F);
		frontrightleg.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.04F, -0.0356F, 0.1701F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 96, 23, -3.0F, -4.0F, -3.0F, 8, 10, 10, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -3.0F, -21.0F);
		head.cubeList.add(new ModelBox(head, 96, 71, -4.0F, -5.0F, -9.0F, 8, 5, 9, 0.0F));
		head.cubeList.add(new ModelBox(head, 102, 0, -3.0F, -3.0F, -8.5F, 6, 9, 9, 0.0F));
		head.cubeList.add(new ModelBox(head, 53, 6, 0.0F, -9.0F, -7.0F, 0, 4, 7, 0.0F));
		head.cubeList.add(new ModelBox(head, 15, 113, 2.0F, -1.0F, -1.0F, 4, 5, 0, 0.0F));
		head.cubeList.add(new ModelBox(head, 15, 43, -6.0F, -1.0F, -1.0F, 4, 5, 0, 0.0F));
		head.cubeList.add(new ModelBox(head, 3, 138, -4.5F, -5.5F, -9.5F, 9, 6, 7, 0.0F));
		head.cubeList.add(new ModelBox(head, 16, 161, 4.5F, 0.5F, -5.5F, 0, 6, 3, 0.0F));
		head.cubeList.add(new ModelBox(head, 55, 159, -4.5F, 0.5F, -5.5F, 0, 6, 3, 0.0F));
		head.cubeList.add(new ModelBox(head, 57, 136, -1.5F, 0.5F, -9.5F, 3, 6, 7, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.0F, -2.0F, -2.0F);
		head.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.3024F, -0.379F, 0.2224F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 53, 60, -8.5879F, -2.6445F, -1.7255F, 6, 3, 3, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.0F, -2.0F, -2.0F);
		head.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.4218F, -0.1308F, 0.2407F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 86, 103, -3.9397F, -2.658F, -3.0F, 4, 4, 4, 0.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.0F, -2.0F, -2.0F);
		head.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.633F, -0.8196F, 0.2829F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 121, 71, -13.0991F, -3.7931F, 1.6912F, 6, 2, 2, 0.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(3.0F, -2.0F, -2.0F);
		head.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.633F, 0.8196F, -0.2829F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 53, 17, 7.0991F, -3.7931F, 1.6912F, 6, 2, 2, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(3.0F, -2.0F, -2.0F);
		head.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.3024F, 0.379F, -0.2224F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 86, 2.5879F, -2.6445F, -1.7255F, 6, 3, 3, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(3.0F, -2.0F, -2.0F);
		head.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.4218F, 0.1308F, -0.2407F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 52, 121, -0.0603F, -2.658F, -3.0F, 4, 4, 4, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.5F, 11.1F, -2.8F);
		head.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.9163F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 113, -3.0F, -7.6073F, -5.2086F, 5, 7, 5, 0.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 5.0F, -8.8F);
		head.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.2618F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 0, -3.0F, 0.0F, 0.0F, 6, 7, 5, 0.0F));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 68, 121, -2.5F, 7.0F, 0.5F, 5, 1, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		backleftleg.render(f5);
		backrightleg.render(f5);
		frontleftleg.render(f5);
		frontrightleg.render(f5);
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
		this.frontleftleg.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.backleftleg.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.frontrightleg.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.backrightleg.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
	}
}