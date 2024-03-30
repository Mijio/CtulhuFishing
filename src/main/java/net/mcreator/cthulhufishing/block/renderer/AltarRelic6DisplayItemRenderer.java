package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic6DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic6DisplayItem;

public class AltarRelic6DisplayItemRenderer extends GeoItemRenderer<AltarRelic6DisplayItem> {
	public AltarRelic6DisplayItemRenderer() {
		super(new AltarRelic6DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic6DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
