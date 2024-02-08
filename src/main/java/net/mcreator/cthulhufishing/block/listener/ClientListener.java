package net.mcreator.cthulhufishing.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cthulhufishing.init.CthulhufishingModBlockEntities;
import net.mcreator.cthulhufishing.block.renderer.BlockOreEyeTileRenderer;
import net.mcreator.cthulhufishing.block.renderer.AltarRelicTileRenderer;
import net.mcreator.cthulhufishing.CthulhufishingMod;

@Mod.EventBusSubscriber(modid = CthulhufishingMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.BLOCK_ORE_EYE.get(), BlockOreEyeTileRenderer::new);
		event.registerBlockEntityRenderer(CthulhufishingModBlockEntities.ALTAR_RELIC.get(), AltarRelicTileRenderer::new);
	}
}
