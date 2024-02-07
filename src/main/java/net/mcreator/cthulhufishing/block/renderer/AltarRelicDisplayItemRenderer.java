package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelicDisplayItemRenderer extends GeoItemRenderer<AltarRelicDisplayItem> {
	public AltarRelicDisplayItemRenderer() {
		super(new AltarRelicDisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelicDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}