package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelicDisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelicDisplayItem;

public class AltarRelicDisplayItemRenderer extends GeoItemRenderer<AltarRelicDisplayItem> {
	public AltarRelicDisplayItemRenderer() {
		super(new AltarRelicDisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelicDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
