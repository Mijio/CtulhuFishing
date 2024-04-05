package net.mcreator.cthulhufishing.block.renderer;

public class ObeliskOfGteatestObsessedEyeDisplayItemRenderer extends GeoItemRenderer<ObeliskOfGteatestObsessedEyeDisplayItem> {
	public ObeliskOfGteatestObsessedEyeDisplayItemRenderer() {
		super(new ObeliskOfGteatestObsessedEyeDisplayModel());
	}

	@Override
	public RenderType getRenderType(ObeliskOfGteatestObsessedEyeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}