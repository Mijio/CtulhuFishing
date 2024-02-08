package net.mcreator.cthulhufishing.block.model;

public class AltarRelic6DisplayModel extends AnimatedGeoModel<AltarRelic6DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic6DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic6DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic6DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}