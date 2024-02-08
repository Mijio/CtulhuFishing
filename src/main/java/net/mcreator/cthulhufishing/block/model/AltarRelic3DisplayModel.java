package net.mcreator.cthulhufishing.block.model;

public class AltarRelic3DisplayModel extends AnimatedGeoModel<AltarRelic3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic3DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic3DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic3DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}