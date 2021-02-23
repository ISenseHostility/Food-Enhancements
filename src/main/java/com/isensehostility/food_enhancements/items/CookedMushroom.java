package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CookedMushroom extends Item {

    public CookedMushroom() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(0.5F)
                        .build())

        );
    }
}
