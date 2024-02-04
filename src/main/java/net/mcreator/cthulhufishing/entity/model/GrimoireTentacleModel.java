package net.mcreator.cthulhufishing.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.entity.GrimoireTentacleEntity;

public class GrimoireTentacleModel extends AnimatedGeoModel<GrimoireTentacleEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrimoireTentacleEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/block_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrimoireTentacleEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/block_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrimoireTentacleEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}
