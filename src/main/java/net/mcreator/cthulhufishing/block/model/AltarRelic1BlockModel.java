package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.AltarRelic1TileEntity;

public class AltarRelic1BlockModel extends AnimatedGeoModel<AltarRelic1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic1TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic1TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic1TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/texture_relic.png");
	}
}
