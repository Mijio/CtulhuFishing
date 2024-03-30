package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic6BlockModel;
import net.mcreator.cthulhufishing.block.entity.AltarRelic6TileEntity;

public class AltarRelic6TileRenderer extends GeoBlockRenderer<AltarRelic6TileEntity> {
	public AltarRelic6TileRenderer() {
		super(new AltarRelic6BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic6TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
