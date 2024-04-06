package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.init.CthulhufishingModEntities;
import net.mcreator.cthulhufishing.entity.CthulhuAdeptEntity;

import java.util.Comparator;

public class CthulhuAdeptOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double n = 0;
		double speed = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
		} else {
			entity.getPersistentData().putDouble("IDLE", (entity.getPersistentData().getDouble("IDLE") + 1));
		}
		if (entity.getPersistentData().getDouble("IDLE") == 35) {
			if (entity instanceof CthulhuAdeptEntity) {
				((CthulhuAdeptEntity) entity).setAnimation("animation.staffinhands");
			}
		}
		if (entity.getPersistentData().getDouble("IDLE") == 80) {
			entity.getPersistentData().putDouble("IDLE", 0);
		}
		if (entity.getPersistentData().getDouble("AI") == 50) {
			if (entity instanceof CthulhuAdeptEntity) {
				((CthulhuAdeptEntity) entity).setAnimation("animation.adeptattack");
			}
			speed = ((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).getBaseValue();
		}
		if (entity.getPersistentData().getDouble("AI") == 60) {
			if (!(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) == null)) {
				entity.getPersistentData().putDouble("attack", 1);
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0);
				n = 4;
				for (int index0 = 0; index0 < 3; index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CthulhufishingModEntities.GRIMOIRE_TENTACLE.get().spawn(_level, BlockPos.containing(x + n, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CthulhufishingModEntities.GRIMOIRE_TENTACLE.get().spawn(_level, BlockPos.containing(x, y, z + n), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CthulhufishingModEntities.GRIMOIRE_TENTACLE.get().spawn(_level, BlockPos.containing(x - n, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CthulhufishingModEntities.GRIMOIRE_TENTACLE.get().spawn(_level, BlockPos.containing(x, y, z - n), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CthulhufishingModEntities.GRIMOIRE_TENTACLE.get().spawn(_level, BlockPos.containing(x + n - 1, y, z + n - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CthulhufishingModEntities.GRIMOIRE_TENTACLE.get().spawn(_level, BlockPos.containing(x - (n - 1), y, z + n - 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CthulhufishingModEntities.GRIMOIRE_TENTACLE.get().spawn(_level, BlockPos.containing(x + n - 1, y, z - (n - 1)), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CthulhufishingModEntities.GRIMOIRE_TENTACLE.get().spawn(_level, BlockPos.containing(x - (n - 1), y, z - (n - 1)), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					n = n + 2;
				}
			} else {
				entity.getPersistentData().putDouble("AI", 0);
			}
		}
		if (entity.getPersistentData().getDouble("AI") == 90) {
			entity.getPersistentData().putDouble("AI", 0);
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(speed);
		}
	}
}
