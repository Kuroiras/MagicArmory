package com.arsatecs.magicarmory.events;

import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MyEvents {

    @SubscribeEvent
    public void pickItem(EntityItemPickupEvent event) {
        String mensaje = "Agarrando Item: " + event.getItem().getName().getString();

        System.out.println(mensaje);

        Player player = event.getEntity();

        player.displayClientMessage(Component.literal(
                mensaje
        ), false);
    }

    @SubscribeEvent
    public void atackEntity(AttackEntityEvent event) {
        String mensaje = "Atacando a: " + event.getTarget().getName().getString();

        Player player = event.getEntity();

        player.displayClientMessage(Component.literal(
                mensaje
        ), false);

        if (mensaje.contains("sheep")) {
            player.hurt(DamageSource.CACTUS, 4.0f);
        }
    }
}
