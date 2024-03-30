package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.BlockOreEyeBlockModel;
import net.mcreator.cthulhufishing.block.entity.BlockOreEyeTileEntity;

public class BlockOreEyeTileRenderer extends GeoBlockRenderer<BlockOreEyeTileEntity> {
	public BlockOreEyeTileRenderer() {
		super(new BlockOreEyeBlockModel());
	}

	@Override
	public RenderType getRenderType(BlockOreEyeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
