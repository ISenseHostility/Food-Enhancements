package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class GlowBerryPie extends Item {

    public GlowBerryPie() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(7)
                        .saturationMod(1.06F)
                        .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600, 0), 1)
                        .build())
        );
    }
}
