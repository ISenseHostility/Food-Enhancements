package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class IllagerFlesh extends Item {

    public IllagerFlesh() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(0.37F)
                        .effect(()-> new EffectInstance(Effects.HUNGER,300,0),0.7F)
                        .build())

        );
    }
}