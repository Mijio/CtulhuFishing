package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic3DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic3DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AltarRelic3DisplayItemRenderer extends GeoItemRenderer<AltarRelic3DisplayItem> {
	public AltarRelic3DisplayItemRenderer() {
		super(new AltarRelic3DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic3DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
