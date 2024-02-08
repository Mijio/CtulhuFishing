package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic5DisplayItemRenderer extends GeoItemRenderer<AltarRelic5DisplayItem> {
	public AltarRelic5DisplayItemRenderer() {
		super(new AltarRelic5DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic5DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}