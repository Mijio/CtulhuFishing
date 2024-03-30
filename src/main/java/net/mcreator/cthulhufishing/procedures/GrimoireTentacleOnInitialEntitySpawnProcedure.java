package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.CthulhufishingMod;

public class GrimoireTentacleOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CthulhufishingMod.queueServerWork(50, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
