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
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			entity.getPersistentData().putDouble("AI", (entity.getPersistentData().getDouble("AI") + 1));
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
						if (!(entityiterator instanceof ObsessedEyeBossEntity) && !(entityiterator instanceof ObsessedEyeMobEntity)) {
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 1);
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 20, 0, false, false));
						}
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("AI") == 199) {
			dx = x - 1;
			dy = y - 1;
			dz = z - 1;
			for (int index0 = 0; index0 < 5; index0++) {
				for (int index1 = 0; index1 < 5; index1++) {
					for (int index2 = 0; index2 < 5; index2++) {
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
			if (!(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) == null)) {
				entity.setDeltaMovement(new Vec3(((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX() - entity.getX()) * 0.8), ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() - entity.getY()) * 0.8), ((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40, 40, 40), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() - entity.getZ()) * 0.8)));
			}
			entity.getPersistentData().putDouble("AI", 0);
		}
	}
}
