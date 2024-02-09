package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

import java.lang.reflect.Modifier;

public class EmeraldGoldRingWhileBaubleIsEquippedTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier Modifier = null;
		double CurrentXP = 0;
		CurrentXP = entity instanceof Player _plr ? _plr.experienceLevel : 0;
		if (entity instanceof Player _player)
			_player.giveExperiencePoints(-(entity instanceof Player _plr ? _plr.experienceLevel : 0));
		if (CurrentXP != (entity instanceof Player _plr ? _plr.experienceLevel : 0)) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removeModifier(UUID.fromString("cd74d4b6-9b58-473d-acad-c0edd0d62d83"));
			Modifier = new AttributeModifier(UUID.fromString("cd74d4b6-9b58-473d-acad-c0edd0d62d83"), ((entity instanceof Player _plr ? _plr.experienceLevel : 0) + ""), (entity instanceof Player _plr ? _plr.experienceLevel : 0),
					AttributeModifier.Operation.ADDITION);
			if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).hasModifier(Modifier)))
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).addTransientModifier(Modifier);
		}
	}
}
