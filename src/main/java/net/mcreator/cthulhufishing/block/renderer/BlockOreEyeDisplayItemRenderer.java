package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.BlockOreEyeDisplayModel;
import net.mcreator.cthulhufishing.block.display.BlockOreEyeDisplayItem;

public class BlockOreEyeDisplayItemRenderer extends GeoItemRenderer<BlockOreEyeDisplayItem> {
	public BlockOreEyeDisplayItemRenderer() {
		super(new BlockOreEyeDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlockOreEyeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
