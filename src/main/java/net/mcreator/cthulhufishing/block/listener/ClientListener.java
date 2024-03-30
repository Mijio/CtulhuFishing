package net.mcreator.cthulhufishing.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cthulhufishing.init.CthulhufishingModBlockEntities;
import net.mcreator.cthulhufishing.block.renderer.BlockOreEyeTileRenderer;
import net.mcreator.cthulhufishing.block.renderer.AltarRelicTileRenderer;
import net.mcreator.cthulhufishing.block.renderer.AltarRelic6TileRenderer;
import net.mcreator.cthulhufishing.block.renderer.AltarRelic5TileRenderer;
import net.mcreator.cthulhufishing.block.renderer.AltarRelic4TileRenderer;
import net.mcreator.cthulhufishing.block.renderer.AltarRelic3TileRenderer;
import net.mcreator.cthulhufishing.block.renderer.AltarRelic2TileRenderer;
import net.mcreator.cthulhufishing.block.renderer.AltarRelic1TileRenderer;
import net.mcreator.cthulhufishing.CthulhufishingMod;

@Mod.EventBusSubscriber(modid = CthulhufishingMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.BLOCK_ORE_EYE.get(), context -> new BlockOreEyeTileRenderer());
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.ALTAR_RELIC.get(), context -> new AltarRelicTileRenderer());
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.ALTAR_RELIC_1.get(), context -> new AltarRelic1TileRenderer());
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.ALTAR_RELIC_2.get(), context -> new AltarRelic2TileRenderer());
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.ALTAR_RELIC_3.get(), context -> new AltarRelic3TileRenderer());
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.ALTAR_RELIC_4.get(), context -> new AltarRelic4TileRenderer());
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.ALTAR_RELIC_5.get(), context -> new AltarRelic5TileRenderer());
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.ALTAR_RELIC_6.get(), context -> new AltarRelic6TileRenderer());
	}
}
