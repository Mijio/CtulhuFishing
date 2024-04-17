package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.Obelisk4BlockModel;
import net.mcreator.cthulhufishing.block.entity.Obelisk4TileEntity;

public class Obelisk4TileRenderer extends GeoBlockRenderer<Obelisk4TileEntity> {
	public Obelisk4TileRenderer() {
		super(new Obelisk4BlockModel());
	}

	@Override
	public RenderType getRenderType(Obelisk4TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
