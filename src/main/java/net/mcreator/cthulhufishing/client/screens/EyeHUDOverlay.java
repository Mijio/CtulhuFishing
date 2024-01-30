
package net.mcreator.cthulhufishing.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.cthulhufishing.procedures.ThirdEye6Procedure;
import net.mcreator.cthulhufishing.procedures.ThirdEye5Procedure;
import net.mcreator.cthulhufishing.procedures.ThirdEye4Procedure;
import net.mcreator.cthulhufishing.procedures.ThirdEye3Procedure;
import net.mcreator.cthulhufishing.procedures.ThirdEye2Procedure;
import net.mcreator.cthulhufishing.procedures.ThirdEye1Procedure;
import net.mcreator.cthulhufishing.procedures.ThirdEye0Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

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
			if (ThirdEye0Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_0.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -25, posY + -127, 0, 0, 51, 45, 51, 45);
			}
			if (ThirdEye1Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -25, posY + -127, 0, 0, 51, 45, 51, 45);
			}
			if (ThirdEye2Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -25, posY + -127, 0, 0, 51, 45, 51, 45);
			}
			if (ThirdEye3Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -25, posY + -127, 0, 0, 51, 45, 51, 45);
			}
			if (ThirdEye4Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -26, posY + -128, 0, 0, 51, 45, 51, 45);
			}
			if (ThirdEye5Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation_5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -26, posY + -128, 0, 0, 51, 45, 51, 45);
			}
			if (ThirdEye6Procedure.execute()) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/testreveleation.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), posX + -26, posY + -128, 0, 0, 51, 45, 51, 45);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
