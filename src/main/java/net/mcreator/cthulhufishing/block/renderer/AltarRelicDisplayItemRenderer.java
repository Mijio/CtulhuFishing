package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelicDisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelicDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AltarRelicDisplayItemRenderer extends GeoItemRenderer<AltarRelicDisplayItem> {
	public AltarRelicDisplayItemRenderer() {
		super(new AltarRelicDisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelicDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
