
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cthulhufishing.client.model.Modelnew_frozen_leggins;
import net.mcreator.cthulhufishing.client.model.Modelmodel_HoodOfTheWhispersOfTheDeep;
import net.mcreator.cthulhufishing.client.model.Modelmask_Converted;
import net.mcreator.cthulhufishing.client.model.ModelFossilFishArmor;
import net.mcreator.cthulhufishing.client.model.ModelBlockEye;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CthulhufishingModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelFossilFishArmor.LAYER_LOCATION, ModelFossilFishArmor::createBodyLayer);
		event.registerLayerDefinition(Modelmask_Converted.LAYER_LOCATION, Modelmask_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelmodel_HoodOfTheWhispersOfTheDeep.LAYER_LOCATION, Modelmodel_HoodOfTheWhispersOfTheDeep::createBodyLayer);
		event.registerLayerDefinition(Modelnew_frozen_leggins.LAYER_LOCATION, Modelnew_frozen_leggins::createBodyLayer);
		event.registerLayerDefinition(ModelBlockEye.LAYER_LOCATION, ModelBlockEye::createBodyLayer);
	}
}
