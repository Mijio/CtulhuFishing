package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.Obelisk2DisplayModel;
import net.mcreator.cthulhufishing.block.display.Obelisk2DisplayItem;

public class Obelisk2DisplayItemRenderer extends GeoItemRenderer<Obelisk2DisplayItem> {
	public Obelisk2DisplayItemRenderer() {
		super(new Obelisk2DisplayModel());
	}

	@Override
	public RenderType getRenderType(Obelisk2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
