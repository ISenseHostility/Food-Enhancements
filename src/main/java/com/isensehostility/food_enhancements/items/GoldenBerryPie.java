package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GoldenBerryPie extends Item {

    public GoldenBerryPie() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(7)
                        .effect(()-> new EffectInstance(Effects.ABSORPTION,600,1),1)
                        .saturation(1.06F)
                        .build())

        );
    }
}
