package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic6TileRenderer extends GeoBlockRenderer<AltarRelic6TileEntity> {
	public AltarRelic6TileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AltarRelic6BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic6TileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}