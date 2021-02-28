package com.isensehostility.food_enhancements.init;

import com.isensehostility.food_enhancements.FoodEnhancements;
import com.isensehostility.food_enhancements.loot_modifiers.GreenAppleModifier;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = FoodEnhancements.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SerializerRegistry {

    @SubscribeEvent
    public static void registerModifierSerializers(final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        IForgeRegistry<GlobalLootModifierSerializer<?>> registry = event.getRegistry();
        register(registry, new GreenAppleModifier.Serializer(), "green_apple_drop");
    }

    private static void register(IForgeRegistry<GlobalLootModifierSerializer<?>> registry, GlobalLootModifierSerializer<?> serializer, String name) {
        registry.register(serializer.setRegistryName(FoodEnhancements.locate(name)));
    }
}
