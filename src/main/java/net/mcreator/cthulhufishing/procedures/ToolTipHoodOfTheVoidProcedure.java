package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import net.mcreator.cthulhufishing.init.CthulhufishingModItems;
import net.mcreator.cthulhufishing.init.CthulhufishingModBlocks;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class ToolTipHoodOfTheVoidProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (itemstack.getItem() == CthulhufishingModItems.TENTACLE_STAFF.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bTentacle staff"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bBy expending the power of your revelation, your attacks are enhanced by the creature's power"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.TREASURE_BAG.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bContains precious items"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.KNIFE_FOR_RITUAL_BLEEDING.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bSacrificial knife"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bRight click to apply Ritual bleeeding"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.THIRD_EYE.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bThird eye"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bAccompanying you, the eye opens up the opportunity for you to catch creatures of the deep and grant revelation for their capture"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.SWORD_OF_REVELATION.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bGreatsword of Revelation"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bThis blade deals additional magic damage from your armor, this damage can be increased by the power of your revelation"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.DRIP_VOID.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bDormant eye"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bNeed to be awake"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.CRIMSON_RING.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bCrimson fish ring"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bAdditionally enhances your revelation from catching Crimson Fish"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.SCULK_RING.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bSculk fish ring"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bAdditionally enhances your revelation from catching Sculk fish"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.EMERALD_GOLD_RING.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bRing of the King of Experience"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bQuickly consuming your experience increases your damage dealt by up to 25% based on the amount of experience"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.CTHULHU_GRIMOIRE.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bCthulhu grimoire"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bRight click summon tentacle"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.REAGENT.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bAbyss reagent"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bIf you do not place it in the relic in time, then the relic may explode"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.RELIC.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bAbyss relic"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bGrimoire of by placing it on the ground it drives aggressive creatures into madness, if you defeat them you can get abyss reagent"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.FADED_RUNIC_TABLET.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bFaded runic tablet"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bCan be reactivated using the third eye"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.RUNIC_TABLET.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bRunic tablet"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bRight click gives you 10 revelation points"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.SCULK_LURE.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bSculk lure"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bHold in your left hand when fishing in the deep dark, then you can catch Sculk fish "));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.CRIMSON_LURE.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bCrimson lure"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bHold in your left hand when fishing with the effect of ritual bleeding, then you can catch Crimson fish"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.HOOD_OF_THE_DEEP_VOID_HELMET.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bHood of the deep void"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bDoesn't let you go hungry till you have revelation"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.CRIMSON_FINGER.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bUsed to improve equipment"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.MASK_OF_REVELATION_HELMET.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bMask of Revelation"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bWhen equip revelation costs you spend half as much "));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.REVELATION_FABRIC.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bUsed to improve equipment"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.REVELATION_STEEL.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bUsed to improve equipment"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.HEAVY_FISHING_ROAD.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bHeavy fishing rod"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bGives you a chance for a giant catch"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModBlocks.CTULHU_ALTAR_FISH.get().asItem()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bGives you a quest for tribute of fish"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.CRIMSON_FISH.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bWhen eaten gives \"Health Boost\" effect"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.CRIMSON_CRUNCH.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bWhen eaten gives \"Health Boost\" effect"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.CRIMSON_JELLYFISH.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bWhen eaten gives \"Health Boost\" effect"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.GLUTON_SCULK_FISH.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bWhen eaten gives \"Night vision\" effect"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.HERMIT_SLULK_FISH.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bWhen eaten gives \"Night vision\" effect"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.HORSE_SCULK_FISH.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bWhen eaten gives \"Night vision\" effect"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.ANCIENT_COIN.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bUsed for netherite crafting"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		}
	}
}
