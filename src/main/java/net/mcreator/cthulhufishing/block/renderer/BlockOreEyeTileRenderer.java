package net.mcreator.cthulhufishing.block.renderer;

public class BlockOreEyeTileRenderer extends GeoBlockRenderer<BlockOreEyeTileEntity> {
	public BlockOreEyeTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new BlockOreEyeBlockModel());
	}

	@Override
	public RenderType getRenderType(BlockOreEyeTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}