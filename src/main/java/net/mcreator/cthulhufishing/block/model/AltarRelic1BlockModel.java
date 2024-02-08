package net.mcreator.cthulhufishing.block.model;

public class AltarRelic1BlockModel extends AnimatedGeoModel<AltarRelic1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic1TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic1TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic1TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}