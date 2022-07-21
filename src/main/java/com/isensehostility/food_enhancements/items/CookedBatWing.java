package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CookedBatWing extends Item {

    public CookedBatWing() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(5)
                        .effect(()->new MobEffectInstance(MobEffects.CONFUSION,200,0),0.3F)
                        .saturationMod(0.6F)
                        .build())
        );
    }
}