package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;

public class EyeProgressSetProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.RC_IsNegative = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 10;
			entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Revalation_Change = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		RevelationChangeProcedure.execute(entity);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList()
					.broadcastSystemMessage(Component.literal(("Revelation: " + (entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score)), false);
	}
}
