package net.mcreator.cthulhufishing.block.renderer;

public class Obelisk4TileRenderer extends GeoBlockRenderer<Obelisk4TileEntity> {
	public Obelisk4TileRenderer() {
		super(new Obelisk4BlockModel());
	}

	@Override
	public RenderType getRenderType(Obelisk4TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}