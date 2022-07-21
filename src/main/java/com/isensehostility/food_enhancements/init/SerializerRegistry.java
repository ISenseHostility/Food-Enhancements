package com.isensehostility.food_enhancements.init;

import com.isensehostility.food_enhancements.FoodEnhancements;
import com.isensehostility.food_enhancements.loot_modifiers.GreenAppleModifier;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SerializerRegistry {

    public static final DeferredRegister<GlobalLootModifierSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.LOOT_MODIFIER_SERIALIZERS, FoodEnhancements.MOD_ID);

    public static void init() {
        SERIALIZERS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<GlobalLootModifierSerializer<GreenAppleModifier>> GREEN_APPLE_MODIFIER = SERIALIZERS.register("green_apple_drop", GreenAppleModifier.Serializer::new);

}
