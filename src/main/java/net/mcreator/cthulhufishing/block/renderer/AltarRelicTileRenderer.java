package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelicBlockModel;
import net.mcreator.cthulhufishing.block.entity.AltarRelicTileEntity;

public class AltarRelicTileRenderer extends GeoBlockRenderer<AltarRelicTileEntity> {
	public AltarRelicTileRenderer() {
		super(new AltarRelicBlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelicTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
