package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;
import net.mcreator.cthulhufishing.init.CthulhufishingModAttributes;

import java.util.UUID;

import java.lang.reflect.Modifier;

public class GreenGemRingEquipProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier Modifier = null;
		Modifier = new AttributeModifier(UUID.fromString("438a6d3a-7ef4-4c2a-b735-020bfaf8012c"), "", 1, AttributeModifier.Operation.ADDITION);
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.LUCK).hasModifier(Modifier)))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.LUCK).addTransientModifier(Modifier);
		CthulhufishingModVariables.Summon_Count_GGR = new AttributeModifier(UUID.fromString("eaf1280f-73ee-418d-9370-5fc8df14c2ba"), "", 2, AttributeModifier.Operation.ADDITION);
		if (!(((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONCOUNTER.get()).hasModifier(CthulhufishingModVariables.Summon_Count_GGR)))
			((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONCOUNTER.get()).addTransientModifier(CthulhufishingModVariables.Summon_Count_GGR);
	}
}
