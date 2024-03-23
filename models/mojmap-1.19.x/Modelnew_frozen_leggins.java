// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnew_frozen_leggins<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "new_frozen_leggins"), "main");
	private final ModelPart Body;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public Modelnew_frozen_leggins(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(25, 0)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 61)
						.addBox(-1.0F, 11.2F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-1.0F, 12.4F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 56)
						.addBox(-4.0F, 11.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 38)
						.addBox(-4.0F, 11.0F, 1.25F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 56)
						.addBox(1.0F, 11.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 34)
						.addBox(-4.0F, 12.0F, 1.25F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(22, 51)
						.addBox(-2.0F, -13.0F, 3.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 51)
						.addBox(-2.0F, -13.0F, -4.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.1F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 17)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(0, 56)
						.addBox(-2.1F, 0.0F, -2.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(0.9F, 1.3F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 61)
						.addBox(-2.1F, 2.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(-2.1F, 9.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-2.1F, 9.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 61)
						.addBox(0.8F, 9.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 56)
						.addBox(-0.6F, 4.1F, -2.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 56)
						.addBox(-0.65F, 6.9F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 61)
						.addBox(-1.6F, 0.6F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 61)
						.addBox(-1.8F, 6.8F, -2.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 56)
						.addBox(-1.9F, 4.15F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 56)
						.addBox(-1.1F, 2.0F, 1.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(14, 61)
						.addBox(0.1F, -5.6F, 3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 61)
						.addBox(-1.6F, -7.7F, 3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 61)
						.addBox(-2.0F, -10.0F, 3.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(-2.0F, -3.0F, 3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(1.0F, -3.0F, 3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-2.0F, -12.0F, 3.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(17, 17)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(55, 51)
						.addBox(-0.9F, 0.0F, -2.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 56)
						.addBox(0.1F, 3.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 61)
						.addBox(0.7F, 0.4F, -2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(1.1F, 9.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(-2.0F, 9.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(0.1F, 9.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 51)
						.addBox(-1.9F, 6.3F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 61)
						.addBox(-0.3F, 5.7F, -2.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 51)
						.addBox(-1.9F, 6.3F, 1.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 61)
						.addBox(0.7F, 6.5F, -2.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 61)
						.addBox(-2.0F, 8.0F, -2.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(1.1F, 4.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 56)
						.addBox(-1.9F, 2.0F, 1.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition cube_r3 = LeftLeg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(34, 61)
						.addBox(1.0F, -3.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(-2.0F, -8.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(0.0F, -10.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 56)
						.addBox(-2.0F, -10.0F, -4.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 51)
						.addBox(-2.0F, -5.7F, -4.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(-2.0F, -3.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 61)
						.addBox(1.0F, -3.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 51)
						.addBox(-2.0F, -12.0F, -4.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.9F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}