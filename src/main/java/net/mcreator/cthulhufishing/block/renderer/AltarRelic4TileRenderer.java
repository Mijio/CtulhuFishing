package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.AltarRelic4BlockModel;
import net.mcreator.cthulhufishing.block.entity.AltarRelic4TileEntity;

public class AltarRelic4TileRenderer extends GeoBlockRenderer<AltarRelic4TileEntity> {
	public AltarRelic4TileRenderer() {
		super(new AltarRelic4BlockModel());
	}

	@Override
	public RenderType getRenderType(AltarRelic4TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
