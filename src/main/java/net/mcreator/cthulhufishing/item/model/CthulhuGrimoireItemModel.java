package net.mcreator.cthulhufishing.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.item.CthulhuGrimoireItem;

public class CthulhuGrimoireItemModel extends AnimatedGeoModel<CthulhuGrimoireItem> {
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
		return new ResourceLocation("cthulhufishing", "textures/items/texture_cthulhu_grimoire.png");
	}
}
