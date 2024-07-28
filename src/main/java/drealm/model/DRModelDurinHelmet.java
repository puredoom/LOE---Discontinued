package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelDurinHelmet extends LOTRModelBiped {

	public DRModelDurinHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedHead = new ModelRenderer(this);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -5.0F, -9.0F, -4.9F, 10, 1, 10, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 11, -4.5F, -10.0F, -4.4F, 9, 1, 9, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 8, 1.5F, -10.4F, -0.4F, 3, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 23, -1.5F, -10.4F, -1.4F, 3, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 11, -0.5F, -10.4F, -4.4F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 4, -0.5F, -10.4F, 1.6F, 1, 1, 3, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 11, 21, -3.5F, -9.0F, -5.0F, 7, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 23, 24, -0.5F, -8.0F, -5.0F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 5, 24, -0.8F, -9.4F, -5.0F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 5, 24, -0.2F, -9.4F, -5.0F, 1, 1, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 5, 11, -0.5F, -9.3F, -5.2F, 1, 2, 1, 0.0F));
		this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 8, -4.5F, -10.4F, -0.4F, 3, 1, 1, 0.0F));

		ModelRenderer Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(-0.1F, -10.4F, -4.4F);
		this.bipedHead.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.6545F, 0.0F, 0.0F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 0, 25, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F));
		Head_r1.cubeList.add(new ModelBox(Head_r1, 0, 25, -0.3F, 0.0F, -1.0F, 1, 1, 1, 0.0F));

		ModelRenderer Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(-4.5F, -1.0F, -0.5F);
		this.bipedHead.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.0F, 0.3491F);
		Head_r2.cubeList.add(new ModelBox(Head_r2, 20, 21, 0.0778F, -0.0706F, -4.0F, 1, 1, 9, 0.0F));

		ModelRenderer Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(0.1F, -9.8F, 3.8F);
		this.bipedHead.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.6545F, 0.0F, 0.0F);
		Head_r3.cubeList.add(new ModelBox(Head_r3, 20, 23, -0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F));
		Head_r3.cubeList.add(new ModelBox(Head_r3, 20, 23, -0.7F, 0.0F, 0.0F, 1, 1, 1, 0.0F));

		ModelRenderer Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(4.5F, -1.0F, -0.5F);
		this.bipedHead.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.0F, 0.0F, -0.3491F);
		Head_r4.cubeList.add(new ModelBox(Head_r4, 20, 21, -1.0778F, -0.0706F, -4.0F, 1, 1, 9, 0.0F));

		ModelRenderer Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(-3.5F, -8.0F, -0.5F);
		this.bipedHead.addChild(Head_r5);
		setRotationAngle(Head_r5, 0.0F, 0.0F, 0.1309F);
		Head_r5.cubeList.add(new ModelBox(Head_r5, 0, 21, -1.0F, 0.0F, -4.0F, 1, 8, 9, 0.0F));

		ModelRenderer Head_r6 = new ModelRenderer(this);
		Head_r6.setRotationPoint(-4.5F, -10.4F, 0.1F);
		this.bipedHead.addChild(Head_r6);
		setRotationAngle(Head_r6, 0.0F, 0.0F, -0.6545F);
		Head_r6.cubeList.add(new ModelBox(Head_r6, 3, 26, -1.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F));

		ModelRenderer Head_r7 = new ModelRenderer(this);
		Head_r7.setRotationPoint(-4.15F, -4.75F, -4.1F);
		this.bipedHead.addChild(Head_r7);
		setRotationAngle(Head_r7, -0.109F, 0.3323F, -0.1928F);
		Head_r7.cubeList.add(new ModelBox(Head_r7, 0, 15, -0.0061F, -0.6438F, -0.5F, 2, 4, 1, 0.0F));

		ModelRenderer Head_r8 = new ModelRenderer(this);
		Head_r8.setRotationPoint(-4.15F, -6.75F, -4.1F);
		this.bipedHead.addChild(Head_r8);
		setRotationAngle(Head_r8, 0.0F, 0.3491F, 0.1309F);
		Head_r8.cubeList.add(new ModelBox(Head_r8, 0, 21, -0.0061F, -1.6438F, -0.4F, 2, 3, 1, 0.0F));

		ModelRenderer Head_r9 = new ModelRenderer(this);
		Head_r9.setRotationPoint(0.5F, -7.0F, -5.0F);
		this.bipedHead.addChild(Head_r9);
		setRotationAngle(Head_r9, 0.0F, 0.0F, 0.5672F);
		Head_r9.cubeList.add(new ModelBox(Head_r9, 5, 4, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F));

		ModelRenderer Head_r10 = new ModelRenderer(this);
		Head_r10.setRotationPoint(-0.5F, -8.0F, 3.5F);
		this.bipedHead.addChild(Head_r10);
		setRotationAngle(Head_r10, 0.1309F, 0.0F, 0.0F);
		Head_r10.cubeList.add(new ModelBox(Head_r10, 27, 11, -4.0F, 0.0F, 0.0F, 9, 8, 1, 0.0F));

		ModelRenderer Head_r11 = new ModelRenderer(this);
		Head_r11.setRotationPoint(-3.15F, -1.75F, -4.1F);
		this.bipedHead.addChild(Head_r11);
		setRotationAngle(Head_r11, 0.2395F, 0.564F, 0.6779F);
		Head_r11.cubeList.add(new ModelBox(Head_r11, 0, 0, -1.3904F, -1.7468F, -1.273F, 4, 3, 1, 0.0F));

		ModelRenderer Head_r12 = new ModelRenderer(this);
		Head_r12.setRotationPoint(3.15F, -1.75F, -4.1F);
		this.bipedHead.addChild(Head_r12);
		setRotationAngle(Head_r12, 0.2395F, -0.564F, -0.6779F);
		Head_r12.cubeList.add(new ModelBox(Head_r12, 0, 0, -2.6096F, -1.7468F, -1.273F, 4, 3, 1, 0.0F));

		ModelRenderer Head_r13 = new ModelRenderer(this);
		Head_r13.setRotationPoint(4.15F, -4.75F, -4.1F);
		this.bipedHead.addChild(Head_r13);
		setRotationAngle(Head_r13, -0.109F, -0.3323F, 0.1928F);
		Head_r13.cubeList.add(new ModelBox(Head_r13, 0, 15, -1.9939F, -0.6438F, -0.5F, 2, 4, 1, 0.0F));

		ModelRenderer Head_r14 = new ModelRenderer(this);
		Head_r14.setRotationPoint(4.15F, -6.75F, -4.1F);
		this.bipedHead.addChild(Head_r14);
		setRotationAngle(Head_r14, 0.0F, -0.3491F, -0.1309F);
		Head_r14.cubeList.add(new ModelBox(Head_r14, 0, 21, -1.9939F, -1.6438F, -0.4F, 2, 3, 1, 0.0F));

		ModelRenderer Head_r15 = new ModelRenderer(this);
		Head_r15.setRotationPoint(0.5F, -1.0F, 4.5F);
		this.bipedHead.addChild(Head_r15);
		setRotationAngle(Head_r15, 0.3491F, 0.0F, 0.0F);
		Head_r15.cubeList.add(new ModelBox(Head_r15, 30, 0, -5.0F, -0.0706F, -1.0778F, 9, 1, 1, 0.0F));

		ModelRenderer Head_r16 = new ModelRenderer(this);
		Head_r16.setRotationPoint(3.5F, -8.0F, -0.5F);
		this.bipedHead.addChild(Head_r16);
		setRotationAngle(Head_r16, 0.0F, 0.0F, -0.1309F);
		Head_r16.cubeList.add(new ModelBox(Head_r16, 0, 21, 0.0F, 0.0F, -4.0F, 1, 8, 9, 0.0F));

		ModelRenderer Head_r17 = new ModelRenderer(this);
		Head_r17.setRotationPoint(-0.5F, -7.0F, -5.0F);
		this.bipedHead.addChild(Head_r17);
		setRotationAngle(Head_r17, 0.0F, 0.0F, -0.5672F);
		Head_r17.cubeList.add(new ModelBox(Head_r17, 5, 4, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F));

		ModelRenderer Head_r18 = new ModelRenderer(this);
		Head_r18.setRotationPoint(4.5F, -10.4F, 0.1F);
		this.bipedHead.addChild(Head_r18);
		setRotationAngle(Head_r18, 0.0F, 0.0F, 0.6545F);
		Head_r18.cubeList.add(new ModelBox(Head_r18, 3, 26, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F));
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