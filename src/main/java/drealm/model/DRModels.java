//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.model;


import net.minecraftforge.common.*;
import net.minecraft.client.*;
import net.minecraft.entity.*;
import net.minecraft.client.model.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.player.*;
import cpw.mods.fml.common.eventhandler.*;
import drealm.database.*;
import lotr.client.model.*;
import java.util.*;
import net.minecraftforge.client.event.*;
import net.minecraft.item.*;
import lotr.common.entity.npc.*;
import lotr.common.item.*;

public class DRModels
{
    public static DRModels INSTANCE;
    private Map<ModelBiped, Map<Item, ModelBiped>> specialArmorModels;
    
    private DRModels() {
        this.specialArmorModels = new HashMap<ModelBiped, Map<Item, ModelBiped>>();
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    public static void setupArmorModels() {
        DRModels.INSTANCE = new DRModels();

    }

    public void copyModelRotations(final ModelBiped target, final ModelBiped src) {
        this.copyBoxRotations(target.bipedHead, src.bipedHead);
        this.copyBoxRotations(target.bipedHeadwear, src.bipedHeadwear);
        this.copyBoxRotations(target.bipedBody, src.bipedBody);
        this.copyBoxRotations(target.bipedRightArm, src.bipedRightArm);
        this.copyBoxRotations(target.bipedLeftArm, src.bipedLeftArm);
        this.copyBoxRotations(target.bipedRightLeg, src.bipedRightLeg);
        this.copyBoxRotations(target.bipedLeftLeg, src.bipedLeftLeg);
    }

    private void copyBoxRotations(final ModelRenderer target, final ModelRenderer src) {
        if (target != null && src != null) {
            target.rotationPointX = src.rotationPointX;
            target.rotationPointY = src.rotationPointY;
            target.rotationPointZ = src.rotationPointZ;
            target.rotateAngleX = src.rotateAngleX;
            target.rotateAngleY = src.rotateAngleY;
            target.rotateAngleZ = src.rotateAngleZ;
        }
    }


    public int getEntityArmorModel(RendererLivingEntity renderer, ModelBiped mainModel, EntityLivingBase entity, ItemStack armor, int slot) {
        ModelBiped armorModel = this.getSpecialArmorModel(armor, slot, entity, mainModel);
        if (armorModel != null) {
            Item armorItem = armor == null ? null : armor.getItem();
            if (armorItem instanceof ItemArmor) {
                Minecraft.getMinecraft().getTextureManager().bindTexture(RenderBiped.getArmorResource(entity, armor, slot, (String)null));
            }

            renderer.setRenderPassModel(armorModel);
            this.setupModelForRender(armorModel, mainModel, entity);
            if (armorItem instanceof ItemArmor) {
                int color = ((ItemArmor)armorItem).getColor(armor);
                if (color != -1) {
                    float r = (float)(color >> 16 & 255) / 255.0F;
                    float g = (float)(color >> 8 & 255) / 255.0F;
                    float b = (float)(color & 255) / 255.0F;
                    GL11.glColor3f(r, g, b);
                    if (armor.isItemEnchanted()) {
                        return 31;
                    }

                    return 16;
                }
            }

            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            return armor.isItemEnchanted() ? 15 : 1;
        } else {
            return 0;
        }
    }
    
    @SubscribeEvent
    public void getPlayerArmorModel(final RenderPlayerEvent.SetArmorModel event) {
        final RenderPlayer renderer = event.renderer;
        final ModelBiped mainModel = renderer.modelBipedMain;
        final EntityPlayer entityplayer = event.entityPlayer;
        final ItemStack armor = event.stack;
        final int slot = event.slot;
        final int result = this.getEntityArmorModel((RendererLivingEntity)renderer, mainModel, (EntityLivingBase)entityplayer, armor, 3 - slot);
        if (result > 0) {
            event.result = result;
        }
    }

    @SubscribeEvent
    public void preRenderEntity(RenderLivingEvent.Pre event) {
        EntityLivingBase entity = event.entity;
        RendererLivingEntity renderer = event.renderer;
        if (entity instanceof EntityPlayer && renderer instanceof RenderPlayer) {
            EntityPlayer entityplayer = (EntityPlayer)entity;
            RenderPlayer renderplayer = (RenderPlayer)renderer;
            ModelBiped mainModel = renderplayer.modelBipedMain;
            ModelBiped armorModel1 = renderplayer.modelArmor;
            ModelBiped armorModel2 = renderplayer.modelArmorChestplate;
            this.setupModelForRender(mainModel, mainModel, entityplayer);
            this.setupModelForRender(armorModel1, mainModel, entityplayer);
            this.setupModelForRender(armorModel2, mainModel, entityplayer);
        }

    }
    
    public ModelBiped getSpecialArmorModel(final ItemStack itemstack, final int slot, final EntityLivingBase entity, final ModelBiped mainModel) {
        if (itemstack == null) {
            return null;
        }
        final Item item = itemstack.getItem();
        final ModelBiped model = this.getSpecialModels(mainModel).get(item);
        if (model == null) {
            return null;
        }
        if (model instanceof LOTRModelLeatherHat) {
            ((LOTRModelLeatherHat)model).setHatItem(itemstack);
        }
        if (model instanceof LOTRModelHaradRobes) {
            ((LOTRModelHaradRobes)model).setRobeItem(itemstack);
        }
        if (model instanceof LOTRModelPartyHat) {
            ((LOTRModelPartyHat)model).setHatItem(itemstack);
        }
        if (model instanceof LOTRModelHeadPlate) {
            ((LOTRModelHeadPlate)model).setPlateItem(itemstack);
        }
        this.copyModelRotations(model, mainModel);
        this.setupArmorForSlot(model, slot);
        return model;
    }
    
    private Map<Item, ModelBiped> getSpecialModels(final ModelBiped key) {
        Map<Item, ModelBiped> map = this.specialArmorModels.get(key);
        if (map == null) {
            map = new HashMap<Item, ModelBiped>();
            map.put(DRRegistry.helmetGondor2, (ModelBiped)new DRModelGondorHelmet());
            map.put(DRRegistry.bodyGondor2, (ModelBiped)new DRModelGondorBody());
            map.put(DRRegistry.legsGondor2, (ModelBiped)new DRModelGondorLegs());
            map.put(DRRegistry.bootsGondor2, (ModelBiped)new DRModelGondorBoots());

            map.put(DRRegistry.bodyDunland2, (ModelBiped)new DRModelDunlandBody());
            map.put(DRRegistry.helmetDunland2, (ModelBiped)new DRModelDunlandHelmet());
            map.put(DRRegistry.legsDunland2, (ModelBiped)new DRModelDunlandLegs());
            map.put(DRRegistry.bootsDunland2, (ModelBiped)new DRModelDunlandBoots());

            map.put(DRRegistry.bodyWoodelf2, (ModelBiped)new WoodElfBody());
            map.put(DRRegistry.helmetWoodelf2, (ModelBiped)new WoodElfHelmet());
            map.put(DRRegistry.legsWoodelf2, (ModelBiped)new WoodElfLegs());
            map.put(DRRegistry.bootsWoodelf2, (ModelBiped)new WoodElfBoots());


            map.put(DRRegistry.bodyHarad2, (ModelBiped)new HaradBody());
            map.put(DRRegistry.helmetHarad2, (ModelBiped)new HaradHelmet());
            map.put(DRRegistry.legsHarad2, (ModelBiped)new HaradLegs());
            map.put(DRRegistry.bootsHarad2, (ModelBiped)new HaradBoots());
            map.put(DRRegistry.bodyTaurethrim2, (ModelBiped)new TaurethrimBody());
            map.put(DRRegistry.helmetTaurethrim2, (ModelBiped)new TaurethrimHelmet());
            map.put(DRRegistry.legsTaurethrim2, (ModelBiped)new TaurethrimLegs());
            map.put(DRRegistry.bootsTaurethrim2, (ModelBiped)new TaurethrimBoots());
            map.put(DRRegistry.bodyRohan2, (ModelBiped)new DRModelRohanChestplate());
            map.put(DRRegistry.helmetRohan2, (ModelBiped)new DRModelRohanHelmet());
            map.put(DRRegistry.legsRohan2, (ModelBiped)new DRModelRohanLegs());
            map.put(DRRegistry.bootsRohan2, (ModelBiped)new DRModelRohanBoots());
            map.put(DRRegistry.bodyHobbit3, (ModelBiped)new HobbitBody());
            map.put(DRRegistry.helmetHobbit3, (ModelBiped)new HobbitHelmet());
            map.put(DRRegistry.legsHobbit3, (ModelBiped)new HobbitLegs());
            map.put(DRRegistry.bootsHobbit3, (ModelBiped)new HobbitBoots());
            map.put(DRRegistry.bodyHalfTroll2, (ModelBiped)new DRModelHalfTrollBody());
            map.put(DRRegistry.helmetHalfTroll2, (ModelBiped)new DRModelHalfTrollHelmet());
            map.put(DRRegistry.legsHalfTroll2, (ModelBiped)new DRModelHalfTrollLegs());
            map.put(DRRegistry.bootsHalfTroll2, (ModelBiped)new DRModelHalfTrollBoots());

            map.put(DRRegistry.bodyAngmar2, (ModelBiped)new DRModelAngmarBody());
            map.put(DRRegistry.helmetAngmar2, (ModelBiped)new DRModelAngmarHelmet());
            map.put(DRRegistry.legsAngmar2, (ModelBiped)new DRModelAngmarLegs());
            map.put(DRRegistry.bootsAngmar2, (ModelBiped)new DRModelAngmarBoots());

// Mapping models for Dale2 armor
            map.put(DRRegistry.bodyDale2, (ModelBiped)new DRModelDaleBody());
            map.put(DRRegistry.helmetDale2, (ModelBiped)new DRModelDaleHelmet());
            map.put(DRRegistry.legsDale2, (ModelBiped)new DRModelDaleLegs());
            map.put(DRRegistry.bootsDale2, (ModelBiped)new DRModelDaleBoots());


// Mapping models for Dorwinion2 armor
            map.put(DRRegistry.bodyDorwinion2, (ModelBiped)new DRModelDorwinionBody());
            map.put(DRRegistry.helmetDorwinion2, (ModelBiped)new DRModelDorwinionHelmet());
            map.put(DRRegistry.legsDorwinion2, (ModelBiped)new DRModelDorwinionLegs());
            map.put(DRRegistry.bootsDorwinion2, (ModelBiped)new DRModelDorwinionBoots());

// Mapping models for Dunedain2 armor
            map.put(DRRegistry.bodyDunedain2, (ModelBiped)new DRModelDunedainBody());
            map.put(DRRegistry.helmetDunedain2, (ModelBiped)new DRModelDunedainHelmet());
            map.put(DRRegistry.legsDunedain2, (ModelBiped)new DRModelDunedainLegs());
            map.put(DRRegistry.bootsDunedain2, (ModelBiped)new DRModelDunedainBoots());

// Mapping models for Durin2 armor
            map.put(DRRegistry.bodyDurin2, (ModelBiped)new DRModelDurinBody());
            map.put(DRRegistry.helmetDurin2, (ModelBiped)new DRModelDurinHelmet());
            map.put(DRRegistry.legsDurin2, (ModelBiped)new DRModelDurinLegs());
            map.put(DRRegistry.bootsDurin2, (ModelBiped)new DRModelDurinBoots());


// Mapping models for HighElf2 armor
            map.put(DRRegistry.bodyHighElf2, (ModelBiped)new DRModelHighElfBody());
            map.put(DRRegistry.helmetHighElf2, (ModelBiped)new DRModelHighElfHelmet());
            map.put(DRRegistry.legsHighElf2, (ModelBiped)new DRModelHighElfLegs());
            map.put(DRRegistry.bootsHighElf2, (ModelBiped)new DRModelHighElfBoots());


// Mapping models for Isengard2 armor
            map.put(DRRegistry.bodyIsengard2, (ModelBiped)new DRModelIsengardBody());
            map.put(DRRegistry.helmetIsengard2, (ModelBiped)new DRModelIsengardHelmet());
            map.put(DRRegistry.legsIsengard2, (ModelBiped)new DRModelIsengardLegs());
            map.put(DRRegistry.bootsIsengard2, (ModelBiped)new DRModelIsengardBoots());

// Mapping models for Lothlorien2 armor
            map.put(DRRegistry.bodyLothlorien2, (ModelBiped)new DRModelLothlorienBody());
            map.put(DRRegistry.helmetLothlorien2, (ModelBiped)new DRModelLothlorienHelmet());
            map.put(DRRegistry.legsLothlorien2, (ModelBiped)new DRModelLothlorienLegs());
            map.put(DRRegistry.bootsLothlorien2, (ModelBiped)new DRModelLothlorienBoots());

// Mapping models for BlueMountains2 armor
            map.put(DRRegistry.bodyBlueMountains2, (ModelBiped)new DRModelBlueMountainsBody());
            map.put(DRRegistry.helmetBlueMountains2, (ModelBiped)new DRModelBlueMountainsHelmet());
            map.put(DRRegistry.legsBlueMountains2, (ModelBiped)new DRModelBlueMountainsLegs());
            map.put(DRRegistry.bootsBlueMountains2, (ModelBiped)new DRModelBlueMountainsBoots());

// Mapping models for RedMountains2 armor
            map.put(DRRegistry.bodyRedMountains2, (ModelBiped)new DRModelRedMountainsBody());
            map.put(DRRegistry.helmetRedMountains2, (ModelBiped)new DRModelRedMountainsHelmet());
            map.put(DRRegistry.legsRedMountains2, (ModelBiped)new DRModelRedMountainsLegs());
            map.put(DRRegistry.bootsRedMountains2, (ModelBiped)new DRModelRedMountainsBoots());

            map.put(DRRegistry.bodyDolGuldur2, (ModelBiped)new DRModelDolGuldurBody());
            map.put(DRRegistry.helmetDolGuldur2, (ModelBiped)new DRModelDolGuldurHelmet());
            map.put(DRRegistry.legsDolGuldur2, (ModelBiped)new DRModelDolGuldurLegs());
            map.put(DRRegistry.bootsDolGuldur2, (ModelBiped)new DRModelDolGuldurBoots());

            map.put(DRRegistry.bodyRhun2, (ModelBiped)new DRModelRhunBody());
            map.put(DRRegistry.helmetRhun2, (ModelBiped)new DRModelRhunHelmet());
            map.put(DRRegistry.legsRhun2, (ModelBiped)new DRModelRhunLegs());
            map.put(DRRegistry.bootsRhun2, (ModelBiped)new DRModelRhunBoots());

            map.put(DRRegistry.bodyMordor2, (ModelBiped)new DRModelMordorBody());
            map.put(DRRegistry.helmetMordor2, (ModelBiped)new DRModelMordorHelmet());
            map.put(DRRegistry.legsMordor2, (ModelBiped)new DRModelMordorLegs());
            map.put(DRRegistry.bootsMordor2, (ModelBiped)new DRModelMordorBoots());


            map.put(DRRegistry.bodyHalfTroll2, (ModelBiped)new DRModelHalfTrollBody());
            map.put(DRRegistry.helmetHalfTroll2, (ModelBiped)new DRModelHalfTrollHelmet());
            map.put(DRRegistry.legsHalfTroll2, (ModelBiped)new DRModelHalfTrollLegs());
            map.put(DRRegistry.bootsHalfTroll2, (ModelBiped)new DRModelHalfTrollBoots());

            map.put(DRRegistry.bodyGundabad2, (LOTRModelBiped)new DRModelGundabadBody());
            map.put(DRRegistry.helmetGundabad2, (LOTRModelBiped)new DRModelGundabadHelmet());
            map.put(DRRegistry.legsGundabad2, (LOTRModelBiped)new DRModelGundabadLegs());
            map.put(DRRegistry.bootsGundabad2, (LOTRModelBiped)new DRModelGundabadBoots());

            for (final ModelBiped armorModel : map.values()) {
                this.copyModelRotations(armorModel, key);
            }
            this.specialArmorModels.put(key, map);
        }
        return map;
    }



    
    public void setupArmorForSlot(final ModelBiped model, final int slot) {
        model.bipedHead.showModel = (slot == 0);
        model.bipedHeadwear.showModel = (slot == 0);
        model.bipedBody.showModel = (slot == 1 || slot == 2);
        model.bipedRightArm.showModel = (slot == 1);
        model.bipedLeftArm.showModel = (slot == 1);
        model.bipedRightLeg.showModel = (slot == 2 || slot == 3);
        model.bipedLeftLeg.showModel = (slot == 2 || slot == 3);
    }
    
    private void setupHeldItem(final ModelBiped model, final EntityLivingBase entity, final ItemStack itemstack, final boolean rightArm) {
        int value = 0;
        boolean aimBow = false;
        if (itemstack != null) {
            value = 1;
            final Item item = itemstack.getItem();
            boolean isRanged = false;
            if (itemstack.getItemUseAction() == EnumAction.bow) {
                isRanged = ((item instanceof LOTRItemSpear) ? (entity instanceof EntityPlayer) : (!(item instanceof ItemSword)));
            }
            if (item instanceof LOTRItemSling) {
                isRanged = true;
            }
            if (isRanged) {
                boolean aiming = model.aimedBow;
                if (entity instanceof EntityPlayer && LOTRItemCrossbow.isLoaded(itemstack)) {
                    aiming = true;
                }
                if (entity instanceof LOTREntityNPC) {
                    aiming = ((LOTREntityNPC)entity).clientCombatStance;
                }
                if (aiming) {
                    value = 3;
                    aimBow = true;
                }
            }
            if (item instanceof LOTRItemBanner) {
                value = 3;
            }
            if (entity instanceof EntityPlayer && ((EntityPlayer)entity).getItemInUseCount() > 0 && itemstack.getItemUseAction() == EnumAction.block) {
                value = 3;
            }
            if (entity instanceof LOTREntityNPC && ((LOTREntityNPC)entity).clientIsEating) {
                value = 3;
            }
        }
        if (rightArm) {
            model.heldItemRight = value;
            model.aimedBow = aimBow;
        }
        else {
            model.heldItemLeft = value;
        }
    }
    
    public void setupModelForRender(final ModelBiped model, final ModelBiped mainModel, final EntityLivingBase entity) {
        if (mainModel != null) {
            model.onGround = mainModel.onGround;
            model.isRiding = mainModel.isRiding;
            model.isChild = mainModel.isChild;
            model.isSneak = mainModel.isSneak;
        }
        else {
            model.onGround = 0.0f;
            model.isRiding = false;
            model.isChild = false;
            model.isSneak = false;
        }
        if (entity instanceof LOTREntityNPC) {
            model.bipedHeadwear.showModel = ((LOTREntityNPC)entity).shouldRenderNPCHair();
        }
        if (entity instanceof EntityPlayer) {
            final ItemStack heldRight = entity.getHeldItem();
            model.aimedBow = mainModel.aimedBow;
            this.setupHeldItem(model, entity, heldRight, true);
        }
        else {
            final ItemStack heldRight = (entity == null) ? null : entity.getHeldItem();
            final ItemStack heldLeft = (entity == null) ? null : ((entity instanceof LOTREntityNPC) ? ((LOTREntityNPC)entity).getHeldItemLeft() : null);
            this.setupHeldItem(model, entity, heldRight, true);
            this.setupHeldItem(model, entity, heldLeft, false);
        }
    }
}
