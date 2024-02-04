package net.mcreator.cthulhufishing.entity.model;

public class ObsessedEyeMobModel extends AnimatedGeoModel<ObsessedEyeMobEntity> {
	@Override
	public ResourceLocation getAnimationResource(ObsessedEyeMobEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/obsessed_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ObsessedEyeMobEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/obsessed_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ObsessedEyeMobEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}