
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

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
		GreenGemRingUnequipProcedure.execute(

		);
	}

}
