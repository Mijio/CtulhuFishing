
package net.mcreator.cthulhufishing.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cthulhufishing.procedures.PurpleGemRingUnequipProcedure;
import net.mcreator.cthulhufishing.procedures.PurpleGemRingEquipProcedure;

public class PurpleGemRingItem extends Item implements ICurioItem {
	public PurpleGemRingItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		PurpleGemRingEquipProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		PurpleGemRingUnequipProcedure.execute(slotContext.entity());
	}
}
