package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class BoiledEgg extends Item {

    public BoiledEgg() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .stacksTo(16)
                .food(new FoodProperties.Builder()
                        .nutrition(3)
                        .saturationMod(1.33F)
                        .build())

        );
    }
}
