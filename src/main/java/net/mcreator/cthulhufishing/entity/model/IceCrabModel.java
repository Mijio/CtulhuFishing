package net.mcreator.cthulhufishing.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.entity.IceCrabEntity;

public class IceCrabModel extends AnimatedGeoModel<IceCrabEntity> {
	@Override
	public ResourceLocation getAnimationResource(IceCrabEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/ice_crab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IceCrabEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/ice_crab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IceCrabEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}
