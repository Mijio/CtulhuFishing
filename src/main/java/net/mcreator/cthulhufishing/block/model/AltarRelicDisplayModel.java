package net.mcreator.cthulhufishing.block.model;

public class AltarRelicDisplayModel extends AnimatedGeoModel<AltarRelicDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelicDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelicDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelicDisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}