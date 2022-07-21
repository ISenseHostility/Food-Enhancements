package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class BatSoup extends Item {

    public BatSoup() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .stacksTo(16)
                .craftRemainder(Items.BOWL)
                .food(new FoodProperties.Builder()
                        .nutrition(8)
                        .effect(()->new MobEffectInstance(MobEffects.CONFUSION,200,0),0.3F)
                        .effect(()->new MobEffectInstance(MobEffects.POISON,200,0),0.1F)
                        .saturationMod(1.0F)
                        .build())

        );
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        Player playerentity = entityLiving instanceof Player ? (Player) entityLiving : null;

        if (playerentity == null || !playerentity.isCreative()) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.BOWL);
            }

            if (playerentity != null) {
                playerentity.getInventory().add(new ItemStack(Items.BOWL));
            }
        }
        return this.isEdible() ? entityLiving.eat(worldIn, stack) : stack;
    }
}