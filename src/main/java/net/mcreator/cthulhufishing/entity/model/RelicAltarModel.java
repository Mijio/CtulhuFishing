package net.mcreator.cthulhufishing.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.entity.RelicAltarEntity;

public class RelicAltarModel extends AnimatedGeoModel<RelicAltarEntity> {
	@Override
	public ResourceLocation getAnimationResource(RelicAltarEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/block_eye.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RelicAltarEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/block_eye.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RelicAltarEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}
