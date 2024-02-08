package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class EmeraldGoldRingBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removeModifier(UUID.fromString("cd74d4b6-9b58-473d-acad-c0edd0d62d83"));
	}
}
