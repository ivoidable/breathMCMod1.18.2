package invoidable.breath.Block;

import invoidable.breath.Block.Custom.ElementifierBlock;
import invoidable.breath.Breath;
import invoidable.breath.Item.ModItems;
import invoidable.breath.Tab.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Breath.MODID);


    public static final RegistryObject<Block> NICHIRIN_BLOCK = registerBlock("nichirin_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(12f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MATERIAL_TAB);

    public static final RegistryObject<Block> NICHIRIN_ORE = registerBlock("nichirin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(12f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MATERIAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_NICHIRIN_ORE = registerBlock("deepslate_nichirin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(12f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MATERIAL_TAB);

    public static final RegistryObject<Block> ELEMENTIFIER = registerBlock("elementifier",
            () -> new ElementifierBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()),
            ModCreativeModeTab.MATERIAL_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
