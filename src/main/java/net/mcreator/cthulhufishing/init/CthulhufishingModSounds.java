
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
	public static final RegistryObject<SoundEvent> ALTAR_LOOT = REGISTRY.register("altar_loot", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "altar_loot")));
	public static final RegistryObject<SoundEvent> REAGENT_INPUT = REGISTRY.register("reagent_input", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "reagent_input")));
	public static final RegistryObject<SoundEvent> RELIC_IDLE = REGISTRY.register("relic_idle", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "relic_idle")));
	public static final RegistryObject<SoundEvent> RELIC_LOOT = REGISTRY.register("relic_loot", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "relic_loot")));
	public static final RegistryObject<SoundEvent> VOID_MERCHANT = REGISTRY.register("void_merchant", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "void_merchant")));
	public static final RegistryObject<SoundEvent> STEP_TO_ABYSS_XYTHE = REGISTRY.register("step_to_abyss_xythe", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "step_to_abyss_xythe")));
	public static final RegistryObject<SoundEvent> DAMAGE_FOSSIL_FISH = REGISTRY.register("damage_fossil_fish", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "damage_fossil_fish")));
	public static final RegistryObject<SoundEvent> IDLE_FOSSIL_FISH = REGISTRY.register("idle_fossil_fish", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "idle_fossil_fish")));
	public static final RegistryObject<SoundEvent> FOSSIL_FISH_ATTACK = REGISTRY.register("fossil_fish_attack", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "fossil_fish_attack")));
	public static final RegistryObject<SoundEvent> JUMP_FOSSIL_FISH_ATTACK = REGISTRY.register("jump_fossil_fish_attack", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "jump_fossil_fish_attack")));
	public static final RegistryObject<SoundEvent> SUMMON_FOSSIL_FISH = REGISTRY.register("summon_fossil_fish", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "summon_fossil_fish")));
	public static final RegistryObject<SoundEvent> FROZEN_CRAB_SCREAM = REGISTRY.register("frozen_crab_scream", () -> new SoundEvent(new ResourceLocation("cthulhufishing", "frozen_crab_scream")));
}
