package net.mcreator.cthulhufishing.block.model;

public class AltarRelic6BlockModel extends AnimatedGeoModel<AltarRelic6TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic6TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic6TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic6TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}