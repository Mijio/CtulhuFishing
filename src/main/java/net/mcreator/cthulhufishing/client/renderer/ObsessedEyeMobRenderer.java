
package net.mcreator.cthulhufishing.client.renderer;

public class ObsessedEyeMobRenderer extends GeoEntityRenderer<ObsessedEyeMobEntity> {
	public ObsessedEyeMobRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ObsessedEyeMobModel());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(ObsessedEyeMobEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(2f, 2f, 2f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}