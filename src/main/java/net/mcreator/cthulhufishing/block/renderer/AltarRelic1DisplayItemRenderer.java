package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic1DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AltarRelic1DisplayItemRenderer extends GeoItemRenderer<AltarRelic1DisplayItem> {
	public AltarRelic1DisplayItemRenderer() {
		super(new AltarRelic1DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
