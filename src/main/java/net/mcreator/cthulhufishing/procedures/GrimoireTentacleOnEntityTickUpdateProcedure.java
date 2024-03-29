package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.cthulhufishing.entity.GrimoireTentacleEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class GrimoireTentacleOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Mobs_Count = 0;
		Mobs_Count = 1;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof PathfinderMob && !(entityiterator instanceof GrimoireTentacleEntity)) {
					Mobs_Count = Mobs_Count + 1;
					entityiterator.setDeltaMovement(new Vec3(0, 1, 0));
					entityiterator.hurt(DamageSource.MAGIC, (float) (Mobs_Count * 0.05 * ((LivingEntity) entityiterator).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).getBaseValue()));
				}
			}
		}
		GrimoireTentacleOnInitialEntitySpawnProcedure.execute(world, entity);
	}
}
