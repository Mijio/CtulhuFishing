package net.mcreator.cthulhufishing.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.cthulhufishing.block.model.ObeliskOfGteatestObsessedEyeBlockModel;
import net.mcreator.cthulhufishing.block.entity.ObeliskOfGteatestObsessedEyeTileEntity;

public class ObeliskOfGteatestObsessedEyeTileRenderer extends GeoBlockRenderer<ObeliskOfGteatestObsessedEyeTileEntity> {
	public ObeliskOfGteatestObsessedEyeTileRenderer() {
		super(new ObeliskOfGteatestObsessedEyeBlockModel());
	}

	@Override
	public RenderType getRenderType(ObeliskOfGteatestObsessedEyeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
