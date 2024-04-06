
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

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
