package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.cthulhufishing.init.CthulhufishingModBlocks;

public class AltarRelicUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String amplifier_curse = "";
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "Timer") == 60) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.BLOCK);
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:relic_idle")), SoundSource.BLOCKS, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:relic_idle")), SoundSource.BLOCKS, 1, 1, false);
			}
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("Timer", (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "Timer") + 1));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CthulhufishingModBlocks.ALTAR_RELIC.get()) {
			amplifier_curse = "3";
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CthulhufishingModBlocks.ALTAR_RELIC_1.get()) {
			amplifier_curse = "2";
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CthulhufishingModBlocks.ALTAR_RELIC_2.get()) {
			amplifier_curse = "2";
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CthulhufishingModBlocks.ALTAR_RELIC_3.get()) {
			amplifier_curse = "1";
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CthulhufishingModBlocks.ALTAR_RELIC_4.get()) {
			amplifier_curse = "1";
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CthulhufishingModBlocks.ALTAR_RELIC_5.get()) {
			amplifier_curse = "0";
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == CthulhufishingModBlocks.ALTAR_RELIC_6.get()) {
			amplifier_curse = "0";
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("/effect give @a[distance=..10] cthulhufishing:ancient_curse" + " " + "5" + " " + amplifier_curse));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("effect give @e[type=!minecraft:player,distance=..10] minecraft:speed" + " " + "5" + " " + amplifier_curse));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("effect give @e[type=!minecraft:player,distance=..10] minecraft:regeneration" + " " + "5" + " " + amplifier_curse));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("effect give @e[type=!minecraft:player,distance=..10] minecraft:resistance" + " " + "5" + " " + amplifier_curse));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("effect give @e[type=!minecraft:player,distance=..10] minecraft:health_boost" + " " + "5" + " " + amplifier_curse));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("effect give @e[type=!minecraft:player,distance=..10] minecraft:glowing" + " " + "5" + " " + "0"));
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					("effect give @e[type=!minecraft:player,distance=..10] cthulhufishing:madness" + " " + "5" + " " + "0"));
	}
}
