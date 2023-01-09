package com.arsatecs.magicarmory.events;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.arsatecs.magicarmory.init.InitItems.FIRE_STAFF;
import static com.arsatecs.magicarmory.init.InitItems.WOODS_STAFF;

public class Spells {

//    @SubscribeEvent
//    public void fireStaff(PlayerInteractEvent.LeftClickEmpty event){
//
//    }

    @SubscribeEvent
    public void fireStaff(PlayerInteractEvent.LeftClickBlock event){
        var item = event.getItemStack();
        if (event.getSide().isServer()) {
            var server = event.getEntity().getServer();
            if (item.is(FIRE_STAFF.get()) && server != null) {
                var stack = server.createCommandSourceStack();
                var pos = event.getEntity().position();
                var command = "fill "+ (int)(pos.x - 10) +" "+ (int)(pos.y - 10) +" "+(int)(pos.z - 10) + " " + (int)(pos.x + 10) +" "+ (int)(pos.y + 10) +" "+(int)(pos.z + 5) + " minecraft:lava replace minecraft:grass_block";
                server.getCommands().performCommand(
                        stack,
                        command
                );
                event.setCanceled(true);
            }
        }
    }

//    @SubscribeEvent
//    public void woods_staff(PlayerInteractEvent.LeftClickBlock event){
//        var item = event.getItemStack();
//        if (event.getSide().isServer()) {
//            var server = event.getEntity().getServer();
//            if (item.is(WOODS_STAFF.get()) && server != null) {
//                Event.Result useItem = event.getUseItem();
//                var stack = server.createCommandSourceStack();
//                var pos = event.getEntity().position();
//                var command = "fill "+ (int)(pos.x - 10) +" "+ (int)(pos.y - 10) +" "+(int)(pos.z - 10) + " " + (int)(pos.x + 10) +" "+ (int)(pos.y + 10) +" "+(int)(pos.z + 5) + " minecraft:lava replace minecraft:grass_block";
//                server.getCommands().performCommand(
//                        stack,
//                        command
//                );
//                event.setCanceled(true);
//            }
//        }
//    }
}
