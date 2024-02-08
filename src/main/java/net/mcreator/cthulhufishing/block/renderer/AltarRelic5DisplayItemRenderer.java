package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic5DisplayModel;
import net.mcreator.cthulhufishing.block.display.AltarRelic5DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AltarRelic5DisplayItemRenderer extends GeoItemRenderer<AltarRelic5DisplayItem> {
	public AltarRelic5DisplayItemRenderer() {
		super(new AltarRelic5DisplayModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic5DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
