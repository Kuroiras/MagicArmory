package com.arsatecs.magicarmory.events;

import com.arsatecs.magicarmory.MagicArmory;
import com.arsatecs.magicarmory.entities.PetEntity;
import com.arsatecs.magicarmory.init.MobsInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MagicArmory.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MobsAttrsEven {

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event){
        event.put(MobsInit.PET.get(), PetEntity.getPetEntityAttrs().build());
    }
}
