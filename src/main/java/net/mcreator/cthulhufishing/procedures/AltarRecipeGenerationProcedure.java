package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;

public class AltarRecipeGenerationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ButtonVis = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Altar_Recipe == 0) {
			{
				double _setval = Mth.nextInt(RandomSource.create(), 1, 12);
				entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Altar_Recipe = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = Mth.nextInt(RandomSource.create(), 3, 9);
				entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AltarFishCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
