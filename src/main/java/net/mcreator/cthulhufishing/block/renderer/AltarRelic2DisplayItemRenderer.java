package net.mcreator.cthulhufishing.block.renderer;

public class AltarRelic2DisplayItemRenderer extends GeoItemRenderer<AltarRelic2DisplayItem> {
	public AltarRelic2DisplayItemRenderer() {
		super(new AltarRelic2DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}