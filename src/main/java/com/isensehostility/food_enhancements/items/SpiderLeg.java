package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SpiderLeg extends Item {

    public SpiderLeg() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(2)
                        .meat()
                        .saturationMod(0.5F)
                        .effect(()->new MobEffectInstance(MobEffects.POISON,200,0),1)
                        .build())

        );
    }
}