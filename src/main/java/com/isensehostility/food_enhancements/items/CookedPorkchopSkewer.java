package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CookedPorkchopSkewer extends Item {

    public CookedPorkchopSkewer() {
        super(new Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(9)
                        .saturationMod(0.9F)
                        .meat()
                        .build())

        );
    }
}
