
package net.mcreator.cthulhufishing.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cthulhufishing.procedures.EmeraldGoldRingWhileBaubleIsEquippedTickProcedure;
import net.mcreator.cthulhufishing.procedures.EmeraldGoldRingBaubleIsUnequippedProcedure;

public class EmeraldGoldRingItem extends Item implements ICurioItem {
	public EmeraldGoldRingItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		EmeraldGoldRingWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		EmeraldGoldRingBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
