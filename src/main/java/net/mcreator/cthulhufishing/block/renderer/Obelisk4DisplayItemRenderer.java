package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.Obelisk4DisplayModel;
import net.mcreator.cthulhufishing.block.display.Obelisk4DisplayItem;

public class Obelisk4DisplayItemRenderer extends GeoItemRenderer<Obelisk4DisplayItem> {
	public Obelisk4DisplayItemRenderer() {
		super(new Obelisk4DisplayModel());
	}

	@Override
	public RenderType getRenderType(Obelisk4DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
