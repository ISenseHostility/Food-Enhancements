package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class GlisteringMelonJuice extends Item {

    public GlisteringMelonJuice() {
        super(new Item.Properties()
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(0.25F)
                        .effect(()-> new EffectInstance(Effects.ABSORPTION,400,0),0.7F)
                        .setAlwaysEdible()
                        .build())
                .group(FoodEnhancements.TAB)
                .maxStackSize(16)
                .containerItem(Items.GLASS_BOTTLE)
                .rarity(Rarity.UNCOMMON)


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