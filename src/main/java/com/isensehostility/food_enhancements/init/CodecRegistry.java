package com.isensehostility.food_enhancements.init;

import com.isensehostility.food_enhancements.FoodEnhancements;
import com.isensehostility.food_enhancements.loot_modifiers.GreenAppleModifier;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CodecRegistry {

    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> CODECS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, FoodEnhancements.MODID);

    public static void initialize() {
        CODECS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Codec<GreenAppleModifier>> GREEN_APPLE_MODIFIER = CODECS.register("green_apple_drop", GreenAppleModifier.CODEC);

}
