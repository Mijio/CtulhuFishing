package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.RelicAltarTileEntity;

public class RelicAltarBlockModel extends AnimatedGeoModel<RelicAltarTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RelicAltarTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/block_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RelicAltarTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/block_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RelicAltarTileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/texture_block_eye_item.png");
	}
}
