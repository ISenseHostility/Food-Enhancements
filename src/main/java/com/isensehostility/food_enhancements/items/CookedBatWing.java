package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CookedBatWing extends Item {

    public CookedBatWing() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(5)
                        .effect(()->new EffectInstance(Effects.NAUSEA,200,0),0.3F)
                        .saturation(0.6F)
                        .build())
        );
    }
}