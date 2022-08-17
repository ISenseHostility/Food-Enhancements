package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class BurntMarshmallowOnAStick extends Item {

    public BurntMarshmallowOnAStick() {
        super(new Properties()
                .tab(FoodEnhancements.TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(1)
                        .saturationMod(0.33F)
                        .effect(()->new MobEffectInstance(MobEffects.BLINDNESS, 100,0),1)
                        .build())

        );
    }
}
