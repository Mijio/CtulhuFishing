/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EntityType;

import net.mcreator.cthulhufishing.CthulhufishingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CthulhufishingModAttributes {
	public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, CthulhufishingMod.MODID);
	public static final RegistryObject<Attribute> SUMMONDAMAGE = ATTRIBUTES.register("summon_damage", () -> (new RangedAttribute("attribute." + CthulhufishingMod.MODID + ".summon_damage", 3, 0, 100)).setSyncable(true));
	public static final RegistryObject<Attribute> SUMMONCOUNTER = ATTRIBUTES.register("summon_counter", () -> (new RangedAttribute("attribute." + CthulhufishingMod.MODID + ".summon_counter", 1, 0, 10)).setSyncable(true));

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ATTRIBUTES.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.add(EntityType.PLAYER, SUMMONDAMAGE.get());
		event.add(EntityType.PLAYER, SUMMONCOUNTER.get());
	}
}
