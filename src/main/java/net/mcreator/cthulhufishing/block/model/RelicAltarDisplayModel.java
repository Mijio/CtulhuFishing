package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.RelicAltarDisplayItem;

public class RelicAltarDisplayModel extends AnimatedGeoModel<RelicAltarDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RelicAltarDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/block_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RelicAltarDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/block_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RelicAltarDisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/texture_block_eye_item.png");
	}
}
