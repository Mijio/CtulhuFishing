package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.Obelisk1BlockModel;
import net.mcreator.cthulhufishing.block.entity.Obelisk1TileEntity;

public class Obelisk1TileRenderer extends GeoBlockRenderer<Obelisk1TileEntity> {
	public Obelisk1TileRenderer() {
		super(new Obelisk1BlockModel());
	}

	@Override
	public RenderType getRenderType(Obelisk1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
