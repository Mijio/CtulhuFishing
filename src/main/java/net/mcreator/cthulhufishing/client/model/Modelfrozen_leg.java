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
public class Modelfrozen_leg<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cthulhufishing", "modelfrozen_leg"), "main");
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;
	public final ModelPart bb_main;

	public Modelfrozen_leg(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.32F, 0.08F, -2.68F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-3.235F, 0.165F, -2.765F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.546F, 7.92F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.68F, 0.08F, -2.68F, 5.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 32).mirror()
				.addBox(-2.765F, 0.165F, -2.765F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.25F)).mirror(false), PartPose.offset(2.546F, 7.92F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 21).addBox(1.36F, -16.06F, -3.015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 21).addBox(-5.34F, -16.4F, -3.015F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-5.64F, -16.4F, 1.675F, 11.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 31).addBox(-1.0F, -13.998F, -3.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 26)
						.addBox(2.36F, -11.72F, -3.015F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 31).addBox(-5.02F, -13.06F, -3.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 31)
						.addBox(3.824F, -15.204F, -3.283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).addBox(0.36F, -1.0F, -3.015F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).mirror()
						.addBox(-5.36F, -1.0F, -3.015F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(41, 17).addBox(0.36F, -1.0F, 1.675F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).mirror()
						.addBox(-5.36F, -1.0F, 1.675F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 21).addBox(-5.68F, -2.34F, 1.675F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(-5.02F, -3.68F, 1.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21).mirror().addBox(2.68F, -2.34F, 1.675F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 26).mirror()
						.addBox(4.02F, -3.68F, 1.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(18, 21).addBox(1.36F, -2.34F, -3.015F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21).mirror()
						.addBox(-5.36F, -2.34F, -3.015F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 21).addBox(2.36F, -3.68F, -3.015F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21).mirror()
						.addBox(-5.36F, -3.68F, -3.015F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(41, 17).addBox(0.36F, -7.298F, -3.015F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 26)
						.addBox(2.484F, -8.762F, -3.149F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 26).addBox(-3.01F, -10.566F, -3.149F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
						.addBox(0.36F, -7.298F, 1.809F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 26).addBox(3.824F, -7.69F, -3.149F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(4.36F, -10.38F, -3.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 21).addBox(-3.077F, -6.814F, 1.675F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21)
						.addBox(-1.66F, -15.204F, -3.015F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(-4.35F, -14.936F, -3.417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 26)
						.addBox(-4.618F, -7.288F, -3.149F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 21).addBox(-4.752F, -10.499F, 1.675F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21)
						.addBox(0.02F, -13.06F, 1.809F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 21).mirror().addBox(-4.02F, -13.06F, 1.809F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 21).mirror()
						.addBox(-5.36F, -16.06F, -3.015F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(9, 21).mirror().addBox(1.34F, -16.4F, -3.015F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 17)
						.mirror().addBox(-5.36F, -16.4F, 1.675F, 11.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(15, 31).mirror().addBox(0.0F, -13.998F, -3.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(12, 26).mirror().addBox(-5.36F, -11.72F, -3.015F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(10, 31).mirror().addBox(4.02F, -13.06F, -3.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(5, 31).mirror().addBox(-4.824F, -15.204F, -3.283F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(41, 17).mirror()
						.addBox(-5.36F, -7.298F, -3.015F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 26).mirror().addBox(-3.484F, -8.762F, -3.149F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(7, 26)
						.mirror().addBox(2.01F, -10.566F, -3.149F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(41, 17).mirror().addBox(-5.36F, -7.298F, 1.809F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(29, 26).mirror().addBox(-4.824F, -7.69F, -3.149F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 26).mirror().addBox(-5.36F, -10.38F, -3.015F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(34, 21).mirror().addBox(2.077F, -6.814F, 1.675F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 21).mirror()
						.addBox(-1.34F, -15.204F, -3.015F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 31).mirror().addBox(3.35F, -14.936F, -3.417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 26)
						.mirror().addBox(3.618F, -7.288F, -3.149F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(34, 21).mirror().addBox(3.752F, -10.499F, 1.675F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(19, 26).mirror().addBox(-1.474F, -7.824F, 4.355F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 26).mirror()
				.addBox(0.804F, -10.638F, 4.355F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 26).mirror().addBox(0.0F, -13.06F, 4.355F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 26).mirror()
				.addBox(1.34F, -10.38F, -5.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 26).mirror().addBox(-1.34F, -13.06F, -5.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(27, 21).mirror()
				.addBox(0.0F, -13.72F, -5.695F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(41, 17).mirror().addBox(-2.68F, -7.298F, -5.695F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 26).mirror()
				.addBox(1.34F, -2.34F, 4.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 26).mirror().addBox(1.34F, -2.34F, -5.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 21).mirror()
				.addBox(-2.68F, -2.34F, 4.355F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 21).mirror().addBox(-2.68F, -2.34F, -5.695F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(41, 17).mirror()
				.addBox(-2.68F, -1.0F, 4.355F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(41, 17).mirror().addBox(-2.68F, -1.0F, -5.695F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(19, 17).mirror()
				.addBox(-2.68F, -16.4F, 4.355F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 17).mirror().addBox(-2.68F, -16.4F, -5.695F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 26).mirror()
				.addBox(-2.68F, -3.68F, 4.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(39, 26).mirror().addBox(-2.68F, -3.68F, -5.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(39, 26).addBox(1.68F, -3.68F, -5.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 26).addBox(0.474F, -7.824F, 4.355F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 26)
						.addBox(-1.804F, -10.638F, 4.355F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26).addBox(-3.0F, -13.06F, 4.355F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(-2.34F, -10.38F, -5.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26).addBox(0.34F, -13.06F, -5.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 21)
						.addBox(-3.0F, -13.72F, -5.695F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).addBox(-2.32F, -7.298F, -5.695F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(-2.34F, -2.34F, 4.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26).addBox(-2.34F, -2.34F, -5.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(1.68F, -3.68F, 4.355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21).addBox(-0.32F, -2.34F, 4.355F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 26)
						.addBox(1.68F, -3.68F, -5.695F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 21).addBox(-0.32F, -2.34F, -5.695F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17)
						.addBox(-2.32F, -1.0F, 4.355F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 17).addBox(-2.32F, -1.0F, -5.695F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 17)
						.addBox(-2.32F, -16.4F, 4.355F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 17).addBox(-2.32F, -16.4F, -5.695F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
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
