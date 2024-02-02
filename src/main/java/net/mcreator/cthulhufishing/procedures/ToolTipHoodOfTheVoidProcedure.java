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
		if (itemstack.getItem() == CthulhufishingModItems.HOOD_OF_THE_DEEP_VOID_HELMET.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bHood of the abyss"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bBy expending the power of your revelation, your attacks return part of the creature's damage"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.KNIFE_FOR_RITUAL_BLEEDING.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bSacrificial knife"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bLeft-click to apply Ritual bleeeding"));
			} else {
				tooltip.add(Component.literal("Press shift fo show tooltip"));
			}
		} else if (itemstack.getItem() == CthulhufishingModItems.THIRD_EYE.get()) {
			(itemstack).setHoverName(Component.literal("\u00A7bThird eye"));
			if (Screen.hasShiftDown()) {
				tooltip.add(Component.literal("\u00A7bNow you can see what live in the deep void"));
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
		}
	}
}
