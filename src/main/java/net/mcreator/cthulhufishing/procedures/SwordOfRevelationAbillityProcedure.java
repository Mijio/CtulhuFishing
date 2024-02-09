package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;

import java.util.UUID;

public class SwordOfRevelationAbillityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		AttributeModifier AddDamage = null;
		if ((sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score != 0) {
			AddDamage = new AttributeModifier(UUID.fromString("dcaa9c98-2f4b-424a-b136-8a8cf836a11b"), "damage",
					((sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score * 0.1), AttributeModifier.Operation.ADDITION);
		}
	}
}
