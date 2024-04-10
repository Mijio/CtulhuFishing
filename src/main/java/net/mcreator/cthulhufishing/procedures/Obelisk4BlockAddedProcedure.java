package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.init.CthulhufishingModEntities;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class Obelisk4BlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			int _value = 5;
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
		CthulhufishingMod.queueServerWork(20, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CthulhufishingModEntities.OBSESSED_EYE_BOSS.get().spawn(_level, BlockPos.containing(x, y + 3, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		});
	}
}
