
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cthulhufishing.client.model.Modelmodel_HoodOfTheWhispersOfTheDeep;
import net.mcreator.cthulhufishing.client.model.ModelBlockEye;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CthulhufishingModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmodel_HoodOfTheWhispersOfTheDeep.LAYER_LOCATION, Modelmodel_HoodOfTheWhispersOfTheDeep::createBodyLayer);
		event.registerLayerDefinition(ModelBlockEye.LAYER_LOCATION, ModelBlockEye::createBodyLayer);
	}
}
