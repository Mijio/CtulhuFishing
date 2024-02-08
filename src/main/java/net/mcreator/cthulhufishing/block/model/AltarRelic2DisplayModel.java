package net.mcreator.cthulhufishing.block.model;

public class AltarRelic2DisplayModel extends AnimatedGeoModel<AltarRelic2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic2DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic2DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic2DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}