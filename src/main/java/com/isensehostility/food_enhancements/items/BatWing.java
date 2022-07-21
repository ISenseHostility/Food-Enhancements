package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class BatWing extends Item {

    public BatWing() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(2)
                        .effect(()->new MobEffectInstance(MobEffects.CONFUSION,200,0),0.7F)
                        .effect(()->new MobEffectInstance(MobEffects.POISON,200,0),0.4F)
                        .saturationMod(0.25F)
                        .build())

        );
    }
}