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

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFossilFishArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cthulhufishing", "model_fossil_fish_armor"), "main");
	public final ModelPart bone;
	public final ModelPart bipedBody;
	public final ModelPart bipedLeftArm;
	public final ModelPart bipedRightArm;

	public ModelFossilFishArmor(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bipedBody = root.getChild("bipedBody");
		this.bipedLeftArm = root.getChild("bipedLeftArm");
		this.bipedRightArm = root.getChild("bipedRightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bipedBody = partdefinition.addOrReplaceChild("bipedBody", CubeListBuilder.create().texOffs(19, 51).addBox(-4.0F, 2.0F, -3.5F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
				.addBox(-5.0F, -1.0F, -5.5F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 51).addBox(-4.0F, 0.1F, 2.5F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r1 = bipedBody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 76).addBox(-3.0F, -24.0F, -4.65F, 6.25F, 13.0F, 1.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = bipedBody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(47, 76).addBox(-3.25F, -24.0F, -4.65F, 6.25F, 13.0F, 1.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r3 = bipedBody.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(31, 75).addBox(-1.0F, -25.5F, -11.15F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 80)
				.addBox(2.4F, -25.5F, -11.15F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 75).addBox(-4.4F, -25.5F, -11.15F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bipedBody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(17, 34).addBox(2.4F, -20.0F, 2.2F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.4718F, -0.0493F, -0.2492F));
		PartDefinition armorBody = bipedBody.addOrReplaceChild("armorBody", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("bipedLeftArm",
				CubeListBuilder.create().texOffs(47, 63).addBox(-5.0F, -1.0F, -2.5F, 5.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 75).addBox(-5.0F, -1.0F, 1.5F, 5.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 75)
						.addBox(-5.0F, -1.0F, -1.5F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 63).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.5F, 2.0F, 0.0F));
		PartDefinition cube_r5 = bipedLeftArm.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 61).addBox(-2.25F, -23.15F, -5.75F, 4.25F, 11.25F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 22.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r6 = bipedLeftArm.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(39, 35).addBox(-9.0F, -22.4F, -11.3F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 22.0F, 0.0F, -0.3197F, 0.4423F, -0.0631F));
		PartDefinition armorLeftArm = bipedLeftArm.addOrReplaceChild("armorLeftArm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("bipedRightArm",
				CubeListBuilder.create().texOffs(57, 51).addBox(0.0F, -3.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 63).addBox(0.0F, -1.0F, -2.5F, 5.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 63)
						.addBox(0.0F, -1.0F, 1.5F, 5.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 75).addBox(4.0F, -1.0F, -1.5F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.5F, 2.0F, 0.0F));
		PartDefinition cube_r7 = bipedRightArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 51).addBox(0.8F, -9.2F, 17.6F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 22.0F, 0.0F, 1.212F, 0.1975F, 0.3091F));
		PartDefinition cube_r8 = bipedRightArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(62, 62).addBox(-2.0F, -24.15F, -5.75F, 4.25F, 12.25F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 22.1F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition armorRightArm = bipedRightArm.addOrReplaceChild("armorRightArm", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
