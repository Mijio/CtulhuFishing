package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.AltarRelic5TileEntity;

public class AltarRelic5BlockModel extends GeoModel<AltarRelic5TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic5TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic6.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic5TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic6.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic5TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
