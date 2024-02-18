package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.entity.FossilFishEntity;

public class FossilFishOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
		}
		if (entity.getPersistentData().getDouble("AI") == 110) {
			if (entity instanceof FossilFishEntity) {
				((FossilFishEntity) entity).setAnimation("animation.fossilized fish.new");
			}
		}
		if (entity.getPersistentData().getDouble("AI") == 120) {
			if (entity instanceof FossilFishEntity animatable)
				animatable.setTexture("texture_fossil_fish_mushrumed");
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x), 3, (entity.getLookAngle().z)));
		}
		if (entity.getPersistentData().getDouble("AI") == 124) {
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 2.5), (-1.5), (entity.getLookAngle().z * 2.5)));
			{
				Entity _ent = entity;
				_ent.setYRot(0);
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			entity.getPersistentData().putDouble("AI", 0);
		}
	}
}
