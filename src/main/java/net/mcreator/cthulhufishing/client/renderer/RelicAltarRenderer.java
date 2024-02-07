
package net.mcreator.cthulhufishing.client.renderer;

public class RelicAltarRenderer extends GeoEntityRenderer<RelicAltarEntity> {
	public RelicAltarRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RelicAltarModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(RelicAltarEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(RelicAltarEntity entityLivingBaseIn) {
		return 0.0F;
	}
}