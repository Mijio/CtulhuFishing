package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.ObeliskOfGteatestObsessedEyeTileEntity;

public class ObeliskOfGteatestObsessedEyeBlockModel extends GeoModel<ObeliskOfGteatestObsessedEyeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ObeliskOfGteatestObsessedEyeTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/greatest_eye_obelisk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ObeliskOfGteatestObsessedEyeTileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/greatest_eye_obelisk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ObeliskOfGteatestObsessedEyeTileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_obelisk_eye.png");
	}
}
