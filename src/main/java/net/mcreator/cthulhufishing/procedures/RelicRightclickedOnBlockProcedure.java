package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RelicRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(Blocks.AIR == (world.getBlockState(new BlockPos(x, y, z))).getBlock())) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CthulhufishingModItems.RELIC.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
