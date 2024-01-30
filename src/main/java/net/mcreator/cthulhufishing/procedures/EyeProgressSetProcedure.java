package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.CommandEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;

import javax.annotation.Nullable;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class EyeProgressSetProcedure {
	@SubscribeEvent
	public static void onCommand(CommandEvent event) {
		Entity entity = event.getParseResults().getContext().getSource().getEntity();
		if (entity != null) {
			execute(event, event.getParseResults().getContext().build(event.getParseResults().getReader().getString()), entity);
		}
	}

	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		execute(null, arguments, entity);
	}

	private static void execute(@Nullable Event event, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = DoubleArgumentType.getDouble(arguments, "eye");
			entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.EyeProgress = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
