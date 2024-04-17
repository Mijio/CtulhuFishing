package net.mcreator.cthulhufishing.block.renderer;

public class Obelisk2TileRenderer extends GeoBlockRenderer<Obelisk2TileEntity> {
	public Obelisk2TileRenderer() {
		super(new Obelisk2BlockModel());
	}

	@Override
	public RenderType getRenderType(Obelisk2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}