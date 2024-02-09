package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.AltarRelic3DisplayItem;

public class AltarRelic3DisplayModel extends AnimatedGeoModel<AltarRelic3DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic3DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic4.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic3DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic4.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic3DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/blocks/texture_relic.png");
	}
}
