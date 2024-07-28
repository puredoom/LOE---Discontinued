package drealm.model;// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelGoatArmor extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer head;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
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
	private final ModelRenderer legAvG;
	private final ModelRenderer legArG;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer legArD;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer legAvD;

	public DRModelGoatArmor() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 55, 0, -6.0F, -4.0F, -13.0F, 12, 10, 25, 0.0F));
		body.cubeList.add(new ModelBox(body, 90, 53, -4.0F, -7.0F, -16.0F, 8, 10, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 104, 16, -4.0F, -6.0F, -13.0F, 8, 2, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 104, 21, -4.0F, -5.0F, -10.0F, 8, 1, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 108, 35, -3.0F, -5.0F, -7.0F, 6, 1, 3, 0.0F));
		body.cubeList.add(new ModelBox(body, 55, 16, -2.0F, -5.0F, -4.0F, 4, 1, 7, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 52, -11.0F, 1.0F, -18.0F, 10, 17, 35, -5.0F));
		body.cubeList.add(new ModelBox(body, 0, 0, 1.0F, 1.0F, -18.0F, 10, 17, 35, -5.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -5.0F, 13.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.9199F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 110, 88, -1.0F, -0.6308F, -0.8042F, 2, 2, 5, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -3.0F, 11.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6545F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 0, -1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, -15.0F);
		head.cubeList.add(new ModelBox(head, 75, 89, -6.0F, -12.0F, -15.0F, 10, 17, 15, -5.0F));
		head.cubeList.add(new ModelBox(head, 55, 52, -4.0F, -12.0F, -15.0F, 10, 17, 15, -5.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -10.0F, -3.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.8087F, -1.3911F, -1.8163F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 232, 241, -9.0F, 0.6365F, -1.3779F, 3, 1, 3, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 232, 241, -6.0F, -0.3635F, -1.3779F, 3, 1, 3, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 232, 241, -4.0F, -1.3635F, -1.3779F, 3, 1, 3, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -10.0F, -3.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 2.3366F, -1.51F, -2.347F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 232, 241, -2.0F, -1.3635F, -1.3779F, 3, 1, 3, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.0F, -11.0F, -1.0F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3054F, 0.0F, 0.3491F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 69, -1.0F, -3.0F, -1.0F, 2, 4, 2, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.0F, -14.0F, -1.0F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7258F, 0.1521F, 0.5628F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 67, -0.9136F, -2.9852F, -0.0494F, 2, 4, 2, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(3.0F, -15.0F, 1.0F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.996F, 0.7079F, 1.1779F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 52, -0.9192F, -3.61F, -0.6479F, 2, 4, 2, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(5.0F, -14.0F, 4.0F);
		head.addChild(cube_r8);
		setRotationAngle(cube_r8, -1.1567F, 1.033F, 1.6429F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 104, -0.252F, -2.9786F, -1.2548F, 2, 4, 2, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(6.0F, -11.0F, 5.0F);
		head.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.0907F, 1.1082F, -2.2957F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 22, 17, -0.8891F, -2.7254F, -1.3591F, 2, 4, 2, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(7.0F, -9.0F, 4.0F);
		head.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.3487F, 0.3606F, -1.9391F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 112, 55, -0.8199F, -3.3483F, -0.7723F, 2, 4, 2, 0.0F));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.8199F, -7.3483F, -0.7723F, 1, 4, 1, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-7.0F, -9.0F, 4.0F);
		head.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.3487F, -0.3606F, 1.9391F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 17, -0.1801F, -7.3483F, -0.7723F, 1, 4, 1, 0.0F));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 113, 78, -1.1801F, -3.3483F, -0.7723F, 2, 4, 2, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-6.0F, -11.0F, 5.0F);
		head.addChild(cube_r12);
		setRotationAngle(cube_r12, 1.0907F, -1.1082F, 2.2957F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 52, -1.1109F, -2.7254F, -1.3591F, 2, 4, 2, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-5.0F, -14.0F, 4.0F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.1567F, -1.033F, -1.6429F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 18, 104, -1.748F, -2.9786F, -1.2548F, 2, 4, 2, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.0F, -15.0F, 1.0F);
		head.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.996F, -0.7079F, -1.1779F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 70, 16, -1.0808F, -3.61F, -0.6479F, 2, 4, 2, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.0F, -14.0F, -1.0F);
		head.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7258F, -0.1521F, -0.5628F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 71, 0, -1.0864F, -2.9852F, -0.0494F, 2, 4, 2, 0.0F));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, -11.0F, -1.0F);
		head.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.3054F, 0.0F, -0.3491F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 90, 35, -1.0F, -3.0F, -1.0F, 2, 4, 2, 0.0F));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.0F, -9.0F, -1.0F);
		head.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.5236F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -4.0F, -6.0F, -3.0F, 8, 11, 6, -3.0F));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.0F, -9.0F, -1.0F);
		head.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.5236F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 17, -4.0F, -6.0F, -3.0F, 8, 11, 6, -3.0F));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -9.0F, -5.0F);
		head.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.5236F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 17, 69, -1.0F, -0.8327F, -6.3797F, 2, 2, 6, 0.0F));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.3491F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 17, 52, -1.0F, -9.0F, -8.0F, 2, 2, 6, 0.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 99, 78, -2.0F, -11.0F, -3.0F, 4, 4, 6, 0.0F));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 26, 104, -2.0F, -7.0F, -2.0F, 4, 10, 5, 0.0F));

		legAvG = new ModelRenderer(this);
		legAvG.setRotationPoint(5.0F, 8.0F, -9.0F);
		legAvG.cubeList.add(new ModelBox(legAvG, 104, 0, -3.0F, -6.0F, -3.0F, 5, 10, 6, 0.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 109, 63, -2.0F, 4.0F, 0.0F, 3, 12, 3, 0.0F));
		legAvG.cubeList.add(new ModelBox(legAvG, 17, 60, -2.0F, 14.0F, -1.0F, 3, 2, 1, 0.0F));

		legArG = new ModelRenderer(this);
		legArG.setRotationPoint(5.0F, 8.0F, 12.0F);
		legArG.cubeList.add(new ModelBox(legArG, 0, 104, -3.0F, -6.0F, -5.0F, 5, 10, 8, 0.0F));
		legArG.cubeList.add(new ModelBox(legArG, 112, 49, -2.0F, 14.0F, -4.0F, 3, 2, 4, 0.0F));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-5.0F, 17.0F, -1.0F);
		legArG.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.3927F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 44, 104, 3.0F, -13.0F, -3.0F, 3, 12, 3, 0.0F));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-5.0F, -2.0F, -1.0F);
		legArG.addChild(cube_r22);
		setRotationAngle(cube_r22, -1.2217F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 69, 3.0F, -3.9703F, -0.7802F, 3, 6, 11, 0.0F));

		legArD = new ModelRenderer(this);
		legArD.setRotationPoint(-4.0F, 7.0F, 10.0F);
		legArD.cubeList.add(new ModelBox(legArD, 90, 35, -3.0F, -5.0F, -3.0F, 5, 10, 8, 0.0F));
		legArD.cubeList.add(new ModelBox(legArD, 110, 95, -2.0F, 15.0F, -2.0F, 3, 2, 4, 0.0F));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(4.0F, 18.0F, 1.0F);
		legArD.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.3927F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 55, 52, -6.0F, -13.0F, -3.0F, 3, 12, 3, 0.0F));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(4.0F, -1.0F, 1.0F);
		legArD.addChild(cube_r24);
		setRotationAngle(cube_r24, -1.2217F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 52, -6.0F, -3.9703F, -0.7802F, 3, 6, 11, 0.0F));

		legAvD = new ModelRenderer(this);
		legAvD.setRotationPoint(-5.0F, 7.0F, -10.0F);
		legAvD.cubeList.add(new ModelBox(legAvD, 55, 0, -2.0F, -5.0F, -2.0F, 5, 10, 6, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 56, 104, -1.0F, 5.0F, 1.0F, 3, 12, 3, 0.0F));
		legAvD.cubeList.add(new ModelBox(legAvD, 0, 58, -1.0F, 15.0F, 0.0F, 3, 2, 1, 0.0F));
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		head.render(f5);
		legAvG.render(f5);
		legArG.render(f5);
		legArD.render(f5);
		legAvD.render(f5);

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