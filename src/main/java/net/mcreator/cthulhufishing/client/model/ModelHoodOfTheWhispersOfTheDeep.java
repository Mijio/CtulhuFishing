package net.mcreator.cthulhufishing.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelHoodOfTheWhispersOfTheDeep<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cthulhufishing", "model_hood_of_the_whispers_of_the_deep"), "main");
	public final ModelPart bone;

	public ModelHoodOfTheWhispersOfTheDeep(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, -10.1F, -4.7F, 4.0F, 2.0F, 9.6F, new CubeDeformation(0.0F)).texOffs(25, 14).addBox(4.0F, -6.0F, -5.3F, 2.0F, 5.3F, 10.1F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-6.0F, -6.0F, -5.4F, 2.0F, 5.3F, 10.1F, new CubeDeformation(0.0F)).texOffs(50, 43).addBox(-5.0F, -6.0F, 4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 43)
						.addBox(3.0F, -6.0F, 4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 50).addBox(-1.0F, -9.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 55)
						.addBox(-0.5F, -7.0F, -5.6F, 1.0F, 1.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(36, 55).addBox(-0.7F, -10.2F, -5.6F, 1.5F, 1.0F, 1.6F, new CubeDeformation(0.0F)).texOffs(20, 60)
						.addBox(-2.0F, -9.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 60).addBox(1.0F, -9.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 50).addBox(2.7F, -6.6F, -6.1F, 3.0F, 1.0F, 2.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(11, 50).addBox(-5.7F, -6.6F, -6.1F, 3.0F, 1.0F, 2.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(22, 50).addBox(-2.7F, -9.6F, -6.1F, 3.0F, 1.0F, 2.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(33, 50).addBox(-0.2F, -9.6F, -6.1F, 3.0F, 1.0F, 2.1F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 55).addBox(-2.2F, 0.0F, -5.4F, 3.5F, 2.0F, 0.9F, new CubeDeformation(0.0F)).texOffs(15, 43).addBox(-3.0F, -3.0F, -6.1F, 4.5F, 2.0F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 55).addBox(1.7F, -4.0F, -4.5F, 1.0F, 2.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2956F, -0.0779F, 0.2502F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(25, 60).addBox(-0.2F, -2.9F, -5.4F, 0.5F, 2.4F, 0.4F, new CubeDeformation(0.0F)).texOffs(22, 55).addBox(-1.0F, -0.9F, -6.0F, 2.0F, 2.4F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(10, 60).addBox(0.5F, -3.3F, -4.9F, 1.0F, 2.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 60).addBox(-1.4F, -3.3F, -4.9F, 1.0F, 2.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 60).addBox(-2.6F, -4.0F, -4.5F, 1.0F, 2.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2956F, 0.0779F, -0.2502F));
		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(11, 55).addBox(-1.1F, 0.0F, -5.4F, 3.5F, 2.0F, 0.9F, new CubeDeformation(0.0F)).texOffs(28, 43).addBox(-1.3F, -3.0F, -6.1F, 4.5F, 2.0F, 1.1F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(29, 55).addBox(-1.0F, -3.3F, -6.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(29, 30).addBox(-3.9F, -7.4F, 4.4F, 7.8F, 5.2F, 1.6F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 43).addBox(-3.0F, -8.0F, 6.8F, 6.0F, 4.0F, 1.4F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -8.0F, -5.4F, 6.0F, 2.0F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.1F, -0.1F, 0.0F, 0.0F, -0.829F));
		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(35, 0).addBox(-5.0F, -8.0F, -5.4F, 6.0F, 2.0F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.1F, -0.1F, 0.0F, 0.0F, 0.829F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
