
package net.mcreator.cthulhufishing.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class EyeHUDOverlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();

		int posX = w / 2;
		int posY = h / 2;

		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;

		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}

		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);

		if (true) {

			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_0.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -25, posY + -127, 0, 0, 51, 45, 51, 45);

			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_1.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -25, posY + -127, 0, 0, 51, 45, 51, 45);

			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_2.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -25, posY + -127, 0, 0, 51, 45, 51, 45);

			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_3.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -25, posY + -127, 0, 0, 51, 45, 51, 45);

			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_4.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -26, posY + -128, 0, 0, 51, 45, 51, 45);

			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_5.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -26, posY + -128, 0, 0, 51, 45, 51, 45);

			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_6.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -26, posY + -128, 0, 0, 51, 45, 51, 45);

			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation.png"));
			Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -26, posY + -128, 0, 0, 51, 45, 51, 45);

		}

		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}

}
