package net.mcreator.cthulhufishing.block.renderer;

public class Obelisk2DisplayItemRenderer extends GeoItemRenderer<Obelisk2DisplayItem> {
	public Obelisk2DisplayItemRenderer() {
		super(new Obelisk2DisplayModel());
	}

	@Override
	public RenderType getRenderType(Obelisk2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}