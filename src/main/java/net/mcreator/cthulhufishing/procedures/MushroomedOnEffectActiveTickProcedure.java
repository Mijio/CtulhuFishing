package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.cthulhufishing.init.CthulhufishingModMobEffects;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class MushroomedOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CthulhufishingModMobEffects.MUSHROOMED.get()) : false) && (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.POISON) : false)) {
			CthulhufishingMod.queueServerWork(20, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("mushroomed").bypassArmor(), (float) ((1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON) ? _livEnt.getEffect(MobEffects.POISON).getAmplifier() : 0)) * 0.1
							* (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CthulhufishingModMobEffects.MUSHROOMED.get()) ? _livEnt.getEffect(CthulhufishingModMobEffects.MUSHROOMED.get()).getAmplifier() : 0))));
			});
		}
	}
}
