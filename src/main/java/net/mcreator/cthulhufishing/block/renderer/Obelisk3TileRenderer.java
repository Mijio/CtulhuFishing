package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.Obelisk3BlockModel;
import net.mcreator.cthulhufishing.block.entity.Obelisk3TileEntity;

public class Obelisk3TileRenderer extends GeoBlockRenderer<Obelisk3TileEntity> {
	public Obelisk3TileRenderer() {
		super(new Obelisk3BlockModel());
	}

	@Override
	public RenderType getRenderType(Obelisk3TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
