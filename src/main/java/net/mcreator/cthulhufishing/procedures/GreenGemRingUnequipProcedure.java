package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GreenGemRingUnequipProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).removeModifier(UUID.fromString("438a6d3a-7ef4-4c2a-b735-020bfaf8012c"));
		((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONCOUNTER.get()).removeModifier();
	}
}
