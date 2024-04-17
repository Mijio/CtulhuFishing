package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.Obelisk3DisplayModel;
import net.mcreator.cthulhufishing.block.display.Obelisk3DisplayItem;

public class Obelisk3DisplayItemRenderer extends GeoItemRenderer<Obelisk3DisplayItem> {
	public Obelisk3DisplayItemRenderer() {
		super(new Obelisk3DisplayModel());
	}

	@Override
	public RenderType getRenderType(Obelisk3DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
