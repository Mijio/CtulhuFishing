package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic6DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic6DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AltarRelic6DisplayItemRenderer extends GeoItemRenderer<AltarRelic6DisplayItem> {
	public AltarRelic6DisplayItemRenderer() {
		super(new AltarRelic6DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic6DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
