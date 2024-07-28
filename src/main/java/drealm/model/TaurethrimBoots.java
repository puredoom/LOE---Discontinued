//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;

import lotr.client.model.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;

public class TaurethrimBoots extends LOTRModelBiped
{
    public TaurethrimBoots() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        (this.bipedLeftLeg = new ModelRenderer((ModelBase)this)).setRotationPoint(0.0f, 24.0f, 0.0f);
        this.bipedLeftLeg.cubeList.add(new ModelBox(this.bipedLeftLeg, 0, 7, -2.0f, 11.0f, -3.0f, 5, 1, 6, 0.0f));
        (this.bipedRightLeg = new ModelRenderer((ModelBase)this)).setRotationPoint(0.0f, 24.0f, 0.0f);
        this.bipedRightLeg.cubeList.add(new ModelBox(this.bipedRightLeg, 0, 0, -3.0f, 11.0f, -3.0f, 5, 1, 6, 0.0f));
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
