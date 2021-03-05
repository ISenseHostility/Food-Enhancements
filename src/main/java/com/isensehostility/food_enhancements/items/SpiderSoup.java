package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class SpiderSoup extends Item {

    public SpiderSoup() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .maxStackSize(16)
                .containerItem(Items.BOWL)
                .food(new Food.Builder()
                        .hunger(11)
                        .saturation(1.0F)
                        .effect(()-> new EffectInstance(Effects.HUNGER,300,0),1)
                        .effect(()-> new EffectInstance(Effects.WEAKNESS,200,0),0.2F)
                        .build())

        );
    }

    @Override
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