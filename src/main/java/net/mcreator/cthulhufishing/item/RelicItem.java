
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.cthulhufishing.procedures.RelicRightclickedOnBlockProcedure;

public class RelicItem extends Item {
	public RelicItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		RelicRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
