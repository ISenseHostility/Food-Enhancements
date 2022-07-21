package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class HoneyRoastedChicken extends Item {

    public HoneyRoastedChicken() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(10)
                        .saturationMod(1.3F)
                        .build())

        );
    }
}

