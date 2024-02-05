
package net.mcreator.cthulhufishing.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.entity.model.GrimoireTentacleModel;
import net.mcreator.cthulhufishing.entity.GrimoireTentacleEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GrimoireTentacleRenderer extends GeoEntityRenderer<GrimoireTentacleEntity> {
	public GrimoireTentacleRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GrimoireTentacleModel());
		this.shadowRadius = 1f;
	}

	@Override
	public RenderType getRenderType(GrimoireTentacleEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(2f, 2f, 2f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(GrimoireTentacleEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
