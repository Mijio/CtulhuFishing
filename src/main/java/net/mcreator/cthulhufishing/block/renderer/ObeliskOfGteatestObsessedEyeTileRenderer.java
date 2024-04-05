package net.mcreator.cthulhufishing.block.renderer;

public class ObeliskOfGteatestObsessedEyeTileRenderer extends GeoBlockRenderer<ObeliskOfGteatestObsessedEyeTileEntity> {
	public ObeliskOfGteatestObsessedEyeTileRenderer() {
		super(new ObeliskOfGteatestObsessedEyeBlockModel());
	}

	@Override
	public RenderType getRenderType(ObeliskOfGteatestObsessedEyeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}