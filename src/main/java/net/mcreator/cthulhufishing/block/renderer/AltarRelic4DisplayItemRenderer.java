package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic4DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic4DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AltarRelic4DisplayItemRenderer extends GeoItemRenderer<AltarRelic4DisplayItem> {
	public AltarRelic4DisplayItemRenderer() {
		super(new AltarRelic4DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic4DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
