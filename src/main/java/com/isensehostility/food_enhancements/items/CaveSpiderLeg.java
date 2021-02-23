package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CaveSpiderLeg extends Item {

    public CaveSpiderLeg() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(2)
                        .meat()
                        .saturation(0.25F)
                        .effect(()->new EffectInstance(Effects.POISON, 200,1),1)
                        .effect(()->new EffectInstance(Effects.NAUSEA, 400,0),1)
                        .build())

        );
    }
}