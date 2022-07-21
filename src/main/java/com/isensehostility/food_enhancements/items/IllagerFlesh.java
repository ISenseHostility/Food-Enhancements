package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class IllagerFlesh extends Item {

    public IllagerFlesh() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(4)
                        .saturationMod(0.37F)
                        .effect(()-> new MobEffectInstance(MobEffects.HUNGER,300,0),0.7F)
                        .build())

        );
    }
}