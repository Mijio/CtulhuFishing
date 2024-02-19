package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.init.CthulhufishingModMobEffects;
import net.mcreator.cthulhufishing.entity.FossilFishEntity;

import java.util.Comparator;

public class FossilFishOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CthulhufishingModMobEffects.MUSHROOMED.get()) : false) {
			if (entity instanceof FossilFishEntity animatable)
				animatable.setTexture("texture_fossil_fish_mushrumed");
		} else {
			if (entity instanceof FossilFishEntity animatable)
				animatable.setTexture("texture_fossil_fish");
		}
		dx = x - 1;
		dy = y - 1;
		dz = z - 1;
		for (int index0 = 0; index0 < 5; index0++) {
			for (int index1 = 0; index1 < 5; index1++) {
				for (int index2 = 0; index2 < 5; index2++) {
					if (!((world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.AIR || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.WATER
							|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.LAVA
							|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.LAVA || (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.BEDROCK
							|| (world.getBlockState(new BlockPos(dx, dy, dz))).getBlock() == Blocks.OBSIDIAN)) {
						world.levelEvent(2001, new BlockPos(dx, dy, dz), Block.getId((world.getBlockState(new BlockPos(dx, dy, dz)))));
						world.destroyBlock(new BlockPos(dx, dy, dz), false);
					}
					dz = dz + 1;
				}
				dz = z - 1;
				dx = dx + 1;
			}
			dx = x - 1;
			dz = z - 1;
			dy = dy + 1;
		}
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
		}
		if (entity.getPersistentData().getDouble("AI") == 116) {
			if (entity instanceof FossilFishEntity) {
				((FossilFishEntity) entity).setAnimation("animation.fossilized fish.attack");
			}
		}
		if (entity.getPersistentData().getDouble("AI") == 120) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:fossil_fish_attack")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:fossil_fish_attack")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			entity.setDeltaMovement(new Vec3(0, 1, 0));
		}
		if (entity.getPersistentData().getDouble("AI") == 122) {
			if (!(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) == null)) {
				entity.setDeltaMovement(new Vec3(((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() - entity.getX()) * 1), ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() - entity.getY()) * 1), ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() - entity.getZ()) * 1)));
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("vector X:" + (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() - entity.getX()) * 1 + " Y:" + (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() - entity.getY()) * 1 + " Z:" + (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() - entity.getZ()) * 1)), false);
			}
			entity.getPersistentData().putDouble("AI", 0);
		}
	}
}
