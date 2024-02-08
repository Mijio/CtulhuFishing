package net.mcreator.cthulhufishing.block.model;

public class AltarRelic5BlockModel extends AnimatedGeoModel<AltarRelic5TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic5TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic5TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic5TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}