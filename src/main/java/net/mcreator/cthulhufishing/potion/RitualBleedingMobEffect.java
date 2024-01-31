
package net.mcreator.cthulhufishing.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RitualBleedingMobEffect extends MobEffect {
	public RitualBleedingMobEffect() {
		super(MobEffectCategory.HARMFUL, -6750208);
	}

	@Override
	public String getDescriptionId() {
		return "effect.cthulhufishing.ritual_bleeding";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
