package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.entity.FossilFishEntity;

public class FossilFishOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		dx = x - 1;
		dy = y - 1;
		dz = z - 1;
		for (int index0 = 0; index0 < 9; index0++) {
			for (int index1 = 0; index1 < 9; index1++) {
				for (int index2 = 0; index2 < 9; index2++) {
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
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
		}
		if (entity.getPersistentData().getDouble("AI") == 116) {
			if (entity instanceof FossilFishEntity) {
				((FossilFishEntity) entity).setAnimation("animation.fossilized fish.attack");
			}
		}
		if (entity.getPersistentData().getDouble("AI") == 120) {
			if (entity instanceof FossilFishEntity animatable)
				animatable.setTexture("texture_fossil_fish_mushrumed");
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x), 2.5, (entity.getLookAngle().z)));
		}
		if (entity.getPersistentData().getDouble("AI") == 124) {
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 3), (-1.5), (entity.getLookAngle().z * 3)));
			entity.getPersistentData().putDouble("AI", 0);
		}
	}
}
