package net.mcreator.cthulhufishing.block.renderer;

public class Obelisk3DisplayItemRenderer extends GeoItemRenderer<Obelisk3DisplayItem> {
	public Obelisk3DisplayItemRenderer() {
		super(new Obelisk3DisplayModel());
	}

	@Override
	public RenderType getRenderType(Obelisk3DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}