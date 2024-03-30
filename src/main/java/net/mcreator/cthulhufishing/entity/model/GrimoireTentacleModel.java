package net.mcreator.cthulhufishing.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.entity.GrimoireTentacleEntity;

public class GrimoireTentacleModel extends GeoModel<GrimoireTentacleEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrimoireTentacleEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/tentacleattack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrimoireTentacleEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/tentacleattack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrimoireTentacleEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}
