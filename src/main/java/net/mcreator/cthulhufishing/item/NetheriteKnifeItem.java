
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class NetheriteKnifeItem extends Item implements ICurioItem {

	public NetheriteKnifeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		NetheriteKnifeBaubleIsEquippedProcedure.execute(

		);
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		NetheriteKnifeBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}

}
