package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedCaveSpiderLeg extends Item {

    public CookedCaveSpiderLeg() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(5)
                        .meat()
                        .saturation(0.6F)
                        .build())

        );
    }
}