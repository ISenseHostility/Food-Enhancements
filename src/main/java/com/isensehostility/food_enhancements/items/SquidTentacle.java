package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SquidTentacle extends Item {

    public SquidTentacle() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(0.83F)
                        .effect(()-> new EffectInstance(Effects.BLINDNESS,100,1),1)
                        .build())

        );
    }
}
