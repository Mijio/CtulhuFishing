
package net.mcreator.cthulhufishing.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MadnessMobEffect extends MobEffect {
	public MadnessMobEffect() {
		super(MobEffectCategory.HARMFUL, -10678770);
	}

	@Override
	public String getDescriptionId() {
		return "effect.cthulhufishing.madness";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
