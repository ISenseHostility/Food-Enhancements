package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class MilkAndHoneyBread extends Item {

    public MilkAndHoneyBread() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .food(new Food.Builder()
                        .hunger(7)
                        .saturation(1.21F)
                        .build())

        );
    }
}

