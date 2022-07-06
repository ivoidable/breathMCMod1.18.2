package invoidable.breath.Tab;

import invoidable.breath.Item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab TOOLS_TAB = new CreativeModeTab("tools_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NICHIRIN_SWORD.get());
        }
    };

    public static final CreativeModeTab MATERIAL_TAB = new CreativeModeTab("material_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NICHIRIN.get());
        }
    };

}
