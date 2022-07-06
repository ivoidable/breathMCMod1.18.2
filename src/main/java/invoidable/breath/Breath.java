package invoidable.breath;

import com.mojang.logging.LogUtils;
import invoidable.breath.Block.ModBlocks;
import invoidable.breath.Block.entity.ModBlockEntities;
import invoidable.breath.Item.ModArmorItems;
import invoidable.breath.Item.ModItems;
import invoidable.breath.Screen.ElementifierScreen;
import invoidable.breath.Screen.ModMenuTypes;
import invoidable.breath.Util.sound.ModSounds;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.example.GeckoLibMod;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("breath")
public class Breath {

    public static final String MODID = "breath";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Breath() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GeckoLibMod.DISABLE_IN_DEV = true;

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModSounds.register(modEventBus);


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        MenuScreens.register(ModMenuTypes.ELEMENTIFIER_MENU.get(), ElementifierScreen::new);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Some preinit code
        LOGGER.error("TEST ERROR");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
