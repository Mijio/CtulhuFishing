
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.cthulhufishing.world.features.ores.DeepOilFeature;
import net.mcreator.cthulhufishing.CthulhufishingMod;

@Mod.EventBusSubscriber
public class CthulhufishingModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CthulhufishingMod.MODID);
	public static final RegistryObject<Feature<?>> DEEP_OIL = REGISTRY.register("deep_oil", DeepOilFeature::feature);
}