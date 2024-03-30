package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.AltarRelic6TileEntity;

public class AltarRelic6BlockModel extends GeoModel<AltarRelic6TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic6TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic7.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic6TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic7.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic6TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
