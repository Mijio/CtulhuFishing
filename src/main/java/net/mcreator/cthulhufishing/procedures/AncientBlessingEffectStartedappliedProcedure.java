package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.UUID;

public class AncientBlessingEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
				.hasModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "multiplyer", 3, AttributeModifier.Operation.MULTIPLY_BASE)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "multiplyer", 3, AttributeModifier.Operation.MULTIPLY_BASE)));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0));
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR)
				.hasModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "multiplyer", 2, AttributeModifier.Operation.MULTIPLY_BASE)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "multiplyer", 2, AttributeModifier.Operation.MULTIPLY_BASE)));
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
				.hasModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "multiplyer", 2, AttributeModifier.Operation.MULTIPLY_BASE)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "multiplyer", 2, AttributeModifier.Operation.MULTIPLY_BASE)));
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
				.hasModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "multiplyer", 3, AttributeModifier.Operation.MULTIPLY_BASE)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.addPermanentModifier((new AttributeModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"), "multiplyer", 3, AttributeModifier.Operation.MULTIPLY_BASE)));
	}
}
