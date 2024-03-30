package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.init.CthulhufishingModBlocks;

public class PseudoEyeAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.STONE) {
			if (Math.random() < 0.7) {
				world.setBlock(BlockPos.containing(x, y, z), CthulhufishingModBlocks.BLOCK_ORE_EYE.get().defaultBlockState(), 3);
				return false;
			}
			return false;
		}
		return false;
	}
}
