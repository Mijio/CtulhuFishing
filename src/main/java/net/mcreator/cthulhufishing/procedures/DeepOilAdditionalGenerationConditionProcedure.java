package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DeepOilAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 0))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 0))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 1, y + 1, z + 1))).getBlock() == Blocks.WATER) {
			return true;
		}
		return false;
	}
}
