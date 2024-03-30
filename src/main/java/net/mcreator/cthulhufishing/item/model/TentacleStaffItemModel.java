package net.mcreator.cthulhufishing.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.item.TentacleStaffItem;

public class TentacleStaffItemModel extends GeoModel<TentacleStaffItem> {
	@Override
	public ResourceLocation getAnimationResource(TentacleStaffItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/tentacle_staff_item.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TentacleStaffItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/tentacle_staff_item.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TentacleStaffItem animatable) {
		return new ResourceLocation("cthulhufishing", "textures/item/texture_tentacle_staff.png");
	}
}
