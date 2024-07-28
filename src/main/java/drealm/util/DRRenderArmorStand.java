package drealm.util;


import drealm.model.DRModels;
import io.gitlab.dwarfyassassin.lotrucp.client.util.FakeArmorStandEntity;
import lotr.client.LOTRClientProxy;
import lotr.client.model.LOTRArmorModels;
import lotr.client.model.LOTRModelArmorStand;
import lotr.common.item.LOTRItemPlate;
import lotr.common.tileentity.LOTRTileEntityArmorStand;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.opengl.GL11;

public class DRRenderArmorStand
        extends TileEntitySpecialRenderer {
    private static ResourceLocation standTexture = new ResourceLocation("lotr:item/armorStand.png");
    private static ModelBase standModel = new LOTRModelArmorStand();
    private static ModelBiped modelBipedMain = new ModelBiped(0.0F);
    private static ModelBiped modelBiped1 = new ModelBiped(1.0F);
    private static ModelBiped modelBiped2 = new ModelBiped(0.5F);
    private static float BIPED_ARM_ROTATION = -7.07353F;
    private static float BIPED_TICKS_EXISTED = 46.88954F;


    public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) {
        LOTRTileEntityArmorStand armorStand = (LOTRTileEntityArmorStand) tileentity;
        FakeArmorStandEntity fakeArmorEntity = FakeArmorStandEntity.INSTANCE;
        GL11.glPushMatrix();
        GL11.glDisable((int) 2884);
        GL11.glEnable((int) 32826);
        GL11.glEnable((int) 3008);
        GL11.glTranslatef((float) ((float) d + 0.5f), (float) ((float) d1 + 1.5f), (float) ((float) d2 + 0.5f));
        switch (armorStand.getBlockMetadata() & 3) {
            case 0:
                GL11.glRotatef((float) 0.0f, (float) 0.0f, (float) 1.0f, (float) 0.0f);
                break;
            case 1:
                GL11.glRotatef((float) 270.0f, (float) 0.0f, (float) 1.0f, (float) 0.0f);
                break;
            case 2:
                GL11.glRotatef((float) 180.0f, (float) 0.0f, (float) 1.0f, (float) 0.0f);
                break;
            case 3:
                GL11.glRotatef((float) 90.0f, (float) 0.0f, (float) 1.0f, (float) 0.0f);
        }
        GL11.glScalef((float) -1.0f, (float) -1.0f, (float) 1.0f);
        float scale = 0.0625f;
        bindTexture(standTexture);
        standModel.render((Entity) fakeArmorEntity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, scale);
        DRModels.INSTANCE.setupModelForRender(modelBipedMain, null, fakeArmorEntity);
        LOTRArmorModels.INSTANCE.setupModelForRender(modelBipedMain, null, fakeArmorEntity);
        GL11.glTranslatef((float) 0.0f, (float) -0.1875f, (float) 0.0f);
        for (int slot = 0; slot < 4; ++slot) {
            float f4;
            ItemStack itemstack = armorStand.getStackInSlot(slot);
            if (itemstack == null || !(itemstack.getItem() instanceof ItemArmor) && !(itemstack.getItem() instanceof LOTRItemPlate)) {
                continue;
            }
            boolean isArmor = itemstack.getItem() instanceof ItemArmor;
            if (isArmor) {
                bindTexture(RenderBiped.getArmorResource((Entity) fakeArmorEntity, (ItemStack) itemstack, (int) slot, null));
            }
            ModelBiped armorModel = slot == 2 ? modelBiped2 : modelBiped1;
            DRModels.INSTANCE.setupArmorForSlot(armorModel, slot);
            LOTRArmorModels.INSTANCE.setupArmorForSlot(armorModel, slot);
            armorModel = ForgeHooksClient.getArmorModel((EntityLivingBase) fakeArmorEntity, (ItemStack) itemstack, (int) slot, (ModelBiped) armorModel);
            ModelBiped specialModel = DRModels.INSTANCE.getSpecialArmorModel(itemstack, slot, fakeArmorEntity, modelBipedMain);
            if (specialModel != null) {
                armorModel = specialModel;
            }
            DRModels.INSTANCE.setupModelForRender(armorModel, null, fakeArmorEntity);
            LOTRArmorModels.INSTANCE.setupModelForRender(armorModel, null, fakeArmorEntity);
            float f1 = 1.0f;
            boolean isColoredArmor = false;
            if (isArmor) {
                int j = ((ItemArmor) itemstack.getItem()).getColor(itemstack);
                if (j != -1) {
                    float f2 = (float) (j >> 16 & 0xFF) / 255.0f;
                    float f3 = (float) (j >> 8 & 0xFF) / 255.0f;
                    f4 = (float) (j & 0xFF) / 255.0f;
                    GL11.glColor3f((float) (f1 * f2), (float) (f1 * f3), (float) (f1 * f4));
                    isColoredArmor = true;
                } else {
                    GL11.glColor3f((float) f1, (float) f1, (float) f1);
                }
            } else {
                GL11.glColor3f((float) f1, (float) f1, (float) f1);
            }
            armorModel.render((Entity) fakeArmorEntity, BIPED_ARM_ROTATION, 0.0f, BIPED_TICKS_EXISTED, 0.0f, 0.0f, scale);
            if (isColoredArmor) {
                bindTexture(RenderBiped.getArmorResource(null, (ItemStack) itemstack, (int) slot, (String) "overlay"));
                f1 = 1.0f;
                GL11.glColor3f((float) f1, (float) f1, (float) f1);
                armorModel.render((Entity) fakeArmorEntity, BIPED_ARM_ROTATION, 0.0f, BIPED_TICKS_EXISTED, 0.0f, 0.0f, scale);
            }
            if (!itemstack.isItemEnchanted()) {
                continue;
            }
            float f2 = (float) armorStand.ticksExisted + f;
            bindTexture(LOTRClientProxy.enchantmentTexture);
            GL11.glEnable((int) 3042);
            float f3 = 0.5f;
            GL11.glColor4f((float) f3, (float) f3, (float) f3, (float) 1.0f);
            GL11.glDepthFunc((int) 514);
            GL11.glDepthMask((boolean) false);
            for (int k = 0; k < 2; ++k) {
                GL11.glDisable((int) 2896);
                f4 = 0.76f;
                GL11.glColor4f((float) (0.5f * f4), (float) (0.25f * f4), (float) (0.8f * f4), (float) 1.0f);
                GL11.glBlendFunc((int) 768, (int) 1);
                GL11.glMatrixMode((int) 5890);
                GL11.glLoadIdentity();
                float f5 = 0.33333334f;
                GL11.glScalef((float) f5, (float) f5, (float) f5);
                GL11.glRotatef((float) (30.0f - (float) k * 60.0f), (float) 0.0f, (float) 0.0f, (float) 1.0f);
                float f6 = f2 * (0.001f + (float) k * 0.003f) * 20.0f;
                GL11.glTranslatef((float) 0.0f, (float) f6, (float) 0.0f);
                GL11.glMatrixMode((int) 5888);
                armorModel.render((Entity) fakeArmorEntity, BIPED_ARM_ROTATION, 0.0f, BIPED_TICKS_EXISTED, 0.0f, 0.0f, scale);
            }
            GL11.glColor4f((float) 1.0f, (float) 1.0f, (float) 1.0f, (float) 1.0f);
            GL11.glMatrixMode((int) 5890);
            GL11.glDepthMask((boolean) true);
            GL11.glLoadIdentity();
            GL11.glMatrixMode((int) 5888);
            GL11.glEnable((int) 2896);
            GL11.glDisable((int) 3042);
            GL11.glDepthFunc((int) 515);
        }
        GL11.glEnable((int) 2884);
        GL11.glDisable((int) 32826);
        GL11.glPopMatrix();
    }
}

