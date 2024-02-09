package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class EmeraldGoldRingBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).hasModifier((new AttributeModifier(UUID.fromString("cd74d4b6-9b58-473d-acad-c0edd0d62d83"),
				((entity instanceof Player _plr ? _plr.experienceLevel : 0) + ""), (entity instanceof Player _plr ? _plr.experienceLevel : 0), AttributeModifier.Operation.ADDITION)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).addTransientModifier((new AttributeModifier(UUID.fromString("cd74d4b6-9b58-473d-acad-c0edd0d62d83"),
					((entity instanceof Player _plr ? _plr.experienceLevel : 0) + ""), (entity instanceof Player _plr ? _plr.experienceLevel : 0), AttributeModifier.Operation.ADDITION)));
	}
}
