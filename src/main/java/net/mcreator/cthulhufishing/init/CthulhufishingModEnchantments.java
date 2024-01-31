
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.cthulhufishing.enchantment.CrimsonCatcherEnchantEnchantment;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CthulhufishingMod.MODID);
	public static final RegistryObject<Enchantment> CRIMSON_CATCHER_ENCHANT = REGISTRY.register("crimson_catcher_enchant", () -> new CrimsonCatcherEnchantEnchantment());
}
