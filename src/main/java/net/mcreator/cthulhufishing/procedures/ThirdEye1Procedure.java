package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;

public class ThirdEye1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).EyeProgress >= 10) {
			if ((entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).EyeProgress < 20) {
				return true;
			}
			return false;
		}
		return false;
	}
}
