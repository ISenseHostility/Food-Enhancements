package com.isensehostility.food_enhancements;

import com.isensehostility.food_enhancements.init.ItemRegistry;
import com.isensehostility.food_enhancements.init.RecipeRegistry;
import com.isensehostility.food_enhancements.init.SerializerRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;


@Mod("food_enhancements")
public class FoodEnhancements
{
    public static final String MODID = "food_enhancements";

    public FoodEnhancements() {
        ItemRegistry.initialize();
        SerializerRegistry.initialize();
        RecipeRegistry.initialize();
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID + "_tab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.SQUID_TENTACLE.get());
        }
    };

}
