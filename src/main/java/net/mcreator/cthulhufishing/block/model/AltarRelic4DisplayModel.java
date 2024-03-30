package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.AltarRelic4DisplayItem;

public class AltarRelic4DisplayModel extends GeoModel<AltarRelic4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic4DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic4DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic4DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
