package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PurpleGemRingUnequipProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).removeModifier(UUID.fromString("17517e4a-2343-4394-b228-0f1bce7ddef5"));
		((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONCOUNTER.get()).removeModifier();
	}
}
