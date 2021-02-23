package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class BoiledEgg extends Item {

    public BoiledEgg() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .maxStackSize(16)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(1.33F)
                        .build())

        );
    }
}
