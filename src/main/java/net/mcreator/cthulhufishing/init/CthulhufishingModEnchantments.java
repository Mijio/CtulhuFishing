
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.cthulhufishing.enchantment.SculkCatcherEnchantmentEnchantment;
import net.mcreator.cthulhufishing.enchantment.PowerOfTheExtinctEnchantment;
import net.mcreator.cthulhufishing.enchantment.MushroomCatcherEnchantmentEnchantment;
import net.mcreator.cthulhufishing.enchantment.CrimsonCatcherEnchantEnchantment;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, CthulhufishingMod.MODID);
	public static final RegistryObject<Enchantment> SCULK_CATCHER_ENCHANTMENT = REGISTRY.register("sculk_catcher_enchantment", () -> new SculkCatcherEnchantmentEnchantment());
	public static final RegistryObject<Enchantment> CRIMSON_CATCHER_ENCHANT = REGISTRY.register("crimson_catcher_enchant", () -> new CrimsonCatcherEnchantEnchantment());
	public static final RegistryObject<Enchantment> POWER_OF_THE_EXTINCT = REGISTRY.register("power_of_the_extinct", () -> new PowerOfTheExtinctEnchantment());
	public static final RegistryObject<Enchantment> MUSHROOM_CATCHER_ENCHANTMENT = REGISTRY.register("mushroom_catcher_enchantment", () -> new MushroomCatcherEnchantmentEnchantment());
}
