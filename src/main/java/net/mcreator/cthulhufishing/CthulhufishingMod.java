/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.cthulhufishing;

import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.cthulhufishing.init.CthulhufishingModVillagerProfessions;
import net.mcreator.cthulhufishing.init.CthulhufishingModTabs;
import net.mcreator.cthulhufishing.init.CthulhufishingModSounds;
import net.mcreator.cthulhufishing.init.CthulhufishingModParticleTypes;
import net.mcreator.cthulhufishing.init.CthulhufishingModMobEffects;
import net.mcreator.cthulhufishing.init.CthulhufishingModMenus;
import net.mcreator.cthulhufishing.init.CthulhufishingModItems;
import net.mcreator.cthulhufishing.init.CthulhufishingModFeatures;
import net.mcreator.cthulhufishing.init.CthulhufishingModEntities;
import net.mcreator.cthulhufishing.init.CthulhufishingModEnchantments;
import net.mcreator.cthulhufishing.init.CthulhufishingModBlocks;
import net.mcreator.cthulhufishing.init.CthulhufishingModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.AbstractMap;

@Mod("cthulhufishing")
public class CthulhufishingMod {
	public static final Logger LOGGER = LogManager.getLogger(CthulhufishingMod.class);
	public static final String MODID = "cthulhufishing";

	public CthulhufishingMod() {
		MinecraftForge.EVENT_BUS.register(this);
		CthulhufishingModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		CthulhufishingModSounds.REGISTRY.register(bus);
		CthulhufishingModBlocks.REGISTRY.register(bus);
		CthulhufishingModItems.REGISTRY.register(bus);
		CthulhufishingModEntities.REGISTRY.register(bus);
		CthulhufishingModBlockEntities.REGISTRY.register(bus);
		CthulhufishingModFeatures.REGISTRY.register(bus);

		CthulhufishingModMobEffects.REGISTRY.register(bus);

		CthulhufishingModEnchantments.REGISTRY.register(bus);
		CthulhufishingModParticleTypes.REGISTRY.register(bus);
		CthulhufishingModMenus.REGISTRY.register(bus);

		CthulhufishingModVillagerProfessions.PROFESSIONS.register(bus);
		GeckoLib.initialize();
	}

	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

	public static void queueServerWork(int tick, Runnable action) {
		workQueue.add(new AbstractMap.SimpleEntry(action, tick));
	}

	@SubscribeEvent
	public void tick(TickEvent.ServerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
			workQueue.forEach(work -> {
				work.setValue(work.getValue() - 1);
				if (work.getValue() == 0)
					actions.add(work);
			});
			actions.forEach(e -> e.getKey().run());
			workQueue.removeAll(actions);
		}
	}
}
