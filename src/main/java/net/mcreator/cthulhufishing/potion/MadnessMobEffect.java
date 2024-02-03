
package net.mcreator.cthulhufishing.potion;

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
