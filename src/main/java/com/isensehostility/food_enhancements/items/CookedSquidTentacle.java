package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedSquidTentacle extends Item {

    public CookedSquidTentacle() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(0.66F)
                        .build())

        );
    }
}