package net.mcreator.cthulhufishing.block.model;

public class AltarRelic4BlockModel extends AnimatedGeoModel<AltarRelic4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic4TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic4TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic4TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}