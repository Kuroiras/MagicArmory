package com.arsatecs.magicarmory;
import com.arsatecs.magicarmory.init.BlockInit;
import com.arsatecs.magicarmory.init.InitItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MagicArmory.MODID)
public class MagicArmory {
    public static final String MODID = "magicarmory";

    public MagicArmory() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
    }
}
