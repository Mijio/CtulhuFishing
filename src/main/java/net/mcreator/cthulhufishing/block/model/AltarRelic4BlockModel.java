package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.AltarRelic4TileEntity;

public class AltarRelic4BlockModel extends GeoModel<AltarRelic4TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic4TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic4TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic4TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
