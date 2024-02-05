
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CthulhufishingMod.MODID);
	public static final RegistryObject<SimpleParticleType> PORTAL_TENTACLE_PARTICLE = REGISTRY.register("portal_tentacle_particle", () -> new SimpleParticleType(false));
}
