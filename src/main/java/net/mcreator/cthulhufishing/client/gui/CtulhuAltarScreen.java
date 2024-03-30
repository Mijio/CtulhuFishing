package net.mcreator.cthulhufishing.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.cthulhufishing.world.inventory.CtulhuAltarMenu;
import net.mcreator.cthulhufishing.procedures.FishShows9Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows8Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows7Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows6Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows5Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows4Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows3Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows2Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows1Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows12Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows11Procedure;
import net.mcreator.cthulhufishing.procedures.FishShows10Procedure;
import net.mcreator.cthulhufishing.procedures.ButtonIsVisibleProcedure;
import net.mcreator.cthulhufishing.procedures.AltarFishCountTextingProcedure;
import net.mcreator.cthulhufishing.network.CtulhuAltarButtonMessage;
import net.mcreator.cthulhufishing.CthulhufishingMod;

import java.util.HashMap;

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
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/ui.png"), this.leftPos + -1, this.topPos + 0, 0, 0, 170, 223, 170, 223);

		if (FishShows1Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/fishblur1.png"), this.leftPos + 75, this.topPos + 79, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows2Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/fishblur2.png"), this.leftPos + 75, this.topPos + 80, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows3Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/fishblur3.png"), this.leftPos + 76, this.topPos + 80, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows4Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/fishblur4.png"), this.leftPos + 75, this.topPos + 80, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows5Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/fishblur5.png"), this.leftPos + 75, this.topPos + 80, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows6Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/fishblur6.png"), this.leftPos + 75, this.topPos + 80, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows7Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/blur_fish7.png"), this.leftPos + 75, this.topPos + 80, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows8Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/blur_fish8.png"), this.leftPos + 75, this.topPos + 80, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows9Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/blur_fish9.png"), this.leftPos + 75, this.topPos + 80, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows10Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/ice_boulti_blur.png"), this.leftPos + 75, this.topPos + 79, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows11Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/ice_cod_blur.png"), this.leftPos + 75, this.topPos + 79, 0, 0, 16, 16, 16, 16);
		}
		if (FishShows12Procedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("cthulhufishing:textures/screens/ice_stingray_blur.png"), this.leftPos + 75, this.topPos + 80, 0, 0, 16, 16, 16, 16);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				AltarFishCountTextingProcedure.execute(entity), 82, 121, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_eye_button = new ImageButton(this.leftPos + 71, this.topPos + 24, 26, 28, 0, 0, 28, new ResourceLocation("cthulhufishing:textures/screens/atlas/imagebutton_eye_button.png"), 26, 56, e -> {
			if (ButtonIsVisibleProcedure.execute(entity)) {
				CthulhufishingMod.PACKET_HANDLER.sendToServer(new CtulhuAltarButtonMessage(0, x, y, z));
				CtulhuAltarButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (ButtonIsVisibleProcedure.execute(entity))
					super.render(guiGraphics, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_eye_button", imagebutton_eye_button);
		this.addRenderableWidget(imagebutton_eye_button);
	}
}
