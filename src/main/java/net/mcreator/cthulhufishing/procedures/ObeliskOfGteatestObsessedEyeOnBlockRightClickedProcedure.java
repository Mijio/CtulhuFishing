package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ObeliskOfGteatestObsessedEyeOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), CthulhufishingModBlocks.OBELISK_4.get().defaultBlockState(), 3);
	}
}
