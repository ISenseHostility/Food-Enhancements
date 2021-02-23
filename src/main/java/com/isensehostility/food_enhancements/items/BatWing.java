package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BatWing extends Item {

    public BatWing() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(2)
                        .effect(()->new EffectInstance(Effects.NAUSEA,200,0),0.7F)
                        .effect(()->new EffectInstance(Effects.POISON,200,0),0.4F)
                        .saturation(0.25F)
                        .build())

        );
    }
}