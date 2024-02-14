
package net.mcreator.cthulhufishing.potion;

public class AncientCurseMobEffect extends MobEffect {

	public AncientCurseMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092544);
	}

	@Override
	public String getDescriptionId() {
		return "effect.cthulhufishing.ancient_curse";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		AncientBlessingEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		AncientBlessingEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
