package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class HoneyToast extends Item {

    public HoneyToast() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(8)
                        .saturationMod(1.0F)
                        .build())

        );
    }
}

