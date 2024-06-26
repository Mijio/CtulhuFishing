package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.AltarRelic5DisplayItem;

public class AltarRelic5DisplayModel extends GeoModel<AltarRelic5DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AltarRelic5DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/sealed_relic6.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AltarRelic5DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/sealed_relic6.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AltarRelic5DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_relic.png");
	}
}
