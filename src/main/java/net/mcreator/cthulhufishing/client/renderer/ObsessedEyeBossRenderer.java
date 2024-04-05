
package net.mcreator.cthulhufishing.client.renderer;

public class ObsessedEyeBossRenderer extends GeoEntityRenderer<ObsessedEyeBossEntity> {
	public ObsessedEyeBossRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ObsessedEyeBossModel());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(ObsessedEyeBossEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ObsessedEyeBossEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 10f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}