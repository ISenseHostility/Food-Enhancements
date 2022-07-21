package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CaveSpiderLeg extends Item {

    public CaveSpiderLeg() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(2)
                        .meat()
                        .saturationMod(0.25F)
                        .effect(()->new MobEffectInstance(MobEffects.POISON, 200,1),1)
                        .effect(()->new MobEffectInstance(MobEffects.CONFUSION, 400,0),1)
                        .build())

        );
    }
}