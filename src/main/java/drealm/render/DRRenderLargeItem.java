//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\David\Downloads\Minecraft-Deobfuscator3000-master\1.7.10 stable mappings"!

//Decompiled by Procyon!

package drealm.render;

import lotr.client.render.item.*;
import net.minecraft.item.*;
import com.google.common.base.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.util.*;
import net.minecraft.client.*;
import net.minecraft.client.resources.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.client.renderer.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DRRenderLargeItem extends LOTRRenderLargeItem
{
    public static Map<String, Float> sizeFolders;
    public final Item theItem;
    public final String folderName;
    public final float largeIconScale;
    public List<LOTRRenderLargeItem.ExtraLargeIconToken> extraTokens;
    public IIcon largeIcon;
    
    public DRRenderLargeItem(final Item item, final String dir, final float f) {
        super(item, dir, f);
        this.extraTokens = new ArrayList<LOTRRenderLargeItem.ExtraLargeIconToken>();
        this.theItem = item;
        this.folderName = dir;
        this.largeIconScale = f;
    }
    
    public static ResourceLocation getLargeTexturePath(final Item item, final String folder) {
        String itemIconString = item.getUnlocalizedName().substring("item.".length());
        itemIconString = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, itemIconString);
        final GameRegistry.UniqueIdentifier UID = GameRegistry.findUniqueIdentifierFor(item);
        final String modID = StringUtils.isNullOrEmpty(UID.modId) ? "minecraft" : UID.modId;
        return new ResourceLocation(modID, "textures/items/" + folder + "/" + itemIconString + ".png");
    }

    public static DRRenderLargeItem getRendererIfLarge(Item item) {
        for (Entry<String, Float> folder : sizeFolders.entrySet()) {
            float iconScale = folder.getValue();
            try {
                ResourceLocation resLoc = getLargeTexturePath(item, folder.getKey());
                IResource res = Minecraft.getMinecraft().getResourceManager().getResource(resLoc);
                if (res == null) {
                    continue;
                }
                return new DRRenderLargeItem(item, folder.getKey(), iconScale);
            } catch (IOException ignored) {
            }
        }
        return null;
    }
    
    public void doTransformations() {
        GL11.glTranslatef(-(this.largeIconScale - 1.0f) / 2.0f, -(this.largeIconScale - 1.0f) / 2.0f, 0.0f);
        GL11.glScalef(this.largeIconScale, this.largeIconScale, 1.0f);
    }
    
    public LOTRRenderLargeItem.ExtraLargeIconToken extraIcon(final String name) {
        final LOTRRenderLargeItem.ExtraLargeIconToken token = new LOTRRenderLargeItem.ExtraLargeIconToken(name);
        this.extraTokens.add(token);
        return token;
    }
    
    public void registerIcons(final IIconRegister register) {
        this.largeIcon = this.registerLargeIcon(register, null);
        for (final LOTRRenderLargeItem.ExtraLargeIconToken token : this.extraTokens) {
            token.icon = this.registerLargeIcon(register, token.name);
        }
    }
    
    public IIcon registerLargeIcon(final IIconRegister register, final String extra) {
        String itemName = this.theItem.getUnlocalizedName().substring("item.".length());
        itemName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, itemName);
        final GameRegistry.UniqueIdentifier UID = GameRegistry.findUniqueIdentifierFor(this.theItem);
        final String modID = (StringUtils.isNullOrEmpty(UID.modId) ? "minecraft" : UID.modId) + ":";
        final StringBuilder path = new StringBuilder().append(modID).append(this.folderName).append("/").append(itemName);
        if (!StringUtils.isNullOrEmpty(extra)) {
            path.append("_").append(extra);
        }
        return register.registerIcon(path.toString());
    }
    
    public void renderLargeItem() {
        this.renderLargeItem(this.largeIcon);
    }
    
    public void renderLargeItem(final IIcon icon) {
        this.doTransformations();
        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.locationItemsTexture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final Tessellator tess = Tessellator.instance;
        ItemRenderer.renderItemIn2D(tess, icon.getMaxU(), icon.getMinV(), icon.getMinU(), icon.getMaxV(), icon.getIconWidth(), icon.getIconHeight(), 0.0625f);
    }
    
    static {
        (DRRenderLargeItem.sizeFolders = new HashMap<String, Float>()).put("large-2x", 2.0f);
        DRRenderLargeItem.sizeFolders.put("large-3x", 3.0f);
    }
}
