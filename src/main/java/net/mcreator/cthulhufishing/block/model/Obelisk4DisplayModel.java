package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.display.Obelisk4DisplayItem;

public class Obelisk4DisplayModel extends GeoModel<Obelisk4DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Obelisk4DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/greatest_eye_obelisk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Obelisk4DisplayItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/greatest_eye_obelisk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Obelisk4DisplayItem entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_obelisk_eye.png");
	}
}
