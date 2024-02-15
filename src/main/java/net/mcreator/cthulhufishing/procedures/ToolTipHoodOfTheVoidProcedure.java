package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
				tooltip.add(Component.literal("\u00A7bAdditionally enhances your revelation from catching the Crimson Fish"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.SCULK_RING.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bSculk fish ring"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bAdditionally enhances your revelation from catching sculk fish"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.EMERALD_GOLD_RING.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bRing of the King of Experience"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bQuickly consuming your experience increases your damage dealt based on the amount of experience"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.CTHULHU_GRIMOIRE.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bCthulhu grimoire"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bGrimoire of Cthulhu, use cam summon part of the power of cthulhu "));
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
				tooltip.add(Component.literal("\u00A7bGrimoire of By placing it on the ground it drives aggressive creatures into madness, if you defeat them you can get abyss reagent"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.FADED_RUNIC_TABLET.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bFaded runic tablet"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bCan be activated again using the third eye"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.RUNIC_TABLET.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bRunic tablet"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bRight click gives you 10 revelation ponts"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.SCULK_LURE.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bSculk lure"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bHold in your left hand when fishing in the deep dark, then you can catch sculk fish "));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.CRIMSON_LURE.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bCrimson lure"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bHold in your left hand when fishing with the effect of ritual bleeding, then you can catch crimson fish"));
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
		} else if (itemstack.getItem() == CthulhufishingModItems.DELETED_MOD_ELEMENT_HELMET.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bWhen equip revelation costs you spend half as much "));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.REVELATION_FABRIC.get()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bused to improve equipment"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		}
	}
}
