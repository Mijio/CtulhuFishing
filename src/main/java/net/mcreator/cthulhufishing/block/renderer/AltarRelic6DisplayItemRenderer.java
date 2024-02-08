package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic6DisplayItemRenderer extends GeoItemRenderer<AltarRelic6DisplayItem> {
	public AltarRelic6DisplayItemRenderer() {
		super(new AltarRelic6DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic6DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}