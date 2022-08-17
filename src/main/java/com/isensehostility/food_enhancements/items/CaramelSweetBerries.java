package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CaramelSweetBerries extends Item {

    public CaramelSweetBerries() {
        super(new Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(4)
                        .saturationMod(0.66F)
                        .build())

        );
    }
}
