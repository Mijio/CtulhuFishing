package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelicTileRenderer extends GeoBlockRenderer<AltarRelicTileEntity> {
	public AltarRelicTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AltarRelicBlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelicTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}