package net.mcreator.cthulhufishing.item.model;

public class TentacleStaffItemModel extends AnimatedGeoModel<TentacleStaffItem> {
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
		return new ResourceLocation("cthulhufishing", "textures/items/texture_tentacle_staff.png");
	}
}