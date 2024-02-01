package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class RitualBleedingActiveTickConditionProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.hurt(DamageSource.MAGIC, (float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 0.05));
	}
}
