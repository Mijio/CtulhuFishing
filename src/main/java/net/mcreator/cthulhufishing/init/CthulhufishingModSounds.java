
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CthulhufishingMod.MODID);
	public static final RegistryObject<SoundEvent> CATCHFISHMEN = REGISTRY.register("catchfishmen", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "catchfishmen")));
}
