package invoidable.breath.Event;

import invoidable.breath.Breath;
import invoidable.breath.Entity.Client.Armor.NichirinArmorRenderer;
import invoidable.breath.Event.loot.NichirinShardFromZombieAdditionModifier;
import invoidable.breath.Item.Custom.NichirinArmorItem;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Breath.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new NichirinShardFromZombieAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(Breath.MODID,"nichirin_shard_from_zombie"))
        );
    }

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(NichirinArmorItem.class, new NichirinArmorRenderer());
    }

}
