package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic3DisplayItemRenderer extends GeoItemRenderer<AltarRelic3DisplayItem> {
	public AltarRelic3DisplayItemRenderer() {
		super(new AltarRelic3DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}