package com.nullharp.createdeliverydrones.entities.DeliveryDrone;
// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class DeliveryDroneModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("createdeliverydrones", "delivery_drone"), "main");
	private final ModelPart body;

	public DeliveryDroneModel(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(88, 39).addBox(0.0F, -7.0F, -25.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 88).addBox(-20.0F, -4.0F, -22.0F, 20.0F, 5.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(88, 52).addBox(-22.0F, -3.0F, -24.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 0).addBox(-23.0F, -7.0F, -25.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(88, 59).addBox(-2.0F, -3.0F, -24.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 66).addBox(-22.0F, -3.0F, -4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 73).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(88, 13).addBox(-23.0F, -7.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(88, 26).addBox(0.0F, -7.0F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.5F, -6.0F, -11.5F, 22.0F, 0.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-9.5F, -6.0F, -34.5F, 22.0F, 0.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(0, 66).addBox(-32.5F, -6.0F, -11.5F, 22.0F, 0.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(0, 44).addBox(-32.5F, -6.0F, -34.5F, 22.0F, 0.0F, 22.0F, new CubeDeformation(0.0F)), PartPose.offset(10.0F, 23.0F, 12.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}