package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.AltarRelicDisplayItem;

public class AltarRelicDisplayModel extends GeoModel<AltarRelicDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelicDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelicDisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelicDisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
