package invoidable.breath.Entity.Client.Armor;

import invoidable.breath.Item.Custom.NichirinArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class NichirinArmorRenderer extends GeoArmorRenderer<NichirinArmorItem> {


    public NichirinArmorRenderer() {
        super(new NichirinArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";

    }
}
