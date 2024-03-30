package net.mcreator.cthulhufishing.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.entity.FossilFishEntity;

public class FossilFishModel extends GeoModel<FossilFishEntity> {
	@Override
	public ResourceLocation getAnimationResource(FossilFishEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/fossilized_fish.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FossilFishEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/fossilized_fish.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FossilFishEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}
