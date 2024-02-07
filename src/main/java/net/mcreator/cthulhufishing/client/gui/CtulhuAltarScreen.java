package net.mcreator.cthulhufishing.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.cthulhufishing.world.inventory.CtulhuAltarMenu;
import net.mcreator.cthulhufishing.procedures.FishShows6Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows4Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows3Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows2Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows1Procedure;
import net.mcreator.cthulhufishing.procedures.ButtonIsVisibleProcedure;
import net.mcreator.cthulhufishing.procedures.AltarFishCountTextingProcedure;
import net.mcreator.cthulhufishing.network.CtulhuAltarButtonMessage;
import net.mcreator.cthulhufishing.CthulhufishingMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CtulhuAltarScreen extends AbstractContainerScreen<CtulhuAltarMenu> {
	private final static HashMap<String, Object> guistate = CtulhuAltarMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_eye_button;

	public CtulhuAltarScreen(CtulhuAltarMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 170;
		this.imageHeight = 221;
	}

	private static final ResourceLocation texture = new ResourceLocation("cthulhufishing:textures/screens/ctulhu_altar.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/ui.png"));
		this.blit(ms, this.leftPos + -1, this.topPos + 0, 0, 0, 170, 223, 170, 223);

		if (FishShows1Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur1.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 78, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows2Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur2.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 78, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows3Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur3.png"));
			this.blit(ms, this.leftPos + 76, this.topPos + 78, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows4Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur4.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 78, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows4Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur5.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 78, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows6Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur6.png"));
			this.blit(ms, this.leftPos + 75, this.topPos + 78, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack,

				AltarFishCountTextingProcedure.execute(entity), 79, 119, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		imagebutton_eye_button = new ImageButton(this.leftPos + 70, this.topPos + 23, 26, 28, 0, 0, 28, new ResourceLocation("cthulhufishing:textures/screens/atlas/imagebutton_eye_button.png"), 26, 56, e -> {
			if (ButtonIsVisibleProcedure.execute(entity)) {
				CthulhufishingMod.PACKET_HANDLER.sendToServer(new CtulhuAltarButtonMessage(0, x, y, z));
				CtulhuAltarButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ButtonIsVisibleProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_eye_button", imagebutton_eye_button);
		this.addRenderableWidget(imagebutton_eye_button);
	}
}
