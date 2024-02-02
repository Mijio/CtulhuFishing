package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class AltarRewardProcedure {
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
		ButtonIsVisibleProcedure.execute(entity);
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(0)).remove((int) (entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).AltarFishCount);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		{
			double _setval = 0;
			entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.AltarFishCount = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Altar_Recipe = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		AltarRecipeGenerationProcedure.execute(entity);
	}
}
