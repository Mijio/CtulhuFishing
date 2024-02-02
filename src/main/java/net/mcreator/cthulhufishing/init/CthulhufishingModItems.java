
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
import net.mcreator.cthulhufishing.item.KnifeForRitualBleedingItem;
import net.mcreator.cthulhufishing.item.HorseSculkFishItem;
import net.mcreator.cthulhufishing.item.HoodOfTheDeepVoidItem;
import net.mcreator.cthulhufishing.item.HermitSlulkFishItem;
import net.mcreator.cthulhufishing.item.GlutonSculkFishItem;
import net.mcreator.cthulhufishing.item.DormantEyeOfTheAbyssItem;
import net.mcreator.cthulhufishing.item.CrimsonJellyfishItem;
import net.mcreator.cthulhufishing.item.CrimsonFishItem;
import net.mcreator.cthulhufishing.item.CrimsonCrunchItem;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CthulhufishingMod.MODID);
	public static final RegistryObject<Item> THIRD_EYE = REGISTRY.register("third_eye", () -> new ThirdEyeItem());
	public static final RegistryObject<Item> CRIMSON_FISH = REGISTRY.register("crimson_fish", () -> new CrimsonFishItem());
	public static final RegistryObject<Item> DEEP_OIL = block(CthulhufishingModBlocks.DEEP_OIL, CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB);
	public static final RegistryObject<Item> CTULHU_ALTAR_FISH = block(CthulhufishingModBlocks.CTULHU_ALTAR_FISH, CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB);
	public static final RegistryObject<Item> DORMANT_EYE_OF_THE_ABYSS = REGISTRY.register("dormant_eye_of_the_abyss", () -> new DormantEyeOfTheAbyssItem());
	public static final RegistryObject<Item> KNIFE_FOR_RITUAL_BLEEDING = REGISTRY.register("knife_for_ritual_bleeding", () -> new KnifeForRitualBleedingItem());
	public static final RegistryObject<Item> HOOD_OF_THE_DEEP_VOID_HELMET = REGISTRY.register("hood_of_the_deep_void_helmet", () -> new HoodOfTheDeepVoidItem.Helmet());
	public static final RegistryObject<Item> CRIMSON_JELLYFISH = REGISTRY.register("crimson_jellyfish", () -> new CrimsonJellyfishItem());
	public static final RegistryObject<Item> CRIMSON_CRUNCH = REGISTRY.register("crimson_crunch", () -> new CrimsonCrunchItem());
	public static final RegistryObject<Item> HERMIT_SLULK_FISH = REGISTRY.register("hermit_slulk_fish", () -> new HermitSlulkFishItem());
	public static final RegistryObject<Item> HORSE_SCULK_FISH = REGISTRY.register("horse_sculk_fish", () -> new HorseSculkFishItem());
	public static final RegistryObject<Item> GLUTON_SCULK_FISH = REGISTRY.register("gluton_sculk_fish", () -> new GlutonSculkFishItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
