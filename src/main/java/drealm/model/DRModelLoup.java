package drealm.model;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DRModelLoup extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer backrightleg;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer backleftleg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer frontrightleg;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer frontleftleg;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer head;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;

	public DRModelLoup() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 12.0F, 17.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -8.0F, -6.0F, -25.0F, 16, 11, 16, 0.0F));
		body.cubeList.add(new ModelBox(body, 0, 27, -6.0F, -5.0F, -9.0F, 12, 7, 12, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -8.0F, 5.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.2654F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 44, 2.0F, -1.945F, 2.0003F, 0, 4, 9, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 47, -2.0F, -1.945F, 2.0003F, 0, 4, 9, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 0, -2.0F, -1.945F, 2.0003F, 4, 0, 9, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 46, -2.0F, 2.055F, 2.0003F, 4, 0, 9, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 64, 0, -2.0F, -1.945F, 0.0003F, 4, 4, 2, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -4.0F, 2.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.9163F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 56, -1.0F, -1.0F, -3.0F, 2, 2, 8, 0.0F));

		backrightleg = new ModelRenderer(this);
		backrightleg.setRotationPoint(-6.0F, 12.0F, 17.5F);
		backrightleg.cubeList.add(new ModelBox(backrightleg, 48, 11, -1.5F, 10.0F, -1.5F, 3, 2, 3, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(6.0F, -1.0F, -1.5F);
		backrightleg.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.4363F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -8.0F, -1.0F, -1.0F, 4, 8, 4, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.0F, 4.0F, 2.5F);
		backrightleg.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3491F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 27, -7.0F, -1.0F, 0.0F, 2, 9, 2, 0.0F));

		backleftleg = new ModelRenderer(this);
		backleftleg.setRotationPoint(6.0F, 12.0F, 17.5F);
		backleftleg.cubeList.add(new ModelBox(backleftleg, 64, 41, -1.5F, 10.0F, -1.5F, 3, 2, 3, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.0F, -1.0F, -1.5F);
		backleftleg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.4363F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 57, 4.0F, -1.0F, -1.0F, 4, 8, 4, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-6.0F, 4.0F, 2.5F);
		backleftleg.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 62, 62, 5.0F, -1.0F, 0.0F, 2, 9, 2, 0.0F));

		frontrightleg = new ModelRenderer(this);
		frontrightleg.setRotationPoint(-9.0F, 11.5F, -5.0F);
		frontrightleg.cubeList.add(new ModelBox(frontrightleg, 64, 36, -1.5F, 10.5F, 0.0F, 3, 2, 3, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(9.0F, -0.5F, 1.0F);
		frontrightleg.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.0908F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 23, -10.5F, -2.0F, -3.0F, 3, 9, 4, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(6.0F, 4.5F, 4.0F);
		frontrightleg.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3491F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 62, -7.0F, -1.0F, 0.0F, 2, 9, 2, 0.0F));

		frontleftleg = new ModelRenderer(this);
		frontleftleg.setRotationPoint(9.0F, 11.5F, -5.0F);
		frontleftleg.cubeList.add(new ModelBox(frontleftleg, 22, 56, -1.5F, 10.5F, 0.0F, 3, 2, 3, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-6.0F, 4.5F, 4.0F);
		frontleftleg.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.3491F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 46, 62, 5.0F, -1.0F, 0.0F, 2, 9, 2, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-9.0F, -0.5F, 1.0F);
		frontleftleg.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.0908F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 62, 7.5F, -2.0F, -3.0F, 3, 9, 4, 0.0F));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 9.0F, -9.0F);
		head.cubeList.add(new ModelBox(head, 41, 39, -4.0F, -4.547F, -8.3973F, 8, 7, 7, 0.0F));
		head.cubeList.add(new ModelBox(head, 50, 53, -2.0F, -1.547F, -15.3973F, 4, 2, 7, 0.0F));
		head.cubeList.add(new ModelBox(head, 64, 11, -5.0F, -9.0F, -3.0F, 3, 8, 1, 0.0F));
		head.cubeList.add(new ModelBox(head, 0, 46, 2.0F, -9.0F, -3.0F, 3, 8, 1, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, -15.0F);
		head.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.1745F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 17, 46, -1.5F, -1.547F, -0.3973F, 3, 2, 8, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 3.0F, -1.0F);
		head.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.1745F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 49, 2, -2.0F, -3.547F, -13.3973F, 4, 2, 7, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 15.0F, 9.0F);
		head.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1309F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 27, -3.0F, -17.0F, -13.0F, 6, 6, 6, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		backrightleg.render(f5);
		backleftleg.render(f5);
		frontrightleg.render(f5);
		frontleftleg.render(f5);
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