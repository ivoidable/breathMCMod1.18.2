package invoidable.breath.Block.entity;

import invoidable.breath.Block.ModBlocks;
import invoidable.breath.Block.entity.Custom.ElementifierBlockEntity;
import invoidable.breath.Breath;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Breath.MODID);


    public static final RegistryObject<BlockEntityType<ElementifierBlockEntity>> ELEMENTIFIER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("elementifier_block_entity", () ->
                    BlockEntityType.Builder.of(ElementifierBlockEntity::new, ModBlocks.ELEMENTIFIER.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
