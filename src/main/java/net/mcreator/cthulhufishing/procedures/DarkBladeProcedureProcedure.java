package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.CriticalHitEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.cthulhufishing.init.CthulhufishingModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DarkBladeProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerCriticalHit(CriticalHitEvent event) {
		execute(event, event.getTarget(), event.getEntity());
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(CthulhufishingModEnchantments.DARK_BLADE.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60,
						EnchantmentHelper.getItemEnchantmentLevel(CthulhufishingModEnchantments.DARK_BLADE.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))));
			entity.hurt(DamageSource.MAGIC, EnchantmentHelper.getItemEnchantmentLevel(CthulhufishingModEnchantments.DARK_BLADE.get(), (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)));
		}
	}
}
