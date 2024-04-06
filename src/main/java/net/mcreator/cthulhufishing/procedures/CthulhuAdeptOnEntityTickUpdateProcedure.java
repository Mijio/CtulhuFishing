package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.init.CthulhufishingModEntities;
import net.mcreator.cthulhufishing.entity.CthulhuAdeptEntity;

import java.util.Comparator;

public class CthulhuAdeptOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double dx = 0;
		double dz = 0;
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
		if (entity.getPersistentData().getDouble("AI") == 60) {
			if (!(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) == null)) {
				entity.getPersistentData().putDouble("attack", 1);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, false, false));
				dx = x - 4;
				dz = z - 4;
				for (int index0 = 0; index0 < 8; index0++) {
					for (int index1 = 0; index1 < 8; index1++) {
						if (dx != x && dz != z && dx != x + 1 && dz != z && dx != x && dz != z + 1 && dx != x + 1 && dz != z + 1 && dx != x - 1 && dz != z - 1 && dx != x && dz != z - 1 && dx != x - 1 && dz != z) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = CthulhufishingModEntities.GRIMOIRE_TENTACLE.get().spawn(_level, BlockPos.containing(dx, y, dz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						}
						dz = dz + 1;
					}
					dz = dx + 1;
					dz = z - 4;
				}
				entity.getPersistentData().putDouble("AI", 0);
				entity.getPersistentData().putDouble("attack", 0);
			}
			entity.getPersistentData().putDouble("AI", 0);
		}
	}
}
