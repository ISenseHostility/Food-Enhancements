package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class GlisteringFruitBowl extends Item {

    public GlisteringFruitBowl() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .maxStackSize(16)
                .containerItem(Items.BOWL)
                .rarity(Rarity.RARE)
                .food(new Food.Builder()
                        .hunger(7)
                        .saturation(1.0F)
                        .effect(()->new EffectInstance(Effects.ABSORPTION, 2400, 0),1)
                        .effect(()->new EffectInstance(Effects.REGENERATION, 400, 1), 1)
                        .effect(()->new EffectInstance(Effects.RESISTANCE, 400, 1), 1)
                        .build())


        );
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        PlayerEntity playerentity = entityLiving instanceof PlayerEntity ? (PlayerEntity) entityLiving : null;

        if (playerentity == null || !playerentity.abilities.isCreativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.BOWL);
            }

            if (playerentity != null) {
                playerentity.inventory.addItemStackToInventory(new ItemStack(Items.BOWL));
            }
        }
        return this.isFood() ? entityLiving.onFoodEaten(worldIn, stack) : stack;
    }
}
