package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SeasonedPorkSkewer extends Item {

    public SeasonedPorkSkewer() {
        super(new Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(11)
                        .saturationMod(0.9F)
                        .meat()
                        .build())

        );
    }
}
