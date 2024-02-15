package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;
import net.mcreator.cthulhufishing.init.CthulhufishingModItems;

public class RevelationChangeSourceProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).RC_IsNegative) {
			if ((sourceentity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == CthulhufishingModItems.MASK_OF_REVELATION_HELMET.get()) {
				if ((sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score
						- (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revalation_Change / 2 < 0) {
					{
						double _setval = 0;
						sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Revelation_Score = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else {
					{
						double _setval = (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score
								- (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revalation_Change / 2;
						sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Revelation_Score = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			} else {
				if ((sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score
						- (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revalation_Change < 0) {
					{
						double _setval = 0;
						sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Revelation_Score = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				} else {
					{
						double _setval = (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score
								- (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revalation_Change;
						sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Revelation_Score = _setval;
							capability.syncPlayerVariables(sourceentity);
						});
					}
				}
			}
		} else {
			if ((sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score
					+ (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revalation_Change > 60) {
				{
					double _setval = 60;
					sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Revelation_Score = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			} else {
				{
					double _setval = (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score
							+ (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revalation_Change;
					sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Revelation_Score = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}
