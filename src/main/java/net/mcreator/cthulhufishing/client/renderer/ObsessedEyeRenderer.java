
package net.mcreator.cthulhufishing.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.entity.model.ObsessedEyeModel;
import net.mcreator.cthulhufishing.entity.ObsessedEyeEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

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
