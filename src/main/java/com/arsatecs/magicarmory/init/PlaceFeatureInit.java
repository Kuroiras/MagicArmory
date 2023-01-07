package com.arsatecs.magicarmory.init;

import com.arsatecs.magicarmory.MagicArmory;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class PlaceFeatureInit {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, MagicArmory.MODID);

    public static final RegistryObject<PlacedFeature> RAINBOW_ORE = PLACED_FEATURE.register(
            "rainbow_ore",
            () -> new PlacedFeature(ConfigureFeatureInit.RANIBOW_ORE.getHolder().get(),
                    commonOrePlacement(100, HeightRangePlacement.triangle(
                           VerticalAnchor.bottom(),
                           VerticalAnchor.absolute(80)
                    )))
    );

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height){
        return List.of(CountPlacement.of(countPerChunk), InSquarePlacement.spread(), height, BiomeFilter.biome());
    }
}
