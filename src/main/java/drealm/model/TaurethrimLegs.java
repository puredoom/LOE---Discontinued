//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class TaurethrimLegs extends LOTRModelBiped
{
    public TaurethrimLegs() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        (this.bipedRightLeg = new ModelRenderer((ModelBase)this)).setRotationPoint(-2.0f, 12.0f, 0.0f);
        final ModelRenderer cube_r1 = new ModelRenderer((ModelBase)this);
        cube_r1.setRotationPoint(2.0f, 3.0f, 0.0f);
        this.bipedRightLeg.addChild(cube_r1);
        this.setRotationAngle(cube_r1, -3.1416f, 0.0f, 3.1416f);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 6, 0.0f, -3.0f, 2.0f, 4, 1, 1, 0.0f));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 13, 0.0f, -3.0f, -3.0f, 1, 8, 1, 0.0f));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 8, 0.0f, 3.0f, 2.0f, 2, 3, 1, 0.0f));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 14, 1.0f, -3.0f, -3.0f, 1, 4, 1, 0.0f));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 3, 0, 0.0f, -2.0f, 2.0f, 3, 5, 1, 0.0f));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 6, 9, 4.0f, -3.0f, -2.0f, 1, 1, 4, 0.0f));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 13, 2.0f, -3.0f, -3.0f, 2, 1, 1, 0.0f));
        (this.bipedLeftLeg = new ModelRenderer((ModelBase)this)).setRotationPoint(2.0f, 12.0f, 0.0f);
        final ModelRenderer cube_r2 = new ModelRenderer((ModelBase)this);
        cube_r2.setRotationPoint(-2.0f, 3.0f, 0.0f);
        this.bipedLeftLeg.addChild(cube_r2);
        this.setRotationAngle(cube_r2, -3.1416f, 0.0f, 3.1416f);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 0, -3.0f, -2.0f, 2.0f, 3, 5, 1, 0.0f));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 0, -2.0f, -3.0f, -3.0f, 1, 5, 1, 0.0f));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 14, -4.0f, -3.0f, -3.0f, 2, 1, 1, 0.0f));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 8, -2.0f, 3.0f, 2.0f, 2, 3, 1, 0.0f));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 6, -4.0f, -3.0f, 2.0f, 4, 1, 1, 0.0f));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 8, -5.0f, -3.0f, -2.0f, 1, 1, 4, 0.0f));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 13, -1.0f, -3.0f, -3.0f, 1, 8, 1, 0.0f));
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
        this.bipedLeftLeg.render(f5);
        this.bipedRightLeg.render(f5);
    }
}
