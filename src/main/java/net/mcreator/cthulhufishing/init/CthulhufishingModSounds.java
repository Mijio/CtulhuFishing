
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
	public static final RegistryObject<SoundEvent> RITUAL_BLEEDING_KNIFE = REGISTRY.register("ritual_bleeding_knife", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "ritual_bleeding_knife")));
	public static final RegistryObject<SoundEvent> CATCH_STRANGE_FISH = REGISTRY.register("catch_strange_fish", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "catch_strange_fish")));
	public static final RegistryObject<SoundEvent> HOOD_ABLITY = REGISTRY.register("hood_ablity", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "hood_ablity")));
	public static final RegistryObject<SoundEvent> OBSESSED_EYE_SPAWN = REGISTRY.register("obsessed_eye_spawn", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "obsessed_eye_spawn")));
	public static final RegistryObject<SoundEvent> OBSESSED_EYE_DAMAGE = REGISTRY.register("obsessed_eye_damage", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "obsessed_eye_damage")));
}
