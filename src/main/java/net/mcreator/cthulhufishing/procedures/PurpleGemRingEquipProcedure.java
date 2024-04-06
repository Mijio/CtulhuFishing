package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.init.CthulhufishingModAttributes;

import java.util.UUID;

import java.lang.reflect.Modifier;

public class PurpleGemRingEquipProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier Modifier = null;
		Modifier = new AttributeModifier(UUID.fromString("17517e4a-2343-4394-b228-0f1bce7ddef5"), "", 1, AttributeModifier.Operation.ADDITION);
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).hasModifier(Modifier)))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).addTransientModifier(Modifier);
		Modifier = new AttributeModifier(UUID.fromString("8a7fdb3c-e955-4dfc-8788-7369f745374e"), "", 2, AttributeModifier.Operation.ADDITION);
		if (!(((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONCOUNTER.get()).hasModifier(Modifier)))
			((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONCOUNTER.get()).addTransientModifier(Modifier);
	}
}
