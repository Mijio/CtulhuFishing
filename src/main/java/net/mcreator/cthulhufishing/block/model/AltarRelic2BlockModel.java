package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.AltarRelic2TileEntity;

public class AltarRelic2BlockModel extends AnimatedGeoModel<AltarRelic2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic2TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic2TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic2TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}
