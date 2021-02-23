package com.isensehostility.food_enhancements.items;

import com.isensehostility.food_enhancements.FoodEnhancements;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class BowlOfFishBones extends Item {

    public BowlOfFishBones() {
        super(new Item.Properties()
                .group(FoodEnhancements.TAB)
                .maxStackSize(16)
        );
    }

}