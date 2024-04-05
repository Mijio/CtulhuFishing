package net.mcreator.cthulhufishing.block.model;

public class ObeliskOfGteatestObsessedEyeDisplayModel extends GeoModel<ObeliskOfGteatestObsessedEyeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ObeliskOfGteatestObsessedEyeDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/greatest_eye_obelisk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ObeliskOfGteatestObsessedEyeDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/greatest_eye_obelisk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ObeliskOfGteatestObsessedEyeDisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_obelisk_eye.png");
	}
}