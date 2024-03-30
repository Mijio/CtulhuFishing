
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.cthulhufishing.procedures.HeavyFishingRoadRightclickedProcedure;

public class HeavyFishingRoadItem extends FishingRodItem {
	public HeavyFishingRoadItem() {
		super(new Item.Properties().durability(80));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		super.use(world, entity, hand);
		ItemStack itemstack = entity.getItemInHand(hand);
		HeavyFishingRoadRightclickedProcedure.execute(entity, itemstack);
		return InteractionResultHolder.sidedSuccess(itemstack, world.isClientSide());
	}
}
