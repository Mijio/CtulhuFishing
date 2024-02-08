package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic4TileRenderer extends GeoBlockRenderer<AltarRelic4TileEntity> {
	public AltarRelic4TileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new AltarRelic4BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic4TileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}