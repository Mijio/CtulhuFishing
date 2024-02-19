package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FossilFishEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 7) {
			if (entity instanceof FossilFishEntity) {
				((FossilFishEntity) entity).setAnimation("animation.fossilized fish.jump_attack");
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof FossilFishEntity)) {
						entityiterator.setDeltaMovement(new Vec3(((entityiterator.getX() - entity.getX()) * 0.5), 0.5, ((entityiterator.getZ() - entity.getZ()) * 0.5)));
					}
				}
			}
		}
	}
}
