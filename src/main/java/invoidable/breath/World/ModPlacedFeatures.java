package invoidable.breath.World;

import invoidable.breath.World.Feature.ModOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> NICHIRIN_ORE_PLACED = PlacementUtils.register("citrine_ore_placed",
            ModConfiguredFeatures.NICHIRIN_ORE, ModOrePlacement.commonOrePlacement(36, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

}
