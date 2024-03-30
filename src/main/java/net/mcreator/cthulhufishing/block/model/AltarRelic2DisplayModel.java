package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.AltarRelic2DisplayItem;

public class AltarRelic2DisplayModel extends GeoModel<AltarRelic2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic2DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic2DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic2DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
