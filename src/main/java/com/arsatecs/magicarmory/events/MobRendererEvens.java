package com.arsatecs.magicarmory.events;

import com.arsatecs.magicarmory.MagicArmory;
import com.arsatecs.magicarmory.client.models.PetModel;
import com.arsatecs.magicarmory.client.renderer.PetRenderer;
import com.arsatecs.magicarmory.init.MobsInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = MagicArmory.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MobRendererEvens {

    @SubscribeEvent
    public static void entityRenders(EntityRenderersEvent.RegisterRenderers event){
        event.registerEntityRenderer(MobsInit.PET.get(), PetRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(PetModel.LAYER_LOCATION, PetModel::createBodyLayer);
    }
}
