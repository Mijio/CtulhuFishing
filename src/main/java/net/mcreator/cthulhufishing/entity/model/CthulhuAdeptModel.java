package net.mcreator.cthulhufishing.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.entity.CthulhuAdeptEntity;

public class CthulhuAdeptModel extends GeoModel<CthulhuAdeptEntity> {
	@Override
	public ResourceLocation getAnimationResource(CthulhuAdeptEntity entity) {
		return new ResourceLocation("cthulhufishing", "animations/model_cthulhu_adept.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CthulhuAdeptEntity entity) {
		return new ResourceLocation("cthulhufishing", "geo/model_cthulhu_adept.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CthulhuAdeptEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/entities/" + entity.getTexture() + ".png");
	}

}
