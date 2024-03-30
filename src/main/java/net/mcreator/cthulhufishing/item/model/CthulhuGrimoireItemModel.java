package net.mcreator.cthulhufishing.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.item.CthulhuGrimoireItem;

public class CthulhuGrimoireItemModel extends GeoModel<CthulhuGrimoireItem> {
	@Override
	public ResourceLocation getAnimationResource(CthulhuGrimoireItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/cthulhugrimoire.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CthulhuGrimoireItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/cthulhugrimoire.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CthulhuGrimoireItem animatable) {
		return new ResourceLocation("cthulhufishing", "textures/item/texture_cthulhu_grimoire.png");
	}
}
