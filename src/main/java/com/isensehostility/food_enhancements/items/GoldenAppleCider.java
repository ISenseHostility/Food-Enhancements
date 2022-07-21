package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class GoldenAppleCider extends Item {

    public GoldenAppleCider() {
        super(new Item.Properties()
                .food(new FoodProperties.Builder()
                        .nutrition(3)
                        .saturationMod(0.33F)
                        .alwaysEat()
                        .effect(()->new MobEffectInstance(MobEffects.ABSORPTION, 1200, 0), 1)
                        .effect(()->new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1)
                        .build())
                .tab(FoodEnhancements.TAB)
                .stacksTo(16)
                .craftRemainder(Items.GLASS_BOTTLE)
                .rarity(Rarity.RARE)


        );
    }

    @Override
    public UseAnim getUseAnimation(ItemStack p_41452_) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        Player playerentity = entityLiving instanceof Player ? (Player) entityLiving : null;

        if (playerentity == null || !playerentity.isCreative()) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.GLASS_BOTTLE);
            }

            if (playerentity != null) {
                playerentity.getInventory().add(new ItemStack(Items.GLASS_BOTTLE));
            }
        }
        return this.isEdible() ? entityLiving.eat(worldIn, stack) : stack;
    }
}