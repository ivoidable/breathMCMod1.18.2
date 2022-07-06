package invoidable.breath.Item;

import invoidable.breath.Breath;
import invoidable.breath.Item.Custom.DemonSoulItem;
import invoidable.breath.Item.Custom.NichirinArmorItem;
import invoidable.breath.Item.Custom.NichirinSwordItem;
import invoidable.breath.Tab.ModCreativeModeTab;
import invoidable.breath.Util.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Breath.MODID);


    // THE ITEMS //

    public static final RegistryObject<Item> NICHIRIN = ITEMS.register("nichirin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB).fireResistant().stacksTo(12)));

    public static final RegistryObject<Item> RAW_NICHIRIN = ITEMS.register("raw_nichirin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB).fireResistant().stacksTo(12)));

    public static final RegistryObject<Item> DEMON_SOUL = ITEMS.register("demon_soul",
            () -> new DemonSoulItem(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB).fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> BURNING_DEMON_SOUL = ITEMS.register("burning_demon_soul",
            () -> new DemonSoulItem(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB).fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> FREEZING_DEMON_SOUL = ITEMS.register("freezing_demon_soul",
            () -> new DemonSoulItem(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB).fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> THUNDER_DEMON_SOUL = ITEMS.register("thunder_demon_soul",
            () -> new DemonSoulItem(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB).fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> AIR_DEMON_SOUL = ITEMS.register("air_demon_soul",
            () -> new DemonSoulItem(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB).fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> NICHIRIN_SHARD = ITEMS.register("nichirin_shard",
            () -> new DemonSoulItem(new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB).fireResistant().stacksTo(32)));

    // END ITEMS //


    // THE WEAPONS //

    public static final RegistryObject<Item> NICHIRIN_SWORD = ITEMS.register("nichirin_sword",
            () -> new NichirinSwordItem(ModTiers.NICHIRIN,4, 2.0f, new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB).fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> FLAME_NICHIRIN_SWORD = ITEMS.register("flame_nichirin_sword",
            () -> new NichirinSwordItem(ModTiers.NICHIRIN, 5,2.5f, new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB).fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> ICE_NICHIRIN_SWORD = ITEMS.register("ice_nichirin_sword",
            () -> new NichirinSwordItem(ModTiers.NICHIRIN,6,1.2f, new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB).fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> AIR_NICHIRIN_SWORD = ITEMS.register("air_nichirin_sword",
            () -> new NichirinSwordItem(ModTiers.NICHIRIN,5,2.5f, new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB).fireResistant().stacksTo(1)));

    public static final RegistryObject<Item> THUNDER_NICHIRIN_SWORD = ITEMS.register("thunder_nichirin_sword",
            () -> new NichirinSwordItem(ModTiers.NICHIRIN,8,4.0f, new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB).fireResistant().stacksTo(1)));

    // END WEAPONS //

    // THE ARMOR //

    public static final RegistryObject<Item> NICHIRIN_HELMET = ITEMS.register("nichirin_helmet",
            () -> new NichirinArmorItem(ModArmorItems.NICHIRIN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static final RegistryObject<Item> NICHIRIN_CHESTPLATE = ITEMS.register("nichirin_chestplate",
            () -> new NichirinArmorItem(ModArmorItems.NICHIRIN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static final RegistryObject<Item> NICHIRIN_LEGGING = ITEMS.register("nichirin_legging",
            () -> new NichirinArmorItem(ModArmorItems.NICHIRIN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static final RegistryObject<Item> NICHIRIN_BOOTS = ITEMS.register("nichirin_boots",
            () -> new NichirinArmorItem(ModArmorItems.NICHIRIN, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    // END ARMOR //

    // THE MUSIC //

    public static final RegistryObject<Item> PIRATE_TUNES_MUSIC_DISC = ITEMS.register("pirate_tunes_music_disc",
            () -> new RecordItem(12, ModSounds.PIRATES_OF_THE_CARIBBEAN, new Item.Properties().tab(ModCreativeModeTab.MATERIAL_TAB).stacksTo(1)));

    // END MUSIC //


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
