package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class StickFood extends Item {

    public StickFood(Properties properties) {
        super(properties.tab(FoodEnhancements.TAB).stacksTo(16).craftRemainder(Items.STICK));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        Player playerentity = entity instanceof Player ? (Player) entity : null;

        if (playerentity == null || !playerentity.isCreative()) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.STICK);
            }

            if (playerentity != null) {
                playerentity.getInventory().add(new ItemStack(Items.STICK));
            }
        }
        return this.isEdible() ? entity.eat(level, stack) : stack;
    }
}
