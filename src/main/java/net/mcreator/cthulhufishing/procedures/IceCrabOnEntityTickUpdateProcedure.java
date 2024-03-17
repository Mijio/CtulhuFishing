package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class IceCrabOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
		}
		if (entity.getPersistentData().getDouble("AI") > 110 && entity.getPersistentData().getDouble("AI") < 190) {
			entity.getPersistentData().putDouble("TrX", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()));
			entity.getPersistentData().putDouble("TrY",
					((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY() + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getBbHeight() * 0.75 - entity.getBbHeight() * 0.75));
			entity.getPersistentData().putDouble("TrZ", ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()));
			entity.getPersistentData().putDouble("Grow", 1);
			for (int index0 = 0; index0 < 20; index0++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SNOWFLAKE, (entity.getX() + entity.getPersistentData().getDouble("TrX") * entity.getPersistentData().getDouble("Grow")),
							(entity.getY() + entity.getBbHeight() * 0.75 + entity.getPersistentData().getDouble("TrY") * entity.getPersistentData().getDouble("Grow")),
							(entity.getZ() + entity.getPersistentData().getDouble("TrZ") * entity.getPersistentData().getDouble("Grow")), 5, 0.15, 0.15, 0.15, 0);
				entity.getPersistentData().putDouble("Grow", (entity.getPersistentData().getDouble("Grow") - 0.05));
			}
		}
		if (entity.getPersistentData().getDouble("AI") == 200) {
			entity.getPersistentData().putDouble("AI", 1);
		}
	}
}
