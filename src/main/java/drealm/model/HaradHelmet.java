//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class HaradHelmet extends LOTRModelBiped {

    public HaradHelmet() {
        textureWidth = 64;
        textureHeight = 64;

        this.bipedHead = new ModelRenderer(this);
        this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 27, 12, 2.0F, -2.0F, -1.0F, 3, 2, 6, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, 3.8F, -2.0F, -4.4F, 1, 2, 4, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 22, -1.0F, -2.5F, 4.0F, 3, 2, 1, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 17, -4.0F, -3.0F, 4.0F, 3, 2, 1, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 12, -4.75F, -3.5F, 2.0F, 1, 2, 3, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 27, 12, -4.75F, -5.0F, -4.0F, 1, 2, 2, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 22, -4.75F, -7.0F, -4.75F, 1, 2, 2, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 0, -3.75F, -7.5F, -4.75F, 7, 2, 2, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 6, 3.0F, -7.75F, -4.75F, 2, 2, 2, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 0, -5.0F, -8.75F, -5.05F, 10, 2, 10, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 12, -4.5F, -9.25F, -4.55F, 9, 1, 9, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 22, -4.0F, -9.75F, -3.8F, 8, 1, 8, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 25, -4.75F, -4.5F, -2.0F, 1, 2, 2, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 24, 26, -4.75F, -4.0F, 0.0F, 1, 2, 2, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 0, 31, -4.65F, -7.0F, -4.6F, 2, 7, 9, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 22, 38, -0.45F, -7.0F, 3.6F, 5, 7, 1, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 23, 22, 2.65F, -7.0F, -4.6F, 2, 7, 9, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 30, 4, -3.05F, -3.0F, -4.8F, 6, 4, 1, 0.0F));
        this.bipedHead.cubeList.add(new ModelBox(this.bipedHead, 36, 20, -4.55F, -7.0F, 3.7F, 5, 7, 1, 0.0F));
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
