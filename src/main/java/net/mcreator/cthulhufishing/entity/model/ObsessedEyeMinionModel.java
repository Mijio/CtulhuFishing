package net.mcreator.cthulhufishing.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.entity.ObsessedEyeMinionEntity;

public class ObsessedEyeMinionModel extends GeoModel<ObsessedEyeMinionEntity> {
	@Override
	public ResourceLocation getAnimationResource(ObsessedEyeMinionEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/obsessed_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ObsessedEyeMinionEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/obsessed_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ObsessedEyeMinionEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}
