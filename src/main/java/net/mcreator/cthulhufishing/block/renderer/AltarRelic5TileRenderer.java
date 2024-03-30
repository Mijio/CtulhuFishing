package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic5BlockModel;
import net.mcreator.cthulhufishing.block.entity.AltarRelic5TileEntity;

public class AltarRelic5TileRenderer extends GeoBlockRenderer<AltarRelic5TileEntity> {
	public AltarRelic5TileRenderer() {
		super(new AltarRelic5BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic5TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
