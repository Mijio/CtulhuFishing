
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CthulhufishingModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == CthulhufishingModVillagerProfessions.VOID_MERCHANT.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(CthulhufishingModItems.REAGENT.get(), 6), new ItemStack(CthulhufishingModItems.CRIMSON_RING.get()), 1, 20, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(CthulhufishingModItems.REAGENT.get(), 6), new ItemStack(CthulhufishingModItems.SCULK_RING.get()), 1, 20, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(CthulhufishingModItems.REAGENT.get(), 14), new ItemStack(CthulhufishingModItems.CRIMSON_FINGER.get()), 2, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(CthulhufishingModItems.REAGENT.get(), 14), new ItemStack(CthulhufishingModItems.REVELATION_FABRIC.get()), 2, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(CthulhufishingModItems.REAGENT.get()), new ItemStack(CthulhufishingModItems.TREASURE_BAG.get(), 2), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.STONE_SWORD), new ItemStack(Items.NETHER_WART, 8), new ItemStack(CthulhufishingModItems.KNIFE_FOR_RITUAL_BLEEDING.get()), 1, 15, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(CthulhufishingModItems.THIRD_EYE.get()), new ItemStack(Blocks.STONE), new ItemStack(CthulhufishingModItems.FADED_RUNIC_TABLET.get()), 1, 15, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 10), new ItemStack(CthulhufishingModItems.REAGENT.get(), 8), new ItemStack(CthulhufishingModItems.RELIC.get()), 10, 25, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.WRITABLE_BOOK), new ItemStack(CthulhufishingModItems.REAGENT.get(), 30), new ItemStack(CthulhufishingModItems.CTHULHU_GRIMOIRE.get()), 1, 20, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 28), new ItemStack(CthulhufishingModItems.REAGENT.get(), 12), new ItemStack(CthulhufishingModItems.TENTACLE_STAFF.get()), 1, 20, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 28), new ItemStack(CthulhufishingModItems.REAGENT.get(), 20), new ItemStack(CthulhufishingModItems.SWORD_OF_REVELATION.get()), 1, 20, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 32), new ItemStack(CthulhufishingModItems.REAGENT.get(), 14), new ItemStack(CthulhufishingModItems.REVELATION_STEEL.get()), 2, 10, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 5), new ItemStack(CthulhufishingModItems.REAGENT.get(), 16), new ItemStack(CthulhufishingModItems.EMERALD_GOLD_RING.get()), 1, 20, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 26), new ItemStack(CthulhufishingModItems.REAGENT.get(), 14), new ItemStack(CthulhufishingModItems.MASK_OF_REVELATION_HELMET.get()), 1, 20, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 26), new ItemStack(CthulhufishingModItems.REAGENT.get(), 16), new ItemStack(CthulhufishingModItems.HOOD_OF_THE_DEEP_VOID_HELMET.get()), 1, 20, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 5), new ItemStack(CthulhufishingModItems.REAGENT.get(), 20), new ItemStack(CthulhufishingModItems.HEAVY_FISHING_ROAD.get()), 10, 20, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(CthulhufishingModItems.REAGENT.get(), 6), new ItemStack(CthulhufishingModItems.MUSRHOOM_RING.get()), 1, 20, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(CthulhufishingModItems.REAGENT.get()), new ItemStack(CthulhufishingModItems.MUSHROOM_LURE.get(), 3), 5, 4, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(CthulhufishingModItems.REAGENT.get()), new ItemStack(CthulhufishingModItems.CRIMSON_LURE.get(), 3), 5, 4, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(CthulhufishingModItems.REAGENT.get()), new ItemStack(CthulhufishingModItems.SCULK_LURE.get(), 3), 5, 4, 0.05f));
		}
	}
}
