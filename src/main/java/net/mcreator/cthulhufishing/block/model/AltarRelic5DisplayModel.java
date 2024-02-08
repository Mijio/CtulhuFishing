package net.mcreator.cthulhufishing.block.model;

public class AltarRelic5DisplayModel extends AnimatedGeoModel<AltarRelic5DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic5DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic5DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic5DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}