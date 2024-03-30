package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic1DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic1DisplayItem;

public class AltarRelic1DisplayItemRenderer extends GeoItemRenderer<AltarRelic1DisplayItem> {
	public AltarRelic1DisplayItemRenderer() {
		super(new AltarRelic1DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
