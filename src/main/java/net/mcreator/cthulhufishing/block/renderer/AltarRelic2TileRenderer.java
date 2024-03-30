package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic2BlockModel;
import net.mcreator.cthulhufishing.block.entity.AltarRelic2TileEntity;

public class AltarRelic2TileRenderer extends GeoBlockRenderer<AltarRelic2TileEntity> {
	public AltarRelic2TileRenderer() {
		super(new AltarRelic2BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
