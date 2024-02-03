package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.CriticalHitEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;
import net.mcreator.cthulhufishing.init.CthulhufishingModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TentacleStaffAbillityProcedure {
	@SubscribeEvent
	public static void onPlayerCriticalHit(CriticalHitEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CthulhufishingModItems.TENTACLE_STAFF.get()
				&& (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score != 0 && entity instanceof LivingEntity
				&& ((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE) != null) {
			{
				boolean _setval = true;
				sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RC_IsNegative = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			{
				double _setval = 1;
				sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Revalation_Change = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			RevelationChangeSourceProcedure.execute(sourceentity);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:hood_ablity")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:hood_ablity")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			entity.hurt(DamageSource.MAGIC, (float) (((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).getValue()
					* (sourceentity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score * 0.01));
			world.addParticle(ParticleTypes.ENCHANTED_HIT, (entity.getX()), (entity.getY()), (entity.getZ()), 0, 1, 0);
		}
	}
}
