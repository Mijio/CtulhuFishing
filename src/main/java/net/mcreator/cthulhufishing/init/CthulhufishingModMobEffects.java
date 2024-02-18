
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.cthulhufishing.potion.RitualBleedingMobEffect;
import net.mcreator.cthulhufishing.potion.MadnessMobEffect;
import net.mcreator.cthulhufishing.potion.AncientCurseMobEffect;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CthulhufishingMod.MODID);
	public static final RegistryObject<MobEffect> MADNESS = REGISTRY.register("madness", () -> new MadnessMobEffect());
	public static final RegistryObject<MobEffect> RITUAL_BLEEDING = REGISTRY.register("ritual_bleeding", () -> new RitualBleedingMobEffect());
	public static final RegistryObject<MobEffect> ANCIENT_CURSE = REGISTRY.register("ancient_curse", () -> new AncientCurseMobEffect());
}
