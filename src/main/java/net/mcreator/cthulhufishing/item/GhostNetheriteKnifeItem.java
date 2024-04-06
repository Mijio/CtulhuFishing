
package net.mcreator.cthulhufishing.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.cthulhufishing.procedures.GhostNetheriteKnifeBaubleEquipProcedure;
import net.mcreator.cthulhufishing.procedures.GhostNetheritKnifeBaubleUnequipProcedure;

public class GhostNetheriteKnifeItem extends Item implements ICurioItem {
	public GhostNetheriteKnifeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		GhostNetheriteKnifeBaubleEquipProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		GhostNetheritKnifeBaubleUnequipProcedure.execute(slotContext.entity());
	}
}
