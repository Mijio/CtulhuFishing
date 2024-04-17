package net.mcreator.cthulhufishing.block.renderer;

public class Obelisk1DisplayItemRenderer extends GeoItemRenderer<Obelisk1DisplayItem> {
	public Obelisk1DisplayItemRenderer() {
		super(new Obelisk1DisplayModel());
	}

	@Override
	public RenderType getRenderType(Obelisk1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}