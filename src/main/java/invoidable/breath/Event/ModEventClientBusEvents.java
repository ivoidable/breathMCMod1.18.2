package invoidable.breath.Event;

import invoidable.breath.Breath;
import invoidable.breath.Entity.Client.Armor.NichirinArmorRenderer;
import invoidable.breath.Item.Custom.NichirinArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = Breath.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(NichirinArmorItem.class, new NichirinArmorRenderer());
    }
}
