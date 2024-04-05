package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.ObeliskOfGteatestObsessedEyeDisplayModel;
import net.mcreator.cthulhufishing.block.display.ObeliskOfGteatestObsessedEyeDisplayItem;

public class ObeliskOfGteatestObsessedEyeDisplayItemRenderer extends GeoItemRenderer<ObeliskOfGteatestObsessedEyeDisplayItem> {
	public ObeliskOfGteatestObsessedEyeDisplayItemRenderer() {
		super(new ObeliskOfGteatestObsessedEyeDisplayModel());
	}

	@Override
	public RenderType getRenderType(ObeliskOfGteatestObsessedEyeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
