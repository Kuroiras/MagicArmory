package com.arsatecs.magicarmory.init;

import com.arsatecs.magicarmory.MagicArmory;
import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ConfigureFeatureInit {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURE =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, MagicArmory.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> EXAMPLE_OVERWORLD_REPLACE =
            Suppliers.memoize(() -> List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.RAINBOW_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.RAINBOW_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.NATURAL_STONE, BlockInit.RAINBOW_BLOCK.get().defaultBlockState())
            ));//Asignar bloques a los que remplazara

    public static final RegistryObject<ConfiguredFeature<?, ?>> RANIBOW_ORE = CONFIGURED_FEATURE.register(
        "rainbow_ore",
            () -> new ConfiguredFeature<>(
                    Feature.ORE,
                    new OreConfiguration(EXAMPLE_OVERWORLD_REPLACE.get(), 12//Cantidad de minerales juntos)
            )
    ));//Crear configuracion de comportamiento

}


