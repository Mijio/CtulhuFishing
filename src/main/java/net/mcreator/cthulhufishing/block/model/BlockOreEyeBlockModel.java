package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.BlockOreEyeTileEntity;

public class BlockOreEyeBlockModel extends AnimatedGeoModel<BlockOreEyeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlockOreEyeTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/block_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlockOreEyeTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/block_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlockOreEyeTileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/texture_block_eye_item.png");
	}
}
