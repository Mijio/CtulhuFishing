package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.Obelisk1TileEntity;

public class Obelisk1BlockModel extends GeoModel<Obelisk1TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Obelisk1TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/greatest_eye_obelisk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Obelisk1TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/greatest_eye_obelisk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Obelisk1TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_obelisk_eye.png");
	}
}
