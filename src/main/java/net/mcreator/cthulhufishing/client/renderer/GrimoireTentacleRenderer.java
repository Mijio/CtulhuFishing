
package net.mcreator.cthulhufishing.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

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
	public RenderType getRenderType(GrimoireTentacleEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, GrimoireTentacleEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 2f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(GrimoireTentacleEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
