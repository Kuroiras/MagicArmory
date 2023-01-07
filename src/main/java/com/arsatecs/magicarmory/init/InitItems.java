package com.arsatecs.magicarmory.init;

import com.arsatecs.magicarmory.MagicArmory;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, MagicArmory.MODID
    );

    public static final RegistryObject<Item> POKEBALL = ITEMS.register(
            "pokeball",
            () -> new Item(new Item.Properties()
                    .fireResistant()
                    .tab(CreativeModeTab.TAB_MISC)
            )
    );

    public static final RegistryObject<SwordItem> FIREAXE = ITEMS.register(
            "fire_axe",
            () -> new SwordItem(
                    Tiers.NETHERITE,
                    5000,//Damage
                    3.5f,//Attack kSpeed
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()
            )
    );

    public static final RegistryObject<Item> EMERAL_INGOT = ITEMS.register(
            "emerald_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS))
    );


    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register(
            "emerald_axe",
            () -> new AxeItem(
                    com.arsatecs.magicarmory.world.item.Tiers.EMERALD,
                    5.0F,
                    -3.0F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
            )
    );

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register(
            "emerald_sword",
            () -> new SwordItem(
                    com.arsatecs.magicarmory.world.item.Tiers.EMERALD,
                    3,
                    -2.4F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
            )
    );

}
