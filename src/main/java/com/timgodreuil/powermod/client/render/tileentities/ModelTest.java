//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.timgodreuil.powermod.client.render.tileentities;

import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class ModelTest extends ModelBase
{
    private ModelRenderer testRenderer;
    
    public ModelTest() {
        (this.testRenderer = new ModelRenderer((ModelBase)this, 0, 0)).setRotationPoint(0.0f, 8.0f, 0.0f);
        this.testRenderer.addBox(-7.0f, -2.0f, -2.0f, 14, 4, 4);
        this.testRenderer.setTextureSize(64, 32);
        this.testRenderer.setTextureOffset(0, 8);
        this.testRenderer.addBox(-8.0f, -3.0f, -3.0f, 1, 6, 6);
        this.testRenderer.setTextureOffset(0, 8);
        this.testRenderer.addBox(7.0f, -3.0f, -3.0f, 1, 6, 6);
    }
    
    public void render(final Entity p_78088_1_, final float p_78088_2_, final float p_78088_3_, final float p_78088_4_, final float p_78088_5_, final float p_78088_6_, final float p_78088_7_) {
        this.testRenderer.render(p_78088_7_);
    }
}
