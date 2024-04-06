
package net.mcreator.cthulhufishing.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cthulhufishing.procedures.GreenGemRingUnequipProcedure;
import net.mcreator.cthulhufishing.procedures.GreenGemRingEquipProcedure;

public class GreenGemRingItem extends Item implements ICurioItem {
	public GreenGemRingItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		GreenGemRingEquipProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		GreenGemRingUnequipProcedure.execute(slotContext.entity());
	}
}
