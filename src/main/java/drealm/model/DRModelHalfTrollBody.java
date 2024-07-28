package drealm.model;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import lotr.client.model.LOTRModelBiped;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DRModelHalfTrollBody extends LOTRModelBiped {
	
	public DRModelHalfTrollBody() {
		textureWidth = 64;
		textureHeight = 64;

		this.bipedBody = new ModelRenderer(this);
		this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.25F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 27, 12, 2.3F, -0.3F, -2.5F, 2, 0, 5, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 31, 16, 2.3F, -0.3F, -3.25F, 2, 0, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 23, 12, -4.2F, -0.3F, -2.5F, 2, 0, 5, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 27, 29, -4.4F, -0.3F, 2.5F, 9, 15, 0, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 0, 17, 2.3F, -0.3F, -3.15F, 2, 10, 0, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 12, 17, -4.2F, -0.3F, -3.15F, 2, 6, 0, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, 1.3F, 10.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 2.8F, 9.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 0.8F, 9.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 0.3F, 9.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, 3.5F, 8.7F, 0.05F, 1, 1, 2, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 9.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 8.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, 3.55F, 8.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, 3.5F, 6.7F, 0.05F, 1, 1, 2, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 6.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, 3.55F, 6.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 7.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, 1.3F, 8.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 2.8F, 7.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 0.8F, 7.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 0.3F, 7.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, 3.5F, 4.7F, 0.05F, 1, 1, 2, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 4.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, 3.55F, 4.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 5.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, 1.3F, 6.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 2.8F, 5.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 0.8F, 5.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 0.3F, 5.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, 3.5F, 2.7F, 0.05F, 1, 1, 2, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 2.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, 3.55F, 2.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 3.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, 1.3F, 4.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 2.8F, 3.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 0.8F, 3.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 0.3F, 3.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, 3.5F, 0.7F, 0.05F, 1, 1, 2, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 0.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, 3.55F, 0.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 3.3F, 1.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, 1.3F, 2.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 2.8F, 1.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, 0.8F, 1.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, 0.3F, 1.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -1.8F, 1.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -1.3F, 1.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, -3.3F, 2.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -3.8F, 1.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, -4.5F, 0.7F, 0.05F, 1, 1, 2, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 31, 16, -4.2F, -0.3F, -3.25F, 2, 0, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, -4.55F, 0.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 0.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 1.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -1.3F, 9.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -1.8F, 9.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -3.8F, 9.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, -3.3F, 10.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 9.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, -4.55F, 8.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 8.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, -4.5F, 8.7F, 0.05F, 1, 1, 2, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -1.3F, 7.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -1.8F, 7.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -3.8F, 7.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, -3.3F, 8.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 7.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, -4.55F, 6.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 6.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, -4.5F, 6.7F, 0.05F, 1, 1, 2, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -1.3F, 5.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -1.8F, 5.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -3.8F, 5.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, -3.3F, 6.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 5.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, -4.55F, 4.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 4.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, -4.5F, 4.7F, 0.05F, 1, 1, 2, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -1.3F, 3.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -1.8F, 3.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 45, 53, -3.8F, 3.7F, -2.7F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 53, -3.3F, 4.0F, -3.0F, 2, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 3.2F, -2.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 41, 48, -4.55F, 2.95F, -2.2F, 1, 1, 3, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 51, 50, -4.3F, 2.5F, 1.45F, 1, 1, 1, 0.0F));
		this.bipedBody.cubeList.add(new ModelBox(this.bipedBody, 50, 46, -4.5F, 2.7F, 0.05F, 1, 1, 2, 0.0F));

		this.bipedRightArm = new ModelRenderer(this);
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.cubeList.add(new ModelBox(this.bipedRightArm, 24, 0, -3.0F, -2.0F, -2.0F, 4, 8, 4, 0.25F));

		ModelRenderer cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-5.1F, 0.3F, 0.0F);
		this.bipedRightArm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 11, 1.5574F, 0.3333F, 2.0F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 11, 1.5574F, -1.6667F, 2.0F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 8, 1.5574F, -0.6667F, -2.0F, 1, 1, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 11, 1.5574F, 0.3333F, -3.0F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 11, 1.5574F, -1.6667F, -3.0F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 11, 2.0574F, 2.7333F, 2.1F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 11, 2.0574F, 0.7333F, 2.1F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 8, 2.0574F, 1.7333F, -1.9F, 1, 1, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 11, 2.0574F, 0.7333F, -2.9F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 11, 2.0574F, 2.7333F, -2.9F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 5, 1.0574F, -0.6667F, 0.7F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 5, 1.0574F, -2.6667F, 0.7F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 5, 1.0574F, -2.6667F, -4.3F, 1, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 2, 1.0574F, -1.6667F, -3.3F, 1, 1, 4, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 47, 5, 1.0574F, -0.6667F, -4.3F, 1, 1, 1, 0.0F));

		ModelRenderer cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedRightArm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7418F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 11, -4.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 11, -4.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 8, -4.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 11, -4.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 11, -4.0F, 1.0F, 2.0F, 1, 1, 1, 0.0F));

		this.bipedLeftArm = new ModelRenderer(this);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.bipedLeftArm.cubeList.add(new ModelBox(this.bipedLeftArm, 16, 16, -1.0F, -2.0F, -2.0F, 4, 8, 4, 0.25F));

		ModelRenderer cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(5.1F, 0.3F, 0.0F);
		this.bipedLeftArm.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3054F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 5, -2.0574F, -0.6667F, -4.3F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 5, -2.0574F, -2.6667F, -4.3F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 2, -2.0574F, -1.6667F, -3.3F, 1, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 5, -2.0574F, -2.6667F, 0.7F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 5, -2.0574F, -0.6667F, 0.7F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 11, -3.0574F, 0.7333F, -2.9F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 11, -3.0574F, 2.7333F, -2.9F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 8, -3.0574F, 1.7333F, -1.9F, 1, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 11, -3.0574F, 0.7333F, 2.1F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 11, -3.0574F, 2.7333F, 2.1F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 11, -2.5574F, 0.3333F, 2.0F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 11, -2.5574F, -1.6667F, 2.0F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 44, 8, -2.5574F, -0.6667F, -2.0F, 1, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 11, -2.5574F, -1.6667F, -3.0F, 1, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 11, -2.5574F, 0.3333F, -3.0F, 1, 1, 1, 0.0F));

		ModelRenderer cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedLeftArm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7418F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 11, 3.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 11, 3.0F, 1.0F, -3.0F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 11, 3.0F, 1.0F, 2.0F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 11, 3.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 8, 3.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F));
	}

	public void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}