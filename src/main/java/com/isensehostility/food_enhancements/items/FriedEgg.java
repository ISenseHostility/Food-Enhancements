package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FriedEgg extends Item {

    public FriedEgg() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.25F)
                        .build())

        );
    }
}
