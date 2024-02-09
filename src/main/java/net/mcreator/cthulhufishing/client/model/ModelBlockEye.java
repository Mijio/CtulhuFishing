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
public class ModelBlockEye<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("cthulhufishing", "model_block_eye"), "main");
	public final ModelPart block;
	public final ModelPart eyelid;
	public final ModelPart eye;

	public ModelBlockEye(ModelPart root) {
		this.block = root.getChild("block");
		this.eyelid = root.getChild("eyelid");
		this.eye = root.getChild("eye");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition block = partdefinition.addOrReplaceChild("block", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition eyelid = partdefinition.addOrReplaceChild("eyelid",
				CubeListBuilder.create().texOffs(29, 29).addBox(2.0F, -1.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 29).addBox(-1.0F, -1.0F, -5.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 29)
						.addBox(2.0F, -1.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 7).addBox(3.6F, -0.5F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 1)
						.addBox(-3.5F, -0.5F, -6.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 29).addBox(-3.0F, -1.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 29)
						.addBox(-0.5F, -2.8F, -6.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(-0.5F, 1.7F, -6.3F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, 17.5F, -1.4F));
		PartDefinition cube_r1 = eyelid.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 29).addBox(-6.3F, -6.3F, -6.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r2 = eyelid.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 25).addBox(3.3F, -5.9F, -6.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r3 = eyelid.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(13, 25).addBox(-0.6F, -10.6F, -6.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r4 = eyelid.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(26, 25).addBox(-2.5F, -10.9F, -6.1F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition eye = partdefinition.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -10.0F, -5.5F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 26.5F, -1.4F));
		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		block.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eyelid.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eye.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
