package net.mcreator.cthulhufishing.item.renderer;

import net.minecraft.client.renderer.block.model.ItemTransforms.TransformType;

@SuppressWarnings("deprecated")
public class TentacleStaffItemRenderer extends GeoItemRenderer<TentacleStaffItem> implements RendersPlayerArms {
	public TentacleStaffItemRenderer() {
		super(new TentacleStaffItemModel());
	}

	@Override
	public RenderType getRenderType(TentacleStaffItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	static {
		AnimationController.addModelFetcher(animatable -> {
			if (animatable instanceof TentacleStaffItem) {
				Item item = (Item) animatable;
				BlockEntityWithoutLevelRenderer ister = new TentacleStaffItemRenderer();
				if (ister instanceof GeoItemRenderer) {
					return (IAnimatableModel<Object>) ((GeoItemRenderer<?>) ister).getGeoModelProvider();
				}
			}
			return null;
		});
	}

	private static final float SCALE_RECIPROCAL = 1.0f / 16.0f;
	protected boolean renderArms = false;
	protected MultiBufferSource currentBuffer;
	protected RenderType renderType;
	public TransformType transformType;
	protected TentacleStaffItem animatable;
	private float aimProgress = 0.0f;
	private final Set<String> hiddenBones = new HashSet<>();
	private final Set<String> suppressedBones = new HashSet<>();
	private final Map<String, Vector3f> queuedBoneSetMovements = new HashMap<>();
	private final Map<String, Vector3f> queuedBoneSetRotations = new HashMap<>();
	private final Map<String, Vector3f> queuedBoneAddRotations = new HashMap<>();

	@Override
	public void renderByItem(ItemStack itemStack, TransformType transformType, PoseStack matrixStack, MultiBufferSource bufferIn, int combinedLightIn, int p_239207_6_) {
		this.transformType = transformType;
		super.renderByItem(itemStack, transformType, matrixStack, bufferIn, combinedLightIn, p_239207_6_);
	}

	@Override
	public void render(GeoModel model, TentacleStaffItem animatable, float partialTicks, RenderType type, PoseStack matrixStackIn, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red,
			float green, float blue, float alpha) {
		this.currentBuffer = renderTypeBuffer;
		this.renderType = type;
		this.animatable = animatable;
		super.render(model, animatable, partialTicks, type, matrixStackIn, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn, red, green, blue, alpha);
		if (this.renderArms) {
			this.renderArms = false;
		}
	}

	@Override
	public void render(TentacleStaffItem animatable, PoseStack stack, MultiBufferSource bufferIn, int packedLightIn, ItemStack itemStack) {
		Minecraft mc = Minecraft.getInstance();
		float sign = 1.0f;
		this.aimProgress = Mth.clamp(this.aimProgress + mc.getFrameTime() * sign * 0.1f, 0.0f, 1.0f);
		stack.pushPose();
		animatable.setupAnimationState(this, itemStack, stack, this.aimProgress);
		super.render(animatable, stack, bufferIn, packedLightIn, itemStack);
		stack.popPose();
		if (this.animatable != null)
			this.animatable.getTransformType(this.transformType);
	}

	@Override
	public ResourceLocation getTextureLocation(TentacleStaffItem instance) {
		return super.getTextureLocation(instance);
	}

	@Override
	public Integer getUniqueID(TentacleStaffItem animatable) {
		if (this.currentItemStack == null || this.transformType != TransformType.FIRST_PERSON_LEFT_HAND && this.transformType != TransformType.FIRST_PERSON_RIGHT_HAND) {
			return -1;
		}
		return super.getUniqueID(animatable);
	}

	public void hideBone(String name, boolean hide) {
		if (hide) {
			this.hiddenBones.add(name);
		} else {
			this.hiddenBones.remove(name);
		}
	}

	@Override
	public void setRenderArms(boolean renderArms) {
		this.renderArms = renderArms;
	}

	public TransformType getCurrentTransform() {
		return this.transformType;
	}

	public void suppressModification(String name) {
		this.suppressedBones.add(name);
	}

	public void allowModification(String name) {
		this.suppressedBones.remove(name);
	}

	public void setBonePosition(String name, float x, float y, float z) {
		this.queuedBoneSetMovements.put(name, new Vector3f(x, y, z));
	}

	public void addToBoneRotation(String name, float x, float y, float z) {
		this.queuedBoneAddRotations.put(name, new Vector3f(x, y, z));
	}

	public void setBoneRotation(String name, float x, float y, float z) {
		this.queuedBoneSetRotations.put(name, new Vector3f(x, y, z));
	}

	public ItemStack getCurrentItem() {
		return this.currentItemStack;
	}

	@Override
	public boolean shouldAllowHandRender(ItemStack mainhand, ItemStack offhand, InteractionHand renderingHand) {
		return renderingHand == InteractionHand.MAIN_HAND;
	}

}