package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic1DisplayItemRenderer extends GeoItemRenderer<AltarRelic1DisplayItem> {
	public AltarRelic1DisplayItemRenderer() {
		super(new AltarRelic1DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}