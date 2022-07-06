package invoidable.breath.Item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier NICHIRIN = new ForgeTier(6, 2000, 2f, 3f, 30, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.NICHIRIN.get()));

}
