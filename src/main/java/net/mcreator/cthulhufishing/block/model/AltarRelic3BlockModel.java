package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.AltarRelic3TileEntity;

public class AltarRelic3BlockModel extends GeoModel<AltarRelic3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic3TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic3TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic3TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
