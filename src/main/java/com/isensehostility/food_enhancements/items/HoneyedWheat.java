package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class HoneyedWheat extends Item {

    public HoneyedWheat() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(1.0F)
                        .build())

        );
    }
}

