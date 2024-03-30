package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic5DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic5DisplayItem;

public class AltarRelic5DisplayItemRenderer extends GeoItemRenderer<AltarRelic5DisplayItem> {
	public AltarRelic5DisplayItemRenderer() {
		super(new AltarRelic5DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic5DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
