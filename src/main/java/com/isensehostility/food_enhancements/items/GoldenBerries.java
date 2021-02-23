package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GoldenBerries extends Item {

    public GoldenBerries() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .rarity(Rarity.RARE)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(1.0F)
                        .effect(()->new EffectInstance(Effects.HASTE,200,0),1)
                        .build())

        );
    }
}