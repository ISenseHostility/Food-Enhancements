package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class MarshmallowOnAStick extends Item {

    public MarshmallowOnAStick() {
        super(new Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(3)
                        .saturationMod(1.33F)
                        .build())

        );
    }
}
