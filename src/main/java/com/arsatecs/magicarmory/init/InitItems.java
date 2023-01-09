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

    public static final RegistryObject<Item> EMERALD_INGOT = ITEMS.register(
            "emerald_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).fireResistant())
    );


    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register(
            "emerald_axe",
            () -> new AxeItem(
                    com.arsatecs.magicarmory.world.item.Tiers.EMERALD,
                    5.0F,
                    -3.0F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()
            )
    );

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register(
            "emerald_sword",
            () -> new SwordItem(
                    com.arsatecs.magicarmory.world.item.Tiers.EMERALD,
                    3,
                    -2.4F,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()
            )
    );

    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register(
            "emerald_pickaxe",
            () -> new PickaxeItem(
                    com.arsatecs.magicarmory.world.item.Tiers.EMERALD,
                    1,
                    -2.8F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()
            )
    );

    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register(
            "emerald_hoe",
            () -> new HoeItem(
                    com.arsatecs.magicarmory.world.item.Tiers.EMERALD,
                    -3,
                    0.0F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()
            )
    );

    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register(
            "emerald_shovel",
            () -> new ShovelItem(
                    com.arsatecs.magicarmory.world.item.Tiers.EMERALD,
                    1.5F,
                    -3.0F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant()
            )
    );

    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register(
            "emerald_boots",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).fireResistant())
    );

    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register(
            "emerald_chestplate",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).fireResistant())
    );

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register(
            "emerald_helmet",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).fireResistant())
    );

    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register(
            "emerald_horse_armor",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).fireResistant())
    );

    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register(
            "emerald_leggings",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).fireResistant())
    );

    public static final RegistryObject<Item> FIRE_STAFF = ITEMS.register(
            "fire_staff",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant())
    );

    public static final RegistryObject<Item> WOODS_STAFF = ITEMS.register(
            "woods_staff",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant())
    );


}
