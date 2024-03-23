package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class FrozenCrabGetHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		if (Math.random() < 0.3) {
			dx = x - 1;
			dy = y - 0;
			dz = z - 1;
			for (int index0 = 0; index0 < 5; index0++) {
				for (int index1 = 0; index1 < 5; index1++) {
					for (int index2 = 0; index2 < 5; index2++) {
						if (!((world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.VOID_AIR
								|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.WATER
								|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.LAVA
								|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.BEDROCK
								|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.OBSIDIAN)) {
							world.levelEvent(2001, new BlockPos(dx, dy, dz), Block.getId((world.getBlockState(new BlockPos(dx, dy, dz)))));
							world.destroyBlock(new BlockPos(dx, dy, dz), false);
						}
						dz = dz + 1;
					}
					dz = z - 1;
					dx = dx + 1;
				}
				dx = x - 1;
				dz = z - 1;
				dy = dy + 1;
			}
			entity.setDeltaMovement(new Vec3(((sourceentity.getX() - entity.getX()) * 0.5), 0.8, ((sourceentity.getZ() - entity.getZ()) * 0.5)));
			dx = x - 1;
			dy = y - 0;
			dz = z - 1;
			for (int index3 = 0; index3 < 5; index3++) {
				for (int index4 = 0; index4 < 5; index4++) {
					for (int index5 = 0; index5 < 5; index5++) {
						if (!((world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.VOID_AIR
								|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.WATER
								|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.LAVA
								|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.BEDROCK
								|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.OBSIDIAN)) {
							world.levelEvent(2001, new BlockPos(dx, dy, dz), Block.getId((world.getBlockState(new BlockPos(dx, dy, dz)))));
							world.destroyBlock(new BlockPos(dx, dy, dz), false);
						}
						dz = dz + 1;
					}
					dz = z - 1;
					dx = dx + 1;
				}
				dx = x - 1;
				dz = z - 1;
				dy = dy + 1;
			}
		}
	}
}
