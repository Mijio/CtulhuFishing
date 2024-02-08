package net.mcreator.cthulhufishing.block.model;

public class AltarRelic2BlockModel extends AnimatedGeoModel<AltarRelic2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic2TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic2TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic2TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}