package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic2DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic2DisplayItem;

public class AltarRelic2DisplayItemRenderer extends GeoItemRenderer<AltarRelic2DisplayItem> {
	public AltarRelic2DisplayItemRenderer() {
		super(new AltarRelic2DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
