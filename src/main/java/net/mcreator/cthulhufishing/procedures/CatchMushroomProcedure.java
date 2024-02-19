package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CatchMushroomProcedure {
	@SubscribeEvent
	public static void onPlayerFishItem(ItemFishedEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double RandomCrisonFishCatch = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == CthulhufishingModItems.MUSHROOM_LURE.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CthulhufishingModItems.MUSHROOM_LURE.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DARKNESS) : false) && (world.getBiome(new BlockPos(entity.getX(), entity.getY(), entity.getZ())).is(new ResourceLocation("mushroom_fields"))
					|| world.getBiome(new BlockPos(entity.getX(), entity.getY(), entity.getZ())).is(new ResourceLocation("mushroom_fields")))) {
				if (Mth.nextInt(RandomSource.create(), 1, 100) + (entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score * 0.5
						+ EnchantmentHelper.getItemEnchantmentLevel(CthulhufishingModEnchantments.MUSHROOM_CATCHER_ENCHANTMENT.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 5 > 90) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:catch_strange_fish")), SoundSource.PLAYERS, 1, 1);
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
						double _setval = 3;
						entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Revalation_Change = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					RevelationChangeProcedure.execute(entity);
					if (entity instanceof LivingEntity lv ? CuriosApi.getCuriosHelper().findEquippedCurio(CthulhufishingModItems.MUSRHOOM_RING.get(), lv).isPresent() : false) {
						{
							boolean _setval = false;
							entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RC_IsNegative = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 3;
							entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Revalation_Change = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						RevelationChangeProcedure.execute(entity);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(CthulhufishingModItems.MUSHROOM_LURE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (RandomCrisonFishCatch == 1) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(CthulhufishingModItems.MUSHROOM_ANGLERFISH.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (RandomCrisonFishCatch == 2) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(CthulhufishingModItems.MUSHROOM_TORCHFISH.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else if (RandomCrisonFishCatch == 3) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(CthulhufishingModItems.MUSHROOM_SPRAT.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
				}
			}
		}
	}
}
