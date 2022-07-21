package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class GoldenBerries extends Item {

    public GoldenBerries() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .rarity(Rarity.RARE)
                .food(new FoodProperties.Builder()
                        .nutrition(2)
                        .saturationMod(1.0F)
                        .effect(()->new MobEffectInstance(MobEffects.DIG_SPEED,200,0),1)
                        .build())

        );
    }
}