package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.cthulhufishing.entity.FossilFishEntity;

public class FossilFishPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((((FossilFishEntity) entity).animationprocedure).equals("animation.fossilized fish.attack")) {
			sourceentity.hurt(DamageSource.GENERIC, (float) (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getValue() * 3));
			if (sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 160, 0));
			sourceentity.setDeltaMovement(new Vec3((1.5 * entity.getLookAngle().x), 0.5, (1.5 * entity.getLookAngle().z)));
		}
	}
}
