package net.mcreator.cthulhufishing.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.item.ObsessedEyeStaffRItem;

public class ObsessedEyeStaffRItemModel extends GeoModel<ObsessedEyeStaffRItem> {
	@Override
	public ResourceLocation getAnimationResource(ObsessedEyeStaffRItem animatable) {
		return new ResourceLocation("cthulhufishing", "animations/staff_of_obsessed_eyes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ObsessedEyeStaffRItem animatable) {
		return new ResourceLocation("cthulhufishing", "geo/staff_of_obsessed_eyes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ObsessedEyeStaffRItem animatable) {
		return new ResourceLocation("cthulhufishing", "textures/item/texture_staff_of_obsessed_eyes.png");
	}
}
