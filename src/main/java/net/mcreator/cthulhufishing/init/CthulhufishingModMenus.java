
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.cthulhufishing.world.inventory.CtulhuAltarMenu;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CthulhufishingMod.MODID);
	public static final RegistryObject<MenuType<CtulhuAltarMenu>> CTULHU_ALTAR = REGISTRY.register("ctulhu_altar", () -> IForgeMenuType.create(CtulhuAltarMenu::new));
}
