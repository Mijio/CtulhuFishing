package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.AltarRelic1DisplayItem;

public class AltarRelic1DisplayModel extends GeoModel<AltarRelic1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic1DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic1DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic1DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
