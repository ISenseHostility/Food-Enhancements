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
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class GlisteringFruitBowl extends Item {

    public GlisteringFruitBowl() {
        super(new Item.Properties()
                .tab(FoodEnhancements.TAB)
                .stacksTo(16)
                .craftRemainder(Items.BOWL)
                .rarity(Rarity.RARE)
                .food(new FoodProperties.Builder()
                        .nutrition(7)
                        .saturationMod(1.0F)
                        .effect(()->new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0),1)
                        .effect(()->new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1)
                        .effect(()->new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 1), 1)
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
