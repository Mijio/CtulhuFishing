package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class ObsessedEyeOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Wait = 0;
		double cnt = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
		}
		if (entity.getPersistentData().getDouble("AI") >= 30) {
			ObsessedEyeAbilProcedure.execute(entity);
			entity.getPersistentData().putDouble("AI", 0);
		}
	}
}
