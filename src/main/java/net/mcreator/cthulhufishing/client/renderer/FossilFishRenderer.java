
package net.mcreator.cthulhufishing.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.entity.model.FossilFishModel;
import net.mcreator.cthulhufishing.entity.FossilFishEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FossilFishRenderer extends GeoEntityRenderer<FossilFishEntity> {
	public FossilFishRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FossilFishModel());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(FossilFishEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(2.8f, 2.8f, 2.8f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
