package com.arsatecs.magicarmory.init;

import com.arsatecs.magicarmory.MagicArmory;
import com.arsatecs.magicarmory.entities.PetEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MobsInit {

    public static final DeferredRegister<EntityType<?>> MOBS =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MagicArmory.MODID);

    public static final RegistryObject<EntityType<PetEntity>> PET =
            MOBS.register("pet",
                    () -> EntityType.Builder.of(PetEntity::new, MobCategory.CREATURE)
                    .build(MagicArmory.MODID + ":pet"));
}
