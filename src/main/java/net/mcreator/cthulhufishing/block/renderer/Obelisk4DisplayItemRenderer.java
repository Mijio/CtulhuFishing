package net.mcreator.cthulhufishing.block.renderer;

public class Obelisk4DisplayItemRenderer extends GeoItemRenderer<Obelisk4DisplayItem> {
	public Obelisk4DisplayItemRenderer() {
		super(new Obelisk4DisplayModel());
	}

	@Override
	public RenderType getRenderType(Obelisk4DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}