package net.mcreator.cthulhufishing.block.model;

public class AltarRelic1DisplayModel extends AnimatedGeoModel<AltarRelic1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic1DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic1DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic1DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}