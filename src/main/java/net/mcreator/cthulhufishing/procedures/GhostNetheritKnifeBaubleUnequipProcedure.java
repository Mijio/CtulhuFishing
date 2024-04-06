package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;
import net.mcreator.cthulhufishing.init.CthulhufishingModAttributes;

import java.util.UUID;

public class GhostNetheritKnifeBaubleUnequipProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removeModifier(UUID.fromString("8f2868c0-75e0-4747-af05-30b306e04479"));
		((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONDAMAGE.get()).removeModifier(CthulhufishingModVariables.Summon_Damage_GNB);
	}
}
