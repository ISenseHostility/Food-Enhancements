package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class CakeSlice extends Item {

    public CakeSlice() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .maxStackSize(16)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(1.5F)
                        .build())

        );
    }
}
