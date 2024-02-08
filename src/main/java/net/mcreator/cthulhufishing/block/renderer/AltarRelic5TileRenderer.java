package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic5TileRenderer extends GeoBlockRenderer<AltarRelic5TileEntity> {
	public AltarRelic5TileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AltarRelic5BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic5TileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}