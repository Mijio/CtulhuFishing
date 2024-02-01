package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;

public class FishShows5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Altar_Recipe == 5) {
			return true;
		}
		return false;
	}
}
