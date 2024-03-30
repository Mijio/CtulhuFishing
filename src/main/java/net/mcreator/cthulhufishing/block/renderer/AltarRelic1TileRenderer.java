package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic1BlockModel;
import net.mcreator.cthulhufishing.block.entity.AltarRelic1TileEntity;

public class AltarRelic1TileRenderer extends GeoBlockRenderer<AltarRelic1TileEntity> {
	public AltarRelic1TileRenderer() {
		super(new AltarRelic1BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
