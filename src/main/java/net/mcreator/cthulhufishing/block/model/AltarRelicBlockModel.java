package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.AltarRelicTileEntity;

public class AltarRelicBlockModel extends GeoModel<AltarRelicTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelicTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelicTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelicTileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
