package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic3DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic3DisplayItem;

public class AltarRelic3DisplayItemRenderer extends GeoItemRenderer<AltarRelic3DisplayItem> {
	public AltarRelic3DisplayItemRenderer() {
		super(new AltarRelic3DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic3DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
