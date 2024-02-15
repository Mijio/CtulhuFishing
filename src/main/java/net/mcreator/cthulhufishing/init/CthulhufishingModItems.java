
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cthulhufishing.item.TreasureBagItem;
import net.mcreator.cthulhufishing.item.ThirdEyeItem;
import net.mcreator.cthulhufishing.item.TentacleStaffItem;
import net.mcreator.cthulhufishing.item.SwordOfRevelationItem;
import net.mcreator.cthulhufishing.item.StepToAbyssItem;
import net.mcreator.cthulhufishing.item.SculkRingItem;
import net.mcreator.cthulhufishing.item.SculkLureItem;
import net.mcreator.cthulhufishing.item.RunicTabletItem;
import net.mcreator.cthulhufishing.item.RevelationSteelItem;
import net.mcreator.cthulhufishing.item.RevelationFabricItem;
import net.mcreator.cthulhufishing.item.RelicItem;
import net.mcreator.cthulhufishing.item.ReagentItem;
import net.mcreator.cthulhufishing.item.MaskOfRevelationItem;
import net.mcreator.cthulhufishing.item.KnifeForRitualBleedingItem;
import net.mcreator.cthulhufishing.item.HorseSculkFishItem;
import net.mcreator.cthulhufishing.item.HoodOfTheDeepVoidItem;
import net.mcreator.cthulhufishing.item.HermitSlulkFishItem;
import net.mcreator.cthulhufishing.item.GlutonSculkFishItem;
import net.mcreator.cthulhufishing.item.FadedRunicTabletItem;
import net.mcreator.cthulhufishing.item.EmeraldGoldRingItem;
import net.mcreator.cthulhufishing.item.DripVoidItem;
import net.mcreator.cthulhufishing.item.CthulhuGrimoireItem;
import net.mcreator.cthulhufishing.item.CrimsonRingItem;
import net.mcreator.cthulhufishing.item.CrimsonLureItem;
import net.mcreator.cthulhufishing.item.CrimsonJellyfishItem;
import net.mcreator.cthulhufishing.item.CrimsonFishItem;
import net.mcreator.cthulhufishing.item.CrimsonFingerItem;
import net.mcreator.cthulhufishing.item.CrimsonCrunchItem;
import net.mcreator.cthulhufishing.item.AncientCoinItem;
import net.mcreator.cthulhufishing.block.display.BlockOreEyeDisplayItem;
import net.mcreator.cthulhufishing.block.display.AltarRelicDisplayItem;
import net.mcreator.cthulhufishing.block.display.AltarRelic6DisplayItem;
import net.mcreator.cthulhufishing.block.display.AltarRelic5DisplayItem;
import net.mcreator.cthulhufishing.block.display.AltarRelic4DisplayItem;
import net.mcreator.cthulhufishing.block.display.AltarRelic3DisplayItem;
import net.mcreator.cthulhufishing.block.display.AltarRelic2DisplayItem;
import net.mcreator.cthulhufishing.block.display.AltarRelic1DisplayItem;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CthulhufishingMod.MODID);
	public static final RegistryObject<Item> THIRD_EYE = REGISTRY.register("third_eye", () -> new ThirdEyeItem());
	public static final RegistryObject<Item> CRIMSON_FISH = REGISTRY.register("crimson_fish", () -> new CrimsonFishItem());
	public static final RegistryObject<Item> DEEP_OIL = block(CthulhufishingModBlocks.DEEP_OIL, CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB);
	public static final RegistryObject<Item> CTULHU_ALTAR_FISH = block(CthulhufishingModBlocks.CTULHU_ALTAR_FISH, CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB);
	public static final RegistryObject<Item> KNIFE_FOR_RITUAL_BLEEDING = REGISTRY.register("knife_for_ritual_bleeding", () -> new KnifeForRitualBleedingItem());
	public static final RegistryObject<Item> HOOD_OF_THE_DEEP_VOID_HELMET = REGISTRY.register("hood_of_the_deep_void_helmet", () -> new HoodOfTheDeepVoidItem.Helmet());
	public static final RegistryObject<Item> CRIMSON_JELLYFISH = REGISTRY.register("crimson_jellyfish", () -> new CrimsonJellyfishItem());
	public static final RegistryObject<Item> CRIMSON_CRUNCH = REGISTRY.register("crimson_crunch", () -> new CrimsonCrunchItem());
	public static final RegistryObject<Item> HERMIT_SLULK_FISH = REGISTRY.register("hermit_slulk_fish", () -> new HermitSlulkFishItem());
	public static final RegistryObject<Item> HORSE_SCULK_FISH = REGISTRY.register("horse_sculk_fish", () -> new HorseSculkFishItem());
	public static final RegistryObject<Item> GLUTON_SCULK_FISH = REGISTRY.register("gluton_sculk_fish", () -> new GlutonSculkFishItem());
	public static final RegistryObject<Item> BLOCK_ORE_EYE = REGISTRY.register(CthulhufishingModBlocks.BLOCK_ORE_EYE.getId().getPath(),
			() -> new BlockOreEyeDisplayItem(CthulhufishingModBlocks.BLOCK_ORE_EYE.get(), new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB)));
	public static final RegistryObject<Item> DRIP_VOID = REGISTRY.register("drip_void", () -> new DripVoidItem());
	public static final RegistryObject<Item> SWORD_OF_REVELATION = REGISTRY.register("sword_of_revelation", () -> new SwordOfRevelationItem());
	public static final RegistryObject<Item> TENTACLE_STAFF = REGISTRY.register("tentacle_staff", () -> new TentacleStaffItem());
	public static final RegistryObject<Item> OBSESSED_EYE_MOB_SPAWN_EGG = REGISTRY.register("obsessed_eye_mob_spawn_egg",
			() -> new ForgeSpawnEggItem(CthulhufishingModEntities.OBSESSED_EYE_MOB, -12563314, -11183488, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> CTHULHU_GRIMOIRE = REGISTRY.register("cthulhu_grimoire", () -> new CthulhuGrimoireItem());
	public static final RegistryObject<Item> GRIMOIRE_TENTACLE_SPAWN_EGG = REGISTRY.register("grimoire_tentacle_spawn_egg", () -> new ForgeSpawnEggItem(CthulhufishingModEntities.GRIMOIRE_TENTACLE, -1, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> CRIMSON_LURE = REGISTRY.register("crimson_lure", () -> new CrimsonLureItem());
	public static final RegistryObject<Item> SCULK_LURE = REGISTRY.register("sculk_lure", () -> new SculkLureItem());
	public static final RegistryObject<Item> RELIC = REGISTRY.register("relic", () -> new RelicItem());
	public static final RegistryObject<Item> RUNIC_TABLET = REGISTRY.register("runic_tablet", () -> new RunicTabletItem());
	public static final RegistryObject<Item> ALTAR_RELIC = REGISTRY.register(CthulhufishingModBlocks.ALTAR_RELIC.getId().getPath(), () -> new AltarRelicDisplayItem(CthulhufishingModBlocks.ALTAR_RELIC.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FADED_RUNIC_TABLET = REGISTRY.register("faded_runic_tablet", () -> new FadedRunicTabletItem());
	public static final RegistryObject<Item> CRIMSON_RING = REGISTRY.register("crimson_ring", () -> new CrimsonRingItem());
	public static final RegistryObject<Item> SCULK_RING = REGISTRY.register("sculk_ring", () -> new SculkRingItem());
	public static final RegistryObject<Item> ANCIENT_COIN = REGISTRY.register("ancient_coin", () -> new AncientCoinItem());
	public static final RegistryObject<Item> EMERALD_GOLD_RING = REGISTRY.register("emerald_gold_ring", () -> new EmeraldGoldRingItem());
	public static final RegistryObject<Item> REAGENT = REGISTRY.register("reagent", () -> new ReagentItem());
	public static final RegistryObject<Item> ALTAR_RELIC_1 = REGISTRY.register(CthulhufishingModBlocks.ALTAR_RELIC_1.getId().getPath(), () -> new AltarRelic1DisplayItem(CthulhufishingModBlocks.ALTAR_RELIC_1.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ALTAR_RELIC_2 = REGISTRY.register(CthulhufishingModBlocks.ALTAR_RELIC_2.getId().getPath(), () -> new AltarRelic2DisplayItem(CthulhufishingModBlocks.ALTAR_RELIC_2.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ALTAR_RELIC_3 = REGISTRY.register(CthulhufishingModBlocks.ALTAR_RELIC_3.getId().getPath(), () -> new AltarRelic3DisplayItem(CthulhufishingModBlocks.ALTAR_RELIC_3.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ALTAR_RELIC_4 = REGISTRY.register(CthulhufishingModBlocks.ALTAR_RELIC_4.getId().getPath(), () -> new AltarRelic4DisplayItem(CthulhufishingModBlocks.ALTAR_RELIC_4.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ALTAR_RELIC_5 = REGISTRY.register(CthulhufishingModBlocks.ALTAR_RELIC_5.getId().getPath(), () -> new AltarRelic5DisplayItem(CthulhufishingModBlocks.ALTAR_RELIC_5.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ALTAR_RELIC_6 = REGISTRY.register(CthulhufishingModBlocks.ALTAR_RELIC_6.getId().getPath(), () -> new AltarRelic6DisplayItem(CthulhufishingModBlocks.ALTAR_RELIC_6.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TREASURE_BAG = REGISTRY.register("treasure_bag", () -> new TreasureBagItem());
	public static final RegistryObject<Item> PSEUDO_EYE = block(CthulhufishingModBlocks.PSEUDO_EYE, null);
	public static final RegistryObject<Item> CRIMSON_FINGER = REGISTRY.register("crimson_finger", () -> new CrimsonFingerItem());
	public static final RegistryObject<Item> REVELATION_FABRIC = REGISTRY.register("revelation_fabric", () -> new RevelationFabricItem());
	public static final RegistryObject<Item> STEP_TO_ABYSS = REGISTRY.register("step_to_abyss", () -> new StepToAbyssItem());
	public static final RegistryObject<Item> REVELATION_STEEL = REGISTRY.register("revelation_steel", () -> new RevelationSteelItem());
	public static final RegistryObject<Item> MASK_OF_REVELATION_HELMET = REGISTRY.register("mask_of_revelation_helmet", () -> new MaskOfRevelationItem.Helmet());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
