package com.arsatecs.magicarmory;
import com.arsatecs.magicarmory.events.MobRendererEvens;
import com.arsatecs.magicarmory.events.MobsAttrsEven;
import com.arsatecs.magicarmory.events.MyEvents;
import com.arsatecs.magicarmory.init.BlockInit;
import com.arsatecs.magicarmory.init.InitItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.arsatecs.magicarmory.init.MobsInit.MOBS;
import static com.arsatecs.magicarmory.init.MobsInit.PET;
import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

@Mod(MagicArmory.MODID)
public class MagicArmory {
    public static final String MODID = "magicarmory";

    public MagicArmory() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        EVENT_BUS.register(new MyEvents());
//        ENTITIES.register(bus);
        EVENT_BUS.register(new MobsAttrsEven());
        EVENT_BUS.register(new MobRendererEvens());
        MOBS.register(bus);
    }
}
