package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AltarRelicUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(("/effect give @a[distance=..10] cthulhufishing:ancient_blessing" + "100") + "" + (" " + "0")));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(("effect give @e[type=!minecraft:player,distance=..10] minecraft:speed " + "100") + "" + (" " + "3")));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(("effect give @e[type=!minecraft:player,distance=..10] minecraft:regeneration " + "100") + "" + (" " + "3")));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(("effect give @e[type=!minecraft:player,distance=..10] minecraft:resistance " + "100") + "" + (" " + "3")));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(("effect give @e[type=!minecraft:player,distance=..10] minecraft:health_boost " + "100") + "" + (" " + "3")));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(("effect give @e[type=!minecraft:player,distance=..10] minecraft:glowing " + "100") + "" + (" " + "3")));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(("effect give @e[type=!minecraft:player,distance=..10]cthulhufishing:madness" + "100") + "" + (" " + "0")));
	}
}
