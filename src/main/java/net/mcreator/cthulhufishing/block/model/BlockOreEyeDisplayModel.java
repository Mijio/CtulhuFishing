package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.BlockOreEyeDisplayItem;

public class BlockOreEyeDisplayModel extends GeoModel<BlockOreEyeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlockOreEyeDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/block_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlockOreEyeDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/block_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlockOreEyeDisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_block_eye_item.png");
	}
}
