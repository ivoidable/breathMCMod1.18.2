package invoidable.breath.Entity.Client.Armor;

import invoidable.breath.Breath;
import invoidable.breath.Item.Custom.NichirinArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NichirinArmorModel extends AnimatedGeoModel<NichirinArmorItem> {

    @Override
    public ResourceLocation getModelLocation(NichirinArmorItem object) {
        return new ResourceLocation(Breath.MODID, "geo/custom_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(NichirinArmorItem object) {
        return new ResourceLocation(Breath.MODID, "textures/models/armor/armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(NichirinArmorItem animatable) {
        return new ResourceLocation(Breath.MODID, "animations/armor_animations.json");
    }

}
