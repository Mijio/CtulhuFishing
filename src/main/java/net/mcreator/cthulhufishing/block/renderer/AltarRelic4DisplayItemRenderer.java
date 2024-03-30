package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic4DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic4DisplayItem;

public class AltarRelic4DisplayItemRenderer extends GeoItemRenderer<AltarRelic4DisplayItem> {
	public AltarRelic4DisplayItemRenderer() {
		super(new AltarRelic4DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic4DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
