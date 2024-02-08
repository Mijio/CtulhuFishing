package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic2DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic2DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AltarRelic2DisplayItemRenderer extends GeoItemRenderer<AltarRelic2DisplayItem> {
	public AltarRelic2DisplayItemRenderer() {
		super(new AltarRelic2DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic2DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
