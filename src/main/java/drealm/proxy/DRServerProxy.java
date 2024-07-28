package drealm.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import drealm.database.DRGuiId;
import drealm.block.DRBlockTableRedDwarven;
import net.minecraft.server.MinecraftServer;

import java.net.InetSocketAddress;
import java.lang.reflect.Field;
import java.util.List;

public class DRServerProxy implements IGuiHandler {

    private static final String SERVER_IP = "45.137.205.219";
    private static final int SERVER_PORT = 4000;

    public Object getClientGuiElement(final int ID, final EntityPlayer entityplayer, final World world, final int i, final int j, final int k) {
        final DRGuiId gui = DRGuiId.values()[ID];
        switch (gui) {
            case RED_DWARVEN: {
                return new DRBlockTableRedDwarven.Gui(entityplayer.inventory, world, i, j, k);
            }
            default: {
                return null;
            }
        }
    }

    public Object getServerGuiElement(final int ID, final EntityPlayer entityplayer, final World world, final int i, final int j, final int k) {
        final DRGuiId gui = DRGuiId.values()[ID];
        switch (gui) {
            case RED_DWARVEN: {
                return new DRBlockTableRedDwarven.Container(entityplayer.inventory, world, i, j, k);
            }
            default: {
                return null;
            }
        }
    }

    public void onInit(final FMLInitializationEvent event) {
    }

    public void preInit(final FMLPreInitializationEvent event) {
    }

    public void registerArmorModels() {
    }
}
