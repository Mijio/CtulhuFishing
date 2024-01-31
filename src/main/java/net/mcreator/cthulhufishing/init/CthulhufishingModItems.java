
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cthulhufishing.item.ThirdEyeItem;
import net.mcreator.cthulhufishing.item.CrimsonFishItem;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CthulhufishingMod.MODID);
	public static final RegistryObject<Item> THIRD_EYE = REGISTRY.register("third_eye", () -> new ThirdEyeItem());
	public static final RegistryObject<Item> CRIMSON_FISH = REGISTRY.register("crimson_fish", () -> new CrimsonFishItem());
	public static final RegistryObject<Item> DEEP_OIL = block(CthulhufishingModBlocks.DEEP_OIL, CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB);
	public static final RegistryObject<Item> CTULHU_ALTAR_FISH = block(CthulhufishingModBlocks.CTULHU_ALTAR_FISH, CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
