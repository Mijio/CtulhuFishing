package net.mcreator.cthulhufishing.block.model;

public class BlockOreEyeDisplayModel extends AnimatedGeoModel<BlockOreEyeDisplayItem> {
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
		return new ResourceLocation("cthulhufishing", "textures/blocks/texture_block_eye_item.png");
	}
}