package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class HoneyRoastedChickenSkewer extends Item {

    public HoneyRoastedChickenSkewer() {
        super(new Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(15)
                        .saturationMod(0.9F)
                        .meat()
                        .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 1.0F)
                        .build())

        );
    }
}