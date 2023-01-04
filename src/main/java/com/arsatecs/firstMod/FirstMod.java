package com.arsatecs.firstMod;
import com.arsatecs.firstMod.init.BlockInit;
import com.arsatecs.firstMod.init.InitItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FirstMod.MODID)
public class FirstMod {
    public static final String MODID = "firstmod";

    public FirstMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }
}
