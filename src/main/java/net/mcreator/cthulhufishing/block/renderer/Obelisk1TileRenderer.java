package net.mcreator.cthulhufishing.block.renderer;

public class Obelisk1TileRenderer extends GeoBlockRenderer<Obelisk1TileEntity> {
	public Obelisk1TileRenderer() {
		super(new Obelisk1BlockModel());
	}

	@Override
	public RenderType getRenderType(Obelisk1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}