package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.item.ObsessedEyeStaffRItem;
import net.mcreator.cthulhufishing.init.CthulhufishingModEntities;
import net.mcreator.cthulhufishing.init.CthulhufishingModAttributes;

public class ObsessedEyeStaffRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 2000);
		for (int index0 = 0; index0 < (int) ((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONCOUNTER.get()).getBaseValue(); index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = CthulhufishingModEntities.OBSESSED_EYE_PET.get().spawn(_level,
						BlockPos.containing(x + Mth.nextInt(RandomSource.create(), 0, 1), y + Mth.nextInt(RandomSource.create(), 0, 1), z + Mth.nextInt(RandomSource.create(), 0, 1)), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
		if (itemstack.getItem() instanceof ObsessedEyeStaffRItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "animation.staff_of_obsessed_eyes.summon");
	}
}
