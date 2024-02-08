package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic3TileRenderer extends GeoBlockRenderer<AltarRelic3TileEntity> {
	public AltarRelic3TileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AltarRelic3BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic3TileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}