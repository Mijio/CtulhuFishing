package net.mcreator.cthulhufishing.block.model;

public class AltarRelicBlockModel extends AnimatedGeoModel<AltarRelicTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelicTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelicTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelicTileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}