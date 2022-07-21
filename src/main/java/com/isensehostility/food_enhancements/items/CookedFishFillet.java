package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CookedFishFillet extends Item {

    public CookedFishFillet() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(6)
                        .saturationMod(0.66F)
                        .build())

        );
    }
}
