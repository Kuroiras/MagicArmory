package com.arsatecs.magicarmory.client.models;

import com.arsatecs.magicarmory.MagicArmory;
import com.arsatecs.magicarmory.entities.PetEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class PetModelWithoutAnimations extends EntityModel<PetEntity> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(MagicArmory.MODID, "pet"), "main");
    private final ModelPart base;

    public PetModelWithoutAnimations(ModelPart root) {
        this.base = root.getChild("base");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition base = partdefinition.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offset(0.0F, 30.0F, 0.0F));

        PartDefinition body = base.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -20.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(24, 27).addBox(-4.0F, -18.0F, -6.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 7).addBox(1.0F, -18.0F, -6.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition leg = base.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(16, 27).addBox(-4.0F, -10.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition downLeg = leg.addOrReplaceChild("downLeg", CubeListBuilder.create().texOffs(8, 27).addBox(-4.0F, -5.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition leg2 = base.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 27).addBox(-4.0F, -10.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 0.0F));

        PartDefinition downLeg2 = leg2.addOrReplaceChild("downLeg2", CubeListBuilder.create().texOffs(24, 20).addBox(-4.0F, -5.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition leg3 = base.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(16, 20).addBox(-4.0F, -10.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, -5.0F));

        PartDefinition downLeg3 = leg3.addOrReplaceChild("downLeg3", CubeListBuilder.create().texOffs(8, 20).addBox(-4.0F, -5.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition leg4 = base.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, -10.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.0F));

        PartDefinition downLeg4 = leg4.addOrReplaceChild("downLeg4", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(PetEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
