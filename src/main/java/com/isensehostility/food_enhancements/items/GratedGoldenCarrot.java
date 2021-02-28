package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GratedGoldenCarrot extends Item {

    public GratedGoldenCarrot() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(3)
                        .effect(()-> new EffectInstance(Effects.NIGHT_VISION,400,0),1)
                        .saturation(0.5F)
                        .build()
                )
        );
    }
}

