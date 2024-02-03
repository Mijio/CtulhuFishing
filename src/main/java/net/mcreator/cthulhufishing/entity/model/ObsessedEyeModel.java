package net.mcreator.cthulhufishing.entity.model;

public class ObsessedEyeModel extends AnimatedGeoModel<ObsessedEyeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ObsessedEyeEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/block_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ObsessedEyeEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/block_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ObsessedEyeEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}