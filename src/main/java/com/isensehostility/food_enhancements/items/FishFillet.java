package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class FishFillet extends Item {

    public FishFillet() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(2)
                        .saturationMod(0.5F)
                        .build())

        );
    }
}
