
package net.mcreator.cthulhufishing.client.renderer;

public class ObsessedEyeRenderer extends GeoEntityRenderer<ObsessedEyeEntity> {
	public ObsessedEyeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ObsessedEyeModel());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(ObsessedEyeEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(2f, 2f, 2f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}