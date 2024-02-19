
package net.mcreator.cthulhufishing.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.cthulhufishing.procedures.MushroomedOnEffectActiveTickProcedure;

public class MushroomedMobEffect extends MobEffect {
	public MushroomedMobEffect() {
		super(MobEffectCategory.HARMFUL, -10066432);
	}

	@Override
	public String getDescriptionId() {
		return "effect.cthulhufishing.mushroomed";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MushroomedOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
