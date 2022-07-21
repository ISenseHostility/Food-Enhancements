package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class GoldenBerryPie extends Item {

    public GoldenBerryPie() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(7)
                        .effect(()-> new MobEffectInstance(MobEffects.ABSORPTION,600,1),1)
                        .saturationMod(1.06F)
                        .build())

        );
    }
}
