package com.isensehostility.food_enhancements.event;

import com.isensehostility.food_enhancements.FoodEnhancements;
import com.isensehostility.food_enhancements.init.ItemRegistry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = FoodEnhancements.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientModEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemProperties.register(ItemRegistry.CARAMEL_APPLE.get(),
                    new ResourceLocation(FoodEnhancements.MODID, "apple_type"), (stack, level, entity, number) -> {
                        return stack.getOrCreateTag().getInt("apple_type");
                    });
            ItemProperties.register(ItemRegistry.JELLY.get(),
                    new ResourceLocation(FoodEnhancements.MODID, "jelly_type"), (stack, level, entity, number) -> {
                        return stack.getOrCreateTag().getInt("jelly_type");
                    });
        });
    }
}
