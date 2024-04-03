
package net.mcreator.cthulhufishing.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.entity.model.ObsessedEyePetModel;
import net.mcreator.cthulhufishing.entity.ObsessedEyePetEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ObsessedEyePetRenderer extends GeoEntityRenderer<ObsessedEyePetEntity> {
	public ObsessedEyePetRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ObsessedEyePetModel());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(ObsessedEyePetEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, ObsessedEyePetEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 2f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
