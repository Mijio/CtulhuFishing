
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, CthulhufishingMod.MODID);
	public static final RegistryObject<Potion> MUSHROOMED_POTION = REGISTRY.register("mushroomed_potion", () -> new Potion(new MobEffectInstance(CthulhufishingModMobEffects.MUSHROOMED.get(), 3600, 0, false, true)));
}
