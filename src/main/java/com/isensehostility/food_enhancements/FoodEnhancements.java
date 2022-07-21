package com.isensehostility.food_enhancements;

import com.isensehostility.food_enhancements.init.ItemRegistry;
import com.isensehostility.food_enhancements.init.CodecRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;


@Mod("food_enhancements")
public class FoodEnhancements
{
    public static final String MOD_ID = "food_enhancements";

    public FoodEnhancements() {
        ItemRegistry.init();
        CodecRegistry.init();
    }

    public static final CreativeModeTab TAB = new CreativeModeTab("foodEnhancementsTab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.BOILED_EGG.get());
        }
    };

}
