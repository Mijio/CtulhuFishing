package net.mcreator.cthulhufishing.client.gui;

public class CtulhuAltarScreen extends AbstractContainerScreen<CtulhuAltarMenu> {

	private final static HashMap<String, Object> guistate = CtulhuAltarMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_grab;

	public CtulhuAltarScreen(CtulhuAltarMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 177;
		this.imageHeight = 207;
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

		RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/coolfish.png"));
		this.blit(ms, this.leftPos + 80, this.topPos + 86, 0, 0, -1, -1, -1, -1);

		if (

		FishShows1Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur1.png"));
			this.blit(ms, this.leftPos + 80, this.topPos + 86, 0, 0, 16, 16, 16, 16);
		}
		if (

		FishShows2Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur2.png"));
			this.blit(ms, this.leftPos + 80, this.topPos + 86, 0, 0, 16, 16, 16, 16);
		}
		if (

		FishShows4Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur4.png"));
			this.blit(ms, this.leftPos + 80, this.topPos + 86, 0, 0, 16, 16, 16, 16);
		}
		if (

		FishShows5Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur5.png"));
			this.blit(ms, this.leftPos + 80, this.topPos + 86, 0, 0, 16, 16, 16, 16);
		}
		if (

		FishShows6Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur6.png"));
			this.blit(ms, this.leftPos + 80, this.topPos + 86, 0, 0, 16, 16, 16, 16);
		}
		if (

		FishShows3Procedure.execute(entity)

		) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("cthulhufishing:textures/screens/fishblur3.png"));
			this.blit(ms, this.leftPos + 80, this.topPos + 86, 0, 0, 16, 16, 16, 16);
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

				AltarFishCountTextingProcedure.execute(entity), 82, 107, -12829636);
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

		button_grab = new Button(this.leftPos + 64, this.topPos + 40, 46, 20, Component.translatable("gui.cthulhufishing.ctulhu_altar.button_grab"), e -> {
			if (

			ButtonIsVisibleProcedure.execute()

			) {
				CthulhufishingMod.PACKET_HANDLER.sendToServer(new CtulhuAltarButtonMessage(0, x, y, z));
				CtulhuAltarButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (

				ButtonIsVisibleProcedure.execute()

				)
					super.render(ms, gx, gy, ticks);
			}
		};

		guistate.put("button:button_grab", button_grab);
		this.addRenderableWidget(button_grab);

	}

}
