
package net.mcreator.cthulhufishing.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.entity.model.RelicAltarModel;
import net.mcreator.cthulhufishing.entity.RelicAltarEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

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
