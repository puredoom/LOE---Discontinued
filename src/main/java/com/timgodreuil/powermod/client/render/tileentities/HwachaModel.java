package com.timgodreuil.powermod.client.render.tileentities;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HwachaModel extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public HwachaModel() {
		textureWidth = 256;
		textureHeight = 256;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 2.3682F, -1.2635F, 2.3682F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 115, 124, -28.1386F, 16.6027F, -20.8046F, 20, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 115, 124, -27.9876F, 16.6362F, -4.8601F, 20, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 115, 124, -28.5967F, 16.5012F, -36.7817F, 20, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 115, 124, -28.1386F, 16.6027F, -20.8046F, 20, 1, 1, 0.0F));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 115, 124, -27.9876F, 16.6362F, -4.8601F, 20, 1, 1, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.3682F, 1.2635F, -2.3682F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 115, 124, 8.1386F, 16.6027F, -20.8046F, 20, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 115, 124, 7.9876F, 16.6362F, -4.8601F, 20, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 115, 124, 8.5967F, 16.5012F, -36.7817F, 20, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 115, 124, 8.1386F, 16.6027F, -20.8046F, 20, 1, 1, 0.0F));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 115, 124, 7.9876F, 16.6362F, -4.8601F, 20, 1, 1, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 1.789F, 0.0F, -3.1416F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 126, -18.0F, -5.0236F, -4.8601F, 36, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 126, -18.0F, -5.1783F, -20.8046F, 36, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 126, -18.0F, -5.6475F, -36.7817F, 36, 1, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 0, 17.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 20, 14.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 0, 15.0F, -23.4311F, -33.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 53, 15.0F, -5.4311F, -35.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 80, 7.0F, -5.4311F, -35.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 19, 7.0F, -23.4311F, -33.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 0, 6.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 20, 9.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 83, -1.0F, -5.4311F, -35.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 60, -1.0F, -23.4311F, -33.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -2.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 20, 1.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 83, -9.0F, -5.4311F, -35.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 0, -9.0F, -23.4311F, -33.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 33, -10.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 33, -7.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 0, -17.0F, -5.4311F, -35.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 19, -17.0F, -23.4311F, -33.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 0, -18.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 20, -15.0F, -23.4311F, -35.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 38, 17.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 38, 14.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 60, 15.0F, -23.4311F, -17.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 3, 15.0F, -5.4311F, -19.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 6, 7.0F, -5.4311F, -19.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 78, 0, 7.0F, -23.4311F, -17.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 0, 6.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 20, 9.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 9, -1.0F, -5.4311F, -19.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 78, 19, -1.0F, -23.4311F, -17.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 0, -2.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 38, 1.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 12, -9.0F, -5.4311F, -19.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 78, 60, -9.0F, -23.4311F, -17.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 18, -10.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 38, -7.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 20, -17.0F, -5.4311F, -19.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 65, 79, -17.0F, -23.4311F, -17.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 60, -18.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 0, -15.0F, -23.4311F, -19.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 60, -15.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 60, -18.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 71, 79, -17.0F, -23.4311F, -1.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 23, -17.0F, -5.4311F, -3.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 60, -7.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 20, -10.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 77, 79, -9.0F, -23.4311F, -1.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 26, -9.0F, -5.4311F, -3.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 60, 1.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 60, -2.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 80, -1.0F, -23.4311F, -1.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 29, -1.0F, -5.4311F, -3.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 60, 9.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 60, 6.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 80, 7.0F, -23.4311F, -1.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 32, 7.0F, -5.4311F, -3.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 35, 15.0F, -5.4311F, -3.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 80, 15.0F, -23.4311F, -1.8054F, 2, 18, 1, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 60, 14.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 60, 17.0F, -23.4311F, -3.8054F, 1, 18, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 60, -22.0F, -22.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 63, -22.0F, -22.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 66, -13.0F, -22.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 69, -13.0F, -22.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 84, 72, -5.0F, -22.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 86, -5.0F, -22.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 86, 3.0F, -22.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 86, 3.0F, -22.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 86, 11.0F, -22.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 86, 11.0F, -22.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 86, 19.0F, -22.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 39, 19.0F, -22.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 42, 19.0F, -22.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 88, 45, 11.0F, -22.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 89, 3.0F, -22.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 89, -5.0F, -22.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 89, -13.0F, -22.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 89, -22.0F, -22.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 89, -22.0F, -22.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 89, -13.0F, -22.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 89, 84, -5.0F, -22.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 89, 87, 3.0F, -22.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 1, 11.0F, -22.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 4, 19.0F, -22.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 32, -24.0F, -23.4311F, 0.1946F, 48, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 37, -24.0F, -23.4311F, -12.8054F, 48, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 42, -24.0F, -23.4311F, -28.8054F, 48, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 57, -24.0F, -23.4311F, -41.8054F, 48, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 7, 19.0F, -26.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 62, -24.0F, -25.4311F, 0.1946F, 48, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 10, 11.0F, -26.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 13, 3.0F, -26.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 21, -5.0F, -26.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 24, -13.0F, -26.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 27, -22.0F, -26.4311F, 1.1946F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 30, 19.0F, -26.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 67, -24.0F, -25.4311F, -41.8054F, 48, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 33, 11.0F, -26.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 36, 3.0F, -26.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 61, -5.0F, -26.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 64, -13.0F, -26.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 67, -22.0F, -26.4311F, -40.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 70, 19.0F, -26.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 90, 73, 19.0F, -26.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 89, 90, 11.0F, -26.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 92, 11.0F, -26.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 26, 92, 3.0F, -26.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 92, 3.0F, -26.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 92, -5.0F, -26.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 92, -5.0F, -26.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 92, -13.0F, -26.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 89, 93, -13.0F, -26.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 94, 40, -22.0F, -26.4311F, -11.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 94, 43, -22.0F, -26.4311F, -27.8054F, 2, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 72, -24.0F, -25.4311F, -12.8054F, 48, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 77, -24.0F, -25.4311F, -28.8054F, 48, 1, 4, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 40, 17.0F, -24.4311F, -35.8054F, 7, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 40, 9.0F, -24.4311F, -35.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 43, 17.0F, -24.4311F, -19.8054F, 7, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 43, 9.0F, -24.4311F, -19.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 46, 17.0F, -24.4311F, -3.8054F, 7, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 74, 38, 9.0F, -24.4311F, -3.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 74, 41, -15.0F, -24.4311F, -35.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 49, -24.0F, -24.4311F, -35.8054F, 7, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 74, 44, -15.0F, -24.4311F, -19.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 52, -24.0F, -24.4311F, -19.8054F, 7, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 80, -15.0F, -24.4311F, -3.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 55, -24.0F, -24.4311F, -3.8054F, 7, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 80, -7.0F, -24.4311F, -35.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 77, 1.0F, -24.4311F, -35.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 17, -7.0F, -24.4311F, -3.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 83, 1.0F, -24.4311F, -3.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 83, 1.0F, -24.4311F, -19.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 83, 80, -7.0F, -24.4311F, -19.8054F, 6, 1, 2, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 49, -24.0F, -24.4311F, -33.8054F, 48, 1, 7, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 109, -24.0F, -24.4311F, -42.8054F, 48, 1, 7, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 0, -24.0F, -24.4311F, -17.8054F, 48, 1, 7, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 8, -24.0F, -24.4311F, -26.8054F, 48, 1, 7, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 16, -24.0F, -24.4311F, -10.8054F, 48, 1, 7, 0.0F));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 114, 24, -24.0F, -24.4311F, -1.8054F, 48, 1, 7, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, -3.1416F, 0.0F, 3.1416F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 114, 82, -21.0F, -1.0F, -22.0F, 42, 1, 3, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 5, 0, 23.0F, -26.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 0, 21.0F, -26.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 0, -22.0F, -26.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 20, -24.0F, -26.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 0, 23.0F, -22.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 26, 20, 21.0F, -22.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 0, -22.0F, -22.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 20, -24.0F, -22.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 33, 23.0F, -18.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 33, 21.0F, -18.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 35, -22.0F, -18.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 0, -24.0F, -18.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 20, 23.0F, -14.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 40, 21.0F, -14.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 43, -22.0F, -14.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 44, 0, -24.0F, -14.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 46, 20, 23.0F, -10.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 46, 21.0F, -10.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 49, -22.0F, -10.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 0, -24.0F, -10.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 50, 38, 23.0F, -6.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 2, 21.0F, -6.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 4, -22.0F, -6.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 6, -24.0F, -6.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 8, 23.0F, -2.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 10, 21.0F, -2.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 12, -22.0F, -2.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 14, -24.0F, -2.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 16, 23.0F, -30.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 52, -22.0F, -30.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 53, 21.0F, -30.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 0, -24.0F, -30.0F, 2.4F, 1, 1, 1, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 22.0F, -30.0F, 1.4F, 1, 30, 3, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 0, -23.0F, -30.0F, 1.4F, 1, 30, 3, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 0, -24.0F, -1.0F, -24.0F, 3, 1, 48, 0.0F));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 60, 21.0F, -1.0F, -24.0F, 3, 1, 48, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, -2.3038F, 0.0F, -3.1416F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 22.0F, -18.8355F, -16.0591F, 1, 2, 58, 0.0F));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 60, -23.0F, -18.8355F, -16.0591F, 1, 2, 58, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}