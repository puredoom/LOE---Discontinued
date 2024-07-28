package drealm.model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelBoar extends ModelBase {
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
	private final ModelRenderer legs;
	private final ModelRenderer legAvG;
	private final ModelRenderer legArG;
	private final ModelRenderer legArD;
	private final ModelRenderer legAvD;
	private final ModelRenderer head;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public DRModelBoar() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 10.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -8.0F, -6.0F, -11.0F, 15, 11, 25, 2.0F));
		body.cubeList.add(new ModelBox(body, 0, 36, -7.0F, 5.0F, -10.0F, 13, 1, 23, 2.0F));
		body.cubeList.add(new ModelBox(body, 55, 0, -9.0F, -7.0F, 8.0F, 17, 12, 7, 2.0F));
		body.cubeList.add(new ModelBox(body, 93, 74, -9.0F, -7.0F, 16.0F, 6, 12, 1, 1.0F));
		body.cubeList.add(new ModelBox(body, 65, 91, 2.0F, -7.0F, 16.0F, 6, 12, 1, 1.0F));
		body.cubeList.add(new ModelBox(body, 49, 36, -9.0F, -7.0F, -12.0F, 17, 12, 7, 2.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, -15.0F, 22.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4921F, 1.137F, 2.7542F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 53, -1.8148F, -1.5881F, -0.0145F, 1, 1, 3, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -15.0F, 21.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6364F, -0.0378F, 2.2939F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 52, -1.4382F, -0.5823F, 0.2548F, 1, 1, 3, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, -13.0F, 21.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.9126F, -0.7216F, 1.6149F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 52, -2.0043F, -0.6605F, 0.6088F, 1, 1, 3, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, -12.0F, 22.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 2.2626F, -0.6901F, -0.1645F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 36, -0.5147F, -0.7054F, -0.0731F, 1, 1, 3, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -11.0F, 19.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.9555F, -0.5798F, -0.4602F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 0, 0.0F, 1.0F, -1.0F, 1, 1, 4, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0F, -12.0F, 18.0F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.4921F, 1.137F, 2.7542F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 19, -1.8148F, -1.5881F, -0.0145F, 1, 1, 3, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -12.0F, 17.0F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.6364F, -0.0378F, 2.2939F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 49, 55, -1.4382F, -0.5823F, 0.2548F, 1, 1, 3, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, -10.0F, 17.0F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.9126F, -0.7216F, 1.6149F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 57, 55, -2.0043F, -0.6605F, 0.6088F, 1, 1, 3, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -9.0F, 18.0F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.2626F, -0.6901F, -0.1645F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 60, 20, -0.5147F, -0.7054F, -0.0731F, 1, 1, 3, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -8.0F, 15.0F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.9555F, -0.5798F, -0.4602F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 60, 0.0F, 1.0F, 0.0F, 1, 1, 3, 0.0F));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		legAvG = new ModelRenderer(this);
		legAvG.setRotationPoint(10.0F, -16.0F, -8.0F);
		legs.addChild(legAvG);
		legAvG.cubeList.add(new ModelBox(legAvG, 43, 96, -1.0F, 4.0F, -2.0F, 3, 12, 3, 0.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 17, 16, -1.0F, 14.0F, -3.0F, 3, 2, 1, 0.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 72, 55, -3.0F, 3.0F, -4.0F, 7, 10, 7, -1.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 0, 0, -1.0F, -5.0F, -4.0F, 4, 9, 7, 0.0F));

		legArG = new ModelRenderer(this);
		legArG.setRotationPoint(10.0F, -16.0F, 11.0F);
		legs.addChild(legArG);
		legArG.cubeList.add(new ModelBox(legArG, 31, 96, -1.0F, 4.0F, -1.0F, 3, 12, 3, 0.0F));
		legArG.cubeList.add(new ModelBox(legArG, 15, 40, -1.0F, 14.0F, -2.0F, 3, 2, 1, 0.0F));
		legArG.cubeList.add(new ModelBox(legArG, 44, 60, -3.0F, 3.0F, -3.0F, 7, 10, 7, -1.0F));
		legArG.cubeList.add(new ModelBox(legArG, 0, 36, -1.0F, -5.0F, -3.0F, 4, 9, 7, 0.0F));

		legArD = new ModelRenderer(this);
		legArD.setRotationPoint(-10.0F, -16.0F, 11.0F);
		legs.addChild(legArD);
		legArD.cubeList.add(new ModelBox(legArD, 90, 88, -3.0F, 2.0F, -1.0F, 3, 14, 3, 0.0F));
		legArD.cubeList.add(new ModelBox(legArD, 62, 55, -3.0F, 14.0F, -2.0F, 3, 2, 1, 0.0F));
		legArD.cubeList.add(new ModelBox(legArD, 0, 82, -4.0F, -5.0F, -3.0F, 4, 9, 7, 0.0F));
		legArD.cubeList.add(new ModelBox(legArD, 37, 79, -5.0F, 3.0F, -3.0F, 7, 10, 7, -1.0F));

		legAvD = new ModelRenderer(this);
		legAvD.setRotationPoint(-10.0F, -16.0F, -8.0F);
		legs.addChild(legAvD);
		legAvD.cubeList.add(new ModelBox(legAvD, 22, 82, -3.0F, 2.0F, -2.0F, 3, 14, 3, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 0, 56, -3.0F, 14.0F, -3.0F, 3, 2, 1, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 80, 19, -4.0F, -5.0F, -4.0F, 4, 9, 7, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 65, 74, -5.0F, 3.0F, -4.0F, 7, 10, 7, -1.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, -14.0F);
		head.cubeList.add(new ModelBox(head, 0, 60, -6.0F, -7.0F, -11.0F, 11, 11, 11, 0.0F));
		head.cubeList.add(new ModelBox(head, 0, 16, -4.0F, -2.0F, -14.0F, 7, 6, 3, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.0F, -5.0F, -4.0F);
		head.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.829F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 60, 0.0F, -5.0F, -2.0F, 1, 4, 4, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.0F, -5.0F, -4.0F);
		head.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 3.098F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 60, 3.0F, 0.0F, -2.0F, 1, 4, 4, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.0F, -5.0F, -4.0F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -3.098F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 90, 35, -4.0F, 0.0F, -2.0F, 1, 4, 4, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(4.0F, -5.0F, -4.0F);
		head.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.829F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 79, 91, -1.0F, -5.0F, -2.0F, 1, 4, 4, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(5.0F, 5.0F, -10.0F);
		head.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 95, 53, -2.0F, -7.0F, 0.0F, 2, 6, 2, 0.0F));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 55, 96, -11.0F, -7.0F, 0.0F, 2, 6, 2, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(5.0F, 5.0F, -10.0F);
		head.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0873F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -2.0F, -11.0F, -4.0F, 1, 6, 1, 0.0F));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 36, -10.0F, -11.0F, -4.0F, 1, 6, 1, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		legs.render(f5);
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
		this.legAvG.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
		this.legAvD.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArG.rotateAngleX = MathHelper.cos(f * 0.4f + 3.1415927f) * 1.0f * f1;
		this.legArD.rotateAngleX = MathHelper.cos(f * 0.4f) * 1.0f * f1;
	}
}