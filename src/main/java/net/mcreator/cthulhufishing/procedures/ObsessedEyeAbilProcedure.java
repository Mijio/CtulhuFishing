package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class ObsessedEyeAbilProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.LEVITATION) : false)) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 90, 1));
			entity.setDeltaMovement(new Vec3((1.5 * entity.getLookAngle().x), (1.5 * entity.getLookAngle().y), (1.5 * entity.getLookAngle().z)));
		}
	}
}
