
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cthulhufishing.client.renderer.ObsessedEyePetRenderer;
import net.mcreator.cthulhufishing.client.renderer.ObsessedEyeMobRenderer;
import net.mcreator.cthulhufishing.client.renderer.ObsessedEyeMinionRenderer;
import net.mcreator.cthulhufishing.client.renderer.ObsessedEyeBossRenderer;
import net.mcreator.cthulhufishing.client.renderer.IceCrabRenderer;
import net.mcreator.cthulhufishing.client.renderer.GrimoireTentacleRenderer;
import net.mcreator.cthulhufishing.client.renderer.FossilFishRenderer;
import net.mcreator.cthulhufishing.client.renderer.CthulhuAdeptRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CthulhufishingModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CthulhufishingModEntities.OBSESSED_EYE_MOB.get(), ObsessedEyeMobRenderer::new);
		event.registerEntityRenderer(CthulhufishingModEntities.GRIMOIRE_TENTACLE.get(), GrimoireTentacleRenderer::new);
		event.registerEntityRenderer(CthulhufishingModEntities.FOSSIL_FISH.get(), FossilFishRenderer::new);
		event.registerEntityRenderer(CthulhufishingModEntities.ICE_CRAB.get(), IceCrabRenderer::new);
		event.registerEntityRenderer(CthulhufishingModEntities.OBSESSED_EYE_PET.get(), ObsessedEyePetRenderer::new);
		event.registerEntityRenderer(CthulhufishingModEntities.OBSESSED_EYE_BOSS.get(), ObsessedEyeBossRenderer::new);
		event.registerEntityRenderer(CthulhufishingModEntities.OBSESSED_EYE_MINION.get(), ObsessedEyeMinionRenderer::new);
		event.registerEntityRenderer(CthulhufishingModEntities.CTHULHU_ADEPT.get(), CthulhuAdeptRenderer::new);
	}
}
