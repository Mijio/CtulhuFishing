package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CrimsonFishPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 4000, 2, false, false));
	}
}
