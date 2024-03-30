package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.AltarRelic6DisplayItem;

public class AltarRelic6DisplayModel extends GeoModel<AltarRelic6DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic6DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic7.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic6DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic7.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic6DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
