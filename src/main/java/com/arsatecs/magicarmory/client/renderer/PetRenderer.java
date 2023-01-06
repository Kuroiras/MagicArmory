package com.arsatecs.magicarmory.client.renderer;

import com.arsatecs.magicarmory.MagicArmory;
import com.arsatecs.magicarmory.client.models.PetModel;
import com.arsatecs.magicarmory.entities.PetEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PetRenderer extends MobRenderer<PetEntity, PetModel> {

    private  static final ResourceLocation TEXTURE = new ResourceLocation(MagicArmory.MODID, "textures/entities/pet.png");

    public PetRenderer(EntityRendererProvider.Context context){
        super(context, new PetModel(context.bakeLayer(PetModel.LAYER_LOCATION)), 0.30f);
    }

    @Override
    public ResourceLocation getTextureLocation(PetEntity p_114482_) {
        return TEXTURE;
    }
}
