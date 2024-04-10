package net.mcreator.cthulhufishing.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.block.entity.Obelisk2TileEntity;

public class Obelisk2BlockModel extends GeoModel<Obelisk2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Obelisk2TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "animations/greatest_eye_obelisk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Obelisk2TileEntity animatable) {
		return new ResourceLocation("cthulhufishing", "geo/greatest_eye_obelisk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Obelisk2TileEntity entity) {
		return new ResourceLocation("cthulhufishing", "textures/block/texture_obelisk_eye.png");
	}
}
