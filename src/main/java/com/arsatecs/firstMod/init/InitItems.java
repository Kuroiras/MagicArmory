package com.arsatecs.firstMod.init;

import com.arsatecs.firstMod.FirstMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, FirstMod.MODID
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
                    5,//Damage
                    3.5f,//Attack kSpeed
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()
            ).
    );

}
