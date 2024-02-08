package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.CthulhufishingMod;

import java.util.UUID;

public class EmeraldGoldRingBaubleIsEquippedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.giveExperiencePoints(-(entity instanceof Player _plr ? _plr.experienceLevel : 0));
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
				.hasModifier((new AttributeModifier(UUID.fromString("cd74d4b6-9b58-473d-acad-c0edd0d62d83"), "xp_damage", (entity instanceof Player _plr ? _plr.experienceLevel : 0), AttributeModifier.Operation.ADDITION)))))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.addTransientModifier((new AttributeModifier(UUID.fromString("cd74d4b6-9b58-473d-acad-c0edd0d62d83"), "xp_damage", (entity instanceof Player _plr ? _plr.experienceLevel : 0), AttributeModifier.Operation.ADDITION)));
		CthulhufishingMod.queueServerWork(5, () -> {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removeModifier(UUID.fromString("cd74d4b6-9b58-473d-acad-c0edd0d62d83"));
		});
	}
}
