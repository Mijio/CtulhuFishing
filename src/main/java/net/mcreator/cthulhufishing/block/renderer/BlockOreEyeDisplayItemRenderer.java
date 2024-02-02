package net.mcreator.cthulhufishing.block.renderer;

public class BlockOreEyeDisplayItemRenderer extends GeoItemRenderer<BlockOreEyeDisplayItem> {
	public BlockOreEyeDisplayItemRenderer() {
		super(new BlockOreEyeDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlockOreEyeDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}