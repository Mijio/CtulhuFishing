
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.cthulhufishing.CthulhufishingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CthulhufishingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CthulhufishingMod.MODID);
	public static final RegistryObject<CreativeModeTab> CTULHU_FISHING_TAB = REGISTRY.register("ctulhu_fishing_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cthulhufishing.ctulhu_fishing_tab")).icon(() -> new ItemStack(CthulhufishingModItems.THIRD_EYE_R.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CthulhufishingModItems.CRIMSON_FISH.get());
				tabData.accept(CthulhufishingModBlocks.DEEP_OIL.get().asItem());
				tabData.accept(CthulhufishingModBlocks.CTULHU_ALTAR_FISH.get().asItem());
				tabData.accept(CthulhufishingModItems.KNIFE_FOR_RITUAL_BLEEDING.get());
				tabData.accept(CthulhufishingModItems.CRIMSON_JELLYFISH.get());
				tabData.accept(CthulhufishingModItems.CRIMSON_CRUNCH.get());
				tabData.accept(CthulhufishingModItems.HERMIT_SLULK_FISH.get());
				tabData.accept(CthulhufishingModItems.HORSE_SCULK_FISH.get());
				tabData.accept(CthulhufishingModItems.GLUTON_SCULK_FISH.get());
				tabData.accept(CthulhufishingModBlocks.BLOCK_ORE_EYE.get().asItem());
				tabData.accept(CthulhufishingModItems.DRIP_VOID.get());
				tabData.accept(CthulhufishingModItems.SWORD_OF_REVELATION.get());
				tabData.accept(CthulhufishingModItems.TENTACLE_STAFF.get());
				tabData.accept(CthulhufishingModItems.CTHULHU_GRIMOIRE.get());
				tabData.accept(CthulhufishingModItems.CRIMSON_LURE.get());
				tabData.accept(CthulhufishingModItems.SCULK_LURE.get());
				tabData.accept(CthulhufishingModItems.RELIC.get());
				tabData.accept(CthulhufishingModItems.RUNIC_TABLET.get());
				tabData.accept(CthulhufishingModItems.FADED_RUNIC_TABLET.get());
				tabData.accept(CthulhufishingModItems.CRIMSON_RING.get());
				tabData.accept(CthulhufishingModItems.SCULK_RING.get());
				tabData.accept(CthulhufishingModItems.ANCIENT_COIN.get());
				tabData.accept(CthulhufishingModItems.EMERALD_GOLD_RING.get());
				tabData.accept(CthulhufishingModItems.REAGENT.get());
				tabData.accept(CthulhufishingModItems.TREASURE_BAG.get());
				tabData.accept(CthulhufishingModItems.CRIMSON_FINGER.get());
				tabData.accept(CthulhufishingModItems.REVELATION_FABRIC.get());
				tabData.accept(CthulhufishingModItems.STEP_TO_ABYSS.get());
				tabData.accept(CthulhufishingModItems.REVELATION_STEEL.get());
				tabData.accept(CthulhufishingModItems.HEAVY_FISHING_ROAD.get());
				tabData.accept(CthulhufishingModItems.MUSHROOM_LURE.get());
				tabData.accept(CthulhufishingModItems.MUSRHOOM_RING.get());
				tabData.accept(CthulhufishingModItems.CHESTPLATE_FOSSIL_FISH_CHESTPLATE.get());
				tabData.accept(CthulhufishingModItems.MUSHROOM_ANGLERFISH.get());
				tabData.accept(CthulhufishingModItems.MUSHROOM_TORCHFISH.get());
				tabData.accept(CthulhufishingModItems.MUSHROOM_SPRAT.get());
				tabData.accept(CthulhufishingModItems.ICE_COD.get());
				tabData.accept(CthulhufishingModItems.ICE_STINGRAY.get());
				tabData.accept(CthulhufishingModItems.ICE_BOULTI.get());
				tabData.accept(CthulhufishingModItems.ICE_LURE.get());
				tabData.accept(CthulhufishingModItems.FROZEN_LEGGINS_LEGGINGS.get());
				tabData.accept(CthulhufishingModItems.FROZEN_RING.get());
				tabData.accept(CthulhufishingModItems.FROZEN_CRAB_NECKLACE.get());
				tabData.accept(CthulhufishingModItems.HOOD_OF_THE_DEEP_VOID_R_HELMET.get());
				tabData.accept(CthulhufishingModItems.THIRD_EYE_R.get());
				tabData.accept(CthulhufishingModItems.MASK_OF_REVELATION_R_HELMET.get());
				tabData.accept(CthulhufishingModItems.OBSESSED_EYE_STAFF_R.get());
				tabData.accept(CthulhufishingModBlocks.OBELISK_OF_GTEATEST_OBSESSED_EYE.get().asItem());
				tabData.accept(CthulhufishingModItems.NETHERITE_KNIFE.get());
				tabData.accept(CthulhufishingModItems.GHOST_NETHERITE_KNIFE.get());
				tabData.accept(CthulhufishingModItems.PURPLE_GEM_RING.get());
				tabData.accept(CthulhufishingModItems.GREEN_GEM_RING.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CthulhufishingModItems.OBSESSED_EYE_MOB_SPAWN_EGG.get());
			tabData.accept(CthulhufishingModItems.FOSSIL_FISH_SPAWN_EGG.get());
			tabData.accept(CthulhufishingModItems.ICE_CRAB_SPAWN_EGG.get());
			tabData.accept(CthulhufishingModItems.OBSESSED_EYE_PET_SPAWN_EGG.get());
			tabData.accept(CthulhufishingModItems.OBSESSED_EYE_BOSS_SPAWN_EGG.get());
		}
	}
}
