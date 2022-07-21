package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class GratedGoldenCarrot extends Item {

    public GratedGoldenCarrot() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(3)
                        .effect(()-> new MobEffectInstance(MobEffects.NIGHT_VISION,400,0),1)
                        .saturationMod(0.5F)
                        .build()
                )
        );
    }
}

