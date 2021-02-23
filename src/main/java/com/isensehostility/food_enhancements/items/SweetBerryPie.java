package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class SweetBerryPie extends Item {

    public SweetBerryPie() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(7)
                        .saturation(1.06F)
                        .build())

        );
    }
}

