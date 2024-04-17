package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.init.CthulhufishingModBlocks;

public class ObeliskOfGteatestObsessedEyeOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), CthulhufishingModBlocks.OBELISK_4.get().defaultBlockState(), 3);
	}
}
