package net.mcreator.cthulhufishing.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cthulhufishing", "model_custom_model"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart bb_main;

	public ModelCustomModel(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 21).addBox(1.0F, -12.0F, -2.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 21).addBox(-4.0F, -12.0F, -2.25F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.0F, -12.0F, 1.25F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 31).addBox(-1.0F, -10.7F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 26)
						.addBox(2.0F, -9.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 31).addBox(-4.0F, -10.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 31)
						.addBox(2.6F, -11.6F, -2.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).addBox(0.0F, -1.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
						.addBox(-4.0F, -1.0F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).addBox(0.0F, -1.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
						.addBox(-4.0F, -1.0F, 1.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21).addBox(-4.0F, -2.0F, 1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(-4.0F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21).addBox(2.0F, -2.0F, 1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(3.0F, -3.0F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21).addBox(1.0F, -2.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21)
						.addBox(-4.0F, -2.0F, -2.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21).addBox(2.0F, -3.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21)
						.addBox(-4.0F, -3.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).addBox(0.0F, -5.7F, -2.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 26)
						.addBox(1.6F, -6.3F, -2.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 26).addBox(-2.5F, -7.9F, -2.35F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
						.addBox(0.0F, -5.7F, 1.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 26).addBox(2.6F, -5.5F, -2.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(3.0F, -8.0F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 21).addBox(-2.55F, -5.1F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21)
						.addBox(-1.0F, -11.6F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(-3.5F, -11.4F, -2.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 26)
						.addBox(-3.7F, -5.2F, -2.35F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 21).addBox(-3.8F, -7.85F, 1.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21)
						.addBox(0.0F, -10.0F, 1.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21).addBox(-3.0F, -10.0F, 1.35F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(39, 26).addBox(1.0F, -3.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 26).addBox(0.1F, -5.6F, 3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 26)
						.addBox(-1.6F, -7.7F, 3.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-2.0F, -10.0F, 3.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(-2.0F, -8.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26).addBox(0.0F, -10.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 21)
						.addBox(-2.0F, -10.0F, -4.25F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).addBox(-2.0F, -5.7F, -4.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(-2.0F, -3.0F, 3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26).addBox(-2.0F, -2.0F, 3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(-2.0F, -3.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26).addBox(-2.0F, -2.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(1.0F, -3.0F, 3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21).addBox(0.0F, -2.0F, 3.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(1.0F, -3.0F, -4.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21).addBox(0.0F, -2.0F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
						.addBox(-2.0F, -1.0F, 3.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).addBox(-2.0F, -1.0F, -4.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 17)
						.addBox(-2.0F, -12.0F, 3.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 17).addBox(-2.0F, -12.0F, -4.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
