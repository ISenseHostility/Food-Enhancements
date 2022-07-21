package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class MilkAndHoneyBread extends Item {

    public MilkAndHoneyBread() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(7)
                        .saturationMod(1.21F)
                        .build())

        );
    }
}

