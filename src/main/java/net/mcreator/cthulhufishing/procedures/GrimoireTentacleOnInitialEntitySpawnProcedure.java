package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.CthulhufishingMod;

public class GrimoireTentacleOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3(0, 0.5, 0));
		CthulhufishingMod.queueServerWork(50, () -> {
			entity.setDeltaMovement(new Vec3(0, (-0.5), 0));
			CthulhufishingMod.queueServerWork(20, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
			});
		});
	}
}
