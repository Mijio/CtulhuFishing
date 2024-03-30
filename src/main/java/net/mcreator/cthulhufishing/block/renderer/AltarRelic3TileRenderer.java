package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic3BlockModel;
import net.mcreator.cthulhufishing.block.entity.AltarRelic3TileEntity;

public class AltarRelic3TileRenderer extends GeoBlockRenderer<AltarRelic3TileEntity> {
	public AltarRelic3TileRenderer() {
		super(new AltarRelic3BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic3TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
