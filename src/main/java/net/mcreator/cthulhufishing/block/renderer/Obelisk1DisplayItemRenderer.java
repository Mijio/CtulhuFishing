package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.Obelisk1DisplayModel;
import net.mcreator.cthulhufishing.block.display.Obelisk1DisplayItem;

public class Obelisk1DisplayItemRenderer extends GeoItemRenderer<Obelisk1DisplayItem> {
	public Obelisk1DisplayItemRenderer() {
		super(new Obelisk1DisplayModel());
	}

	@Override
	public RenderType getRenderType(Obelisk1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
