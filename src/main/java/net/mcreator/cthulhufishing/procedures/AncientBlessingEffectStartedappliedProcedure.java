package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.init.CthulhufishingModMobEffects;

import java.util.UUID;

public class AncientBlessingEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
				.hasModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "1",
						(-0.1 + (-0.1) * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()) ? _livEnt.getEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()).getAmplifier() : 0)),
						AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "1",
							(-0.1 + (-0.1) * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()) ? _livEnt.getEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()).getAmplifier() : 0)),
							AttributeModifier.Operation.MULTIPLY_TOTAL)));
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR)
				.hasModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "2",
						(-0.1 + (-0.1) * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()) ? _livEnt.getEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()).getAmplifier() : 0)),
						AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "2",
							(-0.1 + (-0.1) * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()) ? _livEnt.getEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()).getAmplifier() : 0)),
							AttributeModifier.Operation.MULTIPLY_TOTAL)));
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
				.hasModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "3",
						(-0.1 + (-0.1) * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()) ? _livEnt.getEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()).getAmplifier() : 0)),
						AttributeModifier.Operation.MULTIPLY_TOTAL)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "3",
							(-0.1 + (-0.1) * (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()) ? _livEnt.getEffect(CthulhufishingModMobEffects.ANCIENT_CURSE.get()).getAmplifier() : 0)),
							AttributeModifier.Operation.MULTIPLY_TOTAL)));
	}
}
