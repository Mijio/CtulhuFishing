package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic2TileRenderer extends GeoBlockRenderer<AltarRelic2TileEntity> {
	public AltarRelic2TileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AltarRelic2BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic2TileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}