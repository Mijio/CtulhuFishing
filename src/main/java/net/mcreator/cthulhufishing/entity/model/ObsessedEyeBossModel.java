package net.mcreator.cthulhufishing.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.entity.ObsessedEyeBossEntity;

public class ObsessedEyeBossModel extends GeoModel<ObsessedEyeBossEntity> {
	@Override
	public ResourceLocation getAnimationResource(ObsessedEyeBossEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/obsessed_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ObsessedEyeBossEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/obsessed_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ObsessedEyeBossEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}
