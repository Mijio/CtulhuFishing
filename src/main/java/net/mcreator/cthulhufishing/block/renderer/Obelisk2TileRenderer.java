package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.Obelisk2BlockModel;
import net.mcreator.cthulhufishing.block.entity.Obelisk2TileEntity;

public class Obelisk2TileRenderer extends GeoBlockRenderer<Obelisk2TileEntity> {
	public Obelisk2TileRenderer() {
		super(new Obelisk2BlockModel());
	}

	@Override
	public RenderType getRenderType(Obelisk2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
