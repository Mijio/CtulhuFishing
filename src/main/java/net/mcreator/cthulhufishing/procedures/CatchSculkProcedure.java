package net.mcreator.cthulhufishing.procedures;

import top.theillusivec4.curios.api.CuriosApi;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemFishedEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;
import net.mcreator.cthulhufishing.init.CthulhufishingModItems;
import net.mcreator.cthulhufishing.init.CthulhufishingModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CatchSculkProcedure {
	@SubscribeEvent
	public static void onPlayerFishItem(ItemFishedEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double RandomCrisonFishCatch = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CthulhufishingModItems.SCULK_LURE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CthulhufishingModItems.SCULK_LURE.get()) {
			if (world.getBiome(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())).is(new ResourceLocation("deep_dark"))) {
				if (Mth.nextInt(RandomSource.create(), 1, 100) + (entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score * 0.5
						+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(CthulhufishingModEnchantments.SCULK_CATCHER_ENCHANTMENT.get()) * 5 > 90) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:catch_strange_fish")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:catch_strange_fish")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					RandomCrisonFishCatch = Mth.nextInt(RandomSource.create(), 1, 3);
					{
						boolean _setval = false;
						entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RC_IsNegative = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 4;
						entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Revalation_Change = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					RevelationChangeProcedure.execute(entity);
					if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(CthulhufishingModItems.SCULK_RING.get(), lv).isPresent() : false) {
						{
							boolean _setval = false;
							entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RC_IsNegative = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 4;
							entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Revalation_Change = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						RevelationChangeProcedure.execute(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(CthulhufishingModItems.SCULK_LURE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (RandomCrisonFishCatch == 1) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(CthulhufishingModItems.GLUTON_SCULK_FISH.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (RandomCrisonFishCatch == 2) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(CthulhufishingModItems.HORSE_SCULK_FISH.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (RandomCrisonFishCatch == 3) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(CthulhufishingModItems.HERMIT_SLULK_FISH.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
			}
		}
	}
}
