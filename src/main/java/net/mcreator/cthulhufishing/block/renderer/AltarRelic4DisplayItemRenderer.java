package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic4DisplayItemRenderer extends GeoItemRenderer<AltarRelic4DisplayItem> {
	public AltarRelic4DisplayItemRenderer() {
		super(new AltarRelic4DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic4DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}