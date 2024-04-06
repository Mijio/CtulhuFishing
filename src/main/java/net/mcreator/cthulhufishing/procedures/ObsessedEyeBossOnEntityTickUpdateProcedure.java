package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ObsessedEyeBossOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		if (!(((Entity) world.getEntitiesOfClass(ObsessedEyeMinionEntity.class, AABB.ofSize(new Vec3(x, y, z), 30, 30, 30), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)) == null)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 5, false, false));
		}
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
			if (entity.getPersistentData().getDouble("EyeSpawn") == 0) {
				for (int index0 = 0; index0 < 4; index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = CthulhufishingModEntities.DELETED_MOD_ELEMENT.get().spawn(_level, BlockPos.containing(x + Math.random() + 1, y, z + Math.random() + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
				entity.getPersistentData().putDouble("EyeSpawn", 1);
			}
		}
		if (entity.getPersistentData().getDouble("AI") == 80 || entity.getPersistentData().getDouble("AI") == 160) {
			if (!(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 30, 30, 30), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) == null)) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator instanceof ObsessedEyeBossEntity) && !(entityiterator instanceof ObsessedEyeMinionEntity)) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 1);
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 20, 0, false, false));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.PORTAL, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 80, 0.5, 0.5, 0.5, 0);
						}
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("AI") == 180) {
			if (Math.random() < 0.3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = CthulhufishingModEntities.DELETED_MOD_ELEMENT.get().spawn(_level, BlockPos.containing(x + Math.random(), y, z + Math.random()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("AI") == 199) {
			dx = x - 1;
			dy = y - 1;
			dz = z - 1;
			for (int index1 = 0; index1 < 2; index1++) {
				for (int index2 = 0; index2 < 5; index2++) {
					for (int index3 = 0; index3 < 5; index3++) {
						if (!((world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.VOID_AIR
								|| (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.WATER
								|| (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.LAVA
								|| (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.LAVA || (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.BEDROCK
								|| (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.OBSIDIAN)) {
							world.levelEvent(2001, BlockPos.containing(dx, dy, dz), Block.getId((world.getBlockState(BlockPos.containing(dx, dy, dz)))));
							world.destroyBlock(BlockPos.containing(dx, dy, dz), false);
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
		}
		if (entity.getPersistentData().getDouble("AI") == 200) {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
				entity.setDeltaMovement(new Vec3((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) * 0.3),
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY()) * 0.3), (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) * 0.3)));
				dx = x - 1;
				dy = y - 1;
				dz = z - 1;
				for (int index4 = 0; index4 < 3; index4++) {
					for (int index5 = 0; index5 < 5; index5++) {
						for (int index6 = 0; index6 < 5; index6++) {
							if (!((world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.VOID_AIR
									|| (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.CAVE_AIR || (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.WATER
									|| (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.LAVA
									|| (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.LAVA || (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.BEDROCK
									|| (world.getBlockState(BlockPos.containing(dx, dy, dz))).getBlock() == Blocks.OBSIDIAN)) {
								world.levelEvent(2001, BlockPos.containing(dx, dy, dz), Block.getId((world.getBlockState(BlockPos.containing(dx, dy, dz)))));
								world.destroyBlock(BlockPos.containing(dx, dy, dz), false);
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
			}
			entity.getPersistentData().putDouble("AI", 0);
		}
	}
}
