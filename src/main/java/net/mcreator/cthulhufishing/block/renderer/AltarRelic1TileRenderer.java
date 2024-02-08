package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic1TileRenderer extends GeoBlockRenderer<AltarRelic1TileEntity> {
	public AltarRelic1TileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AltarRelic1BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic1TileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}