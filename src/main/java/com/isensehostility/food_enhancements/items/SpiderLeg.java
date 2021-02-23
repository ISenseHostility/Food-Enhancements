package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SpiderLeg extends Item {

    public SpiderLeg() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(2)
                        .meat()
                        .saturation(0.5F)
                        .effect(()->new EffectInstance(Effects.POISON,200,0),1)
                        .build())

        );
    }
}