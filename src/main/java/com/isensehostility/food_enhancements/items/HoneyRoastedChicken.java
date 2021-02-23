package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class HoneyRoastedChicken extends Item {

    public HoneyRoastedChicken() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(10)
                        .saturation(1.3F)
                        .build())

        );
    }
}

