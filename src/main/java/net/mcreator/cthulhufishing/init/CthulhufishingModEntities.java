
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.entity.ObsessedEyeMobEntity;
import net.mcreator.cthulhufishing.entity.GrimoireTentacleEntity;
import net.mcreator.cthulhufishing.entity.FossilFishEntity;
import net.mcreator.cthulhufishing.CthulhufishingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CthulhufishingModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CthulhufishingMod.MODID);
	public static final RegistryObject<EntityType<ObsessedEyeMobEntity>> OBSESSED_EYE_MOB = register("obsessed_eye_mob",
			EntityType.Builder.<ObsessedEyeMobEntity>of(ObsessedEyeMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ObsessedEyeMobEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<GrimoireTentacleEntity>> GRIMOIRE_TENTACLE = register("grimoire_tentacle", EntityType.Builder.<GrimoireTentacleEntity>of(GrimoireTentacleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrimoireTentacleEntity::new).fireImmune().sized(1f, 2.5f));
	public static final RegistryObject<EntityType<FossilFishEntity>> FOSSIL_FISH = register("fossil_fish",
			EntityType.Builder.<FossilFishEntity>of(FossilFishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(80).setUpdateInterval(3).setCustomClientFactory(FossilFishEntity::new)

					.sized(0.9f, 0.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ObsessedEyeMobEntity.init();
			GrimoireTentacleEntity.init();
			FossilFishEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(OBSESSED_EYE_MOB.get(), ObsessedEyeMobEntity.createAttributes().build());
		event.put(GRIMOIRE_TENTACLE.get(), GrimoireTentacleEntity.createAttributes().build());
		event.put(FOSSIL_FISH.get(), FossilFishEntity.createAttributes().build());
	}
}
