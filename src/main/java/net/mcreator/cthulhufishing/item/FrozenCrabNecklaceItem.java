
package net.mcreator.cthulhufishing.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cthulhufishing.procedures.FrozenCrabNecklaceWhileBaubleIsEquippedTickProcedure;
import net.mcreator.cthulhufishing.init.CthulhufishingModTabs;

public class FrozenCrabNecklaceItem extends Item implements ICurioItem {
	public FrozenCrabNecklaceItem() {
		super(new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		FrozenCrabNecklaceWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}
}
