package net.mcreator.cthulhufishing.block.renderer;

public class Obelisk3TileRenderer extends GeoBlockRenderer<Obelisk3TileEntity> {
	public Obelisk3TileRenderer() {
		super(new Obelisk3BlockModel());
	}

	@Override
	public RenderType getRenderType(Obelisk3TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}