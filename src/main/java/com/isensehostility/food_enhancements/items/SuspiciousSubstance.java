package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class SuspiciousSubstance extends Item {

    public SuspiciousSubstance() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .maxStackSize(16)
                .containerItem(Items.GLASS_BOTTLE)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(0.5F)
                        .setAlwaysEdible()
                        .effect(()->new EffectInstance(Effects.ABSORPTION, 600, 0), 0.4F)
                        .effect(()->new EffectInstance(Effects.WEAKNESS, 400, 0), 0.3F)
                        .build())

        );
    }

    public UseAction getUseAction(ItemStack par1ItemStack) {
        return UseAction.DRINK;
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        PlayerEntity playerentity = entityLiving instanceof PlayerEntity ? (PlayerEntity) entityLiving : null;

        if (playerentity == null || !playerentity.abilities.isCreativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.GLASS_BOTTLE);
            }

            if (playerentity != null) {
                playerentity.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
            }
        }
        return this.isFood() ? entityLiving.onFoodEaten(worldIn, stack) : stack;
    }
}
