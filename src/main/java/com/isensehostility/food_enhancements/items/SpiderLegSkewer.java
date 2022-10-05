package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SpiderLegSkewer extends Item {

    public SpiderLegSkewer() {
        super(new Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(8)
                        .meat()
                        .saturationMod(0.6F)
                        .build())

        );
    }
}