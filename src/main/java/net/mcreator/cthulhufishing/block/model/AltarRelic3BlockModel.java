package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.AltarRelic3TileEntity;

public class AltarRelic3BlockModel extends AnimatedGeoModel<AltarRelic3TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic3TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic3TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic3TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/altar_relic_texture.png");
	}
}
