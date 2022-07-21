package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CookedSpiderLeg extends Item {

    public CookedSpiderLeg() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(5)
                        .meat()
                        .saturationMod(0.6F)
                        .build())

        );
    }
}